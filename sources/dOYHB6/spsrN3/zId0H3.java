package dOYHB6.spsrN3;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes6.dex */
public class zId0H3 {
    private static final String[][] BASIC_ESCAPE = {new String[]{"\"", "&quot;"}, new String[]{"&", "&amp;"}, new String[]{"<", "&lt;"}, new String[]{">", "&gt;"}};
    private static final String[][] BASIC_UNESCAPE = invert(BASIC_ESCAPE);
    private static final String[][] APOS_ESCAPE = {new String[]{"'", "&apos;"}};
    private static final String[][] APOS_UNESCAPE = invert(APOS_ESCAPE);
    private static final String[][] JAVA_CTRL_CHARS_ESCAPE = {new String[]{"\b", "\\b"}, new String[]{Global.NEWLINE, "\\n"}, new String[]{"\t", "\\t"}, new String[]{"\f", "\\f"}, new String[]{"\r", "\\r"}};
    private static final String[][] JAVA_CTRL_CHARS_UNESCAPE = invert(JAVA_CTRL_CHARS_ESCAPE);

    public static String[][] diKZ08() {
        return (String[][]) JAVA_CTRL_CHARS_UNESCAPE.clone();
    }

    public static String[][] g3gdp7() {
        return (String[][]) BASIC_ESCAPE.clone();
    }

    public static String[][] invert(String[][] strArr) {
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length, 2);
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i][0] = strArr[i][1];
            strArr2[i][1] = strArr[i][0];
        }
        return strArr2;
    }

    public static String[][] pbWf84() {
        return (String[][]) APOS_ESCAPE.clone();
    }

    public static String[][] xb4b89() {
        return (String[][]) APOS_UNESCAPE.clone();
    }

    public static String[][] yVvIk2() {
        return (String[][]) BASIC_UNESCAPE.clone();
    }

    public static String[][] zkOL85() {
        return (String[][]) JAVA_CTRL_CHARS_ESCAPE.clone();
    }
}
