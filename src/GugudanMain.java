import java.util.Scanner;


public class GugudanMain {
	// main
	public static void main(String[] args) {
		
			
		//최종 요구사항 1: 크기가 다른 구구단 출력 88단, 19단 (2*1 ~ 19*19)
//		System.out.print("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//    	int[] answer = new int[input+1];
//			for (int i = 2; i < answer.length; i++) {
//				System.out.println(i+"단");
//				for (int j =1; j < answer.length; j++) {
//					answer[i] = i * (j);
//					System.out.println(answer[i]);
//				}
//				System.out.println(" ");
//				
//			}
//			
		
		//최종 요구사항 2: 크기가 다른 구구단 출력 8,7단 
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(" ");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		int[] answer = new int[first+1];
			for (int i = 2; i < first+1; i++) {
				System.out.println(i+"단");
				for (int j =1; j < second+1; j++) {
					answer[i] = i * (j);
					System.out.println(answer[i]);
				}
				System.out.println(" ");
				
			}
		

		
		
		//구구단 method 활용 
//		for (int i = 2; i < 10; i++) {
//			int[] result = Gugudan.calculate(i);
//			Gugudan.print(result);
//		}
	}
}
