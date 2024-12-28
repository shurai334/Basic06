package free;

public class index {
    public static void main(String[] args) {
        String originalString = "Hello,World!";
        
        if (args.length > 0) {
            originalString = args[0];
        }
        
        String reverseString = reverseString(originalString);
            

        System.out.println("元の文字列:" + originalString);
        System.out.println("逆順の文字列:" + reverseString);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}