
public class Demo1 {

	public static void main(String[] args) {
		System.out.println(    sumNums(4,9));

	}
public static int sumNums(int a, int...aPara){
	int sum = 0;
	if(aPara.length == 0)
		return 0;
	else if(aPara.length == 1)
		return aPara[0];
	else
	for(int x:aPara)
		sum+=x;
	return sum;
}

}


