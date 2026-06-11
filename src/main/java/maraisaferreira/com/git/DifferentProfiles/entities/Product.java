package maraisaferreira.com.git.DifferentProfiles.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;
import maraisaferreira.com.git.DifferentProfiles.entities.enums.ProductCategories;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String name;
    @Column(nullable = false, precision = 2)
    @Min(value = 0)
    private Double price;
    @Column(nullable = false)
    @Min(value = 0)
    private Integer quantity;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductCategories category;
}
