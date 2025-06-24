import java.util.Scanner;
class prob3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>=90)
        {
            System.out.println("GRADE A");
        }
        else if(mark>=80 && mark<90)
        {
            System.out.println("GRADE B");
        }
        else if(mark>=60 && mark<80)
        {
            System.out.println("GRADE C");
        }
        else if(mark>=35)
        {
            System.out.println("GRADE D");
        }
        else
        {
            System.out.println("fail");
        }

    }
}