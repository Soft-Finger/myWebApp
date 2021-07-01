package copie.tableau;

public class CopieArrays {
    public static void main(String[] args) {
        int[] arrayA = {100, 101, 102};
        int[] arrayC = new int [arrayA.length];

       /**
        * for( int i = 0; i < arrayA.length; i++ ) {
            arrayC[i] = arrayA[i];
        }
        System.out.println("====================");
        */

        System.out.println("======Array A");
        for( int i = 0; i < arrayA.length; i++ ) {
            System.out.println(arrayA[i] + " ");
        }


        /**
        arrayC[0] = 20;
        for( int i = 0; i < arrayC.length; i++ ) {
            System.out.println(arrayC[i] + " ");
        }
         */

       /**
        *  System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);
        arrayC[2] = 777;
        System.out.println("ArrayC[2]: " + arrayC[2]);
        System.out.println("ArrayA[2]: " + arrayA[2]);
        */


        System.out.println("======Array B");
        int[] arrayB = arrayA.clone();
        for( int i = 0; i < arrayB.length; i++ ) {
            System.out.println(arrayB[i] + " ");
        }


        arrayB[0] = 12;
        arrayB[1] = 24;
        arrayB[2] = 20;
        System.out.println(" = array B apres changement = ");
        for( int i = 0; i < arrayB.length; i++ ) {
            System.out.println(arrayB[i] + " ");
        }


    }
}
