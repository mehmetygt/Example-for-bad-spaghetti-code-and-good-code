
package ınheritancebaddesign;

/**
 *
 * @author Mehmet
 */
public class OracleProductDao {
    private String connectionString;

    public OracleProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
public void add(Product Product){
    System.out.println("Oracle Database "+Product.getName()+" eklendi");}
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
