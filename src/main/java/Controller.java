import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CalculationService;

@RestController
@RequestMapping("/api")
public class Controller {
    private final CalculationService calculationService;

    @Autowired
    public Controller(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping("multiply")
    public double multiply(@RequestParam("a") double a, @RequestParam("b") double b) {
        return calculationService.multiply(a, b);
    }

    @PostMapping("divide")
    public double divide(@RequestParam("a") double a, @RequestParam("b") double b) {
        return calculationService.divide(a, b);
    }
    @GetMapping("helloworld")
    public String helloworld() {
        return "Hello World!";
    }
}
