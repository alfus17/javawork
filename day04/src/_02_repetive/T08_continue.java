package _02_repetive;

public class T08_continue {

	public static void main(String[] args) {
		// continue : 실행문을 실행하지 않고 다시 반복문을 실행
		// ~ 을 제외 할때 많이 사용합니다.
		
		// 1~100까지 합계 3의 배수 제외한 합계를 구하기
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				continue;
//			continue를 만나면 다시 반복문을 수행
			}
			sum += i;
		}System.out.println("1~100까지 3의 배수를 제외한 합계 : " + sum);
		
//		같은 자료형일때 한줄 선언 가능
		
		
//		반복문에 이름 붙이는 방법 라벨링 이라고 부른다 라벨문이라고 부른다.
		forloop : for(int dan =2; dan <=9; dan++) {
			mid :for(int i=1; i<=9; i++) {
				for(int z=1; z <=5; z++) {
					System.out.println(dan + "," + i + "," + z);
					if( z==3) {
						break mid;
					}
				}
				System.out.println(dan + "*" + i + "=" + dan);
				if(i ==5) {
					break forloop;
				}
			}
			System.out.println();
		}
		
	}

}

