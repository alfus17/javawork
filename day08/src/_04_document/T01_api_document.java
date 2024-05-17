package _04_document;

public class T01_api_document {
	String serialName;
	static int count;
	static String serialNo;
	
	public T01_api_document() {
		this("더좋은");
		System.out.println("serialNo :"+ serialNo);

	}
	public T01_api_document(String serialName) {
		this.serialName = serialName == ""|| serialName == " " ? null : serialName ;
		
		if(this.serialName == null) {
			System.out.println("시리얼 네임을 입력하세요");

		}else {
			this.serialNo = serialName + ++count;
			System.out.println( this.serialName + "의 serialNo : " + serialNo +" 생성됨");	
		}

	}

}
