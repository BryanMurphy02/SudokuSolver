# Sudoku Solver
## Created By: Bryan Murphy and Kyle Sterling
## Description
This Sudoku Solver provides a blank board where the user adds the numbers from their puzzle. After doing so the user and hit the solve button where the rest of the missing numbers from the puzzle will be filled in.
#
## Project Takeaways
- GUI creation
- Data Structures
- Project planning
#

## Running Sudoku Solver
The following steps are to run this program in Eclipse IDE. Below are the libraries needed:
- JavaFX javafx-sdk-11.0.2

Setting up the JavaFX library:
1. Put JavaFX in a secure folder where it can be reached but not easily deleted
2. Open a new text document to copy and paste things into
3. Copy the path to JavaFX\lib:
    - Open javaFX folder
    - Open the lib folder
    - At the top, click on the bar right next to the word lib
    - Copy and paste into the new text file
4. Copy the following into your text file:
    - --module-path "JavaFX Path\lib" --add-modules javafx.controls,javafx.fxml
    - --add-modules javafx.controls,javafx.fxml,javafx.media
5. Where it says "JavaFX Path\lib" in what was just copy and pasted, replace the words inside the quotation marks with the JavaFX path(the first thing in the text file)
6. Open Eclipse and right click on the project, then select properties at the very bottom
7. On the left side select Java Build Path
8. Select Libraries at the top menu and then add external jars on the right side
9. Go to the directory where JavaFX\lib is and import all the files in that directory
10. Hit apply and then close(You know it worked if all the errors are gone)
11. Right click on the project again, hover over run as, and then click run configurations
12. Click on Main on the left side, and then arguments on the top
13. In VM Arguments paste the edited version of the following from your text file:
    - --module-path "JavaFX Path\lib" --add-modules javafx.controls,javafx.fxml
    - --add-modules javafx.controls,javafx.fxml,javafx.media
14. Hit apply
