package JavaMentor;

public class Main {

    public static void main(String[] args) {
        ArabCalculation arabCalculation = new ArabCalculation();
        RomeCalculation romeCalculation = new RomeCalculation();
        InputMethod inputMethod = new InputMethod();

        inputMethod.inputMethod();

        if (CheckStringIs.checkStringIsInt()) {
            arabCalculation.arabCalculation();
        }else if (CheckStringIs.checkInputSymbilsIsRomeSymbols()){
            romeCalculation.romeCalculation();
        }else {
            System.out.println("Калькулятор не может работать с арабскими, римскими и дробными цифрами одномоментно!" + "\nИли ты вообще ввёл левую букву");;
        }
    }
}














        /*
        - тут должен быть сканнер, который принимает с клавиатуры числа или строки
        - тут надо написать ifs, с вложенными в него выполнением методов принадлежащих классам, в которых призводится необзодимые расчёты, например:

        1) если ты вводишь с клавиатуры числа то выполняется метод arabCalc класса ArabCalculation
        if (symbol1.is int && symbol2.is int){
              arabCalculation.arabCalc;

        2) если ты вводишь с клавиатуры римские числа те строку, то выполняется метод romeCalc класса RomeCalculation
        else if (symbol1.is String && symbol2.is String)
                  romeCalculation.romeCalc

        else
              sout ("Калькулятор не может работать с арабскими, римскими и дробными цифрами одномоментно!")
*/