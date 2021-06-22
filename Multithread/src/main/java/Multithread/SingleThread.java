package Multithread;

public class SingleThread extends Thread {
	public void run() {
		System.out.println();
		for (int x = 1; x <= 3; x++) {
			System.out.println(x + " Thread name: " + Thread.currentThread().getName());
		}
	}
}
