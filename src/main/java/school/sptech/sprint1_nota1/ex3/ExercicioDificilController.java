package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping(value = "/ex-03/{n}", produces = "application/json")
    public String exercicioDificil(@PathVariable int n) {
        if (n <= 0) {
            return String.format("{\"enesimoTermo\": %d, \"soma\": %d}", 0, 0);
        }

        int a = 0;
        int b = 1;
        int enesimo = 0;
        int soma = 0;

        for (int i = 1; i <= n+1; i++) {
            if (i == 1) {
                enesimo = a;
            } else if (i == 2) {
                enesimo = b;
            } else {
                int temp = a + b;
                a = b;
                b = temp;
                enesimo = temp;
            }
            soma += enesimo;
        }

        return String.format("{\"enesimoTermo\": %d, \"soma\": %d}", enesimo, soma);
    }
}
