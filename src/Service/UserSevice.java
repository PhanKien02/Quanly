/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ConnectJDBC.UserJDBC;
import Module.Product;
import Module.User;
import java.util.List;

/**
 *
 * @author phank
 */
public class UserSevice {
    UserJDBC userJDBC;

    public UserSevice() {
        userJDBC = new UserJDBC();
    }
    public  List<Product> getProduct(){
        return userJDBC.getProduct();
    }
    public void addUser(User user){
        userJDBC.addUser(user);
    }
    public void addproduct(Product product){
        userJDBC.addProduct(product);
    }
    public void deleteProduct(int ID){
        userJDBC.deleteProduct(ID);
    }
    public void signIn(String username , String passwoed ){
        userJDBC.SignIn(username, passwoed);
    }
}
