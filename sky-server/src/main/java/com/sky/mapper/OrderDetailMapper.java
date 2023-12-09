package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * #author 龚圆康
 * #class 软件2144
 * #student_number 21040147
 */

@Mapper
public interface OrderDetailMapper {
    //批量插入订单明细文件
    void insertBatch(List<OrderDetail> orderDetailList);
}
