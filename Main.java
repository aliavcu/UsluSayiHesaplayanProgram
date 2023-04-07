import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        int total = 1;
        
        for(i = 1; i <= k; i++){
                total *= n;
        }
        System.out.println("Cevap : " +total);

    }

}
