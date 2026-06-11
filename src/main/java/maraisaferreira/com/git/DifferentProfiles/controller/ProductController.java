package maraisaferreira.com.git.DifferentProfiles.controller;

import lombok.RequiredArgsConstructor;
import maraisaferreira.com.git.DifferentProfiles.dto.response.ProductResponseDto;
import maraisaferreira.com.git.DifferentProfiles.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(productService.findById(id));
    }
}
