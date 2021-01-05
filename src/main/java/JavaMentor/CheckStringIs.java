package JavaMentor;

import java.util.Arrays;

public class CheckStringIs {

    static String regex = "\\d+"; // эта строка помещает в regex (регулярные выражения) все целаые числа.
    static String [] romeSymbolsArray = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};


    // Проверяю является ли оба введённых символа числами
    public static boolean checkStringIsInt() {
        return InputMethod.inputSymbol1.matches(regex) & InputMethod.inputSymbol2.matches(regex);
    }
    // Проверяю является ли введённые символы римскими символами
    public static boolean checkInputSymbilsIsRomeSymbols(){
        return Arrays.asList(romeSymbolsArray).contains(InputMethod.inputSymbol1) & Arrays.asList(romeSymbolsArray).contains(InputMethod.inputSymbol2);
    }
// Оказывается метод выше прицепом выполнял те же действия что и метод ниже
    // Проверяю введённые символы больше ли они 10и
//    public static boolean checkStringLessThen10() {
//        return RomeCalculation.symbol1 <= 10 && RomeCalculation.symbol2 <= 10;
//    }
}











/*
        if (InputMethod.inputSymbol1.matches(regex) || InputMethod.inputSymbol2.matches(regex)) {
            return true;
//            System.out.println("Тут есть число!");
        } else {
            return false;
//            System.out.println("Тут числа нет!");
        }
То что выше = тому что ниже
        return InputMethod.inputSymbol1.matches(regex) || InputMethod.inputSymbol2.matches(regex);

 */