# How to run with VSCode configuration to test

## Configure launch and tasks for vscode

Firstly, configure the launch.json and tasks.json in repo/.vscode

### Configure directory paths

The marked line with comments should be replaced with your working directory.

(I don't trust the relative directory to work on everyone's environments. So it's hardcoded)

### Configure test inputs and outputs

You could change the test inputs and outputs in launch.json > configurations > "Run python tester" > args

To change that just add or replace arguments indicating the filename of .in and .out files

After that remember to put .in and .out files into repo/DB61B/testing

## Run

You should see two launch configurations in 'Run and debug' module on the left of VSCode interface after previous steps.

### Run without tests

"Run DB61B from testing" is to compile and run codes from testing instead of "mvn test". In other word, manually compile and start up.

### Run with python tester

"Run Python Tester" is to run with the given python tester, which will compare the program outputs with given sample outputs using given inputs. The samples test1 and test2 is tweaked to partially matched our style of printing tables.

__Keep in mind that the .class and .db files in \testing\t3\db61b\ would be cleared every time tester runs.__ And if you want to add new db files to test, just put it under \testing\ with this md file. On next run it will be copied to program's dir.