package apieszka;
public class reversedStrings {

    /*
    A method to mirror single words
     */
    public static String solution(String str) {
        String [] result = str.split("");
        System.out.println(result.length);
        String [] new_result = new String[result.length];
        String rts = "";
        for (int i=0; i<result.length; i++){
            new_result[result.length-1-i] = result[i];
        }
        for (int j=0; j<new_result.length; j++){
            rts = rts + new_result[j];
        }
        return rts;
    }
}
