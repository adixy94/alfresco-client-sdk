package com.alfresco.client.api.dictionary;

import java.util.List;

import com.alfresco.client.api.dictionary.representation.ClassRepresentation;
import com.alfresco.client.api.dictionary.representation.PropertyRepresentation;

import retrofit2.Call;
import retrofit2.http.*;
import rx.Observable;

public interface DictionaryAPI {

	/**
	 * Get all classes and aspects from the dictionary.
	 * 
	 * @return List<ClassRepresentation>
	 */
	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/dictionary")
	Call<List<ClassRepresentation>> getDictionaryCall();

	/**
	 * Get all class definitions from the repository.
	 * 
	 * @param classNamespace
	 *            Optionally filter the list by a class namespace. Full class
	 *            name example: "{classNamespace}:{className}" (optional)
	 * @param className
	 *            Optionally filter the list by a class name. Full class name
	 *            example: "{classNamespace}:{className}". Works only if the
	 *            className is defined (optional)
	 * @return List<ClassRepresentation>
	 */
	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/defclasses")
	Call<List<ClassRepresentation>> getClassCall(@Query(DictionaryConstant.NAMESPACE_VALUE) String classNamespace,
			@Query(DictionaryConstant.NAME_VALUE) String className);

	/**
	 * Get all class definitions from the repository.
	 * 
	 * @param classNamespace
	 *            Optionally filter the list by a class namespace. Full class
	 *            name example: "{classNamespace}:{className}" (optional)
	 * @param className
	 *            Optionally filter the list by a class name. Full class name
	 *            example: "{classNamespace}:{className}". Works only if the
	 *            className is defined (optional)
	 * @return List<ClassRepresentation>
	 */
	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/defclasses")
	Observable<List<ClassRepresentation>> getClassObservable(
			@Query(DictionaryConstant.NAMESPACE_VALUE) String classNamespace,
			@Query(DictionaryConstant.NAME_VALUE) String className);

	/**
	 * Get a list of property definitions from a class.
	 * 
	 * @param classNamespace
	 *            Class namespace which comes as a prefix in a full class name.
	 *            Full class name example: "{classNamespace}:{className}"
	 *            (required)
	 * @param className
	 *            Class name which comes after namespace in a full class name.
	 *            Full class name example: "{classNamespace}:{className}"
	 *            (required)
	 * @param propertyNamespace
	 *            Optionally filter the list by a property namespace. Full
	 *            property name example: "{propertyNamespace}:{propertyName}"
	 *            (optional)
	 * @param type
	 *            Optionally filter the list by a property type (optional)
	 * 
	 * @return List<ClassRepresentation>
	 */
	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/defclasses/{classNamespace}/{className}/properties")
	Call<List<PropertyRepresentation>> getClassPropertyCall(@Path("classNamespace") String classNamespace,
			@Path("className") String className, @Query(DictionaryConstant.NAMESPACE_VALUE) String propertyNamespace,
			@Query(DictionaryConstant.TYPE_VALUE) String type);

	/**
	 * Get a list of property definitions from a class.
	 * 
	 * @param classNamespace
	 *            Class namespace which comes as a prefix in a full class name.
	 *            Full class name example: "{classNamespace}:{className}"
	 *            (required)
	 * @param className
	 *            Class name which comes after namespace in a full class name.
	 *            Full class name example: "{classNamespace}:{className}"
	 *            (required)
	 * @param propertyNamespace
	 *            Optionally filter the list by a property namespace. Full
	 *            property name example: "{propertyNamespace}:{propertyName}"
	 *            (optional)
	 * @param type
	 *            Optionally filter the list by a property type (optional)
	 * 
	 * @return List<ClassRepresentation>
	 */
	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/defclasses/{classNamespace}/{className}/properties")
	Observable<List<PropertyRepresentation>> getClassPropertyObservable(@Path("classNamespace") String classNamespace,
			@Path("className") String className, @Query(DictionaryConstant.NAMESPACE_VALUE) String propertyNamespace,
			@Query(DictionaryConstant.TYPE_VALUE) String type);

	/**
	 * Get a list of property definitions from a class.
	 * 
	 * @param classNamespace
	 *            Class namespace which comes as a prefix in a full class name.
	 *            Full class name example: "{classNamespace}:{className}"
	 *            (required)
	 * @param className
	 *            Class name which comes after namespace in a full class name.
	 *            Full class name example: "{classNamespace}:{className}"
	 *            (required)
	 * @param subClassNamespace
	 *            Optionally filter the list by a subclass namespace. class name
	 *            example: "{classNamespace}:{className}" (optional)
	 * @param recursive
	 *            If true (default), the list includes the class itself and all
	 *            the the subclasses (direct and indirect descendants) If false,
	 *            the list includes only the classes that inherit it directly
	 *            (direct descendants) (optional)
	 * 
	 * @return List<ClassRepresentation>
	 */
	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/defclasses/{classNamespace}/{className}/subclasses")
	Call<List<ClassRepresentation>> getSubclassCall(@Path("classNamespace") String classNamespace,
			@Path("className") String className, @Query(DictionaryConstant.NAMESPACE_VALUE) String subClassNamespace,
			@Query(DictionaryConstant.RECURSIVE_VALUE) Boolean recursive);

	@GET(DictionaryConstant.DISCOVERY_PUBLIC_API + "/defclasses/{classNamespace}/{className}/subclasses")
	Observable<List<ClassRepresentation>> getSubclassObservable(@Path("classNamespace") String classNamespace,
			@Path("className") String className, @Query(DictionaryConstant.NAMESPACE_VALUE) String subClassNamespace,
			@Query(DictionaryConstant.RECURSIVE_VALUE) Boolean recursive);

}
