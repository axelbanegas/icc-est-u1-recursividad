public class App {
    public static void main(String[] args) throws Exception {
        int n= 5;
        int resultadofinal = factorial(n);
        //System.out.println("El resultado final es: " + resultadofinal);

        EjerciciosRecursivos fibonacci =  new EjerciciosRecursivos();
        int resultado = fibonacci.fibonacci(n);
        System.out.println("El resultado de la serie fibonacci es: " + resultado);
    }
    public static int factorial(int n){
        if(n==0){
            System.out.println("Alcanze el caso base");
            return 1;
        }
        int result = n * factorial(n-1);
        System.out.println("Calculando faxctorial de: "+ n + "* factorias ("+(n-1)+")" );
        return result;
    }
}
