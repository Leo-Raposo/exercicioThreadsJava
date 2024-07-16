import java.util.Random;

public class Download extends Thread {

    private String nomeArquivo;

    public Download(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void run() {
        Random random = new Random();
        int esperar = 1000 * random.nextInt(10);
        System.out.println("Iniciando o download do arquivo: " + nomeArquivo);
        try {
            Thread.sleep(esperar);
        } catch (InterruptedException e) {
            System.out.println("Download do arquivo: " + nomeArquivo + " interrompido.");
        }
        System.out.println("Download concluido do arquivo: " + nomeArquivo + " em " + esperar + " ms");
    }
}
