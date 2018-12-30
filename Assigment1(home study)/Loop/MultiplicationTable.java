public class MultiplicationTable{

    public static void main(String[] args) {

        int[][] multiplicationTable = new int[10][10];
        System.out.println("  Multiplication Table");

        for (int i = 1; i < multiplicationTable.length; i++) {
            for (int j = 1; j < multiplicationTable[0].length; j++) {
                multiplicationTable[i][j] = i * j;
            }
        }

        for (int i = 1; i < multiplicationTable.length; i++) {
            System.out.println();
            for (int j = 1; j < multiplicationTable[0].length; j++) {
                if((multiplicationTable[i][j] >= 1) && (multiplicationTable[i][j] <= 9)){
                    System.out.print("  "+multiplicationTable[i][j]);
                }else {
                    System.out.print(" "+multiplicationTable[i][j]);
                }

            }
            System.out.println();
        }
    }
}