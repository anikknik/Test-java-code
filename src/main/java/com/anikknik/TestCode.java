package com.anikknik;

public class TestCode {
    public static void main(String[] args) {

        char simb = 's';
        boolean bf = true;
        byte bb = 100;
        short ss = 32000;
        int ii = 127000; // Integer лучше для проверки, что вернул не дефолтный 0
        long ll = 200000L;

        float ff = 4.123F;
        double dd = 432.123D;

        String pop = "There is many words, numbers and symbols in my prog";
        String fill = ", but They not stopped me!";

        System.out.println("Result summary " + bb + " and " + bb + " is " + sum(bb, ss));
        System.out.println("Result difference " + ss + " and " + bb + " is " + diff(ss, bb));
        System.out.println("Result product " + ss + " and " + bb + " is " + prod(ss, bb));
        System.out.println("Result quotient " + ll + " and " + ss + " is " + quot((int) ll, ss));
        System.out.println("Result remainder of division " + ii + " and " + ss + " is " + rem(ii, ss));
        System.out.println("Result summary with dot " + ff + " and " + dd + " is " + sum(ff, dd));

        System.out.println((++bb) + 12);// Сначала изменяем на +1
        System.out.println((--bb) + 12);// Сначала вычитаем -1 от прошлого значения
        System.out.println(bb++);// Сначала возвращаем
        System.out.println(bb);// Возвращаем изменённое прошлое зачение

        System.out.print(pop);
        System.out.println(fill);

//        int i = Integer.MAX_VALUE + 10;//При переполнении в + меняется число на отрицательное и происходит вычитание
//        System.out.println(i);
//        long o = Integer.MAX_VALUE + 10L;//Преобразуем в лонг, чтобы пробить верхнее значение
//        System.out.println(o);
//        int p = Integer.MIN_VALUE - 20;//При переполнении в - меняется число на положительное и происходит вычитание
//        System.out.println(p);
//        long r = Integer.MIN_VALUE - 20L;//Преобразуем в лонг, чтобы пробить нижнее значение
//        System.out.println(r);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int diff(int a, int b) {
        return a - b;
    }

    static int prod(int a, int b) {
        return a * b;
    }

    static int quot(int a, int b) {
        return a / b;
    }

    static int rem(int a, int b) {
        return a % b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

}
