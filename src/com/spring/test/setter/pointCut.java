package com.spring.test.setter;

/**
 * �е�
 * @author Administrator
 *
 */
public class pointCut {
    private String song;
    private int age;
    
    /**
     * ʹ���޲ι��췽��ע�����Ҫ���޲ι��췽��
     */
    public pointCut(){
    	
    }
    /**
     * ʹ���вι��췽��ע��
     * @param song
     * @param age
     */
    public pointCut(String song,int age){
        this.song = song;
        this.age = age;
   }
    /**
     * �е�ָ���ķ���
     */
    public void doSomething() {
        System.out.println("������:"+age);
        System.out.println("����һ�� "+song+":");
        new insertMethod().play();
    }
    
    
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSong() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }


}