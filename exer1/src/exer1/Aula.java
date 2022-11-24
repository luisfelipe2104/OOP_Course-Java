/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer1;

/**
 *
 * @author user
 */
public class Aula {
    int duracao;
    int likes;
    boolean liked;
    String titulo;
    String descricao;
    String canal;
    
    void gostar() {
        if(!liked){
            this.likes ++;
            this.liked = true;
            System.out.println("Você curtiu o video");
        } else {
            System.out.println("Você já curtiu o video, pontanto nâo pode curtir novamente");
        }
    }
    
    void dislike() {
        System.out.println("Você não curtiu o video");
        this.likes --;
        this.liked = false;
    }
    
    void mostrarInfo() {
        System.out.println("titulo: " + this.titulo);
        System.out.println("likes: " + this.likes);
        System.out.println("canal: " + this.canal);
    }
}
