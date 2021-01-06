/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcTypeProduct<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcTypeProduct extends IfcTypeObject implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","SET<IfcPropertySetDefinition>","LIST<IfcRepresentationMap>","IfcLabel"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** RepresentationMaps is an OPTIONAL attribute**/
	protected LIST<IfcRepresentationMap> RepresentationMaps;
	/** Tag is an OPTIONAL attribute**/
	protected IfcLabel Tag;
	/**
	* The default constructor.
	**/
	public IfcTypeProduct(){}

	/**
	* Constructs a new IfcTypeProduct object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableOccurrence OPTIONAL parameter of type IfcLabel
	* @param HasPropertySets OPTIONAL parameter of type SET<IfcPropertySetDefinition>
	* @param RepresentationMaps OPTIONAL parameter of type LIST<IfcRepresentationMap>
	* @param Tag OPTIONAL parameter of type IfcLabel
	**/
	public IfcTypeProduct(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, LIST<IfcRepresentationMap> RepresentationMaps, IfcLabel Tag)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableOccurrence = ApplicableOccurrence;
		this.HasPropertySets = HasPropertySets;
		this.RepresentationMaps = RepresentationMaps;
		this.Tag = Tag;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcTypeProduct object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ApplicableOccurrence OPTIONAL parameter of type IfcLabel
	* @param HasPropertySets OPTIONAL parameter of type SET<IfcPropertySetDefinition>
	* @param RepresentationMaps OPTIONAL parameter of type LIST<IfcRepresentationMap>
	* @param Tag OPTIONAL parameter of type IfcLabel
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ApplicableOccurrence, SET<IfcPropertySetDefinition> HasPropertySets, LIST<IfcRepresentationMap> RepresentationMaps, IfcLabel Tag)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ApplicableOccurrence = ApplicableOccurrence;
		this.HasPropertySets = HasPropertySets;
		this.RepresentationMaps = RepresentationMaps;
		this.Tag = Tag;
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
		this.ApplicableOccurrence = (IfcLabel) parameters.get(4);
		this.HasPropertySets = (SET<IfcPropertySetDefinition>) parameters.get(5);
		this.RepresentationMaps = (LIST<IfcRepresentationMap>) parameters.get(6);
		this.Tag = (IfcLabel) parameters.get(7);
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
		if(HasPropertySets != null)
		{
			for(IfcPropertySetDefinition HasPropertySets$ : HasPropertySets)
			{
				if(HasPropertySets$.DefinesType_Inverse == null)
				{
					HasPropertySets$.DefinesType_Inverse = new SET<IfcTypeObject>();
				}
				HasPropertySets$.DefinesType_Inverse.add(this);
			}
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcTypeProduct.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCTYPEPRODUCT(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ApplicableOccurrence")) stepString = stepString.concat("*,");
		else{
		if(this.ApplicableOccurrence != null)		stepString = stepString.concat(((RootInterface)this.ApplicableOccurrence).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("HasPropertySets")) stepString = stepString.concat("*,");
		else{
		if(this.HasPropertySets != null)		stepString = stepString.concat(((RootInterface)this.HasPropertySets).getStepParameter(IfcPropertySetDefinition.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("RepresentationMaps")) stepString = stepString.concat("*,");
		else{
		if(this.RepresentationMaps != null)		stepString = stepString.concat(((RootInterface)this.RepresentationMaps).getStepParameter(IfcRepresentationMap.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Tag")) stepString = stepString.concat("*);");
		else{
		if(this.Tag != null)		stepString = stepString.concat(((RootInterface)this.Tag).getStepParameter(IfcLabel.class.isInterface())+");");
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
	* This method sets the RepresentationMaps attribute to the given value.
	*
	* @param RepresentationMaps DEMANDED value to set - may not be null
	**/
	public void setRepresentationMaps(LIST<IfcRepresentationMap> RepresentationMaps)
	{
		this.RepresentationMaps = RepresentationMaps;
		fireChangeEvent();
	}

	/**
	* This method returns a copy of the list of the RepresentationMaps attribute.
	*
	* @return a copy of the RepresentationMaps list
	**/
	public LIST<IfcRepresentationMap> getRepresentationMaps()
	{
		if(this.RepresentationMaps != null)
			return new LIST<IfcRepresentationMap>(this.RepresentationMaps);
		return null;
	}

	/**
	* This method adds an IfcRepresentationMap object to the RepresentationMaps list.
	* @param RepresentationMaps element to be appended to this list.
	**/
	public void addRepresentationMaps(IfcRepresentationMap RepresentationMaps)
	{
		if(this.RepresentationMaps == null)
			this.RepresentationMaps = new LIST<IfcRepresentationMap>();
		this.RepresentationMaps.add(RepresentationMaps);
		fireChangeEvent();
	}

	/**
	* This method adds a collection of IfcRepresentationMap objects to the RepresentationMaps list.
	* @param RepresentationMaps collection containing elements to be added to this list.
	**/
	public void addAllRepresentationMaps(java.util.Collection<IfcRepresentationMap> RepresentationMaps)
	{
		if(this.RepresentationMaps == null)
			this.RepresentationMaps = new LIST<IfcRepresentationMap>();
		this.RepresentationMaps.addAll(RepresentationMaps);
		fireChangeEvent();
	}

	/**
	* This method removes all elements from the RepresentationMaps list.
	**/
	public void clearRepresentationMaps()
	{
		if(this.RepresentationMaps != null)
		{
			this.RepresentationMaps.clear();
			fireChangeEvent();
		}
	}

	/**
	* This method removes an IfcRepresentationMap object from the RepresentationMaps list.
	* @param RepresentationMaps element to be removed from this list.
	**/
	public void removeRepresentationMaps(IfcRepresentationMap RepresentationMaps)
	{
		if(this.RepresentationMaps != null)
		{
			this.RepresentationMaps.remove(RepresentationMaps);
			fireChangeEvent();
		}
	}

	/**
	* This method removes a collection of IfcRepresentationMap objects from the RepresentationMaps list.
	* @param RepresentationMaps collection containing elements to be removed from this list.
	**/
	public void removeAllRepresentationMaps(java.util.Collection<IfcRepresentationMap> RepresentationMaps)
	{
		if(this.RepresentationMaps != null)
		{
			this.RepresentationMaps.removeAll(RepresentationMaps);
			fireChangeEvent();
		}
	}

	/**
	* This method sets the Tag attribute to the given value.
	*
	* @param Tag DEMANDED value to set - may not be null
	**/
	public void setTag(IfcLabel Tag)
	{
		this.Tag = Tag;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the Tag attribute.
	*
	* @return the value of Tag
	/**/
	public IfcLabel getTag()
	{
		return this.Tag;
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
		IfcTypeProduct ifcTypeProduct = new IfcTypeProduct();
		if(this.GlobalId != null)
			ifcTypeProduct.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcTypeProduct.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcTypeProduct.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcTypeProduct.setDescription((IfcText)this.Description.clone());
		if(this.ApplicableOccurrence != null)
			ifcTypeProduct.setApplicableOccurrence((IfcLabel)this.ApplicableOccurrence.clone());
		if(this.HasPropertySets != null)
			ifcTypeProduct.setHasPropertySets((SET<IfcPropertySetDefinition>)this.HasPropertySets.clone());
		if(this.RepresentationMaps != null)
			ifcTypeProduct.setRepresentationMaps((LIST<IfcRepresentationMap>)this.RepresentationMaps.clone());
		if(this.Tag != null)
			ifcTypeProduct.setTag((IfcLabel)this.Tag.clone());
		return ifcTypeProduct;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcTypeProduct ifcTypeProduct = new IfcTypeProduct();
		if(this.GlobalId != null)
			ifcTypeProduct.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcTypeProduct.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcTypeProduct.setName(this.Name);
		if(this.Description != null)
			ifcTypeProduct.setDescription(this.Description);
		if(this.ApplicableOccurrence != null)
			ifcTypeProduct.setApplicableOccurrence(this.ApplicableOccurrence);
		if(this.HasPropertySets != null)
			ifcTypeProduct.setHasPropertySets(this.HasPropertySets);
		if(this.RepresentationMaps != null)
			ifcTypeProduct.setRepresentationMaps(this.RepresentationMaps);
		if(this.Tag != null)
			ifcTypeProduct.setTag(this.Tag);
		return ifcTypeProduct;
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
