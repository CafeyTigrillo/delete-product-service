package com.mipagina.delete_product_service.controller;

import com.mipagina.delete_product_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product", description = "Product management APIs")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Delete a product by ID",
            description = "Remove a specific product from the system using its unique identifier"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Product successfully deleted"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Product not found"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal server error"
            )
    })
    @DeleteMapping("/products/{id_product}")
    public void deleteProduct(
            @Parameter(description = "ID of the product to delete")
            @PathVariable Long id_product
    ) {
        productService.deleteProduct(id_product);
    }
}