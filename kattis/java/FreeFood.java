import java.util.*;

public class FreeFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int events = sc.nextInt();
        int min = 400;
        int max = -1;
        boolean[] free = new boolean[366];

        while (events-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            min = Math.min(min, a);
            max = Math.max(max, b);
            for (; a <= b; a++)
                free[a] = true;
        }

        sc.close();

        int days = 0;
        for (; min <= max; min++) {
            if (free[min]) {
                days++;
            }
        }
        
        System.out.println(days);
    }
}

