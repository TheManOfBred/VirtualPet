# Virtual Pet Simulator

Congratulations! You just adopted a brand new pet. The species of the pet is up to you, but you are going to use your coding skills to (hopefully) keep your pet alive, fed, and happy.

Your pet has three statistics:

- **Happiness:** Starts at 5.
- **Hunger:** Starts at 5.
- **Energy:** Starts at 5.

Your goal is to get your pet's **happiness to 15** without letting its **hunger reach 10** or its **energy drop to 0**.

## Game Rules

Every turn, the program displays the pet's statistics and asks the player to choose an action.

| Action | Happiness | Hunger | Energy |
|---|---:|---:|---:|
| 1. Feed pet | +1 | -3 | No change |
| 2. Play with pet | +3 | +2 | -2 |
| 3. Let pet sleep | -1 | +1 | +3 |
| 4. Give pet a bath | +2 | +1 | -1 |
| 5. Quit | Ends game | — | — |

## Example Gameplay

```text
Welcome to Virtual Pet Simulator!
Your pet's name is Bucky the Beaver.

-------------------------
Happiness: 5
Hunger: 5
Energy: 5
-------------------------

What would you like to do?
1. Feed
2. Play
3. Sleep
4. Bath
5. Quit

Enter your choice: 2

Bucky the Beaver had a great time playing!

-------------------------
Happiness: 8
Hunger: 7
Energy: 3
-------------------------

What would you like to do?
1. Feed
2. Play
3. Sleep
4. Bath
5. Quit

Enter your choice: 3

Bucky the Beaver is taking a nap!
...
```

## Programming Requirements

Your program must:

1. Use a `while` loop to keep the game running.
2. Use an `if / else if / else` statement to determine which action the player selected.
3. Update the pet's statistics after each action.
4. Display updated statistics each turn.
5. End the game when one of these conditions occurs:
   - **Happiness reaches 15 or higher:** YOU WIN!
   - **Hunger reaches 10 or higher:** Your pet ran away looking for food!
   - **Energy reaches 0 or lower:** Let's just say that your parents took your pet to a farm. The less you know the better.
   - **The player chooses 5:** Goodbye!
6. Display an error message if the player enters an invalid choice.

## Grading Rubric (30 Points)

| Requirement | Points |
|---|---:|
| Correctly implements a `while` loop | 5 |
| Correctly implements `if / else if / else` | 5 |
| All four actions correctly update statistics | 8 |
| Displays updated statistics each turn | 4 |
| Correctly ends the game with appropriate messages | 5 |
| Handles invalid user input | 3 |
| **Total** | **30** |

## Extra Challenges

### Level 1: Name Your Pet

Let the player choose their pet's name at the beginning.

### Level 2: Random Events

Use `Math.random()` to make something unexpected happen occasionally. Maybe the pet finds food, gets sick, or discovers a magical donut.

### Level 3: Secret Action

Add option 6 for a secret action with a ridiculous outcome.

## Submission Requirements

- Your Java file must be named `VirtualPet.java`, and the class must be named `VirtualPet`. You can clone or fork this repository: [VirtualPet starter repository](https://github.com/benkrokower/VirtualPet).
- Publish your code to GitHub in a **public repository named `VirtualPet`**.
- Do not change any of the requirements above, including the starting statistics, actions, and numbers.
