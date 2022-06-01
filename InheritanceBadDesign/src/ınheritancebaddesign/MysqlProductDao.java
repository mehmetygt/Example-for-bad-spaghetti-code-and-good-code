
package ınheritancebaddesign;

/**
 *
 * @author Mehmet
 */
public class MysqlProductDao {
      private String connectionString;

    public MysqlProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
public void add(Product Product){
    System.out.println("Mysql Database "+Product.getName()+" eklendi");}
    /**
     * @return the connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * @param connectionString the connectionString to set
     */
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    
    
}
    

