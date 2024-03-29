# Notification Service Initial Analysis and Specification

## Task:

Create a notification sending system.

## Client Requirements:

1. The system needs to be able to send notifications via several different channels (email,
sms, slack) and be easily extensible to support more channels in the future.

2. The system needs to be horizontally scalable.

3. The system must guarantee an "at least once" SLA for sending the message.

4. The interface for accepting notifications to be sent can be chosen on your own discretion.

## Requirements Analysis & Breakdown

**Goal:**
Build MVP prototype with minimum set of required functionality to send notifications on three channels.

- Tech stack based on requirements:
    - Java
    - Spring Boot

### Functional requirements

**Research, filter and prioritize the following according to importance and time constraints:**

- Requirement `1.` analysis and breakdown:
    - Build extensible hierarchical data model
        - Will build towards and interface.
        - This will allow the system to be easily extensible to support more channels in the future.
    - Build required services and business logic to support multi-channel functionality
        - Will build a service hierarchy towards and interface.
        - This will allow the system to be easily extensible to support more channels in the future.
        - Interfaces:
            - Inbound (Trigger/Consumer):
                - This will be an Interface which can have multiple implementations which can be used to either trigger/send a notification or consume a notification from a source.
                    - In the future this can be extended to consume notifications from inbound queue systems or User Interface.
                    - For the purposes of the scope of this task this will have one implementation which will be in the form of REST endpoints to trigger/send a notification.
            - Outbound (Sender/Forwarder):
                - This will be an Interface which can have multiple implementations which can be used to either forward/send a notification to a specific channel.
                    - In the future this can be extended to push notifications etc.
                    - For the purposes of the scope of this task this will have three implementations - email, sms and slack. 
    - Additional considerations:
        - REST API
        - JSON serialisation
        - Testing
            - Unit Testing
            - Integration Testing
            - Load Testing
        - Security
            - Encapsulation
            - Immutability
        - Exception handling
        - Thread safe
        - Performance
            - Research if custom thread pool is needed for vertical performance scalability.
        - Logging
        - Research if database persistence of notifications and timestamp is required
        - Distributed Tracing
        - Design Patterns - Builder, Factory, ...
        - No graphical User Interface (UX) required

- Requirement `2.` analysis and breakdown:    
    - Research if containerization with Docker is required, so it can be scaled in Kubernetes or Cloud.

- Requirement `3.` analysis and breakdown:
    - Implement "at least once" logic to guarantee SLA.
    - Initial idea - `backoff and retry logic`.
        - Research if `backoff and retry logic` is the best way.
        
### Non-functional requirements

- Performance

- Documentation
 - System Design Diagram
 - Further development
    - Swagger
    - More resilience and availability through adding queue technologies both inbound and outbound, such as:
        - Kafka
        - AWS SNS + SQS
        - JMS
        - RabbitMQ

***All of the outlined requirements above are subject to change and will be considered based on importance and time constraints.***

***All of the outlined requirements above will be considered, but only the most important ones will be implemented based on time constraints.***
