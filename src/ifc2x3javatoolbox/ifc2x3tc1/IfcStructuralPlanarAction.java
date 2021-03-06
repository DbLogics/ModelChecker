/* Generated By: IFC Tools Project EXPRESS TO JAVA COMPILER: Do not edit this file!! */
package ifc2x3javatoolbox.ifc2x3tc1;
/**
 * This is a default implementation of the entity IfcStructuralPlanarAction<br><br>
 *<br><br>
 * Copyright: CC BY-NC-SA 3.0 DE (cc) 2013 Eike Tauscher and Michael Theiler<br><br>
 * The whole package including this class is licensed under<br>
 * <a rel='license' href='http://creativecommons.org/licenses/by-nc-sa/3.0/de/deed.en/'>
 * Creative Commons Attribution-Non-Commercial-Share Alike 3.0 Germany</a>.<br><br>
 * If you are using the package or parts of it in any commercial way, a commercial license is required. 
 * Visit <a href='http://www.ifctoolsproject.com'>http://www.ifctoolsproject.com</a> for more information
 * or contact us directly: <a href='mailto:info@ifctoolsproject.com'>info@ifctoolsproject.com</a><br>
 */
public class IfcStructuralPlanarAction extends IfcStructuralAction implements ClassInterface
{
	private static final String[] nonInverseAttributes = new String[]{"IfcGloballyUniqueId","IfcOwnerHistory","IfcLabel","IfcText","IfcLabel","IfcObjectPlacement","IfcProductRepresentation","IfcStructuralLoad","IfcGlobalOrLocalEnum","BOOLEAN","IfcStructuralReaction","IfcProjectedOrTrueLengthEnum"};
	private java.util.ArrayList<CloneableObject> stepParameter = null;
	private java.util.HashSet<ObjectChangeListener> listenerList = null;
	protected int stepLineNumber;
	/** ProjectedOrTrue is an DEMANDED attribute - may not be null**/
	protected IfcProjectedOrTrueLengthEnum ProjectedOrTrue;
	/**
	* The default constructor.
	**/
	public IfcStructuralPlanarAction(){}

	/**
	* Constructs a new IfcStructuralPlanarAction object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param AppliedLoad DEMANDED parameter of type IfcStructuralLoad - may not be null.
	* @param GlobalOrLocal DEMANDED parameter of type IfcGlobalOrLocalEnum - may not be null.
	* @param DestabilizingLoad DEMANDED parameter of type BOOLEAN - may not be null.
	* @param CausedBy OPTIONAL parameter of type IfcStructuralReaction
	* @param ProjectedOrTrue DEMANDED parameter of type IfcProjectedOrTrueLengthEnum - may not be null.
	**/
	public IfcStructuralPlanarAction(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcStructuralLoad AppliedLoad, IfcGlobalOrLocalEnum GlobalOrLocal, BOOLEAN DestabilizingLoad, IfcStructuralReaction CausedBy, IfcProjectedOrTrueLengthEnum ProjectedOrTrue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.AppliedLoad = AppliedLoad;
		this.GlobalOrLocal = GlobalOrLocal;
		this.DestabilizingLoad = DestabilizingLoad;
		this.CausedBy = CausedBy;
		this.ProjectedOrTrue = ProjectedOrTrue;
		resolveInverses();
	}

	/**
	 * This method initializes the IfcStructuralPlanarAction object using the given parameters.
	*
	* @param GlobalId DEMANDED parameter of type IfcGloballyUniqueId - may not be null.
	* @param OwnerHistory DEMANDED parameter of type IfcOwnerHistory - may not be null.
	* @param Name OPTIONAL parameter of type IfcLabel
	* @param Description OPTIONAL parameter of type IfcText
	* @param ObjectType OPTIONAL parameter of type IfcLabel
	* @param ObjectPlacement OPTIONAL parameter of type IfcObjectPlacement
	* @param Representation OPTIONAL parameter of type IfcProductRepresentation
	* @param AppliedLoad DEMANDED parameter of type IfcStructuralLoad - may not be null.
	* @param GlobalOrLocal DEMANDED parameter of type IfcGlobalOrLocalEnum - may not be null.
	* @param DestabilizingLoad DEMANDED parameter of type BOOLEAN - may not be null.
	* @param CausedBy OPTIONAL parameter of type IfcStructuralReaction
	* @param ProjectedOrTrue DEMANDED parameter of type IfcProjectedOrTrueLengthEnum - may not be null.
	**/
	public void setParameters(IfcGloballyUniqueId GlobalId, IfcOwnerHistory OwnerHistory, IfcLabel Name, IfcText Description, IfcLabel ObjectType, IfcObjectPlacement ObjectPlacement, IfcProductRepresentation Representation, IfcStructuralLoad AppliedLoad, IfcGlobalOrLocalEnum GlobalOrLocal, BOOLEAN DestabilizingLoad, IfcStructuralReaction CausedBy, IfcProjectedOrTrueLengthEnum ProjectedOrTrue)
	{
		this.GlobalId = GlobalId;
		this.OwnerHistory = OwnerHistory;
		this.Name = Name;
		this.Description = Description;
		this.ObjectType = ObjectType;
		this.ObjectPlacement = ObjectPlacement;
		this.Representation = Representation;
		this.AppliedLoad = AppliedLoad;
		this.GlobalOrLocal = GlobalOrLocal;
		this.DestabilizingLoad = DestabilizingLoad;
		this.CausedBy = CausedBy;
		this.ProjectedOrTrue = ProjectedOrTrue;
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
		this.ObjectType = (IfcLabel) parameters.get(4);
		this.ObjectPlacement = (IfcObjectPlacement) parameters.get(5);
		this.Representation = (IfcProductRepresentation) parameters.get(6);
		this.AppliedLoad = (IfcStructuralLoad) parameters.get(7);
		this.GlobalOrLocal = (IfcGlobalOrLocalEnum) parameters.get(8);
		this.DestabilizingLoad = (BOOLEAN) parameters.get(9);
		this.CausedBy = (IfcStructuralReaction) parameters.get(10);
		this.ProjectedOrTrue = (IfcProjectedOrTrueLengthEnum) parameters.get(11);
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
		if(ObjectPlacement != null)
		{
				if(ObjectPlacement.PlacesObject_Inverse == null)
				{
					ObjectPlacement.PlacesObject_Inverse = new SET<IfcProduct>();
				}
				ObjectPlacement.PlacesObject_Inverse.add(this);
		}
		if(Representation != null)
		{
				if(Representation instanceof IfcProductDefinitionShape)
				{
				if(((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse == null)
				{
					((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse = new SET<IfcProduct>();
				}
				((IfcProductDefinitionShape)Representation).ShapeOfProduct_Inverse.add(this);
				}
		}
		if(CausedBy != null)
		{
				if(CausedBy.Causes_Inverse == null)
				{
					CausedBy.Causes_Inverse = new SET<IfcStructuralAction>();
				}
				CausedBy.Causes_Inverse.add(this);
		}
	}

	/**
	 * This method is used internally and should NOT be used for own purposes.
	**/
	String[] getNonInverseAttributeTypes()
	{
		return IfcStructuralPlanarAction.nonInverseAttributes;	}

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
		stepString = stepString.concat("IFCSTRUCTURALPLANARACTION(");
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
		if(getRedefinedDerivedAttributeTypes().contains("ObjectType")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectType != null)		stepString = stepString.concat(((RootInterface)this.ObjectType).getStepParameter(IfcLabel.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ObjectPlacement")) stepString = stepString.concat("*,");
		else{
		if(this.ObjectPlacement != null)		stepString = stepString.concat(((RootInterface)this.ObjectPlacement).getStepParameter(IfcObjectPlacement.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("Representation")) stepString = stepString.concat("*,");
		else{
		if(this.Representation != null)		stepString = stepString.concat(((RootInterface)this.Representation).getStepParameter(IfcProductRepresentation.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("AppliedLoad")) stepString = stepString.concat("*,");
		else{
		if(this.AppliedLoad != null)		stepString = stepString.concat(((RootInterface)this.AppliedLoad).getStepParameter(IfcStructuralLoad.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("GlobalOrLocal")) stepString = stepString.concat("*,");
		else{
		if(this.GlobalOrLocal != null)		stepString = stepString.concat(((RootInterface)this.GlobalOrLocal).getStepParameter(IfcGlobalOrLocalEnum.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("DestabilizingLoad")) stepString = stepString.concat("*,");
		else{
		if(this.DestabilizingLoad != null)		stepString = stepString.concat(((RootInterface)this.DestabilizingLoad).getStepParameter(BOOLEAN.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("CausedBy")) stepString = stepString.concat("*,");
		else{
		if(this.CausedBy != null)		stepString = stepString.concat(((RootInterface)this.CausedBy).getStepParameter(IfcStructuralReaction.class.isInterface())+",");
		else		stepString = stepString.concat("$,");
		}
		if(getRedefinedDerivedAttributeTypes().contains("ProjectedOrTrue")) stepString = stepString.concat("*);");
		else{
		if(this.ProjectedOrTrue != null)		stepString = stepString.concat(((RootInterface)this.ProjectedOrTrue).getStepParameter(IfcProjectedOrTrueLengthEnum.class.isInterface())+");");
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
	* This method sets the ProjectedOrTrue attribute to the given value.
	*
	* @param ProjectedOrTrue OPTIONAL value to set
	**/
	public void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum ProjectedOrTrue)
	{
		this.ProjectedOrTrue = ProjectedOrTrue;
		fireChangeEvent();
	}

	/**
	* This method returns the value of the ProjectedOrTrue attribute.
	*
	* @return the value of ProjectedOrTrue
	/**/
	public IfcProjectedOrTrueLengthEnum getProjectedOrTrue()
	{
		return this.ProjectedOrTrue;
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
		IfcStructuralPlanarAction ifcStructuralPlanarAction = new IfcStructuralPlanarAction();
		if(this.GlobalId != null)
			ifcStructuralPlanarAction.setGlobalId((IfcGloballyUniqueId)this.GlobalId.clone());
		if(this.OwnerHistory != null)
			ifcStructuralPlanarAction.setOwnerHistory((IfcOwnerHistory)this.OwnerHistory.clone());
		if(this.Name != null)
			ifcStructuralPlanarAction.setName((IfcLabel)this.Name.clone());
		if(this.Description != null)
			ifcStructuralPlanarAction.setDescription((IfcText)this.Description.clone());
		if(this.ObjectType != null)
			ifcStructuralPlanarAction.setObjectType((IfcLabel)this.ObjectType.clone());
		if(this.ObjectPlacement != null)
			ifcStructuralPlanarAction.setObjectPlacement((IfcObjectPlacement)this.ObjectPlacement.clone());
		if(this.Representation != null)
			ifcStructuralPlanarAction.setRepresentation((IfcProductRepresentation)this.Representation.clone());
		if(this.AppliedLoad != null)
			ifcStructuralPlanarAction.setAppliedLoad((IfcStructuralLoad)this.AppliedLoad.clone());
		if(this.GlobalOrLocal != null)
			ifcStructuralPlanarAction.setGlobalOrLocal((IfcGlobalOrLocalEnum)this.GlobalOrLocal.clone());
		if(this.DestabilizingLoad != null)
			ifcStructuralPlanarAction.setDestabilizingLoad((BOOLEAN)this.DestabilizingLoad.clone());
		if(this.CausedBy != null)
			ifcStructuralPlanarAction.setCausedBy((IfcStructuralReaction)this.CausedBy.clone());
		if(this.ProjectedOrTrue != null)
			ifcStructuralPlanarAction.setProjectedOrTrue((IfcProjectedOrTrueLengthEnum)this.ProjectedOrTrue.clone());
		return ifcStructuralPlanarAction;
	}

	/**
	 * This method copys the object as shallow copy (all referenced objects are remaining).
	 *
	 * @return the cloned object
	**/
	public Object shallowCopy()
	{
		IfcStructuralPlanarAction ifcStructuralPlanarAction = new IfcStructuralPlanarAction();
		if(this.GlobalId != null)
			ifcStructuralPlanarAction.setGlobalId(this.GlobalId);
		if(this.OwnerHistory != null)
			ifcStructuralPlanarAction.setOwnerHistory(this.OwnerHistory);
		if(this.Name != null)
			ifcStructuralPlanarAction.setName(this.Name);
		if(this.Description != null)
			ifcStructuralPlanarAction.setDescription(this.Description);
		if(this.ObjectType != null)
			ifcStructuralPlanarAction.setObjectType(this.ObjectType);
		if(this.ObjectPlacement != null)
			ifcStructuralPlanarAction.setObjectPlacement(this.ObjectPlacement);
		if(this.Representation != null)
			ifcStructuralPlanarAction.setRepresentation(this.Representation);
		if(this.AppliedLoad != null)
			ifcStructuralPlanarAction.setAppliedLoad(this.AppliedLoad);
		if(this.GlobalOrLocal != null)
			ifcStructuralPlanarAction.setGlobalOrLocal(this.GlobalOrLocal);
		if(this.DestabilizingLoad != null)
			ifcStructuralPlanarAction.setDestabilizingLoad(this.DestabilizingLoad);
		if(this.CausedBy != null)
			ifcStructuralPlanarAction.setCausedBy(this.CausedBy);
		if(this.ProjectedOrTrue != null)
			ifcStructuralPlanarAction.setProjectedOrTrue(this.ProjectedOrTrue);
		return ifcStructuralPlanarAction;
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
