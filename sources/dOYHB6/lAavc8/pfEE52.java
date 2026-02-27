package dOYHB6.lAavc8;

import dOYHB6.lPFdA1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class pfEE52 {
    private static ArrayList<String> trustedCertificatesSha1 = new ArrayList<>();

    public static void qdrA10(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        trustedCertificatesSha1.addAll(arrayList);
    }

    public static boolean wkgmC0(String str) {
        if (lPFdA1.isNullOrEmpty(str)) {
            return false;
        }
        String strReplace = str.replace(':', ' ');
        if (!trustedCertificatesSha1.isEmpty()) {
            for (String str2 : trustedCertificatesSha1) {
                if (str2.compareToIgnoreCase(str) == 0 || str2.compareToIgnoreCase(strReplace) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final String zMmdx0() {
        return pfEE52.class.getName();
    }
}
