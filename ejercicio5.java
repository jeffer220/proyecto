import java.util.Scanner;

/**
 * Esta clase se encarga de calcular la cantidad de horas trabajadas y el sueldo semanal
 * @author Jefferson Pirir
 * @since 31/07/2024
 */

public class ejercicio5 {
        public static void main(String[] args) {
         /*Se declara la variable Scan para obtener datos de la linea de comandos */
         Scanner scan = new Scanner (System.in);
         //Se declara la variable pagoPorHora para almacenar el monto de pago
         int pagoPorHora = scan.nextInt();
         //En las siguientes 7 variables se almacena el valor de las horas trabajadas
         int horasDia1 = scan.nextInt();
         //se almacenan las horas individuales
         int horasDia2 = scan.nextInt();
         int horasDia3 = scan.nextInt();
         int horasDia4 = scan.nextInt();
         int horasDia5 = scan.nextInt();
         int horasDia6 = scan.nextInt();
         int horasDia7 = scan.nextInt();
         //En horasTotales se hace la sumatoria de las horas laboradas durante la semana
         int horasTotales = horasDia1 + horasDia2 + horasDia3 + horasDia4 + horasDia5 + horasDia6 + horasDia7;
         //Definimos la variable para calcular el pago total
         int pagoSemanal = horasTotales * pagoPorHora;
         //Se muestra el pago semanal del empleado
         System.out.println("El pago semanal es de " + pagoSemanal);
    }
}