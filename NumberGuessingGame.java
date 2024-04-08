import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame {
    private JTextField guessField;
    private JButton guessButton;
    private JLabel messageLabel;

    private int randomNumber;
    private int attemptsLeft;

    public NumberGuessingGame() {
        setTitle("Number Guessing Game");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        messageLabel = new JLabel("Enter a number between 1 and 100:");

        add(messageLabel);
        add(guessField);
        add(guessButton);

        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        attemptsLeft = 5;

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    private void checkGuess() {
        int guess = Integer.parseInt(guessField.getText());
        attemptsLeft--;

        if (guess == randomNumber) {
            JOptionPane.showMessageDialog(this, "Congratulations! You've guessed the number " + randomNumber + " correctly!", "Winner", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (attemptsLeft == 0) {
            JOptionPane.showMessageDialog(this, "Sorry, you've run out of tries! The correct number was: " + randomNumber, "Game Over", JOptionPane.ERROR_MESSAGE);
            resetGame();
        } else if (guess < randomNumber) {
            messageLabel.setText("Too low! Attempts left: " + attemptsLeft);
        } else {
            messageLabel.setText("Too high! Attempts left: " + attemptsLeft);
        }

        guessField.setText("");
        guessField.requestFocus();
    }

    private void resetGame() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        attemptsLeft = 5;
        messageLabel.setText("Enter a number between 1 and 100:");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberGuessingGame().setVisible(true);
            }
        });
    }
}
