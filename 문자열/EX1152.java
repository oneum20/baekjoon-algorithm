import java.util.*;

public class EX1152 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine().trim();
        System.out.println(S.equals("") ? 0 : S.split(" ").length);
    }

}