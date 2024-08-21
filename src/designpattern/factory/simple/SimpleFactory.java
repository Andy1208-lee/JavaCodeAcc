package designpattern.factory.simple;

import designpattern.factory.Operation;

/**
 * 简单工厂，
 * 优点是比较好理解，简单易操作。
 * 缺点是类的创建依赖工厂类，如果想要拓展程序，必须对工厂类进行修改，
 * 这违反了设计模式的开闭原则（OCP），即对扩展开放，对修改关闭。
 * 比如现在想添加一个开方的运算，需要修改工厂的判断逻辑，添加一个case条件.
 *
 * @author liu yuning
 */
public class SimpleFactory {
    public static Operation createOperation(char operator) {
        Operation operation = null;
        
        switch (operator) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("unsupported operation");
        }
        
        return operation;
    }
}