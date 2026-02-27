package dOYHB6.lI6F16;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import dOYHB6.speLp8.fChUQ4;

/* JADX INFO: loaded from: classes6.dex */
public class x065T0 {
    static Context sContext;

    public static boolean cHOjy0(AccessibilityNodeProvider accessibilityNodeProvider, int i, int i4, Bundle bundle) {
        if (accessibilityNodeProvider == null) {
            return true;
        }
        return fChUQ4.wagml9(i, i4, bundle, sContext);
    }

    public static void qmpzM4(AccessibilityNodeProvider accessibilityNodeProvider, AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        if (accessibilityNodeProvider == null || accessibilityNodeInfo == null) {
            return;
        }
        fChUQ4.zJziM1(accessibilityNodeInfo, sContext);
    }

    public static void v7gZt5(Context context) {
        sContext = context;
    }
}
