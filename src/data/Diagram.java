package data;

public class Diagram {
    private int nbChar;
    //private Sequences[] sequences = new Sequences[10];
    private Sequences[] sequences;

    public Diagram(String string) {
        this.sequences = new Sequences[string.length()];
        for(int i=0; i<string.length();i++){
            this.sequences[i] = new Sequences(i, "", this);
        }
    }

    public Sequences[] getSequences() {
        return this.sequences;
    }

    public int getNbChar() {
        return nbChar;
    }

    public void setNbChar(int nbChar) {
        if(nbChar<1)
            nbChar=1;
        if(nbChar>3)
            nbChar=3;
        this.nbChar = nbChar;
    }

    public int getLastIndex() {
        int i=0;
        while(i<this.sequences.length && this.sequences[i].getValue()!="") {
            i++;
        }
            return i;
    }
}
