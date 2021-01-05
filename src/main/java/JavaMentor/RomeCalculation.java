package JavaMentor;

import java.util.HashMap;
import java.util.Map;

public class RomeCalculation {

    static int symbol1;
    static int symbol2;
    int arabResult;

    public void romeCalculation() {

        Map<Character, Integer> romanToArabDict = new HashMap<Character, Integer>();
        romanToArabDict.put('I', 1);
        romanToArabDict.put('V', 5);
        romanToArabDict.put('X', 10);
        romanToArabDict.put('L', 50);
        romanToArabDict.put('C', 100);
        romanToArabDict.put('D', 500);
        romanToArabDict.put('M', 1000);

            for (int i = 0; i < InputMethod.inputSymbol1.length(); i += 1) {
                if (i == 0 || romanToArabDict.get(InputMethod.inputSymbol1.charAt(i)) <= romanToArabDict.get(InputMethod.inputSymbol1.charAt(i - 1)))
                    symbol1 += romanToArabDict.get(InputMethod.inputSymbol1.charAt(i));
                else
                    symbol1 += romanToArabDict.get(InputMethod.inputSymbol1.charAt(i)) - 2 * romanToArabDict.get(InputMethod.inputSymbol1.charAt(i - 1));
            }

            for (int i = 0; i < InputMethod.inputSymbol2.length(); i += 1) {
                if (i == 0 || romanToArabDict.get(InputMethod.inputSymbol2.charAt(i)) <= romanToArabDict.get(InputMethod.inputSymbol2.charAt(i - 1)))
                    symbol2 += romanToArabDict.get(InputMethod.inputSymbol2.charAt(i));
                else
                    symbol2 += romanToArabDict.get(InputMethod.inputSymbol2.charAt(i)) - 2 * romanToArabDict.get(InputMethod.inputSymbol2.charAt(i - 1));
            }

            switch (InputMethod.operation) {
                case "+":
                    arabResult = (symbol1 + symbol2);
                    break;
                case "-":
                    arabResult = (symbol1 - symbol2);
                    break;
                case "*":
                    arabResult = (symbol1 * symbol2);
                    break;
                case "/":
                    arabResult = (symbol1 / symbol2);
                    break;
                default:
                    System.out.println("Либо ты не поставил пробелы, либо знак не тот поставил (+,-,*,/)");
            }

        int[] arabArrayList = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanArrayList = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romeResult = new StringBuilder();
        for (int i = 0; i < arabArrayList.length; i += 1) {
            while (arabResult >= arabArrayList[i]){
                arabResult -= arabArrayList[i];
                romeResult.append(romanArrayList[i]);
            }
        }
        System.out.println(romeResult.toString());
    }
}
