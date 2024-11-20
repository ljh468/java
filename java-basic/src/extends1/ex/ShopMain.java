package extends1.ex;

/**
 * 문제: 상속 관계 상품<p>
 * 쇼핑몰의 판매 상품을 만들어보자.<p>
 * `Book` , `Album` , `Movie` 이렇게 3가지 상품을 클래스로 만들어야 한다.<p>
 * 코드 중복이 없게 상속 관계를 사용하자. 부모 클래스는 `Item` 이라는 이름을 사용하면 된다.<p>
 * <br>
 * 공통 속성: `name` , `price`<p>
 * `Book` : 저자( `author` ), isbn( `isbn` )<p>
 * `Album` : 아티스트( `artist` )<p>
 * `Movie` : 감독( `director` ), 배우( `actor` )<p>
 * <br>
 * ex:<p>
 * 이름: JAVA, 가격: 10000<p>
 * - 저자: han, isbn: 12345<p>
 * 이름: 앨범1, 가격: 15000<p>
 * - 아티스트: seo<p>
 * 이름: 영화1, 가격: 18000<p>
 * - 감독: 감독1, 배우: 배우1<p>
 * 상품 가격의 합: 43000<p>
 */
public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000,"감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
