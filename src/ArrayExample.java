import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sách hần tử của mảng là:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chỉ số của 1 phần tử bất kỳ");
        int x = scanner.nextInt();
        try {
            System.out.println("giá trị của phần tử có chỉ số"+x+"là"+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("vượt quá giới hạn của mảng");
        }
    }
}
