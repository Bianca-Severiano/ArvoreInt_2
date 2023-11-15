package view;

import br.edu.fateczl.arvore.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt arv = new ArvoreInt();
		int [] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
		
		for (int i : vetor) {
			arv.insert(i);
		}
		
		try {
			arv.remove(7);
			arv.remove(6);
			arv.prefixSearch();
			arv.infixSearch();
			arv.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
