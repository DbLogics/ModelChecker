/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcClassificationNotation<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcClassificationNotation extends InternalAccessClass implements ClassInterface, IfcClassificationNotationSelect
{
	private static final String[] nonInverseAttributes = new String[]{"SET<IfcClassificationNotationFacet>"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** NotationFacets is an DEMANDED attribute - may not be null**/
	protected SET<IfcClassificationNotationFacet> NotationFacets;
	/**
	* The default constructor.
	**/
	public IfcClassificationNotation(){}

	/**
	* Constructs a new IfcClassificationNotation object using the given parameters.
	*
	* @param NotationFacets DEMANDED parameter of type SET<IfcClassificationNotationFacet> - may not be null.
	**/
	public IfcClassificationNotation(SET<IfcClassificationNotationFacet> NotationFacets)
	{
		this.NotationFacets = NotationFacets;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcClassificationNotation object using the given parameters.
	*
	* @param NotationFacets DEMANDED parameter of type SET<IfcClassificationNotationFacet> - may not be null.
	**/
	public void setParameters(SET<IfcClassificationNotationFacet> NotationFacets)
	{
		this.NotationFacets = NotationFacets;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.NotationFacets = (SET<IfcClassificationNotationFacet>) parameters.get(0);
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
		return IfcClassificationNotation.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCCLASSIFICATIONNOTATION(");
		if(getRedefinedDerivedAttributeTypes().contains("NotationFacets")) stepString = stepString.concat("*);");
		else{
		if(this.NotationFacets != null)		stepString = stepString.concat(((RootInterface)this.NotationFacets).getStepParameter(IfcClassificationNotationFacet.class.isInterface())+");");
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
	* This method sets the NotationFacets attribute to the given value.
	*
	* @param NotationFacets OPTIONAL value to set
	**/
	public void setNotationFacets(SET<IfcClassificationNotationFacet> NotationFacets)
	{
		this.NotationFacets = NotationFacets;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the set of the NotationFacets attribute.
	*
	* @return a copy of the NotationFacets set
	**/
	public SET<IfcClassificationNotationFacet> getNotationFacets()
	{
		if(this.NotationFacets != null)
			return new SET<IfcClassificationNotationFacet>(this.NotationFacets);
		return null;
	}

	/**
	* This method adds an IfcClassificationNotationFacet object to the NotationFacets set.
	* @param NotationFacets element to be appended to this set.
	**/
	public void addNotationFacets(IfcClassificationNotationFacet NotationFacets)
	{
		if(this.NotationFacets == null)
			this.NotationFacets = new SET<IfcClassificationNotationFacet>();
		this.NotationFacets.add(NotationFacets);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcClassificationNotationFacet objects to the NotationFacets set.
	* @param NotationFacets collection containing elements to be added to this set.
	**/
	public void addAllNotationFacets(java.util.Collection<IfcClassificationNotationFacet> NotationFacets)
	{
		if(this.NotationFacets == null)
			this.NotationFacets = new SET<IfcClassificationNotationFacet>();
		this.NotationFacets.addAll(NotationFacets);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the NotationFacets set.
	**/
	public void clearNotationFacets()
	{
		if(this.NotationFacets != null)
		{
			this.NotationFacets.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcClassificationNotationFacet object from the NotationFacets set.
	* @param NotationFacets element to be removed from this set.
	**/
	public void removeNotationFacets(IfcClassificationNotationFacet NotationFacets)
	{
		if(this.NotationFacets != null)
		{
			this.NotationFacets.remove(NotationFacets);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcClassificationNotationFacet objects from the NotationFacets set.
	* @param NotationFacets collection containing elements to be removed from this set.
	**/
	public void removeAllNotationFacets(java.util.Collection<IfcClassificationNotationFacet> NotationFacets)
	{
		if(this.NotationFacets != null)
		{
			this.NotationFacets.removeAll(NotationFacets);
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
		IfcClassificationNotation ifcClassificationNotation = new IfcClassificationNotation();
		if(this.NotationFacets != null)
			ifcClassificationNotation.setNotationFacets((SET<IfcClassificationNotationFacet>)this.NotationFacets.clone());
		return ifcClassificationNotation;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcClassificationNotation ifcClassificationNotation = new IfcClassificationNotation();
		if(this.NotationFacets != null)
			ifcClassificationNotation.setNotationFacets(this.NotationFacets);
		return ifcClassificationNotation;
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