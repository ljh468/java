package thread.sync;

// 출금을 담당하는 `Runnable` 구현체
public class WithdrawTask implements Runnable {

    private BankAccount account;

    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
