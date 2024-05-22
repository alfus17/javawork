package practice;
import java.util.HashMap;


public class T01 {
    public static void main(String[] args) {
        // 2차원 배열 생성
        HashMap<String, Object>[][] array = new HashMap[3][3];

        // 해쉬 맵을 2차원 배열에 저장
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("key1", "value1");
        array[0][0] = map1;
        array[1][1] = map1;
        array[2][2] = map1;


        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("key2", "value2");
        array[1][1] = map2;
        System.out.println(Arrays);
    
    }
	

}
