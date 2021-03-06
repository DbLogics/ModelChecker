/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcExtrudedAreaSolid<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileDef","IfcAxis2Placement3D","IfcDirection","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ExtrudedDirection is an DEMANDED attribute - may not be null**/
	protected IfcDirection ExtrudedDirection;
	/** Depth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure Depth;
	/**
	* The default constructor.
	**/
	public IfcExtrudedAreaSolid(){}

	/**
	* Constructs a new IfcExtrudedAreaSolid object using the given parameters.
	*
	* @param SweptArea DEMANDED parameter of type IfcProfileDef - may not be null.
	* @param Position DEMANDED parameter of type IfcAxis2Placement3D - may not be null.
	* @param ExtrudedDirection DEMANDED parameter of type IfcDirection - may not be null.
	* @param Depth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public IfcExtrudedAreaSolid(IfcProfileDef SweptArea, IfcAxis2Placement3D Position, IfcDirection ExtrudedDirection, IfcPositiveLengthMeasure Depth)
	{
		this.SweptArea = SweptArea;
		this.Position = Position;
		this.ExtrudedDirection = ExtrudedDirection;
		this.Depth = Depth;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcExtrudedAreaSolid object using the given parameters.
	*
	* @param SweptArea DEMANDED parameter of type IfcProfileDef - may not be null.
	* @param Position DEMANDED parameter of type IfcAxis2Placement3D - may not be null.
	* @param ExtrudedDirection DEMANDED parameter of type IfcDirection - may not be null.
	* @param Depth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	**/
	public void setParameters(IfcProfileDef SweptArea, IfcAxis2Placement3D Position, IfcDirection ExtrudedDirection, IfcPositiveLengthMeasure Depth)
	{
		this.SweptArea = SweptArea;
		this.Position = Position;
		this.ExtrudedDirection = ExtrudedDirection;
		this.Depth = Depth;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.SweptArea = (IfcProfileDef) parameters.get(0);
		this.Position = (IfcAxis2Placement3D) parameters.get(1);
		this.ExtrudedDirection = (IfcDirection) parameters.get(2);
		this.Depth = (IfcPositiveLengthMeasure) parameters.get(3);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcExtrudedAreaSolid.nonInverseAttributes;	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	private java.util.HashSet<String> getRedefinedDerivedAttributeTypes()
	{
		java.util.HashSet<String> redefinedDerivedAttributes = new java.util.HashSet<String>();
		return redefinedDerivedAttributes;	}

	/**
 * This method returns the object IFC  STEP representation. This method is called by the IfcModel object to write IFC STEP files.
	 *
	 * @return the IFC STEP representation of this object
	**/
	public String getStepLine()
	{
		String stepString = new String("#"+this.stepLineNumber+"= ");
		stepString = stepString.concat("IFCEXTRUDEDAREASOLID(");
		if(getRedefinedDerivedAttributeTypes().contains("SweptArea")) stepString = stepString.concat("*,");
		else{
		if(this.SweptArea != null)		stepString = stepString.concat(((RootInterface)this.SweptArea).getStepParameter(IfcProfileDef.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement3D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ExtrudedDirection")) stepString = stepString.concat("*,");
		else{
		if(this.ExtrudedDirection != null)		stepString = stepString.concat(((RootInterface)this.ExtrudedDirection).getStepParameter(IfcDirection.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Depth")) stepString = stepString.concat("*);");
		else{
		if(this.Depth != null)		stepString = stepString.concat(((RootInterface)this.Depth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
		else		stepString = stepString.concat("$);");
		}
		return stepString;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	public String getStepParameter(boolean isSelectType)
	{
		return "#" + this.stepLineNumber;
	}

	/**
	 * This method returns the line number within a IFC  STEP representation. This method is called from other objects, where this one is referenced.
	 *
	 * @return the STEP line number
	**/
	public int getStepLineNumber()
	{
		return this.stepLineNumber;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepLineNumber(int number)
	{
		this.stepLineNumber = number;
	}

	/**
	* This method sets the ExtrudedDirection attribute to the given value.
	*
	* @param ExtrudedDirection OPTIONAL value to set
	**/
	public void setExtrudedDirection(IfcDirection ExtrudedDirection)
	{
		this.ExtrudedDirection = ExtrudedDirection;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ExtrudedDirection attribute.
	*
	* @return the value of ExtrudedDirection
	/**/
	public IfcDirection getExtrudedDirection()
	{
		return this.ExtrudedDirection;
	}

	/**
	* This method sets the Depth attribute to the given value.
	*
	* @param Depth OPTIONAL value to set
	**/
	public void setDepth(IfcPositiveLengthMeasure Depth)
	{
		this.Depth = Depth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Depth attribute.
	*
	* @return the value of Depth
	/**/
	public IfcPositiveLengthMeasure getDepth()
	{
		return this.Depth;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void setStepParameter(java.util.ArrayList<CloneableObject> parameter)
	{
		this.stepParameter = parameter;
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	java.util.ArrayList<CloneableObject> getStepParameter()
	{
		return this.stepParameter;
	}

	/**
	 * This method registers an ObjectChangeListener to this object. An event is fired whenever one of its values was changed.
	 * 
	 *@param listener the listener to register
	**/
	public void addObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	listenerList = new java.util.HashSet<ObjectChangeListener>(1,1);
		listenerList.add(listener);
	}

	/**
	 * This method unregisters an ObjectChangeListener from this object.
	 * 
	 *@param listener the listener to unregister
	**/
	public void removeObjectChangeListener(ObjectChangeListener listener)
	{
		if (listenerList == null)	return;
		listenerList.remove(listener);
		if (listenerList.size()==0) listenerList = null;
	}

	/**
	 * This method removes all currently registered ObjectChangeListeners from this object.
	**/
	public void removeAllObjectChangeListeners()
	{
		listenerList = null;
	}

	protected void fireChangeEvent()
	{
		if(listenerList == null) return;
		for(ObjectChangeListener listener : listenerList)
			listener.ifcModelObjectChange(this);
	}

	/**
	 * This method clones the object (deep cloning).
	 *
	 * @return the cloned object
	**/
	public Object clone()
	{
		IfcExtrudedAreaSolid ifcExtrudedAreaSolid = new IfcExtrudedAreaSolid();
		if(this.SweptArea != null)
			ifcExtrudedAreaSolid.setSweptArea((IfcProfileDef)this.SweptArea.clone());
		if(this.Position != null)
			ifcExtrudedAreaSolid.setPosition((IfcAxis2Placement3D)this.Position.clone());
		if(this.ExtrudedDirection != null)
			ifcExtrudedAreaSolid.setExtrudedDirection((IfcDirection)this.ExtrudedDirection.clone());
		if(this.Depth != null)
			ifcExtrudedAreaSolid.setDepth((IfcPositiveLengthMeasure)this.Depth.clone());
		return ifcExtrudedAreaSolid;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcExtrudedAreaSolid ifcExtrudedAreaSolid = new IfcExtrudedAreaSolid();
		if(this.SweptArea != null)
			ifcExtrudedAreaSolid.setSweptArea(this.SweptArea);
		if(this.Position != null)
			ifcExtrudedAreaSolid.setPosition(this.Position);
		if(this.ExtrudedDirection != null)
			ifcExtrudedAreaSolid.setExtrudedDirection(this.ExtrudedDirection);
		if(this.Depth != null)
			ifcExtrudedAreaSolid.setDepth(this.Depth);
		return ifcExtrudedAreaSolid;
	}

	/**
	* This method returns the objects standard description.
	*
	* @return the standard description
	**/
	public String toString()
	{
		return "#"+ this.getStepLineNumber() + " " + this.getClass().getSimpleName();
	}


}
