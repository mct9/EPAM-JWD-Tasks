package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;
        Character ch;

        while (true) {
            System.out.print("Enter character: ");
            temp = scan.next();
            if (temp.length() > 1) {
                System.err.println("Enter only one character.");
            } else {
                ch = temp.toLowerCase().charAt(0);
                checkFirst(ch);
                checkSecond(ch);
                checkThird(ch);
                checkFourth(ch);
                checkFifth(temp.toLowerCase());
                break;
            }
        }
    }

    public static void checkFirst(Character ch) {
        ArrayList <Character> list =
                new ArrayList<>(Arrays.asList('e','y','u','i','o','a','у','е','ё','ы','а','о','э','я','и','ю'));
        if (list.contains(ch)) {
            System.out.println("Character " + ch +" is vowel.");
        } else {
            System.out.println("Character " + ch +" is consonant.");
        }
    }

    public static void checkSecond(Character ch) {
        boolean flag = false;
        switch (ch) {
            case 'e':
                flag = true;
                break;
            case 'y':
                flag = true;
                break;
            case 'u':
                flag = true;
                break;
            case 'i':
                flag = true;
                break;
            case 'o':
                flag = true;
                break;
            case 'a':
                flag = true;
                break;
            case 'у':
                flag = true;
                break;
            case 'е':
                flag = true;
                break;
            case 'ё':
                flag = true;
                break;
            case 'ы':
                flag = true;
                break;
            case 'а':
                flag = true;
                break;
            case 'о':
                flag = true;
                break;
            case 'э':
                flag = true;
                break;
            case 'я':
                flag = true;
                break;
            case 'и':
                flag = true;
                break;
            case 'ю':
                flag = true;
                break;
            default:
                break;
        }
        if (flag) {
            System.out.println("Character " + ch +" is vowel.");
        } else {
            System.out.println("Character " + ch +" is consonant.");
        }
    }

    public static void checkThird(Character ch) {
        if ((ch == 'e') || (ch == 'y') || (ch == 'u') || (ch == 'i') || (ch == 'o') || (ch =='a') || (ch == 'у') ||
            (ch == 'е') || (ch == 'ы') || (ch == 'а') || (ch == 'о') || (ch == 'э') || (ch =='я') || (ch == 'и') ||
            (ch == 'ю') || (ch == 'ё') {
            System.out.println("Character " + ch +" is vowel.");
        } else {
            System.out.println("Character " + ch +" is consonant.");
        }
    }

    public static void checkFourth(Character ch) {
        int characterCode = (int) ch;
        boolean fl = false;
        int code1 = 97;
        int code2 = 101;
        int code3 = 105;
        int code4 = 111;
        int code5 = 117;
        int code6 = 121;
        int code7 = 1091;
        int code8 = 1077;
        int code9 = 1105;
        int code10 = 1099;
        int code11 = 1072;
        int code12 = 1086;
        int code13 = 1101;
        int code14 = 1103;
        int code15 = 1080;
        int code16 = 1102;
        
        if ((characterCode == code1) || (characterCode == code2) || (characterCode == code3) || (characterCode == code4) || 
            (characterCode == code5) || (characterCode == code6) || (characterCode == code7) || (characterCode == code8) || 
            (characterCode == code9) || (characterCode == code10) || (characterCode == code11) || (characterCode == code12) || 
            (characterCode == code13) || (characterCode == code14) || (characterCode == code15) || (characterCode == code16)) {
            System.out.println("Character " + ch +" is vowel.");
        } else {
             System.out.println("Character " + ch +" is consonant.");
        }
        
        /*int[] codeArr = {97, 101, 105, 111, 117, 121, 1091, 1077, 1105, 1099, 1072, 1086, 1101, 1103, 1080, 1102};

        for (int i = 0; i < codeArr.length; i++) {
            if (codeArr[i] == characterCode) {
                System.out.println("Character " + ch +" is vowel.");
                fl = true;
                break;
            }
        }
        if (!fl) {
            System.out.println("Character " + ch +" is consonant.");
        }*/
    }

    public static void checkFifth(String str) {
        String tempStr = "eyuioaуеёыаоэяию";

        if (tempStr.indexOf(str) != -1) {
            System.out.println("Character " + str +" is vowel.");
        } else {
            System.out.println("Character " + str +" is consonant.");
        }
    }
}
