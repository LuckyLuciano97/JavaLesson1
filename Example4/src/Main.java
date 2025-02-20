public class Main {

    public static void main(String[] args) {

        isPalindrom("Ana voli Milovana");
        isPalindrom("neven");
        isPalindrom("dgfsdgd");


    }
    public static void isPalindrom(String word) {

        System.out.println(word);

        word = word.toLowerCase().replaceAll("\\s+", "");
        String[] arr = word.split("");

        int x = 0;
        int y = arr.length - 1;

        while (x <= (arr.length - 1)/2 && y > -1){
            if (arr[x].equals(arr[y])){
                x++;
                y--;
            } else {
                System.out.println("is not a palindrome");
                return;
            }
        }
        System.out.println("is a palindrome");

    }


}
