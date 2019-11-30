package com.mine.imu.oms.service.impl;

import com.mine.imu.oms.entity.OrderItem;
import com.mine.imu.oms.mapper.OrderItemMapper;
import com.mine.imu.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
