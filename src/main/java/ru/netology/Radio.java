package ru.netology;

public class Radio {
    int currentStation;
    int currentVolume;
    int numberOfStations = 10;
    int maxStation = numberOfStations - 1;
    int maxVolume = 100;

    public Radio (){}

    public Radio (int numberOfStations){
        this.numberOfStations = numberOfStations;
    }



    public void increaseStation() {
        if (currentStation <= maxStation) {
            currentStation = currentStation + 1;
        }

        if (currentStation == maxStation+1) {
            currentStation = 0;
        }

    }

    public void decreaseStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == -1) {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume + 1;
        }

        if (currentVolume == 101) {
            this.currentVolume = 100;
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
        int maxStation = numberOfStations - 1;
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation () {
        return currentStation;
    }

}


