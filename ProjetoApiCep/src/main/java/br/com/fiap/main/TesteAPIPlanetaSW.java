package br.com.fiap.main;

import javax.swing.JOptionPane; // Importar a classe JOptionPane

import br.com.fiap.model.Planeta;

public class TesteAPIPlanetaSW {

    public static void main(String[] args) {
        // Instanciar objetos

        PlanetaSWService planetaService = new PlanetaSWService(); 

        String p = JOptionPane.showInputDialog("Informe o número do planeta para a pesquisa"); 

        Planeta planeta = planetaService.getPlaneta(p);

        System.out.println(planeta);
    }

}
