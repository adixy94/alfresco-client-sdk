package org.alfresco.client.services.process.activiti.core.api;

import static org.alfresco.client.services.process.activiti.core.ActivitiConstant.ACTIVITI_SERVICE_PATH;

import java.util.List;
import java.util.Map;

import org.alfresco.client.services.process.activiti.common.model.representation.ResultList;
import org.alfresco.client.services.process.activiti.core.model.representation.TableMetaData;
import org.alfresco.client.services.process.activiti.core.model.representation.TableResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jpascal on 03/05/2017.
 */
public interface DatabaseTablesAPI
{

    /**
     * Get a single table
     *
     * @param tableName The name of the table to get. (required)
     * @return TableResponse
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}")
    Call<TableResponse> getTableCall(@Path("tableName") String tableName);

    /**
     * Get row data for a single table
     *
     * @param tableName The name of the table to get. (required)
     * @param start Index of the first row to fetch. Defaults to 0. (optional)
     * @param size Number of rows to fetch, starting from start. Defaults to 10.
     *            (optional)
     * @param orderAscendingColumn Name of the column to sort the resulting rows
     *            on, ascending. (optional)
     * @param orderDescendingColumn Name of the column to sort the resulting
     *            rows on, descending. (optional)
     * @return DataResponse
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}/data")
    Call<ResultList<List<Map<String, Object>>>> getTableDataCall(@Path("tableName") String tableName,
            @Query("start") String start, @Query("size") String size,
            @Query("orderAscendingColumn") String orderAscendingColumn,
            @Query("orderDescendingColumn") String orderDescendingColumn);

    /**
     * Get column info for a single table
     *
     * @param tableName The name of the table to get. (required)
     * @return TableMetaData
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}/columns")
    Call<TableMetaData> getTableDataCall(@Path("tableName") String tableName);

    /**
     * List of tables
     *
     * @return List&lt;TableResponse&gt;
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}/columns")
    Call<List<TableResponse>> getTablesCall();

    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////
    // ///////////////////////////////////////////////////////////////////////////

    /**
     * Get a single table
     *
     * @param tableName The name of the table to get. (required)
     * @return TableResponse
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}")
    Observable<TableResponse> getTableObservable(@Path("tableName") String tableName);

    /**
     * Get row data for a single table
     *
     * @param tableName The name of the table to get. (required)
     * @param start Index of the first row to fetch. Defaults to 0. (optional)
     * @param size Number of rows to fetch, starting from start. Defaults to 10.
     *            (optional)
     * @param orderAscendingColumn Name of the column to sort the resulting rows
     *            on, ascending. (optional)
     * @param orderDescendingColumn Name of the column to sort the resulting
     *            rows on, descending. (optional)
     * @return DataResponse
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}/data")
    Observable<ResultList<List<Map<String, Object>>>> getTableDataObservable(@Path("tableName") String tableName,
            @Query("start") String start, @Query("size") String size,
            @Query("orderAscendingColumn") String orderAscendingColumn,
            @Query("orderDescendingColumn") String orderDescendingColumn);

    /**
     * Get column info for a single table
     *
     * @param tableName The name of the table to get. (required)
     * @return TableMetaData
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}/columns")
    Observable<TableMetaData> getTableDataObservable(@Path("tableName") String tableName);

    /**
     * List of tables
     *
     * @return List&lt;TableResponse&gt;
     */
    @GET(ACTIVITI_SERVICE_PATH + "/management/tables/{tableName}/columns")
    Observable<List<TableResponse>> getTablesObservable();

}