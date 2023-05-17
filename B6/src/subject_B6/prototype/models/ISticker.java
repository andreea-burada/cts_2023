package subject_B6.prototype.models;

public interface ISticker extends Cloneable {
    ISticker copy() throws CloneNotSupportedException;
    String details();
}
