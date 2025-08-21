package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/ex-01")

public class ExercicioFacilController {

    @GetMapping("/{palavra}")
    public Boolean palindromo(@PathVariable String palavra){

        String palavraInversa = "";
        List<String> letrasInversa = new ArrayList<>();

        char[] letras = palavra.toCharArray(); // toCharArray() separa a palavra em um array de Char (Character/caractéres)
        for (int i = letras.length -1; i >= 0 ; i--) {
            letrasInversa.add(String.valueOf(letras[i])); // ".valueOf" pega o valor de uma variável e "transforma" em string

        }
        palavraInversa = String.join("",letrasInversa);
        System.out.println(palavraInversa);
        System.out.println(palavra);
        if(palavraInversa.equals(palavra)){
            return true;
        }
        return false;
    }


}
