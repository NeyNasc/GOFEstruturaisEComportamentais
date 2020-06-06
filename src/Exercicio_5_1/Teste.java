package Exercicio_5_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Teste {

	public static void main(String[] args) throws IOException {
		
		String localArquivo= "C:\\Users\\jhoni\\eclipse-workspace\\ccp3bn_bua2_Patterns_Estruturais_e_Comportamentais\\src\\Exercicio_5_1\\Teste.java";
		
		InputStream is = new FileInputStream(localArquivo);
		
		IOFacade ioFacade = new IOFacade(is);
		
		ioFacade.ReadFile();
		

	}

}
