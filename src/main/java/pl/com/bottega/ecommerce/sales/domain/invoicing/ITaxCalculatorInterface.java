package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface ITaxCalculatorInterface {
    Tax calculate(RequestItem item);
}
