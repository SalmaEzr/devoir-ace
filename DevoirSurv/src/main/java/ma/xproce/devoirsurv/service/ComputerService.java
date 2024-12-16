package ma.xproce.devoirsurv.service;

import ma.xproce.devoirsurv.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);

    public boolean deleteComputer(Long id);

    public List<ComputerDTO> getComputerByProce(String proce);
    public List<ComputerDTO> getComputerByProceAndPrice(String proce, double price);
    public List<ComputerDTO> saveComputers(List<ComputerDTO> computerDTOS);




}
