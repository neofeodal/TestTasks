package JavaMentor;

import java.util.Scanner;

public class InputMethod {
    static String inputSymbol1;
    static String operation;
    static String inputSymbol2;

    public void inputMethod (){
        System.out.print("Введите с пробелами число, знак (+,-,*,/) и снова число (либо оба арабские, либо оба римские и не меньше 0, не больше 10): ");
        Scanner scanner = new Scanner(System.in);
        inputSymbol1 = scanner.next();
        operation = scanner.next();
        inputSymbol2 = scanner.next();
    }
}
