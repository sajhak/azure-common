/*
* Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.carbon.clustering.azure.domain;

import java.util.HashMap;

/**
 * Azure Network Security Group Network Interface
 */
public class NetworkInterface {
    private String id;
    private String name;
    private HashMap<String, String> tags;
    private NetworkInterfaceProperties properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        if (name == null) {
            String[] temp = this.id.split("/");
            name = temp[temp.length - 1];
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getTags() {
        return tags;
    }

    public void setTags(HashMap<String, String> tags) {
        this.tags = tags;
    }

    public NetworkInterfaceProperties getProperties() {
        return properties;
    }

    public void setProperties(NetworkInterfaceProperties properties) {
        this.properties = properties;
    }
}
