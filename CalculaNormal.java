import java.util.Scanner;

public class CalculaNormal {
    public static void main(String[] args){

        Scanner teclado = new Scanner (System.in);

        int primeiroN = 0;
        int segundoN = 0;
        int res = 0;
        String simbolo;
        String resp;
        do {
            System.out.println("Digite o Primeiro Número: ");
            primeiroN = teclado.nextInt();
            System.out.println("Qual Conta Vocé quer fazer? [+ , - , * , /]: ");
            simbolo = teclado.next();
            if (simbolo != "+" || simbolo != "-" || simbolo != "*" || simbolo != "/"){
                System.out.println("Operação Invalida! ");
                System.exit(0);
            }
            System.out.println("Digite o Segundo Número: ");
            segundoN = teclado.nextInt();
            if (simbolo.equals("+")){
                res = primeiroN + segundoN;
            }
            if (simbolo.equals("-")){
                res = primeiroN - segundoN;
            }
            if (simbolo.equals("*")){
                res = primeiroN * segundoN;
            }
            if (simbolo.equals("/")){
                res = primeiroN / segundoN;
            }
            System.out.println("Resultado: " + res);
            System.out.println("Vocé quer Continuar? [S/N] ");
            resp = teclado.next();
        }while(resp.equals("S"));
        System.out.println("Conta Finalizada! ");

    }
}
