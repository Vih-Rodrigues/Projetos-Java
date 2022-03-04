/*
Programação Orientada a Objetos
Aula 04 - 04/03/2022
prog07
*/

import javax.swing.*;
import java.text.DecimalFormat; // biblioteca para uso da função DecimalFormat

public class prog07 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##"); // Função para limitar as casas decimais da nota informada

        float nota1 = 0, nota2 = 0, media = 0;
        String msg = "- Resultado -\n";

        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a primeira nota: "));

        media = (nota1 + nota2) / 2;

        if (media >= 7.0)
        {
                             //df.format formata a media para duas casas decimais
            msg += "Média: " + df.format(media) + "\nAprovado(a)! :D";
        }
        else
        {
            msg += "Média: " + df.format(media) + "\nReprovado(a)! :(";
        }

        JOptionPane.showInputDialog(null, msg);
    }
}
