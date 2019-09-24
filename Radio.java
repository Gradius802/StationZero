/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author cim111
 */

public class Radio 
{
    
    //declare station variables
    private int AM = 510;
    private double FM = 87.9;
    
    //decalre booleans
    boolean isAM;
    boolean isOn;
    
    
    public void powerON()
    {
    
    Scanner file = new file[Resume.txt];
    
    
    }
    public void powerOff()
    {
    
 
    }
    public void setStation()
    {
    
 
    }
    
    public void seekUp()
    {
    if (isAM)
    {
        if (AM > 1610)
        {
            AM = 510;
        }
        else AM += 10;
    }
    else
    {
        if(FM > 107.9)
        {
            FM = 87.9;
        }
        else FM += .2;
    }
 
    }
    
    public void seekDown()
    {
    if (isAM)
    {
        if(AM < 510)
        {
            AM = 1610;
        }
        else AM -= 10;
        
    }
    else
    {
        if (FM < 87.9)
        {
            FM = 107.9;
        }
        
        else FM -= .2;
    }
 
    }
    
    public void setFavorite()
    {
        
        
 
    }
    public void swapRadio()
    {
    
 
    }
    
}
