

/**
 *
 * @author Mehmet
 */
public class BaseProductDao {
    private String conectionString;

    public BaseProductDao(String conectionString) {
        this.conectionString = conectionString;
    }
    public void add(Product product){
        System.out.println("default database "+product.getName()+" eklendi");}

    /**
     * @return the conectionString
     */
    public String getConectionString() {
        return conectionString;
    }

    /**
     * @param conectionString the conectionString to set
     */
    public void setConectionString(String conectionString) {
        this.conectionString = conectionString;
    }
    
}
