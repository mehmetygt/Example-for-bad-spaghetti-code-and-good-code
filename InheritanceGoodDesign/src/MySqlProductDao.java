
public class MySqlProductDao extends BaseProductDao{
    
    public MySqlProductDao(String conectionString) {
        super(conectionString);
    }

    @Override
    public void add(Product product) {
           System.out.println("MySql database "+product.getName()+" eklendi.");
    }
    
}
