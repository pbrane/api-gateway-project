# swagger-java-client

RMA_RestAPI_Design_1
- API version: 0.0.6
  - Build date: 2024-08-29T19:29:38.424806759Z[GMT]

Customer Requirements from Excel Document RMA_RestAPI_Design 1.xlsx


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        NoteCreate body = new NoteCreate(); // NoteCreate | The TroubleTicket to be created
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        try {
            Note result = apiInstance.createRmaCaseNote(body, caseNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#createRmaCaseNote");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        RmaCaseCreate body = new RmaCaseCreate(); // RmaCaseCreate | The TroubleTicket to be created
        try {
            RmaCase result = apiInstance.createTacRma(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#createTacRma");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        Integer offset = 56; // Integer | Requested index for start of items to be provided in response
        Integer limit = 56; // Integer | Requested number of items to be provided in response
        try {
            List<Attachment> result = apiInstance.getRmaCaseAttachments(caseNumber, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#getRmaCaseAttachments");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        Integer offset = 56; // Integer | Requested index for start of items to be provided in response
        Integer limit = 56; // Integer | Requested number of items to be provided in response
        OffsetDateTime createdFrom = new OffsetDateTime(); // OffsetDateTime | Beginning date portion of a date range query to search for a matching set of items
        OffsetDateTime createdTo = new OffsetDateTime(); // OffsetDateTime | Ending date portion of a date range query to search for a matching set of items
        OffsetDateTime createdSince = new OffsetDateTime(); // OffsetDateTime | Retrieve the set of items created since this date
        try {
            List<Note> result = apiInstance.getRmaCaseNotes(caseNumber, offset, limit, createdFrom, createdTo, createdSince);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#getRmaCaseNotes");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        String fields = "fields_example"; // String | Comma-separated properties to be provided in response
        Integer offset = 56; // Integer | Requested index for start of items to be provided in response
        Integer limit = 56; // Integer | Requested number of items to be provided in response
        OffsetDateTime createdFrom = new OffsetDateTime(); // OffsetDateTime | Beginning date portion of a date range query to search for a matching set of items
        OffsetDateTime createdTo = new OffsetDateTime(); // OffsetDateTime | Ending date portion of a date range query to search for a matching set of items
        OffsetDateTime createdSince = new OffsetDateTime(); // OffsetDateTime | Retrieve the set of items created since this date
        TacCaseStatus caseStatus = new TacCaseStatus(); // TacCaseStatus | Retrieve the set of cases with this status
        String vendorRmaNumber = "vendorRmaNumber_example"; // String | Retrieve the set of cases with this RMA number
        Boolean includeNotes = false; // Boolean | Use this flag to include Case Notes
        try {
            List<RmaCase> result = apiInstance.listRmaCases(fields, offset, limit, createdFrom, createdTo, createdSince, caseStatus, vendorRmaNumber, includeNotes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#listRmaCases");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        String fields = "fields_example"; // String | Comma-separated properties to be provided in response
        Boolean includeNotes = false; // Boolean | Use this flag to include Case Notes
        try {
            RmaCase result = apiInstance.retrieveRmaCase(caseNumber, fields, includeNotes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#retrieveRmaCase");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        String id = "id_example"; // String | The unique identifier of an entity.
        try {
            List<Attachment> result = apiInstance.retrieveRmaCaseAttachment(caseNumber, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#retrieveRmaCaseAttachment");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        String id = "id_example"; // String | The unique identifier of an entity.
        try {
            Note result = apiInstance.retrieveRmaCaseNote(caseNumber, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#retrieveRmaCaseNote");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        RmaCase body = new RmaCase(); // RmaCase | Updated the associated RMA Case
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        try {
            apiInstance.updateRmaCase(body, caseNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#updateRmaCase");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        Note body = new Note(); // Note | Updated the associated TAC Case
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        String id = "id_example"; // String | The unique identifier of an entity.
        try {
            apiInstance.updateRmaCaseNote(body, caseNumber, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#updateRmaCaseNote");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.RmaCaseApi;

import java.io.File;
import java.util.*;

public class RmaCaseApiExample {

    public static void main(String[] args) {
        
        RmaCaseApi apiInstance = new RmaCaseApi();
        File file = new File("file_example"); // File | 
        String description = "description_example"; // String | 
        String caseNumber = "caseNumber_example"; // String | Identifier of the Case. This may be an alias for the ID of the proxied Case.
        try {
            InlineResponse201 result = apiInstance.uploadRmaCaseAttachment(file, description, caseNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RmaCaseApi#uploadRmaCaseAttachment");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/MolexDev/tac-cases-openapi-3.0/0.0.6*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*RmaCaseApi* | [**createRmaCaseNote**](docs/RmaCaseApi.md#createRmaCaseNote) | **POST** /rmaCases/{caseNumber}/notes | Creates a note assocated with a RMA Case
*RmaCaseApi* | [**createTacRma**](docs/RmaCaseApi.md#createTacRma) | **POST** /rmaCases | Creates an RMA
*RmaCaseApi* | [**getRmaCaseAttachments**](docs/RmaCaseApi.md#getRmaCaseAttachments) | **GET** /rmaCases/{caseNumber}/attachments | Get a list of attachments for a specific RMA case
*RmaCaseApi* | [**getRmaCaseNotes**](docs/RmaCaseApi.md#getRmaCaseNotes) | **GET** /rmaCases/{caseNumber}/notes | Get notes for a specific RMA
*RmaCaseApi* | [**listRmaCases**](docs/RmaCaseApi.md#listRmaCases) | **GET** /rmaCases | List or find RMA Cases
*RmaCaseApi* | [**retrieveRmaCase**](docs/RmaCaseApi.md#retrieveRmaCase) | **GET** /rmaCases/{caseNumber} | Retrieves an RMA Case by ID
*RmaCaseApi* | [**retrieveRmaCaseAttachment**](docs/RmaCaseApi.md#retrieveRmaCaseAttachment) | **GET** /rmaCases/{caseNumber}/attachments/{id} | Retrieves an RMA Case Attachment by ID
*RmaCaseApi* | [**retrieveRmaCaseNote**](docs/RmaCaseApi.md#retrieveRmaCaseNote) | **GET** /rmaCases/{caseNumber}/notes/{id} | Retrieves an RMA Case Note by ID
*RmaCaseApi* | [**updateRmaCase**](docs/RmaCaseApi.md#updateRmaCase) | **PUT** /rmaCases/{caseNumber} | Updates an RMA Case by ID
*RmaCaseApi* | [**updateRmaCaseNote**](docs/RmaCaseApi.md#updateRmaCaseNote) | **PUT** /rmaCases/{caseNumber}/notes/{id} | Updates an RMA Case Note by ID
*RmaCaseApi* | [**uploadRmaCaseAttachment**](docs/RmaCaseApi.md#uploadRmaCaseAttachment) | **POST** /rmaCases/{caseNumber}/attachments | Upload an attachment to a specific RMA case
*TacCaseApi* | [**createTacCase**](docs/TacCaseApi.md#createTacCase) | **POST** /tacCases | Creates a TAC Case
*TacCaseApi* | [**createTacCaseNote**](docs/TacCaseApi.md#createTacCaseNote) | **POST** /tacCases/{caseNumber}/notes | Creates a note assocated with a TAC Case
*TacCaseApi* | [**getTacCaseAttachments**](docs/TacCaseApi.md#getTacCaseAttachments) | **GET** /tacCases/{caseNumber}/attachments | Get a list of attachments for a specific TAC case
*TacCaseApi* | [**getTacCaseNotes**](docs/TacCaseApi.md#getTacCaseNotes) | **GET** /tacCases/{caseNumber}/notes | Get notes for a specific TAC Case
*TacCaseApi* | [**listTacCases**](docs/TacCaseApi.md#listTacCases) | **GET** /tacCases | List or find TAC Cases
*TacCaseApi* | [**retrieveTacCase**](docs/TacCaseApi.md#retrieveTacCase) | **GET** /tacCases/{caseNumber} | Retrieves a TAC Case by ID
*TacCaseApi* | [**retrieveTacCaseAttachment**](docs/TacCaseApi.md#retrieveTacCaseAttachment) | **GET** /tacCases/{caseNumber}/attachments/{id} | Retrieves a TAC Case Attachment by ID
*TacCaseApi* | [**retrieveTacCaseNote**](docs/TacCaseApi.md#retrieveTacCaseNote) | **GET** /tacCases/{caseNumber}/notes/{id} | Retrieves a TAC Case Note by ID
*TacCaseApi* | [**updateTacCase**](docs/TacCaseApi.md#updateTacCase) | **PUT** /tacCases/{caseNumber} | Updates a TAC Case by ID
*TacCaseApi* | [**updateTacCaseNote**](docs/TacCaseApi.md#updateTacCaseNote) | **PUT** /tacCases/{caseNumber}/notes/{id} | Updates a TAC Case Note by ID
*TacCaseApi* | [**uploadTacCaseAttachment**](docs/TacCaseApi.md#uploadTacCaseAttachment) | **POST** /tacCases/{caseNumber}/attachments | Upload an attachment to a specific TAC case

## Documentation for Models

 - [Attachment](docs/Attachment.md)
 - [AttachmentRef](docs/AttachmentRef.md)
 - [AttachmentRefOrValue](docs/AttachmentRefOrValue.md)
 - [CaseNumberAttachmentsBody](docs/CaseNumberAttachmentsBody.md)
 - [CaseNumberAttachmentsBody1](docs/CaseNumberAttachmentsBody1.md)
 - [CaseRelationship](docs/CaseRelationship.md)
 - [CommonCreateCaseProperties](docs/CommonCreateCaseProperties.md)
 - [CommonNoteProperties](docs/CommonNoteProperties.md)
 - [Error](docs/Error.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [Note](docs/Note.md)
 - [NoteCreate](docs/NoteCreate.md)
 - [Quantity](docs/Quantity.md)
 - [RmaCase](docs/RmaCase.md)
 - [RmaCaseCreate](docs/RmaCaseCreate.md)
 - [TacCase](docs/TacCase.md)
 - [TacCaseCreate](docs/TacCaseCreate.md)
 - [TacCaseStatus](docs/TacCaseStatus.md)
 - [TimePeriod](docs/TimePeriod.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

