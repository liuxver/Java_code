//package 算法第四次上机;
/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public class Queue {
	static int[] a=new int[8];
	static int N=8;
	public static int result=0;

	private void queue(int n) {
        if (n == N) {
        	result++;
            return;
        }
        for (int i = 0; i < N; i++) {
            a[n] = i;
            if (judge(n)) {
                queue(n + 1);
            }
        }
    }
 
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] == a[n] || Math.abs(n - i) == Math.abs(a[n] - a[i])) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args){
		
		new Queue().queue(0);
		System.out.println(result);
		
	}
}
