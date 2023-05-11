public class Programm {
    public static void main(String[] args) {
        new Programm().doWork();
    }

    public void doWork(){
        OptionenSingleton.getInstance().setSpeicherort("C:\\Eigene Dateien");
        System.out.println(OptionenSingleton.getInstance().getSpeicherort());
    }
}
