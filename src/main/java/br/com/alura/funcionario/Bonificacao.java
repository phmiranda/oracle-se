/**
 * Project: desenvolvedor
 * Date: 12/06/2020
 * User: phmiranda
 * Descrição:
 */

package br.com.alura.funcionario;

public class Bonificacao {
    private double soma;

    // recebe a bonificação referente a cada classe passada no parâmetro, pois ele pega o método específico de bonificação de cada classe.
    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
