# THINKBRIDGEQ2

I have written a program in Java using selenium webdriver to automate the web application given.

Prior to writing program, I have installed Eclipse IDE and selenium .jar files and java in the device. 
The packages used are:
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

I have written automated test scripts to test the web application given. I have used Java programming language and selenium libraries for automating the application against the requirements.
The program execution is in the following sequence :
Initially the driver (Chromedriver) object launches the web application using the url given.
Secondly, the driver finds the elements in the sequence the program is written, as below:
The drop-down element is located by the driver and language English is selected from the options.
The name text field is located using 'id' and value of alphanumeric type is given to it.
The organization field is located using 'id' and value of alphanumeric type is given to it.
The email id field is located using 'id' and valid email id is given as data.
The checkbox is located using css Selector locator and is checked.
The submit button is located using css Selector and is clicked.
Hence the values are submitted to the application and a message appears saying 'A welcome email has been sent. Please check your email'. The mail is sent to the registered email is in the step 9 from JABATALKS.



