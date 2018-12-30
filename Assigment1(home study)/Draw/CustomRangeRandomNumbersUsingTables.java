public class CustomRangeRandomNumbersUsingTables{

public static void main(String[] args){

    int[] table = new int[49];

    for(int i = 0; i < table.length; i++){
        table[i] = (int) (Math.random()*49);
    }

    int[] table6 = new int[6];
    for(int i = 0; i < table6.length; i++){
        table6[i] = table[(int) (Math.random()*49)];
    }

    System.out.println("Random 49 numbers: ");
    for(int num: table){
        System.out.print(num+" ");
    }

    System.out.println();
    System.out.println("Random 6 numbers have generated from" +
            " 49 random numbers");
    for(int num: table6){
        System.out.print(num + " ");
    }
}



}