package com.mine.imu.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mine.imu.pms.entity.Album;
import com.mine.imu.pms.mapper.AlbumMapper;
import com.mine.imu.pms.service.AlbumService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
