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


    @GetMapping("/main")
    public String generatorLorem(
            @RequestParam(required = false) String type, Integer quantity, ModelMap map) {
        if (quantity != null) {
            switch (type) {
                case "paragraphs":
                    map.put("paragraph", lorem.getParagraphs(quantity, quantity));
                    break;
                case "sentence":
                    StringBuilder bolek = new StringBuilder();
                    for (int i = 0; i <= quantity; i++) {
                        String words = lorem.getWords(5, 15);
                        bolek.append(words);
                        bolek.append(". ");
                    }
                    String result = bolek.toString().trim();
                    map.put("paragraph", result);
                    break;
                case "words":
                    map.put("paragraph", lorem.getWords(quantity, quantity));
                    break;
            }
        }
        return "main";
    }

}