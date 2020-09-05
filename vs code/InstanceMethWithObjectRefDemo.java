//Use an instance method reference with different objects.

//A functional interface that takes two references arguments and returns a boolean result.
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

// A class that stores the temperature high for a day.
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    // Return true if the invoking HighTemp object has the same temperature as ht2.
    boolean sameTemp(HighTemp ht2) {
        return ht2.hTemp == hTemp;
    }

    //Return true if the invoking HighTemp object has a temperature that is less than ht2.
    boolean lessThanTemp(HighTemp ht2) {
        return ht2.hTemp > hTemp;
    }
}

class InstanceMethWithObjectRefDemo {

    // A method that returns the number of occurences of an object for which some 
    // criteria, as specified by the MyFunc parameter, is true.
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i=0; i< vals.length; i++)
            if(f.func(vals[i], v)) count++;
        
        return count;
    }

     public static void main(String[] args) {
        int count;

        //Create an array of HighTemp objects.
        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90),
                                    new HighTemp(89), new HighTemp(89), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83), new HighTemp(89)};
        
        //Use counter() with arrays of the class HighTemp. Notice that a reference to the 
        //instance method sameTemp() is passed as the second argument.

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));

        System.out.println(count + " days had a high of 89.");

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));

        System.out.println(count + " days had a high of less than 89.");

    }
}