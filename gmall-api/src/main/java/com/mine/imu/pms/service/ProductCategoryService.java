package com.mine.imu.pms.service;

import com.mine.imu.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mine.imu.vo.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    List<PmsProductCategoryWithChildrenItem> getCategoryChildrenList(int i);
}
