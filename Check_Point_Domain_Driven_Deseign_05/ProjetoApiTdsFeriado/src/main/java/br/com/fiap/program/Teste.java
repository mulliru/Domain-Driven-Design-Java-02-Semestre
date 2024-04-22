package br.com.fiap.program;

import java.io.IOException;
import javax.swing.JOptionPane;
import br.com.fiap.model.Feriado;
import br.com.fap.service.ApiFeriadoService; 

public class Teste {

    public static void main(String[] args) throws IOException {
        ApiFeriadoService apiFeriadoService = new ApiFeriadoService();
        
        // Solicitar ao usuário que insira o ano através de um jop
        String ano = JOptionPane.showInputDialog("Informe o ano para pesquisa:");

        // Verificar se o usuário inseriu um ano
        if (ano != null && !ano.isEmpty()) {
            Feriado[] feriados = apiFeriadoService.getFeriados(ano);
            
            // Imprimir os feriados no console
            System.out.println("Feriados do ano " + ano + ":");

            for (Feriado feriado : feriados) {
                String[] partesData = feriado.getDate().split("-");
                String dataFormatada = partesData[2] + "/" + partesData[1] + "/" + partesData[0];
                System.out.println("- " + feriado.getName() + ": " + dataFormatada);
            }
        }
    }
}
