package designpattern.factory.abstraction;

import java.util.HashMap;
import java.util.Map;

import designpattern.factory.Operation;
import designpattern.factory.simple.OperationAdd;
import designpattern.factory.simple.OperationDiv;
import designpattern.factory.simple.OperationMul;
import designpattern.factory.simple.OperationSub;

/**
 * 利用反射改造简单工厂模式，去掉分支判断的逻辑
 *
 * @author liu yuning
 */
public class OperationFactory {
    private static final Map<String, Class<? extends Operation>> allOperationMaps = new HashMap<>();
    
    public static void fillMap() {
        allOperationMaps.put("+", OperationAdd.class);
        allOperationMaps.put("-", OperationSub.class);
        allOperationMaps.put("*", OperationMul.class);
        allOperationMaps.put("/", OperationDiv.class);
    }
    
    public static Operation createOperation(String operator)
            throws InstantiationException, IllegalAccessException {
        fillMap();
        Class<? extends Operation> operationClass = allOperationMaps.get(operator);
        
        if (operationClass == null) {
            throw new RuntimeException("unsupported operation");
        }
        return operationClass.newInstance();
    }
    
}
