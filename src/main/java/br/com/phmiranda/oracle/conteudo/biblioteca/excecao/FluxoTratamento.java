/**
 * Project: oracle-se
 * Task/User History: 64
 * Description: Descrição resumida da história de usuário/tarefa e código de identificação (GRUPOCDC-64)
 * User: phmiranda
 */

package br.com.phmiranda.oracle.conteudo.biblioteca.excecao;

public class FluxoTratamento {
    public static void main(String[] args) {
        System.out.println("------ Início do Main ------");
        //metodo1();
        try{
            metodo1();
        }catch (ArithmeticException | NullPointerException exception) {
            System.out.println("" + exception.getMessage());
            exception.printStackTrace();
        }
        System.out.println("------ Fim do Main ------");
    }

    private static void metodo1() {
        System.out.println("------ Início do Método 01 ------");
        metodo2();
        System.out.println("------ Fim do Método 01 ------");
    }

    private static void metodo2() {
        System.out.println("------ Início do Método 02 ------");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            Conta conta = null;
            conta.deposita();
        }
        System.out.println("------ Fim do Método 02 ------");
    }
}
