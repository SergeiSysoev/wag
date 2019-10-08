package wag.Alogorithm;

public class ReversString {
    public static  String revers(String a){

        char[] array = a.toCharArray();
        char storage;
        for(int i = 0; i < array.length/2; i++){
            storage = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = storage;
        }
        String result = new String(array);
        return result;
    }
}
