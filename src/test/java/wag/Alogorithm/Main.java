package wag.Alogorithm;

public class Main {
    public static void main(String[] args) {

        /*String res = revers("apple");
        System.out.println(res);*/
//
//        String res = ReversString.revers("apple");
//        System.out.println(res);


  /*  public static  String revers(String a){

        char[] array = a.toCharArray();
        char storage;
        for(int i = 0; i < array.length/2; i++){
            storage = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = storage;
        }
        String result = new String(array);
        return result;
    }*/


        int a[] = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = i +1;
        }

        for(int i = 0; i<a.length; i++){
//            System.out.println(a[i] + " ");
        }
        FizzBass.fizzBass(a);
    }
}

