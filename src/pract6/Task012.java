package pract6;

import java.util.ArrayList;
import java.util.List;

class MyStringBuilder {
    private StringBuilder stringBuilder;
    private List<UndoCommand> undoCommands;

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
        undoCommands = new ArrayList<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        undoCommands.add(new UndoAppendCommand(str.length()));
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        undoCommands.add(new UndoDeleteCommand(start, deleted));
    }

    public void undo() {
        if (!undoCommands.isEmpty()) {
            UndoCommand lastCommand = undoCommands.remove(undoCommands.size() - 1);
            lastCommand.undo(stringBuilder);
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    private interface UndoCommand {
        void undo(StringBuilder stringBuilder);
    }

    private class UndoAppendCommand implements UndoCommand {
        private int length;

        UndoAppendCommand(int length) {
            this.length = length;
        }

        @Override
        public void undo(StringBuilder stringBuilder) {
            stringBuilder.delete(stringBuilder.length() - length, stringBuilder.length());
        }
    }

    private class UndoDeleteCommand implements UndoCommand {
        private int start;
        private String deleted;

        UndoDeleteCommand(int start, String deleted) {
            this.start = start;
            this.deleted = deleted;
        }

        @Override
        public void undo(StringBuilder stringBuilder) {
            stringBuilder.insert(start, deleted);
        }
    }
}

public class Task012 {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("Hello, ");
        System.out.println(myStringBuilder);

        myStringBuilder.append("world!");
        System.out.println(myStringBuilder);

        myStringBuilder.undo();
        System.out.println(myStringBuilder);
    }
}
