import java.util.*;
public class day2{
    public static void main(String[]args) {
        int n = 450;
        
        Scanner sn = new Scanner(System.in);
        n=sn.nextInt();

        int arr[] = new int [n];

        // Initialisation of for loop 
        for (int i=0; i<=arr.length -1 ; i++){

            arr[i] = i+1;
        }

        // Traversal of arrays 
        for(int element : arr){
            System.out.println(element);
            
        }

        for(int i=0; i<= arr.length-1;i++){
            System.out.println(arr[i]);
        
        }
    }
}