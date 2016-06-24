package di.gof;

/**
 * Created by haoranchen on 16-6-17.
 * haoranchen@sohu-inc.com
 */
public class Action {
    private MessageService messageService = MessageServiceFactory.getMessageService();

    public void action() {
        System.out.print(messageService.getMessage());
    }

    public static void main(String[] args) {
        //MessageServiceFactory.setMessageService(new UserMessageServiceImpl());

        Action action = new Action();

        action.action();
    }

}
