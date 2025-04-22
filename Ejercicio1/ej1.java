
public class ej1{

    public static void main(String[] args) {
        String [] array_string = new String[25];
        
        try {
            System.out.println (array_string[3].length());
        } catch (NullPointerException e) {
            System.out.println("No puedes mostrar array_string[3] porque esta vacio.");
        }
    }
}