package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ActivityComponentInfo;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        if (!C2576A.z(str2, ProxyConfig.MATCH_ALL_SCHEMES, false, 2)) {
            return false;
        }
        if (str2.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (C2576A.F(str2, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != C2576A.J(str2, 0, 6, false, ProxyConfig.MATCH_ALL_SCHEMES) || !z.n(str2, 2, ProxyConfig.MATCH_ALL_SCHEMES, false)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        j.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return z.w(str, 2, strSubstring, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areComponentsMatching$window_release(androidx.window.core.ActivityComponentInfo r6, androidx.window.core.ActivityComponentInfo r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.j.g(r7, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L20
            java.lang.String r6 = r7.getPackageName()
            boolean r6 = kotlin.jvm.internal.j.b(r6, r0)
            if (r6 == 0) goto L70
            java.lang.String r6 = r7.getClassName()
            boolean r6 = kotlin.jvm.internal.j.b(r6, r0)
            if (r6 == 0) goto L70
            goto L6f
        L20:
            java.lang.String r3 = r6.toString()
            r4 = 2
            boolean r0 = zj.C2576A.z(r3, r0, r2, r4)
            if (r0 != 0) goto L71
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = kotlin.jvm.internal.j.b(r0, r3)
            if (r0 != 0) goto L4a
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = r5.wildcardMatch(r0, r3)
            if (r0 == 0) goto L48
            goto L4a
        L48:
            r0 = r2
            goto L4b
        L4a:
            r0 = r1
        L4b:
            java.lang.String r3 = r6.getClassName()
            java.lang.String r4 = r7.getClassName()
            boolean r3 = kotlin.jvm.internal.j.b(r3, r4)
            if (r3 != 0) goto L6a
            java.lang.String r6 = r6.getClassName()
            java.lang.String r7 = r7.getClassName()
            boolean r6 = r5.wildcardMatch(r6, r7)
            if (r6 == 0) goto L68
            goto L6a
        L68:
            r6 = r2
            goto L6b
        L6a:
            r6 = r1
        L6b:
            if (r0 == 0) goto L70
            if (r6 == 0) goto L70
        L6f:
            return r1
        L70:
            return r2
        L71:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Wildcard can only be part of the rule."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(androidx.window.core.ActivityComponentInfo, androidx.window.core.ActivityComponentInfo):boolean");
    }

    public final boolean isActivityMatching$window_release(Activity activity, ActivityComponentInfo ruleComponent) {
        j.g(activity, "activity");
        j.g(ruleComponent, "ruleComponent");
        ComponentName componentName = activity.getComponentName();
        j.f(componentName, "activity.componentName");
        if (areComponentsMatching$window_release(new ActivityComponentInfo(componentName), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return INSTANCE.isIntentMatching$window_release(intent, ruleComponent);
        }
        return false;
    }

    public final boolean isIntentMatching$window_release(Intent intent, ActivityComponentInfo ruleComponent) {
        String str;
        j.g(intent, "intent");
        j.g(ruleComponent, "ruleComponent");
        ComponentName component = intent.getComponent();
        if (areComponentsMatching$window_release(component != null ? new ActivityComponentInfo(component) : null, ruleComponent)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (str.equals(ruleComponent.getPackageName()) || wildcardMatch(str, ruleComponent.getPackageName())) && j.b(ruleComponent.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        return false;
    }

    public final void validateComponentName$window_release(String packageName, String className) {
        j.g(packageName, "packageName");
        j.g(className, "className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty");
        }
        if (C2576A.z(packageName, ProxyConfig.MATCH_ALL_SCHEMES, false, 2) && C2576A.F(packageName, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (C2576A.z(className, ProxyConfig.MATCH_ALL_SCHEMES, false, 2) && C2576A.F(className, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }
}
