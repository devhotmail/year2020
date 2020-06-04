package com.luban.test;

import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;

public class LubanMethodInterceptor implements MethodInterceptor {

	//拦截了 UserServicde的每一个方法即每次执行UserService前都会先执行intercept
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("增强方法把----intercept cglib");
		/*因为cglib代理对象是基于父类的，这里的父类就是UserService
		所以用invokeSuper调用父类方法即目标对象方法即UserService的方法*/
		return methodProxy.invokeSuper(o, objects);
//		return null;
	}
}
