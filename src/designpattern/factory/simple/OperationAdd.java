package designpattern.factory.simple;

import designpattern.factory.Operation;

/**
 * 加法类
 * 
 * @author liu yuning
 *
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
	return numberA + numberB;
    }

}