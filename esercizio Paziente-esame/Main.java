import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

            Paziente paz1 = new Paziente("Mario", "Rossi", 3, 1);
            Paziente paz2 = new Paziente("Marco", "Verdi", 2, 2);
            Paziente paz3 = new Paziente("Andrea", "Bianchi", 5, 3);
            Paziente paz4 = new Paziente("Simone", "Ferrari", 6, 4);
            Paziente paz5 = new Paziente("Davide", "Blu", 1, 5);
            
           System.out.println(paz1.getNome());
           System.out.println(paz1.getCognome());
           System.out.println("Priorita: " + paz1.getPriorita());
           System.out.println("Identificativo: " + paz1.getIdentificativo());
           
           List<Paziente> lista = new ArrayList<Paziente>();
           lista.add(paz1);
           lista.add(paz2);
           lista.add(paz3);
           lista.add(paz4);
           lista.add(paz5);
           
           System.out.println(lista);
           
           Comparator<Paziente> comparatorePriorita = Comparator.comparingInt(Paziente::getPriorita);
           
            Collections.sort(lista, comparatorePriorita);
            
             for (Paziente pz : lista) 
             {
            System.out.println(pz.getNome() + " - " + pz.getPriorita());
             }
            
            Esame cardiaco = new Esame(10,2);
            Esame dentale = new Esame(20,1);
            Esame radiologico = new Esame(30,5);
            Esame sangue = new Esame(40,4);
            Esame checkup = new Esame(50,3);
            Esame urine = new Esame(60,3);
            Esame stomaco = new Esame(70,5);
            Esame fegato = new Esame(80,1);
            Esame venoso = new Esame(90,2);
            Esame tac = new Esame(100, 3);
            
            List<Esame> listaEsami = new ArrayList<Esame>();
            listaEsami.add(cardiaco);
            listaEsami.add(dentale);
            listaEsami.add(radiologico);
            listaEsami.add(sangue);
            listaEsami.add(checkup);
            listaEsami.add(urine);
            listaEsami.add(stomaco);
            listaEsami.add(fegato);
            listaEsami.add(venoso);
            listaEsami.add(tac);
            
          /*  HashMap<Integer, Integer> esame_paziente = new HashMap<Integer, Integer>();
            esame_paziente.put(10,2);
            esame_paziente.put(20,1);
            esame_paziente.put(30,5);
            esame_paziente.put(40,4);
            esame_paziente.put(50,3);
            
            for (int i : esame_paziente.keySet())
            {
                System.out.println("esame: " + i + " paziente: " + esame_paziente.get(i));
            }   */
            
            HashMap<Integer, Integer> esame_paziente = new HashMap<Integer, Integer>();
          //  int numeroEsami = 
         for (Paziente paz : lista)
         {
             esame_paziente.put(paz.getIdentificativo(), 0 ); //hashmap ora (1,0)(2,0),ecc...
         }
         
         for (Esame esa : listaEsami)
         {
             if (esame_paziente.get(esa.getIdentificativo_paziente()) >= 0) //ora valori settati a 0
             {
                 int numeroEsami = esame_paziente.get(esa.getIdentificativo_paziente()) + 1;
                 esame_paziente.put(esa.getIdentificativo_paziente(), numeroEsami);
             }
              
         }
         for (int i : esame_paziente.keySet())
         {
             System.out.println("identificativo paziente: " + i + " numero esami: " + esame_paziente.get(i));
         }
         

    }
}    
       