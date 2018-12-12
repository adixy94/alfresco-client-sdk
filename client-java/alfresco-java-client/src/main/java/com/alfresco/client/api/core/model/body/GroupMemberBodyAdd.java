package com.alfresco.client.api.core.model.body;

import com.google.gson.annotations.SerializedName;

/**
 * GroupMemberBodyAdd
 */
public class GroupMemberBodyAdd
{
    @SerializedName("id")
    public final String id;
    
    @SerializedName("memberType")
    public final String memberType;

    public GroupMemberBodyAdd(String id, String memberType)
    {
        this.id = id;
        this.memberType = memberType;
    }
}
