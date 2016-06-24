package di.normal;

/**
 * Created by haoranchen on 16-6-17.
 * haoranchen@sohu-inc.com
 */
public class Action {
    private MessageService messageService = new MessageServiceImpl();

    public void action() {
        System.out.print(messageService.getMessage());
    }

    public static void main(String[] args) {
        Action action = new Action();

        action.action();
    }
}
