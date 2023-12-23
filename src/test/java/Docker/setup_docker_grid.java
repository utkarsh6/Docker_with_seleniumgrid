package Docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setup_docker_grid {
	
	@BeforeTest
	public void startdockergrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(15000);
		
		
		
	}
	
	@AfterTest
	public void stopdockergrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(6000);
		
		
		  Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}

}
