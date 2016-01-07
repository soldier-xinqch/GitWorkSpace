package com.xinqch.service;

import java.util.List;

import com.xinqch.model.ChannelDeliveryCenterCondition;
import com.xinqch.model.ChannelDeliveryCenterEntity;

/**
 *   发货地址业务接口
 * @author xinqch 
 * @date 2015年12月18日 下午1:13:26
 */
public interface IChannelDeliveryCenterService {

	/**
	 *   通过条件查询发货地址信息
	 * @param tenantId
	 * @param condition
	 * @return List<ChannelDeliveryCenterEntity>    返回类型 
	 */
	public List<ChannelDeliveryCenterEntity> findChannelDeliveryCenterByCondition(String tenantId, ChannelDeliveryCenterCondition condition);
	/**
	 *   根据条件获取发货地址信息数量
	 * @param tenantId
	 * @param channelDeliveryCenterCondition
	 * @return Integer    返回类型 
	 */
	public int getChannelDeliveryCenterSizeByCondition(String tenantId,ChannelDeliveryCenterCondition channelDeliveryCenterCondition);
	/**
	 *   新增发货地址
	 * @param tenantId
	 * @param channelDeliveryCenter
	 * @return Boolean    返回类型 
	 */
	public Boolean insertChannelDeliveryCenter(String tenantId,ChannelDeliveryCenterEntity channelDeliveryCenter);
	/**
	 *   修改发货地址
	 * @param tenantId
	 * @param channelDeliveryCenter
	 * @return Boolean    返回类型 
	 */
	public Boolean updateChannelDeliveryCenter(String tenantId,ChannelDeliveryCenterEntity channelDeliveryCenter);
	/**
	 *   删除发货地址
	 * @param tenantId
	 * @param channelDeliveryCenter
	 * @return Boolean    返回类型 
	 */
	public Boolean deleteChannelDeliveryCenter(String tenantId,ChannelDeliveryCenterEntity channelDeliveryCenter);
	
}
