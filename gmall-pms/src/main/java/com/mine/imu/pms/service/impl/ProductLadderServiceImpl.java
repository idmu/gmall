package com.mine.imu.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mine.imu.pms.entity.ProductLadder;
import com.mine.imu.pms.mapper.ProductLadderMapper;
import com.mine.imu.pms.service.ProductLadderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
