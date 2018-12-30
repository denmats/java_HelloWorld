public class RandomRangeWithoutRedundancies{

    public static void main(String[] args){

        int[] tab49 = new int[49];
        int[] tab6 = new int[6];
        boolean[] tabFlag = new boolean[6];

        //Fill tab49 with random numbers from 0 to 48;
        for(int i = 0; i < tab49.length; i++){
            tab49[i] = (int) (Math.random()*49);
        }


        int flag = 0;
        while (flag == 0) {
            //Generate six random range from tab49
            for (int i = 0; i < tab6.length; i++) {
                tab6[i] = tab49[(int) (Math.random() * 49)];
            }

            //Check up each element of tab6 for repeating
            for (int i = 0; i < tab6.length; i++) {
                int f = 0;
                for (int i1 : tab6) {
                    if (tab6[i] == i1) {
                        f++;
                    }
                }
                if (f > 1) {
                    tabFlag[i] = false;
                } else tabFlag[i] = true;
            }

            //is there element equal 'false' in tabFlag
            for (boolean f : tabFlag) {
                if (f) {
                   flag = 1;
                }else{
                    flag = 0;
                    break;
                }
            }
        }

        //Display results
        for(int el : tab49){
            System.out.print(el + " ");
        }


        System.out.println();
        for(boolean el : tabFlag){
            System.out.print(el + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Six random numbers, non-duplicating, from tab49");
        for(int el : tab6){
            System.out.print(el + " ");
        }


    }
}






//        int[] tab6 = new int[6];
//        table6[0] = table[(int) (Math.random()*49)];
//
//        for(int i = 1; i < table6.length; i++){
//            table6[i] = table[(int) (Math.random()*49)];
//
//            for(int j = i; j <= 0; j--) {
//                if(table6[i] == table6[j]){
//                    while(table6[i] == table6[j])
//                    {
//                        table6[i] = table[(int) (Math.random() * 49)];
//                    }
//                }
//            }
//        }
//
//        System.out.println("Random 49 numbers: ");
//        for(int num: table){
//            System.out.print(num+" ");
//        }
//
//        System.out.println();
//        System.out.println("Random non-duplicate 6 numbers have generated from" +
//                " 49 random numbers");
//        for(int num: table6){
//            System.out.print(num + " ");
//        }