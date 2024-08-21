package designpattern.factory.simple;

import designpattern.factory.Operation;

/**
 * 减法类
 * 
 * @author liu yuning
 *
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}