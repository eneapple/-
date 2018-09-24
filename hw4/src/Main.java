import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int v1=scn.nextInt();
        float v2=v1/(float)2.54 ;
        int v3=scn.nextInt();
        float v4=v3/(float)0.454;
        System.out.println(v2);
        System.out.println(v4);


    }
}
