package ConnectJDBC;

import Module.Product;
import Module.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author phank
 */
public class UserJDBC {
    static Connection conn;

  public  List<Product> getProduct(){
      List<Product> products  = new ArrayList<>();
      String sql = "select * from product";
      try {
            conn = JDBCConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Product product = new Product();
                product.setIDproduct(rs.getString(1));
                product.setNameProduct(rs.getString(2));
                product.setAmount(rs.getInt(3));
                product.setPrice(rs.getFloat(4));
                products.add(product);
            }              
      } catch (SQLException e) {
      }
      return  products;
  }
  public void addUser(User user) {
        String sql = "Insert into users(hoVaTen,soDienThoai,userName,matKhau,gioiTinh)"+
                "VALUES(?,?,?,?,?)";
        try {
            conn = JDBCConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getUserName());
            preparedStatement.setString(4, user.getPassWord());
            preparedStatement.setString(5, user.getGender());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println("da add "+rs+" dong du lieu");
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Loi add"+e.toString());
        }
    }
  public void addProduct(Product product) {
        String sql = "Insert into product (tenSanPham,soLuong,donGia)"+
                "VALUES(?,?,?)";
        try {
            conn = JDBCConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setInt(2, product.getAmount());
            preparedStatement.setDouble(3, product.getPrice());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println("da add "+rs+" dong du lieu");
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Loi add"+e.toString());
        }
    }
  public void deleteProduct(int IDproduct){
      String sql = "Delete From product where maSanPham=?";
        try {
            conn = JDBCConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, IDproduct);
            int ps = preparedStatement.executeUpdate();
            System.out.println("da xoa "+ps+" dong");
        } catch (Exception e) {
        }
  }
  public void updateProduct(int ID){
      String sql = "Delete From product where maSanPham=?";
        try {
            conn = JDBCConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, ID);
            int ps = preparedStatement.executeUpdate();
            System.out.println("da xoa "+ps+" dong");
        } catch (Exception e) {
  }
 }
    public void SignIn(String username, String password ) {
      String sql = "Select * from  users where userName=? and matKhau =?";
        try {
            conn = JDBCConnection.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                System.out.println("dang nhap thanh cong");
            }
            else
                System.out.println("dang nhap that bai");
        } catch (Exception e) {
        }
    }
}
