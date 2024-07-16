public class Main {
    public static void main(String[] args) {

        Download download1 = new Download("Black Pumas - Colors.mp3");
        Download2 download2 = new Download2("Arctic Monkeys - R U Mine.mp3");
        Download3 download3 = new Download3("Vidas ao Vento.mp4");
        Download4 download4 = new Download4("Teddy Swims - Lose Control.mp3");

        download1.start();
        download2.start();
        download3.start();
        download4.start();
    }
}
