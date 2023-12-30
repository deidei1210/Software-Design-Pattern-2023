package Memento;

import Command.Command;
import Decorator.Book;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class CareTaker {
    //一个用于维护命令和备忘录的类
    private int mementoIndex = -1;
    private final ArrayList<Memento> bookOrderList = new ArrayList<Memento>();  //备忘录栈
    private final ArrayDeque<Command> redoCommands = new ArrayDeque<>();    //redo命令栈
    private final ArrayDeque<Command> commands = new ArrayDeque<>();    //命令栈

    //如果有了新的order，将新的book状态保存在Memento中
    public void append(Command command, Memento memento) {
        mementoIndex++;
        commands.push(command);
        bookOrderList.add(memento);
    }

    //如果undo,将备忘录栈最近状态pop出栈，同时commands最新命令出栈，并入栈redoCommands
    //需要返回undo的命令
    public Command undo() {
        Command lastCommand=commands.getLast();
        if (mementoIndex > 0) {
            Book book = commands.getLast().myBook();
            redoCommands.push(commands.pop());
            mementoIndex--;
            book.studyMaterials = bookOrderList.get(mementoIndex).getStudyMaterials();
            return lastCommand;
        } else {
            System.out.println("No commands left!");
        }
        return lastCommand;
    }

    //如果redo，将redoCommands里的最新命令出栈，并入栈commands
    public Command redo() throws InterruptedException {
        Command lastCommand = null;
        if (!redoCommands.isEmpty()) {
            lastCommand=redoCommands.getLast();
            redoCommands.getFirst().execute();
            commands.push(redoCommands.pop());
            mementoIndex++;
        } else {
            System.out.println("No RedoCommands left!");
        }
        return lastCommand;
    }

    public void clear() {
        redoCommands.clear();
    }
}
