public class Radio {
    private int numberCurrentStation;
    private int soundVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        if (numberCurrentStation < 0) {
            return;
        }
        if (numberCurrentStation > maxStation) {
            return;
        }
        this.numberCurrentStation = numberCurrentStation;
    }

    public void nextNumberStation() {
        if (this.numberCurrentStation != maxStation) {
            numberCurrentStation++;
        } else {
            numberCurrentStation = 0;
        }
    }

    public void prevNumberStation() {
        if (numberCurrentStation != 0) {
            numberCurrentStation--;
        } else {
            numberCurrentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return soundVolume;
    }

    public void setNumberCurrentVolume(int numberCurrentVolume) {
        if (numberCurrentVolume < 0) {
            return;
        }
        if (numberCurrentVolume > 100) {
            return;
        }
        this.soundVolume = numberCurrentVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}
