package me.xlucash.sorting;

import org.w3c.dom.ranges.RangeException;

public class FindNumber {
    public static int findNumber(int wanted, int[] array)
    {
        int start = 0;
        int end = array.length-1;
        int avg = 0;

        try
        {
            while(start<=end)
            {
                avg = (start+end)/2;
                if(wanted == array[avg])
                {
                    return avg +1;
                }
                else
                if(wanted>array[avg])
                {
                    start+=avg+1;
                } else if(wanted<array[avg])
                {
                    end = avg-1;
                }
            }
        } catch (RangeException e)
        {
            System.out.println("Błąd: "+e.getMessage());
        }
        return 0;
    }
}
