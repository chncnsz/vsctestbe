package com.ibtec.vsctest.api.controllers;

import com.ibtec.vsctest.business.abstracts.ProductService;
import com.ibtec.vsctest.core.utilities.results.DataResult;
import com.ibtec.vsctest.core.utilities.results.Result;
import com.ibtec.vsctest.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }
}
