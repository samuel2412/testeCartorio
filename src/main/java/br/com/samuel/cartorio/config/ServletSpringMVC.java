package br.com.samuel.cartorio.config;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	    return new Class[] {AppWebConfiguration.class,  JPAConfiguration.class, JPAProductionConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
	    return new String[] {"/"};
	}
	
	 @Override
	    protected Filter[] getServletFilters() {
	        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
	        encodingFilter.setEncoding("UTF-8");
	        return new Filter[] {encodingFilter};
	    }
		@Override
		public void onStartup(ServletContext servletContext) throws ServletException {
			super.onStartup(servletContext);
			servletContext.addListener(RequestContextListener.class);
			servletContext.setInitParameter("spring.profiles.active", "dev");
		}

}