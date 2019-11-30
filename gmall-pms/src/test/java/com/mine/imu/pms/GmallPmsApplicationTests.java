package com.mine.imu.pms;

import com.mine.imu.pms.entity.Product;
import com.mine.imu.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;
    @Test
    void contextLoads() {
        Product byId = productService.getById(1);
        System.out.println(byId.getName());
    }

}
