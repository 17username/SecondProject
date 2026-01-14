//package pl.edu.vistula.secondproject.product.repository;
//
//import org.springframework.stereotype.Repository;
//import pl.edu.vistula.secondproject.product.domain.Product;
//
//import java.util.*;
//
//@Repository
//public class OldProductRepository {
//
//    private final Map<Long, Product> map = new HashMap<>();
//    private Long count = 0L;
//
//    public Product save(Product product) {
//        if (product.getId() == null) {
//            count++;
//            product.setId(count);
//        }
//        map.put(product.getId(), product);
//        return product;
//    }
//
//    public Optional<Product> findById(Long id) {
//        return Optional.ofNullable(map.get(id));
//    }
//
//    public List<Product> findAll() {
//        return new ArrayList<>(map.values());
//    }
//
//    public void deleteById(Long id) {
//        map.remove(id);
//    }
//}