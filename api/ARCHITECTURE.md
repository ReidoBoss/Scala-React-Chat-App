# ARCHITECTURE OVERVIEW

## Overview

The system is designed with **MVC (without View)**, **Domain-Driven Design (DDD)**, and the **Command-Event Pattern** while leveraging **Apache Pekko Typed(Akka) Actors** for concurrency. I will be using **Typed Pekko** to promote _type-safety_ development.

## Folder Structure

```
/chat-app
│── app/
│   ├── application/
│   │   ├── commands/
│   │   ├── command_handlers/
│   │   ├── events/
│   │   ├── event_handlers/
│   ├── controllers/
│   ├── domain/
│   │   ├── aggregates/
│   │   ├── models/
│   ├── infrastructure/
│   │   ├── actors/
│   │   ├── repositories/

```

## Architectural Patterns

1. **Layered Architecture (MVC without View)**

2. **Domain-Driven Design (DDD)**

3. **Command-Event Pattern**

4. **Actor Model (Event-Driven Architecture with Pekko/Akka)**

5. **Repository Pattern**

6. **Event-Driven Architecture (EDA)**
