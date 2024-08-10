# Encrypt Message Application

## Overview

The Encrypt Message Application is a simple Java application that encrypts a user-provided message using a Caesar cipher. The application uses a GUI for user interaction, where the message is entered, encrypted, and then displayed using `JOptionPane`.

## Project Structure

- **`EncryptMessage.java`**: The main class that implements the encryption logic. It takes user input via a dialog, applies the Caesar cipher encryption, and displays the encrypted message.

## Prerequisites

- Java Development Kit (JDK) 8 or later

## How It Works

1. **User Input:**
   - The application prompts the user to enter a message via a `JOptionPane` input dialog.

2. **Encryption Process:**
   - The entered message is converted to lowercase.
   - The application uses a Caesar cipher with a shift of 3 to encrypt the message.
   - Each letter is shifted 3 positions forward in the alphabet, while non-letter characters remain unchanged.

3. **Displaying the Result:**
   - The encrypted message is converted from a character array to a string and displayed in a `JOptionPane` message dialog.

## Example

1. When the user inputs the message "hello", the application will display "khoor" as the encrypted result.

2. The Caesar cipher encryption works as follows:
   - 'h' -> 'k'
   - 'e' -> 'h'
   - 'l' -> 'o'
   - 'l' -> 'o'
   - 'o' -> 'r'

## Known Issues

- The current implementation only supports alphabetic characters for encryption and does not handle uppercase letters or special characters.

## Future Enhancements

- Extend support for uppercase letters and special characters.
- Allow the user to specify the shift value for the Caesar cipher.
- Add decryption functionality to revert encrypted messages back to their original form.


Feel free to update the contact information and any additional details as needed!
