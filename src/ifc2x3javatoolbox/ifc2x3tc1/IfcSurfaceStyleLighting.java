/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcSurfaceStyleLighting<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcSurfaceStyleLighting extends InternalAccessClass implements ClassInterface, IfcSurfaceStyleElementSelect
{
	private static final String[] nonInverseAttributes = new String[]{"IfcColourRgb","IfcColourRgb","IfcColourRgb","IfcColourRgb"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** DiffuseTransmissionColour is an DEMANDED attribute - may not be null**/
	protected IfcColourRgb DiffuseTransmissionColour;
	/** DiffuseReflectionColour is an DEMANDED attribute - may not be null**/
	protected IfcColourRgb DiffuseReflectionColour;
	/** TransmissionColour is an DEMANDED attribute - may not be null**/
	protected IfcColourRgb TransmissionColour;
	/** ReflectanceColour is an DEMANDED attribute - may not be null**/
	protected IfcColourRgb ReflectanceColour;
	/**
	* The default constructor.
	**/
	public IfcSurfaceStyleLighting(){}

	/**
	* Constructs a new IfcSurfaceStyleLighting object using the given parameters.
	*
	* @param DiffuseTransmissionColour DEMANDED parameter of type IfcColourRgb - may not be null.
	* @param DiffuseReflectionColour DEMANDED parameter of type IfcColourRgb - may not be null.
	* @param TransmissionColour DEMANDED parameter of type IfcColourRgb - may not be null.
	* @param ReflectanceColour DEMANDED parameter of type IfcColourRgb - may not be null.
	**/
	public IfcSurfaceStyleLighting(IfcColourRgb DiffuseTransmissionColour, IfcColourRgb DiffuseReflectionColour, IfcColourRgb TransmissionColour, IfcColourRgb ReflectanceColour)
	{
		this.DiffuseTransmissionColour = DiffuseTransmissionColour;
		this.DiffuseReflectionColour = DiffuseReflectionColour;
		this.TransmissionColour = TransmissionColour;
		this.ReflectanceColour = ReflectanceColour;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcSurfaceStyleLighting object using the given parameters.
	*
	* @param DiffuseTransmissionColour DEMANDED parameter of type IfcColourRgb - may not be null.
	* @param DiffuseReflectionColour DEMANDED parameter of type IfcColourRgb - may not be null.
	* @param TransmissionColour DEMANDED parameter of type IfcColourRgb - may not be null.
	* @param ReflectanceColour DEMANDED parameter of type IfcColourRgb - may not be null.
	**/
	public void setParameters(IfcColourRgb DiffuseTransmissionColour, IfcColourRgb DiffuseReflectionColour, IfcColourRgb TransmissionColour, IfcColourRgb ReflectanceColour)
	{
		this.DiffuseTransmissionColour = DiffuseTransmissionColour;
		this.DiffuseReflectionColour = DiffuseReflectionColour;
		this.TransmissionColour = TransmissionColour;
		this.ReflectanceColour = ReflectanceColour;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.DiffuseTransmissionColour = (IfcColourRgb) parameters.get(0);
		this.DiffuseReflectionColour = (IfcColourRgb) parameters.get(1);
		this.TransmissionColour = (IfcColourRgb) parameters.get(2);
		this.ReflectanceColour = (IfcColourRgb) parameters.get(3);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
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
		return IfcSurfaceStyleLighting.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSURFACESTYLELIGHTING(");
		if(getRedefinedDerivedAttributeTypes().contains("DiffuseTransmissionColour")) stepString = stepString.concat("*,");
		else{
		if(this.DiffuseTransmissionColour != null)		stepString = stepString.concat(((RootInterface)this.DiffuseTransmissionColour).getStepParameter(IfcColourRgb.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DiffuseReflectionColour")) stepString = stepString.concat("*,");
		else{
		if(this.DiffuseReflectionColour != null)		stepString = stepString.concat(((RootInterface)this.DiffuseReflectionColour).getStepParameter(IfcColourRgb.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("TransmissionColour")) stepString = stepString.concat("*,");
		else{
		if(this.TransmissionColour != null)		stepString = stepString.concat(((RootInterface)this.TransmissionColour).getStepParameter(IfcColourRgb.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ReflectanceColour")) stepString = stepString.concat("*);");
		else{
		if(this.ReflectanceColour != null)		stepString = stepString.concat(((RootInterface)this.ReflectanceColour).getStepParameter(IfcColourRgb.class.isInterface())+");");
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
	* This method sets the DiffuseTransmissionColour attribute to the given value.
	*
	* @param DiffuseTransmissionColour OPTIONAL value to set
	**/
	public void setDiffuseTransmissionColour(IfcColourRgb DiffuseTransmissionColour)
	{
		this.DiffuseTransmissionColour = DiffuseTransmissionColour;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DiffuseTransmissionColour attribute.
	*
	* @return the value of DiffuseTransmissionColour
	/**/
	public IfcColourRgb getDiffuseTransmissionColour()
	{
		return this.DiffuseTransmissionColour;
	}

	/**
	* This method sets the DiffuseReflectionColour attribute to the given value.
	*
	* @param DiffuseReflectionColour OPTIONAL value to set
	**/
	public void setDiffuseReflectionColour(IfcColourRgb DiffuseReflectionColour)
	{
		this.DiffuseReflectionColour = DiffuseReflectionColour;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the DiffuseReflectionColour attribute.
	*
	* @return the value of DiffuseReflectionColour
	/**/
	public IfcColourRgb getDiffuseReflectionColour()
	{
		return this.DiffuseReflectionColour;
	}

	/**
	* This method sets the TransmissionColour attribute to the given value.
	*
	* @param TransmissionColour OPTIONAL value to set
	**/
	public void setTransmissionColour(IfcColourRgb TransmissionColour)
	{
		this.TransmissionColour = TransmissionColour;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the TransmissionColour attribute.
	*
	* @return the value of TransmissionColour
	/**/
	public IfcColourRgb getTransmissionColour()
	{
		return this.TransmissionColour;
	}

	/**
	* This method sets the ReflectanceColour attribute to the given value.
	*
	* @param ReflectanceColour OPTIONAL value to set
	**/
	public void setReflectanceColour(IfcColourRgb ReflectanceColour)
	{
		this.ReflectanceColour = ReflectanceColour;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ReflectanceColour attribute.
	*
	* @return the value of ReflectanceColour
	/**/
	public IfcColourRgb getReflectanceColour()
	{
		return this.ReflectanceColour;
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
		IfcSurfaceStyleLighting ifcSurfaceStyleLighting = new IfcSurfaceStyleLighting();
		if(this.DiffuseTransmissionColour != null)
			ifcSurfaceStyleLighting.setDiffuseTransmissionColour((IfcColourRgb)this.DiffuseTransmissionColour.clone());
		if(this.DiffuseReflectionColour != null)
			ifcSurfaceStyleLighting.setDiffuseReflectionColour((IfcColourRgb)this.DiffuseReflectionColour.clone());
		if(this.TransmissionColour != null)
			ifcSurfaceStyleLighting.setTransmissionColour((IfcColourRgb)this.TransmissionColour.clone());
		if(this.ReflectanceColour != null)
			ifcSurfaceStyleLighting.setReflectanceColour((IfcColourRgb)this.ReflectanceColour.clone());
		return ifcSurfaceStyleLighting;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcSurfaceStyleLighting ifcSurfaceStyleLighting = new IfcSurfaceStyleLighting();
		if(this.DiffuseTransmissionColour != null)
			ifcSurfaceStyleLighting.setDiffuseTransmissionColour(this.DiffuseTransmissionColour);
		if(this.DiffuseReflectionColour != null)
			ifcSurfaceStyleLighting.setDiffuseReflectionColour(this.DiffuseReflectionColour);
		if(this.TransmissionColour != null)
			ifcSurfaceStyleLighting.setTransmissionColour(this.TransmissionColour);
		if(this.ReflectanceColour != null)
			ifcSurfaceStyleLighting.setReflectanceColour(this.ReflectanceColour);
		return ifcSurfaceStyleLighting;
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
