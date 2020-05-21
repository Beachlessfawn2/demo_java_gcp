public class Main{
    public static void main(String[] args) {
        MessageUtil mu = new MessageUtil("Idioten zijn er overal...");
        mu.printMessage();
        mu.salutationMessage();
        MessageUtil mu1 = new MessageUtil("Idioten...");
        mu1.printMessage();
        mu1.salutationMessage();
    }
}