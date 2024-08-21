package designpattern.factory;

/**
 * 操作类抽象类
 *
 * @author liu yunings
 */
public abstract class Operation {
    public double numberA;
    public double numberB;
    
    public abstract double result();
}
