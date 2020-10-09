package LabSheet5.exercise3;

public class Thermometer {
    private int currentTemp = 0;
    private int maxTemp = Integer.MIN_VALUE;
    private int minTemp = Integer.MAX_VALUE;

    public static void main(String[] args) {

    }

    public Thermometer() {
        this(0, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public Thermometer(int currentTemp, int maxTemp, int minTemp) {
        setCurrentTemp(currentTemp);
        setMaxTemp(maxTemp);
        setMinTemp(minTemp);

    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setTemperature(int currentTemp,int maxTemp,int minTemp) {
        updateMaxMinTemp();
        this.currentTemp = currentTemp;
        this.maxTemp=maxTemp;
        this.minTemp=minTemp;
    }

    private void updateMaxMinTemp() {
        if (getCurrentTemp() > maxTemp)
            maxTemp = getCurrentTemp();
        if (getCurrentTemp() < minTemp)
            minTemp = getCurrentTemp();

    }
    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public String toString() {
        return "Temperature: " + getCurrentTemp() + "  Maximum Temperature: " + getMaxTemp() +
                "  Minimum Temperature: " + getMinTemp();
    }
}