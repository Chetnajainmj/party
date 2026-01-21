import org.moqui.entity.EntityValue
if(!partyId){
    throw new IllegalArgumentException("Required Parameter partyId is missing")
}
if(!firstName){
    throw new IllegalArgumentException("Required Parameter firstName is missing")
}
if(!lastName){
    throw new IllegalArgumentException("Required Parameter lastName is missing")
}
EntityValue party=ec.entity.find("party.entity.Party").condition("partyId",partyId).one()
if(!party){
    throw new IllegalArgumentException("Party with partyId [${partyId}] is not found")
}
if(!party.partyTypeEnumId.equals("PERSON")){
    throw new IllegalArgumentException("Party with partyId [${partyId}] is not Person It is Party Group")
}
EntityValue person=ec.entity.makeValue("party.entity.Person")
person.partyId=partyId
person.firstName=firstName
person.lastName=lastName

if(dateOfBirth){
    person.dateOfBirth=dateOfBirth
}
person.setFields(context,true,null,null)
person.create()
responseMessage="Person ${context.firstName} ${lastName} created successfully!"


