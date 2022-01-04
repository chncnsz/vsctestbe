package com.ibtec.vsctest.business.abstracts;

import com.ibtec.vsctest.core.utilities.results.DataResult;
import com.ibtec.vsctest.core.utilities.results.Result;
import com.ibtec.vsctest.entities.concretes.Product;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();
    Result add(Product product);
}
