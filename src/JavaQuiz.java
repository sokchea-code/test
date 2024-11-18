import java.util.Scanner;

        public class JavaQuiz {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Welcome message
                System.out.println("Welcome to the Java Quiz!");

                // Infinite loop to keep presenting the menu until the user chooses to exit
                while (true) {
                    System.out.println("\nPlease select a chapter to take a quiz (1-18) or enter 0 to exit:");
                    System.out.print("Enter Chapter number (1-18) or 0 to Exit: ");
                    int chapterChoice = scanner.nextInt();

                    if (chapterChoice == 0) {
                        System.out.println("Exiting the quiz. Goodbye!");
                        break;  // Exit the program
                    }

                    // Displaying quiz for the selected chapter
                    switch (chapterChoice) {
                        case 1: takeChapter1Quiz(scanner); break;
                        case 2: takeChapter2Quiz(scanner); break;
                        case 3: takeChapter3Quiz(scanner); break;
                        case 4: takeChapter4Quiz(scanner); break;
                        case 5: takeChapter5Quiz(scanner); break;
                        case 6: takeChapter6Quiz(scanner); break;
                        case 7: takeChapter7Quiz(scanner); break;
                        case 8: takeChapter8Quiz(scanner); break;
                        case 9: takeChapter9Quiz(scanner); break;
                        case 10: takeChapter10Quiz(scanner); break;
                        case 11: takeChapter11Quiz(scanner); break;
                        case 12: takeChapter12Quiz(scanner); break;
                        case 13: takeChapter13Quiz(scanner); break;
                        case 14: takeChapter14Quiz(scanner); break;
                        case 15: takeChapter15Quiz(scanner); break;
                        case 16: takeChapter16Quiz(scanner); break;
                        case 17: takeChapter17Quiz(scanner); break;
                        case 18: takeChapter18Quiz(scanner); break;
                        default: System.out.println("Invalid choice, please enter a number between 1 and 18.");
                    }
                }

                scanner.close();
            }

            // Chapter 1: Introduction to Computers, Programs, And Java
            private static void takeChapter1Quiz(Scanner scanner) {
                System.out.println("\nChapter 1: Introduction to Computers, Programs, And Java");
                System.out.println("1. What is bytecode in Java, and how does it differ from machine code?");
                System.out.println("A) Bytecode is the high-level code written by the programmer; machine code is the output of the Java compiler.");
                System.out.println("B) Bytecode is compiled by the Java compiler and is platform-independent, while machine code is specific to the machine's hardware.");
                System.out.println("C) Bytecode is a language used to program the JVM, while machine code is used by the operating system.");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. Which of the following statements is true about Java?");
                System.out.println("A) Java is a low-level language.");
                System.out.println("B) Java is platform-independent.");
                System.out.println("C) Java code is compiled directly into machine code.");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
                System.out.println("\n3. Explain the difference between the print and println methods in Java ?");
                System.out.println("A) print creates a new line after each output, while println does not.");
                System.out.println("B) print displays data and ends on the same line, while println displays data and moves the cursor to the next line.");
                System.out.println("C) print is for debugging only, while println is used for displaying output to the user.");
                System.out.println("D) There is no difference; both print and println function the same way.");
                System.out.print("Enter your answer: ");
                String answer3 = scanner.next();

                if (answer3.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }

            // Chapter 2: Elementary Programming
            private static void takeChapter2Quiz(Scanner scanner) {
                System.out.println("\nChapter 2: Elementary Programming");
                System.out.println("1. Which of the following is the correct way to declare a variable in Java?");
                System.out.println("A) int 1stNumber;");
                System.out.println("B) float price = \"5.99\";");
                System.out.println("C) double interestRate = 0.05;");
                System.out.println("D) string name = \"John\";");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("C")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is C.");
                }

                System.out.println("\n2. What is the result of the expression 10 % 3 in Java?");
                System.out.println("A) 10");
                System.out.println("B) 5");
                System.out.println("C) 1");
                System.out.println("D) 0");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("C")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
                System.out.println("\n3. Which data type would you use to store a single character in Java?");
                System.out.println("A) String");
                System.out.println("B) char");
                System.out.println("C) boolean");
                System.out.println("D) float");
                System.out.print("Enter your answer: ");
                String answer3 = scanner.next();

                if (answer3.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }

            // Chapter 3: Selection
            private static void takeChapter3Quiz(Scanner scanner) {
                System.out.println("\nChapter 3: Selection");
                System.out.println("1. Which of the following operators is used to test if two conditions are both true in Java?");
                System.out.println("A) || ");
                System.out.println("B) == ");
                System.out.println("C) && ");
                System.out.println("D) != ");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("C")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. What is the result of the following condition: x >= 5 && x < 10 ?");
                System.out.println("A) True");
                System.out.println("B) False");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
                System.out.println("\n3. In Java, which statement is used to exit a switch statement?");
                System.out.println("A) exit");
                System.out.println("B) continue");
                System.out.println("C) return");
                System.out.println("D) break");
                System.out.print("Enter your answer: ");
                String answer3 = scanner.next();

                if (answer3.equalsIgnoreCase("D")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }

            // Chapter 5: Loops
            private static void takeChapter5Quiz(Scanner scanner) {
                System.out.println("\nChapter 5: Loops");
                System.out.println("1. What will be the output of the following code?");
                System.out.println("for (int i = 0; i < 3; i++) {\n    System.out.println(i);\n}");
                System.out.println("A) 0 1 2");
                System.out.println("B) 1 2 3");
                System.out.println("C) 0 1 2 3");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }

                System.out.println("\n2. What is the result of the following loop?");
                System.out.println("int i = 5;\nwhile (i > 0) {\n    System.out.println(i);\n    i--;\n}");
                System.out.println("A) 1 2 3 4 5");
                System.out.println("B) 5 4 3 2 1");
                System.out.println("C) 5 4 3 2");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }

            private static void takeChapter6Quiz(Scanner scanner) {
                System.out.println("\nChapter 6: Methods");
                System.out.println("1. What is the purpose of the return statement in a method?");
                System.out.println("A) To end the method execution.");
                System.out.println("B) To return a value to the caller.");
                System.out.println("C) To call another method.");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. Which of the following is the correct way to define a method in Java?");
                System.out.println("A) void methodName() {}");
                System.out.println("B) methodName() void {}");
                System.out.println("C) methodName() {}");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }
            private static void takeChapter7Quiz(Scanner scanner) {
                System.out.println("\nChapter 7: Single Dimensional Arrays");
                System.out.println("1. How do you declare an array of integers in Java?");
                System.out.println("A) int array[];");
                System.out.println("B) int[] array;");
                System.out.println("C) array int[];");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. What is the index of the first element in a Java array?");
                System.out.println("A) 0");
                System.out.println("B) 1");
                System.out.println("C) -1");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }

            private static void takeChapter8Quiz(Scanner scanner) {
                System.out.println("\nChapter 8: Multi-Dimensional Arrays");
                System.out.println("1. How do you declare a two-dimensional array in Java?");
                System.out.println("A) int[][] array;");
                System.out.println("B) int array[][];");
                System.out.println("C) array int[][];");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("Which of the following correctly accesses the element in the first row and second column of a 2D array named matrix?");
                System.out.println("A) matrix[0][1];");
                System.out.println("B) matrix[1][0];");
                System.out.println("C) matrix(0, 1);");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }
            private static void takeChapter9Quiz(Scanner scanner) {
                System.out.println("\nChapter 9: Objects and Classes");
                System.out.println("1. What keyword is used to create an object in Java?");
                System.out.println("A) class");
                System.out.println("B) new");
                System.out.println("C) object");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. What is a class in Java?");
                System.out.println("A) A blueprint for creating objects");
                System.out.println("B) A template for objects that contains properties and methods");
                System.out.println("C) A type of method\n");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }
            private static void takeChapter10Quiz(Scanner scanner) {
                System.out.println("\nChapter 10: Object-Oriented Thinking in Java");
                System.out.println("1. Which of the following best describes the concept of Encapsulation in Object-Oriented Programming?");
                System.out.println("A) Wrapping data and methods into a single unit, like a class");
                System.out.println("B) Allowing objects to inherit properties of other objects");
                System.out.println("C) Allowing objects to perform multiple functions");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }

                System.out.println("\n2. What is Polymorphism in Java?");
                System.out.println("A) When a class can have multiple constructors");
                System.out.println("B) When a method can take on many forms depending on the context");
                System.out.println("C) When a class has multiple subclasses");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }
            private static void takeChapter11Quiz(Scanner scanner) {
                System.out.println("\nChapter 11: Inheritance and Polymorphism in Java");
                System.out.println("1. Which keyword is used to indicate inheritance in Java?");
                System.out.println("A) extends");
                System.out.println("B) implements");
                System.out.println("C) inherits");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }

                System.out.println("\n2. If a class Dog inherits from a class Animal, what can be said about the relationship between Dog and Animal?");
                System.out.println("A) Dog is a superclass of Animal");
                System.out.println("B) Dog is a subclass of Animal");
                System.out.println("C) Dog is unrelated to Animal");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }
            private static void takeChapter12Quiz(Scanner scanner) {
                System.out.println("\nChapter 12: Exception Handling and Text I/O");
                System.out.println("1. What is the purpose of the throw keyword in Java?");
                System.out.println("A) To catch an exception");
                System.out.println("B) To define an exception");
                System.out.println("C) To manually throw an exception");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("C")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is C.");
                }

                System.out.println("\n2. Which exception is thrown when accessing an array element out of its bounds?");
                System.out.println("A) ArrayIndexOutOfBoundsException");
                System.out.println("B) IOException");
                System.out.println("C) ArithmeticException");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }
            private static void takeChapter13Quiz(Scanner scanner) {
                System.out.println("\nChapter 13: Abstract Class and Interface");
                System.out.println("1. Which of the following statements is true about abstract classes?");
                System.out.println("A) They can be instantiated directly.");
                System.out.println("B) They can have both abstract and concrete methods.");
                System.out.println("C) They can only contain abstract methods.");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. What must a class do to implement an interface?");
                System.out.println("A) Override only specific methods");
                System.out.println("B) Define all variables from the interface");
                System.out.println("C) Implement all methods declared in the interface");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("C")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is C.");
                }
            }
            private static void takeChapter14Quiz(Scanner scanner) {
                System.out.println("\nChapter 14:JavaFX Basics");
                System.out.println("1. Which JavaFX class is used to represent the main window of an application?");
                System.out.println("A) Scene");
                System.out.println("B) Stage");
                System.out.println("C) Layout");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. What is the primary function of a Scene in JavaFX?");
                System.out.println("A) To hold the UI elements for display on a Stage");
                System.out.println("B) To launch the main application");
                System.out.println("C) To manage event handling");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }
            private static void takeChapter15Quiz(Scanner scanner) {
                System.out.println("\nChapter 15: Event-Driven Programming and Animation");
                System.out.println("1. In JavaFX, which of the following is used to listen to button clicks?");
                System.out.println("A) ButtonClickHandler");
                System.out.println("B) EventHandler<ActionEvent>");
                System.out.println("C) MouseEvent");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }

                System.out.println("\n2. Which class provides a timer to create frame-based animations in JavaFX?\n");
                System.out.println("A) AnimationTimer");
                System.out.println("B) EventQueue");
                System.out.println("C) FrameTimer");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }
            private static void takeChapter16Quiz(Scanner scanner) {
                System.out.println("\nChapter 16: JavaFX UI Control and Multimedia");
                System.out.println("1. Which JavaFX class is used to play audio files?");
                System.out.println("A) MediaPlayer");
                System.out.println("B) SoundPlayer");
                System.out.println("C) AudioControl");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }

                System.out.println("\n2. What is the purpose of the Slider control in JavaFX?");
                System.out.println("A) To allow the user to select a value from a range");
                System.out.println("B) To display text");
                System.out.println("C) To control animations");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
            }
            private static void takeChapter17Quiz(Scanner scanner) {
                System.out.println("\nChapter 17: MBinary I/O");
                System.out.println("1. Which Java class is commonly used to read binary data from a file?\n");
                System.out.println("A) DataInputStream");
                System.out.println("B) FileWriter");
                System.out.println("C) PrintStream");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }

                System.out.println("\n2. What does the writeInt method of DataOutputStream do?");
                System.out.println("A) Writes an integer as text");
                System.out.println("B) Writes an integer in binary format");
                System.out.println("C) Reads an integer from a file");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }
            private static void takeChapter4Quiz(Scanner scanner) {
                System.out.println("\nChapter 4: Mathematics,functions,characters, and String\n");
                System.out.println("Which method would you use to find the square root of a number in Java?\n");
                System.out.println("A) Math.pow()");
                System.out.println("B) Math.sqrt()");
                System.out.println(") Math.abs()");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }

                System.out.println("\n2.Which of the following methods can be used to compare two strings for equality in Java?");
                System.out.println("A) equalsIgnoreCase()");
                System.out.println("B) equals()");
                System.out.println("C) compareTo()");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("B")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is B.");
                }
            }

            // Continue adding similar methods for Chapter 6 to Chapter 18 following the same structure.

            private static void takeChapter18Quiz(Scanner scanner) {
                System.out.println("\nChapter 18: Recursion");
                System.out.println("1. What is recursion in Java?");
                System.out.println("A) A method calling itself. ");
                System.out.println("B) A method calling other methods only. ");
                System.out.println("C) A class calling its constructor. ");
                System.out.print("Enter your answer: ");
                String answer1 = scanner.next();

                if (answer1.equalsIgnoreCase("A")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is A.");
                }
                System.out.println("2. Which condition is necessary to stop a recursive function?");
                System.out.println("A) A return statement");
                System.out.println("B) Infinite recursion");
                System.out.println("C) A base case");
                System.out.print("Enter your answer: ");
                String answer2 = scanner.next();

                if (answer2.equalsIgnoreCase("C")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is C.");
                }
            }
        }