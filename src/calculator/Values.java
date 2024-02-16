package calculator;

public class Values {
    float firstValue =Float.NaN;
    float secondValue =Float.NaN;
    float result;
    String operation;

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public float getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(float firstValue) {
        this.firstValue = firstValue;
    }

    public float getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(float secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float calculate(Float firstValue, Float secondValue, String operation){
        float result = 0.0f;
        try{
        switch (operation){
            case "÷":
                result = firstValue/secondValue;
                break;
            case "x":
                result = firstValue*secondValue;
                break;
            case "-":
                result = firstValue-secondValue;
                break;
            case "+":
                result = firstValue+secondValue;
                break;
            }
        }
        catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

}
