package mx_android.support.v4.text;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class TextUtilsCompat {
    public static final Locale ROOT = new Locale("", "");
    private static String ARAB_SCRIPT_SUBTAG = "Arab";
    private static String HEBR_SCRIPT_SUBTAG = "Hebr";

    public static String htmlEncode(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                sb2.append("&quot;");
            } else if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else if (cCharAt == '\'') {
                sb2.append("&#39;");
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        if (locale == null || locale.equals(ROOT)) {
            return 0;
        }
        String script = ICUCompat.getScript(ICUCompat.addLikelySubtags(locale.toString()));
        if (script == null) {
            return getLayoutDirectionFromFirstChar(locale);
        }
        return (script.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || script.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG)) ? 1 : 0;
    }

    private static int getLayoutDirectionFromFirstChar(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
