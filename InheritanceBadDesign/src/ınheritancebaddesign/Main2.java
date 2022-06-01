
package ınheritancebaddesign;

/**
 *
 * @author Mehmet
 */
public class Main2 {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        productManager.add(new Product(1, "su", 3),2);
    }
    
}
