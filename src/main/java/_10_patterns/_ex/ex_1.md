1. Напишите `builder` для класса `User`:
```
public class User{
    private String name;
    private Integer age;
    private List<User> relatives;
}
```
2. Реализуйте паттерн `command` для класса `Animal`:
```
public class Animal{
        private String name;
        private User owner;
    }
```
Должны быть реализованы команды: `сидеть`, `лежать`, `подать голос`.\
3. Напишите `facade` для печати всех `User` и их `relatives` из переданных `Animal`.
```
    void print(List<Animal> animals){
    ...
```