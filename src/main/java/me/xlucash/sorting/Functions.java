package me.xlucash.sorting;

public class Functions {
    public static double avg(int[] array)
    {
        double sum = 0;
        double avg = 0;

        for(int i = 0; i<array.length; i++)
        {
            sum += array[i];
        }
        avg = (sum/array.length);

        return avg;
    }

    public static float median(int[] array)
    {
        int[] tempM = array;
        float med = 0;

        if(array.length%2==0)
        {
            float srel1 = tempM[(array.length/2)-1];
            float srel2 = tempM[(array.length/2)];
            med = (srel1+srel2)/2;
        }
        else
        {
            med = tempM[(array.length/2)];
        }
        return med;
    }

    public static int dominant(int[] array)
    {
        int[] numberOfAppear = new int[array.length];
        int[] dominants = new int[array.length];

        for(int i = 0; i<array.length; i++)
        {
            for(int j = 0; j<i; j++)
            {
                if(array[j]==array[i])
                {
                    numberOfAppear[j]++;
                    break;
                }
            }
        }

        int indexMaxNumberOfAppear = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(numberOfAppear[indexMaxNumberOfAppear]<numberOfAppear[i])
            {
                indexMaxNumberOfAppear = i;
            }
        }
        int maxNumberOfAppear = numberOfAppear[indexMaxNumberOfAppear];

        int l = 0;
        for(int i = 0; i<numberOfAppear.length; i++)
        {
            if(maxNumberOfAppear == numberOfAppear[i])
            {
                dominants[l] = array[i];
                l++;
            }
        }
        int dominantNumber = dominants[0];
        return dominantNumber;
    }
}
