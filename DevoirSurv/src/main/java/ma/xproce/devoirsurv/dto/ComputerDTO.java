package ma.xproce.devoirsurv.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class ComputerDTO {
    String proce;
    String ram;
    String hardDrive;
    String macAdresse;
    double price;
}
