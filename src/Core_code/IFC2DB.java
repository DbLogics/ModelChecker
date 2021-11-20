/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core_code;

import Database_Connectivity.Connect;

import Core_code.Splitting;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.Math.sqrt;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.prefs.Preferences;

/**
 *
 * @author Dell
 */
public class IFC2DB {
    
       String Element="";
    String id,text="";
    String str="";
    String tag;
    String data;
    String[] d;
    char current;
    int Id;
    String ref,ref1,ref2;
    Iterator n;
    ResultSet rs;
    String min,max;
    static Double mini,maxi;
    Connect m;
    String type="";
    String length="";
    String breadth="";
    Connect c;
    int fileId;
    public IFC2DB()
    {
        c=new Connect();
    }
    
    public String checkNumeric( String value)
    {
                        if(value.endsWith("."))
                        {
                           value=value.substring(0, value.length()-1); 
                        }
                        if(value.equals(""))
                        {
                            value="0";
                        }
                        return value;
    }
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
     public void read(String filePath, String fileName) throws Exception
    {
        Collection<String> col=new ArrayList<>();
        File f=new File(filePath);
	FileInputStream fis = new FileInputStream(f);
        String time=LocalDateTime.now().toLocalDate().toString();
        Preferences userPreferences = Preferences.userRoot();
                    String userid = userPreferences.get("userid","0");
        c.createFile(fileName,time,Integer.parseInt(userid));
        c.DmlStatement();
        
        c.getLatestFile();
        ResultSet fileData=c.DqlStatement();
        
        if(fileData.next())
        {
                fileId=fileData.getInt("Id");
               userPreferences.put("fileid",Integer.toString(fileId));
        }
        while (fis.available() > 0) 
        {
            current = (char) fis.read();
        
            if(current!=';')
            {
                str=str+current;
                continue;
            }
  
            else
            {       
                long hashno=0;
                col=Splitting.read(str,'#');
                if(col.isEmpty())
                {
                    str="";
                    continue;
                }
                n=col.iterator();
                
                if(n.hasNext())
                {
                    String s=n.next().toString();
                    
                    
                    Element=n.next().toString();
                }
                          
                col=Splitting.read(Element,'=');
                
                n=col.iterator();
                
                if(n.hasNext())
                {
                    id=n.next().toString();
                    
                    
                    
                    text=n.next().toString();
                }
                             
                col=Splitting.read(text,'(');
                n=col.iterator();
                if(n.hasNext())
                {
                    tag=n.next().toString();
                    data=n.next().toString();
                }
                
               
              
                Id=Integer.parseInt(id);
                hashno=Long.parseLong(id);
              
                switch(tag.trim())
                {
                    case "IFCORGANIZATION":
                    d=data.replace(")", "").split(",");
                    c.createOrganization(hashno,d[1],fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCPERSON":
                    d=data.replace(")", "").split(",");
                    c.createPerson(hashno,d[2],fileId);
                    c.DmlStatement();
                    break;
                    
                    
                    case "IFCPERSONANDORGANIZATION":
                    d=data.replace(")", "").split(",");
                    c.createPersonOrganization(hashno,d[0].replace("#",""),d[1].replace("#",""),fileId);
                    c.DmlStatement();
                    break;    
                        
                        
                    case "IFCAPPLICATION":
                    d=data.replace(")", "").split(",");
                    c.createApplication(hashno,d[1],d[2],d[3],fileId);
                    c.DmlStatement();
                    break;
                    
                    
                        
                    case "IFCOWNERHISTORY":
                    d=data.split(",");
                    c.createOwnerHistory(hashno,d[0].replace("#",""),d[1].replace("#",""),fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCCARTESIANPOINT":
                    data=data.replace("(", "");
                    data=data.replace(")", "");
                    d=data.split(",");
                    if(d.length>2)
                    {
                        d[0]=checkNumeric(d[0]);
                        d[1]=checkNumeric(d[1]);
                        d[2]=checkNumeric(d[2]);
                       
                        c.createCartesianPoint(hashno,Float.parseFloat(d[0]),Float.parseFloat(d[1]),Float.parseFloat(d[2]),fileId);
                    }
                    else
                    {
                        d[0]=checkNumeric(d[0]);
                        d[1]=checkNumeric(d[1]);
                        c.createCartesianPoint(hashno,Float.parseFloat(d[0]),Float.parseFloat(d[1]),fileId);
                    }
                    c.DmlStatement();
                    break;
                        
                    case "IFCDIRECTION":
                    data=data.replace("(", "");
                    data=data.replace(")", "");
                    d=data.replace(")", "").split(",");
                    if(d.length>2)
                    {
                        d[0]=checkNumeric(d[0]);
                        d[1]=checkNumeric(d[1]);
                        d[2]=checkNumeric(d[2]);
                       
                        c.createDirection(hashno,Float.parseFloat(d[0]),Float.parseFloat(d[1]),Float.parseFloat(d[2]),fileId);
                    }
                    else
                    {
                        d[0]=checkNumeric(d[0]);
                        d[1]=checkNumeric(d[1]);
                        c.createDirection(hashno,Float.parseFloat(d[0]),Float.parseFloat(d[1]),fileId);
                    }
                    c.DmlStatement();
                    break;
                    
                    
                    case "IFCAXIS2PLACEMENT3D":
                    d=data.replace(")", "").split(",");
                    Long cartesianhashno=Long.parseLong(d[0].replace("#",""));
                    Long direction1=d[1].replace("#","").replace(")","").trim().equals("$")?null:Long.parseLong(d[1].replace("#","").replace(")","").trim());
                    Long direction2=d[2].replace("#","").replace(")","").trim().equals("$")?null:Long.parseLong(d[2].replace("#","").replace(")","").trim());
                    
                    if(direction1!=null && direction2!=null)
                    {
                        c.createAxis2Placement3D(hashno,cartesianhashno,direction1,direction2,fileId);
                    }
                    else if(direction1!=null && direction2==null)
                    {
                        c.createAxis2Placement3DDir1(hashno,cartesianhashno,direction1,fileId);
                    }
                    else if(direction1==null && direction2!=null)
                    {
                        c.createAxis2Placement3DDir2(hashno,cartesianhashno,direction2,fileId);
                    }
                    else
                    {
                        c.createAxis2Placement3D(hashno,cartesianhashno,fileId);
                    }
                    
                    c.DmlStatement();
                    break;
                    
                    
                    case "IFCAXIS2PLACEMENT2D":
                    d=data.replace(")", "").split(",");
                    cartesianhashno=Long.parseLong(d[0].replace("#",""));
                    direction1=d[1].replace("#","").replace(")","").trim().equals("$")?null:Long.parseLong(d[1].replace("#","").replace(")","").trim());
                    
                    
                    if(direction1!=null)
                    {
                        c.createAxis2Placement2D(hashno,cartesianhashno,direction1,fileId);
                    }
                    else
                    {
                        c.createAxis2Placement2D(hashno,cartesianhashno,fileId);
                    }
                    
                    c.DmlStatement();
                    break;
                    
                    case "IFCLOCALPLACEMENT":
                    d=data.replace(")", "").split(",");
                    String parenthashno=d[0].replace("#","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace(")","").trim();
                    String axis2placementhashno=d[1].replace("#","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace(")","").trim();
                    
                    if(!isNullOrEmpty(parenthashno) && !isNullOrEmpty(axis2placementhashno))
                    {
                        c.createLocalPlacement(hashno,Long.parseLong(parenthashno),Long.parseLong(axis2placementhashno),fileId);
                    }
                    else if(!isNullOrEmpty(parenthashno) && isNullOrEmpty(axis2placementhashno))
                    {
                        c.createLocalPlacementWithParent(hashno,Long.parseLong(parenthashno),fileId);
                    }
                    else if(isNullOrEmpty(parenthashno) && !isNullOrEmpty(axis2placementhashno))
                    {
                        c.createLocalPlacementWithAxis(hashno,Long.parseLong(axis2placementhashno),fileId);
                    }
                    else
                    {
                        c.createLocalPlacement(hashno,fileId);
                    }
                   
                    
                    c.DmlStatement();
                    break;
                        
                    case "IFCGEOMETRICREPRESENTATIONCONTEXT":
                    d=data.replace(")", "").split(",");
                    c.createGeometricRepresentationContext(hashno,d[1].replace("'",""),fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCGEOMETRICREPRESENTATIONSUBCONTEXT":
                    d=data.split(",");
                    c.createGeometricRepresentationSubContext(hashno,d[0].replace("'",""),d[6].replace("#",""),fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCBUILDINGSTOREY":
                    d=data.replace(")", "").split(",");
                    d[9]=checkNumeric(d[9]);
                    c.createBuildingStorey(hashno,d[0].replace("'",""),d[1].replace("#",""),d[2].replace("'",""),d[5].replace("#",""),d[9],fileId);
                    c.DmlStatement();    
                    break;    
                        
                    case "IFCRECTANGLEPROFILEDEF":
                    d=data.split(",");
                    d[3]=checkNumeric(d[3]);
                    d[4]=checkNumeric(d[4]);
                    
                    String length=d[3].replace("#","").replace(")","").trim().equals("$")?null:d[3].replace("#","").replace(")","").trim();
                    String breath=d[4].replace("#","").replace(")","").trim().equals("$")?null:d[4].replace("#","").replace(")","").trim();
                    
                   
                    if(!isNullOrEmpty(length) && !isNullOrEmpty(breath))
                    {
                        c.createRectangleProfileDef(hashno,d[0].replace(".",""),d[1].replace("'",""),Float.parseFloat(length),Float.parseFloat(breath),d[2].replace("#",""),fileId);
                    }
                    else if(!isNullOrEmpty(length) && isNullOrEmpty(breath))
                    {
                       c.createRectangleProfileDefWithLength(hashno,d[0].replace(".",""),d[1].replace("'",""),Float.parseFloat(length),d[2].replace("#",""),fileId);
                    }
                    else if(isNullOrEmpty(length) && !isNullOrEmpty(breath))
                    {
                        c.createRectangleProfileDefWithBreath(hashno,d[0].replace(".",""),d[1].replace("'",""),Float.parseFloat(breath),d[2].replace("#",""),fileId);
                    }
                    else
                    {
                       c.createRectangleProfileDef(hashno,d[0].replace(".",""),d[1].replace("'",""),d[2].replace("#",""),fileId);
                    }
                    
                    c.DmlStatement();
                    break;
                        
                    case "IFCEXTRUDEDAREASOLID":
                    d=data.replace(")", "").split(",");
                    d[3]=checkNumeric(d[3]);
                    c.createExtrudedAreaSolid(hashno,d[0].replace("#",""),d[1].replace("#",""),d[2].replace("#",""),Float.parseFloat(d[3]),fileId);
                    c.DmlStatement();    
                    break;
                    
                    case "IFCCOLOURRGB":
                    d=data.replace(")", "").split(",");
                    d[1]=checkNumeric(d[1]);
                    d[2]=checkNumeric(d[2]);
                    d[3]=checkNumeric(d[3]);
                    c.createColourRGB(hashno,Float.parseFloat(d[1]),Float.parseFloat(d[2]),Float.parseFloat(d[3]),fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCSURFACESTYLERENDERING":
                    d=data.replace(")", "").split(",");
                    d[1]=checkNumeric(d[1]);
                    String NormalisedRatioMeasure=checkNumeric(d[6].replace("IFCNORMALISEDRATIOMEASURE(", "").replace(")",""));
                    String SpectularExponent=checkNumeric(d[7].replace("IFCSPECULAREXPONENT(", "").replace(")",""));
                    c.createSurfaceRendering(hashno,d[0].replace("#",""),d[1],NormalisedRatioMeasure,SpectularExponent,fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCSURFACESTYLE":
                    d=data.replace(")", "").split(",");
                    c.createSurfaceStyle(hashno,d[0],d[2].replace("#","").replace("(","").replace(")",""),fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCPRESENTATIONSTYLEASSIGNMENT":
                    d=data.replace(")", "").split(",");
                    c.createPresentationStyleAssignment(hashno,d[0].replace("#","").replace("(","").replace(")",""),fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCSTYLEDITEM":
                    d=data.replace(")", "").split(",");
                    
                    String extrudedareasolidhashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace(")","").trim();
                    String presentationStyleAssignmentHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace(")","").trim();
                    
                     if(!isNullOrEmpty(extrudedareasolidhashNo) && !isNullOrEmpty(presentationStyleAssignmentHashNo))
                    {
                        c.createStyledItem(hashno,d[0].replace("#","").replace("(","").replace(")",""),d[1].replace("#","").replace("(","").replace(")",""),fileId);
                    }
                    else if(!isNullOrEmpty(extrudedareasolidhashNo) && isNullOrEmpty(presentationStyleAssignmentHashNo))
                    {
                       c.createStyledItemWithExtruded(hashno,d[0].replace("#","").replace("(","").replace(")",""),fileId);
                    }
                    else if(isNullOrEmpty(extrudedareasolidhashNo) && !isNullOrEmpty(presentationStyleAssignmentHashNo))
                    {
                        c.createStyledItemwithAssignment(hashno,d[1].replace("#","").replace("(","").replace(")",""),fileId);
                    }
                    else
                    {
                       c.createStyledItem(hashno,fileId);
                    }
                    
                    c.DmlStatement();    
                    break;
                        
                    case "IFCSHAPEREPRESENTATION":
                    String[] forwards=data.replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                    
                    String geometrichashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createShapeRepresentation(hashno,geometrichashNo,d[1].replace("'",""),d[2].replace("'",""),fileId);
                    c.DmlStatement(); 
                    
                    c.createShapeRepresentationMapping(hashno, forwards, fileId);
                    break;
                    
                    case "IFCPRODUCTDEFINITIONSHAPE":
                        String[] shapes=data.replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                    
                    //String ShaperepresentationHashNo=d[2].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[2].replace("#","").replace("(","").replace(")","").trim();
                    c.createProductDefinationShape(hashno,fileId);
                    c.DmlStatement(); 
                    
                    c.createProductDefinationShapeMapping(hashno, shapes, fileId);
                    break;
                        
                    case "IFCSLAB":
                    d=data.replace(")", "").split(",");
                    
                    String OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String LocalPlacementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    String ProductDefinationHashNo=d[6].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[6].replace("#","").replace("(","").replace(")","").trim();
                    c.createSlab(hashno,d[0].replace("'",""),OwnerHistoryHashNo,LocalPlacementHashNo,ProductDefinationHashNo,d[2],fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCMATERIAL":
                    d=data.replace(")", "").split(",");
                    c.createMaterial(hashno,d[0],fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCMATERIALDEFINITIONREPRESENTATION":
                    d=data.replace(")", "").split(",");
                    String StyledRepresentationHahNo=d[2].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[2].replace("#","").replace("(","").replace(")","").trim();
                    String MaterialHashNo=d[3].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[3].replace("#","").replace("(","").replace(")","").trim();
                    c.createMaterialDefinationRepresentation(hashno,StyledRepresentationHahNo,MaterialHashNo,fileId);
                    c.DmlStatement();    
                    break;
                        
                    case "IFCMATERIALLAYER":
                    d=data.replace(")", "").split(",");
                    MaterialHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    String Thickness=checkNumeric(d[1]);
                    c.createMaterialLayer(hashno,MaterialHashNo,Thickness,fileId);
                    c.DmlStatement();  
                    break;
                    
                    case "IFCMATERIALLAYERSET":
                    d=data.replace(")", "").split(",");
                    String MaterialLayerHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    c.createMaterialLayerSet(hashno,MaterialLayerHashNo,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCMATERIALLAYERSETUSAGE":
                    d=data.replace(")", "").split(",");
                    String MaterialLayerSetHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    String LayerSetDirection=d[1].replace(".","");
                    String DirectionSense=d[2].replace(".","");
                    c.createMaterialLayerSetUsage(hashno,MaterialLayerSetHashNo,LayerSetDirection,DirectionSense,fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCSTYLEDREPRESENTATION":
                    d=data.replace(")", "").split(",");
                    String SurfaceStyleHashNo=d[3].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[3].replace("#","").replace("(","").replace(")","").trim();
                    String GeometricRepresentationHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    String Name=d[1].replace("'","");
                    String Type=d[2].replace("'","");
                    c.createStyledRepresentation(hashno,GeometricRepresentationHashNo,SurfaceStyleHashNo,Name,Type,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCPROPERTYSINGLEVALUE":
                    d=data.replace(")", "").split(",");
                    Name=d[0].replace("'","");
                    String Value=d[2].replace("'","")+")";
                    c.createPropertySingleValue(hashno,Name,Value,fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCPROPERTYSET":
                    Long PropertySetNo=hashno;
                    String[] properties=data.replace("(Mapping)","").replace("(Expression)","").replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                    
                    String GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    Name=d[2].replace("'","");
                     // Propery Mapping with Set            
                    
                    c.createPropertySet(hashno,GlobalId,OwnerHistoryHashNo,Name,fileId);
                    c.DmlStatement();
                   
                    c.createPropertyValueMapping(PropertySetNo,properties,fileId);                  
                    break;
                        
                    case "IFCRELDEFINESBYPROPERTIES":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String ProperySetHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    String EntityHashNo=d[4].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[4].replace("#","").replace("(","").replace(")","").trim();
                    c.createRelDefineByProperties(hashno,GlobalId,OwnerHistoryHashNo,ProperySetHashNo,EntityHashNo,fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCOPENINGELEMENT":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    Name=d[2].replace("'","");
                    Type=d[4].replace("'","");
                    LocalPlacementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    ProductDefinationHashNo=d[6].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[6].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createOpeningElement(hashno,GlobalId,OwnerHistoryHashNo,Name,Type,LocalPlacementHashNo,ProductDefinationHashNo,fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCWALLTYPE":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    Name=d[2].replace("'","");
                    Type=d[9].replace("'","").replace(".", "");
                    
                    c.createWallType(hashno,GlobalId,OwnerHistoryHashNo,Name,Type,fileId);
                    c.DmlStatement();
                    break;    
                        
                        
                    case "IFCWALLSTANDARDCASE":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    LocalPlacementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    ProductDefinationHashNo=d[6].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[6].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createWallStandardCase(hashno,GlobalId,OwnerHistoryHashNo,LocalPlacementHashNo,ProductDefinationHashNo,d[2],fileId);
                    c.DmlStatement();
                    break; 
                        
                    case "IFCRELASSOCIATESMATERIAL":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    Name=d[2].replace("'","");
                    String RelatedObjectHashNo=d[4].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[4].replace("#","").replace("(","").replace(")","").trim();
                    String RelatedMaterialHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createRelAssociateMaterial(hashno,GlobalId,OwnerHistoryHashNo,Name,RelatedObjectHashNo,RelatedMaterialHashNo,fileId);
                    c.DmlStatement();
                    break;
                        
                    case "IFCPRESENTATIONLAYERASSIGNMENT":
                    Long PresentationLayetAssignmentHashNo=hashno;
                    String[] shaperepresentations=data.replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                    
                    Name=d[0].replace("'","");
                   
                     // Propery Mapping with Set            
                    
                    c.createPresentationLayerAssignment(hashno,Name,fileId);
                    c.DmlStatement();
                   
                    c.createPresentationLayerShapeMapping(PresentationLayetAssignmentHashNo,shaperepresentations,fileId);                  
                    break;
                        
                    case "IFCBOOLEANCLIPPINGRESULT":
                    d=data.replace(")", "").split(",");
                    
                    extrudedareasolidhashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String polygonhalfboundedspacehashno=d[2].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[2].replace("#","").replace("(","").replace(")","").trim();
                                      
                    c.createBooleanClippingResult(hashno,extrudedareasolidhashNo,polygonhalfboundedspacehashno,fileId);
                    c.DmlStatement();
                    break; 
                        
                    case "IFCPOLYLINE":
                        
                    Long PolylineHashNo=hashno;
                    String[] cartesians=data.replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                   
                     // Propery Mapping with Set            
                    
                    c.createPolyline(hashno,fileId);
                    c.DmlStatement();
                   
                    c.createPolylineCartesianMapping(PolylineHashNo,cartesians,fileId);                  
                    break;
                    
                    
                    case "IFCPOLYGONALBOUNDEDHALFSPACE":
                    d=data.replace(")", "").split(",");
                    
                    String PlaneHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    axis2placementhashno=d[2].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[2].replace("#","").replace("(","").replace(")","").trim();
                    String polylinehashno=d[3].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[3].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createPolygonalBoundedHalfSpace(hashno,PlaneHashNo,axis2placementhashno,polylinehashno,fileId);
                    c.DmlStatement();
                    break; 
                        
                    case "IFCRELCONNECTSPATHELEMENTS":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    Name=d[2].replace("'","");
                    String RelatingElement1HashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    String RelatingElement2HashNo=d[6].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[6].replace("#","").replace("(","").replace(")","").trim();
                    String RelatingElement1ConnectionType=d[9].replace(".","");
                    String RelatingElement2ConnectionType=d[10].replace(".","");
                    c.createRelConnectsPathElements(hashno,GlobalId,OwnerHistoryHashNo,Name,RelatingElement1HashNo,RelatingElement2HashNo,RelatingElement1ConnectionType,RelatingElement2ConnectionType,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCRELCONTAINEDINSPATIALSTRUCTURE":
                    Long RelContainedHashNo=hashno;
                    String StoreyHashNo=data.split("\\(")[1].split("\\)")[1].replace(",","").replace("#","");
                    String[] Entities=data.split("\\(")[1].split("\\)")[0].split(",");
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                     // Propery Mapping with Set            
                    if(!isNullOrEmpty(StoreyHashNo))
                    {
                    c.createRelContainedInSpatialStructure(hashno,StoreyHashNo,OwnerHistoryHashNo,fileId);
                    c.DmlStatement();
                   
                    c.createRelContainedInSpatialStructureMapping(RelContainedHashNo,Entities,fileId);                  
                    }
                    break;  
                    
                    case "IFCRELVOIDSELEMENT":
                    d=data.replace(")", "").split(",");
                    GlobalId=d[0].replace("'","");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    String WallStandardCaseHashNo=d[4].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[4].replace("#","").replace("(","").replace(")","").trim();
                    String OpeningElementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                   
                    c.createRelVoidsElement(hashno,GlobalId,OwnerHistoryHashNo,WallStandardCaseHashNo,OpeningElementHashNo,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCPLANE":
                    d=data.replace(")", "").split(",");
                    
                    
                    axis2placementhashno=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    
                    
                    c.createPlane(hashno,axis2placementhashno,fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCSIUNIT":
                    d=data.replace(")", "").split(",");
                    
                    c.createSIUnit(hashno,d[1].trim(),d[2].trim(),d[3].trim(),fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCMEASUREWITHUNIT":
                    d=data.replace(")", "").split(",");
                    String SIUnitHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String dataof=d[0].replace("IFCTIMEMEASURE(", "").replace("IFCRATIOMEASURE(","").replace("IFCPLANEANGLEMEASURE(", "").replace(")","").trim();
                    c.createMeasureWithUnit(hashno,dataof,SIUnitHashNo,fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCDIMENSIONALEXPONENTS":
                    d=data.replace(")", "").split(",");
                    c.createDimensionalExponent(hashno,d[0],d[1],d[2],d[3],d[4],d[5],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCCONVERSIONBASEDUNIT":
                    d=data.replace(")", "").split(",");
                    String DimensionalHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    String MeasureHashNo=d[3].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[3].replace("#","").replace("(","").replace(")","").trim();
                    c.createConversionBasedUnit(hashno,DimensionalHashNo,d[1],d[2],MeasureHashNo,fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCMONETARYUNIT":
                    d=data.replace(")", "").split(",");
                    c.createMonetaryUnit(hashno,d[0],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCDERIVEDUNIT":
                    String[] unitelements=data.split("\\(")[1].split("\\)")[0].split(",");
                    d=data.replace(")", "").split(",");
                    c.createDerivedUnit(hashno,d[1],fileId);
                    c.DmlStatement();
                    
                    c.createDerivedUnitMapping(hashno,unitelements,fileId);
                    break; 
                    
                    case "IFCDERIVEDUNITELEMENT":
                    d=data.replace(")", "").split(",");
                    SIUnitHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    c.createDerivedUnitElement(hashno,SIUnitHashNo,d[1],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCUNITASSIGNMENT":
                    String[] elements=data.replace(")", "").split("\\(")[1].split(",");
                    
                    d=data.replace(")", "").split(",");
                    c.createUnitAssignment(hashno,fileId);
                    c.DmlStatement();
                    
                    c.createUnitAssignmentMapping(hashno,elements,fileId);
                    break;
                    
                    case "IFCPROJECT":
                    String[] geoelements=data.replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String UnitAssignmentHashNo=d[7].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[7].replace("#","").replace("(","").replace(")","").trim();
                    c.createProject(hashno,d[0],OwnerHistoryHashNo,d[2],UnitAssignmentHashNo,fileId);
                    c.DmlStatement();
                    
                    c.createProjectMapping(hashno,geoelements,fileId);
                    break; 
                    
                    case "IFCSITE":
                    
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    LocalPlacementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    c.createSite(hashno,d[0],OwnerHistoryHashNo,d[2],LocalPlacementHashNo,d[8],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCRELAGGREGATES":
                    String[] sites=data.replace(")", "").split("\\(")[1].split(",");
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String ProjectHashNo=d[4].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[4].replace("#","").replace("(","").replace(")","").trim();
                    c.createRelAggregates(hashno,d[0],OwnerHistoryHashNo,ProjectHashNo,fileId);
                    c.DmlStatement();
                    
                    c.createRelAggregatesMapping(hashno,sites,fileId);
                    break; 
                    
                    case "IFCARBITRARYCLOSEDPROFILEDEF":
                    
                    d=data.replace(")", "").split(",");
                    polylinehashno=d[2].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[2].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createArbitaryClosedProfile(hashno,d[0].replace(".", ""),d[1],polylinehashno,fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCQUANTITYLENGTH":
                    
                    d=data.replace(")", "").split(",");
                    d[3]=checkNumeric(d[3]);
                    c.createQuantityLength(hashno,d[0].replace(".", ""),d[3],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCQUANTITYVOLUME":
                    
                    d=data.replace(")", "").split(",");
                    d[3]=checkNumeric(d[3]);
                    c.createQuantityVoulume(hashno,d[0].replace(".", ""),d[3],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCQUANTITYAREA":
                    
                    d=data.replace(")", "").split(",");
                    d[3]=checkNumeric(d[3]);
                    c.createQuantityArea(hashno,d[0].replace(".", ""),d[3],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCELEMENTQUANTITY":
                    String[] quantities=data.replace(")", "").split("\\(")[2].split(",");
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    c.createElementQuantity(hashno,d[0],OwnerHistoryHashNo,d[2],d[4],fileId);
                    c.DmlStatement();
                    
                    c.createElementQuantityMapping(hashno,quantities,fileId);
                    break;
                    
                    case "IFCPOLYLOOP":
                    String[] points=data.replace(")", "").split("\\(")[1].split(",");
                    
                    c.createPolyloop(hashno,fileId);
                    c.DmlStatement();
                    
                    c.createPolyloopMapping(hashno,points,fileId);
                    break;
                    
                    case "IFCFACEOUTERBOUND":
                    
                    d=data.replace(")", "").split(",");
                    String PolyloopHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
   
                    c.createFaceOuterBound(hashno,PolyloopHashNo,d[1],fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCFACE":
                    String[] faceouterbounds=data.replace(")", "").split("\\(")[1].split(",");
                    
                    c.createFace(hashno,fileId);
                    c.DmlStatement();
                    
                    c.createFaceMapping(hashno,faceouterbounds,fileId);
                    break;
                    
                    case "IFCCLOSEDSHELL":
                    String[] faces=data.replace(")", "").split("\\(")[1].split(",");
                    
                    c.createClosedShell(hashno,fileId);
                    c.DmlStatement();
                    
                    c.createClosedShellMapping(hashno,faces,fileId);
                    break;
                    
                    case "IFCFACETEDBREP":
                    
                    d=data.replace(")", "").split(",");
                    String ClosedShellHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
   
                    c.createFacetedBrep(hashno,ClosedShellHashNo,fileId);
                    c.DmlStatement();
                    break; 
                    
                    
                    case "IFCOPENSHELL":
                    
                    faces=data.replace(")", "").split("\\(")[1].split(",");
                    
                    c.createOpenShell(hashno,fileId);
                    c.DmlStatement();
                    
                    c.createOpenShellMapping(hashno,faces,fileId);
                    break;
                    
                    case "IFCSHELLBASEDSURFACEMODEL":
                    
                    String[] openshells=data.replace(")", "").split("\\(")[1].split(",");
                    
                    c.createShellBasedSurfaceModel(hashno,fileId);
                    c.DmlStatement();
                    
                    c.createShellBasedMapping(hashno,openshells,fileId);
                    break;
                    
                    case "IFCCARTESIANTRANSFORMATIONOPERATOR3D":
                    
                    d=data.replace(")", "").split(",");
                    String CartesianPointHashNo=d[2].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[2].replace("#","").replace("(","").replace(")","").trim();
   
                    c.createCartesianTransformation(hashno,CartesianPointHashNo,fileId);
                    c.DmlStatement();
                    break; 
                    
                    case "IFCMAPPEDITEM":
                    
                    d=data.replace(")", "").split(",");
                    String RepresentationMapHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    String CartesianTransHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
   
                    c.createMappedItem(hashno,RepresentationMapHashNo,CartesianTransHashNo,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCREPRESENTATIONMAP":
                    
                    d=data.replace(")", "").split(",");
                    String Axis2PlacementHashNo=d[0].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[0].replace("#","").replace("(","").replace(")","").trim();
                    String ShapeReprentationHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
   
                    c.createRepresentationMap(hashno,Axis2PlacementHashNo,ShapeReprentationHashNo,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCWINDOW":
                    
                    d=data.replace(")", "").split(",");
                    LocalPlacementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    ProductDefinationHashNo=d[6].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[6].replace("#","").replace("(","").replace(")","").trim();
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    d[8]=checkNumeric(d[8]);
                    d[9]=checkNumeric(d[9]);
                    c.createWindow(hashno,d[0],OwnerHistoryHashNo,d[2],LocalPlacementHashNo,ProductDefinationHashNo,d[8],d[9],fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCRELFILLSELEMENT":
                    
                    d=data.replace(")", "").split(",");
                    String ElementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    OpeningElementHashNo=d[4].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[4].replace("#","").replace("(","").replace(")","").trim();
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    c.createRelfilsElement(hashno,d[0],OwnerHistoryHashNo,OpeningElementHashNo,ElementHashNo,fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCWINDOWSTYLE":
                    String[] windowprops=data.split("\\(")[1].split("\\)")[0].split(",");
                    d=data.replace(")", "").split(",");
                   
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                   
                    c.createWindowStyle(hashno,d[0],OwnerHistoryHashNo,d[2],d[8],d[9],d[11],fileId);
                    c.DmlStatement();
                    
                    c.createWindowStyleMapping(hashno,windowprops,fileId);
                    break;
                    
                    case "IFCWINDOWLININGPROPERTIES":
                    
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    d[4]=checkNumeric(d[4]);
                    d[5]=checkNumeric(d[5]);
                    c.createWindowLiningProperties(hashno,d[0],OwnerHistoryHashNo,d[2],d[4],d[5],fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCWINDOWPANELPROPERTIES":
                    
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    d[6]=checkNumeric(d[6]);
                    d[7]=checkNumeric(d[7]);
                    c.createWindowPanelProperties(hashno,d[0],OwnerHistoryHashNo,d[2],d[4],d[5],d[6],d[7],fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCRELDEFINESBYTYPE":
                    String[] windows=data.replace(")", "").split("\\(")[1].split("\\)")[0].split(",");
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    String WindowStleHashNo=data.split("\\(")[1].split("\\)")[1].split(",")[1];
                    WindowStleHashNo=WindowStleHashNo.replace("#","").replace("(","").replace(")","").trim().equals("$")?null:WindowStleHashNo.replace("#","").replace("(","").replace(")","").trim();
                   
                    c.createRelDefinesByType(hashno,d[0],OwnerHistoryHashNo,WindowStleHashNo,fileId);
                    c.DmlStatement();
                    
                    c.createRelDefinesMapping(hashno,windows,fileId);
                    break;
                    
                    case "IFCDOOR":
                    
                    d=data.replace(")", "").split(",");
                    LocalPlacementHashNo=d[5].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[5].replace("#","").replace("(","").replace(")","").trim();
                    ProductDefinationHashNo=d[6].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[6].replace("#","").replace("(","").replace(")","").trim();
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    d[8]=checkNumeric(d[8]);
                    d[9]=checkNumeric(d[9]);
                    c.createDoor(hashno,d[0],OwnerHistoryHashNo,d[2],LocalPlacementHashNo,ProductDefinationHashNo,d[8],d[9],fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCDOORSTYLE":
                    String[] doorprops=data.split("\\(")[1].split("\\)")[0].split(",");
                    
                    d=data.replace(")", "").split(",");
                   
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    
                    c.createDoorStyle(hashno,d[0],OwnerHistoryHashNo,d[2],d[8],d[10],d[11],fileId);
                    c.DmlStatement();
                    
                    c.createDoorStyleMapping(hashno,doorprops,fileId);
                    break;
                    
                    case "IFCDOORLININGPROPERTIES":
                    
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    d[4]=checkNumeric(d[4]);
                    d[5]=checkNumeric(d[5]);
                    d[10]=checkNumeric(d[10]);
                    d[12]=checkNumeric(d[12]);
                    d[13]=checkNumeric(d[13]);
                    c.createDoorLiningProperties(hashno,d[0],OwnerHistoryHashNo,d[2],d[4],d[5],d[10],d[12],d[13],fileId);
                    c.DmlStatement();
                    break;
                    
                    case "IFCDOORPANELPROPERTIES":
                    
                    d=data.replace(")", "").split(",");
                    OwnerHistoryHashNo=d[1].replace("#","").replace("(","").replace(")","").trim().equals("$")?null:d[1].replace("#","").replace("(","").replace(")","").trim();
                    
                    d[6]=checkNumeric(d[6]);
                    d[4]=checkNumeric(d[4]);
                    c.createDoorPanelProperties(hashno,d[0],OwnerHistoryHashNo,d[2],d[4],d[5],d[6],d[7],fileId);
                    c.DmlStatement();
                    break;
                }
               
               str="";
               Element="";
               text="";
               data="";	
               col.clear();
            }
        }   
    }
    
}
