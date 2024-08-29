import java.util.ArrayList;
import java.util.Scanner;
public class RashidSort{
    public static void printArray(int [] a){
        System.out.print("{ ");
        for(int i = 0; i<a.length ; i++){
            if(i==a.length - 1){
                System.out.print(a[i]+" }");
            }
            else{
                System.out.print(a[i]+", ");
            }
        }
        System.out.println();
    }

    public static int max(int [] a){
        int ans = a[0];
        for(int i : a){
            ans = Math.max(ans, i);
        }
        return ans;
    }

    public static int min(int [] a){
        int ans = a[0];
        for(int i : a){
            ans = Math.min(ans, i);
        }
        return ans;
    }

    public static void rashidSort(int a[]){
        ArrayList<Integer> b = new ArrayList<>();
        int high = max(a);
        int low = min(a);
        for(int i = low; i<=high ; i++){
            for(int j = 0 ; j<a.length ; j++){
                if(a[j]==i){
                    b.add(i);
                }
            }
        }
        for(int i = 0 ; i<a.length ; i++){
            a[i] = b.get(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before sort : ");
        printArray(a);
        rashidSort(a);
        System.out.println("Array After sort : ");
        printArray(a);
    }
}