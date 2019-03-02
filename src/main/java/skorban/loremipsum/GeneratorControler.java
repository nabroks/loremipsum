package skorban.loremipsum;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneratorControler {

    private Lorem lorem = new LoremIpsum();

    @GetMapping("/test")
    public String testLorem(ModelMap modelMap) {
        modelMap.put("test", lorem.getParagraphs(1, 10));
        return "test";
    }

    @GetMapping("/main")
    public String generatorLorem() {
        return lorem.getHtmlParagraphs(1, 10);
    }

}
