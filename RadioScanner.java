/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author cim111
 */
public class RadioScanner 
{
    private final Path amStationFile = Paths.get("amStations.txt");
    private final Path fmStationFile = Paths.get("fmStations.txt");

    private LLQueue<Integer> amStations = new LLQueue<>();
    private LLQueue<Double> fmStations = new LLQueue<>();

    private Frequency frequency;
    private final int amMIN = 570;
    private final int amMAX = 1610;
    private final int amInc = 10;
    private int currentAM;
    
    private final double fmInc = 0.2;
    private final double fmMIN = 87.9;
    private final double fmMAX = 107.9;
    private double currentFM;
    
    public RadioScanner(){
        
    }
    
    protected void tuneUp(){
        switch (frequency){
            case AM:
                if (currentAM == amMAX){
                    currentAM = amMIN;
                }else{
                    currentAM += amInc;
                }break;
            case FM:
                if (currentFM == fmMAX){
                    currentFM = fmMIN;
                }else{
                    currentAM += fmInc;
                }break; 
        } 
    }
    protected void tuneDown(){
        switch(frequency){
            case AM:
                if (currentAM == amMIN){
                    currentAM = amMAX;
                }else {
                    currentAM -= amInc;
                }break;
            case FM:
                if(currentFM == fmMIN){
                    currentFM = fmMAX;
                }else{
                    currentFM -= fmInc;
                }break;
        }
    }
    public void seekUp(){
        switch (frequency){
            case AM:
                int seekAM;
                LLNode<Integer> nextAM = amStations.returnHead();
                seekAM = nextAM.getElement();
                while(currentAM >= nextAM.getElement() && nextAM.hasNext()){
                    nextAM = nextAM.getNext();
                    if(nextAM.getElement() > currentAM){
                        seekAM = nextAM.getElement();
                    }       
                }currentAM = seekAM;
                break;
            case FM:
                int seekFM;
                LLNode<Integer> nextFM = fmStations.returnHead();
                seekFM = nextFM.getElement();
                while(currentFM >= nextFM.getElement()){
                    nextFM = nextFM.getNext();
                    if(nextFM.getElement() > currentFM){
                        seekFM = nextFM.getElement();
                    }
                }
                currentFM = nextFM.getElement();
                break;
        }
        
            
        }
    public void seekDown(){
        switch (frequency){
            case AM:
                LLNode<Integer> nextAM = amStations.returnHead();
                while(currentAM >= nextAM.getElement()){
                    nextAM.getNext();
                }
                currentAM = nextAM.getElement();
                break;
            case FM:
                LLNode<Integer> nextFM = fmStations.returnHead();
                while(currentFM >= nextFM.getElement()){
                    nextFM.getNext();
                }
                currentFM = nextFM.getElement();
                break;
        }
    }
    public void setStation(int am){
        currentAM = am;
    }
    public void setStation(double fm){
        currentFM = fm;
    }
    public void toggleFreq(){
        if (frequency == Frequency.AM){
            frequency = Frequency.FM;
        }else{
            frequency = Frequency.AM;
        }
    }
public void loadAMStations(){
        try{
            Scanner scan = new Scanner(amStationFile);
            while(scan.hasNext()){
                amStations.enqueue(scan.nextInt());
            }
        }catch (IOException | NoSuchElementException e){
            
        }
    }
public void showAmStations(){
    amStations.toString();
}
    public void loadFMStations(){
        try{
            Scanner scan = new Scanner(fmStationFile);
            while(scan.hasNext()){
                fmStations.enqueue(scan.nextDouble());
            }
        }catch (IOException | NoSuchElementException e){
            
        }

    
}
    public int getCurrentAM(){
        return currentAM;
    }
    public double getCurrentFM(){
        return currentFM;
    }
}