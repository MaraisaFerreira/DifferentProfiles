package maraisaferreira.com.git.DifferentProfiles.controller;

import lombok.RequiredArgsConstructor;
import maraisaferreira.com.git.DifferentProfiles.dto.request.ProductRequestDto;
import maraisaferreira.com.git.DifferentProfiles.dto.response.ProductResponseDto;
import maraisaferreira.com.git.DifferentProfiles.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(productService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> savePorduct(@RequestBody ProductRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(requestDto));
    }
}
