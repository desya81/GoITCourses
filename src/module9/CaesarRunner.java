package module9;

import java.util.Scanner;

/**
 * Created by denys on 01.02.16.
 */
public class CaesarRunner {

    public static void main(String[] args) {

        while(true){

             try {
                 String str = userString();
                 Integer num = userInt();
                 String res = CaesarCryptography.encode(str, num);
                 System.out.println(res);
                 System.out.println(CaesarCryptography.decode(res, num));
                 break;
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
        }

    }

    /**
     * Get User value from console
     * @return
     * @throws Exception
     */
    private static String userString() throws Exception {
        System.out.println("Please, enter a word");
        final Scanner scanner = new Scanner(System.in);
        String value;
        try {
            value = scanner.nextLine();
        }catch (Exception e){
            throw new Exception("Please enter some word");
        }
        return value;
    }

    /**
     * Get User value from console
     * @return
     * @throws Exception
     */
    private static Integer userInt() throws Exception {
        System.out.println("Please, enter a number");
        final Scanner scanner = new Scanner(System.in);
        Integer value;
        try {
            value = scanner.nextInt();
        }catch (Exception e){
            throw new Exception("Please enter number");
        }
        return value;
    }

}
