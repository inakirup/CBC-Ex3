package ex3.ex3_2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class LiveScoreBean implements Serializable {
    public static final String SCORE_LINE_PROPERTY = "scoreLine";

    private String scoreLine = "";

    private PropertyChangeSupport propertyChangeSupport;

    public LiveScoreBean() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String scoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = scoreLine;
        propertyChangeSupport.firePropertyChange(SCORE_LINE_PROPERTY, oldScoreLine, scoreLine);
    }

    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, java.beans.PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(String propertyName, java.beans.PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
    }

    public PropertyChangeListener[] getPropertyChangeListeners() {
        return propertyChangeSupport.getPropertyChangeListeners();
    }

    public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
        return propertyChangeSupport.getPropertyChangeListeners(propertyName);
    }

    @Override
    public String toString() {
        return "LiveScoreBean{" +
                "scoreLine='" + scoreLine + '\'' +
                '}';
    }
    
}
