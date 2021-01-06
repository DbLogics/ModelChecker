/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcIShapeProfileDef<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcIShapeProfileDef extends IfcParameterizedProfileDef implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcProfileTypeEnum","IfcLabel","IfcAxis2Placement2D","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure","IfcPositiveLengthMeasure"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** OverallWidth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure OverallWidth;
	/** OverallDepth is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure OverallDepth;
	/** WebThickness is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure WebThickness;
	/** FlangeThickness is an DEMANDED attribute - may not be null**/
	protected IfcPositiveLengthMeasure FlangeThickness;
	/** FilletRadius is an OPTIONAL attribute**/
	protected IfcPositiveLengthMeasure FilletRadius;
	/**
	* The default constructor.
	**/
	public IfcIShapeProfileDef(){}

	/**
	* Constructs a new IfcIShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param OverallWidth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param OverallDepth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param WebThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FlangeThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FilletRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public IfcIShapeProfileDef(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure OverallWidth, IfcPositiveLengthMeasure OverallDepth, IfcPositiveLengthMeasure WebThickness, IfcPositiveLengthMeasure FlangeThickness, IfcPositiveLengthMeasure FilletRadius)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.OverallWidth = OverallWidth;
		this.OverallDepth = OverallDepth;
		this.WebThickness = WebThickness;
		this.FlangeThickness = FlangeThickness;
		this.FilletRadius = FilletRadius;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcIShapeProfileDef object using the given parameters.
	*
	* @param ProfileType DEMANDED parameter of type IfcProfileTypeEnum - may not be null.
	* @param ProfileName OPTIONAL parameter of type IfcLabel
	* @param Position DEMANDED parameter of type IfcAxis2Placement2D - may not be null.
	* @param OverallWidth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param OverallDepth DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param WebThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FlangeThickness DEMANDED parameter of type IfcPositiveLengthMeasure - may not be null.
	* @param FilletRadius OPTIONAL parameter of type IfcPositiveLengthMeasure
	**/
	public void setParameters(IfcProfileTypeEnum ProfileType, IfcLabel ProfileName, IfcAxis2Placement2D Position, IfcPositiveLengthMeasure OverallWidth, IfcPositiveLengthMeasure OverallDepth, IfcPositiveLengthMeasure WebThickness, IfcPositiveLengthMeasure FlangeThickness, IfcPositiveLengthMeasure FilletRadius)
	{
		this.ProfileType = ProfileType;
		this.ProfileName = ProfileName;
		this.Position = Position;
		this.OverallWidth = OverallWidth;
		this.OverallDepth = OverallDepth;
		this.WebThickness = WebThickness;
		this.FlangeThickness = FlangeThickness;
		this.FilletRadius = FilletRadius;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.ProfileType = (IfcProfileTypeEnum) parameters.get(0);
		this.ProfileName = (IfcLabel) parameters.get(1);
		this.Position = (IfcAxis2Placement2D) parameters.get(2);
		this.OverallWidth = (IfcPositiveLengthMeasure) parameters.get(3);
		this.OverallDepth = (IfcPositiveLengthMeasure) parameters.get(4);
		this.WebThickness = (IfcPositiveLengthMeasure) parameters.get(5);
		this.FlangeThickness = (IfcPositiveLengthMeasure) parameters.get(6);
		this.FilletRadius = (IfcPositiveLengthMeasure) parameters.get(7);
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
		return IfcIShapeProfileDef.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCISHAPEPROFILEDEF(");
		if(getRedefinedDerivedAttributeTypes().contains("ProfileType")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileType != null)		stepString = stepString.concat(((RootInterface)this.ProfileType).getStepParameter(IfcProfileTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProfileName")) stepString = stepString.concat("*,");
		else{
		if(this.ProfileName != null)		stepString = stepString.concat(((RootInterface)this.ProfileName).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Position")) stepString = stepString.concat("*,");
		else{
		if(this.Position != null)		stepString = stepString.concat(((RootInterface)this.Position).getStepParameter(IfcAxis2Placement2D.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OverallWidth")) stepString = stepString.concat("*,");
		else{
		if(this.OverallWidth != null)		stepString = stepString.concat(((RootInterface)this.OverallWidth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OverallDepth")) stepString = stepString.concat("*,");
		else{
		if(this.OverallDepth != null)		stepString = stepString.concat(((RootInterface)this.OverallDepth).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("WebThickness")) stepString = stepString.concat("*,");
		else{
		if(this.WebThickness != null)		stepString = stepString.concat(((RootInterface)this.WebThickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FlangeThickness")) stepString = stepString.concat("*,");
		else{
		if(this.FlangeThickness != null)		stepString = stepString.concat(((RootInterface)this.FlangeThickness).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("FilletRadius")) stepString = stepString.concat("*);");
		else{
		if(this.FilletRadius != null)		stepString = stepString.concat(((RootInterface)this.FilletRadius).getStepParameter(IfcPositiveLengthMeasure.class.isInterface())+");");
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
	* This method sets the OverallWidth attribute to the given value.
	*
	* @param OverallWidth OPTIONAL value to set
	**/
	public void setOverallWidth(IfcPositiveLengthMeasure OverallWidth)
	{
		this.OverallWidth = OverallWidth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OverallWidth attribute.
	*
	* @return the value of OverallWidth
	/**/
	public IfcPositiveLengthMeasure getOverallWidth()
	{
		return this.OverallWidth;
	}

	/**
	* This method sets the OverallDepth attribute to the given value.
	*
	* @param OverallDepth OPTIONAL value to set
	**/
	public void setOverallDepth(IfcPositiveLengthMeasure OverallDepth)
	{
		this.OverallDepth = OverallDepth;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the OverallDepth attribute.
	*
	* @return the value of OverallDepth
	/**/
	public IfcPositiveLengthMeasure getOverallDepth()
	{
		return this.OverallDepth;
	}

	/**
	* This method sets the WebThickness attribute to the given value.
	*
	* @param WebThickness OPTIONAL value to set
	**/
	public void setWebThickness(IfcPositiveLengthMeasure WebThickness)
	{
		this.WebThickness = WebThickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the WebThickness attribute.
	*
	* @return the value of WebThickness
	/**/
	public IfcPositiveLengthMeasure getWebThickness()
	{
		return this.WebThickness;
	}

	/**
	* This method sets the FlangeThickness attribute to the given value.
	*
	* @param FlangeThickness OPTIONAL value to set
	**/
	public void setFlangeThickness(IfcPositiveLengthMeasure FlangeThickness)
	{
		this.FlangeThickness = FlangeThickness;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FlangeThickness attribute.
	*
	* @return the value of FlangeThickness
	/**/
	public IfcPositiveLengthMeasure getFlangeThickness()
	{
		return this.FlangeThickness;
	}

	/**
	* This method sets the FilletRadius attribute to the given value.
	*
	* @param FilletRadius DEMANDED value to set - may not be null
	**/
	public void setFilletRadius(IfcPositiveLengthMeasure FilletRadius)
	{
		this.FilletRadius = FilletRadius;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the FilletRadius attribute.
	*
	* @return the value of FilletRadius
	/**/
	public IfcPositiveLengthMeasure getFilletRadius()
	{
		return this.FilletRadius;
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
		IfcIShapeProfileDef ifcIShapeProfileDef = new IfcIShapeProfileDef();
		if(this.ProfileType != null)
			ifcIShapeProfileDef.setProfileType((IfcProfileTypeEnum)this.ProfileType.clone());
		if(this.ProfileName != null)
			ifcIShapeProfileDef.setProfileName((IfcLabel)this.ProfileName.clone());
		if(this.Position != null)
			ifcIShapeProfileDef.setPosition((IfcAxis2Placement2D)this.Position.clone());
		if(this.OverallWidth != null)
			ifcIShapeProfileDef.setOverallWidth((IfcPositiveLengthMeasure)this.OverallWidth.clone());
		if(this.OverallDepth != null)
			ifcIShapeProfileDef.setOverallDepth((IfcPositiveLengthMeasure)this.OverallDepth.clone());
		if(this.WebThickness != null)
			ifcIShapeProfileDef.setWebThickness((IfcPositiveLengthMeasure)this.WebThickness.clone());
		if(this.FlangeThickness != null)
			ifcIShapeProfileDef.setFlangeThickness((IfcPositiveLengthMeasure)this.FlangeThickness.clone());
		if(this.FilletRadius != null)
			ifcIShapeProfileDef.setFilletRadius((IfcPositiveLengthMeasure)this.FilletRadius.clone());
		return ifcIShapeProfileDef;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcIShapeProfileDef ifcIShapeProfileDef = new IfcIShapeProfileDef();
		if(this.ProfileType != null)
			ifcIShapeProfileDef.setProfileType(this.ProfileType);
		if(this.ProfileName != null)
			ifcIShapeProfileDef.setProfileName(this.ProfileName);
		if(this.Position != null)
			ifcIShapeProfileDef.setPosition(this.Position);
		if(this.OverallWidth != null)
			ifcIShapeProfileDef.setOverallWidth(this.OverallWidth);
		if(this.OverallDepth != null)
			ifcIShapeProfileDef.setOverallDepth(this.OverallDepth);
		if(this.WebThickness != null)
			ifcIShapeProfileDef.setWebThickness(this.WebThickness);
		if(this.FlangeThickness != null)
			ifcIShapeProfileDef.setFlangeThickness(this.FlangeThickness);
		if(this.FilletRadius != null)
			ifcIShapeProfileDef.setFilletRadius(this.FilletRadius);
		return ifcIShapeProfileDef;
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
