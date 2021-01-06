/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRelProjectsElement<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelProjectsElement extends IfcRelConnects implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcElement","IfcFeatureElementAddition"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingElement is an DEMANDED attribute - may not be null**/
	protected IfcElement RelatingElement;
	/** RelatedFeatureElement is an DEMANDED attribute - may not be null**/
	protected IfcFeatureElementAddition RelatedFeatureElement;
	/**
	* The default constructor.
	**/
	public IfcRelProjectsElement(){}

	/**
	* Constructs a new IfcRelProjectsElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedFeatureElement DEMANDED parameter of type IfcFeatureElementAddition - may not be null.
	**/
	public IfcRelProjectsElement(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcElement RelatingElement, IfcFeatureElementAddition RelatedFeatureElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingElement = RelatingElement;
		this.RelatedFeatureElement = RelatedFeatureElement;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelProjectsElement object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param RelatingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedFeatureElement DEMANDED parameter of type IfcFeatureElementAddition - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcElement RelatingElement, IfcFeatureElementAddition RelatedFeatureElement)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.RelatingElement = RelatingElement;
		this.RelatedFeatureElement = RelatedFeatureElement;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.RelatingElement = (IfcElement) parameters.get(4);
		this.RelatedFeatureElement = (IfcFeatureElementAddition) parameters.get(5);
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
		if(RelatingElement != null)
		{
				if(RelatingElement.HasProjections_Inverse == null)
				{
					RelatingElement.HasProjections_Inverse = new SET<IfcRelProjectsElement>();
				}
				RelatingElement.HasProjections_Inverse.add(this);
		}
		if(RelatedFeatureElement != null)
		{
				RelatedFeatureElement.ProjectsElements_Inverse = this;
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelProjectsElement.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELPROJECTSELEMENT(");
		if(getRedefinedDerivedAttributeTypes().contains("GlobalId")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalId != null)		stepString = stepString.concat(((RootInterface)this.GlobalId).getStepParameter(IfcGloballyUniqueId.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("OwnerHistory")) stepString = stepString.concat("*,");
		else{
		if(this.OwnerHistory != null)		stepString = stepString.concat(((RootInterface)this.OwnerHistory).getStepParameter(IfcOwnerHistory.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
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
		if(getRedefinedDerivedAttributeTypes().contains("RelatingElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingElement != null)		stepString = stepString.concat(((RootInterface)this.RelatingElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedFeatureElement")) stepString = stepString.concat("*);");
		else{
		if(this.RelatedFeatureElement != null)		stepString = stepString.concat(((RootInterface)this.RelatedFeatureElement).getStepParameter(IfcFeatureElementAddition.class.isInterface())+");");
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
	* This method sets the RelatingElement attribute to the given value.
	*
	* @param RelatingElement OPTIONAL value to set
	**/
	public void setRelatingElement(IfcElement RelatingElement)
	{
		synchronizeInversesRemoveRelatingElement(this.RelatingElement);
		this.RelatingElement = RelatingElement;
		synchronizeInversesAddRelatingElement(this.RelatingElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingElement attribute.
	*
	* @return the value of RelatingElement
	/**/
	public IfcElement getRelatingElement()
	{
		return this.RelatingElement;
	}

	private void synchronizeInversesAddRelatingElement(IfcElement RelatingElement)
	{
		if(RelatingElement != null)
		{
				if(RelatingElement.HasProjections_Inverse == null)
				{
					RelatingElement.HasProjections_Inverse = new SET<IfcRelProjectsElement>();
				}
				RelatingElement.HasProjections_Inverse.add(this);
		}
	}

	private void synchronizeInversesRemoveRelatingElement(IfcElement RelatingElement)
	{
		if(RelatingElement != null)
		{
				if(RelatingElement.HasProjections_Inverse != null)
				{
					RelatingElement.HasProjections_Inverse.remove(this);
				}
		}
	}

	/**
	* This method sets the RelatedFeatureElement attribute to the given value.
	*
	* @param RelatedFeatureElement OPTIONAL value to set
	**/
	public void setRelatedFeatureElement(IfcFeatureElementAddition RelatedFeatureElement)
	{
		synchronizeInversesRemoveRelatedFeatureElement(this.RelatedFeatureElement);
		this.RelatedFeatureElement = RelatedFeatureElement;
		synchronizeInversesAddRelatedFeatureElement(this.RelatedFeatureElement);
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedFeatureElement attribute.
	*
	* @return the value of RelatedFeatureElement
	/**/
	public IfcFeatureElementAddition getRelatedFeatureElement()
	{
		return this.RelatedFeatureElement;
	}

	private void synchronizeInversesAddRelatedFeatureElement(IfcFeatureElementAddition RelatedFeatureElement)
	{
		if(RelatedFeatureElement != null)
		{
				RelatedFeatureElement.ProjectsElements_Inverse = this;
		}
	}

	private void synchronizeInversesRemoveRelatedFeatureElement(IfcFeatureElementAddition RelatedFeatureElement)
	{
		if(RelatedFeatureElement != null)
		{
				RelatedFeatureElement.ProjectsElements_Inverse = null;
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
	public Object clone()
	{
		IfcRelProjectsElement ifcRelProjectsElement = new IfcRelProjectsElement();
		if(this.GlobalId != null)
			ifcRelProjectsElement.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelProjectsElement.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelProjectsElement.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelProjectsElement.setDescription((IfcText)this.Description.clone());
		if(this.RelatingElement != null)
			ifcRelProjectsElement.setRelatingElement((IfcElement)this.RelatingElement.clone());
		if(this.RelatedFeatureElement != null)
			ifcRelProjectsElement.setRelatedFeatureElement((IfcFeatureElementAddition)this.RelatedFeatureElement.clone());
		return ifcRelProjectsElement;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelProjectsElement ifcRelProjectsElement = new IfcRelProjectsElement();
		if(this.GlobalId != null)
			ifcRelProjectsElement.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelProjectsElement.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelProjectsElement.setName(this.Name);
		if(this.Description != null)
			ifcRelProjectsElement.setDescription(this.Description);
		if(this.RelatingElement != null)
			ifcRelProjectsElement.setRelatingElement(this.RelatingElement);
		if(this.RelatedFeatureElement != null)
			ifcRelProjectsElement.setRelatedFeatureElement(this.RelatedFeatureElement);
		return ifcRelProjectsElement;
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
