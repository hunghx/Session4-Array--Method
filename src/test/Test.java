package test;

import ra.Main;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Main.isDivideTo3(9));
        int[] a = {10};
        changeVariable(a);
        System.out.println(Arrays.toString(a));
    }
    public static void changeVariable(int[] x){
        x[0] = 100;
    }
}
