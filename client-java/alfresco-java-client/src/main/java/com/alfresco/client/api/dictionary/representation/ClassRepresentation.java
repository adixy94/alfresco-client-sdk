package com.alfresco.client.api.dictionary.representation;

import java.util.Objects;

import com.alfresco.client.api.common.representation.AbstractRepresentation;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LinkedTreeMap;

public class ClassRepresentation extends AbstractRepresentation {
	@SerializedName("name")
	protected String name = null;

	@SerializedName("isAspect")
	protected Boolean isAspect = null;

	@SerializedName("isContainer")
	protected Boolean isContainer = null;

	@SerializedName("title")
	protected String title = null;

	@SerializedName("description")
	protected String description = null;

	@SerializedName("parent")
	protected ParentInfoRepresentation parent = null;

	@SerializedName("defaultAspects")
	protected LinkedTreeMap<String, AspectInfoRepresentation> defaultAspects;

	@SerializedName("properties")
	protected LinkedTreeMap<String, PropertyRepresentation> properties;

	@SerializedName("associations")
	protected LinkedTreeMap<String, Object> associations = null;

	@SerializedName("childassociations")
	protected LinkedTreeMap<String, Object> childassociations = null;

	// ///////////////////////////////////////////////////////////////////////////
	// GETTERS & SETTERS
	// ///////////////////////////////////////////////////////////////////////////

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsAspect() {
		return isAspect;
	}

	public void setIsAspect(Boolean isAspect) {
		this.isAspect = isAspect;
	}

	public Boolean getIsContainer() {
		return isContainer;
	}

	public void setIsContainer(Boolean isContainer) {
		this.isContainer = isContainer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ParentInfoRepresentation getParent() {
		return parent;
	}

	public void setParent(ParentInfoRepresentation parent) {
		this.parent = parent;
	}

	public LinkedTreeMap<String, AspectInfoRepresentation> getDefaultAspects() {
		return defaultAspects;
	}

	public void setDefaultAspects(LinkedTreeMap<String, AspectInfoRepresentation> defaultAspects) {
		this.defaultAspects = defaultAspects;
	}

	public LinkedTreeMap<String, PropertyRepresentation> getProperties() {
		return properties;
	}

	public void setProperties(LinkedTreeMap<String, PropertyRepresentation> properties) {
		this.properties = properties;
	}

	public LinkedTreeMap<String, Object> getAssociations() {
		return associations;
	}

	public void setAssociations(LinkedTreeMap<String, Object> associations) {
		this.associations = associations;
	}

	public LinkedTreeMap<String, Object> getChildassociations() {
		return childassociations;
	}

	public void setChildassociations(LinkedTreeMap<String, Object> childassociations) {
		this.childassociations = childassociations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClassRepresentation classRep = (ClassRepresentation) o;
		return Objects.equals(this.name, classRep.name)
				&& Objects.equals(this.isAspect, classRep.isAspect)
				&& Objects.equals(this.isContainer, classRep.isContainer)
				&& Objects.equals(this.title, classRep.title)
				&& Objects.equals(this.description, classRep.description)
				&& Objects.equals(this.parent, classRep.parent)
				&& Objects.equals(this.defaultAspects, classRep.defaultAspects)
				&& Objects.equals(this.properties, classRep.properties)
				&& Objects.equals(this.associations, classRep.associations)
				&& Objects.equals(this.childassociations, classRep.childassociations);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, isAspect, isContainer, title, description, parent, defaultAspects, properties,
				associations, childassociations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClassRepresentation {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    isAspect: ").append(toIndentedString(isAspect)).append("\n");
		sb.append("    isContainer: ").append(toIndentedString(isContainer)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
		sb.append("    defaultAspects: ").append(toIndentedString(defaultAspects)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
		sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
		sb.append("    childassociations: ").append(toIndentedString(childassociations)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
