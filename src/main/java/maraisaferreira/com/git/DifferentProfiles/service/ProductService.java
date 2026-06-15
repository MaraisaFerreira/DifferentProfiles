package maraisaferreira.com.git.DifferentProfiles.service;

import lombok.RequiredArgsConstructor;
import maraisaferreira.com.git.DifferentProfiles.dto.request.ProductRequestDto;
import maraisaferreira.com.git.DifferentProfiles.dto.response.ProductResponseDto;
import maraisaferreira.com.git.DifferentProfiles.entities.Product;
import maraisaferreira.com.git.DifferentProfiles.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductResponseDto> findAll(){
        return productRepository.findAll().stream().map(product ->
                ProductResponseDto.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .price(product.getPrice())
                        .quantity(product.getQuantity())
                        .category(product.getCategory())
                        .build()
        ).toList();
    }

    public ProductResponseDto findById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found."));

        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .category(product.getCategory())
                .build();
    }

    public ProductResponseDto saveProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(
                new Product(
                        null,
                        requestDto.name(),
                        requestDto.price(),
                        requestDto.quantity(),
                        requestDto.category())
        );

        return ProductResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .category(product.getCategory())
                .build();
    }
}
