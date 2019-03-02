package skorban.loremipsum;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeneratorControler {

    private Lorem lorem = new LoremIpsum();

    @GetMapping("/test")
    public String testLorem(ModelMap modelMap) {
        modelMap.put("test", lorem.getParagraphs(1, 10));
        return "test";
    }

    /* @GetMapping("/main")
    public String generatorLorem(ModelMap modelMap) {
        modelMap.put("paragraph", lorem.getParagraphs(1,5));
        return lorem.getParagraphs(1,5);
         } */

    @GetMapping("/main")
    public String generatorLorem(
            @RequestParam(required = false) Integer quantity, ModelMap map) {
        if (quantity != null) {
            map.put("paragraph", lorem.getParagraphs(quantity, quantity));
        }
        return "main";

    }

}
