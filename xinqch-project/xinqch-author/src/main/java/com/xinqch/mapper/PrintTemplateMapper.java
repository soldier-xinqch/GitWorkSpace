package com.xinqch.mapper;

import java.util.List;

import com.xinqch.model.PrintTemplateCondition;
import com.xinqch.model.PrintTemplateEntity;

/**
 * @ClassName: PrintTemplateMapper 
 *   物流模板数据处理 
 * @author xinqch 
 * @date 2015年12月15日 下午6:26:18
 */
public interface PrintTemplateMapper {
	/**
	 *   根据模板ID删除模板
	 * @param printTemplateId
	 * @return int    返回类型 
	 */
    int deleteByPrimaryKey(Long printTemplateId);
    /**
     *   新增模板
     * @param record
     * @return int    返回类型 
     */
    int insert(PrintTemplateEntity record);
    /**
     *   根据模板ID获取模板信息
     * @param printTemplateId
     * @return PrintTemplateEntity    返回类型 
     */
    PrintTemplateEntity selectByPrimaryKey(Long printTemplateId);
    /**
     *   根据模板ID修改模板信息
     * @param record
     * @return int    返回类型 
     */
    int updateByPrimaryKey(PrintTemplateEntity record);
    
    /**
     *   根据筛选条件获取模板信息
     * @param TemplateName 模板名称
     * @param corp 物流公司编码
     * @param paperType 模板类型
     * @return List<PrintTemplateEntity>    返回类型 
     */
    List<PrintTemplateEntity> getResultList(PrintTemplateCondition templateCondition);
    /**
     *  根据筛选条件获取模板信息数量
     * @author xinqch  
     * @param templateCondition
     * @return int    返回类型 
     */
	int countByCond(PrintTemplateCondition templateCondition);
    
}