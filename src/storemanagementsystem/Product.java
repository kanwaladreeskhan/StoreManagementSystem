package storemanagementsystem;
public class Product {
    public String productName;
    public double productPrice;
    private String productID;
    Product(String productName,double productPrice,String productID){
        this.productID=productID;
      this.productName=productName;
      this.productPrice=productPrice;
    }
    public void getProductInfo(){
        System.out.println("Product Name:" + productName + "\nProduct Price:" + productPrice+"\nProduct Id:" + productID);
    }
}
