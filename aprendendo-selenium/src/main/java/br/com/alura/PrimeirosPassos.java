package br.com.alura;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {

	WebDriver driver;
	WebElement element;

	@Before
	public void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "/Users/mac-regis/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		driver.manage().window().fullscreen();

	}

	@Test
	public void meuPrimeiroTest() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		element = driver.findElement(By.name("q"));
		element.getTagName();
		element.clear();
		element.sendKeys("Teste");

		WebElement btnSearch = driver.findElement(By.name("btnK"));
		btnSearch.click();
	}

	@Test
	public void findElementByClassName() {
		element = driver.findElement(By.className("gsfi"));
		System.out.println(element.getTagName());
	}

	@Test
	public void findElementByLinkText() {
		element = driver.findElement(By.linkText("Publicidade"));
		element.click();
	}

	@Test
	public void findElementByPartialLinkText() {
		element = driver.findElement(By.partialLinkText("funciona"));
		element.click();
	}

	@Test
	public void findElementByTagName() {
		element = driver
				.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc"));
		System.out.println(element.getTagName());
		WebElement input = element.findElement(By.tagName("input"));
		System.out.println(input.getTagName());
		input.sendKeys("Brasil acima de tudo");
	}

	@Test
	public void findElementByCss() {
		element = driver.findElement(
				By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
		System.out.println(element.getTagName());
		element.sendKeys("Find Element By CSS");
	}
	
	@Test
	public void findElementByXpath() {
		element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		element.sendKeys("XPATH");
	}

	@After
	public void posCondicao() {
//		driver.quit();

	}
}
