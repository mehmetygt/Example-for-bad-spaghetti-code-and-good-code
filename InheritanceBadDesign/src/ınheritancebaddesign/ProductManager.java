
package ınheritancebaddesign;

/**
 *
 * @author Mehmet
 */
public class ProductManager {
    
    // iş katmanı
    public void add(Product product,int databaseType){
        if (databaseType==1) {
            OracleProductDao oracleProductDao=new OracleProductDao("oracle string");
        oracleProductDao.add(product);
            
        }
        else if (databaseType==2) {
            MysqlProductDao mysqlProductDao=new MysqlProductDao("oracle string");
        mysqlProductDao.add(product);
  
        }
       
        System.out.println("Ürün iş katmanı işlemleri");
        System.out.println("ürün adı : "+product.getName());
    }
    
    
}
