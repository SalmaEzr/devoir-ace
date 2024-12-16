package ma.xproce.devoirsurv.dao.repository;

import ma.xproce.devoirsurv.dao.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, String> {


    List<Computer> findByProce(String proce);
    List<Computer> findByProceAndPrice(String proce, Double price );

    Computer findByMacAddresse(String macAddress);

}
