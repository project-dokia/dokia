package ibm.com.supplier.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class ApplicationApis extends Application {
	
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(AuthWs.class);
        classes.add(LoginWs.class);
        classes.add(RequestWs.class);
        classes.add(SessionWs.class);
        classes.add(TestWs.class);
        classes.add(UserWS.class);
        classes.add(MailWS.class);
        return classes;
    }
}