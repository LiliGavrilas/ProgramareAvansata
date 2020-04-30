package app;

import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import util.PersistenceUtil;

@SpringBootApplication

public class AlbumManager {

	static String connectionString="jdbc:mysql://192.168.1.9; user= dba; password= sql";

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		try {
			PersistenceUtil.openConnection("mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		PersistenceUtil ps = PersistenceUtil.getInstance();
		try{
			PersistenceUtil.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
