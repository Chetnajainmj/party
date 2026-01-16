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
