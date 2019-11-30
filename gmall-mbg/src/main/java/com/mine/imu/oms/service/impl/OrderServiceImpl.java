package com.mine.imu.oms.service.impl;

import com.mine.imu.oms.entity.Order;
import com.mine.imu.oms.mapper.OrderMapper;
import com.mine.imu.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
