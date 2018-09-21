package br.com.test;

import java.io.IOException;

import br.com.mrtech.CodeAnalyze;
import br.com.mrtech.CodeAnalyzer;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String location = "/home/jonas/Documents/test.jar";
		
		CodeAnalyzer code = new CodeAnalyzer();
		
		System.out.println("# Report:");
		
		for(CodeAnalyze c : code.loadReport(location).getAnalyzes()) {
			System.out.println("# Classe: "+c.getClassName());
			System.out.println("# Complexidade Ciclomática: "+c.getComplexity());
			System.out.println("# Status do método fatorar(): funcionando = "+code.isCorrectMethod("fatorar", 5, 120));
		}
	}
}