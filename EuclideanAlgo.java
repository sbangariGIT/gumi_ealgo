import java.util.Scanner;

public class EuclideanAlgo{

    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = a.nextInt();
        System.out.print("Enter the second number: ");
        int second = a.nextInt();
        int big = 0 ;
        int small = 0;
        if(first > second){
            big = first;
            small = second;
        }
        else{
            big = second;
            small = first;
        }
        algo(big, small,big, small,1, 0, 0,1);
        a.close();
    }

    public static void algo(int a, int b, int a1, int b1,int c1, int c2, int d1, int d2){
        if(b1 == 1){
            if(d1 < 0){
                System.out.println("inverse of "+ a + " mod " + b +  " is " + (d1+b));
                System.out.println("inverse of "+ b + " mod " + a +  " is " + (d2));
            }
            else{
                System.out.println("inverse of "+ a + " mod " + b + " is " + (d1));
                System.out.println("inverse of "+ b + " mod " + a + " is " + (d2 + a));
            }
            return;
        }
        else if(b1 < 1){
            System.out.print(a +" and " + b + " are not relatively prime/ have common factors.\n" );
            return;
        }
        int c = a1/b1;
        int rem = a1%b1;
        int h1 = (c1 -(c*d1));
        int h2 = (c2 -(c*d2));
        System.out.printf("%-5d  =  %4d * %d  + %4d * %d \n", rem, h1,a, h2, b);
        algo(a,b,b1,rem,d1,d2,h1,h2);
    }
}