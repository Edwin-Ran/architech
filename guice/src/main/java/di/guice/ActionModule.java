package di.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

/**
 * Created by haoranchen on 16-6-17.
 * haoranchen@sohu-inc.com
 */
public class ActionModule implements Module {
    public void configure(Binder binder) {
        binder.bind(MessageService.class).to(MessageServiceImpl.class).in(Scopes.SINGLETON);
    }
}
