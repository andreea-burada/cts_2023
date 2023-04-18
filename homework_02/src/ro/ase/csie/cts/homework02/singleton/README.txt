Pattern used: Singleton

Advantages:
    - Strict control of instantiations of a class – only one Drone Connection
    - Does not allow duplication of objects
    - Easy to implement, simple design

Disadvantages:
    - The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other
    - The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times
    - Can generate a bottleneck that will affect the app performance
