package coms309.proj1.security.config;

import coms309.proj1.login.LoginSuccessHandler;
import coms309.proj1.user.UserDetailsServiceImpl;
import coms309.proj1.user.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        LoginFilter loginFilter = new LoginFilter();
        loginFilter.setAuthenticationManager(authenticationManager());

        http.httpBasic()
                .and()
                .csrf().disable()
                .authorizeRequests()
                    .antMatchers("/", "/registration**", "/registration/**", "/user/verifyUser", "/api-docs/**").permitAll()
                    .antMatchers("/anonymous").anonymous()
                    .antMatchers("/admin*").hasAuthority("ADMIN")
                    .antMatchers("/home", "/user*", "/user/friends/**").hasAnyAuthority("ADMIN", "USER")
                    .anyRequest().authenticated()
                    .and()
                .httpBasic()
                    .and()
                .formLogin() // Goes to /login/success when successful
                    .loginPage("/login") // Get request of the login page
                    .loginProcessingUrl("/login") // URL to post request the login parameters
                    //.defaultSuccessUrl("/login/success", true) // Go here when when success always
                    .successHandler(loginSuccessHandler())
                    .permitAll()
                    .and()
                .logout()
                    .logoutUrl("/logout") // Successful logout goes to 204 no content
                    .deleteCookies("JSESSIONID")
                    .permitAll()
                    .and()
                .addFilterAt(
                        loginFilter,
                        UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider());
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setPasswordEncoder(passwordEncoder());
        authProvider.setUserDetailsService(userDetailsService());
        return authProvider;
    }
    @Bean
    public UserDetailsService userDetailsService() {
        return userDetailsService;
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public ModelMapper modelMapper() { return new ModelMapper(); }

    @Bean
    public AuthenticationSuccessHandler loginSuccessHandler(){
        return new LoginSuccessHandler();
    }
}
