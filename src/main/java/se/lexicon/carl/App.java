package se.lexicon.carl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hallo Wurld! from Carl.");

        int inputSeconds = 86399;
        int excess = inputSeconds % 3600;
        int hours = (inputSeconds - excess)/3600;
        int minutes = excess % 60;
        int seconds = minutes % 60;

        System.out.println(hours + "." + minutes + ":" + seconds);
    }
}
