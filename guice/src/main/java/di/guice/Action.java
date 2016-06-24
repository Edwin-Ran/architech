package di.guice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Created by haoranchen on 16-6-17.
 * haoranchen@sohu-inc.com
 */
public class Action {
    private MessageService messageService;

    @Inject
    public Action(MessageService messageService) {
        this.messageService = messageService;
    }

    public void action() {
        System.out.println(this.messageService.getMessage());
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ActionModule());

        Action action = injector.getInstance(Action.class);

        action.action();
    }
}
