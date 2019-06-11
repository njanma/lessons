1. У Вас есть коллекция каких-то продуктов. Вы хотите дать пользователям фильтровать продукты по определенным критериям.
При реализации используйте паттерн `Strategy`. Создайте отдельный класс с демонстрацией работы.
``` 
class Product {
    private String name;
    private Integer listPrice;
    private Integer sellingPrice;
}
```
```
class ProductService{
    private List<Product> products;
    
    public List<Product> filter(ProductFilteringStrategy filterStrategy) {
        //TODO
    }
}
```
```
interface ProductFilteringStrategy {
    boolean filter(Product product);
}
```
2. Вы хотите получать оплату через два сервиса `paypal` и `кредитные карты`, но `API` для этого разный.
При реализации используйте паттерн `Adapter`. Создайте отдельный класс с демонстрацией работы.
```
class PayPal{
    private String email;
    private String password;
    
    public String transfer(String email, Integer amount){
        return "Paypal Success!";
    }
}
```
```
class CreditCard{
    private String number;
    private LocalDate expiration;
    
    public String authorizeTransaction(Integer amount){
        return "Authorization code: as2321";
    }
}
```
```
interface PaymentAdapter{
    public boolean collectMoney(Integer amount);
}
```

```
class CreditCardAdapter implements PaymentAdapter{
    //TODO
}
```

```    
class PayPalAdapter implements PaymentAdapter{
    //TODO
}
```