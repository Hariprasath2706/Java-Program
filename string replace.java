public class ReplaceCharacter {
    public static void main(String[] args) {
        String s = "abcdefgh#$110 Hari Prasath S";
        s = s.replaceAll("[a-z#$0-9]", " ");
        System.out.println(s);
    }
}
