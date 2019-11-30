package com.mine.imu.vo.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageInfoVo implements Serializable {
    @ApiModelProperty("总记录数")
    private Long total;
    private Long totalPage;
    private Long pageSize;
    private List<? extends Object> list;
    private Long pageNum;

}
