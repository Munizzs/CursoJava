package com.estudo.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/public/**").permitAll()  // Permite acesso a qualquer URL sob /public sem autenticação.
                                .anyRequest().authenticated()  // Qualquer outra URL requer autenticação.
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login")  // Especifica a URL da página de login personalizada.
                                .permitAll()  // Permite acesso a todos à página de login.
                                .defaultSuccessUrl("/private", true)  // Redireciona para /private após login bem-sucedido.
                                .failureUrl("/login?error=true")  // Redireciona para /login com parâmetro de erro se o login falhar.
                )
                .logout(logout ->
                        logout.permitAll()  // Permite acesso a todos à funcionalidade de logout.
                );
        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }
}