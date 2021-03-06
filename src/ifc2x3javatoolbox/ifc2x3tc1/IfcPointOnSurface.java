/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcPointOnSurface<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcPointOnSurface extends IfcPoint implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcSurface","IfcParameterValue","IfcParameterValue"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** BasisSurface is an DEMANDED attribute - may not be null**/
	protected IfcSurface BasisSurface;
	/** PointParameterU is an DEMANDED attribute - may not be null**/
	protected IfcParameterValue PointParameterU;
	/** PointParameterV is an DEMANDED attribute - may not be null**/
	protected IfcParameterValue PointParameterV;
	/**
	* The default constructor.
	**/
	public IfcPointOnSurface(){}

	/**
	* Constructs a new IfcPointOnSurface object using the given parameters.
	*
	* @param BasisSurface DEMANDED parameter of type IfcSurface - may not be null.
	* @param PointParameterU DEMANDED parameter of type IfcParameterValue - may not be null.
	* @param PointParameterV DEMANDED parameter of type IfcParameterValue - may not be null.
	**/
	public IfcPointOnSurface(IfcSurface BasisSurface, IfcParameterValue PointParameterU, IfcParameterValue PointParameterV)
	{
		this.BasisSurface = BasisSurface;
		this.PointParameterU = PointParameterU;
		this.PointParameterV = PointParameterV;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcPointOnSurface object using the given parameters.
	*
	* @param BasisSurface DEMANDED parameter of type IfcSurface - may not be null.
	* @param PointParameterU DEMANDED parameter of type IfcParameterValue - may not be null.
	* @param PointParameterV DEMANDED parameter of type IfcParameterValue - may not be null.
	**/
	public void setParameters(IfcSurface BasisSurface, IfcParameterValue PointParameterU, IfcParameterValue PointParameterV)
	{
		this.BasisSurface = BasisSurface;
		this.PointParameterU = PointParameterU;
		this.PointParameterV = PointParameterV;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.BasisSurface = (IfcSurface) parameters.get(0);
		this.PointParameterU = (IfcParameterValue) parameters.get(1);
		this.PointParameterV = (IfcParameterValue) parameters.get(2);
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
		return IfcPointOnSurface.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCPOINTONSURFACE(");
		if(getRedefinedDerivedAttributeTypes().contains("BasisSurface")) stepString = stepString.concat("*,");
		else{
		if(this.BasisSurface != null)		stepString = stepString.concat(((RootInterface)this.BasisSurface).getStepParameter(IfcSurface.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PointParameterU")) stepString = stepString.concat("*,");
		else{
		if(this.PointParameterU != null)		stepString = stepString.concat(((RootInterface)this.PointParameterU).getStepParameter(IfcParameterValue.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("PointParameterV")) stepString = stepString.concat("*);");
		else{
		if(this.PointParameterV != null)		stepString = stepString.concat(((RootInterface)this.PointParameterV).getStepParameter(IfcParameterValue.class.isInterface())+");");
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
	* This method sets the BasisSurface attribute to the given value.
	*
	* @param BasisSurface OPTIONAL value to set
	**/
	public void setBasisSurface(IfcSurface BasisSurface)
	{
		this.BasisSurface = BasisSurface;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the BasisSurface attribute.
	*
	* @return the value of BasisSurface
	/**/
	public IfcSurface getBasisSurface()
	{
		return this.BasisSurface;
	}

	/**
	* This method sets the PointParameterU attribute to the given value.
	*
	* @param PointParameterU OPTIONAL value to set
	**/
	public void setPointParameterU(IfcParameterValue PointParameterU)
	{
		this.PointParameterU = PointParameterU;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PointParameterU attribute.
	*
	* @return the value of PointParameterU
	/**/
	public IfcParameterValue getPointParameterU()
	{
		return this.PointParameterU;
	}

	/**
	* This method sets the PointParameterV attribute to the given value.
	*
	* @param PointParameterV OPTIONAL value to set
	**/
	public void setPointParameterV(IfcParameterValue PointParameterV)
	{
		this.PointParameterV = PointParameterV;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the PointParameterV attribute.
	*
	* @return the value of PointParameterV
	/**/
	public IfcParameterValue getPointParameterV()
	{
		return this.PointParameterV;
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
		IfcPointOnSurface ifcPointOnSurface = new IfcPointOnSurface();
		if(this.BasisSurface != null)
			ifcPointOnSurface.setBasisSurface((IfcSurface)this.BasisSurface.clone());
		if(this.PointParameterU != null)
			ifcPointOnSurface.setPointParameterU((IfcParameterValue)this.PointParameterU.clone());
		if(this.PointParameterV != null)
			ifcPointOnSurface.setPointParameterV((IfcParameterValue)this.PointParameterV.clone());
		return ifcPointOnSurface;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcPointOnSurface ifcPointOnSurface = new IfcPointOnSurface();
		if(this.BasisSurface != null)
			ifcPointOnSurface.setBasisSurface(this.BasisSurface);
		if(this.PointParameterU != null)
			ifcPointOnSurface.setPointParameterU(this.PointParameterU);
		if(this.PointParameterV != null)
			ifcPointOnSurface.setPointParameterV(this.PointParameterV);
		return ifcPointOnSurface;
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
