public class stringComma {
    public static void main(String[] args) {
        //Enter a sentence that contains a comma, and the program will remove the comma
        String name = "mahmoud , mohy , otaim" ;
        String new_name ;
        new_name = name.replace(",", " ");
        System.out.println(new_name);
    }
}