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
    };


    public static double minElement(double[] feld)
    {
        double ret = feld[0];

        for(int i = 1; i < feld.length; i++)
        {
            if(feld[i] < ret)
            {
                ret = feld[i];
            }
        }

        return ret;
    };

    public static double maxElement(double[] feld)
    {
        double ret = feld[0];

        for(int i = 1; i < feld.length; i++)
        {
            if(feld[i] > ret)
            {
                ret = feld[i];
            }
        }

        return  ret;
    };

    public static void druckeFeld(double[] feld)
    {
        if(feld != null) {
            for (int i = 0; i < feld.length; i++) {
                System.out.println(feld[i]);
            }
        }
    };

    public static double berechneDurchschnitt(double[] feld)
    {
        double sum = 0;

        for(int i = 0; i < feld.length; i++)
        {
            sum += feld[i];
        }

        if(feld.length != 0)
        {
            return sum / feld.length;
        }
        else
        {
            return 0;
        }
    }

    public static double bestimmeKleinstenAbstand(double[] feld)
    {
        double ret = 0;

        for(int i = 1; i < feld.length; i++)
        {
            double diff = 0;

            if(feld[i] > feld[i-1])
            {
                diff = feld[i] - feld[i-1];
            }else{
                diff = feld[i-1] - feld[i];
            }

            if(i == 1){ret=diff;};

            if(diff < ret)
            {
                ret = diff;
            }
        }
        return ret;
    }

    public static int berechneQuersumme(char[] zahl)
    {
                int ret = 0;

        for (int i = 0; i < zahl.length; i++)
        {
            ret += ((int) zahl[i]) - 48;
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
        }
        while(!isSorted);
    }
}
