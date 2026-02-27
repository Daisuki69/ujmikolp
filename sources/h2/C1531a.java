package h2;

import java.io.File;
import k2.C1693C;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1531a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1693C f16853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16854b;
    public final File c;

    public C1531a(C1693C c1693c, String str, File file) {
        this.f16853a = c1693c;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f16854b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1531a)) {
            return false;
        }
        C1531a c1531a = (C1531a) obj;
        return this.f16853a.equals(c1531a.f16853a) && this.f16854b.equals(c1531a.f16854b) && this.c.equals(c1531a.c);
    }

    public final int hashCode() {
        return ((((this.f16853a.hashCode() ^ 1000003) * 1000003) ^ this.f16854b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f16853a + ", sessionId=" + this.f16854b + ", reportFile=" + this.c + "}";
    }
}
