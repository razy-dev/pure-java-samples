package net.razy.design.patterns.structural.facade;

public class TheaterFacade {

    private Amp amp;

    private Projector projector;

    private CDPlayer player;

    public TheaterFacade(Amp amp, Projector projector, CDPlayer player) {
        this.amp = amp;
        this.projector = projector;
        this.player = player;
    }

    public void play() {
        System.out.println("\nTheater Play");
        amp.on();
        projector.on();
        projector.wideScreenMode();
        player.on();
        player.play();
    }

    public void stop() {
        System.out.println("\nTheater Stop");
        player.stop();
    }

}
