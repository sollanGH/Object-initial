package �쳣����;

public class MyAgeException extends Exception{
	/**
	 * ֱ��ʵ�ָ�������й��췽���γ�
	 */

	public MyAgeException() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public MyAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * �����쳣��Ϣ���쳣����
	 * @param message
	 * @param cause
	 */
	public MyAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * �����쳣����Ϣ˵��
	 * @param message
	 */
	public MyAgeException(String message) {
		super(message);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * �����쳣����
	 * @param cause
	 */
	public MyAgeException(Throwable cause) {
		super(cause);
		// TODO �Զ����ɵĹ��캯�����
	}

}
