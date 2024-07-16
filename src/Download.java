import java.util.Random;

public class Download extends Thread implements Downloads {

    private String nomeArquivo;

    public Download(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void run() {
        download();
    }

    @Override
    public void download() {
        Random random = new Random();
        int esperar = 1000 * random.nextInt(10);
        System.out.println("Iniciando o download do arquivo: " + getNomeArquivo());
        try {
            Thread.sleep(esperar);
        } catch (InterruptedException e) {
            System.out.println("Download do arquivo: " + getNomeArquivo() + " interrompido.");
        }
        System.out.println("Download concluído do arquivo: " + getNomeArquivo() + " em " + esperar + " ms");
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }
}
