package skorban.loremipsum;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneratorControler {

    private LoremIpsum loremIpsum = new LoremIpsum();
    private  Lorem lorem = new Lorem() {
        @Override
        public String getCity() {
            return null;
        }

        @Override
        public String getCountry() {
            return null;
        }

        @Override
        public String getEmail() {
            return null;
        }

        @Override
        public String getFirstName() {
            return null;
        }

        @Override
        public String getFirstNameMale() {
            return null;
        }

        @Override
        public String getFirstNameFemale() {
            return null;
        }

        @Override
        public String getLastName() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getNameMale() {
            return null;
        }

        @Override
        public String getNameFemale() {
            return null;
        }

        @Override
        public String getTitle(int count) {
            return null;
        }

        @Override
        public String getTitle(int min, int max) {
            return null;
        }

        @Override
        public String getHtmlParagraphs(int min, int max) {
            return null;
        }

        @Override
        public String getParagraphs(int min, int max) {
            return null;
        }

        @Override
        public String getUrl() {
            return null;
        }

        @Override
        public String getWords(int count) {
            return null;
        }

        @Override
        public String getWords(int min, int max) {
            return null;
        }

        @Override
        public String getPhone() {
            return null;
        }

        @Override
        public String getStateAbbr() {
            return null;
        }

        @Override
        public String getStateFull() {
            return null;
        }

        @Override
        public String getZipCode() {
            return null;
        }
    };

    @GetMapping("/main")
    public String generatorLorem() {
     return lorem.getHtmlParagraphs(1,10);
 }
}
