package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


  @Test
  public void shouldStationSelectNum8() {
    Radio radio = new Radio();
    radio.setCurrentStation(8);

    int expected = 8;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }

  @Test
  public void shouldStationSelectNum9() {
    Radio radio = new Radio();
    radio.setCurrentStation(9);

    int expected = 9;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }

  @Test
  public void shouldStationSelectNum10() {
    Radio radio = new Radio();
    radio.setCurrentStation(10);

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void shouldStationSelectNum1() {
    Radio radio = new Radio();
    radio.setCurrentStation(1);

    int expected = 1;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }

  @Test
  public void shouldStationSelectNum0() {
    Radio radio = new Radio();
    radio.setCurrentStation(0);

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }

  @Test
  public void shouldStationSelectMinus1() {
    Radio radio = new Radio();
    radio.setCurrentStation(-1);

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void nextStationFrom8To9(){
    Radio radio = new Radio();
    radio.setCurrentStation(8);
    radio.next();

    int expected = 9;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void nextStationFrom9To0(){
    Radio radio = new Radio();
    radio.setCurrentStation(9);
    radio.next();

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void nextStationFrom0To1(){
    Radio radio = new Radio();
    radio.setCurrentStation(0);
    radio.next();

    int expected = 1;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void prevStationFrom9To8(){
    Radio radio = new Radio();
    radio.setCurrentStation(9);
    radio.prev();

    int expected = 8;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void prevStationFrom1To0(){
    Radio radio = new Radio();
    radio.setCurrentStation(1);
    radio.prev();

    int expected = 0;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void prevStationFrom0To9(){
    Radio radio = new Radio();
    radio.setCurrentStation(0);
    radio.prev();

    int expected = 9;
    int actual = radio.getCurrentStation();

    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentVolume5(){
    Radio radio = new Radio();
    radio.setCurrentVolume(5);
    int expected = 5;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentVolume10(){
    Radio radio = new Radio();
    radio.setCurrentVolume(10);
    int expected = 10;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentVolume0(){
    Radio radio = new Radio();
    radio.setCurrentVolume(0);
    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentMaxVolume(){
    Radio radio = new Radio();
    radio.setCurrentVolume(10);
    int expected = 10;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentMinVolume(){
    Radio radio = new Radio();
    radio.setCurrentVolume(0);
    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentAddVolume(){
    Radio radio = new Radio();
    radio.setCurrentVolume(5);
    radio.plus();
    int expected = 6;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentAddVolume0_1(){
    Radio radio = new Radio();
    radio.setCurrentVolume(0);
    radio.plus();
    int expected = 1;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentAddVolume8_9(){
    Radio radio = new Radio();
    radio.setCurrentVolume(8);
    radio.plus();
    int expected = 9;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentAddVolume9_10(){
    Radio radio = new Radio();
    radio.setCurrentVolume(9);
    radio.plus();
    int expected = 10;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentAddVolume10_10(){
    Radio radio = new Radio();
    radio.setCurrentVolume(10);
    radio.plus();
    int expected = 10;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolume10_9(){
    Radio radio = new Radio();
    radio.setCurrentVolume(10);
    radio.reduce();
    int expected = 9;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolume9_8(){
    Radio radio = new Radio();
    radio.setCurrentVolume(9);
    radio.reduce();
    int expected = 8;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolume6_5(){
    Radio radio = new Radio();
    radio.setCurrentVolume(6);
    radio.reduce();
    int expected = 5;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolume1_0(){
    Radio radio = new Radio();
    radio.setCurrentVolume(1);
    radio.reduce();
    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolumeLessMin(){
    Radio radio = new Radio();
    radio.setCurrentVolume(0);
    radio.reduce();
    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolumeNegative(){
    Radio radio = new Radio();
    radio.setCurrentVolume(-1);
    radio.reduce();
    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
  @Test
  public void setCurrentReduceVolumeMoreAllowed(){
    Radio radio = new Radio();
    radio.setCurrentVolume(11);
    radio.reduce();
    int expected = 0;
    int actual = radio.getCurrentVolume();
    assertEquals(expected, actual);
  }
}

