import java.util.Scanner;
class prob2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int  angles = a+b+c;
        if(  angles == 180)
        {
            System.out.println("triangel is formed");
        }
        else
        {
            System.out.println("triangle cannot be formed");
        }


    }
}