package designpattern.factory.method;

import designpattern.factory.Operation;

/**
 * 工厂方法客户端,
 * 这里对比简单工厂方法来讲，客户端上其实是没有区别的
 * 我们之前将，简单工厂是因为违背了ocp原则，添加一个功能需要对工厂添加if else，这里就对之前的工厂进行了修改，但是工厂方法的话，
 * 这里只需要新增工厂类，即可，对添加开放，这里不要管客户端是怎么调用的，工厂方法的开闭原则的重点应该放在工厂本身.
 * 
 * @author liu yuning
 *
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
	IFactory operFactory = new DivFactory();
	Operation operation = operFactory.createOperation();

	operation.numberA = 3.4;
	operation.numberB = 4.5;

	System.out.println(operation.result());

    }
}