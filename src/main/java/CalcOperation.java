public class CalcOperation {

    public static float getCalculate (float num1, float num2, String operand){

        float result = 0.0f;
        switch (operand){
            case "*":
                result = num1 * num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }

        return result;
    }
}
