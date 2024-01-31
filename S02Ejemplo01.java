public class S02Ejemplo01 {
    public static void main(String[] args) {
        // Este es un comentario de una sola línea

        /*
         * Este es otro comentarios de múltiples líneas
         * de código, se usa cuando tengo un conjunto
         * de líneas que quiero comentar, importante, ver el inicio
         * y el final del comentario
         */

        // Declaración de las variables (paso 01)
        double numero1, numero2, numero3, suma, multiplicacion;

        // Entradas (solicitar al usuario las entradas)
        numero1 = Utils.leerDoble("Digite el primer valor: ");
        numero2 = Utils.leerDoble("Digite el segundo valor: ");
        numero3 = Utils.leerDoble("Digite el tercer valor: ");

        // Procesar los valores
        suma = numero1 + numero2 + numero3;
        multiplicacion = numero1 * numero2 * numero3;

        // Salidas (mostrar al usuario las salidas)
        //sout - enter
        // El signo de suma es concatenar, sirve para pegar dos
        // valores para que lo imprima en una sola línea
        Utils.establecerColor(Color.VERDE);
        System.out.println("La suma es " + suma);
        System.out.println("La multiplicación es " + multiplicacion);
        Utils.reestablecerColores();

    }
}
