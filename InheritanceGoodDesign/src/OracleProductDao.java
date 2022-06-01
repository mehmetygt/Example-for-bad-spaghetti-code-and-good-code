
public class OracleProductDao extends BaseProductDao{
    
    public OracleProductDao(String conectionString) {
        super(conectionString);
    }

    @Override
    public void add(Product product) {
         System.out.println("Oracle database "+product.getName()+" eklendi.");
    }
    
}
