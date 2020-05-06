package calculator;

public class ProductDao {
    String Msg="Product Created";
    public ProductDao() {
        System.out.println("Product Dao");
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "Msg='" + Msg + '\'' +
                '}';
    }
}
