package com.spring.test.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
    public static void main(String[] args) throws Exception {
    	String path="bean.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        pointCut pointCutBean = (pointCut)ctx.getBean("pointCutBean");
        pointCutBean.doSomething();
        
    }
}