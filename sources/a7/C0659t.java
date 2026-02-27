package a7;

import android.widget.TextView;

/* JADX INFO: renamed from: a7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0659t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7056b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0659t f7057d;
    public C0659t e;

    public C0659t(String sectionIndexLabel, TextView textView, int i) {
        kotlin.jvm.internal.j.g(sectionIndexLabel, "sectionIndexLabel");
        this.f7055a = sectionIndexLabel;
        this.f7056b = textView;
        this.c = i;
        this.f7057d = null;
        this.e = null;
    }

    public final int a() {
        int iHashCode = this.f7055a.hashCode() * 31;
        TextView textView = this.f7056b;
        return ((iHashCode + (textView != null ? textView.hashCode() : 0)) * 31) + this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0659t) {
            C0659t c0659t = (C0659t) obj;
            if (kotlin.jvm.internal.j.b(this.f7055a, c0659t.f7055a) && kotlin.jvm.internal.j.b(this.f7056b, c0659t.f7056b) && this.c == c0659t.c && kotlin.jvm.internal.j.b(this.f7057d, c0659t.f7057d) && kotlin.jvm.internal.j.b(this.e, c0659t.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = a() * 31;
        C0659t c0659t = this.f7057d;
        int iA2 = (iA + (c0659t != null ? c0659t.a() : 0)) * 31;
        C0659t c0659t2 = this.e;
        return iA2 + (c0659t2 != null ? c0659t2.a() : 0);
    }

    public final String toString() {
        String strC = kotlin.jvm.internal.z.a(C0659t.class).c();
        int iHashCode = this.f7056b.hashCode();
        String strC2 = kotlin.jvm.internal.z.a(C0659t.class).c();
        C0659t c0659t = this.f7057d;
        int iHashCode2 = c0659t != null ? c0659t.hashCode() : 0;
        String strC3 = kotlin.jvm.internal.z.a(C0659t.class).c();
        C0659t c0659t2 = this.e;
        int iHashCode3 = c0659t2 != null ? c0659t2.hashCode() : 0;
        StringBuilder sbV = We.s.v(strC, " [sectionIndexLabel=");
        sbV.append(this.f7055a);
        sbV.append(", displayedTextView=TextView@");
        sbV.append(iHashCode);
        sbV.append(", indexItemPosition=");
        sbV.append(this.c);
        sbV.append(", previousSectionIndexItem=");
        sbV.append(strC2);
        sbV.append("@");
        sbV.append(iHashCode2);
        sbV.append(", nextSectionIndexItem=");
        sbV.append(strC3);
        sbV.append("@");
        return We.s.o(sbV, "]", iHashCode3);
    }
}
