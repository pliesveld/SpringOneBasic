package com.beanPostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor2 implements BeanPostProcessor,Ordered
{
	@Override
	public Object postProcessBeforeInitialization (Object bean, String beanName)
	{
		System.out.println("2 MyBeanPostProcessor 2 : postProcessBeforeInitialization "+ beanName);
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization (Object bean, String beanName)
	{
		System.out.println("2 MyBeanPostProcessor 2 : postProcessAfterInitialization "+ beanName);
		return bean;
	}
	@Override
	public int getOrder() {
		return 0;
	}
}
