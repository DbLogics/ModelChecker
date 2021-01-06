/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcRelConnectsPathElements<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcRelConnectsPathElements extends IfcRelConnectsElements implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcConnectionGeometry","IfcElement","IfcElement","LIST<INTEGER>","LIST<INTEGER>","IfcConnectionTypeEnum","IfcConnectionTypeEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RelatingPriorities is an DEMANDED attribute - may not be null**/
	protected LIST<INTEGER> RelatingPriorities;
	/** RelatedPriorities is an DEMANDED attribute - may not be null**/
	protected LIST<INTEGER> RelatedPriorities;
	/** RelatedConnectionType is an DEMANDED attribute - may not be null**/
	protected IfcConnectionTypeEnum RelatedConnectionType;
	/** RelatingConnectionType is an DEMANDED attribute - may not be null**/
	protected IfcConnectionTypeEnum RelatingConnectionType;
	/**
	* The default constructor.
	**/
	public IfcRelConnectsPathElements(){}

	/**
	* Constructs a new IfcRelConnectsPathElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConnectionGeometry OPTIONAL parameter of type IfcConnectionGeometry
	* @param RelatingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatingPriorities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param RelatedPriorities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param RelatedConnectionType DEMANDED parameter of type IfcConnectionTypeEnum - may not be null.
	* @param RelatingConnectionType DEMANDED parameter of type IfcConnectionTypeEnum - may not be null.
	**/
	public IfcRelConnectsPathElements(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcConnectionGeometry ConnectionGeometry, IfcElement RelatingElement, IfcElement RelatedElement, LIST<INTEGER> RelatingPriorities, LIST<INTEGER> RelatedPriorities, IfcConnectionTypeEnum RelatedConnectionType, IfcConnectionTypeEnum RelatingConnectionType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ConnectionGeometry = ConnectionGeometry;
		this.RelatingElement = RelatingElement;
		this.RelatedElement = RelatedElement;
		this.RelatingPriorities = RelatingPriorities;
		this.RelatedPriorities = RelatedPriorities;
		this.RelatedConnectionType = RelatedConnectionType;
		this.RelatingConnectionType = RelatingConnectionType;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcRelConnectsPathElements object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ConnectionGeometry OPTIONAL parameter of type IfcConnectionGeometry
	* @param RelatingElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatedElement DEMANDED parameter of type IfcElement - may not be null.
	* @param RelatingPriorities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param RelatedPriorities DEMANDED parameter of type LIST<INTEGER> - may not be null.
	* @param RelatedConnectionType DEMANDED parameter of type IfcConnectionTypeEnum - may not be null.
	* @param RelatingConnectionType DEMANDED parameter of type IfcConnectionTypeEnum - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcConnectionGeometry ConnectionGeometry, IfcElement RelatingElement, IfcElement RelatedElement, LIST<INTEGER> RelatingPriorities, LIST<INTEGER> RelatedPriorities, IfcConnectionTypeEnum RelatedConnectionType, IfcConnectionTypeEnum RelatingConnectionType)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ConnectionGeometry = ConnectionGeometry;
		this.RelatingElement = RelatingElement;
		this.RelatedElement = RelatedElement;
		this.RelatingPriorities = RelatingPriorities;
		this.RelatedPriorities = RelatedPriorities;
		this.RelatedConnectionType = RelatedConnectionType;
		this.RelatingConnectionType = RelatingConnectionType;
		resolveInverses();
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	@SuppressWarnings("unchecked")
	void initialize(java.util.ArrayList<CloneableObject> parameters)
	{
		this.GlobalId = (IfcGloballyUniqueId) parameters.get(0);
		this.OwnerHistory = (IfcOwnerHistory) parameters.get(1);
		this.Name = (IfcLabel) parameters.get(2);
		this.Description = (IfcText) parameters.get(3);
		this.ConnectionGeometry = (IfcConnectionGeometry) parameters.get(4);
		this.RelatingElement = (IfcElement) parameters.get(5);
		this.RelatedElement = (IfcElement) parameters.get(6);
		this.RelatingPriorities = (LIST<INTEGER>) parameters.get(7);
		this.RelatedPriorities = (LIST<INTEGER>) parameters.get(8);
		this.RelatedConnectionType = (IfcConnectionTypeEnum) parameters.get(9);
		this.RelatingConnectionType = (IfcConnectionTypeEnum) parameters.get(10);
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
				if(RelatingElement.ConnectedTo_Inverse == null)
				{
					RelatingElement.ConnectedTo_Inverse = new SET<IfcRelConnectsElements>();
				}
				RelatingElement.ConnectedTo_Inverse.add(this);
		}
		if(RelatedElement != null)
		{
				if(RelatedElement.ConnectedFrom_Inverse == null)
				{
					RelatedElement.ConnectedFrom_Inverse = new SET<IfcRelConnectsElements>();
				}
				RelatedElement.ConnectedFrom_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcRelConnectsPathElements.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCRELCONNECTSPATHELEMENTS(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ConnectionGeometry")) stepString = stepString.concat("*,");
		else{
		if(this.ConnectionGeometry != null)		stepString = stepString.concat(((RootInterface)this.ConnectionGeometry).getStepParameter(IfcConnectionGeometry.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingElement != null)		stepString = stepString.concat(((RootInterface)this.RelatingElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedElement")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedElement != null)		stepString = stepString.concat(((RootInterface)this.RelatedElement).getStepParameter(IfcElement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingPriorities")) stepString = stepString.concat("*,");
		else{
		if(this.RelatingPriorities != null)		stepString = stepString.concat(((RootInterface)this.RelatingPriorities).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedPriorities")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedPriorities != null)		stepString = stepString.concat(((RootInterface)this.RelatedPriorities).getStepParameter(INTEGER.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatedConnectionType")) stepString = stepString.concat("*,");
		else{
		if(this.RelatedConnectionType != null)		stepString = stepString.concat(((RootInterface)this.RelatedConnectionType).getStepParameter(IfcConnectionTypeEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RelatingConnectionType")) stepString = stepString.concat("*);");
		else{
		if(this.RelatingConnectionType != null)		stepString = stepString.concat(((RootInterface)this.RelatingConnectionType).getStepParameter(IfcConnectionTypeEnum.class.isInterface())+");");
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
	* This method sets the RelatingPriorities attribute to the given value.
	*
	* @param RelatingPriorities OPTIONAL value to set
	**/
	public void setRelatingPriorities(LIST<INTEGER> RelatingPriorities)
	{
		this.RelatingPriorities = RelatingPriorities;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the RelatingPriorities attribute.
	*
	* @return a copy of the RelatingPriorities list
	**/
	public LIST<INTEGER> getRelatingPriorities()
	{
		if(this.RelatingPriorities != null)
			return new LIST<INTEGER>(this.RelatingPriorities);
		return null;
	}

	/**
	* This method adds an INTEGER object to the RelatingPriorities list.
	* @param RelatingPriorities element to be appended to this list.
	**/
	public void addRelatingPriorities(INTEGER RelatingPriorities)
	{
		if(this.RelatingPriorities == null)
			this.RelatingPriorities = new LIST<INTEGER>();
		this.RelatingPriorities.add(RelatingPriorities);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of INTEGER objects to the RelatingPriorities list.
	* @param RelatingPriorities collection containing elements to be added to this list.
	**/
	public void addAllRelatingPriorities(java.util.Collection<INTEGER> RelatingPriorities)
	{
		if(this.RelatingPriorities == null)
			this.RelatingPriorities = new LIST<INTEGER>();
		this.RelatingPriorities.addAll(RelatingPriorities);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatingPriorities list.
	**/
	public void clearRelatingPriorities()
	{
		if(this.RelatingPriorities != null)
		{
			this.RelatingPriorities.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an INTEGER object from the RelatingPriorities list.
	* @param RelatingPriorities element to be removed from this list.
	**/
	public void removeRelatingPriorities(INTEGER RelatingPriorities)
	{
		if(this.RelatingPriorities != null)
		{
			this.RelatingPriorities.remove(RelatingPriorities);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of INTEGER objects from the RelatingPriorities list.
	* @param RelatingPriorities collection containing elements to be removed from this list.
	**/
	public void removeAllRelatingPriorities(java.util.Collection<INTEGER> RelatingPriorities)
	{
		if(this.RelatingPriorities != null)
		{
			this.RelatingPriorities.removeAll(RelatingPriorities);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the RelatedPriorities attribute to the given value.
	*
	* @param RelatedPriorities OPTIONAL value to set
	**/
	public void setRelatedPriorities(LIST<INTEGER> RelatedPriorities)
	{
		this.RelatedPriorities = RelatedPriorities;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the RelatedPriorities attribute.
	*
	* @return a copy of the RelatedPriorities list
	**/
	public LIST<INTEGER> getRelatedPriorities()
	{
		if(this.RelatedPriorities != null)
			return new LIST<INTEGER>(this.RelatedPriorities);
		return null;
	}

	/**
	* This method adds an INTEGER object to the RelatedPriorities list.
	* @param RelatedPriorities element to be appended to this list.
	**/
	public void addRelatedPriorities(INTEGER RelatedPriorities)
	{
		if(this.RelatedPriorities == null)
			this.RelatedPriorities = new LIST<INTEGER>();
		this.RelatedPriorities.add(RelatedPriorities);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of INTEGER objects to the RelatedPriorities list.
	* @param RelatedPriorities collection containing elements to be added to this list.
	**/
	public void addAllRelatedPriorities(java.util.Collection<INTEGER> RelatedPriorities)
	{
		if(this.RelatedPriorities == null)
			this.RelatedPriorities = new LIST<INTEGER>();
		this.RelatedPriorities.addAll(RelatedPriorities);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RelatedPriorities list.
	**/
	public void clearRelatedPriorities()
	{
		if(this.RelatedPriorities != null)
		{
			this.RelatedPriorities.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an INTEGER object from the RelatedPriorities list.
	* @param RelatedPriorities element to be removed from this list.
	**/
	public void removeRelatedPriorities(INTEGER RelatedPriorities)
	{
		if(this.RelatedPriorities != null)
		{
			this.RelatedPriorities.remove(RelatedPriorities);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of INTEGER objects from the RelatedPriorities list.
	* @param RelatedPriorities collection containing elements to be removed from this list.
	**/
	public void removeAllRelatedPriorities(java.util.Collection<INTEGER> RelatedPriorities)
	{
		if(this.RelatedPriorities != null)
		{
			this.RelatedPriorities.removeAll(RelatedPriorities);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the RelatedConnectionType attribute to the given value.
	*
	* @param RelatedConnectionType OPTIONAL value to set
	**/
	public void setRelatedConnectionType(IfcConnectionTypeEnum RelatedConnectionType)
	{
		this.RelatedConnectionType = RelatedConnectionType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatedConnectionType attribute.
	*
	* @return the value of RelatedConnectionType
	/**/
	public IfcConnectionTypeEnum getRelatedConnectionType()
	{
		return this.RelatedConnectionType;
	}

	/**
	* This method sets the RelatingConnectionType attribute to the given value.
	*
	* @param RelatingConnectionType OPTIONAL value to set
	**/
	public void setRelatingConnectionType(IfcConnectionTypeEnum RelatingConnectionType)
	{
		this.RelatingConnectionType = RelatingConnectionType;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the RelatingConnectionType attribute.
	*
	* @return the value of RelatingConnectionType
	/**/
	public IfcConnectionTypeEnum getRelatingConnectionType()
	{
		return this.RelatingConnectionType;
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
		IfcRelConnectsPathElements ifcRelConnectsPathElements = new IfcRelConnectsPathElements();
		if(this.GlobalId != null)
			ifcRelConnectsPathElements.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcRelConnectsPathElements.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcRelConnectsPathElements.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcRelConnectsPathElements.setDescription((IfcText)this.Description.clone());
		if(this.ConnectionGeometry != null)
			ifcRelConnectsPathElements.setConnectionGeometry((IfcConnectionGeometry)this.ConnectionGeometry.clone());
		if(this.RelatingElement != null)
			ifcRelConnectsPathElements.setRelatingElement((IfcElement)this.RelatingElement.clone());
		if(this.RelatedElement != null)
			ifcRelConnectsPathElements.setRelatedElement((IfcElement)this.RelatedElement.clone());
		if(this.RelatingPriorities != null)
			ifcRelConnectsPathElements.setRelatingPriorities((LIST<INTEGER>)this.RelatingPriorities.clone());
		if(this.RelatedPriorities != null)
			ifcRelConnectsPathElements.setRelatedPriorities((LIST<INTEGER>)this.RelatedPriorities.clone());
		if(this.RelatedConnectionType != null)
			ifcRelConnectsPathElements.setRelatedConnectionType((IfcConnectionTypeEnum)this.RelatedConnectionType.clone());
		if(this.RelatingConnectionType != null)
			ifcRelConnectsPathElements.setRelatingConnectionType((IfcConnectionTypeEnum)this.RelatingConnectionType.clone());
		return ifcRelConnectsPathElements;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcRelConnectsPathElements ifcRelConnectsPathElements = new IfcRelConnectsPathElements();
		if(this.GlobalId != null)
			ifcRelConnectsPathElements.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcRelConnectsPathElements.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcRelConnectsPathElements.setName(this.Name);
		if(this.Description != null)
			ifcRelConnectsPathElements.setDescription(this.Description);
		if(this.ConnectionGeometry != null)
			ifcRelConnectsPathElements.setConnectionGeometry(this.ConnectionGeometry);
		if(this.RelatingElement != null)
			ifcRelConnectsPathElements.setRelatingElement(this.RelatingElement);
		if(this.RelatedElement != null)
			ifcRelConnectsPathElements.setRelatedElement(this.RelatedElement);
		if(this.RelatingPriorities != null)
			ifcRelConnectsPathElements.setRelatingPriorities(this.RelatingPriorities);
		if(this.RelatedPriorities != null)
			ifcRelConnectsPathElements.setRelatedPriorities(this.RelatedPriorities);
		if(this.RelatedConnectionType != null)
			ifcRelConnectsPathElements.setRelatedConnectionType(this.RelatedConnectionType);
		if(this.RelatingConnectionType != null)
			ifcRelConnectsPathElements.setRelatingConnectionType(this.RelatingConnectionType);
		return ifcRelConnectsPathElements;
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
