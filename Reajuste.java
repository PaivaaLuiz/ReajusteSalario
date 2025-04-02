import java.util.Scanner;

public class Reajuste {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float salario;
        int opcao;

        System.out.println("");
        System.out.println("Digite uma opcão: ");
        System.out.println("");
        System.out.println("1 - salário até R$ 280.00");
        System.out.println("2 - salário entre R$ 280.00 e R$ 700.00");
        System.out.println("3 - salário entre R$ 700.00 e R$ 1500.00");
        System.out.println("4 - salário acima de R$ 1500.00");

        System.out.print("Digite uma opção: ");
        opcao = scanner.nextInt();

        System.out.print("Informe exatamente seu salário: ");
        salario = scanner.nextFloat();

        float percentualAumento = 0;
        float valorAumento = 0;

        switch(opcao){
            case 1:
                percentualAumento = 0.20f;
                break;
            case 2:
                percentualAumento = 0.15f;
                break;
            case 3:
                percentualAumento = 0.10f;
                break;
            case 4:
                percentualAumento = 0.05f;
            default:
                System.out.print("Opção inválida!");
                return;
        }
        valorAumento  = salario * percentualAumento;
        float novoSalario = salario + valorAumento;
        float aumentoinflacao = valorAumento - (valorAumento * 0.038f);

        System.out.println("");
        System.out.println("Salário sem reajuste: " + salario);
        System.out.println("");
        System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("");
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("");
        System.out.println("Novo salário (com aumento): " + novoSalario);
        System.out.println("");
        System.out.println("Salário com descont da inflação: " + aumentoinflacao);

        scanner.close();
    }
}