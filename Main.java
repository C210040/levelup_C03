import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt() - 1;
        int end = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String ans = line.substring(0,start) + line.substring(start, end).toUpperCase() + line.substring(end);
        System.out.println(ans);
    }
}
