1. Напишите `factory` для классов `User` и `Animal`.
```
public class User{
    private String name;
    private Integer age;
    private Animal pet;
    private List<User> relatives;
}
```
```
public class Animal{
        private String name;
        private Type type;
    }
```
```
enum Type{
    DOG, CAT, FISH, BIRD
}
```
2. Напишите `adapter` для преобразования из `user` всех `animal`, 
в том числе из `animal` из `relatives`.
3. Напишите `bridge` для отдачи комманд как `user` так и `animal`.
```
interface Trainer is
    method lie()
    method voice()
    ...
```
```
// Но каждый тренер имеет особую реализацию
class UserTrainer implements Trainer is
```
```
class AnimalTrainer implements Trainer is
```