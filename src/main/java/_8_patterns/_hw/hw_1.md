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
        private String nickname;
        private Type type;
    }
```
```
public enum Type{
    DOG, CAT, FISH, BIRD
}
```
2. Напишите `adapter` для преобразования из `user` всех `animal`, 
в том числе из `animal` из `relatives`.
3. Напишите `bridge` для отдачи комманд как `user` так и `animal`.
```
interface Trainer {
    void lie();
    void voice();
    ...
}
```
```
// Но каждый тренер имеет особую реализацию
class UserTrainer implements Trainer{
    ...
}
```
```
class AnimalTrainer implements Trainer{
    ...
}
```