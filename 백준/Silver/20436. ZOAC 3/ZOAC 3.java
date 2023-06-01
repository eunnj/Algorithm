
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	static HashMap<String,int[]> sl_map;
	static HashMap<String,int[]> sr_map;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    sl_map = new HashMap<>();
		sr_map = new HashMap<>();
		
		setting();
		
		String str1[] = br.readLine().split(" ");
		String startLeft = str1[0];
		String startRight = str1[1];
		
		String str2 = br.readLine();
		
		
		int time = 0;
        for (char c : str2.toCharArray()) {
            int[] a, b;
            if (sl_map.containsKey(c + "")) {
                a = sl_map.get(startLeft);
                b = sl_map.get(c + "");
                startLeft = c + "";
            } else {
                a = sr_map.get(startRight);
                b = sr_map.get(c + "");
                startRight = c + "";
            }

            time += Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
            time += 1;
        }
        
        System.out.print(time);
		
	}
	
	public static void setting() {
		sl_map.put("q", new int [] {0,0});
		sl_map.put("w", new int [] {0,1});
		sl_map.put("e", new int [] {0,2});
		sl_map.put("r", new int [] {0,3});
		sl_map.put("t", new int [] {0,4});
		sl_map.put("a", new int [] {1,0});
		sl_map.put("s", new int [] {1,1});
		sl_map.put("d", new int [] {1,2});
		sl_map.put("f", new int [] {1,3});
		sl_map.put("g", new int [] {1,4});
		sl_map.put("z", new int [] {2,0});
		sl_map.put("x", new int [] {2,1});
		sl_map.put("c", new int [] {2,2});
		sl_map.put("v", new int [] {2,3});
		
		sr_map.put("y", new int [] {0,5});
		sr_map.put("u", new int [] {0,6});
		sr_map.put("i", new int [] {0,7});
		sr_map.put("o", new int [] {0,8});
		sr_map.put("p", new int [] {0,9});
		sr_map.put("g", new int [] {1,4});
		sr_map.put("h", new int [] {1,5});
		sr_map.put("j", new int [] {1,6});
		sr_map.put("k", new int [] {1,7});
		sr_map.put("l", new int [] {1,8});
		sr_map.put("b", new int [] {2,4});
		sr_map.put("n", new int [] {2,5});
		sr_map.put("m", new int [] {2,6});
	}
	
}
