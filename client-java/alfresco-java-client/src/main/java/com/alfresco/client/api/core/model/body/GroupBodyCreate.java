package com.alfresco.client.api.core.model.body;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * GroupBodyCreate
 */
public class GroupBodyCreate
{
    @SerializedName("id")
    public final String id;

    @SerializedName("displayName")
    public final String displayName;

    @SerializedName("parentIds")
    public final List<String> parentIds;

    public GroupBodyCreate(String id, String displayName, List<String> parentIds)
    {
        this.id = id;
        this.displayName = displayName;
        this.parentIds = parentIds;
    }
}
