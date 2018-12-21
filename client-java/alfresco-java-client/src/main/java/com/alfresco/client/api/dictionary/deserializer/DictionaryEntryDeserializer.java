package com.alfresco.client.api.dictionary.deserializer;

import java.lang.reflect.Type;

import com.alfresco.client.utils.ISO8601Utils;
import com.google.gson.*;

public class DictionaryEntryDeserializer<T> implements JsonDeserializer<T>
{
    @Override
    public T deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException
    {
        JsonElement entry = je;
        return new GsonBuilder().setDateFormat(ISO8601Utils.DATE_ISO_FORMAT).create().fromJson(entry, type);
    }
}
