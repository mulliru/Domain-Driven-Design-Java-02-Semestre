package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane; // Importar a classe JOptionPane

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Planeta;
import br.com.fiap.services.PlanetaSWService;

public class TesteAPIPlanetaSW {

    public static void main(String[] args) throws ClientProtocolException, IOException {
        // Instanciar objetos

        PlanetaSWService planetaService = new PlanetaSWService(); 

        String p = JOptionPane.showInputDialog("Informe o número do planeta para a pesquisa"); 

        Planeta planeta = planetaService.getPlaneta(p);

        System.out.println(planeta);
    }

}
