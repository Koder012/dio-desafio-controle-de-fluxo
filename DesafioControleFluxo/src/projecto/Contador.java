package projecto;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int primeiroNumero, segundoNumero;

        System.out.print("Digite o primeiro parametro:");
        primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo parametro:");
        segundoNumero = scanner.nextInt();

        try{
            contador(primeiroNumero, segundoNumero);

        }catch(ParametrosInvalidosException exception){
            exception.printStackTrace();
        }finally{
            scanner.close();
        }
    }
    public static void contador(int primeiroParametro, int segundoParametro)throws ParametrosInvalidosException{
        
        if(segundoParametro > primeiroParametro){
            int contador = segundoParametro - primeiroParametro;
            for( int i = 1; i <= contador; i++){
                System.out.printf("\nImprimindo o número %d",i);
            }
        }else
            throw new ParametrosInvalidosException();

    }
}
