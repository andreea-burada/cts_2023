Pattern used: Builder

Advantages:
    - You can construct objects step-by-step, defer construction steps or run steps recursively
    - Single Responsibility Principle. You can isolate complex construction code from the business logic of the product
    - The object creation algorithm is flexible because the client chooses which parts to create

Disadvantages:
    - The overall complexity of the code increases since the pattern requires creating multiple new classes
    - Creating objects requires more attention since attributes can be omitted
    - Some types of builder implementation need to copy all attributes of the object class and break the WET principle of Clean Code
