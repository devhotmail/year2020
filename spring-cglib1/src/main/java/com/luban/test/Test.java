package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.service.UserService;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		Appconfig appconfig = annotationConfigApplicationContext.getBean(Appconfig.class);
		/*Enhancer enhancer = new Enhancer();
		//对UserService.class 做一个代理对象
		enhancer.setSuperclass(UserService.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);

		//设置一个拦截器 去拦截UserService的要执行方法
		enhancer.setCallback(new LubanMethodInterceptor());
		UserService userService = (UserService) enhancer.create();
		userService.query();*/
		/*cglib代理的思路 就是 你提供一个拦截器，该拦截器实现了Callback，在其中
		* 实现了interceptor 加入了自己的代理逻辑，再调用目标方法*/


	}
}
