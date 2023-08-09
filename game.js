const rockButton = document.getElementById("rock-btn");
const paperButton = document.getElementById("paper-btn");
const scissorsButton = document.getElementById("scissors-btn");
const resetButton = document.getElementById("reset-btn");
const resultDiv = document.getElementById("result");
let playerScore = 0;
let computerScore = 0;

function getComputerChoice() {
  const randomNumber = Math.floor(Math.random() * 3);
  switch (randomNumber) {
    case 0:
      return "Rock";
    case 1:
      return "Paper";
    case 2:
      return "Scissors";
  }
}

function getResult(player, computer) {
  if (player == computer) {
    return "tie";
  } else if (
    (player == "Rock" && computer == "Scissors") ||
    (player == "Paper" && computer == "Rock") ||
    (player == "Scissors" && computer == "Paper")
  ) {
    return "win";
  } else {
    return "lose";
  }
}

function updateScore(result) {
  if (result == "win") {
    playerScore++;
  } else if (result == "lose") {
    computerScore++;
  }
}

function displayResult(result) {
  resultDiv.textContent = `You ${result}! Player score: ${playerScore}, Computer score: ${computerScore}`;;
}

rockButton.addEventListener("click", function () {
  const playerChoice = "Rock";
  const compuerChoice = getComputerChoice();
  const result = getResult(playerChoice, compuerChoice);
  updateScore(result);
  displayResult(result);
});

paperButton.addEventListener("click", function () {
  const playerChoice = "Paper";
  const compuerChoice = getComputerChoice();
  const result = getResult(playerChoice, compuerChoice);
  updateScore(result);
  displayResult(result);
});
scissorsButton.addEventListener("click", function () {
  const playerChoice = "Scissors";
  const compuerChoice = getComputerChoice();
  const result = getResult(playerChoice, compuerChoice);
  updateScore(result);
  displayResult(result);
});
resetButton.addEventListener("click", function () {
  playerScore = 0;
  computerScore = 0;
  resultDiv.textContent = "";
});
