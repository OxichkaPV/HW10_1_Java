public class Radio {
    private int numberCurrentStation;
    private int soundVolume;

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        if (numberCurrentStation < 0) {
            return;
        }
        if (numberCurrentStation > 9) {
            return;
        }
        this.numberCurrentStation = numberCurrentStation;
    }

    public void nextNumberStation() {
        if (this.numberCurrentStation != 9) {
            numberCurrentStation++;
        } else {
            numberCurrentStation = 0;
        }
    }

    public void prevNumberStation() {
        if (numberCurrentStation != 0) {
            numberCurrentStation--;
        } else {
            numberCurrentStation = 9;
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
