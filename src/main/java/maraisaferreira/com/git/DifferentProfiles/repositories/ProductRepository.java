package maraisaferreira.com.git.DifferentProfiles.repositories;

import maraisaferreira.com.git.DifferentProfiles.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
