package MyOnlineShop;

public class Main {
    public static void main ( String[] args ) {
        Product b1=new Book ();
        b1.setPrice ( 200 );
        b1.display ();
        Product b2=new ChildrenBook ();
        b2.setPrice ( 500 );
        b2.display ();
    }
}

