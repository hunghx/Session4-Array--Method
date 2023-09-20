package test;

import ra.Baitap1;
import ra.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Main.isDivideTo3(9));
        int[] a = {10};
        changeVariable(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Baitap1.array));
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        Baitap1.arrPush(1);
        System.out.println(Arrays.toString(Baitap1.array));

    }
    public static void changeVariable(int[] x){
        x[0] = 100;
    }
}
