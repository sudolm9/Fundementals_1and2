
public class Num7 {
int x =3;
	public static void main(String[] args) {
		new Num7().go1();

	}
	void go1(){
		go2(++x);
	}
void go2(int y){
	int x =++y;
	System.out.println(x);
}
}
