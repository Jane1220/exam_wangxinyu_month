package com.wangxinyu.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.wangxinyu.entity.Channel;
import com.wangxinyu.service.ChannelService;


public class TestChannel  extends TestBase{
	
	@Autowired
	ChannelService channelService;
	
	@Test
	 public void testList() {
		List<Channel> list = channelService.list();
		 list.forEach(x->{
			 System.out.println(" 频道是 " + x);
		 });
	 }
	
}
