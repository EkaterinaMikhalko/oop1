package ru.netology;

public class Radio {
    int currentStation;
    int currentVolume;


    public void increaseStation() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }

        if (currentStation == 10) {
            currentStation = 0;
        }

    }

    public void decreaseStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == -1) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume + 1;
        }

        if (currentVolume == 11) {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume >= 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == -1) {
            this.currentVolume = 0;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation () {
        return currentStation;
    }

}


