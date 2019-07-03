package com.spring.test.aop;


/**
 * 切面
 * @author Administrator
 *
 */
public class section {
	//连接点
    public void methodBefore(){
        System.out.println("切入方法之前执行了");
    }
    //连接点
    public void methodAfter(){
        System.out.println("切入方法之后执行了");
    }
    //连接点
    public void throwMethod(){
        System.out.println("切入方法异常执行了");
    }

}