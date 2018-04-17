import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pratica31 {

    private static Date inicio = new Date();
    private static String meuNome = "Filipe Cabral Antonio";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1999, Calendar.NOVEMBER, 22);
    private static Date fim;

    public static void main(String[] args) {
        String ultimoNome;
        String resultado = "";
        System.out.println(meuNome.toUpperCase());
        ultimoNome = meuNome.substring(meuNome.indexOf(' ') + 1);
        resultado = resultado + meuNome.toUpperCase().charAt(0) + '.' + ' ';
        while (ultimoNome.indexOf(' ') != -1) {
            resultado = resultado + ultimoNome.toUpperCase().charAt(0) + '.' + ' ';
            ultimoNome = ultimoNome.substring(ultimoNome.indexOf(' ') + 1);
        }
        ultimoNome = ultimoNome.toUpperCase().charAt(0) + ultimoNome.substring(1).toLowerCase();
        resultado = ultimoNome + ',' + ' ' + resultado;
        System.out.println(resultado);
        long nascimentoMs;
        long atualMs;
        GregorianCalendar atual = new GregorianCalendar();
        nascimentoMs = dataNascimento.getTime().getTime();
        atualMs = atual.getTime().getTime();
        System.out.println((atualMs - nascimentoMs) / 86400000);
        fim = new Date();
        System.out.println(fim.getTime() - inicio.getTime());
    }

}