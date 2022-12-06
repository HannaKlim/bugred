package by.itacademy.hannaklimasheuskaya.utill;

public class Util {
    public static String generateRandomString(int count) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for (int i = 0; i < count; i++) {

            result += abc.charAt((int) (Math.random() * abc.length()));
        }
        return result;
    }
}
