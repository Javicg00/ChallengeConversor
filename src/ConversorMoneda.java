import java.util.Scanner;

public class ConversorMoneda {

    public static void conversor(String monedaBase, String monedaObjetivo, ConsultarMoneda consultarMoneda, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consultarMoneda.monedas(monedaBase, monedaObjetivo);
        System.out.println("La tasa de conversion para hoy\n1 "+monedaBase+" = "+monedas.conversion_rate()+" "+monedaObjetivo);
        System.out.println("Ingrese la cantidad de " +monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad +" "+monedas +" = " +cantidadConvertida + " " + monedas.target_code());
    }

    public static void  convertirOtraMoneda(ConsultarMoneda consultarMoneda, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        conversor(monedaBase, monedaObjetivo, consultarMoneda, lectura);

    }

}
