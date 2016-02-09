package module10;

/**
 * Created by denys on 01.02.16.
 */
class CaesarCryptography {

    public static String encode(String str, Integer offset){
        offset = offset % 26 + 26;
        StringBuilder encoder = new StringBuilder();

        for(char i: str.toCharArray()){
            if(Character.isLetter(i)){
                if(Character.isUpperCase(i)){
                    encoder.append((char) ('A' + (i - 'A' + offset) % 26));
                }else{
                    encoder.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            }else {
                encoder.append(i);
            }
        }

        return encoder.toString();
    }

    public static String decode(String str, Integer offset){
        return encode(str, 26 - offset);
    }
}
