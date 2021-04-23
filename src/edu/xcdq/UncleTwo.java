package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/4/23 8:13
 */
public class UncleTwo extends Uncle{
    public UncleTwo(){
        System.out.println("二舅的构造方法");
    }
    //独有的方法
    public void hejiu(){
        System.out.println("二九喜欢喝酒");
    }
    //复写（覆写）Override 父类中的方法
    public void faHongbao(){
        System.out.println("不发1红包");
    }
}
