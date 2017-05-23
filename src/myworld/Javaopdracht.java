/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myworld;

        
    
    
    
/**
 *
 * @author 010458
 */
public class Javaopdracht {
    
          /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int uitkomst = somFunctie(5,6);
        String begeleidendeTekst = "de uitkomst van 5+6 = ";
        
        printFunctie(begeleidendeTekst, uitkomst);
        
        
    }
    
    
    public static int somFunctie(int getal1, int getal2){
        int optelling = getal1+getal2;
        
        return optelling;
    }
    
    
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }
    
    
}


  