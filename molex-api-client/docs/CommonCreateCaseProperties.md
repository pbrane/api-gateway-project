# CommonCreateCaseProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the TAC Case create was requested |  [optional]
**requestorOrganization** | **String** | The Organization that is requesting the TAC Case |  [optional]
**requestorFirstName** | **String** |  |  [optional]
**requestorLastName** | **String** |  |  [optional]
**requestorEmail** | **Object** |  |  [optional]
**requestorPhone** | **Object** |  |  [optional]
**installationCountry** | **String** |  |  [optional]
**networkStatus** | [**NetworkStatusEnum**](#NetworkStatusEnum) |  |  [optional]
**businessImpact** | **String** | The impact to the customer&#x27;s business associated with this Case |  [optional]
**subject** | **String** | Subject of TAC Case |  [optional]
**problemDescription** | **String** | Description of the issue in this case |  [optional]
**productName** | **String** | The name of the product associated with this TAC Case |  [optional]
**productSerialNumber** | **String** | The serial number of the product associated with this TAC Case |  [optional]
**productFirmwareVersion** | **String** | The version number of the product associated with this TAC Case |  [optional]
**productSoftwareVersion** | **String** | The version number of the product associated with this TAC Case |  [optional]
**outageStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the outage associated with this case was detected |  [optional]
**outageRecoveryTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the outage associated with this case was recovered |  [optional]
**customerTrackingNumber** | **String** | A Reference to the customer&#x27;s issue associated with this Case |  [optional]

<a name="NetworkStatusEnum"></a>
## Enum: NetworkStatusEnum
Name | Value
---- | -----
PRODUCTION | &quot;Production&quot;
TEST | &quot;Test&quot;
DEVELOPMENT | &quot;Development&quot;
