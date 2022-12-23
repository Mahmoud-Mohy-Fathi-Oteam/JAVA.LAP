package MyOnlineShop;

public class ChildrenBook extends Book{
    @Override
    public int getPrice () {
        return (price- 100);
    }
}