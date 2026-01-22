# party


## Overview
The *Party component* is a custom Moqui component used to manage *persons, organizations, and their contact mechanisms*.  
It demonstrates Moqui entity modeling, enum usage, relationships, and data import using the Moqui Tools UI.

## Entities

### Party
Represents any person or organization.

| Field | Type | Description |
|-----|-----|-------------|
| partyId | id | Primary Key |
| partyTypeEnumId | id | PERSON / PARTY_GROUP |
| createdDate | date-time | Automatically set |

---

### Person
Stores details of an individual.

| Field | Type |
|-----|-----|
| partyId | id (PK, FK) |
| firstName | text |
| lastName | text |
| dateOfBirth | date |

---

### PartyGroup
Stores organization or company details.

| Field | Type |
|-----|-----|
| partyId | id (PK, FK) |
| groupName | text |
| description | text |

---

### ContactMech
Stores contact information.

| Field | Type |
|-----|-----|
| contactMechId | id (PK) |
| contactMechTypeId | id |
| infoString | text |
| createdDate | date-time |

---

### PartyContactMech
Links Party and ContactMech (many-to-many).

*Primary Key:*
- partyId
- contactMechId
- fromDate

---

## Enum Types

### PartyType
- PERSON
- PARTY_GROUP

### ContactMechType
- EMAIL
- TELECOM_NUMBER
- POSTAL_ADDRESS

## Custom screen with title and show list/table of all party records and mount screen
1 Define new screen

2 Mount screen

3 Test screen in moqui

## Custom form for create party entity
1 Add create form party entity

2 Test forms in moqui

## Custom Person creation service

1 Define new service

2 Implement service logic

3 Expose service as REST API

4 Test service in moqui UI

5 Test REST API


