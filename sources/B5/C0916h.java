package b5;

import We.s;
import android.graphics.drawable.Drawable;
import defpackage.AbstractC1414e;
import s5.InterfaceC2237a;

/* JADX INFO: renamed from: b5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0916h extends AbstractC0911c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8527b;
    public final InterfaceC2237a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f8528d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s5.i f8529g;
    public final boolean h;

    public C0916h(String str, String str2, InterfaceC2237a interfaceC2237a, Drawable drawable, String str3, String str4, s5.i iVar, boolean z4) {
        this.f8526a = str;
        this.f8527b = str2;
        this.c = interfaceC2237a;
        this.f8528d = drawable;
        this.e = str3;
        this.f = str4;
        this.f8529g = iVar;
        this.h = z4;
    }

    @Override // b5.AbstractC0911c
    public final String a() {
        return this.f;
    }

    @Override // b5.AbstractC0911c
    public final s5.i b() {
        return this.f8529g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0916h)) {
            return false;
        }
        C0916h c0916h = (C0916h) obj;
        return kotlin.jvm.internal.j.b(this.f8526a, c0916h.f8526a) && kotlin.jvm.internal.j.b(this.f8527b, c0916h.f8527b) && kotlin.jvm.internal.j.b(this.c, c0916h.c) && kotlin.jvm.internal.j.b(this.f8528d, c0916h.f8528d) && kotlin.jvm.internal.j.b(this.e, c0916h.e) && kotlin.jvm.internal.j.b(this.f, c0916h.f) && this.f8529g == c0916h.f8529g && this.h == c0916h.h;
    }

    public final int hashCode() {
        int iHashCode = this.f8526a.hashCode() * 31;
        String str = this.f8527b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC2237a interfaceC2237a = this.c;
        int iHashCode3 = (iHashCode2 + (interfaceC2237a == null ? 0 : interfaceC2237a.hashCode())) * 31;
        Drawable drawable = this.f8528d;
        int iC = AbstractC1414e.c(AbstractC1414e.c((iHashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.e), 31, this.f);
        s5.i iVar = this.f8529g;
        return ((iC + (iVar != null ? iVar.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InterstitialAdVariables(adUnitId=");
        sb2.append(this.f8526a);
        sb2.append(", ctaButtonText=");
        sb2.append(this.f8527b);
        sb2.append(", adPlacement=");
        sb2.append(this.c);
        sb2.append(", adImage=");
        sb2.append(this.f8528d);
        sb2.append(", adImageUrl=");
        sb2.append(this.e);
        sb2.append(", adRedirectionUrl=");
        sb2.append(this.f);
        sb2.append(", adRedirectionUrlType=");
        sb2.append(this.f8529g);
        sb2.append(", hideAdBadge=");
        return s.s(sb2, this.h, ")");
    }
}
