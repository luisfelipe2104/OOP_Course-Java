package com.mycompany.projetopessoa;

public class Tecnico extends Aluno {
//  Atributos
    private int registroProfissional;
    
//  Metodos
    public void praticar() {
        System.out.println(this.nome + " esta praticando");
    }
    
//  Metodos Especiais
    public int getRegistroProfissional() {
        return this.registroProfissional;
    }
    
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
