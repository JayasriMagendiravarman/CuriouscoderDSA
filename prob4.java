import java.util.Scanner;
class prob4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        switch(size)
        {
            case 29:
            System.out.println("small");
            break;
            case 38:
            System.out.println("medium");
            break;
            case 42:
            System.out.println("large");
            break;
            default:
            System.out.println("invalid data");
        }
    }
}