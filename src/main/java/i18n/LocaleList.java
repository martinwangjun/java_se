package i18n;

import java.util.Locale;

/**
 * 获取Java所支持的国家和语言
 * 
 * 
 * @see 《疯狂java》 P271
 * @author martin.wang
 *
 */
public class LocaleList {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            System.out.println(locales[i].getDisplayCountry()
                    + " = " + locales[i].getCountry() 
                    + ", " + locales[i].getDisplayLanguage()
                    + " = " + locales[i].getLanguage()
                    );
        }
    }
}
