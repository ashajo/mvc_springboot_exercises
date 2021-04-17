package se.lexicon.mvc_springboot_exercises.dto;

public class TempService {
    public int temp;

    public TempService() {
    }
    public String getTemperature(){
        if(temp>37){
            return "Fever Positive";
        }
        return "Negative";
    }
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp=temp;
    }
}
