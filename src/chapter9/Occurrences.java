package chapter9;

public class Occurrences {
	public static int getTimesOfOccurrences(int number, int... numbers){
		int times = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == number){
				times++;
			}
		}
		return times;
	}
	
//	�������� �����, ����� ������ ����� ���� ������ ����� �� ����� �
//	����� �����. �������� ��������, ����� ��������� ���� ���� �����
//	������ ��������.
	
	public static void main(String[] args){
		int result = getTimesOfOccurrences(3, 2, 3, 4, 5, 5, 3, 5, 2, 5);
		System.out.println(result);
	}
}
