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
│   ├── domain/
│   │   ├── aggregates/
│   │   ├── models/
│   ├── infrastructure/
│   │   ├── actors/
│   │   ├── repositories/
│   ├── interfaces/
│   │   ├── controllers/
```
