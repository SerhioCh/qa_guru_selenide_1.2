import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {
    @Test
    void dragAndDropTestAToB() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //$("#column-a").dragAndDrop($("#column-b"); no way
        Selenide.actions().moveToElement($("#column-a").dragAndDropTo($("#column-b")));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
