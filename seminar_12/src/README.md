### Strategy
> `keywords`: `user can change state of object`, `user preference`
#### Story
Players can pay their monthly subscription in different ways (PayPal, bank account, crypto).
The payment is done automatically each month based on the user preferences.

Find a way to implement the payment action based on user settings without asking 
the player each month. Take into account new payment methods can be added in the future

### State
> `keywords`: `state`, `the values of the object ...`

!!! `state` = **the collection of values of an object's attributes**
#### Story
Game characters actions are affected by their state:
- the gameplay is different
- the action effects are different
- the way the superhero moves is affected by its state (life points)

### Command
> `keywords`: `without intefering`, `async`
#### Story
The game client must perform tasks in the background without interfering with the development
of the game (without blocking or slowing it down):
- customer data back-up
- receive updates for the forum
- update 3D models in the silent mode (during the game)
- a solution must be found through which these tasks can be executed without affecting the
execution of the game

These routines can be executed in any order during the gameplay.
