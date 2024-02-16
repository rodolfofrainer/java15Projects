package calculator;

public class Values {
    float firstValue =Float.NaN;
    float secondValue =Float.NaN;
    String operation;

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
            result = switch (operation) {
                case "÷" -> firstValue / secondValue;
                case "x" -> firstValue * secondValue;
                case "-" -> firstValue - secondValue;
                case "+" -> firstValue + secondValue;
                default -> result;
            };
        }
        catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

}
