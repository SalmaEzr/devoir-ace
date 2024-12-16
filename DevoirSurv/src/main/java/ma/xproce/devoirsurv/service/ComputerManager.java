package ma.xproce.devoirsurv.service;



import lombok.AllArgsConstructor;
import ma.xproce.devoirsurv.dao.entity.Computer;
import ma.xproce.devoirsurv.dao.repository.ComputerRepository;
import ma.xproce.devoirsurv.dto.ComputerDTO;
import ma.xproce.devoirsurv.mapper.ComputerMapper;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;


import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService {
    private ComputerMapper computerMapper;
    private ComputerRepository computerRepository;
    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {

        Computer computer = computerMapper.fromComputerDTOtoComputer(computerDTO);
        computer = computerRepository.save(computer);
        computerDTO = computerMapper.fromComputertoComputerDTO(computer);
        return computerDTO;
    }

    @Override
    public boolean deleteComputer(Long id) {
        try {
            ComputerRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;
    }

    @Override
    public List<ComputerDTO> getComputerByProceAndPrice(String proce, double price) {
        List<Computer> computers = computerRepository.findByProceAndPrice(proce,price);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;
    }

    @Override
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS) {
        List<Computer> computers = new ArrayList<>();
        for (ComputerDTO computerDTO : computerDTOS) {
            computers.add(computerMapper.fromComputerDTOtoComputer(computerDTO));
        }
        computers = computerRepository.saveAll(computers);
        for (Computer computer : computers) {
            computerDTOS.add(computerMapper.fromComputertoComputerDTO(computer));
        }
        return computerDTOS;
    }
}
