package c7;

import We.s;
import android.view.View;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1077a extends AbstractC1082f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9293b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f9294d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9295g;

    public C1077a(String str, String str2, String str3, View.OnClickListener onClickListener, String str4, boolean z4, String str5, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        onClickListener = (i & 8) != 0 ? null : onClickListener;
        str4 = (i & 16) != 0 ? null : str4;
        z4 = (i & 32) != 0 ? true : z4;
        str5 = (i & 64) != 0 ? null : str5;
        this.f9292a = str;
        this.f9293b = str2;
        this.c = str3;
        this.f9294d = onClickListener;
        this.e = str4;
        this.f = z4;
        this.f9295g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1077a)) {
            return false;
        }
        C1077a c1077a = (C1077a) obj;
        return j.b(this.f9292a, c1077a.f9292a) && j.b(this.f9293b, c1077a.f9293b) && j.b(this.c, c1077a.c) && j.b(this.f9294d, c1077a.f9294d) && j.b(this.e, c1077a.e) && this.f == c1077a.f && j.b(this.f9295g, c1077a.f9295g);
    }

    public final int hashCode() {
        int iHashCode = this.f9292a.hashCode() * 31;
        String str = this.f9293b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f9294d;
        int iHashCode4 = (iHashCode3 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str4 = this.f9295g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasicReviewInfoTableLayoutUiModel(header=");
        sb2.append(this.f9292a);
        sb2.append(", value=");
        sb2.append(this.f9293b);
        sb2.append(", actionTextSecondary=");
        sb2.append(this.c);
        sb2.append(", actionListenerSecondary=");
        sb2.append(this.f9294d);
        sb2.append(", badge=");
        sb2.append(this.e);
        sb2.append(", badgeEnabled=");
        sb2.append(this.f);
        sb2.append(", description=");
        return s.p(sb2, this.f9295g, ")");
    }
}
