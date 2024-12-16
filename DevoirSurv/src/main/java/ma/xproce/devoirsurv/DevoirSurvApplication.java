package ma.xproce.devoirsurv;

import ma.xproce.devoirsurv.dto.ComputerDTO;
import ma.xproce.devoirsurv.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirSurvApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirSurvApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return args -> {
            computerService.saveComputers(
                    List.of(
                            ComputerDTO.builder().proce("Intel i5").ram("8GB").hardDrive("256GB SSD").price(850.0).build(),
                            ComputerDTO.builder().proce("Intel i7").ram("16GB").hardDrive("512GB SSD").price(1200.0).build(),
                            ComputerDTO.builder().proce("AMD Ryzen 5").ram("8GB").hardDrive("1TB HDD").price(750.0).build(),
                            ComputerDTO.builder().proce("Intel i3").ram("4GB").hardDrive("500GB HDD").price(400.0).build()
                    )
            );
        };
    }

}
