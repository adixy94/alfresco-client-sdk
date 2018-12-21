package com.alfresco.client.api.dictionary.representation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.alfresco.client.api.common.representation.AbstractRepresentation;
import com.google.gson.annotations.SerializedName;

public class PropertyRepresentation extends AbstractRepresentation
{
    @SerializedName("name")
    protected String name = null;

	@SerializedName("title")
    protected String title = null;
	
	@SerializedName("defaultValues")
    protected String defaultValues = null;
	
	@SerializedName("dataType")
    protected String dataType = null;
		
    @SerializedName("multiValued")
    protected Boolean multiValued = null;

    @SerializedName("mandatory")
    protected Boolean mandatory = null;
    
    @SerializedName("enforced")
    protected Boolean enforced = null;
    
    @SerializedName("protected")
    protected Boolean isProtected = null;

    @SerializedName("indexed")
    protected Boolean indexed = null;
    
    @SerializedName("indexedAtomically")
    protected Boolean indexedAtomically = null;

    @SerializedName("constraints")
    protected List<Object> constraints = new ArrayList<Object>();

    // ///////////////////////////////////////////////////////////////////////////
    // GETTERS & SETTERS
    // ///////////////////////////////////////////////////////////////////////////
    	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDefaultValues() {
		return defaultValues;
	}

	public void setDefaultValues(String defaultValues) {
		this.defaultValues = defaultValues;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Boolean getMultiValued() {
		return multiValued;
	}

	public void setMultiValued(Boolean multiValued) {
		this.multiValued = multiValued;
	}

	public Boolean getMandatory() {
		return mandatory;
	}

	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	public Boolean getEnforced() {
		return enforced;
	}

	public void setEnforced(Boolean enforced) {
		this.enforced = enforced;
	}

	public Boolean getIsProtected() {
		return isProtected;
	}

	public void setIsProtected(Boolean isProtected) {
		this.isProtected = isProtected;
	}

	public Boolean getIndexed() {
		return indexed;
	}

	public void setIndexed(Boolean indexed) {
		this.indexed = indexed;
	}

	public Boolean getIndexedAtomically() {
		return indexedAtomically;
	}

	public void setIndexedAtomically(Boolean indexedAtomically) {
		this.indexedAtomically = indexedAtomically;
	}

	public List<Object> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<Object> constraints) {
		this.constraints = constraints;
	}

	@Override
    public boolean equals(java.lang.Object o)
    {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        PropertyRepresentation property = (PropertyRepresentation) o;
        return Objects.equals(this.name, property.name) && Objects.equals(this.title, property.title)
        		&& Objects.equals(this.defaultValues, property.defaultValues) && Objects.equals(this.dataType, property.dataType)
        		&& Objects.equals(this.multiValued, property.multiValued) && Objects.equals(this.mandatory, property.mandatory)
        		&& Objects.equals(this.enforced, property.enforced) && Objects.equals(this.isProtected, property.isProtected)
                && Objects.equals(this.indexed, property.indexed) && Objects.equals(this.indexedAtomically, property.indexedAtomically)
                && Objects.equals(this.constraints, property.constraints);
    }

	@Override
    public int hashCode()
    {
        return Objects.hash(name, title, defaultValues, dataType, multiValued, mandatory, enforced, isProtected
        		, indexed, indexedAtomically, constraints);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
        sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
        sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
        sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
        sb.append("    indexed: ").append(toIndentedString(indexed)).append("\n");
        sb.append("    indexedAtomically: ").append(toIndentedString(indexedAtomically)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("}\n");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o)
    {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }
}
