package storemanagementsystem;
 import java.util.ArrayList;
import java.util.List;
public class StoreManagementSystem {
     public static void main(String[] args) {
        List<Store>storeList=new ArrayList<>();
        Company company = new Company("SuperMart Inc.", "Karachi",storeList);
        Store store1 = new Store("Store A", "Lahore", "S001", new ArrayList<>());
        Store store2 = new Store("Store B", "Islamabad", "S002", new ArrayList<>());
        company.addStore(store1);
        company.addStore(store2);
        Product p1 = new Product("Laptop", 1200.0, "P001");
        Product p2 = new Product("Mouse", 25.0, "P002");
        store1.addProduct(p1);
        store2.addProduct(p2);
        company.listStores();
    }
    }
    
