package Ng;

import androidx.browser.trusted.sharing.ShareTarget;
import cj.C1132s;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f4437b;
    public static final t c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f4438d;
    public static final List e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4439a;

    static {
        t tVar = new t(ShareTarget.METHOD_GET);
        f4437b = tVar;
        t tVar2 = new t(ShareTarget.METHOD_POST);
        c = tVar2;
        t tVar3 = new t("PUT");
        t tVar4 = new t("PATCH");
        t tVar5 = new t("DELETE");
        t tVar6 = new t("HEAD");
        f4438d = tVar6;
        e = C1132s.g(tVar, tVar2, tVar3, tVar4, tVar5, tVar6, new t("OPTIONS"));
    }

    public t(String str) {
        this.f4439a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.j.b(this.f4439a, ((t) obj).f4439a);
    }

    public final int hashCode() {
        return this.f4439a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("HttpMethod(value="), this.f4439a, ')');
    }
}
