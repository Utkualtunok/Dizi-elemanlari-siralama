import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int size = inp.nextInt();
        
        int[] arr = new int [size];
        //Girilen dizi boyutu kadar eleman alıp dizinin içerisine atma işlemi
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < size ; i++) {
            System.out.print((i + 1) +". elemanı : ");
            arr[i] = inp.nextInt();
        }
        //Diziyi arrays.sort ile küçükten büyüğe sıralayıp ekrana yazdırma işlemi
        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}