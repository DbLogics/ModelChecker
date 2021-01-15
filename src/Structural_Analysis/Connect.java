/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structural_Analysis;

/**
 *
 * @author DataByte Logics
 */
import static Starting.IFC2DB.isNullOrEmpty;
import luck.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public  final class Connect  {

    /**
     * @param args the command line arguments
     */
    private static  String driver;
    private static Connection con;
    private static String url;
    private static  String user;
    private static  String pass;
    private static String query;
    int r;
    public Connect()
    {
           
           url="jdbc:sqlserver://DESKTOP-0T46ETS; databaseName=scrutinizer; user=xicom; password=Asd_12345";
        //user="xicom";
        //pass = "Asd_12345";
        driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        query="";
    
        try
        {
            
            Class.forName(driver);
            
            con=DriverManager.getConnection(url);
            
            //System.out.println("Connection Establised");
            //System.out.println("-----------------------------------------");
            //System.out.println("---------------Scrutinizer---------------");
        }
        catch(Exception ex)
        {
        
        }
        
    }
   
    public void insertIfc(int Id,String Element,String Data)
    {
        
        query="insert into IFC(Id,Element,Data) values("+Id+",'"+Element+"','"+Data+"')";
    }
    
    public void Column()
    {
        query="select * from validation where Element='Column'";
    }
    
    public void Beam()
    {
        query="select * from validation where Element='Beam'";
    }
    
    public void Wall()
    {
        query="select * from validation where Element='Wall'";
    }
    
    public void Slab()
    {
        query="select * from validation where Element='Slab'";
    }
    
    public void deleteDatabase()
    {
        query="drop table IF EXISTS result";
    }
    
    public void createDatabase()
    {
        query="create table result(Id Integer,Depth varchar(100),Status varchar(100))";
    }
    
    public void insertDatabse(int id,double depth,String status)
    {
        String d=""+depth+"";
        query="insert into result values("+id+",'"+d+"','"+status+"')";
    }
    public void deleteTable()
    {
        query="drop table IF EXISTS specification";
    }
    public void createTable()
    {
        query="create table specification(AssociativeProperties varchar(10),Curvemember varchar(10),type varchar(100),ProfileProperties varchar(10),breadth varchar(100),depth varchar(100),Start varchar(100),End varchar(100),length varchar(100),MOI varchar(100),Loads varchar(100))";
        //System.out.println(query);
    }
    public void insertTable(String associative,String curvemember,String type,String profileproperties,String breadth,String depth,String start,String end,String length,String moi)
    {
       
        query="insert into specification values('"+associative+"','"+curvemember+"','"+type+"','"+profileproperties+"','"+breadth+"','"+depth+"','"+start+"','"+end+"','"+length+"','"+moi+"','No')";
        //System.out.println(query);
    }
    public void deleteTableDeflection()
    {
        query="drop table IF EXISTS Deflection";
    }
    public void deleteTableSelenderness()
    {
        query="drop table IF EXISTS Selenderness";
    }
    public void createTableDeflection()
    {
        query="create table Deflection(Curvemember varchar(10),Calculated_Deflection varchar(30),Max_Deflection varchar(30),Status varchar(40))";
      //  System.out.println(query);
    }
    public void createTableSelenderness()
    {
        query="create table Selenderness(Curvemember varchar(10),Calculated_Selenderness varchar(30),Expected_Selenderness varchar(30),Type varchar(30),Status varchar(40))";
        //System.out.println(query);
    }
    public void insertTableDeflection(String Curvemember,Double Cal_Deflection,Double Max_Deflection,String Status)
    {
       
        query="insert into Deflection values('"+Curvemember+"','"+Cal_Deflection+"','"+Max_Deflection+"','"+Status+"')";
        //System.out.println(query);
    }
    public void insertTableSelenderness(String Curvemember,Double Cal_Selenderness,Double Expected_Selenderness,String Type,String Status)
    {
       
        query="insert into Selenderness values('"+Curvemember+"','"+Cal_Selenderness+"','"+Expected_Selenderness+"','"+Type+"','"+Status+"')";
        //System.out.println(query);
    }
    public void updateTable(String curvemember,String load)
    {
       
        query="update specification set loads='"+load+"' where curvemember='"+curvemember+"'";
    }
    public void createReport()
    {
        query="Select * from result INTO OUTFILE 'E:/Validation Report/ValidationReport.csv' FIELDS ENCLOSED BY '|'  ESCAPED BY '|' LINES TERMINATED BY '\r\n'";
    }
    
    public void getReport()
    {
        query="Select * from result";
    }
    public void getReports()
    {
        query="Select * from specification";
    }
    public void getReportss()
    {
        query="Select * from specification where type='Beam'";
    }
    public void getReportsss()
    {
        query="Select * from specification where type='Column'";
    }
        public void getReportsDeflection()
    {
        query="Select * from Deflection";
    }
        public void getReportsSelenderness()
    {
        query="Select * from Selenderness";
    }

     public  ResultSet DqlStatement()throws Exception
    {
        try
        {
        //System.out.println(query);
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        return rs;
        }
        catch(Exception ex)
        {
            //System.out.println("Exception :"+ex.getLocalizedMessage());
            return null;
        }
    }
     public  int DmlStatement()throws Exception
    {
        PreparedStatement ps=con.prepareStatement(query);
        int rs=ps.executeUpdate();
        return rs;
    }
  

    public void createFile(String fileName, String time, int UserId) {
        query="insert into IFC_File(Name,FKUserId,UploadedDateTime,CreatedAt,IsDeleted) values('"+fileName+"',"+UserId+",'"+time+"','"+time+"',0)";
    }
     public void getLatestFile() {
        query="select top(1) * from IFC_File order by CreatedAt desc";
    }

    public void createOrganization(long hashno, String name,int fileid) {
         query="insert into IFC_Organization(HashNo,Name,FKFileId) values("+hashno+",'"+name+"',"+fileid+")";
    }

    public void createPerson(long hashno, String name, int fileId) {
      query="insert into IFC_Person(HashNo,Name,FKFileId) values("+hashno+",'"+name+"',"+fileId+")";  
    }

    public void createPersonOrganization(long hashno, String personhashno, String organizationhashno, int fileId) {
        
        if(!personhashno.trim().equalsIgnoreCase("$") && !organizationhashno.trim().equalsIgnoreCase("$"))
        {
            query="insert into IFC_PersonOrganization(HashNo,PersonHashNo,OrganizationHashNo,FKFileId) values("+hashno+","+Long.parseLong(personhashno.trim())+","+Long.parseLong(organizationhashno.trim())+","+fileId+")";  
        }
        else if (!personhashno.trim().equalsIgnoreCase("$") && organizationhashno.trim().equalsIgnoreCase("$"))
        {
            query="insert into IFC_PersonOrganization(HashNo,PersonHashNo,FKFileId) values("+hashno+","+Long.parseLong(personhashno.trim())+","+fileId+")";  
        }
        else if (personhashno.trim().equalsIgnoreCase("$") && !organizationhashno.trim().equalsIgnoreCase("$"))
        {
            query="insert into IFC_PersonOrganization(HashNo,OrganizationHashNo,FKFileId) values("+hashno+","+Long.parseLong(organizationhashno.trim())+","+fileId+")";  
        }
        else
        {
            query="insert into IFC_PersonOrganization(HashNo,FKFileId) values("+hashno+","+fileId+")";  
        }
       
    }

    public void createApplication(long hashno, String year, String name, String shortname, int fileId) {
         query="insert into IFC_Application(HashNo,Year,Name,ShortName,FKFileId) values("+hashno+",'"+year+"','"+name+"','"+shortname+"',"+fileId+")";  
    }

    public void createOwnerHistory(long hashno, String PersonOrganizationHashNo, String ApplicationHahNo, int fileId) {
        query="insert into IFC_OwnerHistory(HashNo,PersonOrganizationHashNo,ApplicationHashNo,FKFileId) values("+hashno+","+Long.parseLong(PersonOrganizationHashNo)+","+Long.parseLong(ApplicationHahNo)+","+fileId+")";  
    }

    public void createCartesianPoint(long hashno, float xDim, float yDim, float zDim, int fileId) {
        
        //System.out.println("XDIM :"+xDim);
        //System.out.println("YDIM :"+yDim);
        //System.out.println("ZDIM :"+zDim);
      query="insert into IFC_CartesianPoint(HashNo,Is3D,Xdim,Ydim,Zdim,FKFileId) values("+hashno+",1,"+xDim+","+yDim+","+zDim+","+fileId+")";     
    }
     public void createCartesianPoint(long hashno, float xDim, float yDim, int fileId) {
         //System.out.println("XDIM :"+xDim);
         //System.out.println("YDIM :"+yDim);
        query="insert into IFC_CartesianPoint(HashNo,Is3D,Xdim,Ydim,FKFileId) values("+hashno+",0,"+xDim+","+yDim+","+fileId+")";
    }

    public void createDirection(long hashno, float xDim, float yDim, float zDim, int fileId) {
       query="insert into IFC_Direction(HashNo,Is3D,Xdim,Ydim,Zdim,FKFileId) values("+hashno+",1,"+xDim+","+yDim+","+zDim+","+fileId+")";
    }

    public void createDirection(long hashno, float xDim, float yDim, int fileId) {
        query="insert into IFC_Direction(HashNo,Is3D,Xdim,Ydim,FKFileId) values("+hashno+",0,"+xDim+","+yDim+","+fileId+")";
    }

    public void createAxis2Placement3D(long hashno, long cartesianhashno, long direction1, long direction2, int fileId) {
        query="insert into IFC_Axis2Placement3D(HashNo,CartesianHashNo,Dir1HashNo,Dir2HashNo,FKFileId) values("+hashno+","+cartesianhashno+","+direction1+","+direction2+","+fileId+")";
    }

    public void createAxis2Placement3DDir1(long hashno, Long cartesianhashno, Long direction1, int fileId) {
        query="insert into IFC_Axis2Placement3D(HashNo,CartesianHashNo,Dir1HashNo,FKFileId) values("+hashno+","+cartesianhashno+","+direction1+","+fileId+")";
    }

    public void createAxis2Placement3DDir2(long hashno, Long cartesianhashno, Long direction2, int fileId) {
        query="insert into IFC_Axis2Placement3D(HashNo,CartesianHashNo,Dir2HashNo,FKFileId) values("+hashno+","+cartesianhashno+","+direction2+","+fileId+")";
    }

    public void createAxis2Placement3D(long hashno, Long cartesianhashno, int fileId) {
        query="insert into IFC_Axis2Placement3D(HashNo,CartesianHashNo,FKFileId) values("+hashno+","+cartesianhashno+","+fileId+")";
    }

    public void createAxis2Placement2D(long hashno, Long cartesianhashno, Long direction1, int fileId) {
         query="insert into IFC_Axis2Placement2D(HashNo,CartesianHashNo,DireactionHashNo,FKFileId) values("+hashno+","+cartesianhashno+","+direction1+","+fileId+")";
    }

    public void createAxis2Placement2D(long hashno, Long cartesianhashno, int fileId) {
        query="insert into IFC_Axis2Placement2D(HashNo,CartesianHashNo,FKFileId) values("+hashno+","+cartesianhashno+","+fileId+")";
    }

    public void createLocalPlacement(long hashno, Long parenthashno, Long axis2placementhashno, int fileId) {
        query="insert into IFC_LocalPlacement(HashNo,ParentHashNo,Axis2PlacementHashNo,FKFileId) values("+hashno+","+parenthashno+","+axis2placementhashno+","+fileId+")";
    }

    public void createLocalPlacementWithParent(long hashno, Long parenthashno, int fileId) {
        query="insert into IFC_LocalPlacement(HashNo,ParentHashNo,FKFileId) values("+hashno+","+parenthashno+","+fileId+")";
    }

    public void createLocalPlacementWithAxis(long hashno, Long axis2placementhashno, int fileId) {
        query="insert into IFC_LocalPlacement(HashNo,Axis2PlacementHashNo,FKFileId) values("+hashno+","+axis2placementhashno+","+fileId+")";
    }

    public void createLocalPlacement(long hashno, int fileId) {
        query="insert into IFC_LocalPlacement(HashNo,FKFileId) values("+hashno+","+fileId+")";
    }

    public void createGeometricRepresentationContext(long hashno, String name, int fileId) {
       query="insert into IFC_GeometricRepresentationContext(HashNo,IsChild,Name,FKFileId) values("+hashno+",0,'"+name+"',"+fileId+")";
    }

    public void createGeometricRepresentationSubContext(long hashno, String name, String parenthashno, int fileId) {
        query="insert into IFC_GeometricRepresentationContext(HashNo,IsChild,ParentHashNo,Name,FKFileId) values("+hashno+",1,"+Long.parseLong(parenthashno)+",'"+name+"',"+fileId+")";
    }

    public void createBuildingStorey(long hashno, String globalid, String ownerhistoryhashno, String levelname, String localplacementhashno, String Position, int fileId) {
        query="insert into IFC_BuildingStorey(HashNo,GlobalId,OwnerHistoryHashNo,LevelName,LocalPlacementHashNo,Position,FKFileId) values("+hashno+",'"+globalid+"',"+Long.parseLong(ownerhistoryhashno)+",'"+levelname+"',"+Long.parseLong(localplacementhashno)+","+Float.parseFloat(Position)+","+fileId+")";
    }

    public void createRectangleProfileDef(long hashno, String Text, String Value, float Length, float Breath, String Axis2PlacementHashNo, int fileId) {
          if(!isNullOrEmpty(Value))
          {
                 query="insert into IFC_RectangleProfileDef(HashNo,Text,Value,Length,Breath,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"','"+Value+"',"+Length+","+Breath+","+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
          else
          {
              query="insert into IFC_RectangleProfileDef(HashNo,Text,Length,Breath,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"',"+Length+","+Breath+","+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
        
    }

    public void createRectangleProfileDef(long hashno, String Text, String Value, String Axis2PlacementHashNo, int fileId) {
        
         if(!isNullOrEmpty(Value))
          {
                 query="insert into IFC_RectangleProfileDef(HashNo,Text,Value,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"','"+Value+"',"+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
          else
          {
              query="insert into IFC_RectangleProfileDef(HashNo,Text,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"',"+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
        
    }

    public void createRectangleProfileDefWithLength(long hashno, String Text, String Value, float Length, String Axis2PlacementHashNo, int fileId) {
        
         if(!isNullOrEmpty(Value))
          {
                 query="insert into IFC_RectangleProfileDef(HashNo,Text,Value,Length,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"','"+Value+"',"+Length+","+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
          else
          {
              query="insert into IFC_RectangleProfileDef(HashNo,Text,Length,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"',"+Length+","+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
       
    }

    public void createRectangleProfileDefWithBreath(long hashno, String Text, String Value, float Breath, String Axis2PlacementHashNo, int fileId) {
        
         if(!isNullOrEmpty(Value))
          {
             query="insert into IFC_RectangleProfileDef(HashNo,Text,Value,Breath,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"','"+Value+"',"+Breath+","+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";    
          }
          else
          {
              query="insert into IFC_RectangleProfileDef(HashNo,Text,Breath,Axis2PlacementHashNo,FKFileId) values("+hashno+",'"+Text+"',"+Breath+","+Long.parseLong(Axis2PlacementHashNo)+","+fileId+")";
          }
        
    }

    public void createExtrudedAreaSolid(long hashno, String rectangleprofiledefhashno, String axis2placementhashno, String directionhashno, float depth, int fileId) {
       query="insert into IFC_ExtrudedAreaSolid(HashNo,RectangleProfileDefHashNo,Axis2PlacementHashNo,DirectionHashNo,Depth,FKFileId) values("+hashno+","+Long.parseLong(rectangleprofiledefhashno)+","+Long.parseLong(axis2placementhashno)+","+Long.parseLong(directionhashno)+","+depth+","+fileId+")";
    }

    public void createColourRGB(long hashno, float R_Value, float G_Value, float B_Value, int fileId) {
       query="insert into IFC_ColourRGB(HashNo,R_Value,G_Value,B_Value,FKFileId) values("+hashno+","+R_Value+","+G_Value+","+B_Value+","+fileId+")";     
    }

    public void createSurfaceRendering(long hashno, String ColourRGBHashNo, String Value, String NormalisedRatioMeasure, String SpectularExponent, int fileId) {
       query="insert into IFC_SurfaceRendering(HashNo,ColorRGBHashNo,Value,NormalizedRatioMeasure,SpectularExponent,FKFileId) values("+hashno+","+Long.parseLong(ColourRGBHashNo)+",'"+Value+"','"+NormalisedRatioMeasure+"','"+SpectularExponent+"',"+fileId+")";      
    }

    public void createSurfaceStyle(long hashno, String Name, String SurfaceRenderingHashNo, int fileId) {
        query="insert into IFC_SurfaceStyle(HashNo,Name,SurfaceRenderingHashNo,FKFileId) values("+hashno+",'"+Name+"',"+Long.parseLong(SurfaceRenderingHashNo)+","+fileId+")";      
    }

    public void createPresentationStyleAssignment(long hashno, String SurfaceStyleHashNo, int fileId) {
       query="insert into IFC_PresentationStyleAssignment(HashNo,SurfaceStyleHashNo,FKFileId) values("+hashno+","+Long.parseLong(SurfaceStyleHashNo)+","+fileId+")";      
    }

    public void createStyledItem(long hashno, String ExtrudedAreaSolidHashNo, String PresentationStyleAssignmentHashNo, int fileId) {
       query="insert into IFC_StyledItem(HashNo,ExtrudedAreaSolidHashNo,PresentationStyleAssignmentHashNo,FKFileId) values("+hashno+","+Long.parseLong(ExtrudedAreaSolidHashNo)+","+Long.parseLong(PresentationStyleAssignmentHashNo)+","+fileId+")";      
    }

    public void createStyledItem(long hashno, int fileId) {
        query="insert into IFC_StyledItem(HashNo,FKFileId) values("+hashno+","+fileId+")";      
    }

    public void createStyledItemWithExtruded(long hashno, String ExtrudedAreaSolidHashNo, int fileId) {
       query="insert into IFC_StyledItem(HashNo,ExtrudedAreaSolidHashNo,FKFileId) values("+hashno+","+Long.parseLong(ExtrudedAreaSolidHashNo)+","+fileId+")";      
    }

    public void createStyledItemwithAssignment(long hashno, String PresentationStyleAssignmentHashNo, int fileId) {
        query="insert into IFC_StyledItem(HashNo,PresentationStyleAssignmentHashNo,FKFileId) values("+hashno+","+Long.parseLong(PresentationStyleAssignmentHashNo)+","+fileId+")";      
    }

    public void createShapeRepresentation(long hashno, String geometrichashNo, String Type, String Subtype, int fileId) {
        query="insert into IFC_ShapeReprentation(HashNo,GeometricRepresentationHashNo,Type,SubType,FKFileId) values("+hashno+","+Long.parseLong(geometrichashNo)+",'"+Type+"','"+Subtype+"',"+fileId+")";      
    }
public void createShapeRepresentationMapping(long shaperepresentationhashno, String[] forwards, int fileId) {
        for(int i=0;i<forwards.length;i++)
                    {
                        
                      
                        query="insert into IFC_ShapeRepresentationMapping(ForwardHashNo,ShapeRepresentationHashNo,FkFileId) values("+Long.parseLong(forwards[i].replace("#", ""))+","+shaperepresentationhashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                    }
         
    }
    public void createProductDefinationShape(long hashno, int fileId) {
        query="insert into IFC_ProductDefinationShape(HashNo,FKFileId) values("+hashno+","+fileId+")";      
    }

    public void createProductDefinationShapeMapping(long productdefinationhashno, String[] shapes, int fileId) {
        for(int i=0;i<shapes.length;i++)
                    {
                        
                      
                        query="insert into IFC_ProductDefinationShapeMapping(ShapeRepresentationHashNo,ProductDefinationShapeHashNo,FKFileId) values("+Long.parseLong(shapes[i].replace("#", ""))+","+productdefinationhashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                    }
         
    }
    
    public void createSlab(long hashno, String globalid, String OwnerHistoryHashNo, String LocalPlacementHashNo, String ProductDefinationHashNo, int fileId) {
        query="insert into IFC_Slab(HashNo,GlobalId,OwnerHistoryHashNo,LocalPlacementHashNo,ProductDefinationShapeHashNo,FKFileId) values("+hashno+",'"+globalid+"',"+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(LocalPlacementHashNo)+","+Long.parseLong(ProductDefinationHashNo)+","+fileId+")";      
    }

    public void createMaterial(long hashno, String Name, int fileId) {
        query="insert into IFC_Material(HashNo,Name,FKFileId) values("+hashno+",'"+Name+"',"+fileId+")";      
    }

    public void createMaterialDefinationRepresentation(long hashno, String StyledRepresentationHahNo, String MaterialHashNo, int fileId) {
        query="insert into IFC_MaterialDefinationRepresentation(HashNo,StyledRepresentationHashNo,MaterialHashNo,FKFileId) values("+hashno+","+Long.parseLong(StyledRepresentationHahNo)+","+Long.parseLong(MaterialHashNo)+","+fileId+")";      
    }

    public void createMaterialLayer(long hashno, String MaterialHashNo,String Thickness, int fileId) {
        query="insert into IFC_MaterialLayer(HashNo,MaterialHashNo,Thickness,FKFileId) values("+hashno+","+Long.parseLong(MaterialHashNo)+","+Thickness+","+fileId+")";      
    }

    public void createMaterialLayerSet(long hashno, String MaterialLayerHashNo, int fileId) {
        query="insert into IFC_MaterialLayerSet(HashNo,MaterialLayerHashNo,FKFileId) values("+hashno+","+Long.parseLong(MaterialLayerHashNo)+","+fileId+")";      
    }

    public void createMaterialLayerSetUsage(long hashno, String MaterialLayerSetHashNo, String LayerSetDirection, String DirectionSense, int fileId) {
          query="insert into IFC_MaterialLayerSetUsage(HashNo,MaterialLayerSetHashNo,LayerSetDirection,DirectionSense,FKFileId) values("+hashno+","+Long.parseLong(MaterialLayerSetHashNo)+",'"+LayerSetDirection+"','"+DirectionSense+"',"+fileId+")";      
    }

    public void createStyledRepresentation(long hashno, String GeometricRepresentationHashNo, String SurfaceStyleHashNo, String Name, String Type, int fileId) {
         query="insert into IFC_StyledRepresentation(HashNo,GeometricContextHashNo,StyledItemHashNo,Name,Type,FKFileId) values("+hashno+","+Long.parseLong(GeometricRepresentationHashNo)+","+Long.parseLong(SurfaceStyleHashNo)+",'"+Name+"','"+Type+"',"+fileId+")";      
    }

    public void createPropertySingleValue(long hashno, String Name, String Value, int fileId) {
        query="insert into IFC_PropertySingleValue(HashNo,Name,Value,FKFileId) values("+hashno+",'"+Name+"','"+Value+"',"+fileId+")";      
    }

    public void createPropertySet(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, int fileId) {
        query="insert into IFC_PropertySet(HashNo,GlobalId,OwnerHistoryHashNo,Name,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+fileId+")";      
    }

    public void createPropertyValueMapping(long propertysethashno, String[] properties, int fileId) {
        for(int i=0;i<properties.length;i++)
                    {
                        
                        //System.out.println("PropertySetHashNo :"+propertysethashno);
                        //System.out.println("PropertyHashNo :"+properties[i].replace("#", ""));
                        query="insert into IFC_PropertyValueMapping(PropertyHashNo,PropertySetHashNo,FKFileId) values("+Long.parseLong(properties[i].replace("#", ""))+","+propertysethashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                    }
         
    }
     
    public void createRelDefineByProperties(long hashno, String GlobalId, String OwnerHistoryHashNo, String ProperySetHashNo, String EntityHashNo, int fileId) {
        query="insert into IFC_RelDefineByProperties(HashNo,GlobalId,OwnerHistoryHashNo,ProperySetHashNo,EntityHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(ProperySetHashNo)+","+Long.parseLong(EntityHashNo)+","+fileId+")";      
    }

    public void createOpeningElement(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String Type, String LocalPlacementHashNo, String ProductDefinationHashNo, int fileId) {
        query="insert into IFC_OpeningElement(HashNo,GlobalId,OwnerHistoryHashNo,Name,ObjectType,LocalPlacementHashNo,ProductDefinationShapeHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+Type+"',"+Long.parseLong(LocalPlacementHashNo)+","+Long.parseLong(ProductDefinationHashNo)+","+fileId+")";      
    }

    public void createWallType(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String Type, int fileId) {
        query="insert into IFC_WallType(HashNo,GlobalId,OwnerHistoryHashNo,Name,PredefinedType,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+Type+"',"+fileId+")";      
    }

    public void createWallStandardCase(long hashno, String GlobalId, String OwnerHistoryHashNo, String LocalPlacementHashNo, String ProductDefinationHashNo,String Name, int fileId) {
        query="insert into IFC_WallStandardCase(HashNo,GlobalId,OwnerHistoryHashNo,LocalPlacementHashNo,ProductDefinationShapeHashNo,Name,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(LocalPlacementHashNo)+","+Long.parseLong(ProductDefinationHashNo)+",'"+Name+"',"+fileId+")";      
    }

    public void createRelAssociateMaterial(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String RelatedObjectHashNo, String RelatedMaterialHashNo, int fileId) {
         query="insert into IFC_RelAssociateMaterial(HashNo,GlobalId,OwnerHistoryHashNo,Name,RelatedObjectHashNo,RelatingMaterialHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Long.parseLong(RelatedObjectHashNo)+","+Long.parseLong(RelatedMaterialHashNo)+","+fileId+")";      
    }

    public void createPresentationLayerAssignment(long hashno, String Name, int fileId) {
         query="insert into IFC_PresenationLayerAssignment(HashNo,Name,FKFileId) values("+hashno+",'"+Name+"',"+fileId+")";      
    }

    public void createPresentationLayerShapeMapping(Long PresentationLayetAssignmentHashNo, String[] shaperepresentations, int fileId) {
          for(int i=0;i<shaperepresentations.length;i++)
                    {
                        if(!isNullOrEmpty(shaperepresentations[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_PresenationLayerShapeMapping(ShapeRepresentationHashNo,PresentationLayerHashNo) values("+Long.parseLong(shaperepresentations[i].replace("#", "").replace("$",""))+","+PresentationLayetAssignmentHashNo+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createPolyline(long hashno, int fileId) {
        query="insert into IFC_Polyline(HashNo,FKFileId) values("+hashno+","+fileId+")";      
    }

    public void createPolylineCartesianMapping(Long PolylineHashNo, String[] cartesians, int fileId) {
         for(int i=0;i<cartesians.length;i++)
                    {
                        if(!isNullOrEmpty(cartesians[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_PolylineCartesianMapping(CartesianHashNo,PolylineHashNo,FKFileId) values("+Long.parseLong(cartesians[i].replace("#", "").replace("$",""))+","+PolylineHashNo+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createPolygonalBoundedHalfSpace(long hashno, String PlaneHashNo, String axis2placementhashno, String polylinehashno, int fileId) {
         query="insert into IFC_PolygonalBoundedHalfSpace(HashNo,PlaneHashNo,Axis2PlacementHashNo,PolylineHashNo,FKFileId) values("+hashno+","+Long.parseLong(PlaneHashNo)+","+Long.parseLong(axis2placementhashno)+","+Long.parseLong(polylinehashno)+","+fileId+")";      
    }

    public void createPlane(long hashno, String axis2placementhashno, int fileId) {
         query="insert into IFC_Plane(HashNo,Axis2PlacementHashNo,FKFileId) values("+hashno+","+Long.parseLong(axis2placementhashno)+","+fileId+")";      
    }

    public void createBooleanClippingResult(long hashno, String extrudedareasolidhashNo, String polygonhalfboundedspacehashno, int fileId) {
        query="insert into IFC_BooleanClippingResult(HashNo,ExtrudedAReaSolidHashNo,PolygonBoundedHalfSpaceHashNo,FKFileId) values("+hashno+","+Long.parseLong(extrudedareasolidhashNo)+","+Long.parseLong(polygonhalfboundedspacehashno)+","+fileId+")";      
    }

    public void createRelConnectsPathElements(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String RelatingElement1HashNo, String RelatingElement2HashNo, String RelatingElement1ConnectionType, String RelatingElement2ConnectionType, int fileId) {
         query="insert into IFC_RelConnectsPathElements(HashNo,GlobalId,OwnerHistoryHashNo,Name,RelatingElement1HashNo,RelatingElement2HashNo,RelatingElement1ConnectionType,RelatingElement2ConnectionType,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Long.parseLong(RelatingElement1HashNo)+","+Long.parseLong(RelatingElement2HashNo)+",'"+RelatingElement1ConnectionType+"','"+RelatingElement2ConnectionType+"',"+fileId+")";      
    }

    public void createRelVoidsElement(long hashno, String GlobalId, String OwnerHistoryHashNo, String WallStandardCaseHashNo, String OpeningElementHashNo, int fileId) {
        query="insert into IFC_RelVoisElement(HashNo,GlobalId,OwnerHistoryHashNo,WallStandardCaseHashNo,OpeningElementHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(WallStandardCaseHashNo)+","+Long.parseLong(OpeningElementHashNo)+","+fileId+")";      
    }

    public void createRelContainedInSpatialStructure(long hashno, String StoreyHashNo, String OwnerHistoryHashNo, int fileId) {
         query="insert into IFC_RelContainedInSpacialStructure(HashNo,OwnerHistoryHashNo,BuildingStoreyHashNo,FKFileId) values("+hashno+","+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(StoreyHashNo)+","+fileId+")";      
    }

    public void createRelContainedInSpatialStructureMapping(Long RelContainedHashNo, String[] Entities, int fileId) {
        for(int i=0;i<Entities.length;i++)
                    {
                        if(!isNullOrEmpty(Entities[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_RelContainedInSpacialStructureMapping(StructureHashNo,RelContainedHashNo,FKFileId) values("+Long.parseLong(Entities[i].replace("#", "").replace("$",""))+","+RelContainedHashNo+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createSIUnit(long hashno, String Name, String SubUnit, String Unit, int fileId) {
         query="insert into IFC_SIUnit(HashNo,Name,SubUnit,Unit,FKFileId) values("+hashno+",'"+Name+"','"+SubUnit+"','"+Unit+"',"+fileId+")";      
    }

    public void createMeasureWithUnit(long hashno, String PlaneAngleMeasure, String SIUnitHashNo, int fileId) {
        query="insert into IFC_MeasureWithUnit(HashNo,PlaneAngleMeasure,UnitHashNo,FKFileId) values("+hashno+","+Float.parseFloat(PlaneAngleMeasure)+","+Long.parseLong(SIUnitHashNo)+","+fileId+")";      
    }

    public void createDimensionalExponent(long hashno, String Value1, String Value2, String Value3, String Value4, String Value5, String Value6, int fileId) {
        query="insert into IFC_DimensionalExponent(HashNo,Value1,Value2,Value3,Value4,Value5,Value6,FKFileId) values("+hashno+",'"+Value1+"','"+Value2+"','"+Value3+"','"+Value4+"','"+Value5+"','"+Value6+"',"+fileId+")";    
    }

    public void createConversionBasedUnit(long hashno, String DimensionalHashNo, String UnitType, String Name, String MeasureHashNo, int fileId) {
        query="insert into IFC_ConversionBaseUnit(HashNo,DimensionalHashNo,UnitType,Name,MeasureWithUnitHashNo,FKFileId) values("+hashno+","+Long.parseLong(DimensionalHashNo)+",'"+UnitType+"','"+Name+"',"+Long.parseLong(MeasureHashNo)+","+fileId+")";      
    }

    public void createMonetaryUnit(long hashno, String Value, int fileId) {
       query="insert into IFC_MonetaryUnit(HashNo,Value,FKFileId) values("+hashno+",'"+Value+"',"+fileId+")";    
    }

    public void createDerivedUnit(long hashno, String UnitType, int fileId) {
         query="insert into IFC_DerivedUnit(HashNo,UnitType,FKFileId) values("+hashno+",'"+UnitType+"',"+fileId+")";    
    }

    public void createDerivedUnitMapping(long DerivedUnitHashNo, String[] unitelements, int fileId) {
        for(int i=0;i<unitelements.length;i++)
                    {
                        if(!isNullOrEmpty(unitelements[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_DerivedUnitMapping(DerivedUnitElementHashNo,DerivedUnitHashNo,FKFileId) values("+Long.parseLong(unitelements[i].replace("#", "").replace("$",""))+","+DerivedUnitHashNo+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createDerivedUnitElement(long hashno, String SIUnitHashNo, String Exponent, int fileId) {
        query="insert into IFC_DerivedUnitElement(HashNo,UnitHashNo,PersonHashNo,FKFileId) values("+hashno+","+Long.parseLong(SIUnitHashNo)+","+Long.parseLong(Exponent)+","+fileId+")";    
    }

    public void createUnitAssignment(long hashno, int fileId) {
        query="insert into IFC_UnitAssignment(HashNo,FKFileId) values("+hashno+","+fileId+")";    
    }

    public void createUnitAssignmentMapping(long UnitAssignmentHashNo, String[] elements, int fileId) {
         for(int i=0;i<elements.length;i++)
                    {
                        if(!isNullOrEmpty(elements[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_UnitAssignmentDerivedMapping(DerivedHashNo,UnitAssignmentHashNo,FKFileId) values("+Long.parseLong(elements[i].replace("#", "").replace("$",""))+","+UnitAssignmentHashNo+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createProject(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String UnitAssignmentHashNo, int fileId) {
       query="insert into IFC_Project(HashNo,GlobalId,OwnerHistoryHashNo,Name,UnitAssignmentHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Long.parseLong(UnitAssignmentHashNo)+","+fileId+")";    
    }

    public void createProjectMapping(long ProjectHashNo, String[] geoelements, int fileId) {
        for(int i=0;i<geoelements.length;i++)
                    {
                        if(!isNullOrEmpty(geoelements[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_ProjectGeometricMapping(GeometricContextHashNo,ProjectHashNo,FKFileId) values("+Long.parseLong(geoelements[i].replace("#", "").replace("$",""))+","+ProjectHashNo+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createSite(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String LocalPlacementHashNo, String Type, int fileId) {
       query="insert into IFC_Site(HashNo,GlobalId,OwnerHistoryHashNo,Name,LocalPlacementHashNo,Type,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Long.parseLong(LocalPlacementHashNo)+",'"+Type+"',"+fileId+")";    
    }

    public void createRelAggregates(long hashno, String GlobalId, String OwnerHistoryHashNo, String ProjectHashNo, int fileId) {
        query="insert into IFC_RelAggregates(HashNo,GlobalId,OwnerHistoryHashNo,ProjectHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(ProjectHashNo)+","+fileId+")";    
    }

    public void createRelAggregatesMapping(long RelAggregatesHashNo, String[] sites, int fileId) {
        for(int i=0;i<sites.length;i++)
                    {
                        if(!isNullOrEmpty(sites[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_RelAggregatesSiteMapping(SiteHashNo,RelAggregatesHashNo,FKFileId) values("+Long.parseLong(sites[i].replace("#", "").replace("$",""))+","+RelAggregatesHashNo+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createArbitaryClosedProfile(long hashno, String Type, String Name, String polylinehashno, int fileId) {
      query="insert into IFC_ArbitaryClosedProfileDef(HashNo,Type,Name,PolylineHashNo,FKFileId) values("+hashno+",'"+Type+"','"+Name+"',"+Long.parseLong(polylinehashno)+","+fileId+")";    
    }

    public void createQuantityLength(long hashno, String GlobalId, String Value, int fileId) {
      query="insert into IFC_QuantityLength(HashNo,GlobalId,Value,FKFileId) values("+hashno+",'"+GlobalId+"',"+Float.parseFloat(Value)+","+fileId+")";    
    }
    
    public void createQuantityVoulume(long hashno, String GlobalId, String Value, int fileId) {
      query="insert into IFC_QuantityVolume(HashNo,GlobalId,Value,FKFileId) values("+hashno+",'"+GlobalId+"',"+Float.parseFloat(Value)+","+fileId+")";    
    }
    
    public void createQuantityArea(long hashno, String GlobalId, String Value, int fileId) {
      query="insert into IFC_QuantityArea(HashNo,GlobalId,Value,FKFileId) values("+hashno+",'"+GlobalId+"',"+Float.parseFloat(Value)+","+fileId+")";    
    }

    public void createElementQuantityMapping(long hashno, String[] quantities, int fileId) {
       for(int i=0;i<quantities.length;i++)
                    {
                        if(!isNullOrEmpty(quantities[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_ElementQuantityMapping(QuantityHashNo,ElementQuantityHashNo,FKFileId) values("+Long.parseLong(quantities[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createElementQuantity(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String MethodOfMeasurement, int fileId) {
      query="insert into IFC_ElementQuantity(HashNo,GlobalId,OwnerHistoryHashNo,Name,MethodOfMeasurement,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+MethodOfMeasurement+"',"+fileId+")";    
    }

    public void createPolyloop(long hashno, int fileId) {
      query="insert into IFC_Polyloop(HashNo,FKFileId) values("+hashno+","+fileId+")";    
    }

    public void createPolyloopMapping(long polyloophashno, String[] points, int fileId) {
        for(int i=0;i<points.length;i++)
                    {
                        if(!isNullOrEmpty(points[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_PolyloopMapping(CartesianHashNo,PolyloopHashNo,FKFileId) values("+Long.parseLong(points[i].replace("#", "").replace("$",""))+","+polyloophashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createFaceOuterBound(long hashno, String PolyloopHashNo, String Orientation, int fileId) {
      query="insert into IFC_FaceOuterbound(HashNo,PolyloopHashNo,Orientation,FKFileId) values("+hashno+","+Long.parseLong(PolyloopHashNo)+",'"+Orientation+"',"+fileId+")";    
    }

    public void createFace(long hashno, int fileId) {
        query="insert into IFC_Face(HashNo,FKFileId) values("+hashno+","+fileId+")";  
    }

    public void createFaceMapping(long hashno, String[] faceouterbounds, int fileId) {
        for(int i=0;i<faceouterbounds.length;i++)
                    {
                        if(!isNullOrEmpty(faceouterbounds[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_FaceMapping(FaceOuterboundHashNo,FaceHashNo,FKFileId) values("+Long.parseLong(faceouterbounds[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createClosedShell(long hashno, int fileId) {
        query="insert into IFC_ClosedShell(HashNo,FKFileId) values("+hashno+","+fileId+")";  
    }

    public void createClosedShellMapping(long hashno, String[] faces, int fileId) {
         for(int i=0;i<faces.length;i++)
                    {
                        if(!isNullOrEmpty(faces[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_ClosedShellMapping(FaceHashNo,ClosedShellHashNo,FKFileId) values("+Long.parseLong(faces[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createFacetedBrep(long hashno, String ClosedShellHashNo, int fileId) {
        query="insert into IFC_FacetedBrep(HashNo,ClosedShellHashNo,FKFileId) values("+hashno+","+Long.parseLong(ClosedShellHashNo)+","+fileId+")"; 
    }

    public void createOpenShell(long hashno, int fileId) {
        query="insert into IFC_OpenShell(HashNo,FKFileId) values("+hashno+","+fileId+")";  
    }

    public void createOpenShellMapping(long hashno, String[] faces, int fileId) {
        for(int i=0;i<faces.length;i++)
                    {
                        if(!isNullOrEmpty(faces[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_OpenShellMapping(FaceHashNo,OpenShellHashNo,FKFileId) values("+Long.parseLong(faces[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createShellBasedSurfaceModel(long hashno, int fileId) {
        query="insert into IFC_ShellBasedSurfaceModel(HashNo,FKFileId) values("+hashno+","+fileId+")"; 
    }

    public void createShellBasedMapping(long hashno, String[] openshells, int fileId) {
 for(int i=0;i<openshells.length;i++)
                    {
                        if(!isNullOrEmpty(openshells[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_ShellBasedSurfaceModelMapping(OpenShellHashNo,ShellBasedHashNo,FKFileId) values("+Long.parseLong(openshells[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createCartesianTransformation(long hashno, String CartesianPointHashNo, int fileId) {
       query="insert into IFC_CartesianTransformationOperator3D(HashNo,CartesianPointHashNo,FKFileId) values("+hashno+","+Long.parseLong(CartesianPointHashNo)+","+fileId+")"; 
    }

    public void createMappedItem(long hashno, String RepresentationMapHashNo, String CartesianTransHashNo, int fileId) {
        query="insert into IFC_MappedItem(HashNo,RepresenationMapHashNo,CartesianTransformationHashNo,FKFileId) values("+hashno+","+Long.parseLong(RepresentationMapHashNo)+","+Long.parseLong(CartesianTransHashNo)+","+fileId+")"; 
    }

    public void createRepresentationMap(long hashno, String Axis2PlacementHashNo, String ShapeReprentationHashNo, int fileId) {
        query="insert into IFC_RepresentationMap(HashNo,Axis2PlacementHashNo,ShapeRepresentationHashNo,FKFileId) values("+hashno+","+Long.parseLong(Axis2PlacementHashNo)+","+Long.parseLong(ShapeReprentationHashNo)+","+fileId+")"; 
    }

    public void createWindow(long hashno, String GolbalId, String OwnerHistoryHashNo, String Name, String LocalPlacementHashNo, String ProductDefinationHashNo, String Height, String Width, int fileId) {
        query="insert into IFC_Window(HashNo,GlobalId,OwnerHistoryHashNo,Name,LocationPlacementHashNo,ProductDefinationHashNo,Height,Width,FKFileId) values("+hashno+",'"+GolbalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Long.parseLong(LocalPlacementHashNo)+","+Long.parseLong(ProductDefinationHashNo)+","+Float.parseFloat(Height)+","+Float.parseFloat(Width)+","+fileId+")"; 
    }

    public void createRelfilsElement(long hashno, String GolbalId, String OwnerHistoryHashNo, String OpeningElementHashNo, String ElementHashNo, int fileId) {
        query="insert into IFC_RelfillsElement(HashNo,GlobalId,OwnerHistoryHashNo,OpeningElementHashNo,ExternalHashNo,FKFileId) values("+hashno+",'"+GolbalId+"',"+Long.parseLong(OwnerHistoryHashNo)+","+Long.parseLong(OpeningElementHashNo)+","+Long.parseLong(ElementHashNo)+","+fileId+")"; 
    }

    public void createWindowStyle(long hashno, String GolbalId, String OwnerHistoryHashNo,String Name, String OperationType, String ParameterTakesPrecedence, String Sizeable, int fileId) {
        query="insert into IFC_WindowStyle(HashNo,GlobalId,OwnerHistoryHashNo,Name,OperationType,ParameterTakesPrecedence,Sizeable,FKFileId) values("+hashno+",'"+GolbalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+OperationType+"','"+ParameterTakesPrecedence+"','"+Sizeable+"',"+fileId+")"; 
    }

    public void createWindowStyleMapping(long hashno, String[] windowprops, int fileId) {
         for(int i=0;i<windowprops.length;i++)
                    {
                        if(!isNullOrEmpty(windowprops[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_WindowStyleMapping(PropertyHashNo,WindowStyleHashNo,FKFileId) values("+Long.parseLong(windowprops[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createWindowLiningProperties(long hashno, String GolbalId, String OwnerHistoryHashNo, String Name, String LiningDepth, String LiningThickness, int fileId) {
        query="insert into IFC_WindowLiningProperties(HashNo,GlobalId,OwnerHistoryHashNo,Name,LiningDepth,LiningThickness,FKFileId) values("+hashno+",'"+GolbalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Float.parseFloat(LiningDepth)+","+Float.parseFloat(LiningThickness)+","+fileId+")"; 
    }

    public void createWindowPanelProperties(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String OperationType, String PanelPosition, String FrameDepth, String FrameThickness, int fileId) {
        query="insert into IFC_WindowPanelProperties(HashNo,GlobalId,OwnerHistoryHashNo,Name,OperationType,PanelPosition,FrameDepth,FrameThickness,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+OperationType+"','"+PanelPosition+"',"+Float.parseFloat(FrameDepth)+","+Float.parseFloat(FrameThickness)+","+fileId+")"; 
    }

    public void createRelDefinesByType(long hashno, String GlobalId, String OwnerHistoryHashNo, String WindowStleHashNo, int fileId) {
        query="insert into IFC_RelDefinesByType(HashNo,GlobalId,WindowStyleHashNo,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(WindowStleHashNo)+","+fileId+")"; 
    }

    public void createRelDefinesMapping(long hashno, String[] windows, int fileId) {
        for(int i=0;i<windows.length;i++)
                    {
                        if(!isNullOrEmpty(windows[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_RelDefinesByTypeMapping(ElementHashNo,RelDefinesHashNo,FKFileId) values("+Long.parseLong(windows[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createDoor(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String LocalPlacementHashNo, String ProductDefinationHashNo, String Height, String Width, int fileId) {
        query="insert into IFC_Door(HashNo,GlobalId,OwnerHistoryHashNo,Name,LocationPlacementHashNo,ProductDefinationHashNo,Height,Width,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Long.parseLong(LocalPlacementHashNo)+","+Long.parseLong(ProductDefinationHashNo)+","+Float.parseFloat(Height)+","+Float.parseFloat(Width)+","+fileId+")"; 
    }

    public void createDoorStyle(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String OperationType, String ParameterTakesPrecedence, String Sizeable, int fileId) {
        query="insert into IFC_DoorStyle(HashNo,GlobalId,OwnerHistoryHashNo,Name,OperationType,ParameterTakesPrecedence,Sizeable,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+OperationType+"','"+ParameterTakesPrecedence+"','"+Sizeable+"',"+fileId+")"; 
    }

    public void createDoorStyleMapping(long hashno, String[] doorprops, int fileId) {
        for(int i=0;i<doorprops.length;i++)
                    {
                        if(!isNullOrEmpty(doorprops[i].replace("#", "").replace("$","")))
                        {
                        query="insert into IFC_DoorStyleMapping(PropertyHashNo,DoorStyleHashNo,FKFileId) values("+Long.parseLong(doorprops[i].replace("#", "").replace("$",""))+","+hashno+","+fileId+")";      
            try {
                DmlStatement();
            } catch (Exception ex) {
                Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
                        }
                    }
    }

    public void createDoorLiningProperties(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String LiningDepth, String LiningThickness, String LiningOffset, String CasingThickness, String CasingDepth, int fileId) {
        query="insert into IFC_DoorLiningProperties(HashNo,GlobalId,OwnerHistoryHashNo,Name,LiningDepth,LiningThickness,LiningOffset,CasingThickness,CasingDepth,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"',"+Float.parseFloat(LiningDepth)+","+Float.parseFloat(LiningThickness)+","+Float.parseFloat(LiningOffset)+","+Float.parseFloat(CasingThickness)+","+Float.parseFloat(CasingDepth)+","+fileId+")"; 
    }

    public void createDoorPanelProperties(long hashno, String GlobalId, String OwnerHistoryHashNo, String Name, String PanelDepth, String PanelOperation, String PanelWidth, String PanelPosition, int fileId) {
        query="insert into IFC_DoorPanelProperties(HashNo,GlobalId,OwnerHistoryHashNo,Name,OperationType,PanelPosition,PanelDepth,PanelWidth,FKFileId) values("+hashno+",'"+GlobalId+"',"+Long.parseLong(OwnerHistoryHashNo)+",'"+Name+"','"+PanelOperation+"','"+PanelPosition+"',"+Float.parseFloat(PanelDepth)+","+Float.parseFloat(PanelWidth)+","+fileId+")"; 
    }

    public void getStorey(String FileId) {
        query="select distinct sto.GlobalId,sto.LevelName,sto.Position from IFC_RelContainedInSpacialStructure as sp join IFC_RelContainedInSpacialStructureMapping as spmap on sp.HashNo=spmap.RelContainedHashNo join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo join IFC_WallStandardCase as wall on spmap.StructureHashNo=wall.HashNo where sto.FKFileId="+Integer.parseInt(FileId);
    }

    public void getLowerSlab(Float Position, String FileId) {
        query="select distinct slab.GlobalId,'Slab' as Entity,ext.Depth from IFC_RelContainedInSpacialStructure as sp \n" +
"join IFC_RelContainedInSpacialStructureMapping as spmap on sp.HashNo=spmap.RelContainedHashNo and spmap.FKFileId=sp.FKFileId \n" +
"join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo and sto.FKFileId=sp.FKFileId \n" +
"join IFC_Slab as slab on spmap.StructureHashNo=slab.HashNo and slab.FKFileId=sp.FKFileId\n" +
"join IFC_ProductDefinationShapeMapping as prodmap on slab.ProductDefinationShapeHashNo=prodmap.ProductDefinationShapeHashNo and prodmap.FKFileId=sp.FKFileId\n" +
"join IFC_ShapeRepresentationMapping as shapemap on prodmap.ShapeRepresentationHashNo=shapemap.ShapeRepresentationHashNo and shapemap.FKFileId=sp.FKFileId\n" +
"join IFC_ExtrudedAreaSolid as ext on shapemap.ForwardHashNo=ext.HashNo and ext.FKFileId=sp.FKFileId\n" +
"where sp.FKFileId="+FileId+" and sto.Position="+Position;
        
        
        System.out.println(query);
    }

    public void getUpperSlab(Float Position, String FileId) {
        query="select distinct slab.GlobalId,'Slab' as Entity,ext.Depth from IFC_RelContainedInSpacialStructure as sp \n" +
"join IFC_RelContainedInSpacialStructureMapping as spmap on sp.HashNo=spmap.RelContainedHashNo and spmap.FKFileId=sp.FKFileId \n" +
"join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo and sto.FKFileId=sp.FKFileId\n" +
"join IFC_Slab as slab on spmap.StructureHashNo=slab.HashNo and slab.FKFileId=sp.FKFileId\n" +
"join IFC_ProductDefinationShapeMapping as prodmap on slab.ProductDefinationShapeHashNo=prodmap.ProductDefinationShapeHashNo and prodmap.FKFileId=sp.FKFileId\n" +
"join IFC_ShapeRepresentationMapping as shapemap on prodmap.ShapeRepresentationHashNo=shapemap.ShapeRepresentationHashNo and shapemap.FKFileId=sp.FKFileId\n" +
"join IFC_ExtrudedAreaSolid as ext on shapemap.ForwardHashNo=ext.HashNo and ext.FKFileId=sp.FKFileId\n" +
"where sp.FKFileId="+FileId+" and sto.Position=((select Max(ext.Depth) \n" +
"from IFC_RelContainedInSpacialStructure as sp \n" +
"join IFC_RelContainedInSpacialStructureMapping as spmap on sp.HashNo=spmap.RelContainedHashNo and spmap.FKFileId=sp.FKFileId\n" +
"join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo and sto.FKFileId=sp.FKFileId\n" +
"join IFC_WallStandardCase as wall on spmap.StructureHashNo=wall.HashNo and wall.FKFileId=sp.FKFileId\n" +
"join IFC_ProductDefinationShapeMapping as prodmap on wall.ProductDefinationShapeHashNo=prodmap.ProductDefinationShapeHashNo and prodmap.FKFileId=sp.FKFileId \n" +
"join IFC_ShapeRepresentationMapping as shapemap on prodmap.ShapeRepresentationHashNo=shapemap.ShapeRepresentationHashNo and shapemap.FKFileId=sp.FKFileId\n" +
"join IFC_ExtrudedAreaSolid as ext on shapemap.ForwardHashNo=ext.HashNo and ext.FKFileId=sp.FKFileId\n" +
"join IFC_ArbitaryClosedProfileDef as arb on ext.RectangleProfileDefHashNo=arb.HashNo  and arb.FKFileId=sp.FKFileId\n" +
"join IFC_PolylineCartesianMapping as arbmap on arb.PolylineHashNo=arbmap.PolylineHashNo and arbmap.FKFileId=sp.FKFileId\n" +
"--left join IFC_RectangleProfileDef as rect on ext.RectangleProfileDefHashNo=rect.HashNo \n" +
"join IFC_RelAssociateMaterial as mat on wall.HashNo=mat.RelatedObjectHashNo and mat.FKFileId=sp.FKFileId\n" +
"join IFC_MaterialLayerSetUsage as matuse on mat.RelatingMaterialHashNo=matuse.HashNo and matuse.FKFileId=sp.FKFileId\n" +
"join IFC_MaterialLayerSet as matset on matuse.MaterialLayerSetHashNo=matset.HashNo and matset.FKFileId=sp.FKFileId\n" +
"join IFC_MaterialLayer as matlay on matset.MaterialLayerHashNo=matlay.HashNo and matlay.FKFileId=sp.FKFileId\n" +
"where sp.FKFileId="+FileId+"  and sto.Position="+Position+")+"+Position+")";
    }

    public void getWalls(Float Position, String FileId) {
        query="select distinct wall.GlobalId,wall.Name as Name,'Wall' as Entity,ext.Depth as Height,matlay.Thickness as Thickness \n" +
"from IFC_RelContainedInSpacialStructure as sp \n" +
"join IFC_RelContainedInSpacialStructureMapping as spmap on sp.HashNo=spmap.RelContainedHashNo and spmap.FKFileId=sp.FKFileId\n" +
"join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo and sto.FKFileId=sp.FKFileId\n" +
"join IFC_WallStandardCase as wall on spmap.StructureHashNo=wall.HashNo and wall.FKFileId=sp.FKFileId \n" +
"join IFC_ProductDefinationShapeMapping as prodmap on wall.ProductDefinationShapeHashNo=prodmap.ProductDefinationShapeHashNo and prodmap.FKFileId=sp.FKFileId\n" +
"join IFC_ShapeRepresentationMapping as shapemap on prodmap.ShapeRepresentationHashNo=shapemap.ShapeRepresentationHashNo and shapemap.FKFileId=sp.FKFileId\n" +
"join IFC_ExtrudedAreaSolid as ext on shapemap.ForwardHashNo=ext.HashNo and ext.FKFileId=sp.FKFileId\n" +
"join IFC_ArbitaryClosedProfileDef as arb on ext.RectangleProfileDefHashNo=arb.HashNo and arb.FKFileId=sp.FKFileId\n" +
"join IFC_PolylineCartesianMapping as arbmap on arb.PolylineHashNo=arbmap.PolylineHashNo and arbmap.FKFileId=sp.FKFileId\n" +
"join IFC_RelAssociateMaterial as mat on wall.HashNo=mat.RelatedObjectHashNo and mat.FKFileId=sp.FKFileId\n" +
"join IFC_MaterialLayerSetUsage as matuse on mat.RelatingMaterialHashNo=matuse.HashNo and matuse.FKFileId=sp.FKFileId\n" +
"join IFC_MaterialLayerSet as matset on matuse.MaterialLayerSetHashNo=matset.HashNo and matset.FKFileId=sp.FKFileId\n" +
"join IFC_MaterialLayer as matlay on matset.MaterialLayerHashNo=matlay.HashNo and matlay.FKFileId=sp.FKFileId\n" +
"where sp.FKFileId="+FileId+" and sto.Position="+Position;
    }

    public void ClearDatabase() {
        query="delete  from IFC_Application\n" +
"delete  from IFC_Axis2Placement2D\n" +
"delete  from IFC_Axis2Placement3D\n" +
"delete  from IFC_BooleanClippingResult\n" +
"delete  from IFC_BuildingStorey\n" +
"delete  from IFC_CartesianPoint\n" +
"delete  from IFC_ColourRGB\n" +
"delete  from IFC_Direction\n" +
"delete  from IFC_ExtrudedAreaSolid\n" +
"delete  from IFC_GeometricRepresentationContext\n" +
"delete  from IFC_LocalPlacement\n" +
"delete  from IFC_Material\n" +
"delete  from IFC_MaterialDefinationRepresentation\n" +
"delete  from IFC_MaterialLayer\n" +
"delete  from IFC_MaterialLayerSet\n" +
"delete  from IFC_MaterialLayerSetUsage\n" +
"delete  from IFC_OpeningElement\n" +
"delete  from IFC_Organization\n" +
"delete  from IFC_OwnerHistory\n" +
"delete  from IFC_Person\n" +
"delete  from IFC_PersonOrganization\n" +
"delete  from IFC_Plane\n" +
"delete  from IFC_PolygonalBoundedHalfSpace\n" +
"delete  from IFC_Polyline\n" +
"delete  from IFC_PolylineCartesianMapping\n" +
"delete  from IFC_PresenationLayerAssignment\n" +
"delete  from IFC_PresenationLayerShapeMapping\n" +
"delete  from IFC_PresentationStyleAssignment\n" +
"delete  from IFC_ProductDefinationShape\n" +
"delete  from IFC_PropertySet\n" +
"delete  from IFC_PropertySingleValue\n" +
"delete  from IFC_PropertyValueMapping\n" +
"delete  from IFC_RectangleProfileDef\n" +
"delete  from IFC_RelAssociateMaterial\n" +
"delete  from IFC_Slab\n" +
"delete  from IFC_RelConnectsPathElements\n" +
"delete  from IFC_RelContainedInSpacialStructure\n" +
"delete  from IFC_RelContainedInSpacialStructureMapping\n" +
"delete  from IFC_RelDefineByProperties\n" +
"delete  from IFC_RelVoisElement\n" +
"delete  from IFC_ShapeReprentation\n" +
"delete  from IFC_StructureType\n" +
"delete  from IFC_StyledItem\n" +
"delete  from IFC_StyledRepresentation\n" +
"delete  from IFC_SurfaceRendering\n" +
"delete  from IFC_SurfaceStyle\n" +
"delete  from IFC_WallStandardCase\n" +
"delete  from IFC_WallType\n" +
"delete from IFC_ArbitaryClosedProfileDef\n" +
"delete from IFC_CartesianTransformationOperator3D\n" +
"delete from IFC_ClosedShell\n" +
"delete from IFC_ClosedShellMapping\n" +
"delete from IFC_ConversionBaseUnit\n" +
"delete from IFC_DerivedUnit\n" +
"delete from IFC_DerivedUnitElement\n" +
"delete from IFC_DerivedUnitMapping\n" +
"delete from IFC_DimensionalExponent\n" +
"delete from IFC_Door\n" +
"delete from IFC_DoorLiningProperties\n" +
"delete from IFC_DoorPanelProperties\n" +
"delete from IFC_DoorStyle\n" +
"delete from IFC_DoorStyleMapping\n" +
"delete from IFC_ElementQuantity\n" +
"delete from IFC_ElementQuantityMapping\n" +
"delete from IFC_Face\n" +
"delete from IFC_FaceMapping\n" +
"delete from IFC_FaceOuterbound\n" +
"delete from IFC_FacetedBrep\n" +
"delete from IFC_MappedItem\n" +
"delete from IFC_MeasureWithUnit\n" +
"delete from IFC_MonetaryUnit\n" +
"delete from IFC_OpenShell\n" +
"delete from IFC_OpenShellMapping\n" +
"delete from IFC_Polyloop\n" +
"delete from IFC_PolyloopMapping\n" +
"delete from IFC_Project\n" +
"delete from IFC_ProjectGeometricMapping\n" +
"delete from IFC_QuantityArea\n" +
"delete from IFC_QuantityLength\n" +
"delete from IFC_QuantityVolume\n" +
"delete from IFC_RelAggregates\n" +
"delete from IFC_RelAggregatesSiteMapping\n" +
"delete from IFC_RelDefinesByType\n" +
"delete from IFC_RelDefinesByTypeMapping\n" +
"delete from IFC_RelfillsElement\n" +
"delete from IFC_RepresentationMap\n" +
"delete from IFC_ShellBasedSurfaceModel\n" +
"delete from IFC_ShellBasedSurfaceModelMapping\n" +
"delete from IFC_Site\n" +
"delete from IFC_SIUnit\n" +
"delete from IFC_UnitAssignment\n" +
"delete from IFC_UnitAssignmentDerivedMapping\n" +
"delete from IFC_Window\n" +
"delete from IFC_WindowLiningProperties\n" +
"delete from IFC_WindowPanelProperties\n" +
"delete from IFC_WindowStyle\n" +
"delete from IFC_WindowStyleMapping\n" +
"delete  from IFC_File";
    }
    
    public void getLengthOfWall(String GlobalId,String FileId)
    {
        query="select (Max(cart.Xdim)+ ABS(Min(cart.Xdim))) as 'Length' \n" +
"from IFC_WallStandardCase as wall\n" +
"join IFC_ProductDefinationShapeMapping as prodmap on wall.ProductDefinationShapeHashNo=prodmap.ProductDefinationShapeHashNo and prodmap.FKFileId=wall.FKFileId\n" +
"join IFC_ShapeRepresentationMapping as shapemap on prodmap.ShapeRepresentationHashNo=shapemap.ShapeRepresentationHashNo and shapemap.FKFileId=wall.FKFileId\n" +
"join IFC_ExtrudedAreaSolid as ext on shapemap.ForwardHashNo=ext.HashNo and ext.FKFileId=wall.FKFileId\n" +
"join IFC_ArbitaryClosedProfileDef as arb on ext.RectangleProfileDefHashNo=arb.HashNo  and arb.FKFileId=wall.FKFileId\n" +
"join IFC_PolylineCartesianMapping as arbmap on arb.PolylineHashNo=arbmap.PolylineHashNo and arbmap.FKFileId=wall.FKFileId\n" +
"join IFC_CartesianPoint as cart on arbmap.CartesianHashNo=cart.HashNo and cart.FKFileId=wall.FKFileId\n" +
"where wall.FKFileId="+FileId+" and wall.GlobalId='"+GlobalId+"'";
    }

    public void getJointsOfWall(String GlobalId, String FileId) {
        query="select count(*) as 'Joints'\n" +
"from IFC_WallStandardCase as wall\n" +
"join IFC_RelConnectsPathElements as con on (wall.HashNo=con.RelatingElement1HashNo or wall.HashNo=con.RelatingElement2HashNo)\n" +
"where wall.FKFileId="+FileId   +" and wall.GlobalId='"+GlobalId+"'";
    }

    public void getOpeningsinWall(String GlobalId, String FileId) {
        query="select count(*) as 'Openings'\n" +
"from IFC_WallStandardCase as wall\n" +
"join IFC_RelVoisElement as con on wall.HashNo=con.WallStandardCaseHashNo\n" +
"where wall.FKFileId="+FileId+" and wall.GlobalId='"+GlobalId+"'";
    }

    public void getBiggestOpeningWall(String GlobalId, String FileId) {
        query="select Max(rect.Breath) as Height\n" +
"from IFC_WallStandardCase as wall\n" +
"join IFC_RelVoisElement as con on wall.HashNo=con.WallStandardCaseHashNo\n" +
"join IFC_OpeningElement as opens on con.OpeningElementHashNo=opens.HashNo\n" +
"join IFC_ProductDefinationShapeMapping as prodmap on opens.ProductDefinationShapeHashNo=prodmap.ProductDefinationShapeHashNo\n" +
"join IFC_ShapeRepresentationMapping as shapemap on prodmap.ShapeRepresentationHashNo=shapemap.ShapeRepresentationHashNo\n" +
"join IFC_ExtrudedAreaSolid as ext on shapemap.ForwardHashNo=ext.HashNo\n" +
"join IFC_RectangleProfileDef as rect on ext.RectangleProfileDefHashNo=rect.HashNo\n" +
"where wall.FKFileId="+FileId+" and wall.GlobalId='"+GlobalId+"'";
    }
    
    public void getSingleLineWalls(String GlobalId,Float Position,String FileId)
    {
        query="declare @GlobalId nvarchar(max)\n" +
"set @GlobalId='"+GlobalId+"'\n" +
"select distinct wall.GlobalId\n" +
"from IFC_RelContainedInSpacialStructure as sp \n" +
"join IFC_RelContainedInSpacialStructureMapping as spmap on sp.HashNo=spmap.RelContainedHashNo and spmap.FKFileId=sp.FKFileId\n" +
"join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo and sto.FKFileId=spmap.FKFileId \n" +
"join IFC_WallStandardCase as wall on spmap.StructureHashNo=wall.HashNo and wall.FKFileId=spmap.FKFileId\n" +
"join IFC_LocalPlacement as localp on wall.LocalPlacementHashNo=localp.HashNo and localp.FKFileId=sto.FKFileId \n" +
"join IFC_Axis2Placement3D as axis on localp.Axis2PlacementHashNo=axis.HashNo and axis.FKFileId=sto.FKFileId \n" +
"join IFC_CartesianPoint as cart on axis.CartesianHashNo=cart.HashNo and cart.FKFileId=sto.FKFileId\n" +
"left join IFC_Direction as dir1 on axis.Dir1HashNo=dir1.HashNo and dir1.FKFileId=sto.FKFileId\n" +
"left join IFC_Direction as dir2 on axis.Dir2HashNo=dir2.HashNo and dir2.FKFileId=sto.FKFileId\n" +
"where \n" +
"dir1.Xdim=(select indir1.Xdim from IFC_WallStandardCase as inwall join IFC_LocalPlacement as inlocalp on inwall.LocalPlacementHashNo=inlocalp.HashNo and inlocalp.FKFileId=inwall.FKFileId join IFC_Axis2Placement3D as inaxis on inlocalp.Axis2PlacementHashNo=inaxis.HashNo and inaxis.FKFileId=inwall.FKFileId join IFC_CartesianPoint as incart on inaxis.CartesianHashNo=incart.HashNo and incart.FKFileId=inaxis.FKFileId left join IFC_Direction as indir1 on inaxis.Dir1HashNo=indir1.HashNo and inwall.FKFileId=indir1.FKFileId where inwall.GlobalId=@GlobalId and inwall.FKFileId=sp.FKFileId )\n" +
"and dir1.Ydim=(select indir1.Ydim from IFC_WallStandardCase as inwall join IFC_LocalPlacement as inlocalp on inwall.LocalPlacementHashNo=inlocalp.HashNo and inlocalp.FKFileId=inwall.FKFileId join IFC_Axis2Placement3D as inaxis on inlocalp.Axis2PlacementHashNo=inaxis.HashNo and inaxis.FKFileId=inwall.FKFileId join IFC_CartesianPoint as incart on inaxis.CartesianHashNo=incart.HashNo and incart.FKFileId=inaxis.FKFileId left join IFC_Direction as indir1 on inaxis.Dir1HashNo=indir1.HashNo and inwall.FKFileId=indir1.FKFileId where inwall.GlobalId=@GlobalId and inwall.FKFileId=sp.FKFileId )\n" +
"and dir1.Zdim=(select indir1.Zdim from IFC_WallStandardCase as inwall join IFC_LocalPlacement as inlocalp on inwall.LocalPlacementHashNo=inlocalp.HashNo and inlocalp.FKFileId=inwall.FKFileId join IFC_Axis2Placement3D as inaxis on inlocalp.Axis2PlacementHashNo=inaxis.HashNo and inaxis.FKFileId=inwall.FKFileId join IFC_CartesianPoint as incart on inaxis.CartesianHashNo=incart.HashNo and incart.FKFileId=inaxis.FKFileId left join IFC_Direction as indir1 on inaxis.Dir1HashNo=indir1.HashNo and inwall.FKFileId=indir1.FKFileId where inwall.GlobalId=@GlobalId and inwall.FKFileId=sp.FKFileId )\n" +
"and dir2.Xdim=(select indir2.Xdim from IFC_WallStandardCase as inwall join IFC_LocalPlacement as inlocalp on inwall.LocalPlacementHashNo=inlocalp.HashNo and inlocalp.FKFileId=inwall.FKFileId join IFC_Axis2Placement3D as inaxis on inlocalp.Axis2PlacementHashNo=inaxis.HashNo and inaxis.FKFileId=inwall.FKFileId join IFC_CartesianPoint as incart on inaxis.CartesianHashNo=incart.HashNo and incart.FKFileId=inaxis.FKFileId left join IFC_Direction as indir2 on inaxis.Dir2HashNo=indir2.HashNo and inwall.FKFileId=indir2.FKFileId where inwall.GlobalId=@GlobalId and inwall.FKFileId=sp.FKFileId )\n" +
"and dir2.Ydim=(select indir2.Ydim from IFC_WallStandardCase as inwall join IFC_LocalPlacement as inlocalp on inwall.LocalPlacementHashNo=inlocalp.HashNo and inlocalp.FKFileId=inwall.FKFileId join IFC_Axis2Placement3D as inaxis on inlocalp.Axis2PlacementHashNo=inaxis.HashNo and inaxis.FKFileId=inwall.FKFileId join IFC_CartesianPoint as incart on inaxis.CartesianHashNo=incart.HashNo and incart.FKFileId=inaxis.FKFileId left join IFC_Direction as indir2 on inaxis.Dir2HashNo=indir2.HashNo and inwall.FKFileId=indir2.FKFileId where inwall.GlobalId=@GlobalId and inwall.FKFileId=sp.FKFileId )\n" +
"and dir2.Zdim=(select indir2.Zdim from IFC_WallStandardCase as inwall join IFC_LocalPlacement as inlocalp on inwall.LocalPlacementHashNo=inlocalp.HashNo and inlocalp.FKFileId=inwall.FKFileId join IFC_Axis2Placement3D as inaxis on inlocalp.Axis2PlacementHashNo=inaxis.HashNo and inaxis.FKFileId=inwall.FKFileId join IFC_CartesianPoint as incart on inaxis.CartesianHashNo=incart.HashNo and incart.FKFileId=inaxis.FKFileId left join IFC_Direction as indir2 on inaxis.Dir2HashNo=indir2.HashNo and inwall.FKFileId=indir2.FKFileId where inwall.GlobalId=@GlobalId and inwall.FKFileId=sp.FKFileId )\n" +
"and sp.FKFileId="+FileId+" \n" +
"and sto.Position="+Position+"  \n" +
"and wall.GlobalId!=@GlobalId";
    }
            
public void getConnectedWalls(String GlobalId, Float Position, String FileId)
{
    query="select \n" +
"case \n" +
"when con.RelatingElement1HashNo=wall.HashNo \n" +
"	Then (select inwall.GlobalId from IFC_WallStandardCase as inwall where inwall.HashNo=con.RelatingElement2HashNo and inwall.FKFileId=con.FKFileId)\n" +
"Else (select inwall.GlobalId from IFC_WallStandardCase as inwall where inwall.HashNo=con.RelatingElement1HashNo and inwall.FKFileId=con.FKFileId) end as GlobalId from IFC_RelConnectsPathElements as con \n" +
"join IFC_WallStandardCase as wall on (con.RelatingElement1HashNo=wall.HashNo or con.RelatingElement2HashNo=wall.HashNo) and wall.FKFileId=con.FKFileId\n" +
"join IFC_RelContainedInSpacialStructureMapping as spmap on wall.HashNo=spmap.StructureHashNo and spmap.FKFileId=con.FKFileId\n" +
"join IFC_RelContainedInSpacialStructure as sp on spmap.RelContainedHashNo=sp.HashNo and sp.FKFileId=con.FKFileId\n" +
"join IFC_BuildingStorey as sto on sp.BuildingStoreyHashNo=sto.HashNo and sto.FKFileId=con.FKFileId \n" +
"where sto.Position="+Position+" and con.FKFileId="+FileId+" and wall.GlobalId='"+GlobalId+"'";
}
   

    


   
}
