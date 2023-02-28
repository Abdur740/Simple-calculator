package calculator;

abstract class CalculatorOptr{
    int value1;

    abstract void addition(int value);
    abstract void subtraction(int value);
    abstract void multiplication(int value);
    abstract void division(int value);
    public int getValue(){
        return value1;

    }
   public void setValue(int val){
        value1=val;
    }
}
