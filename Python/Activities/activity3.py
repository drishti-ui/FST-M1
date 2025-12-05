print("Rock-Paper-Scissors Game! with 2 players")

player1 = input("Player 1, enter Rock, Paper, or Scissors: ").lower()
player2 = input("Player 2, enter Rock, Paper, or Scissors: ").lower()

choices = ["rock", "paper", "scissors"]

if player1 not in choices or player2 not in choices:
    print("Invalid input! Enter Rock, Paper, or Scissors only.")
else:
    if player1 == player2:
        print("It's a tie!")
    elif (player1 == "rock" and player2 == "scissors") or \
         (player1 == "scissors" and player2 == "paper") or \
         (player1 == "rock" and player2 == "paper"):
        print("Player 1 wins!")
    else:
        print("Player 2 wins!")
