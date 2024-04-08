# Wikimedia-data-consumer
Real-Time Wikimedia Data Consumer with Apache Kafka and Spring Boot 3

## Description
This repository hosts a microservices-based Java application developed with Spring Boot, designed to consume real-time data from Wikimedia using Apache Kafka. By leveraging Kafka's event streaming capabilities and Spring Boot's flexibility, the application enables seamless processing and persistence of Wikimedia data into a database.

## Key Features:
* Microservices Architecture: The application is built using a microservices architecture, allowing for modularity, scalability, and independent deployment of individual components.

* Apache Kafka Integration: The application seamlessly integrates with Apache Kafka to consume real-time data streams from Wikimedia, ensuring low-latency and high-throughput processing.

* Data Persistence: Consumed Wikimedia data is efficiently persisted into a database by the consumer microservice, ensuring data durability and reliability.

* Real-Time Processing: Leveraging Kafka's event streaming capabilities, the producer microservice processes incoming data in real-time.

* Scalability: The microservices architecture allows for horizontal scaling of individual components to handle increasing data volumes and processing requirements.

* Easy Setup and Deployment: Comprehensive documentation and setup instructions are provided, enabling users to quickly deploy and run the microservices in their local environment.

## Getting Started:
To get started with the application, follow these steps:

1. Clone this repository to your local machine.
2. Ensure you have Apache Kafka and a compatible database set up (preferrably MySQL).
3. Configure the microservices' properties with your Kafka and database connection details.
4. Build and run the microservices using Maven as your build tool.

## Usage:
Once the microservices are up and running, they will automatically start consuming real-time data from Wikimedia via BackgroundEventSource(okhttp-eventsource) and Apache Kafka. You can monitor the data processing and persistence in the logs or database.
