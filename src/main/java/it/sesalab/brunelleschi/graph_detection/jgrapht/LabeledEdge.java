package it.sesalab.brunelleschi.graph_detection.jgrapht;

import org.jgrapht.graph.DefaultEdge;

public class LabeledEdge extends DefaultEdge {
    private String label;

    /**
     * Constructs a relationship edge
     *
     * @param label the label of the new edge.
     *
     */
    public LabeledEdge(String label) {
        this.label = label;
    }

    /**
     * Gets the label associated with this edge.
     *
     * @return edge label
     */
    public String getLabel() {
        return label;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public Object getTarget() {
        return super.getTarget();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabeledEdge that = (LabeledEdge) o;

        boolean isLabelEqual = getLabel() != null ? getLabel().equals(that.getLabel()) : that.getLabel() == null;
        boolean isSourceEqual = getSource().equals(that.getSource());
        boolean isTargetEqual = getTarget().equals(that.getTarget());
        return isLabelEqual && isSourceEqual && isTargetEqual;
    }

    @Override
    public int hashCode() {
        int labelHash = getLabel() != null ? getLabel().hashCode() : 0;
        int sourceHash = getSource() != null ? getSource().hashCode() : 1;
        int targetHash = getTarget() != null ? getTarget().hashCode() : 2;
        return labelHash + sourceHash + targetHash;
    }

    @Override
    public String toString() {
        return "(" + label + ")";
    }
}
