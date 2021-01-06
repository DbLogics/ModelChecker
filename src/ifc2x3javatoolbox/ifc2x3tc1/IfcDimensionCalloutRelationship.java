/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcDimensionCalloutRelationship<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDimensionCalloutRelationship extends IfcDraughtingCalloutRelationship implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcLabel","IfcText","IfcDraughtingCallout","IfcDraughtingCallout"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/**
	* The default constructor.
	**/
	public IfcDimensionCalloutRelationship(){}

	/**
	* Constructs a new IfcDimensionCalloutRelationship object using the given parameters.
	*
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingDraughtingCallout DEMANDED parameter of type IfcDraughtingCallout - may not be null.
	* @param RelatedDraughtingCallout DEMANDED parameter of type IfcDraughtingCallout - may not be null.
	**/
	public IfcDimensionCalloutRelationship(IfcLabel Name, IfcText Description, IfcDraughtingCallout RelatingDraughtingCallout, IfcDraughtingCallout RelatedDraughtingCallout)
	{
		this.Name = Name;
		this.Description = Description;
		this.RelatingDraughtingCallout = RelatingDraughtingCallout;
		this.RelatedDraughtingCallout = RelatedDraughtingCallout;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Name = (IfcLabel) parameters.get(0);
		this.Description = (IfcText) parameters.get(1);
		this.RelatingDraughtingCallout = (IfcDraughtingCallout) parameters.get(2);
		this.RelatedDraughtingCallout = (IfcDraughtingCallout) parameters.get(3);
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
		if(RelatingDraughtingCallout != null)
		{
				if(RelatingDraughtingCallout.IsRelatedToCallout_Inverse == null)
				{
					RelatingDraughtingCallout.IsRelatedToCallout_Inverse = new SET<IfcDraughtingCalloutRelationship>();
				}
				RelatingDraughtingCallout.IsRelatedToCallout_Inverse.add(this);
		}
		if(RelatedDraughtingCallout != null)
		{
				if(RelatedDraughtingCallout.IsRelatedFromCallout_Inverse == null)
				{
					RelatedDraughtingCallout.IsRelatedFromCallout_Inverse = new SET<IfcDraughtingCalloutRelationship>();
				}
				RelatedDraughtingCallout.IsRelatedFromCallout_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcDimensionCalloutRelationship.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDIMENSIONCALLOUTRELATIONSHIP(");
		if(getRedefinedDerivedAttributeTypes().contains("Name")) stepString = stepString.concat("*,");
		else{
		if(this.Name != null)		stepString = stepString.concat(((RootInterface)this.Name).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Description")) stepString = stepString.concat("*,");
		else{
		if(this.Description != null)		stepString = stepString.concat(((RootInterface)this.Description).getStepParameter(IfcText.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingDraughtingCallout")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingDraughtingCallout != null)		stepString = stepString.concat(((RootInterface)this.RelatingDraughtingCallout).getStepParameter(IfcDraughtingCallout.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedDraughtingCallout")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedDraughtingCallout != null)		stepString = stepString.concat(((RootInterface)this.RelatedDraughtingCallout).getStepParameter(IfcDraughtingCallout.class.isInterface())+");");
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
		IfcDimensionCalloutRelationship ifcDimensionCalloutRelationship = new IfcDimensionCalloutRelationship();
		if(this.Name != null)
			ifcDimensionCalloutRelationship.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcDimensionCalloutRelationship.setDescription((IfcText)this.Description.clone());
		if(this.RelatingDraughtingCallout != null)
			ifcDimensionCalloutRelationship.setRelatingDraughtingCallout((IfcDraughtingCallout)this.RelatingDraughtingCallout.clone());
		if(this.RelatedDraughtingCallout != null)
			ifcDimensionCalloutRelationship.setRelatedDraughtingCallout((IfcDraughtingCallout)this.RelatedDraughtingCallout.clone());
		return ifcDimensionCalloutRelationship;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDimensionCalloutRelationship ifcDimensionCalloutRelationship = new IfcDimensionCalloutRelationship();
		if(this.Name != null)
			ifcDimensionCalloutRelationship.setName(this.Name);
		if(this.Description != null)
			ifcDimensionCalloutRelationship.setDescription(this.Description);
		if(this.RelatingDraughtingCallout != null)
			ifcDimensionCalloutRelationship.setRelatingDraughtingCallout(this.RelatingDraughtingCallout);
		if(this.RelatedDraughtingCallout != null)
			ifcDimensionCalloutRelationship.setRelatedDraughtingCallout(this.RelatedDraughtingCallout);
		return ifcDimensionCalloutRelationship;
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
