package dOYHB6.aWIoY4;

import android.content.ComponentName;
import android.provider.Settings;
import dOYHB6.nm8AQ4;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes6.dex */
public class osYrN3 {
    private static String lastSetAIAssistant;
    private static boolean initialized = false;
    private static String[] whitelistedAIAssistantPackages = null;

    private static String cWvsv0() {
        return Settings.Secure.getString(nm8AQ4.get().getContentResolver(), numX49.tnTj78("bHgS"));
    }

    private static String fD3MR7() {
        String string = Settings.Secure.getString(nm8AQ4.get().getContentResolver(), numX49.tnTj78("bHgu"));
        return (string == null || string.isEmpty()) ? numX49.tnTj78("bHgV") : ComponentName.unflattenFromString(string).getPackageName();
    }

    public static void fglAq9() {
        String strFD3MR7;
        if (!initialized) {
            init();
        }
        String strCWvsv0 = cWvsv0();
        String strTnTj78 = numX49.tnTj78("bHgP");
        boolean zEquals = strTnTj78.equals(strCWvsv0);
        String strTnTj782 = numX49.tnTj78("bHgb");
        String strTnTj783 = numX49.tnTj78("bHg2");
        String str = !zEquals ? strTnTj783 : strTnTj782;
        if (!strTnTj78.equals(p09gH7())) {
            strTnTj782 = strTnTj783;
        }
        if ((!str.equals(strTnTj783) && !strTnTj782.equals(strTnTj783)) || (strFD3MR7 = fD3MR7()) == numX49.tnTj78("bHgL") || strFD3MR7.equals(lastSetAIAssistant) || hyrXR5(strFD3MR7)) {
            return;
        }
        fChUQ4.zJGTn5(numX49.tnTj78("bHgB"), numX49.tnTj78("bHgr"), strFD3MR7, numX49.tnTj78("bHgZ"), str, numX49.tnTj78("bHgk"), strTnTj782);
        lastSetAIAssistant = strFD3MR7;
    }

    private static boolean hyrXR5(String str) {
        if (whitelistedAIAssistantPackages != null && whitelistedAIAssistantPackages.length > 0) {
            for (String str2 : whitelistedAIAssistantPackages) {
                if (str.startsWith(str2.replaceAll(numX49.tnTj78("bHgi"), numX49.tnTj78("bHgE")))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void init() {
        if (initialized) {
            return;
        }
        initialized = true;
        whitelistedAIAssistantPackages = qOnQ39.getStringArray(numX49.tnTj78("bHgd"));
    }

    private static String p09gH7() {
        return Settings.Secure.getString(nm8AQ4.get().getContentResolver(), numX49.tnTj78("bHgj"));
    }
}
