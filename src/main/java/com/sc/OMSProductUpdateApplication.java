package com.sc;

import com.sc.config.VaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigurationProperties({Configuration.class, VaultConfig.class})
public class OMSProductUpdateApplication implements CommandLineRunner{


    Logger log= LoggerFactory.getLogger(OMSProductUpdateApplication.class);

    @Value("${NAME:SleepCoutnry Canada}")
    String name;

    private final VaultConfig vaultConfig;
    @RestController
    class HelloworldController {

        @GetMapping("/{name}")
        public String hello(@PathVariable String name) {

            log.debug("Requested name passed = "+name);
            return "Hello " + name + "!";
        }
    }
    private final Configuration configuration;

    public OMSProductUpdateApplication(Configuration configuration, VaultConfig vaultConfig) {
        this.configuration = configuration;
        this.vaultConfig=vaultConfig;
    }
    public static void main(String[] args) {
        SpringApplication.run(OMSProductUpdateApplication.class, args);
    }
    @Override
    public void run(String... args) {

        Logger logger = LoggerFactory.getLogger(OMSProductUpdateApplication.class);

        logger.info("----------------------------------------");
        logger.info("Configuration properties");
        logger.info("   example.username is {}", configuration.getCredentials_json());
        logger.info("----------------------------------------");
    }
}
