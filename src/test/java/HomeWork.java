import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void classwork(){
        //parent

        WebElement el = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));


        //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor or self

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[2]"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));

    }


    @Test
    public void homework1() {


        //by tag name
        WebElement el = wd.findElement(By.tagName("body"));
        WebElement el1 = wd.findElement(By.cssSelector("body"));
        WebElement el36 = wd.findElement(By.xpath("//body"));


        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.cssSelector("div"));
        WebElement el37 = wd.findElement(By.xpath("//div"));

        WebElement el4 = wd.findElement(By.tagName("h1"));
        WebElement el5 = wd.findElement(By.cssSelector("h1"));
        WebElement el38 = wd.findElement(By.xpath("//h1"));

        WebElement el6 = wd.findElement(By.tagName("a"));
        WebElement el7 = wd.findElement(By.cssSelector("a"));
        WebElement el39 = wd.findElement(By.xpath("//a"));

        WebElement el8 = wd.findElement(By.tagName("form"));
        WebElement el9 = wd.findElement(By.cssSelector("form"));
        WebElement el40 = wd.findElement(By.xpath("//form"));

        WebElement el10 = wd.findElement(By.tagName("input"));
        WebElement el11 = wd.findElement(By.cssSelector("input"));
        WebElement el41 = wd.findElement(By.xpath("//input"));

        WebElement el12 = wd.findElement(By.tagName("button"));
        WebElement el13 = wd.findElement(By.cssSelector("button"));
        WebElement el29 = wd.findElement(By.xpath("//button"));


        //by class
        WebElement el14 = wd.findElement(By.className("container"));
        WebElement el15 = wd.findElement(By.cssSelector(".container"));
        WebElement el30 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el16 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el17 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el42 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el18 = wd.findElement(By.className("active"));
        WebElement el19 = wd.findElement(By.cssSelector(".active"));
        WebElement el43 = wd.findElement(By.xpath("//*[@class='active']"));


        //by id

        WebElement el20 = wd.findElement(By.id("root"));
        WebElement el21 = wd.findElement(By.cssSelector("#root"));
        WebElement el31 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        WebElement el22 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el44 = wd.findElement(By.xpath("//*[@href = '/home']"));

        WebElement el23 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el24 = wd.findElement(By.name("email"));
        WebElement el45 = wd.findElement(By.xpath("//*[@name='email']"));

        WebElement el25 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el32 = wd.findElement(By.xpath("//*[@placeholder='Email']"));


        WebElement el26 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement el33 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        WebElement el27 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement el35 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        WebElement el28 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement el34 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));

        WebElement el46 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement el47 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        WebElement el48 = wd.findElement(By.cssSelector("[placeholder^='Pas']"));
        WebElement el51 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]"));

        WebElement el49 = wd.findElement(By.cssSelector("[placeholder$='rd']"));
        WebElement el52 = wd.findElement(By.xpath("//*[contains(@placeholder,'rd')]"));

        WebElement el50 = wd.findElement(By.cssSelector("[placeholder*='ss']"));
        WebElement el53 = wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));








    }
}
