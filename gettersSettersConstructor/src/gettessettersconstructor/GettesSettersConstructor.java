package gettessettersconstructor;

public class GettesSettersConstructor {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        Caneta c2 = new Caneta("BIC", "Verde", 0.7f);
        
//        c1.setModelo("BIC");  // metodo acessor
//        c1.modelo = "BIC";    // outro maneira de acesso menos indicada
        
//        c1.setPonta(0.5f);
//        c1.ponta = 0.7f;
        
        c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c2.status();
    }
    
}
