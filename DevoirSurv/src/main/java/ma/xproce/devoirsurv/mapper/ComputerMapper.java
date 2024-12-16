package ma.xproce.devoirsurv.mapper;

import ma.xproce.devoirsurv.dao.entity.Computer;
import ma.xproce.devoirsurv.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private  final ModelMapper modelMapper = new ModelMapper();
    public Computer fromComputerDTOtoComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }
    public ComputerDTO fromComputertoComputerDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
