```mermaid
classDiagram
    SimpleConnectionMaker <|--UserDao
    SimpleConnectionMaker: makeNewConnection()
    class UserDao{
        simpleConnectionMaker
        add()
        get()
    } 

```