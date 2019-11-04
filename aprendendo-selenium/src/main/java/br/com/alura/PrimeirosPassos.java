package br.com.alura;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {

	WebDriver driver;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "/Users/mac-regis/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.caixa.gov.br");
		driver.manage().window().fullscreen();

	}

	@Test
	public void meuPrimeiroTest() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@After
	public void posCondicao() {
		driver.quit();

	}
}
