package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

  @Test
  void switchStationCurrentToPrev() {
    Radio radio = new Radio(2);
    radio.setCurrentStation(1);
    radio.prev();
    int expected = 0;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void switchStationPrevToCurrent() {
    Radio radio = new Radio(10);
    radio.setCurrentStation(0);
    radio.prev();
    int expected = 9;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void shouldPrevStation() {
    Radio radio = new Radio();
    radio.setCurrentStation(9);
    radio.prev();
    int expected = 8;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void nextStation() {
    Radio radio = new Radio();
    radio.setCurrentStation(2);
    radio.next();
    int expected = 3;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }
  @Test
  void nextStationNegative() {
    Radio radio = new Radio(11);
    radio.setCurrentStation(10);
    radio.next();
    int expected = 0;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void setStationNum15() {
    Radio radio = new Radio();
    radio.setCurrentStation(15);

    int expected = 0;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void setStationNum9() {
    Radio radio = new Radio();
    radio.setCurrentStation(9);

    int expected = 9;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void setCurrentStationNum0() {
    Radio radio = new Radio();
    radio.setCurrentStation(0);

    int expected = 0;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void setStationNum5() {
    Radio radio = new Radio();
    radio.setCurrentStation(5);

    int expected = 5;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void setStationNumNegative() {
    Radio radio = new Radio();
    radio.setCurrentStation(-3);

    int expected = 0;
    int actual = radio.getCurrentStation();
    assertEquals(expected, actual);
  }

  @Test
  void plusVolume() {
    Radio radio = new Radio(0);
    radio.setCurrentStation(0);
    radio.plus();

    int expected = 1;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }

  @Test
  void plusVolumeMax() {
    Radio radio = new Radio();
    radio.setCurrentVolume(100);
    radio.plus();

    int expected = 100;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }

  @Test
  void reduceVolume() {
    Radio radio = new Radio();
    radio.setCurrentVolume(100);
    radio.reduce();

    int expected = 99;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }

  @Test
  void reduceVolumeMin() {
    Radio radio = new Radio();
    radio.setCurrentStation(0);
    radio.reduce();

    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
}



