
import static com.oracle.nio.BufferSecrets.instance;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pratica31 {

     static int diascorridos(Date d1, Date d2){
    return (int) ((d1.getTime() - d2.getTime())/(100*60*60*24)) ;
}
    public static void main(String[] args) {
     
       
        Date inicio= new Date();
        
    String nome = "FILIPE CABRAL ANTONIO";
    
        System.out.println(nome.toUpperCase());
        
        System.out.println(nome.toUpperCase().substring(14, 21)+", " + nome.toUpperCase().substring(0, 1)+ "." + nome.toUpperCase().substring(7, 8)  );
        
        SimpleDateFormat sdf= new SimpleDateFormat("d");
        
        GregorianCalendar dataNascimento= new GregorianCalendar(1990,2,26);
        GregorianCalendar hoje = new GregorianCalendar();
        
       int dia=GregorianCalendar.DAY_OF_MONTH;
        int tempo = diascorridos( hoje.getTime(),dataNascimento.getTime());
        System.out.println( "dias "+tempo);
        
        
        
        Date fim = new Date();
        long tempocorrido = (fim.getTime()-inicio.getTime())*1000*60*60*24;
        System.out.println(tempocorrido);
    }   
}
