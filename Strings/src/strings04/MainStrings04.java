package strings04;

public class MainStrings04 {

	public static void main(String[] args) {

		String teste = "Teste";
		String teste2 = teste.toUpperCase();

		System.out.println(teste.toLowerCase());
		System.out.println(teste.toUpperCase());

		class testando{

			public void testar() {

				String teste = " teste";
				String teste2 = teste.toUpperCase();
				if(teste.equals(teste2)) {//compara duas strings
					System.out.println("igual");//a classe testando poderia ser interna de algum método
				}else System.out.println("diferente");
			}
		}

		testando t1 = new testando();
		t1.testar();

	}

}
