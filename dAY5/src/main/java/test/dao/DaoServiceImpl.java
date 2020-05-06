package test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

//@Component
public class DaoServiceImpl {
    @CustomQualifier(name = "mmm",mobile = CustomQualifier.Mobile.Etsialt)
    private UserDao userDao;

    private Provider<UserDao> userDaoProvider;
    public UserDao getUserDao() {
        return userDao;
    }



  //  @Resource
    public void setUserDao(
                           UserDao userDao) {
        this.userDao = userDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    //@Autowired
    //@Inject
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    private ProductDao productDao;

    public DaoServiceImpl() {
    }
    //@Autowired
    public DaoServiceImpl(UserDao userDao, ProductDao productDao) {
        this.userDao = userDao;
        this.productDao = productDao;
    }

    public Provider<UserDao> getUserDaoProvider() {
        return userDaoProvider;
    }
   // @Inject
    public void setUserDaoProvider(Provider<UserDao> userDaoProvider) {
        this.userDaoProvider = userDaoProvider;
    }
   public void getUser(UserDao user){
        userDaoProvider.get().addUser(user);
   }
    @Override
    public String toString() {
        return "DaoServiceImpl{" +
                "userDao=" + userDao +
                ", productDao=" + productDao +
                '}';
    }
}
