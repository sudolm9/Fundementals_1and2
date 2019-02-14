
public class Problem_1 {

	public static void main(String[] args) {
		
int [] groupA = {15,12,20,2};
int [] groupB = {200,14,1};
int [] groupC = {13,21,59,24,1,5,8};
System.out.println(  getSum(groupA)*getSum(groupB)*getSum(groupC) );

	}
	public static int getSum(int ... list){
		int sum = 0;
		if(list.length != 0)
			for(int num : list)
				sum *= num;
		
		return sum;
	}

}
