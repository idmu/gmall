package com.mine.imu.oms.service.impl;

import com.mine.imu.oms.entity.CartItem;
import com.mine.imu.oms.mapper.CartItemMapper;
import com.mine.imu.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
