import java.util.Scanner;


public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Numero:  ");
        int number = scanner.nextInt();
        
        if (isFibonacci(number)) {
            System.out.println(number + " Pertence a sequencia fibonacci.");
        } else {
            System.out.println(number + " nao pertence a sequencia fibonacci.");
        }
    }
    
    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;
        
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        
        return b == number;
    }
}