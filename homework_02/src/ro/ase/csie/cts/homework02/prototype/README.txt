Pattern used: Prototype & Prototype Registry

Advantages:
    - Quickly create identical objects (values) by cloning
    - Avoid the explicit call of the constructor
    - A collection of prototypes can be built to be used to generate new objects

Disadvantages:
    - Cloning complex objects that have circular references might be very tricky
    - Additional attention should be directed at the issue of potential shallow copies
    - First reference to the registry takes a long time to execute, may cause issues
