import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {

    @Test
    void setMinBoundNumberStation() { // присвоение минимального допустимого значения номера радиостанции
        Radio radio = new Radio(20);
        radio.setNumberCurrentStation(15);
        int expected = 15;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNegativeMinBoundNumberStation() { // присвоение отрицательного значения радиостанции меньше минимума
        Radio radio = new Radio(20);
        radio.setNumberCurrentStation(-1);
        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPositiveMinBoundNumberStation() { //присвоение пограничного значения номера радиостанции близкого к минимуму
        Radio radio = new Radio();
        radio.setNumberCurrentStation(1);
        int expected = 1;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMaxBoundNumberStation() { // присвоение максимально допустимого значения номера радиостанции
        Radio radio = new Radio();
        radio.setNumberCurrentStation(9);
        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMoreMaxBoundNumberStation() { // присвоение значения номера радиостанции больше максимального
        Radio radio = new Radio();
        radio.setNumberCurrentStation(10);
        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLessMaxBoundNumberStation() { // присвоение допустимого пограничного значения номера радиостанции меньше максимума
        Radio radio = new Radio();
        radio.setNumberCurrentStation(8);
        int expected = 8;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToTheNextNumberStation() { // проверка переключателя на увеличение номера радиостанции
        Radio radio = new Radio();
        radio.setNumberCurrentStation(6);
        radio.nextNumberStation();
        int expected = 7;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToThePrevNumberStation() { // проверка переключателя на уменьшение номера радиостанции
        Radio radio = new Radio(25);
        radio.setNumberCurrentStation(6);
        radio.prevNumberStation();
        int expected = 5;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToThePrevMinimumNumberStation() { // проверка переключателя на уменьшение номера радиостанции при минимуме
        Radio radio = new Radio();
        radio.setNumberCurrentStation(0);
        radio.prevNumberStation();
        int expected = 9;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToTheNextMaximumNumberStation() { // проверка переключателя на увеличение номера радиостанции при максимуме
        Radio radio = new Radio();
        radio.setNumberCurrentStation(9);
        radio.nextNumberStation();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMaxBoundVolume() { // присвоение максимально допустимого значения звука
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLessMaxBoundVolume() { // присвоение допустимого пограничного значения звука меньше максимума
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMoreMaximumVolume() { // присвоение пограничного значения громкости звука больше максимума
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMinBoundVolume() { // присвоение минимального значения звука
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLessMinBoundVolume() { // присвоение допустимого пограничного значения звука меньше минимума
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMoreMinBoundVolume() { // присвоение пограничного значения громкости звука больше минимума
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchIncreaseVolume() { //  проверка переключателя на увеличение звука
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(55);
        radio.increaseVolume();
        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchIncreaseForMaxVolume() { //  проверка переключателя на увеличение звука при максимуме
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchDecreaseVolume() { //  проверка переключателя на уменьшение звука
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(55);
        int expected = 54;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchDecreaseForMinVolume() { //  проверка переключателя на уменьшение звука при минимальном значении
        Radio radio = new Radio();
        radio.setNumberCurrentVolume(0);
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
