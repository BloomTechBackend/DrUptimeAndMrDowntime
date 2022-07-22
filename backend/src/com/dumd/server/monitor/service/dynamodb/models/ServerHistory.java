package com.dumd.server.monitor.service.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.Map;

/**
 *  Represents a record in the serverHistory table.
 */
@DynamoDBTable(tableName = "serverHistory")
public class ServerHistory {
    private String serverHistoryId;
    private String appId;
    private Map<String, String> errorLogs;

    @DynamoDBHashKey(attributeName = "serverHistoryId")
    public String getServerHistoryId() {
        return serverHistoryId;
    }

    public void setServerHistoryId(String serverHistoryId) {
        this.serverHistoryId = serverHistoryId;
    }

    @DynamoDBAttribute(attributeName = "appId")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @DynamoDBAttribute(attributeName = "errorLogs")
    public Map<String, String> getErrorLogs() {
        return errorLogs;
    }

    public void setErrorLogs(Map<String, String> errorLogs) {
        this.errorLogs = errorLogs;
    }
}
