package labshopcqrswoong.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcqrswoong.DeliveryApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryApplication.class })
public class CucumberSpingConfiguration {}
