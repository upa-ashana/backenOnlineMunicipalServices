package edu.usha.bim.sumProj2018.onlineSerRegPayment;

import edu.usha.bim.sumProj2018.onlineSerRegPayment.config.JWTFilter;
import edu.usha.bim.sumProj2018.onlineSerRegPayment.utils.APIConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class OnlineSerRegPaymentApplication {

    @Bean
    public FilterRegistrationBean registrationJWTFilter(){
        final FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        
    registrationBean.setFilter(new JWTFilter());
    registrationBean.addUrlPatterns(APIConstant.REST_BASE_URL+"/*");
    return registrationBean;
    
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(OnlineSerRegPaymentApplication.class, args);
	}
}
