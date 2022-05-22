package me.xlucash.sorting;

import org.w3c.dom.ranges.RangeException;

public class FindNumber {
    public static int findNumber(int wanted, int[] array)
    {
        try
        {
            for (int i = 0; 0 < array.length; i++)
            {
                if (array[i] == wanted)
                {
                    return i + 1;
                }
            }
            return -1;
        } catch (RangeException e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
        return 0;
    }
}
