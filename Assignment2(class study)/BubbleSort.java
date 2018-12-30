public class BubbleSort{

    public static void main(String[] args){
        int[] number = {8,5,3,2,9,11,1,54,3,14,11,23,4,6};
        boolean flag = false;

        while (flag == false){
            flag = true;
            for(int i = 0; i < number.length - 1; i++){
                int tmp;
                if(number[i] > number[i+1]){
                    tmp = number[i+1];
                    number[i+1] = number[i];
                    number[i] = tmp;
                    flag = false;
                }
            }
        }

        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]+" ");
        }

    }


}