// import org.junit.jupiter.api.Assertions
// import org.junit.jupiter.api.Test
// import org.openqa.selenium.By
// import org.openqa.selenium.WebDriver
// import org.openqa.selenium.WebElement
// import org.openqa.selenium.chrome.ChromeDriver
// import org.openqa.selenium.chrome.ChromeOptions


// class FrontendTest {
//     @Test
//     fun `should read if the heading is -hello world-`(){
//         val options = ChromeOptions()
//         options.addArguments("--headless=new");
//         val driver: WebDriver = ChromeDriver(options)
//         driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/index.html")
//         val text = driver.title
//         Assertions.assertEquals("Login Page", text)
//         driver.quit()
//     }
//     @Test
//     fun `should display id label`() {
//         val options = ChromeOptions()
//         options.addArguments("--headless")
//         val driver: WebDriver = ChromeDriver(options)

//         driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/index.html")

//         val idLabel: WebElement = driver.findElement(By.cssSelector("label[for='id']"))
//         Assertions.assertTrue(idLabel.isDisplayed())
//         driver.quit()
//     }

//     @Test
//     fun `should display name label`() {
//         val options = ChromeOptions()
//         options.addArguments("--headless")
//         val driver: WebDriver = ChromeDriver(options)

//         driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/index.html")

//         val idLabel: WebElement = driver.findElement(By.cssSelector("label[for='name']"))
//         Assertions.assertTrue(idLabel.isDisplayed())
//         driver.quit()
//     }
//     @Test
//     fun testDateFieldExists() {
//         val options = ChromeOptions()
//         options.addArguments("--headless")

//         val driver: WebDriver = ChromeDriver(options)
//         driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/member.html")

//         val dateField = driver.findElement(By.id("date"))

//         Assertions.assertNotNull(dateField)

//         driver.quit()
//     }

//     @Test
//     fun testYesRadioButtonExists() {
//         val options = ChromeOptions()
//         options.addArguments("--headless")

//         val driver: WebDriver = ChromeDriver(options)
//         driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/member.html")

//         val yesRadioButton = driver.findElement(By.id("yes"))

//         Assertions.assertNotNull(yesRadioButton)

//         driver.quit()
//     }

//     @Test
//     fun testNoRadioButtonExists() {
//         val options = ChromeOptions()
//         options.addArguments("--headless")

//         val driver: WebDriver = ChromeDriver(options)
//         driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/member.html")

//         val noRadioButton = driver.findElement(By.id("no"))

//         Assertions.assertNotNull(noRadioButton)

//         driver.quit()
//     }

// //    @Test
// //    fun testSubmitButtonExists() {
// //        val options = ChromeOptions()
// //        options.addArguments("--headless")
// //
// //        val driver: WebDriver = ChromeDriver(options)
// //        driver.get("file:///Users/sujithav/Desktop/team5-lunch-tracker/webapp/src/main/resources/member.html")
// //
// //        val submitButton = driver.findElement(By.cssSelector("input[type='submit']"))
// //
// //        Assertions.assertNotNull(submitButton)
// //
// //        driver.quit()
// //    }
// }
