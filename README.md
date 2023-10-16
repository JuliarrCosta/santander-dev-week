# Santander BootCamp - Projeto final 

## Diagrama de classes

``` mermaid
classDiagram
  class Person {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: String
    - limit: String
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: String
  }

  class News {
    - icon: String
    - description: String
  }

  Person -- Account
  Person -- Feature
  Person -- Card
  Person -- News
```
