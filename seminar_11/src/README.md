### Composite
> keywords: `groups`, `can be grouped`, `grouping`, `hierarchy`

#### Story:
Create the possibility that the players and the game should be able to handle
groups of characters:
- multiple players or NPCs can be grouped together
- groups can grow by including other groups or individual 

!!! both leaf and component implement *the same interface*
-> if you have multiple interfaces, you need to **reunite** them

### Observer
> keywords: `reacting to an *event*`

#### Story: 
During the game, the client may lose the connection to the 
server for various reasons. When this happens, the different modules 
in the game must react accordingly:
- the game instance must be saved on the client
- character attributes must be saved
- the gamer must be notified
- the connection must be retried

### Facade
> keywords: ``
