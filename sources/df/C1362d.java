package df;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: df.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1362d {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f16402d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16404b;

    public C1362d(String str, String str2) {
        this.f16403a = str;
        this.f16404b = str2;
    }

    public static C1362d a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.g('\"', "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f16402d.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.a.n(We.s.x("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \""), str, '\"'));
                }
                str2 = strGroup3;
            }
        }
        return new C1362d(str, str2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1362d) && ((C1362d) obj).f16403a.equals(this.f16403a);
    }

    public final int hashCode() {
        return this.f16403a.hashCode();
    }

    public final String toString() {
        return this.f16403a;
    }
}
