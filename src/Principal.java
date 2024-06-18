import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int option = 0;
        while (option !=8){

            System.out.println("*************************************************\n" +
                    "Sean bienvenidos al conversor de monedas\n\n" +
                    "1. Dollar a Peso Argentino\n" +
                    "2. Peso Argentino a Dollar\n" +
                    "3. Dollar a Real Brasilero\n" +
                    "4. Real Brasilero a Dollar\n" +
                    "5. Dollar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dollar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir");
            System.out.println("*************************************************");

            option = lectura.nextInt();
            lectura.nextLine();

            switch (option){
                case 1:
                    ConversorMoneda.conversor("USD", "ARS", consulta, lectura );
                    break;
                case 2:
                    ConversorMoneda.conversor("ARS", "USD", consulta, lectura );
                    break;
                case 3:
                    ConversorMoneda.conversor("USD", "BRL", consulta, lectura );
                    break;
                case 4:
                    ConversorMoneda.conversor("BRL", "USD", consulta, lectura );
                    break;
                case 5:
                    ConversorMoneda.conversor("USD", "COP", consulta, lectura );
                    break;
                case 6:
                    ConversorMoneda.conversor("COP", "USD", consulta, lectura );
                    break;
                case 7:
                    ConversorMoneda.convertirOtraMoneda(consulta, lectura);
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }





        }
    }
}



