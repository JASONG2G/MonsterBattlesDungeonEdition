package com.objectivemonsters.util;


import java.util.Scanner;

/**
 * <p>
 * General-purpose prompter that delegates to a {@code Scanner}, which
 * must be provided in the constructor.  The {@code Scanner} passed to the constructor
 * must be initialized by the client, and allows for console-based or file-based for testing.
 * </p>
 * <pre>
 * <code>
 *     // To use with a human user at the console:
 *     Prompter prompter = new Prompter(new Scanner(System.in));
 *
 *     // use for automated unit testing without human inputs:
 *     Prompter prompter = new Prompter(new Scanner(new File("inputs.txt")));
 * </code>
 * </pre>
 *
 * @author Cody Cronberger
 * @version 1.0
 */
public class Prompter {

    private Scanner scanner;

    /**
     * Creates a {@code Scanner}-based prompter object, that delegates to the {@code Scanner} for all input
     * @param scanner delegate object used by this prompter for reading input.
     */
    public Prompter(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Outputs provided text.  Simply calls {@code System.out.println(info)}.
     * @param messages Any informative text the game wishes to display to the user.
     */
    public void info(String messages) {
        System.out.println(messages);
    }

    /**
     * Prompts for input, and returns the line of text entered, as a string.
     * @param promptMessage prompt message to display to user.
     * @return the input provided from the user
     */
    public String prompt(String promptMessage) {
        System.out.print(promptMessage);
        return scanner.nextLine();
    }

    /**
     * <p>
     * Prompts for input, validates it against the regex pattern provided, and returns
     * the line of text entered, as a string.  If the input does not match the pattern,
     * the error message text is displayed, and then the prompt text is displayed again.
     * The input is validated against the regex pattern via {@code String.matches()}.
     * </p>
     *
     * <p>
     * The prompt text and error message text are output verbatim, exactly as provided.
     * To add a blank line or two between the user input line, the error message line,
     * and the follow-on user prompt, just include {@code "\n"} in the {@code retryText} value,
     * as appropriate.  For example:
     * </p>
     *
     * <pre>
     * <code>
     *     prompter.prompt("Please enter your age: ", "\\d+", "\nThat is not a valid age!\n");
     * </code>
     * </pre>
     *
     * @param promptText prompt message.
     * @param pattern regex pattern, used to validate the input string.
     * @param retryText error message displayed when input string does not match regex pattern.
     * @return the line of text that was input, as a string.
     */
    public String prompt(String promptText, String pattern, String retryText) {
        String response = null;
        boolean validResponse = false;

        while (!validResponse) {
            System.out.print(promptText);
            response = scanner.nextLine();
            validResponse = response.matches(pattern);
            if (!validResponse) {
                System.out.println(retryText);
            }
            else {
                break;
            }
        }
        return response;
    }
}
