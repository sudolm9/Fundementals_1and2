package controller;

public class EulerProblem3 {
	public long PrimeFactor(long l) {
		int x; long p = l; long i;
		for (i = 2; i <= p; i++) {//since our number is even, we have to start from 2
			if (p % i == 0) {
				p /= i;
				i--;
			}
		}
		return i;//returns the prime factor for the number
	}
}
