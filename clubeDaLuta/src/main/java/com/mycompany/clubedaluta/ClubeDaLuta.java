package com.mycompany.clubedaluta;

public class ClubeDaLuta {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Putscript", 
                                        "Brasil", 
                                        29, 
                                        1.68f, 
                                        57.8f, 
                                        14, 
                                        2, 
                                        3);
        
        l[1] = new Lutador("Snapshadow", 
                                        "EUA", 
                                        35, 
                                        1.65f, 
                                        80.9f, 
                                        12, 
                                        2, 
                                        1);
        
        l[2] = new Lutador("Nerdaart", 
                                        "EUA", 
                                        30, 
                                        1.81f, 
                                        105.7f, 
                                        12, 
                                        2, 
                                        4);
        
        l[3] = new Lutador("Pretty Boy", 
                                        "França", 
                                        31, 
                                        1.75f, 
                                        68.9f, 
                                        11, 
                                        2, 
                                        1);
        
        l[4] = new Lutador("DeadCode", 
                                        "Austrália", 
                                        28, 
                                        1.93f, 
                                        81.6f, 
                                        13, 
                                        0, 
                                        2);
        
        l[5] = new Lutador("UF0Cobol", 
                                        "Brasil", 
                                        37, 
                                        1.70f, 
                                        119.3f, 
                                        5, 
                                        4, 
                                        3);
        
//        l[0].apresentar();
//        l[0].ganharLuta();
//        l[0].status();
        
        Luta UFC1 = new Luta();
        UFC1.marcarLuta(l[0], l[3]);
        UFC1.lutar();
        System.out.println("");
        l[0].status();
        l[3].status();
    }
}
