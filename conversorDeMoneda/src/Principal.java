import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 8){
            System.out.println("-----------------------------------------------\n");
            System.out.println("""
                    Conversor de moneda
                    Ingrese la conversión que desea realizar, escogiendo una de las siguientes opciones
                    
                    1. Dolar a peso Colombiano.
                    2. Peso colombiano a dolar.
                    3. Dolar a real Brasileño.
                    4. Real Brasilño a Dolar.
                    5. Dolar a peso Argentino.
                    6. Peso Argentino a dolar.
                    7. Convertir otra moneda.
                    8. Salir.
                    """);
            System.out.println("-------------------------------------------------\n");
                 opcion = teclado.nextInt();
                 teclado.nextLine();

                 switch (opcion){
                     case 1:
                         ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                         break;
                     case 2:
                         ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                         break;
                     case 3:
                         ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                     break;
                     case 4:
                         ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                     break;
                     case 5:
                         ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                         break;
                     case 6: ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                     break;
                     case 7:
                         ConvertirMoneda.convertirOtraMoneda(consulta, teclado);
                         break;
                     case 8:
                         System.out.println("Saliendo ");
                         break;
                     default:
                         System.out.println("Opsss.. Opción invalida");
                         break;



                 }
        }


    }
}
