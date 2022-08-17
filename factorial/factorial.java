import java.util.Scanner;

class factorial {
    public factorial() {
    }

    public static void main(String[] args) {
        try (Scanner pepe = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int a = pepe.nextInt();

            int i = 1 , fact = 1;
            for(i=1;i<=a;i++){    
                fact=fact*i;    
            }    
            System.out.println("Factorial of "+ a +" is: "+fact);
        }    
    }
}
