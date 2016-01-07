package com.xinqch.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqch.mapper.ChannelDeliveryCenterMapper;
import com.xinqch.mapper.DeliveryCorpMapper;
import com.xinqch.mapper.PrintTemplateMapper;
import com.xinqch.mapper.UserMapper;
import com.xinqch.model.DeliveryCorpCondition;
import com.xinqch.model.DeliveryCorpEntity;
import com.xinqch.model.PrintTemplateCondition;
import com.xinqch.model.PrintTemplateEntity;
import com.xinqch.service.IChannelDeliveryCenterService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:testConfig/spring-context.xml")
public class UserServiceImplTest {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DeliveryCorpMapper corpMapper;
	@Autowired
	private ChannelDeliveryCenterMapper cdcMapper;
	@Autowired
	private PrintTemplateMapper templateMapper;
	@Autowired
	IChannelDeliveryCenterService service;
	
//	@Test
	public void testGetUserById() throws Exception {
		System.out.println(userMapper.selectByPrimaryKey("1"));
	}
	
	@Test
	public void testChannelDeliveryCenter()throws Exception {
		//查询
//		ChannelDeliveryCenterCondition condition = new ChannelDeliveryCenterCondition();
//		ChannelDeliveryCenterEntity entity = new ChannelDeliveryCenterEntity();
//		BigDecimal id = new BigDecimal(29695878439698L);
//		System.out.println(cdcMapper.selectByPrimaryKey(s));
		//新增
//		entity.setDeliveryCenterId(id);
//		id = new BigDecimal(1126799903367979l);
//		entity.setChannelId(id);
//		entity.setOuterId("286625--1");
//		entity.setName("xinqch测试");
//		entity.setProvince("北京省");
//		entity.setCity("北京市");
//		entity.setCountry("大望路");
//		entity.setAddress("大望路16-611");
//		entity.setRegion("110000,110100,110105");
//		entity.setContactName("xinqch");
//		entity.setZip("1");
//		entity.setPhone("12313132131");
//		entity.setGetDef(0);
//		entity.setState(0);
//		entity.setCompanyName("xinqch");
//		cdcMapper.insert(entity);
		//修改
//		entity.setDeliveryCenterId(id);
//		id = new BigDecimal(6126799303367979l);
//		entity.setChannelId(id);
//		entity.setOuterId("286625-2-1");
//		entity.setName("xinqch测试1");
//		entity.setProvince("北京省1");
//		entity.setCity("北京市1");
//		entity.setCountry("大望路1");
//		entity.setAddress("大望路161-611");
//		entity.setRegion("110000,110100,1101105");
//		entity.setContactName("xinqch1");
//		entity.setZip("1");
//		entity.setPhone("123131321131");
//		entity.setGetDef(0);
//		entity.setState(0);
//		entity.setCompanyName("xinqch");
//		cdcMapper.updateByPrimaryKey(entity);
		//删除
//		cdcMapper.deleteByPrimaryKey(id);
//		id = new BigDecimal(6126799303367979l);
//		condition.setChannelId(1826799903367976l);
//		condition.setPageNo(0);
//		condition.setPageSize(2);
//		List<ChannelDeliveryCenterEntity> model
//		int num= cdcMapper.getChannelDeliveryCenterSizeByCondition(condition);
//		System.out.println(num);
//		int nums = service.getChannelDeliveryCenterSizeByCondition("", condition);
//		System.out.println(nums);
		List<Long> ids = cdcMapper.getList();
		System.out.println(ids.size());
	}
//	@Test
	public void testPrintTemplate()throws Exception {
		//查询
		PrintTemplateCondition condition = new PrintTemplateCondition();
		condition.setTemplateId(123456789l);
		List<PrintTemplateEntity> result = templateMapper.getResultList(condition);
		System.out.println(result.size());
	}
	@Test
	public void testDeliveryCorp(){
		DeliveryCorpCondition condition = new DeliveryCorpCondition();
		condition.setCorpCode("");
		List<DeliveryCorpEntity> deliveryCorps = corpMapper.findDeliveryCorpByCondition(null);
		for (DeliveryCorpEntity deliveryCorpEntity : deliveryCorps) {
			System.out.println(deliveryCorpEntity.getCorpName());
		}
	}

}
