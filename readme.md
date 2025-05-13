Kafka with Spring Boot using docker-compose

Prior understanding to Kafka, we should understand the problem Kafka try to solve. In simple Client-Server architecture source machine needs to create a connection with target machine, however an enterprise or distributed architecture can have multiple sources and target machines. Thus each source will increase connection load on source machines.

[diagram1](docs/img/diagram1.png)

Kafka takes the ownership to handle the connection management and act as middleware system between source and target systems. Thus instead of direct load on target, each source can make connection with Kafka.

[diagram2](docs/img/diagram2.png)

Kafka is a distributed event streaming

Wait what do we mean by distributed event streaming?

Kafka broker(server) distributes data into multiple machines, even makes the copies(Replicas) of data in different machine, so that if one machine will down, still data can be access from replica. Below diagram illustrate the base idea which is self explanatory.

[diagram3](docs/img/diagram3.png)

Conclusion Diagram on Kafka Terminologies

Instead of making a long blog, I have tried to conclude the understanding in illustrative way, as our agenda is to create and run a Kafka cluster with interactive UI using spring boot and docker compose. Still an image can help others to understand the terminologies.

[diagram4](docs/img/diagram4.png)

Producer Consumer communication illustrative understanding
[diagram5](docs/img/diagram5.png)

Consumer Group and Offsets

[diagram6](docs/img/diagram6.png)