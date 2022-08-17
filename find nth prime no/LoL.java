import java.util.*;

class LoL {
    public static void main(String[] args) {
        Scanner yes = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input = yes.nextInt();
        int num = 1, count =0, i;
        while(count<input) {
            num = num+1;
            for(i=2; i<num; i++) {
                if(num%i == 0) {
                    break;
                }
            }
            if(i == num) {
                count = count+1;
            }
        }
        int hehe = input % 10;
        int xd = input % 100;
        if(input <= 0) {
            System.out.println("Invalid Input");
        }
        else if(hehe == 1 && xd != 11 ) {
            System.out.println("The "+input+"st prime number is "+num);
        }
        else if(hehe == 2 && xd != 12 ) {
            System.out.println("The "+input+"nd prime number is "+num);
        }
        else if(hehe == 3 && xd != 13 ) {
            System.out.println("The "+input+"rd prime number is "+num);
        }
        else {
            System.out.println("The "+input+"th prime number is "+num);
        }
    }
}
