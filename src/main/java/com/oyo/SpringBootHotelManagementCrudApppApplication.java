package com.oyo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@SpringBootApplication(scanBasePackages="com.oyo")

/*@EnableJpaAuditing*/
public class SpringBootHotelManagementCrudApppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHotelManagementCrudApppApplication.class, args);
	}
	
	@Bean
	public DataSource getDataSource() {
		
		EmbeddedDatabaseBuilder edb=new EmbeddedDatabaseBuilder();
		edb.setType(EmbeddedDatabaseType.H2);
		return edb.build(); 
	}
}
