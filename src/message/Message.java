package message;

import java.io.Serializable;

public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2066659777720501544L;
	public String name;
	public String pwd;
	private boolean bool;

	public void setName(String name) {
		this.name = name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setBool(boolean b) {
		if (b = true) {
			this.bool = true;
		} else {
			this.bool = false;
		}
	}

	public boolean getBool() {
		return bool;
	}

}
