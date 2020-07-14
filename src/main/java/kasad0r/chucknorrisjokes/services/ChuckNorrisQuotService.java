package kasad0r.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotService implements RandomQuot {

    private final ChuckNorrisQuotes chuckNorrisQuotService;

    public ChuckNorrisQuotService(ChuckNorrisQuotes chuckNorrisQuotService) {
        this.chuckNorrisQuotService = chuckNorrisQuotService;
    }


    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotService.getRandomQuote();
    }
}
