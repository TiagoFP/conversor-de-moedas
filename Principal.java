import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversao c = new Conversao();
        Valor v = new Valor();

        System.out.println("Escolha uma opção:");
        System.out.println("Opção 1: USD - Dolar Americano");
        System.out.println("Opção 2: CAD - Dolar Canadense");
        System.out.println("Opção 3: EUR - Euro");
        System.out.println("Opção 4: GBP - Libra Esterlina");
        System.out.println("Opção 5: CHF - Franco Suiço");
        System.out.println("Opção 6: UYU - Peso Uruguaio");
        System.out.println("Opção 7: ARS - Peso Argentino");
        System.out.println("Opção 8: THB - Baht");
        System.out.println("Opção 9: JPY - Iene");
        System.out.println("Opção 10: CNY - Yuan");
        
        System.out.println("Digite uma opção: ");
        c.opcao = sc.nextInt();

        switch (c.opcao) {
            case 1:
                c.moeda = "USD";
                break;
            case 2:
                c.moeda = "CAD";
                break;
            case 3:
                c.moeda = "EUR";
                break;
            case 4:
                c.moeda = "GBP";
                break;
            case 5:
                c.moeda = "CHF";
                break;
            case 6:
                c.moeda = "UYU";
                break;
            case 7:
                c.moeda = "ARS";
                break;
            case 8:
                c.moeda = "THB";
                break;
            case 9:
                c.moeda = "JPY";
                break;
            case 10:
                c.moeda = "CNY";
                break;
        }
        System.out.print("Digite um valor em BRL: R$");
        double valor = sc.nextDouble();

        Double novoValor = c.Converter(valor, "BRL");

        System.out.printf("O valor em %s é: %.2f", c.moeda, novoValor);
    }
}
