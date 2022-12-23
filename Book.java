package MyOnlineShop;

public class Book extends Product{
    String kind;

    @Override
    public int getPrice () {
        return (price- 120);
    }
}
