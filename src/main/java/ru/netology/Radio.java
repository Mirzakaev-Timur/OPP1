package ru.netology;

public class Radio {
    private int currentStation;
    private int maxAmountStation = 10;

    public Radio (int maxAmountStation) {
        maxAmountStation = maxAmountStation;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxAmountStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < maxAmountStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxAmountStation -1;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void plus() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 100;
        }
    }
    public void reduce() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = 0;
        }
    }
}


