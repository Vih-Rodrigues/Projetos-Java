/*
Programação Orientada a Objetos
Aula 04 - 04/03/2022
prog05v3
*/

import javax.swing.*;

public class prog05v3 {
    public static void main(String[] args) {
        String texto = "Programacao Orientada a Objetos";
        String texto2 = texto.replace("Orientada a Objetos", "OO");
        String msg = "";

        msg = "Tamanho: " + texto.length() + "\n" +
                "Maiusculo: " + texto.toUpperCase() + "\n" +
                "Posicao de 'Orientada': " + texto.indexOf("Orientada") + "\n" +
                "Nova string: " + texto2;

        JOptionPane.showMessageDialog(null, msg.concat("\n\nFim da mensagem"));
    }
}
