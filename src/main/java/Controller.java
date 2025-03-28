import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculationService;

@org.springframework.stereotype.Controller
public class Controller {
    private CalculationService calculationService;

    @PostMapping("/multiply")
    public double multiply(@RequestParam("a") double a, @RequestParam("b") double b) {
        return calculationService.multiply(a, b);
    }
    @PostMapping("/divide")
    public double divide(@RequestParam("a") double a, @RequestParam("b") double b) {
        return calculationService.divide(a, b);
    }
}
