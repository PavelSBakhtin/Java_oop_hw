package src.ui.commands;

import src.ui.Console;

public class SortName extends Command {
    public SortName(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семьи по имени. ";
    }

    @Override
    public void execute() {
        getConsole().sortFamilyName();
    }
}
