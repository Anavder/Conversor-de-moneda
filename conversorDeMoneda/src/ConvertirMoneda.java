import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase,
                                 String monedaTarget,
                                 ConsultarMoneda consulta,
                                 Scanner teclado) {
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Tasa de conversion para hoy\n1" + monedaBase + " = " +
                moneda.tasaDeCambio() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de moneda a convertir: " + monedaBase);
        cantidad= Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad + moneda.tasaDeCambio();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + moneda.targetCode());

    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner teclado){
        System.out.println("Ingrese la moneda base: ");
        String monedaBase = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda a la que quiere convertir: ");
        String monedaObjetivo = teclado.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, teclado);

    }

}
