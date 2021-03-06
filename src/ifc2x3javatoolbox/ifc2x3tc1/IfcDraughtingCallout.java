/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcDraughtingCallout<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcDraughtingCallout extends IfcGeometricRepresentationItem implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"SET<IfcDraughtingCalloutElement>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** Contents is an DEMANDED attribute - may not be null**/
	protected SET<IfcDraughtingCalloutElement> Contents;
	protected SET<IfcDraughtingCalloutRelationship> IsRelatedFromCallout_Inverse;
	protected SET<IfcDraughtingCalloutRelationship> IsRelatedToCallout_Inverse;
	/**
	* The default constructor.
	**/
	public IfcDraughtingCallout(){}

	/**
	* Constructs a new IfcDraughtingCallout object using the given parameters.
	*
	* @param Contents DEMANDED parameter of type SET<IfcDraughtingCalloutElement> - may not be null.
	**/
	public IfcDraughtingCallout(SET<IfcDraughtingCalloutElement> Contents)
	{
		this.Contents = Contents;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcDraughtingCallout object using the given parameters.
	*
	* @param Contents DEMANDED parameter of type SET<IfcDraughtingCalloutElement> - may not be null.
	**/
	public void setParameters(SET<IfcDraughtingCalloutElement> Contents)
	{
		this.Contents = Contents;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.Contents = (SET<IfcDraughtingCalloutElement>) parameters.get(0);
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void destruct()
	{
		 super.destruct();
		listenerList = null;
		IsRelatedFromCallout_Inverse = null;
		IsRelatedToCallout_Inverse = null;
	}

	private void resolveInverses()
	{
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcDraughtingCallout.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCDRAUGHTINGCALLOUT(");
		if(getRedefinedDerivedAttributeTypes().contains("Contents")) stepString = stepString.concat("*);");
		else{
		if(this.Contents != null)		stepString = stepString.concat(((RootInterface)this.Contents).getStepParameter(IfcDraughtingCalloutElement.class.isInterface())+");");
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
	* This method returns a copy of the set of the IsRelatedFromCallout_Inverse attribute.
	*
	* @return a copy of the IsRelatedFromCallout_Inverse set
	**/
	public SET<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout_Inverse()
	{
		if(this.IsRelatedFromCallout_Inverse != null)
			return new SET<IfcDraughtingCalloutRelationship>(this.IsRelatedFromCallout_Inverse);
		return null;
	}

	/**
	* This method returns a copy of the set of the IsRelatedToCallout_Inverse attribute.
	*
	* @return a copy of the IsRelatedToCallout_Inverse set
	**/
	public SET<IfcDraughtingCalloutRelationship> getIsRelatedToCallout_Inverse()
	{
		if(this.IsRelatedToCallout_Inverse != null)
			return new SET<IfcDraughtingCalloutRelationship>(this.IsRelatedToCallout_Inverse);
		return null;
	}

	/**
	* This method sets the Contents attribute to the given value.
	*
	* @param Contents OPTIONAL value to set
	**/
	public void setContents(SET<IfcDraughtingCalloutElement> Contents)
	{
		this.Contents = Contents;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the Contents attribute.
	*
	* @return a copy of the Contents set
	**/
	public SET<IfcDraughtingCalloutElement> getContents()
	{
		if(this.Contents != null)
			return new SET<IfcDraughtingCalloutElement>(this.Contents);
		return null;
	}

	/**
	* This method adds an IfcDraughtingCalloutElement object to the Contents set.
	* @param Contents element to be appended to this set.
	**/
	public void addContents(IfcDraughtingCalloutElement Contents)
	{
		if(this.Contents == null)
			this.Contents = new SET<IfcDraughtingCalloutElement>();
		this.Contents.add(Contents);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcDraughtingCalloutElement objects to the Contents set.
	* @param Contents collection containing elements to be added to this set.
	**/
	public void addAllContents(java.util.Collection<IfcDraughtingCalloutElement> Contents)
	{
		if(this.Contents == null)
			this.Contents = new SET<IfcDraughtingCalloutElement>();
		this.Contents.addAll(Contents);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the Contents set.
	**/
	public void clearContents()
	{
		if(this.Contents != null)
		{
			this.Contents.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcDraughtingCalloutElement object from the Contents set.
	* @param Contents element to be removed from this set.
	**/
	public void removeContents(IfcDraughtingCalloutElement Contents)
	{
		if(this.Contents != null)
		{
			this.Contents.remove(Contents);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcDraughtingCalloutElement objects from the Contents set.
	* @param Contents collection containing elements to be removed from this set.
	**/
	public void removeAllContents(java.util.Collection<IfcDraughtingCalloutElement> Contents)
	{
		if(this.Contents != null)
		{
			this.Contents.removeAll(Contents);
			fireChangeEvent();
		}
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
	@SuppressWarnings("unchecked")
	public Object clone()
	{
		IfcDraughtingCallout ifcDraughtingCallout = new IfcDraughtingCallout();
		if(this.Contents != null)
			ifcDraughtingCallout.setContents((SET<IfcDraughtingCalloutElement>)this.Contents.clone());
		return ifcDraughtingCallout;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcDraughtingCallout ifcDraughtingCallout = new IfcDraughtingCallout();
		if(this.Contents != null)
			ifcDraughtingCallout.setContents(this.Contents);
		return ifcDraughtingCallout;
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
