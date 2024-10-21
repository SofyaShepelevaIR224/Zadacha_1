fun countConsecutiveCharacters(input: String): String { //Этот метод подсчитывает последовательные символы в строке
    if (input.isEmpty()) return "" //Если строка пустая, функция возвращает пустую строку

    val result = StringBuilder() //Объект для построения результирующей строки
    var count = 1 //Переменная будет отслеживать количество последовательных одинаковых символов.

    for (i in 1 until input.length) { //Цикл по строке, чтобы сравнивать символ с предыдущим
        if (input[i] == input[i - 1]) { //Сравнение символа с предыдущим
            count++
        } else { //Если символы не равны, добавляем предыдущий символ в result.
            result.append(input[i - 1]) //Если символы повторялись, то добавляем значение в result
            if (count > 1) {
                result.append(count)
            }
            count = 1 //Сброс счетчика, чтобы начать новую последовательность
        }
    }

    result.append(input[input.length - 1]) //Добавление последнего символа
    if (count > 1) { //Добавление счетчика для последней последовательности
        result.append(count)
    }

    return result.toString() //Возврат результата
}

fun main() { //Точка входа для программы
    print("Введите строку: ") // Запрос ввода у пользователя
    val input = readLine() // Считываем строку с консоли

    if (input != null) {
        val output = countConsecutiveCharacters(input) //Если строка не пустая, вызываем функцию счетчика
        println("Результат: $output")
    } else {
        println("Ввод пустой!")
    }
}