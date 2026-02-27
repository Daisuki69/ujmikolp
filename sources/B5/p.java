package b5;

import We.s;
import defpackage.AbstractC1414e;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("badge_text")
    private final String f8537a = "AD";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("title_text")
    private final String f8538b = "MAYA PICKS";

    @InterfaceC1498b("subtitle_text")
    private final String c = "Massive discounts just for you";

    public final String a() {
        return this.f8537a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f8538b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.j.b(this.f8537a, pVar.f8537a) && kotlin.jvm.internal.j.b(this.f8538b, pVar.f8538b) && kotlin.jvm.internal.j.b(this.c, pVar.c);
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(this.f8537a.hashCode() * 31, 31, this.f8538b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.f8537a;
        String str2 = this.f8538b;
        return s.p(s.x("VerticalBannerHeader(badgeText=", str, ", titleText=", str2, ", subtitleText="), this.c, ")");
    }
}
