
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static long m;
    static int[] arr;
    static long MAX_VALUE;
    static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); 
        m = Long.parseLong(st.nextToken()); 

        arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }
        MAX_VALUE = m * max; 
        result = MAX_VALUE;
        Arrays.sort(arr); 

        searchMinTime();
        System.out.println(result);
    }

    private static void searchMinTime() {
        long lo = 0;
        long hi = MAX_VALUE;

        while (lo <= hi) {
            long mid = (lo + hi) / 2;

            long totalPerson = 0; 
            for (int i : arr) {
              
                long cntPerson = mid / i;

              
                if (totalPerson >= m || i > mid) {
                    break;
                }

                totalPerson += cntPerson;
            }

          
            if (totalPerson >= m) {
                hi = mid - 1;
                result = Math.min(result, mid);
            } else {
                lo = mid + 1;
            }
        }
    }
}