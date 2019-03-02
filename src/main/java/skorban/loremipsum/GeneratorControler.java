package skorban.loremipsum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneratorControler {

    private LoremipsumApplication loremipsumApplication = new LoremipsumApplication();

    @GetMapping("/main")
    public String generateLorem(ModelMap modelMap) {
        modelMap.put("lorem", loremipsumApplication);
        return "lorem";
    }
}
