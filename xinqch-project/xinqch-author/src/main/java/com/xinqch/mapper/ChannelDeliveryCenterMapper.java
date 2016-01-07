package com.xinqch.mapper;

import java.util.List;

import com.xinqch.model.ChannelDeliveryCenterCondition;
import com.xinqch.model.ChannelDeliveryCenterEntity;

/**
 *   发货地址处理接口
 * @author xinqch 
 * @date 2015年12月16日 下午8:42:56
 */
public interface ChannelDeliveryCenterMapper  {
	
	/**
	 *   根据发货地址ID删除发货地址
	 * @param deliveryCenterId
	 * @return int    返回类型 
	 */
    int deleteByPrimaryKey(Long deliveryCenterId);
    /**
     *   新增发货地址
     * @param record
     * @return int    返回类型 
     */
    int insert(ChannelDeliveryCenterEntity record);
    /**
     *   根据发货地址ID获取发货地址
     * @param deliveryCenterId
     * @return ChannelDeliveryCenterEntity    返回类型 
     */
    ChannelDeliveryCenterEntity selectByPrimaryKey(Long deliveryCenterId);
    /**
     *   修改发货地址
     * @param record
     * @return int    返回类型 
     */
    int updateByPrimaryKey(ChannelDeliveryCenterEntity record);
    
    /**
     *   根据条件分页查询发货地址信息
     * @param channelDeliveryCenterCondition
     * @return List<ChannelDeliveryCenterEntity>    返回类型 
     */
    List<ChannelDeliveryCenterEntity> findChannelDeliveryCenterByCondition(ChannelDeliveryCenterCondition channelDeliveryCenterCondition);
    
    
    int getChannelDeliveryCenterSizeByCondition(ChannelDeliveryCenterCondition channelDeliveryCenterCondition);
    
    
    
    List<Long> getList();
}