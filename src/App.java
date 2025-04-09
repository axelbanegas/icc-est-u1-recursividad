public class App {
    public static void main(String[] args) throws Exception {
        
    }
    public int factorial(int n){
        if(n==0){
            System.out.println("Alcanze el caso base");
            return 1;
        }
        int result = n * factorial(n-1);
        System.out.println("Calculando faxctorial de: "+ n + "* factorias ("+(n-1)+")" );
        return result;
    }
}
