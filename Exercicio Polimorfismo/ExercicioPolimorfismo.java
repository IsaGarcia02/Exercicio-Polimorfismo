import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPolimorfismo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        
        for (int i=1; i<=n; i++ ) {
            System.out.println("Tax payer #" + i + "data: ");
            System.out.println("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);

            System.out.println("Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.println("Anual income: ");
                double anualIncome = scanner.nextDouble();

            if (ch == 'i') {

                System.out.println("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.println("Number off employees: ");
                int numberOfEmployee = scanner.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployee));
            }
        }
        System.out.println("\nTAXES PAID: ");
        
        for (TaxPayer taxPayer : list){
            System.out.print(taxPayer.getName() + ": $  ");
            System.out.println(String.format("%.2f", taxPayer.tax()));
        }

        double sum = 0.0;
        for (TaxPayer taxPayer : list) {
                sum += taxPayer.tax();
        }
        System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
        scanner.close();
    }
}