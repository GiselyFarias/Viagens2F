import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Classe Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();

        //Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");

        //Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null,retorno);


    }
}