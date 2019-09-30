
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author cim111
 */
public class RadioADTPROJECT {

    
    public static void main(String[] args)
    {
    RadioScanner station = new RadioScanner();
    station.setStation(870);
    station.loadAMStations();
    station.showAmStations();









    }
    
}