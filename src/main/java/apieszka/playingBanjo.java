package apieszka;


//This is a program telling user whether he/she can play Banjo (depending on their name)
public class playingBanjo {
    public static String areYouPlayingBanjo(String name) {
        String [] nameInChars = name.split("");
        String result = new String("");
        if(nameInChars[0].contains("R")||nameInChars[0].contains("r")){
            result = name + " plays banjo";
        }
        else{
            result = name +" does not play banjo";
        }
        return result;
    }
}
