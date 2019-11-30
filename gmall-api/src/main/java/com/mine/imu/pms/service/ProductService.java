package com.mine.imu.pms.service;


import com.mine.imu.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mine.imu.vo.PmsProductQueryParam;
import com.mine.imu.vo.product.PageInfoVo;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
public interface ProductService extends IService<Product> {

    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
