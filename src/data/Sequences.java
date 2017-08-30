package data;

public class Sequences {
    private int id;
    private String value;
    private int count;
    private Diagram diagram;

    public Sequences(int id, String value, Diagram diagram){
        this.setId(id);
        this.setValue(value);
        this.setCount(1);
        this.setDiagram(diagram);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Diagram getDiagram() {
        return diagram;
    }

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
    }
}