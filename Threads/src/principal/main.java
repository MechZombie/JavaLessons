package principal;

public class main {

	public static void main(String[] args) {

		class Thread01 extends Thread {

			private String nome;
			private int tempo;

			public Thread01(String nome, int tempo) {
				this.nome = nome;
				this.tempo = tempo;
			}

			public void run() {

				for(int i =0; i<6; i++) {
					System.out.println("Thread "+this.nome+" "+i);
					try {
						this.sleep(tempo);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread "+this.nome+" Terminou");
			} 

		}




		Thread01 t1 = new Thread01("#1", 500);
		Thread01 t2 = new Thread01("#2", 500);
		Thread01 t3 = new Thread01("#3", 500);
		Thread01 t4 = new Thread01("#4", 300);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(5);

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Programa finalizado");
	}
}


