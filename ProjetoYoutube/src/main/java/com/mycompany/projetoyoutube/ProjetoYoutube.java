package com.mycompany.projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Python");
        v[2] = new Video("Aula 18 de Javascript");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar(87.0f);
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar();
        
        System.out.println("VIDEOS\n-----------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\nGAFANHOTOS\n-----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}
