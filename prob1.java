import java.util.Scanner;
class prob1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter integer:");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("enter name:");
        String Name = scan.nextLine();
        System.out.println("enter char value:");
        char word = scan.next().charAt(0);
        System.out.println(num);
        System.out.println(Name);
        System.out.println(word);

    }
}