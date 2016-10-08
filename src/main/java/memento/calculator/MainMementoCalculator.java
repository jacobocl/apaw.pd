package memento.calculator;

import command.calculator.AddCommand;
import command.calculator.CommandManager;
import command.calculator.PrintCommand;
import command.calculator.ResetCommand;
import command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainMementoCalculator {

    private CommandManager commandManager;

    public MainMementoCalculator() {
        MementableCalculator calculator = new MementableCalculator();
        MementoManager<MementoCalculator> mementoManager = new MementoManager<MementoCalculator>();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new RestoreCommand(calculator, mementoManager));
        this.commandManager.add(new SaveCommand(calculator, mementoManager));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainMementoCalculator());
    }

}
