package com.ibtec.vsctest.dataAccess.abstracts;

import com.ibtec.vsctest.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
