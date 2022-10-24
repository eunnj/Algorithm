import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int K = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<>();
			int sum =0;
			
			for(int i=0;i<K;i++) {
				int num = Integer.parseInt(br.readLine());
				if(num!=0)
					stack.add(num);
				else stack.pop();
			}
			
			for(int i=0;i<stack.size();i++) {
				sum+=stack.get(i);
			}
			
			System.out.print(sum);
		}

}