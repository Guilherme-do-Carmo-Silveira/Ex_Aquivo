package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileController {

	public FileController() {
		super();
	}
	
	public void readFile(String path, String nome) throws IOException {
        File arq = new File(path, nome);
        if (arq.exists() && arq.isFile()) {
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();
            while (linha != null) {
                if(linha.contains("Fruits")) {
                    Tabulacao(linha);
                }
            }
            buffer.close();
            leitor.close();
            fluxo.close();
        } else {
            throw new IOException("Arquivo Inválido");
        }
    }
	
		private void Tabulacao(String linha) {
        String[] vetorsplit = linha.split(",");
        System.out.println(vetorsplit[0] + "\t" + vetorsplit[1] + "\t" + vetorsplit[3]);
    }

}
