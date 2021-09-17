package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseStation(){

        Radio radio = new Radio();
           radio.currentStation = 8;
           int expected = 9;
           radio.increaseStation();
           int actual = radio.currentStation;

           assertEquals (expected, actual);

           }
    @Test
    public void shouldNotIncreaseStation(){

        Radio radio = new Radio();
        radio.currentStation = 11;
        int expected = 11;
        radio.increaseStation();
        int actual = radio.currentStation;

        assertEquals (expected, actual);

    }

    @Test
    public void shouldDecreaseStation(){

        Radio radio = new Radio();
        radio.currentStation = 8;
        int expected = 7;
        radio.decreaseStation();
        int actual = radio.currentStation;

        assertEquals (expected, actual);

    }

    @Test
    public void shouldNotDecreaseStationBelowMin() {

        Radio radio = new Radio();
        radio.currentStation = -1;
        int expected = 9;
        radio.decreaseStation();
        int actual = radio.currentStation;

        assertEquals(expected, actual);
    }

//    @Test
//
//    public void shouldEstablishStation0(){
//
//        Radio radio = new Radio();
//        radio.currentStation = 9;
//        int expected = 0;
//        radio.increaseStation();
//        int actual = radio.currentStation;
//
//        assertEquals (expected, actual);
//
//    }

    @Test
    public void shouldEstablishStation9(){

        Radio radio = new Radio();
        radio.currentStation = 0;
        int expected = 9;
        radio.decreaseStation();
        int actual = radio.currentStation;

        assertEquals (expected, actual);

    }

//    @Test
//    public void shouldEstablishMaxStation(){
//
//        Radio radio = new Radio();
//        radio.currentStation = 9;
//        int expected = 9;
//        radio.increaseStation();
//        int actual = radio.currentStation;
//
//        assertEquals (expected, actual);
//
//    }

    @Test
    public void shouldIncreaseVolume(){

        Radio radio = new Radio();
        radio.currentVolume = 5;
        int expected = 6;
        radio.increaseVolume();
        int actual = radio.currentVolume;

        assertEquals (expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolume(){

        Radio radio = new Radio();
        radio.currentVolume = 10;
        int expected = 10;
        radio.increaseVolume();
        int actual = radio.currentVolume;

        assertEquals (expected, actual);

    }


    @Test
    public void shouldDecreaseVolume() {

        Radio radio = new Radio();
        radio.currentVolume = 5;
        int expected = 4;
        radio.decreaseVolume();
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {

        Radio radio = new Radio();
        radio.currentVolume = -1;
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEstablishVolume10() {

        Radio radio = new Radio();
        radio.currentVolume = 10;
        int expected = 10;
        radio.increaseVolume();
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEstablishMaxVolume() {

        Radio radio = new Radio();
        radio.currentVolume = 11;
        int expected = 10;
        radio.increaseVolume();
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldEstablishVolume0() {

        Radio radio = new Radio();
        radio.currentVolume = 0;
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotEstablishMinVolume() {

        Radio radio = new Radio();
        radio.currentVolume = 1;
        int expected = 1;
        radio.decreaseStation();
        int actual = radio.currentVolume;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(6);

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetCurrentStationBelowMin () {

        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setCurrentStation(-2);

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetCurrentStationMoreMax () {

        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setCurrentStation(15);

        assertEquals(6, radio.getCurrentStation());
    }



    }
