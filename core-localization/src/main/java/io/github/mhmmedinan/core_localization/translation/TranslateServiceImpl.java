package io.github.mhmmedinan.core_localization.translation;


import io.github.mhmmedinan.core_localization.abstraction.TranslationService;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TranslateServiceImpl implements TranslationService {

    private MessageSource messageSource;

    @Override
    public String getMessage(String key) {
        return messageSource.getMessage(key,null, LocaleContextHolder.getLocale());
    }
}
