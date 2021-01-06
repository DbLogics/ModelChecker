/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structural_Analysis;

/**
 *
 * @author rk nanda
 */
public class start {

    /**
     * @param args the command line arguments
     */
    public void read(String s) throws Exception
    {
        IFCRELASSOCIATESPROFILEPROPERTIES i=new IFCRELASSOCIATESPROFILEPROPERTIES();
        i.read(s);
        IFCRelconnectsStructuralActivity ii=new IFCRelconnectsStructuralActivity();
        ii.read(s);
        
    }
   
    
    
}
