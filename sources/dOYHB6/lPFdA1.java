package dOYHB6;

import dOYHB6.tiZVw8.numX49;
import java.net.URI;

/* JADX INFO: loaded from: classes6.dex */
public class lPFdA1 {
    public static String hrzzW6(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uriCreate = URI.create(str);
            if (uriCreate == null) {
                return null;
            }
            return uriCreate.getHost().toLowerCase();
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String zmuc01(String str) {
        return str == null ? numX49.tnTj78("bHMv") : str;
    }
}
