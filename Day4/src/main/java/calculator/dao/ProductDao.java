package calculator.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    String Msg="Product Created";
    @Autowired
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
