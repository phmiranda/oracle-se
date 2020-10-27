/**
 * Project: desenvolvedor
 * Date: 10/06/2020
 * User: phmiranda
 * Descrição: a classe Gerente extende da classe Funcionario e implementa a interface Autenticação (Contrato).
 */

package br.com.alura.funcionario;

public class Gerente extends Funcionario  implements Autenticavel {
    private final AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    // reescrita do método bonificação na classe mãe/genérica Funcionario.bonificacao().
    @Override
    public double getBonificacao() {
        System.out.println("Bonificação: GERENTE DE CONTA");
        return super.getSalario() * 0.1;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autentica(senha);
    }
}
