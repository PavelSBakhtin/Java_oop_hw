package src.ui.commands;

import src.ui.Console;

public class Sort extends Command {
    public Sort(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семейного дерева. ";
    }

    @Override
    public void execute() {
        getConsole().sortFamily();
    }
}
