package service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return a / b;
    }

}

