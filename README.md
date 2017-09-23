# Web Engineering 2016

This repository contains samples used during the [Business Informatic Group's](http://www.big.tuwien.ac.at) Web Engineering lecture series 2016 at [Vienna University of Technology](http://www.tuwien.ac.at).

# Web Services talk

In the Web Services talk we have introduced SOAP/WSDL Web Services and RESTful Web Services. The following two projects provide simple Java projects for SOAP/WSDL and RESTful Web Services.

## Arithmetic Web Service

Contains a simple SOAP/WSDL Arithmetic Service. Simply launch the application's main class `at.ac.tuwien.big.we.webservice.ArithmeticService`and access the WSDL under `http://localhost:8080/arithmeticservice?wsdl`

Use [SOAP-UI](http://www.soapui.org) in order to send sample requests to the Web Service.

## Big Bid Board

See the [BIG Bid Board GitHub project](https://github.com/pliegl/we16-bid-board) for further details.


# JPA/Hibernate talk

In the JPA/Hibernate talk we have introduced the basics of Object Relation Mapping (ORM) and the implementation of JPA and Hibernate.

## JPA Sample

An example using JPA and Hibernate. The application does not contain any UI logic, but concentrates on how JPA relationships are correctly modeled.

The following DB structure is used for the samples:

![Sample ER diagram](https://github.com/pliegl/we2014/blob/master/img/Sample_ER_Diagram.jpg?raw=true "Sample ER diagram")
