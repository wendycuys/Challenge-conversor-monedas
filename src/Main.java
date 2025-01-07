import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String apiKey = ConfigLoader.getApiKey();
        ExchangeRateService exchangeRateService = new ExchangeRateService(apiKey);
        CurrencyConverter currencyConverter = new CurrencyConverter(exchangeRateService);

        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            double cantidad = 0;

            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Ingrese la cantidad que desea convertir:");
                cantidad = scanner.nextDouble();
            }

            switch (opcion) {
                case 1:
                    convertir(currencyConverter, "USD", "ARS", cantidad);
                    break;
                case 2:
                    convertir(currencyConverter, "ARS", "USD", cantidad);
                    break;
                case 3:
                    convertir(currencyConverter, "USD", "BRL", cantidad);
                    break;
                case 4:
                    convertir(currencyConverter, "BRL", "USD", cantidad);
                    break;
                case 5:
                    convertir(currencyConverter, "USD", "COP", cantidad);
                    break;
                case 6:
                    convertir(currencyConverter, "COP", "USD", cantidad);
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Convertir de Dólar a Peso Argentino");
        System.out.println("2. Convertir de Peso Argentino a Dólar");
        System.out.println("3. Convertir de Dólar a Real Brasileño");
        System.out.println("4. Convertir de Real Brasileño a Dólar ");
        System.out.println("5. Convertir de Dólar a Peso Colombiano");
        System.out.println("6. Convertir de Peso Colombiano a Dólar");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void convertir(CurrencyConverter converter, String from, String to, double amount) {
        try {
            double resultado = converter.convert(from, to, amount);
            System.out.printf("La conversión de %.2f %s a %s es: %.2f%n", amount, from, to, resultado);
        } catch (Exception e) {
            System.out.println("Error durante la conversión: " + e.getMessage());
        }
    }
}
