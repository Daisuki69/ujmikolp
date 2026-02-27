package b3;

import android.os.Build;
import defpackage.AbstractC1414e;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0881b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0880a f8432b;

    public C0881b(String appId, C0880a c0880a) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        EnumC0904y enumC0904y = EnumC0904y.f8503b;
        kotlin.jvm.internal.j.g(appId, "appId");
        kotlin.jvm.internal.j.g(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.g(osVersion, "osVersion");
        this.f8431a = appId;
        this.f8432b = c0880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0881b)) {
            return false;
        }
        C0881b c0881b = (C0881b) obj;
        if (!kotlin.jvm.internal.j.b(this.f8431a, c0881b.f8431a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.j.b(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!kotlin.jvm.internal.j.b(str2, str2)) {
            return false;
        }
        EnumC0904y enumC0904y = EnumC0904y.f8503b;
        return this.f8432b.equals(c0881b.f8432b);
    }

    public final int hashCode() {
        return this.f8432b.hashCode() + ((EnumC0904y.f8503b.hashCode() + AbstractC1414e.c((((Build.MODEL.hashCode() + (this.f8431a.hashCode() * 31)) * 31) + 48517561) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f8431a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + EnumC0904y.f8503b + ", androidAppInfo=" + this.f8432b + ')';
    }
}
