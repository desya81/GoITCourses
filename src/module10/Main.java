package module10;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Denis on 09.02.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String dataFile = "test";
        DataInputStream in = null;

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
            String str = userString();
            String enoded = CaesarCryptography.encode(str, 10);
            out.writeUTF(enoded);
            out.close();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
            Object decoded = null;
            while (in.available() > 0) {
                String someStringFromFile = in.readUTF();
                decoded = new String(CaesarCryptography.decode(someStringFromFile, 10));
            }

            if(decoded.equals(new String(str))){
                System.out.println("Ok");
            }
        }catch (EOFException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null){
                in.close();
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
}
