package com.beanPostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessor1 implements BeanPostProcessor,Ordered
{
	@Override
	public Object postProcessBeforeInitialization (Object bean, String beanName)
	{
		System.out.println("1 MyBeanPostProcessor 1 : postProcessBeforeInitialization "+ beanName);
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization (Object bean, String beanName)
	{
		System.out.println("1 MyBeanPostProcessor 1 : postProcessAfterInitialization "+ beanName);
		return bean;
	}
	@Override
	public int getOrder() {
		return 1;
	}
	
}
