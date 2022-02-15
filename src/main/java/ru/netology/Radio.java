package ru.netology;

public class Radio<currentVolume> {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = 9;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
            if (currentVolume > 10){
            return;
    }
        this.currentVolume = currentVolume;
}

    public void plus() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 10;
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



