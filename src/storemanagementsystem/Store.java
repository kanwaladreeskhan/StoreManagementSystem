package storemanagementsystem;
import java.util.List;
public class Store {
   private String storeName;
   private String storeLocation;
   private String storeID;
   List<Product>productList;
   Store(String storeName,String storeLocation,String storeID,  List<Product>productList){
       this.storeName=storeName;
       this.storeLocation=storeLocation;
       this.storeID=storeID;
       this.productList = productList;
   }
   public void addProduct(Product product){
       productList.add(product);
   }
   public void removeProduct(Product product){
        productList.remove(product);
   }
   public void listProducts() {
    System.out.println("Product List:");
    for (Product p : productList) {
        p.getProductInfo(); 
    }
   }
    public String getStoreInfo(){
        return "Store Name:" + storeName + "\nStore Location:" + storeLocation+"\nstore Id:" + storeID;
    }
}
