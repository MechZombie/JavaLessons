package strings01;

public class MainStrings01 {

	public static void main(String[] args) {
	
		//String é uma classe Wrapper portanto possui métodos
		
		String vazia = new String();
		System.out.println(vazia);
		
		String java = new String("JAVA");
		System.out.println(java);
		
		char[] charsjava = {'J','A','V','A'};//tipo char é declarado com aspas simples ' '
		String java1 = new String(charsjava);
		System.out.println(charsjava);
		
		String java2 = new String(java);//é possivel passar outra classe do tipo String como parametro
		System.out.println(java2);

		String java3 = new String(charsjava, 1,3);//retorna os valores da posição 1 até 3
		System.out.println(java3);
		
		byte[] ascii = {65, 69, 73, 79, 85};//valores da tabela ascii, correspondentes as vogais 
		String java4 = new String(ascii);
		System.out.println(java4);
		
		
//		CONTEÚDOS COM BASE NA AULA DA PROF.LOIANE GRONER
	}

}
