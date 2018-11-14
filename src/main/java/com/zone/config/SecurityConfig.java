package com.zone.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("select username, password, true from weighters where username=?")
		.authoritiesByUsernameQuery("select username, 'ROLE_USER' from weighters where username=?");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		//TODO: Remove the next line, when authentication is ready for implementations 
		//.regexMatchers("/profile.*").authenticated()
		.anyRequest().permitAll()
		.and().formLogin()
		.and().logout().logoutSuccessUrl("/homepage");
		}
}