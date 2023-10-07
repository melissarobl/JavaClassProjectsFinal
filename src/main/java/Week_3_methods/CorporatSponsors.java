package Week_3_methods;

import java.util.Arrays;

public class CorporatSponsors {
    public static void main(String[] args) {
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};
        //modify array, make strings uppercase
        //don't make a new array, modify one you already have
        for (int i = 0; i < sponsors.length; i++ ) {
            System.out.println(sponsors[i]); //sponsors[i] is one element in the array, one after the other
            String sponsor = sponsors[i]; //a string called sponsor is equal to each element in the sponsors array
            sponsor = sponsor.toUpperCase();  //overwriting with uppercase version
            sponsors[i]  = sponsor; //put back into array in same position
            //alternative code:  sponsors[i] = sponsors[i].toUpperCase(); instead of lines 12-14
        }
        System.out.println(Arrays.toString(sponsors));

    }
}
