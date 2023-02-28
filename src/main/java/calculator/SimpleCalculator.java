package calculator;

import java.util.logging.Logger;

class SimpleCalculator extends CalculatorOptr{
    private static final Logger log = Logger.getLogger("InfoLogging");
    void addition(int val){
        setValue(getValue()+val);
    }    
    void subtraction(int val){
        setValue(getValue()-val);
    }
    void multiplication(int val){
        setValue(getValue()*val);
    }
    void division(int val){
        setValue(getValue()/val);
    }
    void result(){
        String result = ""+getValue()+"\n";
        log.info(result);
    }
}