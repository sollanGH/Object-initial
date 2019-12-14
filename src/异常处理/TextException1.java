package 异常处理;

public class TextException1 {//【引出一个基本的异常情况】

	public static void main(String[] args) {
		int a=9;
		int b=0;
		int c=a/b; //除数为0，异常，程序停止运行
		System.out.println(c);

	}

}
