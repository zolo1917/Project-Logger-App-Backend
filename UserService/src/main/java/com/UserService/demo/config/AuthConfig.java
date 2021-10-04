//package com.UserService.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class AuthConfig extends WebSecurityConfigurerAdapter {
//    @Bean
//    public PasswordEncoder passencoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout().invalidateHttpSession(true).clearAuthentication(true).permitAll();
//    }
//
//}
