package kr.co.tj;

public class Test_array_String {

	public static void main(String[] args) {
		String[] str1 = new String[3]; // 1차주소 보관
		str1[0] = "Hello"; // 문자는 배열의 배열로 관리된다. 2차주소보관 , 실제저장소: 'H', 'e', 'l', 'l', 'o', 끝은 null(\0) 
		str1[1] = "Java";
		str1[2] = "World!";
		
		String[] str2 = {"Hello", "Java", "World!"}; // 위와 같은 결과
		if(args.length==0) {
			args = new String[] {"Hello", "Java", "World!"};
		// ★★★ Run Configurations 에서 외부에서 주는 값이 우선한다.
			
		}
		for(int i=0;i<str2.length;i++) {
			System.out.printf("str1:%s,str2:%s,args:%s\n",str1[i],str2[i],args[i]);
		}

	}
	
	

}
