public class Paziente extends Persona //implements Comparable<String> 
{
   // private String nome;
    // private String cognome;
    private int priorita;
    private int identificativo;
    
    
      public Paziente(String nome, String cognome, int priorita, int identificativo) 
      {
        super.nome = nome;
        super.cognome = cognome;
        this.priorita = priorita;
        this.identificativo = identificativo;
   	  } 
 
      
      public int getPriorita()
      {
          return priorita;
      }
      
      public int getIdentificativo()
      {
          return identificativo;
      }
      
           
      public  String getNome()
      {
      return nome;
      }
    
    
      public String getCognome()
      {
          return cognome;
      }
     
     
        
       
  }
