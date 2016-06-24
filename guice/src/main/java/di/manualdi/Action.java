package di.manualdi;

/**
 * Created by haoranchen on 16-6-17.
 * haoranchen@sohu-inc.com
 */
public class Action {
    private MessageService messageService;

    public Action(MessageService messageService) {
        this.messageService = messageService;
    }

    public void action() {
        System.out.print(messageService.getMessage());
    }

    public static void main(String[] args) {
        Action action = new Action(new MessageServiceImpl());
        action.action();
    }
}
