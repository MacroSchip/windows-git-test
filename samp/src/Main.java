import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main(String args[]){
        System.out.println("Hello world!");

        System.out.println(getSum(5,10));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println("The value is " + num);
    }

    public static int getSum(int num1, int num2){
        return num1 + num2;
    }
    //added this message
}