package facade.computerFacade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Scheduler scheduler;

    public Computer(CPU cpu, Memory memory, Scheduler scheduler) {
        this.cpu = cpu;
        this.memory = memory;
        this.scheduler = scheduler;
    }

    public void start() {
        memory.load();
        Task task = scheduler.schedule();
        cpu.execute(task);
    }
}
