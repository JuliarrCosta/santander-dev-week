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
    - balance: Number
    - limit: Number
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Number
  }

  class News {
    - icon: String
    - description: String
  }

  Person "1" *-- "1" Account
  Person "1" *-- "N" Feature
  Person "1" *-- "N" Card
  Person "1" *-- "1" News
```
