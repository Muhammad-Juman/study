package javaprogramms;

import java.util.Scanner;
public class JavaProgramms {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        char[] alphabet={'A','B','C','D','E','F'};
//        for(int i=0;i<alphabet.length;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(alphabet[j]+"\t");
//            }
//            System.out.println();
//        }
//        
                    System.out.print("Enter Array Size :");
                     int array=input.nextInt();
                     int[] arr=new int[array];
                     
                     for(int i =0;i<array;i++ ){
                         System.out.print("Enter Array Index "+ i +" Value  ");
                         int a=input.nextInt();
                         arr[i]=a;
                     }
                     
                     for(int j:arr){
                         System.out.println(j);
                           
                     }
    
    
    }
    
}
