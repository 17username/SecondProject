package pl.edu.vistula.secondproject.product.api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.secondproject.product.api.request.ProductRequest;
import pl.edu.vistula.secondproject.product.api.request.UpdateProductRequest;
import pl.edu.vistula.secondproject.product.api.response.ProductResponse;
import pl.edu.vistula.secondproject.product.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @Operation(summary = "Create product")
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find product by id")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        ProductResponse productResponse = productService.find(id);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }

    @PutMapping
    @Operation(summary = "Update item")
    public ResponseEntity<ProductResponse> update(@RequestBody UpdateProductRequest updateProductRequest) {
        ProductResponse productResponse = productService.update(updateProductRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }

    @GetMapping
    @Operation(summary = "Get all products")
    public ResponseEntity<List<ProductResponse>> findAll() {
        List<ProductResponse> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete item")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}