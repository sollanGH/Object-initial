package 异常处理.ch1_自定义异常;

/**
 * 自定义异常类
 * 
 *
 */
public class DefinedException extends Exception {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 5773562490580558103L;

	// 实现父类的构造方法
	public DefinedException(String msg) {
		super(msg);
	}

	public DefinedException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public DefinedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

	public DefinedException(String message, Throwable cause) {
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	public DefinedException(Throwable cause) {
		super(cause);
		// TODO 自动生成的构造函数存根
	}
}
