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
public class Station {
    
    private int isAM()
    {
        int output = 510;
        if (output >= 1710)
            output = 510;
        else if (output <= 510)
            output = 1710;
         
        return output;
    }
}
