package 异常处理;

public class MyAgeException extends Exception{
	/**
	 * 直接实现父类的所有构造方法形成
	 */

	public MyAgeException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public MyAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 传入异常信息及异常类型
	 * @param message
	 * @param cause
	 */
	public MyAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 传入异常的信息说明
	 * @param message
	 */
	public MyAgeException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 传入异常类型
	 * @param cause
	 */
	public MyAgeException(Throwable cause) {
		super(cause);
		// TODO 自动生成的构造函数存根
	}

}
