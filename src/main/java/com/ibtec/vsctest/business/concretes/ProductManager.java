package com.ibtec.vsctest.business.concretes;

import com.ibtec.vsctest.business.abstracts.ProductService;
import com.ibtec.vsctest.core.utilities.results.DataResult;
import com.ibtec.vsctest.core.utilities.results.Result;
import com.ibtec.vsctest.core.utilities.results.SuccessDataResult;
import com.ibtec.vsctest.dataAccess.abstracts.ProductDao;
import com.ibtec.vsctest.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessDataResult("Ürün Eklendi");
    }
}
