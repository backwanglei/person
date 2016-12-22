package listener;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Application Lifecycle Listener implementation class OnlineUserList
 *
 */
@WebListener
public class OnlineUserList implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
      private ServletContext app=null;
    /**
     * Default constructor. 
     */
    public OnlineUserList() {
       
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
        
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        Set all=(Set) this.app.getAttribute("online");
           if(all.size()>0){
        	   all.remove(arg0.getSession().getAttribute("username"));
       }
           this.app.setAttribute("online", all);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
       
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         Set all=(Set) this.app.getAttribute("online");
         String uname=(String) arg0.getName();
         if ("username".equals(uname)) {
        	 try {
        		 uname=new String(uname.getBytes("ISO8859-1"),"UTF-8");
        	 } catch (UnsupportedEncodingException e) {
        		 // TODO Auto-generated catch block
        		 e.printStackTrace();
        	 }
        	 all.add(uname);
        	 this.app.setAttribute("online", all);
		}
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
        Set all=(Set) this.app.getAttribute("online");
        all.remove(arg0.getValue());
        this.app.setAttribute("online", all);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
        
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         this.app=arg0.getServletContext();
         this.app.setAttribute("online", new TreeSet());
    }
	
}
