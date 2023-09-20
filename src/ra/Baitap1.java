package ra;

import java.util.Arrays;

public class Baitap1 {
    public static int[] array = {};
    public static void main(String[] args) {
        arrPush(1);
        arrPush(2);
        arrPush(3);
        arrPush(4);
        System.out.println(Arrays.toString(array));
       arrShift();
       arrShift();
       arrShift();
       arrUnshift(10);
       arrUnshift(9);
        System.out.println(Arrays.toString(array));

    }
    public static void arrPush( int value){
        // tạo mảng mới
        int[] newArr = new int[array.length+1];
        // sao chép các phần tử mảng cũ sang mảng mới
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        // tiến hành thêm giá trị cần thêm mới vào phần tử cuối mảng
        newArr[newArr.length-1] = value;
        array = newArr;
    }
    public static void arrPop(){
        // tạo mảng mới
        if (array.length<1){
            return;
        }
        int[] newArr = new int[array.length-1];
        // sao chép các phần tử mảng cũ sang mảng mới
        for (int i = 0; i < array.length-1; i++) {
            newArr[i] = array[i];
        }
        // tiến hành thêm giá trị cần thêm mới vào phần tử cuối mảng
        array = newArr;
    }
    public static void arrShift(){
        // tạo mảng mới
        if (array.length<1){
            return;
        }
        int[] newArr = new int[array.length-1];
        // sao chép các phần tử mảng cũ sang mảng mới
        for (int i = 0; i < array.length-1; i++) {
            newArr[i] = array[i+1];
        }
        // tiến hành thêm giá trị cần thêm mới vào phần tử cuối mảng
        array = newArr;
    }

    public static void arrUnshift(int value){
        // tạo mảng mới
        int[] newArr = new int[array.length+1];
        // sao chép các phần tử mảng cũ sang mảng mới
        for (int i = 0; i < array.length; i++) {
            newArr[i+1] = array[i];
        }
        // tiến hành thêm giá trị cần thêm mới vào phần tử cuối mảng
        newArr[0] = value;
        array = newArr;
    }

}
