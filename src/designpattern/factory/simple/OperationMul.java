package designpattern.factory.simple;

import designpattern.factory.Operation;

/**
 * 乘法类
 * 
 * @author liu yuning
 *
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
	return numberA * numberB;
    }

}