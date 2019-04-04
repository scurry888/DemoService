package com.example.odata;

import java.util.HashMap;
import java.util.Map;

import com.sap.cloud.sdk.service.prov.api.operations.Read;
import com.sap.cloud.sdk.service.prov.api.request.ReadRequest;
import com.sap.cloud.sdk.service.prov.api.response.ReadResponse;

public class ServiceImplementation {

    @Read(serviceName="DemoService", entity="People")
    public ReadResponse getPerson(ReadRequest request) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("UniqueId", 1);
        map.put("Name", "Kitty");

        return ReadResponse.setSuccess().setData(map).response();
    }
}
