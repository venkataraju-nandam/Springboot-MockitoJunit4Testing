package com.ex.mockito.MockitoJunitTest;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
    public UserEntity findByUserName(String name);
    public Optional<UserEntity> findById(Long id);
    public List<UserEntity> findAll();

}


//SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
//public List<Product> getAllProducts() {
//    // TODO Auto-generated method stub
//    return null;
//}
//
//
//public Product addNewProduct(Product product) {
//    Product productSaved=new Product();
//    Session session=sessionFactory.openSession();
//    session.beginTransaction();
//    productSaved=(Product)session.save(product);
//    session.getTransaction().commit();
//    session.close();
//    return productSaved;
//}
