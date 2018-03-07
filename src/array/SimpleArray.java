package array;

public class SimpleArray
{

    public static double[] erstelleFeld(int laenge)
    {

        double[] ret = new double[laenge];

        for(int i = 0; i < laenge; i++)
        {
            ret[i] = Math.random() * 100;
        }

        return ret;
    }


    public static double minElement(double[] feld)
    {
        double ret = feld[0];

        for(double val : feld)
        {
            if(ret > val) {ret = val;}
        }

        return ret;
    }

    public static double maxElement(double[] feld)
    {
        double ret = feld[0];

        for(double val : feld)
        {
            if(ret < val){ret = val;}
        }

        return  ret;
    }

    public static void druckeFeld(double[] feld)
    {
        if(feld != null) {
            for (double val : feld) {System.out.println(val);}
        }
    }

    public static double berechneDurchschnitt(double[] feld)
    {
        double sum = 0;
        if(feld.length == 0){return 0;}
        for (double val : feld) {sum += val;}
        return sum / feld.length;
    }

    public static double bestimmeKleinstenAbstand(double[] feld)
    {
        double ret = 0;

        for(int i = 1; i < feld.length; i++)
        {
            double diff = Math.abs(feld[i] - feld[i-1]);
            if (diff < ret || i == 1) {ret = diff;}
        }
        return ret;
    }

    public static int berechneQuersumme(char[] zahl)
    {
        int ret = 0;

        for (char val : zahl)
        {
            ret += Character.getNumericValue(val);
        }
        return ret;
    }

    public static void sortArray (double[] feld)
    {
        double buffer;
        boolean isSorted;

        do {
            isSorted = true;

            for (int i = 1; i < feld.length; i++) {
                if (feld[i] < feld[i - 1])
                {
                    isSorted = false;
                    buffer = feld[i];
                    feld[i] = feld[i-1];
                    feld[i-1] = buffer;
                }
            }
        } while(!isSorted);
    }
}
