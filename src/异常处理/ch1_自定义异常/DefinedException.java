package �쳣����.ch1_�Զ����쳣;

/**
 * �Զ����쳣��
 * 
 *
 */
public class DefinedException extends Exception {
	/**
	 * �汾��
	 */
	private static final long serialVersionUID = 5773562490580558103L;

	// ʵ�ָ���Ĺ��췽��
	public DefinedException(String msg) {
		super(msg);
	}

	public DefinedException() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public DefinedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO �Զ����ɵĹ��캯�����
	}

	public DefinedException(String message, Throwable cause) {
		super(message, cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	public DefinedException(Throwable cause) {
		super(cause);
		// TODO �Զ����ɵĹ��캯�����
	}
}
