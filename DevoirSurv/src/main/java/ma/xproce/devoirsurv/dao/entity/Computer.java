package ma.xproce.devoirsurv.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id_Pc;
    String proce;
    String ram;
    String hardDrive;
    String macAddresse;
    double price;

}
