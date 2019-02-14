
public class Ex1_BasicArray {

	public static void main(String[] args) {
		final int LIMIT = 15, MULTIPLE =10;
		int[] list = new int[LIMIT];
		
		for(int index=0;index<LIMIT;index++)
		list[index]=index*MULTIPLE;
		list[5]=999;
		
		for(int value : list)
			System.out.println(value + "");

	}

}
