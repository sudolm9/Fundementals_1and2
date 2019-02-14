
public class Euler_Problem_7_<sudolm9> {

	public static void main(String[] args) {
		
	int counter1 = 0;
	int s = 0;
	for(s = 1; counter1 <= 10001; s++){ //counting range from 10001 down
		for(int t = 1; t < s; t++){
			if(s % t == 0 && t != 1 && s!=t){
				break; //breaks off the first loop
				
			}else if(t == s -1){
				
				counter1++;
				if(counter1 == 10001){
					System.out.println("The 10001st prime number is: " + s); //prints the 10001st prime number
				}
			}
		}
	}
	}

}
