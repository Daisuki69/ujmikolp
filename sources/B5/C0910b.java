package b5;

import We.s;
import android.graphics.drawable.Drawable;
import defpackage.AbstractC1414e;
import s5.InterfaceC2237a;

/* JADX INFO: renamed from: b5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0910b extends AbstractC0911c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2237a f8517b;
    public final Drawable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8518d;
    public final String e;
    public final s5.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8519g;

    public C0910b(String adUnitId, InterfaceC2237a interfaceC2237a, Drawable drawable, String str, String str2, s5.i iVar, boolean z4) {
        kotlin.jvm.internal.j.g(adUnitId, "adUnitId");
        this.f8516a = adUnitId;
        this.f8517b = interfaceC2237a;
        this.c = drawable;
        this.f8518d = str;
        this.e = str2;
        this.f = iVar;
        this.f8519g = z4;
    }

    @Override // b5.AbstractC0911c
    public final String a() {
        return this.e;
    }

    @Override // b5.AbstractC0911c
    public final s5.i b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0910b)) {
            return false;
        }
        C0910b c0910b = (C0910b) obj;
        return kotlin.jvm.internal.j.b(this.f8516a, c0910b.f8516a) && kotlin.jvm.internal.j.b(this.f8517b, c0910b.f8517b) && kotlin.jvm.internal.j.b(this.c, c0910b.c) && kotlin.jvm.internal.j.b(this.f8518d, c0910b.f8518d) && kotlin.jvm.internal.j.b(this.e, c0910b.e) && this.f == c0910b.f && this.f8519g == c0910b.f8519g;
    }

    public final int hashCode() {
        int iHashCode = this.f8516a.hashCode() * 31;
        InterfaceC2237a interfaceC2237a = this.f8517b;
        int iHashCode2 = (iHashCode + (interfaceC2237a == null ? 0 : interfaceC2237a.hashCode())) * 31;
        Drawable drawable = this.c;
        int iC = AbstractC1414e.c(AbstractC1414e.c((iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.f8518d), 31, this.e);
        s5.i iVar = this.f;
        return ((iC + (iVar != null ? iVar.hashCode() : 0)) * 31) + (this.f8519g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerItemVariables(adUnitId=");
        sb2.append(this.f8516a);
        sb2.append(", adPlacement=");
        sb2.append(this.f8517b);
        sb2.append(", adImage=");
        sb2.append(this.c);
        sb2.append(", adImageUrl=");
        sb2.append(this.f8518d);
        sb2.append(", adRedirectionUrl=");
        sb2.append(this.e);
        sb2.append(", adRedirectionUrlType=");
        sb2.append(this.f);
        sb2.append(", hideAdBadge=");
        return s.s(sb2, this.f8519g, ")");
    }
}
