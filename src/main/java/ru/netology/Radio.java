package ru.netology;

public class Radio {
    int currentStation;
    int currentVolume;


    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }

    public void maxStation() {
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void minStation() {
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void maxVolume() {
        if (currentVolume == 10) {
            this.currentVolume = currentVolume;
        }
    }

    public void minVolume() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
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


