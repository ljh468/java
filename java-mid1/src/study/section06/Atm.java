package study.section06;

import static java.util.Objects.isNull;

public class Atm {

  public TransactionResult processTransaction(Member member, Member targetMember, String operation, double amount) {
    TransactionType transactionType = TransactionType.findByTransactionType(operation);
    if (isNull(transactionType)) {
      throw new IllegalArgumentException("지원되지 않는 거래 유형입니다: " + operation);
    }

    return switch (transactionType) {
      case DEPOSIT -> processDeposit(member, amount);
      case WITHDRAW -> processWithdraw(member, amount);
      case TRANSFER -> processTransfer(member, targetMember, amount);
    };
  }

  private TransactionResult processDeposit(Member member, double amount) {
    BankAccount updatedAccount = member.getBankAccount().deposit(amount);
    member.updateBankAccount(updatedAccount);
    return new TransactionResult(TransactionType.DEPOSIT, amount, member, null);
  }

  private TransactionResult processWithdraw(Member member, double amount) {
    BankAccount updatedAccount = member.getBankAccount().withdraw(amount);
    member.updateBankAccount(updatedAccount);
    return new TransactionResult(TransactionType.WITHDRAW, amount, member, null);
  }

  private TransactionResult processTransfer(Member member, Member targetMember, double amount) {
    if (targetMember == null || member.equals(targetMember)) {
      throw new IllegalArgumentException("송금 대상자가 유효하지 않습니다.");
    }

    BankAccount account = member.getBankAccount().withdraw(amount);
    member.updateBankAccount(account);

    BankAccount targetAccount = targetMember.getBankAccount().deposit(amount);
    targetMember.updateBankAccount(targetAccount);

    return new TransactionResult(TransactionType.TRANSFER, amount, member, targetMember);
  }

}