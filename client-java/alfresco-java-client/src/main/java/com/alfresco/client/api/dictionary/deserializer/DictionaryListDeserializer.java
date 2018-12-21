package com.alfresco.client.api.dictionary.deserializer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.*;

public class DictionaryListDeserializer<T> implements JsonDeserializer<List<T>>
{
    protected Class<T> clazz;

    public DictionaryListDeserializer(Class<T> clazz)
    {
        this.clazz = clazz;
    }

    @Override
    public List<T> deserialize(JsonElement je, Type type, JsonDeserializationContext jdc)
            throws JsonParseException
    {
        JsonArray entries = je.getAsJsonArray();
        
        final List<T> result = new ArrayList<>();
        T obj = null;
		for (Object entry : entries) {		
			obj = jdc.deserialize((JsonElement) entry, clazz);
        	result.add(obj);
        }

        return result;
    }

}
