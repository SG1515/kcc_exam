package kosa.ifmission;

public class Main {

	public static void main(String[] args) {
		
		Object[] o = {new Reader("�Ѹ�"), new Work("�浿"), 
                new Student("������")};
		
		for(int i=0; i<o.length; i++) {
			if(!(o[i] instanceof Student)) {
				((Speakable)o[i]).speak();
			}
		}
		
//		((Reader)o[0]).speak();
//		((Work)o[1]).speak();
	}

}
