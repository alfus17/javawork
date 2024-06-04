package _05_ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamApi {
	// ObjectOutputStream 보조 스트림 사용
	/*
	 * ObjectOutputStream 보조 스트림 사용
	 *  - 출력 메소드 : writerObject(객체);
	 *  - 입력 메소드 : readObject()
	 * 
	 */
	ArrayList<Phone> phones = new ArrayList();
	ObjectStreamApi(){
		phones.add(new Phone("갤럭시",20000000));
		phones.add(new Phone("아이폰",1800000));
		phones.add(new Phone("샤오밍",1000));
		phones.add(new Phone("오밍",12000));
		
	}
	
	//객체를 바일로 출력
	void fileSave() {
//		Phone p1 = new Phone("갤럭시",20000000);
//		Phone p2 = new Phone("아이폰",1800000);
//		Phone p3= new Phone("샤오밍",1000);
		
		
		// 기반스트림 : FileOutputStream(1byte단위로 출력할 수 있는 스트림)
		try (ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("file_object.txt"))){
//			oos.writeObject(p1);
//			oos.writeObject(p2);
//			oos.writeObject(p3);
			for(Phone p : phones) {
				oos.writeObject(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	
	void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file_object.txt"))){
//			System.out.println(ois.readObject());
			for(Phone p : phones) {
				System.out.println(p);
			}
		}catch(Exception e) {
			
		}
	}

}
