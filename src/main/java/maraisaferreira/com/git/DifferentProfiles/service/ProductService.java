package maraisaferreira.com.git.DifferentProfiles.service;

import lombok.RequiredArgsConstructor;
import maraisaferreira.com.git.DifferentProfiles.dto.response.ProductResponseDto;
import maraisaferreira.com.git.DifferentProfiles.entities.Product;
import maraisaferreira.com.git.DifferentProfiles.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponseDto findById(Long id) {
        Product p = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found."));

        return ProductResponseDto.builder()
                .id(p.getId())
                .name(p.getName())
                .price(p.getPrice())
                .quantity(p.getQuantity())
                .category(p.getCategory())
                .build();
    }
}
