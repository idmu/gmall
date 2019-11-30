package com.mine.imu.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mine.imu.pms.entity.ProductCategory;
import com.mine.imu.pms.mapper.ProductCategoryMapper;
import com.mine.imu.pms.service.ProductCategoryService;
import com.mine.imu.vo.PmsProductCategoryWithChildrenItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper categoryMapper;
    @Override
    public List<PmsProductCategoryWithChildrenItem> getCategoryChildrenList(int i) {
        return categoryMapper.getCategoryChildrenList(i);
    }
}
