package java基本思想.常用类.ClassObject;

public class TestToString {

	public static void main(String[] args) {
		ToString ts=new ToString("小樱","女","神户",23);
		System.out.println(ts.getName()+"\t"+ts.getSex()+"\t"+ts.getAddress()+"\t"+ts.getAge());
		System.out.println(ts.toString());

	}

}
