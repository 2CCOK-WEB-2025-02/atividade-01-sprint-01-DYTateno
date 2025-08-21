package school.sptech.sprint1_nota1.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex-00")
public class ExercicioAquecimentoController {

    public Integer numeroURL;



    @GetMapping("/{num}")
    public Boolean teste(@PathVariable Integer num){

        if (num % 2 == 0){return true;};
        return false;
    }
}