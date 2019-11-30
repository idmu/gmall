package com.mine.imu.pms.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mine.imu.pms.entity.Brand;
import com.mine.imu.pms.mapper.BrandMapper;
import com.mine.imu.pms.service.BrandService;
import com.mine.imu.vo.product.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;
    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> name = null;
        if (!StringUtils.isEmpty(keyword)) {
            name = new QueryWrapper<Brand>().like("name", keyword);
        }
        IPage<Brand> brandIPage = brandMapper.selectPage(new Page<Brand>(pageNum.longValue(),pageSize.longValue()),name);
        PageInfoVo pageInfoVo = new PageInfoVo(brandIPage.getTotal(),brandIPage.getPages(),pageSize.longValue(),
                brandIPage.getRecords(),brandIPage.getCurrent());

        return pageInfoVo;
    }
}
