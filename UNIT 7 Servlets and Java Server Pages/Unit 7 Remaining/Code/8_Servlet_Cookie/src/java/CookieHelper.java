import javax.servlet.http.*;

public class CookieHelper {
    public static void addCookie(HttpServletResponse response, 
		String name, String value) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(7 * 24 * 60 * 60);
        response.addCookie(cookie);
    }

    public static String getCookie(HttpServletRequest request, 
        String name) {
        Cookie[] cookies = request.getCookies();
        if(cookies == null) return null;
        for(Cookie cookie: cookies) {
            if(cookie.getName().equals(name))
                return cookie.getValue();
        }
        return null;
    }
}
