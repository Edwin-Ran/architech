package di.gof;

/**
 * Created by haoranchen on 16-6-17.
 * haoranchen@sohu-inc.com
 */
public class MessageServiceFactory {
    private static MessageService messageService = new MessageServiceImpl();

    public static void setMessageService(MessageService userMessageService) {
        messageService = userMessageService;
    }

    public static MessageService getMessageService() {
        return messageService;
    }
}
