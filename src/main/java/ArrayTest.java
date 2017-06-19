import java.util.*;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * It's simples which show a few work with array
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-06-16
 */
public class ArrayTest {

    public static void main (String[] args) {
        ArrayTest app = new ArrayTest();
        app.run();
    }

    public static void run () {
        System.out.println("---Show me some random numbers---");
        int [] random = getRandomNumbers(10, 0, 10);
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + " ");
        }
        System.out.println();

        System.out.println("---Show me the primes---");
        for (int i = 0; i < random.length; i++) {
            if (isPrime(random[i])) {
                System.out.print(random[i] + " ");
            }
        }
        System.out.println();

        System.out.println("---Show me the primes again---");
        int [] primes = filterPrimes(random);
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
        System.out.println();

        System.out.println("---Show me the primes with no duplicates---");
        int [] primes2 = filterPrimes2(random);
        for (int i = 0; i < primes2.length; i++) {
            System.out.print(primes2[i] + " ");
        }
        System.out.println();

    }



    // getRandomNumbers
    // 1st arg: The count of random numbers to return
    // 2nd arg: The minimum random number
    // 3rd arg: The maximum random number
    private static int[] getRandomNumbers(int count, int min, int max){
        Random random = new Random(System.currentTimeMillis());
        int[] array = new int[count+1];
        for(int i = 0; i < count; i++){
            array[i] = random.nextInt(max + 1 - min) + min;
        }

        return array;
    }


    private static boolean isPrime(int i){
        if(i <= 1) return false;

        for(int j = 2; j*j <= i; j++){
            if(i%j == 0) return false;
        }

        return true;
    }

    private static int[] filterPrimes(int[] array) {

        boolean isPrime;
        int count = 0;

        int[] reply = new int[array.length];

        for(int i = 0; i < array.length; i++){

            isPrime = true;

            if(array[i] > 1){

                for(int j = 2; j*j <= array[i]; j++){
                    if(array[i]%j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    reply[count] =   array[i];
                    count++;
                }
            }
        }

        reply = Arrays.copyOf(reply, count);
        return reply;
    }


    // filterPrimes2:
    // return primes with no duplicates, in sorted order

    private static int[] filterPrimes2(int[] array){

        //Arrays.sort(array);

        Set<Integer> s = new TreeSet<>();

        for(int i =0; i<array.length; i++){
            s.add(array[i]);
        }

        int[] reply = new int[s.size()];
        int index = 0;

        for(int i : s){
            reply[index] = i;
            index++;
        }

        return reply;
    }
}
