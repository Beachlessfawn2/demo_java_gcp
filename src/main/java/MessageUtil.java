public class MessageUtil {
  private String message;

  public MessageUtil(String message) {
    this.message = message;
  }

  public String printMessage() {
    System.out.println(message);
    return message;
  }

  public String salutationMessage() {
    message = "Hi!" + message;
    System.out.println(message);
    return message;
  }

  public static void main(String[] args) {
        MessageUtil mu = new MessageUtil("Idioten zijn er overal...");
        mu.printMessage();
        mu.salutationMessage();
        MessageUtil mu1 = new MessageUtil("Idioten...");
        mu1.printMessage();
        mu1.salutationMessage();
    }
}