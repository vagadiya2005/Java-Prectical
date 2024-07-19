/**
 * pra21
 */
import java.util.*;
public class Microsoft {

    // data members 
    private float productNo;
    private String productName;
    private String activationKey;
    private float priceofProduct;


    // methods
    public Microsoft(float productNo, String productName, String activationKey, float priceofProduct) {
        this.productNo = productNo;
        this.productName = productName;
        this.activationKey = activationKey;
        this.priceofProduct = priceofProduct;
    }

    
    public String getProductName() {
        return productName;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public float getProductNo() {
        return productNo;
    }

    public float getPriceofProduct() {
        return priceofProduct;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public void display() {
        System.out.println("Product No: " + productNo);
        System.out.println("Product Name: " + productName);
        System.out.println("Activation Key: " + activationKey);
        System.out.println("Price of Product: " + priceofProduct);
    }



    // main  function.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        Microsoft[] products = new Microsoft[5];

        

     
        products[0] = new Microsoft(205, "Windows", "ABCD-1234-EFGH-5678", 25000);
        products[1] = new Microsoft(356, "Office 365", "IJKL-9012-MNOP-3456", 30000);
        products[2] = new Microsoft(145, "Visual Studio", "QRST-7890-UVWX-1234", 4000);
        products[3] = new Microsoft(856, "Windows 11", "YZAB-5678-CDEF-9012", 5230);
        products[4] = new Microsoft(125, "Azure Pipeline", "GHIJ-3456-KLMN-7890", 45863);


        System.out.println("Enter product name to search: ");
        String searchName = scanner.nextLine();

        System.out.println("Enter product number to search: ");
        float searchNumber = scanner.nextFloat();

        // System.out.println("Search Product via Product name of product number : ");
        // System.out.println("--------------------------------------------------");

        // System.out.println("Enter 1 for product name.");
        // System.out.println("Enter 2 for product number.");
        // System.out.println("");
      
        // boolean isNameSearch=true;
        
        boolean found = false;

        for (Microsoft product : products) {

            // either search product via product name or product number.
            if (product.getProductName().equalsIgnoreCase(searchName) || product.getProductNo() == searchNumber) {
                product.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching product found.");
        }


    }

    
}