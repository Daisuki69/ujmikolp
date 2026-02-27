package b3;

import android.os.Build;
import defpackage.AbstractC1414e;
import java.util.ArrayList;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0880a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8427b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0865E f8428d;
    public final ArrayList e;

    public C0880a(String str, String versionName, String appBuildVersion, C0865E c0865e, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.g(versionName, "versionName");
        kotlin.jvm.internal.j.g(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.g(deviceManufacturer, "deviceManufacturer");
        this.f8426a = str;
        this.f8427b = versionName;
        this.c = appBuildVersion;
        this.f8428d = c0865e;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0880a)) {
            return false;
        }
        C0880a c0880a = (C0880a) obj;
        if (!this.f8426a.equals(c0880a.f8426a) || !kotlin.jvm.internal.j.b(this.f8427b, c0880a.f8427b) || !kotlin.jvm.internal.j.b(this.c, c0880a.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.j.b(str, str) && this.f8428d.equals(c0880a.f8428d) && this.e.equals(c0880a.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f8428d.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.f8426a.hashCode() * 31, 31, this.f8427b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f8426a + ", versionName=" + this.f8427b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f8428d + ", appProcessDetails=" + this.e + ')';
    }
}
