package com.spring.test.aop;


/**
 * ����
 * @author Administrator
 *
 */
public class section {
	//���ӵ�
    public void methodBefore(){
        System.out.println("���뷽��֮ǰִ����");
    }
    //���ӵ�
    public void methodAfter(){
        System.out.println("���뷽��֮��ִ����");
    }
    //���ӵ�
    public void throwMethod(){
        System.out.println("���뷽���쳣ִ����");
    }

}