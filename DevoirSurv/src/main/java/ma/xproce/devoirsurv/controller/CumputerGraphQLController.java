package ma.xproce.devoirsurv.controller;

import lombok.AllArgsConstructor;
import ma.xproce.devoirsurv.dto.ComputerDTO;
import ma.xproce.devoirsurv.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class CumputerGraphQLController {
    private ComputerService computerService; ;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer){
        return computerService.saveComputer(computer);
    }

    @MutationMapping
    public Boolean deleteComputer(@Argument Long id){
        return computerService.deleteComputer(id);
    }


    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProceAndPrice(@Argument String proce, @Argument double price){
        return computerService.getComputerByProceAndPrice(proce, price);
    }
}
