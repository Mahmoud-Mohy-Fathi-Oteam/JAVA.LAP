package MyOnlineShop;

abstract class Product {
    int price;

    public abstract int getPrice () ;

    public void setPrice ( int price ) {
        this.price = price;
    }
    public void display(){
        System.out.println("book price = "+getPrice ());
    }

}