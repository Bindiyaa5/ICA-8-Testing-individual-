import java.io.IOException;

public class urinals {
//author - Bindiya Vundavalli (bvundav1)

    public static void main(String[] args) throws IOException {

        getString("110001");
        countUrinals("110001");

    }
    public static Boolean getString( String s ) {

        System.out.println("checks to see if the given string is valid");
        s ="";
        if(s == "valid")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int countUrinals( String s){

        System.out.println("returns the number of urinals that can be used");
        int numOfUrinals = -1;
        if(getString("") == true ){
            System.out.println("Implementation of counting the number of urinals that can be used");
            return numOfUrinals;
        }
        else{
            return numOfUrinals;
        }
    }

}


