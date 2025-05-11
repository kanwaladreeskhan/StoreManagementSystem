package storemanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Company {
    private String companyName;
    private String companyLocation;         
    List<Store>storeList;
    Company(String companyName,String companyLocation, List<Store>storeList){
        this.companyName=companyName;
        this.companyLocation=companyLocation;
          if (storeList == null) {
        this.storeList = new ArrayList<>();
    } else {
        this.storeList = storeList;
    }
    }
    public void addStore(Store store){
        storeList.add(store);
    }
    public void removeStore(Store store){
        storeList.remove(store);
    }
   public void listStores() {
    System.out.println("Store List:");
    for (Store s : storeList) {
        System.out.println("- " + s.getStoreInfo());
        s.listProducts();
    }
}
}
