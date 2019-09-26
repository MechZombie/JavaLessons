package strings2;

public class MainStrings2 {

	public static void main(String[] args) {

		String valor1 = String.valueOf(1);
		System.out.println(valor1);//a saida é do tipo String

		String valor2 = " começo do texto, ";
		valor2 += "final do texto";//esse processo gera uma nova alocação de memória
		System.out.println(valor2);//o espaço alocado antes vai pro gargabage colector

//		String valor3 = "Texto";
//
//		for (int i=0; i<java.length(); i++){
//
//			ISSO DA ERRO NÃO SEI POR QUE!
//		}


		String java = "Java";

		for (int i=0; i<java.length(); i++){
			System.out.println(java.charAt(i));
		}
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
//		java.getChars(srcBegin, srcEnd, dst, dstBegin);
//					inicio --- posAposOfim-- destino--indiceInicialDoDestino	
	}

}
