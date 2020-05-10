import java.util.Arrays;

public class Main {
/** This method generates random size Array with random fill up, and finds maximum in each row */
    public static void Calculate() {
        /** Random 1-11 array size  */
        byte [][] matrix = new byte[(byte)(Math.random()*10+1)][(byte)(Math.random()*10+1)];
        /** Fill up with values 0-99 */
        for(byte[] u:matrix){
            for (byte i=0;i<u.length;i++)
                u[i]=(byte)(Math.random()*100);
        }
        /** This cycle finds maximum in each row */
        for(byte[] u:matrix){
            byte temp = 0;
            for (byte i:u){
                if(i>temp)
                    temp = i;
            }
            System.out.println("Maximum from " + Arrays.toString(u) + " is " + temp);
        }
    }
}