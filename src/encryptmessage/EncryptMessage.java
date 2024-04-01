
package encryptmessage;

import javax.swing.JOptionPane;

public class EncryptMessage {

    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Enter a message: ").toLowerCase();

        char[] plainMsg = userInput.toCharArray();
        char[] encrypted = new char[userInput.length()];
        
        for(int x=0; x<plainMsg.length; x++){
       
            if(Character.isLetter(plainMsg[x]))
            {
                 char base = Character.isUpperCase(plainMsg[x]) ? 'A' : 'a';
                encrypted[x] = (char)(((plainMsg[x] - base + 3) % 26) + base);
            }
            else
               {
                  encrypted[x] = plainMsg[x];
               }
        }
       
        JOptionPane.showMessageDialog(null, new String(encrypted));
    }  
}
