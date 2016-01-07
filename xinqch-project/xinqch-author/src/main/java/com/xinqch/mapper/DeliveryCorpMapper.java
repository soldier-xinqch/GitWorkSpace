package com.xinqch.mapper;

import java.util.List;

import com.xinqch.model.DeliveryCorpCondition;
import com.xinqch.model.DeliveryCorpEntity;

/**
 * @ClassName: DeliveryCorpMapper 
 *   物流数据操作
 * @author xinqch 
 * @date 2015年12月15日 下午6:31:37
 */
public interface DeliveryCorpMapper {
	/**
	 *   根据ID删除物流信息
	 * @param corpId
	 * @return int    返回类型 
	 */
    int deleteByPrimaryKey(Long corpId);
    /**
     *   新增物流信息
     * @param record
     * @return int    返回类型 
     */
    int insert(DeliveryCorpEntity record);
    /**
     *   根据ID获取物流信息
     * @param corpId
     * @return DeliveryCorpEntity    返回类型 
     */
    DeliveryCorpEntity selectByPrimaryKey(Long corpId);
    /**
     *   根据物流ID修改物流信息
     * @param record
     * @return int    返回类型 
     */
    int updateByPrimaryKey(DeliveryCorpEntity record);
    
    /**
     *   根据筛选条件获取物流信息
     * @author xinqch  
     * @param corp 物流公司编码
     * @return List<DeliveryCorpEntity>返回类型 
     */
    List<DeliveryCorpEntity> findDeliveryCorpByCondition(DeliveryCorpCondition deliveryCorpCondition);
    /**
     *   根据条件获取物流信息数量
     * @param condition
     * @return int    返回类型 
     */
    int getDeliveryCorpByCondition(DeliveryCorpCondition deliveryCorpCondition);
    
    /**
     *   根据物流编码获取商家物流信息
     * @param corpCode
     * @return DeliveryCorpEntity    返回类型 
     */
    DeliveryCorpEntity findDeliveryCorpByCorpCode(String corpCode);
    
}