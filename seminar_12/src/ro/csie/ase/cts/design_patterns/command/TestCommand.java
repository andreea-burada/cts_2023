package ro.csie.ase.cts.design_patterns.command;

import java.util.ArrayList;
import java.util.List;

public class TestCommand {
    public static void main(String[] args) {
        List<IBackgroundTask> tasks = new ArrayList<>();
        tasks.add(new BackgroundUpdateTask(1, "192.0.0.1", new UpdateService()));
        tasks.add(new BackgroundUpdateTask(2, "192.0.0.2", new UpdateService()));
        for (IBackgroundTask task : tasks) {
            task.doTask();
        }
        // clear task list
    }
}
