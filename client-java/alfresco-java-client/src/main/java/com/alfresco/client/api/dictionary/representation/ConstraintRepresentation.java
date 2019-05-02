package com.alfresco.client.api.dictionary.representation;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.alfresco.client.api.common.representation.AbstractRepresentation;
import com.google.gson.annotations.SerializedName;

public class ConstraintRepresentation extends AbstractRepresentation {
	@SerializedName("type")
	protected String type = null;

	@SerializedName("parameters")
	protected List<Map<String, Object>> parameters = null;

	// ///////////////////////////////////////////////////////////////////////////
	// GETTERS & SETTERS
	// ///////////////////////////////////////////////////////////////////////////

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Map<String, Object>> getParameters() {
		return parameters;
	}

	public void setParameters(List<Map<String, Object>> parameters) {
		this.parameters = parameters;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConstraintRepresentation constraint = (ConstraintRepresentation) o;
		return Objects.equals(this.type, constraint.type) && Objects.equals(this.parameters, constraint.parameters);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, parameters);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");

		sb.append("}\n");
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
