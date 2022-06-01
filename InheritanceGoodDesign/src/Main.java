
/**
 *
 * @author Mehmet
 */
public class Main {
    public static void main(String[] args) {
     //ProductManager productManager=new ProductManager(new OracleProductDao("oracle string"));
   
      ProductManager productManager=new ProductManager(new MySqlProductDao("MySqlstring"));
 productManager.add(new Product(2, "çikolata", 5));
    } 
}
