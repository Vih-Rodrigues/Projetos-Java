/*
Programação Orientada a Objetos
Aula 04 - 04/03/2022
prog06
*/

import javax.swing.*;

public class prog06 {
    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, media = 0;
        String msg = "- Resultado -\n";

        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));

        media = (nota1 + nota2) / 2;

        if (media >= 7.0)
        {
            msg += "Média: " + media + "\nAprovado(a)! :D";
        }
        else
        {
            msg += "Média: " + media + "\nReprovado(a)! :(";
        }

        JOptionPane.showInputDialog(null, msg);
    }
}
