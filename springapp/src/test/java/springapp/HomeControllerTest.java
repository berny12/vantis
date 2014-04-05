package springapp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;





public class HomeControllerTest {

    @Test
    public void testHandleRequestView() throws Exception{		
    	HomeController controller = new HomeController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("home", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
