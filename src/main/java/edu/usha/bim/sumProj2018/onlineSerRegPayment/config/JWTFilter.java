package edu.usha.bim.sumProj2018.onlineSerRegPayment.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.filter.GenericFilterBean;

public class JWTFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest sreq, ServletResponse sres,
            FilterChain fc) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) sreq;
        final HttpServletResponse response = (HttpServletResponse) sres;

        String authHeader = request.getHeader("authorization");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            fc.doFilter(sreq, sres);
        }//if statement end
        else {//
            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                throw new ServletException("Missing or invalid Authorization Header");
            }
            final String token = authHeader.substring(7);
            try {

                final Claims claims = Jwts.parser().setSigningKey("1234").parseClaimsJws(token).getBody();
                request.setAttribute("claims", claims);

            } catch (final SignatureException e) {
                throw new ServletException("Invalid token");
            }//end of catch

            fc.doFilter(sreq, sres);

        }//end of else
    }//end of doFilter()

}//end of class
