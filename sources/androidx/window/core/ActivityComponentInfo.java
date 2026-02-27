package androidx.window.core;

import We.s;
import android.content.ComponentName;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityComponentInfo {
    private final String className;
    private final String packageName;

    public ActivityComponentInfo(String packageName, String className) {
        j.g(packageName, "packageName");
        j.g(className, "className");
        this.packageName = packageName;
        this.className = className;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ActivityComponentInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.e(obj, "null cannot be cast to non-null type androidx.window.core.ActivityComponentInfo");
        ActivityComponentInfo activityComponentInfo = (ActivityComponentInfo) obj;
        return j.b(this.packageName, activityComponentInfo.packageName) && j.b(this.className, activityComponentInfo.className);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.className.hashCode() + (this.packageName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClassInfo { packageName: ");
        sb2.append(this.packageName);
        sb2.append(", className: ");
        return s.p(sb2, this.className, " }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityComponentInfo(ComponentName componentName) {
        j.g(componentName, "componentName");
        String packageName = componentName.getPackageName();
        j.f(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        j.f(className, "componentName.className");
        this(packageName, className);
    }
}
