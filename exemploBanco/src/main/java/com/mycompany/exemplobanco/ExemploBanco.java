package com.mycompany.exemplobanco;

public class ExemploBanco {

    public static void main(String[] args) {
        contaCorrente c1 = new contaCorrente("Luis");
        c1.abrirConta("Cp");
        c1.fecharConta();
        c1.depositar(100);
        
        c1.sacar(240);
        c1.pagarMensal();
        System.out.println(c1.getSaldo());
    }
}
