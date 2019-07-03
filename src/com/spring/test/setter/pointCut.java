package com.spring.test.setter;

/**
 * 切点
 * @author Administrator
 *
 */
public class pointCut {
    private String song;
    private int age;
    
    /**
     * 使用无参构造方法注入必须要有无参构造方法
     */
    public pointCut(){
    	
    }
    /**
     * 使用有参构造方法注入
     * @param song
     * @param age
     */
    public pointCut(String song,int age){
        this.song = song;
        this.age = age;
   }
    /**
     * 切点指定的方法
     */
    public void doSomething() {
        System.out.println("他今年:"+age);
        System.out.println("唱了一首 "+song+":");
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