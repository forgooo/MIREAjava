package pract4.pract4_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class task3 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Product.values()));
    }
}
class InternetShop{
    ArrayList<User> users = new ArrayList<>(16);
    void addUser(User user){
        users.add(user);
    }
    boolean auth(String login, String password){
        for (User user:users) {
            if (user.isLoggedIn(login, password))return true;
        }
        return false;
    }
}
enum Product {
    COMPUTER(59999), PHONE(37999), WATCH(24990), TSHIRT(2999), SOCKS(499), UMBRELLA(1199);
    int price;
    Product(int price){
        this.price = price;
    }
}
class User{
    public int id;
    private String login;
    private String password;
    private ArrayList<Product> cart = new ArrayList<>(16);
    User(String login, String password){
        this.id = (int)(100000+(Math.random()*10000000));
        this.login = login;
        this.password = password;
    }
    public boolean isLoggedIn(String login, String password){
        return Objects.equals(this.login, login) && Objects.equals(this.password, password);
    }
    public void addProductToCart(Product product){
        cart.add(product);
    }
    public int billing(){
        int bill = 0;
        for (Product product:cart) {
            bill += product.price;
        }
        return bill;
    }

    @Override
    public boolean equals(Object obj){
        User second = (User)obj;
        return this.id == second.id;
    }

}