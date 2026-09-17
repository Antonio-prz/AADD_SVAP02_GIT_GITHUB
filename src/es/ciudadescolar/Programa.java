package es.ciudadescolar;
import es.ciudadescolar.utils.MessageManager;

public class Programa {
    public static void main(String[] args) throws Exception {
        MessageManager mm = new MessageManager();

        System.out.println(mm.getSaludo());
    }
}
