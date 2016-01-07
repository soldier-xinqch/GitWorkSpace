package com.xinqch.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xinqch.mapper.ChannelDeliveryCenterMapper;
import com.xinqch.model.ChannelDeliveryCenterCondition;
import com.xinqch.model.ChannelDeliveryCenterEntity;
import com.xinqch.service.IChannelDeliveryCenterService;

/**
 * @Description: 发货地址业务实现
 * @author xinqch 
 * @date 2015年12月18日 下午1:29:56
 */
@Service("channelDeliveryCenterService")
public class ChannelDeliveryCenterServiceImpl implements
		IChannelDeliveryCenterService {
	@Resource
	private ChannelDeliveryCenterMapper channelDeliveryCenterMapper;

	@Override
	public List<ChannelDeliveryCenterEntity> findChannelDeliveryCenterByCondition(
			String tenantId, ChannelDeliveryCenterCondition condition) {
		return channelDeliveryCenterMapper.findChannelDeliveryCenterByCondition(condition);
	}

	@Override
	public int getChannelDeliveryCenterSizeByCondition(String tenantId,
			ChannelDeliveryCenterCondition channelDeliveryCenterCondition) {
		int ss =  channelDeliveryCenterMapper.getChannelDeliveryCenterSizeByCondition(channelDeliveryCenterCondition);
		return ss;
	}

	@Override
	public Boolean insertChannelDeliveryCenter(String tenantId,
			ChannelDeliveryCenterEntity channelDeliveryCenter) {
		Boolean isSuccess = false;
		isSuccess = channelDeliveryCenterMapper.insert(channelDeliveryCenter)==0?true:false;
		return isSuccess;
	}

	@Override
	public Boolean updateChannelDeliveryCenter(String tenantId,
			ChannelDeliveryCenterEntity channelDeliveryCenter) {
		Boolean isSuccess = false;
		isSuccess = channelDeliveryCenterMapper.updateByPrimaryKey(channelDeliveryCenter)==0?true:false;
		return isSuccess;
	}

	@Override
	public Boolean deleteChannelDeliveryCenter(String tenantId,
			ChannelDeliveryCenterEntity channelDeliveryCenter) {
		Boolean isSuccess = false;
		if(null!= channelDeliveryCenter&&null != channelDeliveryCenter.getDeliveryCenterId()){
			isSuccess = channelDeliveryCenterMapper.deleteByPrimaryKey(channelDeliveryCenter.getDeliveryCenterId())==0?true:false;
		}
		return isSuccess;
	}

}
