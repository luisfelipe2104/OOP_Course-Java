package exer1;

public class Exer1 {

    public static void main(String[] args) {
        Aula aula1 = new Aula();
        aula1.likes = 5;
        aula1.titulo = "Aula de Java";
        aula1.descricao = "Aprenda Java";
        aula1.canal = "Guanabara";
        aula1.gostar();
        aula1.gostar();
        aula1.dislike();
        aula1.gostar();
        aula1.mostrarInfo();
    }
    
}
