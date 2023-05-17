package subject_B6.prototype.main;

import subject_B6.factory.Component;
import subject_B6.prototype.models.ISticker;
import subject_B6.prototype.models.Sticker;

public class Test {
    public static void main(String[] args) {
        ISticker sticker1 = new Sticker(new Component("red", 4.5F, 1.3F));
        System.out.println(sticker1.details());
    }
}
