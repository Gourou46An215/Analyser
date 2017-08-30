package business;
import UI.UI;
import data.Diagram;

public class Engine {
    private static String string;

    public static void main(String[] args) {
        launch();
    }

    private static void launch() {
        UI ui = new UI();
        StringManager stringManager = new StringManager();
        boolean keepRunning=true;
        while(keepRunning) {
            int x=ui.printMenu();
            if (x<0 || x>3) {
                ui.printError();
            }
            if (x==3) {
                // Quit
                keepRunning=false;
            }
            else {
                setString(ui.askString());
                Diagram diagram = new Diagram(Engine.string);
                int y=-1;
                while(y<0 || y>2) {
                    y=ui.printMenu2();
                    switch (y) {
                        case 0:
                            // Monograms
                            diagram.setNbChar(1);
                            break;
                        case 1:
                            // Bigrams
                            diagram.setNbChar(2);
                            break;
                        case 2:
                            // Trigrams
                            diagram.setNbChar(3);
                            break;
                        default:
                            ui.printError();
                    }
                }

                stringManager.split(getString(), diagram);
                stringManager.sort(diagram);
                switch(x) {
                    case 0:
                        // Char only
                        ui.printCharDiagram(diagram);
                        break;
                    case 1:
                        // Numerical only
                        ui.printNumericalDiagram(diagram);
                        break;
                    case 2:
                        // Both
                        ui.printCharDiagram(diagram);
                        ui.printNumericalDiagram(diagram);
                        break;
                }
            }
        }
    }


    public static String getString() {
        return Engine.string;
    }

    public static void setString(String string) {
        Engine.string = string;
    }
}
