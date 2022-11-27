package com.mycompany.projetopessoa;

// Aluno é uma especialização de pessoa
// Pessoa é uma generalização de pessoa
/// public final void or class impede q o metodo seja sobrescrito ou q uma classe seja tenha herdeiros

public class ProjetoPessoa {

    public static void main(String[] args) {
//      Pessoa p1 = new Pessoa();  // não pode instanciar uma classe abstrata
        
//      Visitante
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
//      Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
//      Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
//      Professor
        Professor p1 = new Professor();
        p1.setNome("Jubileu");
        p1.setSexo("M");
        p1.setIdade(16);
        p1.receberAum(500.00f);
        
//      Tecnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Jubileu");
        t1.setSexo("M");
        t1.setIdade(16);
        t1.praticar();
    }
}
