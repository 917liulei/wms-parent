package com.atguigu.wms.vo.base;

import lombok.Data;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;

@Data
public class StoreshelfInfoQueryVo {
	
	@ApiModelProperty(value = "仓库id")
	private Long warehouseId;

	@ApiModelProperty(value = "库区id")
	private Long storeareaId;

	@ApiModelProperty(value = "名称")
	private String name;

	@ApiModelProperty(value = "货架类型（数据字典：发货区 、收货区 、储存区、暂存区、不良区）")
	private Long houseTypeId;


}

