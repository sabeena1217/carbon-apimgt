package org.wso2.carbon.apimgt.gateway.services;

import ballerina.lang.system;
import ballerina.lang.errors;
import org.wso2.carbon.apimgt.gateway.utils as gatewayUtil;
import org.wso2.carbon.apimgt.gateway.holders as holder;
import ballerina.net.http;

service<http> gatewayInitService {
    boolean isCacheInitialized = holder:initializeCache();
    boolean isMapsAdded = holder:addThrottleMaps();
    boolean isReady = initGateway();

    boolean offlineSubsInitialized = gatewayUtil:retrieveOfflineSubscriptions();
    boolean offlineAppssInitialized = gatewayUtil:retrieveOfflineApplications();
    boolean policiesInitialized = gatewayUtil:retrievePolicies();

}

function initGateway () (boolean) {

    try {
        //Register gateway in API Core
        gatewayUtil:registerGateway();
        // getGatewayConfig needed in keyManagerInfo, analyticsInfo & throttlingInfo

        //Retrieve APIs from API Core and deploy
        //gatewayUtil:loadAPIs();
        gatewayUtil:loadOfflineAPIs();
        //gatewayUtil:loadGlobalEndpoints();
        //gatewayUtil:loadBlockConditions();
    } catch (errors:Error e) {
        system:println("Error while initilazing API gateway. " + e.msg);
    }
    return true;
}
