package snipin.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Evgeniy Tupikov
 */
public class AppInit implements WebApplicationInitializer {

    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebApp.class);
        ctx.setServletContext(servletContext);
        servletContext.addListener(new ContextLoaderListener(ctx));

        DispatcherServlet servlet = new DispatcherServlet(ctx);
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(
                DISPATCHER_SERVLET_NAME, servlet
        );
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");

    }
}
