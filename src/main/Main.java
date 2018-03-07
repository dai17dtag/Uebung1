package main;
import array.SimpleArray;

public class Main
{
    public static void main(String[] args)
    {

        int number = 1189866123;

        double[] testArray = SimpleArray.erstelleFeld(10);
        SimpleArray.druckeFeld(testArray);

        System.out.println(SimpleArray.minElement(testArray));
        System.out.println(SimpleArray.maxElement(testArray));
        System.out.println(SimpleArray.berechneDurchschnitt(testArray));
        System.out.println(SimpleArray.bestimmeKleinstenAbstand(testArray));
        System.out.println(SimpleArray.berechneQuersumme(Integer.toString(number).toCharArray()));
    }
}
