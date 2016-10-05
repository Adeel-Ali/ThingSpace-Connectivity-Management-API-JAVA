# Getting Started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

## How to Use

The following section explains how to use the ThingSpaceConnectivityManagementAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *ThingSpaceConnectivityManagementAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

Clicking the ``` Add ``` button will open a dialog where you need to specify ThingSpaceConnectivityManagementAPI in ``` Group Id ``` and ThingSpaceConnectivityManagementAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=ThingSpace%20Connectivity%20Management%20API-Java&workspaceName=ThingSpaceConnectivityManagementAPI&projectName=ThingSpaceConnectivityManagementAPILib&rootNamespace=com.example)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *ThingSpaceConnectivityManagementAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication and Initialization
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| apiKey | TODO: add a description |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String apiKey = "apiKey";

ThingSpaceConnectivityManagementAPIClient client = new ThingSpaceConnectivityManagementAPIClient(apiKey);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [SmsController](#sms_controller)
* [SessionController](#session_controller)
* [PlansController](#plans_controller)
* [LeadsController](#leads_controller)
* [GroupsController](#groups_controller)
* [DevicesController](#devices_controller)
* [CallbacksController](#callbacks_controller)

### <a name="sms_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.SmsController") SmsController

#### Get singleton instance

The singleton instance of the ``` SmsController ``` class can be accessed from the API Client.

```java
SmsController sms = client.getSms();
```

#### <a name="update_start_sms_callback_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.SmsController.updateStartSmsCallbackUsingPUTAsync") updateStartSmsCallbackUsingPUTAsync

> Starts delivery of queued SMS messages for the specific account.


```java
void updateStartSmsCallbackUsingPUTAsync(
        final String aname,
        final String vZM2MToken,
        final APICallBack<RestSuccessResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| aname |  ``` Required ```  | Account name |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
String aname = "aname";
String vZM2MToken = "VZ-M2M-Token";
// Invoking the API call with sample inputs
sms.updateStartSmsCallbackUsingPUTAsync(aname, vZM2MToken, new APICallBack<RestSuccessResponse>() {
    public void onSuccess(HttpContext context, RestSuccessResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="get_sms_messages_using_get_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.SmsController.getSmsMessagesUsingGETAsync") getSmsMessagesUsingGETAsync

> Retrieves queued SMS messages sent by all M2M MC devices associated with an account.


```java
void getSmsMessagesUsingGETAsync(
        final String aname,
        final String vZM2MToken,
        final Long next,
        final APICallBack<SmsMessagesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| aname |  ``` Required ```  | Account name |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| next |  ``` Optional ```  | Continue the previous query from the URL in Location Header |


#### Example Usage

```java
String aname = "aname";
String vZM2MToken = "VZ-M2M-Token";
Long next = 32;
// Invoking the API call with sample inputs
sms.getSmsMessagesUsingGETAsync(aname, vZM2MToken, next, new APICallBack<SmsMessagesResponse>() {
    public void onSuccess(HttpContext context, SmsMessagesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_send_sms_message_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.SmsController.createSendSmsMessageUsingPOSTAsync") createSendSmsMessageUsingPOSTAsync

> Sends an SMS message to one or more devices.


```java
void createSendSmsMessageUsingPOSTAsync(
        final SMSSendRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | SMS Request |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    SMSSendRequest request = new SMSSendRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    sms.createSendSmsMessageUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)

### <a name="session_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.SessionController") SessionController

#### Get singleton instance

The singleton instance of the ``` SessionController ``` class can be accessed from the API Client.

```java
SessionController session = client.getSession();
```

#### <a name="update_reset_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.SessionController.updateResetUsingPUTAsync") updateResetUsingPUTAsync

> Returns a new, randomly generated password for the current username


```java
void updateResetUsingPUTAsync(
        final SessionResetPasswordRequest request,
        final String vZM2MToken,
        final APICallBack<SessionResetPasswordResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Current Password |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    SessionResetPasswordRequest request = new SessionResetPasswordRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    session.updateResetUsingPUTAsync(request, vZM2MToken, new APICallBack<SessionResetPasswordResponse>() {
        public void onSuccess(HttpContext context, SessionResetPasswordResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_logout_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.SessionController.createLogoutUsingPOSTAsync") createLogoutUsingPOSTAsync

> Ends a Connectivity Management session.


```java
void createLogoutUsingPOSTAsync(
        final String vZM2MToken,
        final APICallBack<LogOutRequest> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
// Invoking the API call with sample inputs
session.createLogoutUsingPOSTAsync(vZM2MToken, new APICallBack<LogOutRequest>() {
    public void onSuccess(HttpContext context, LogOutRequest response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_login_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.SessionController.createLoginUsingPOSTAsync") createLoginUsingPOSTAsync

> Initiates a Connectivity Management session and returns a session token required in subsequent API requests.


```java
void createLoginUsingPOSTAsync(
        final LogInRequest request,
        final APICallBack<LogInResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Optional ```  | request |


#### Example Usage

```java
try {
    LogInRequest request = new LogInRequest();
    // Invoking the API call with sample inputs
    session.createLoginUsingPOSTAsync(request, new APICallBack<LogInResponse>() {
        public void onSuccess(HttpContext context, LogInResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)

### <a name="plans_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.PlansController") PlansController

#### Get singleton instance

The singleton instance of the ``` PlansController ``` class can be accessed from the API Client.

```java
PlansController plans = client.getPlans();
```

#### <a name="get_service_plan_list_using_get_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.PlansController.getServicePlanListUsingGETAsync") getServicePlanListUsingGETAsync

> Returns a list of all data service plans that are associated with a specified account.


```java
void getServicePlanListUsingGETAsync(
        final String vZM2MToken,
        final String aname,
        final APICallBack<List<ServicePlanResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
String aname = "aname";
// Invoking the API call with sample inputs
plans.getServicePlanListUsingGETAsync(vZM2MToken, aname, new APICallBack<List<ServicePlanResponse>>() {
    public void onSuccess(HttpContext context, List<ServicePlanResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)

### <a name="leads_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.LeadsController") LeadsController

#### Get singleton instance

The singleton instance of the ``` LeadsController ``` class can be accessed from the API Client.

```java
LeadsController leads = client.getLeads();
```

#### <a name="get_list_using_get1_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.LeadsController.getListUsingGET1Async") getListUsingGET1Async

> Returns information for all leads associated with the account


```java
void getListUsingGET1Async(
        final String vZM2MToken,
        final String aname,
        final Long next,
        final APICallBack<LeadInformationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |
| next |  ``` Optional ```  | Continue the previous query from the pageUrl in Location Header |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
String aname = "aname";
Long next = 32;
// Invoking the API call with sample inputs
leads.getListUsingGET1Async(vZM2MToken, aname, next, new APICallBack<LeadInformationResponse>() {
    public void onSuccess(HttpContext context, LeadInformationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)

### <a name="groups_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.GroupsController") GroupsController

#### Get singleton instance

The singleton instance of the ``` GroupsController ``` class can be accessed from the API Client.

```java
GroupsController groups = client.getGroups();
```

#### <a name="delete_device_group_using_delete_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.GroupsController.deleteDeviceGroupUsingDELETEAsync") deleteDeviceGroupUsingDELETEAsync

> Deletes a device group. Devices in the group are moved to the default device group and are not deleted from the account.


```java
void deleteDeviceGroupUsingDELETEAsync(
        final String vZM2MToken,
        final String aname,
        final String gname,
        final APICallBack<RestSuccessResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |
| gname |  ``` Required ```  | Group name |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
String aname = "aname";
String gname = "gname";
// Invoking the API call with sample inputs
groups.deleteDeviceGroupUsingDELETEAsync(vZM2MToken, aname, gname, new APICallBack<RestSuccessResponse>() {
    public void onSuccess(HttpContext context, RestSuccessResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="update_device_group_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.GroupsController.updateDeviceGroupUsingPUTAsync") updateDeviceGroupUsingPUTAsync

> Make changes to a device group, including changing the name and description, and adding or removing devices.


```java
void updateDeviceGroupUsingPUTAsync(
        final GroupUpdateRequest request,
        final String aname,
        final String gname,
        final String vZM2MToken,
        final APICallBack<RestSuccessResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request |
| aname |  ``` Required ```  | Account name |
| gname |  ``` Required ```  | Group name |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    GroupUpdateRequest request = new GroupUpdateRequest();
    String aname = "aname";
    String gname = "gname";
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    groups.updateDeviceGroupUsingPUTAsync(request, aname, gname, vZM2MToken, new APICallBack<RestSuccessResponse>() {
        public void onSuccess(HttpContext context, RestSuccessResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="get_device_group_info_using_get_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.GroupsController.getDeviceGroupInfoUsingGETAsync") getDeviceGroupInfoUsingGETAsync

> Returns the name, description, and list of devices in a device group.


```java
void getDeviceGroupInfoUsingGETAsync(
        final String aname,
        final String gname,
        final String vZM2MToken,
        final Long next,
        final APICallBack<GroupListResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| aname |  ``` Required ```  | Account name |
| gname |  ``` Required ```  | Group name |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| next |  ``` Optional ```  | Continue the previous query from the pageUrl pagetoken |


#### Example Usage

```java
String aname = "aname";
String gname = "gname";
String vZM2MToken = "VZ-M2M-Token";
Long next = 32;
// Invoking the API call with sample inputs
groups.getDeviceGroupInfoUsingGETAsync(aname, gname, vZM2MToken, next, new APICallBack<GroupListResponse>() {
    public void onSuccess(HttpContext context, GroupListResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="get_list_using_get_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.GroupsController.getListUsingGETAsync") getListUsingGETAsync

> Returns a list of device groups in an account


```java
void getListUsingGETAsync(
        final String vZM2MToken,
        final String aname,
        final APICallBack<List<GroupResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
String aname = "aname";
// Invoking the API call with sample inputs
groups.getListUsingGETAsync(vZM2MToken, aname, new APICallBack<List<GroupResponse>>() {
    public void onSuccess(HttpContext context, List<GroupResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_device_group_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.GroupsController.createDeviceGroupUsingPOSTAsync") createDeviceGroupUsingPOSTAsync

> Creates a new device group and optionally adds a set of devices to that group.


```java
void createDeviceGroupUsingPOSTAsync(
        final CreateDevGroupRequest request,
        final String vZM2MToken,
        final APICallBack<RestSuccessResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    CreateDevGroupRequest request = new CreateDevGroupRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    groups.createDeviceGroupUsingPOSTAsync(request, vZM2MToken, new APICallBack<RestSuccessResponse>() {
        public void onSuccess(HttpContext context, RestSuccessResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)

### <a name="devices_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.DevicesController") DevicesController

#### Get singleton instance

The singleton instance of the ``` DevicesController ``` class can be accessed from the API Client.

```java
DevicesController devices = client.getDevices();
```

#### <a name="change_device_id_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.changeDeviceIdUsingPUTAsync") changeDeviceIdUsingPUTAsync

> Changes the identifier of a 3G or 4G device to match hardware changes made for a line of service.


```java
void changeDeviceIdUsingPUTAsync(
        final String serviceType,
        final ChangeDeviceIdRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| serviceType |  ``` Required ```  | Identifier type |
| request |  ``` Required ```  | Device Usage Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    String serviceType = "serviceType";
    ChangeDeviceIdRequest request = new ChangeDeviceIdRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.changeDeviceIdUsingPUTAsync(serviceType, request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_aggregate_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createAggregateUsingPOSTAsync") createAggregateUsingPOSTAsync

> Returns the total amount of data sent and the total number of SMS messages sent or received by a set of devices in a specified timeframe.


```java
void createAggregateUsingPOSTAsync(
        final DeviceAggregateUsageListRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceAggregateUsageListRequest request = new DeviceAggregateUsageListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createAggregateUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_usage_list_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createUsageListUsingPOSTAsync") createUsageListUsingPOSTAsync

> Returns the network data usage history of a device during a specified time period.


```java
void createUsageListUsingPOSTAsync(
        final DeviceUsageListRequest request,
        final String vZM2MToken,
        final APICallBack<List<DeviceUsageListResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Device Usage Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceUsageListRequest request = new DeviceUsageListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createUsageListUsingPOSTAsync(request, vZM2MToken, new APICallBack<List<DeviceUsageListResponse>>() {
        public void onSuccess(HttpContext context, List<DeviceUsageListResponse> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_prl_list_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createPrlListUsingPOSTAsync") createPrlListUsingPOSTAsync

> Requests the current PRL version for devices, which can help determine which devices need a PRL update.


```java
void createPrlListUsingPOSTAsync(
        final DevicePrlListRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Device PRL Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DevicePrlListRequest request = new DevicePrlListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createPrlListUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_provisioning_history_list_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createProvisioningHistoryListUsingPOSTAsync") createProvisioningHistoryListUsingPOSTAsync

> Returns the provisioning history of a device during a specified time period.


```java
void createProvisioningHistoryListUsingPOSTAsync(
        final DeviceProvisioningHistoryListRequest request,
        final String vZM2MToken,
        final APICallBack<List<DeviceProvisioningHistoryListResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Device ProHistory Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceProvisioningHistoryListRequest request = new DeviceProvisioningHistoryListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createProvisioningHistoryListUsingPOSTAsync(request, vZM2MToken, new APICallBack<List<DeviceProvisioningHistoryListResponse>>() {
        public void onSuccess(HttpContext context, List<DeviceProvisioningHistoryListResponse> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="change_cost_center_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.changeCostCenterUsingPUTAsync") changeCostCenterUsingPUTAsync

> Changes or removes the costCenterCode value for one or more devices.


```java
void changeCostCenterUsingPUTAsync(
        final DeviceCostCenterRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceCostCenterRequest request = new DeviceCostCenterRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.changeCostCenterUsingPUTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_connection_list_history_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createConnectionListHistoryUsingPOSTAsync") createConnectionListHistoryUsingPOSTAsync

> Returns a list of network connection events for a device during a specified time period.


```java
void createConnectionListHistoryUsingPOSTAsync(
        final DeviceConnectionListRequest request,
        final String vZM2MToken,
        final APICallBack<List<ConnectionHistoryResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Device Connection Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceConnectionListRequest request = new DeviceConnectionListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createConnectionListHistoryUsingPOSTAsync(request, vZM2MToken, new APICallBack<List<ConnectionHistoryResponse>>() {
        public void onSuccess(HttpContext context, List<ConnectionHistoryResponse> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_connection_list_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createConnectionListUsingPOSTAsync") createConnectionListUsingPOSTAsync

> Returns a list of network connection events for a device during a specified time period.


```java
void createConnectionListUsingPOSTAsync(
        final DeviceConnectionListRequest request,
        final String vZM2MToken,
        final APICallBack<List<ConnectionEvent>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Device Connection Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceConnectionListRequest request = new DeviceConnectionListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createConnectionListUsingPOSTAsync(request, vZM2MToken, new APICallBack<List<ConnectionEvent>>() {
        public void onSuccess(HttpContext context, List<ConnectionEvent> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_restore_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createRestoreUsingPOSTAsync") createRestoreUsingPOSTAsync

> Restore service to one or more suspended devices. 


```java
void createRestoreUsingPOSTAsync(
        final CarrierActionsRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Update state |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    CarrierActionsRequest request = new CarrierActionsRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createRestoreUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_suspend_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createSuspendUsingPOSTAsync") createSuspendUsingPOSTAsync

> Suspends service for one or more devices. 


```java
void createSuspendUsingPOSTAsync(
        final CarrierActionsRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Update state |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    CarrierActionsRequest request = new CarrierActionsRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createSuspendUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="update_service_plan_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.updateServicePlanUsingPUTAsync") updateServicePlanUsingPUTAsync

> Sets a new service plan for one or more devices.


```java
void updateServicePlanUsingPUTAsync(
        final ServicePlanUpdateRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    ServicePlanUpdateRequest request = new ServicePlanUpdateRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.updateServicePlanUsingPUTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_list_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createListUsingPOSTAsync") createListUsingPOSTAsync

> Returns information about a specified device or a list of devices in an account.


```java
void createListUsingPOSTAsync(
        final DeviceListRequest request,
        final String vZM2MToken,
        final APICallBack<DeviceListResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Device Query |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    DeviceListRequest request = new DeviceListRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createListUsingPOSTAsync(request, vZM2MToken, new APICallBack<DeviceListResponse>() {
        public void onSuccess(HttpContext context, DeviceListResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_deactive_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createDeactiveUsingPOSTAsync") createDeactiveUsingPOSTAsync

> Deactivates service for one or more devices.


```java
void createDeactiveUsingPOSTAsync(
        final CarrierDeactivateRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Deactivate state |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    CarrierDeactivateRequest request = new CarrierDeactivateRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createDeactiveUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="update_custom_fields_using_put_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.updateCustomFieldsUsingPUTAsync") updateCustomFieldsUsingPUTAsync

> Updates one or more custom field values for devices.


```java
void updateCustomFieldsUsingPUTAsync(
        final CustomFieldsUpdateRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    CustomFieldsUpdateRequest request = new CustomFieldsUpdateRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.updateCustomFieldsUsingPUTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="add_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.addUsingPOSTAsync") addUsingPOSTAsync

> Adds up to 200 new devices, without provisioning lines of service for them.


```java
void addUsingPOSTAsync(
        final AddDevicesRequest request,
        final String vZM2MToken,
        final APICallBack<List<AddDevicesResponseMessage>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Devices to Add |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    AddDevicesRequest request = new AddDevicesRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.addUsingPOSTAsync(request, vZM2MToken, new APICallBack<List<AddDevicesResponseMessage>>() {
        public void onSuccess(HttpContext context, List<AddDevicesResponseMessage> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_active_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.DevicesController.createActiveUsingPOSTAsync") createActiveUsingPOSTAsync

> Activates service for one or more devices.


```java
void createActiveUsingPOSTAsync(
        final CarrierActivateRequest request,
        final String vZM2MToken,
        final APICallBack<RequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Activate state |
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |


#### Example Usage

```java
try {
    CarrierActivateRequest request = new CarrierActivateRequest();
    String vZM2MToken = "VZ-M2M-Token";
    // Invoking the API call with sample inputs
    devices.createActiveUsingPOSTAsync(request, vZM2MToken, new APICallBack<RequestResponse>() {
        public void onSuccess(HttpContext context, RequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)

### <a name="callbacks_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.example.controllers.CallbacksController") CallbacksController

#### Get singleton instance

The singleton instance of the ``` CallbacksController ``` class can be accessed from the API Client.

```java
CallbacksController callbacks = client.getCallbacks();
```

#### <a name="delete_unregister_callback_using_delete_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.CallbacksController.deleteUnregisterCallbackUsingDELETEAsync") deleteUnregisterCallbackUsingDELETEAsync

> Stops the platform from sending callback messages for the specified account and service.


```java
void deleteUnregisterCallbackUsingDELETEAsync(
        final String vZM2MToken,
        final String aname,
        final String sname,
        final APICallBack<CallbackActionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |
| sname |  ``` Required ```  | Service name |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
String aname = "aname";
String sname = "sname";
// Invoking the API call with sample inputs
callbacks.deleteUnregisterCallbackUsingDELETEAsync(vZM2MToken, aname, sname, new APICallBack<CallbackActionResponse>() {
    public void onSuccess(HttpContext context, CallbackActionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="create_register_callback_using_post_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.CallbacksController.createRegisterCallbackUsingPOSTAsync") createRegisterCallbackUsingPOSTAsync

> Registers a URL where an account will receive RESTFul messages from a platform callback service.


```java
void createRegisterCallbackUsingPOSTAsync(
        final String vZM2MToken,
        final String aname,
        final RegisterCallbackRequest request,
        final APICallBack<CallbackActionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |
| request |  ``` Required ```  | Request |


#### Example Usage

```java
try {
    String vZM2MToken = "VZ-M2M-Token";
    String aname = "aname";
    RegisterCallbackRequest request = new RegisterCallbackRequest();
    // Invoking the API call with sample inputs
    callbacks.createRegisterCallbackUsingPOSTAsync(vZM2MToken, aname, request, new APICallBack<CallbackActionResponse>() {
        public void onSuccess(HttpContext context, CallbackActionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



#### <a name="list_callbacks_using_get_async"></a>![Method: ](http://apidocs.io/img/method.png "com.example.controllers.CallbacksController.listCallbacksUsingGETAsync") listCallbacksUsingGETAsync

> Returns the name and endpoint URL of all callback listening services registered for a given account.


```java
void listCallbacksUsingGETAsync(
        final String vZM2MToken,
        final String aname,
        final APICallBack<List<Callback>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| vZM2MToken |  ``` Required ```  | M2M-MC Session Token |
| aname |  ``` Required ```  | Account name |


#### Example Usage

```java
String vZM2MToken = "VZ-M2M-Token";
String aname = "aname";
// Invoking the API call with sample inputs
callbacks.listCallbacksUsingGETAsync(vZM2MToken, aname, new APICallBack<List<Callback>>() {
    public void onSuccess(HttpContext context, List<Callback> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error Response |



[Back to List of Controllers](#list_of_controllers)



