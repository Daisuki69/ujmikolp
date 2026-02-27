package c7;

import defpackage.AbstractC1414e;

/* JADX INFO: renamed from: c7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1080d extends AbstractC1082f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9304b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W4.b f9305d;

    public C1080d(String str, String str2, String str3, W4.b bVar) {
        this.f9303a = str;
        this.f9304b = str2;
        this.c = str3;
        this.f9305d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1080d)) {
            return false;
        }
        C1080d c1080d = (C1080d) obj;
        return this.f9303a.equals(c1080d.f9303a) && this.f9304b.equals(c1080d.f9304b) && this.c.equals(c1080d.c) && this.f9305d.equals(c1080d.f9305d);
    }

    public final int hashCode() {
        return ((this.f9305d.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.f9303a.hashCode() * 31, 31, this.f9304b), 31, this.c)) * 31) + 1237;
    }

    public final String toString() {
        return "LabelValueLinkReviewInfoUiModel(title=" + this.f9303a + ", value=" + this.f9304b + ", linkText=" + this.c + ", linkClickListener=" + this.f9305d + ", isRightAlignment=false)";
    }
}
