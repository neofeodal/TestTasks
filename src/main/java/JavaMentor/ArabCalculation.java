package JavaMentor;

public class ArabCalculation {

    static int symbol1;
    static int symbol2;
//    int arabResult;

    public void arabCalculation() {

        ArabCalculation.symbol1 = Integer.parseInt(InputMethod.inputSymbol1);
        ArabCalculation.symbol2 = Integer.parseInt(InputMethod.inputSymbol2);

        if (symbol1 <= 0 || symbol2 <= 0) {
            System.out.println("Числа должны быть не меньше 0");
        } else if (symbol1 > 10 || symbol2 > 10) {
            System.out.println("Числа должны быть не больше 10и");
        } else {
            switch (InputMethod.operation) {
                case "+":
                    System.out.println(symbol1 + symbol2);
                    break;
                case "-":
                    System.out.println(symbol1 - symbol2);
                    break;
                case "*":
                    System.out.println(symbol1 * symbol2);
                    break;
                case "/":
                    System.out.println(symbol1 / symbol2);
                    break;
                default:
                    System.out.println("Либо ты не поставил пробелы, либо знак не тот поставил (+,-,*,/)");
            }
        }
//        return arabResult;
    }
}
/*
            ArabCalculation.symbol1 = Integer.parseInt(inputSymbol1.trim());
 Оказывается то что выше полностью равно тому что ниже, код становится короче и красивее
            int symbol1 = Integer.parseInt(inputSymbol1.trim());
            this.symbol1 = symbol1;

 */