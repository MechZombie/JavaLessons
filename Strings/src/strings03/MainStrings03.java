package strings03;

public class MainStrings03 {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf('a'));//retorna o primeiro index do parametro
		System.out.println(banana.indexOf("x"));//retorna -1 caso não exista
		
		System.out.println(banana.lastIndexOf("n"));
		System.out.println(banana.concat(ana));
		System.out.println(banana.endsWith(ana));//conferece se termina com o parametro
		System.out.println(banana.startsWith(ana));//conferece se inicia com o paramtro
		System.out.println(banana.contains(ana));
		

	}

}
