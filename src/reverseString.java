public class reverseString {
    public static void main(String[] args) {
        String str="abcdefgh";
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
        }
        str=str1;
        System.out.println(str);

    }
}
