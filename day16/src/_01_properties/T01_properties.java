package _01_properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class T01_properties {

	public static void main(String[] args) {
		// properties : Map 계열 =>  키 + 값 세트 저장
		// HashMap 과의 차이 : Properties에는 키 =  String, 값 = String으로 담는다
		
		Properties prop = new Properties();
		
		
		// 값을 추가할때
		// 1.  setProperty(String key, String value)
		prop.setProperty( "List", "ArrayList");
		prop.setProperty( "Set", "HashSet");
		prop.setProperty( "Map", "HashMap");
		prop.setProperty( "Map", "Properties");
		
		System.out.println(prop);
		
		// key를 얻어올때
		// 2. getProperty(String key)
		System.out.println(prop.getProperty("Set"));
		// 아무것도 없으면 null을 반환
		System.out.println(prop.getProperty("AAA"));
		
		try {
			prop.store(new FileOutputStream("test.properties"),"properties");
			prop.storeToXML(new FileOutputStream("test.properties"),"properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
