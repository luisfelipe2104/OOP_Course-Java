package com.mycompany.exemplobanco;

//conta corrente + 50$
//conta poupança + 150$

public class contaCorrente {
    public int numConta;
    protected String tipo;   // Cc = conta corrente & Cp = conta poupança
    private String dono;
    private float saldo;
    private boolean status;
    //----------------------------------------------------------------------------
    public contaCorrente(String dono) {
        this.saldo = 0;
        this.status = false;
        this.dono = dono;
    }
    //----------------------------------------------------------------------------
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.tipo == "Cc") {
            this.setSaldo(this.getSaldo() + 50);
            System.out.println("Você criou uma conta corrente");
        } 
        else if (this.tipo == "Cp") {
            this.setSaldo(this.getSaldo() + 150);
            System.out.println("Você criou uma conta poupança");
        }
    }
    
    //----------------------------------------------------------------------------
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Você não pode fechar a conta, pois ainda possui dinheiro depositado, retire todo seu dinheiro para poder fecha-la");
        }
        else if (this.saldo < 0) {
            System.out.println("Você não pode fechar a conta, pois está devendo dinheiro, pague essa divida e poderá fechar sua conta");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso, volte sempre");
        }
    }
    
    //----------------------------------------------------------------------------
    public void depositar(float quant) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + quant);
            System.out.println("Você depositou " + quant + "R$");
        }
    }
    
    //----------------------------------------------------------------------------
    public void sacar(float quant) {
        if (this.getStatus()) {
            if (this.saldo == 0) {
                System.out.println("Você não pode retirar dinhero, pois não possui dinhero em sua conta");
            }
            else if (quant <= this.saldo) {
                this.setSaldo(getSaldo() - quant);
                System.out.println("Você sacou " + quant + "R$");
            } 
            else {
                System.out.println("Você não pode retirar dinhero, pois está endividado, pague sua divida fiote!!!");
            }
            
        }
    }
    
    //----------------------------------------------------------------------------
    public void pagarMensal() {
        float valor = 0;
        if (this.tipo == "Cc") {
            valor = 12;
        }
        else if (this.tipo == "Cp") {
            valor = 20;
        }
        if(getStatus()) {
            if(this.getSaldo() > valor) {
                this.setSaldo(getSaldo() - valor);
                System.out.println("Você pagou sua mensalidade");
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }
    
    //----------------------------------------------------------------------------
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    //----------------------------------------------------------------------------
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //----------------------------------------------------------------------------
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //----------------------------------------------------------------------------
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    //----------------------------------------------------------------------------
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
