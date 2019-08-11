package lfx.news.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lfx.news.bean.News;
import lfx.news.mapper.NewsMapper;
import lfx.news.util.dateUtil;
import lfx.news.util.stringTUtil;

public class MyTest {

	@Test
	public void show(){
		
		String url = "http://news.cnstock.com/news,yw-2019/08/10-4413224.htm";
		
		String[] split = url.split("-");
		
		String str = split[1];
		
		int en = stringTUtil.hasStrng(split[2],"[^0-9]");
		
		ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		NewsMapper bean = ac.getBean(NewsMapper.class);
		
		News news = new News();
		
		news.setScore(en);
		news.setCreateTime(dateUtil.hasDate(str,"yyyy/MM/dd"));
		
		bean.add(news);
	}
	
	
	
}
