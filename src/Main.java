import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sexo: " );
        char gender = scanner.next().charAt(0);
        Bill.gender = gender;
        System.out.print("Quantidade de cerveja: " );
        int beer = scanner.nextInt();
        beer = beer * Bill.BEER;
        System.out.print("Quantidade de refrigerantes: " );
        int softDrink = scanner.nextInt();
        softDrink = softDrink * Bill.SOFT_DRINK;
        System.out.print("Quantidade de espetinhos: " );
        int barbecue = scanner.nextInt();
        barbecue = barbecue * Bill.BARBERCUE;
        double valueConsumption = beer + softDrink + barbecue;
        System.out.println();

        scanner.close();
        
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f\n", Bill.feeding(valueConsumption));

        if (Bill.cover(valueConsumption) == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", Bill.cover(valueConsumption));
        }
        System.out.printf("Ingresso = R$ %.2f\n", Bill.ticket(gender));
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f\n", Bill.total(valueConsumption));


    }

}
