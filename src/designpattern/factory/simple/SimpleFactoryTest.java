package designpattern.factory.simple;

import designpattern.factory.Operation;

/**
 * 使用工厂方法生成实例完成运算操作
 *
 * @author liu yuning
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Operation operation;
        char operator;
        
        operator = '+';
        operation = SimpleFactory.createOperation(operator);
        operation.numberA = 1.2;
        operation.numberB = 2.3;
        
        System.out.println(operation.result());
    }
}