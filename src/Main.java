
public class Main {
    public static void main(String[] args) {

        Download download1 = new Download("Black Pumas - Colors.mp3");
        Download download2 = new Download("Arctic Monkeys - R U Mine.mp3");
        Download download3 = new Download("Vidas ao Vento.mp4");
        Download download4 = new Download("Teddy Swims - Lose Control.mp3");

        download1.start();
        download2.start();
        download3.start();
        download4.start();
    }
}
