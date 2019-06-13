1. Пусть дан список строк List<String>. Каждая строка содержит несколько слов разделенных пробелом.
 Найдите в нем слово, содержащее максимальное число строчных букв. Чтобы код правильно работал, 
когда входной список пуст, можете возвращать объект типа `Optional<String>`.
Например, для списка из таких 2-х строк:
```
Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation
DearneValleyOldMoorisan 89-hectare (220-acre) wetlands nature reserve in the .... Help desk – Ask questions about using Wikipedia
```
должно быть найдено слово `DearneValleyOldMoorisan`.

2. Пусть дан поток, элементы которого - слова. Посчитайте, сколько раз 
встречается каждое слово. 
При следующих исходных данных должен быть возвращен такой объект 
`Мар:[John -> 3, Paul -> 2, George -> 1]`:
```
Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John")
```