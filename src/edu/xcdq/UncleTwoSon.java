package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/4/23 8:30
 */
//多层继承
public class UncleTwoSon extends UncleTwo{
    public UncleTwoSon(){
        //+super();//调用父类的构造方法
        System.out.println("二舅的儿构造方法");
    }
    public void faHongbao(){
        System.out.println("红包接着发");
    }
}
