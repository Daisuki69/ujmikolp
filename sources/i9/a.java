package i9;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17126b;
    public final int c;

    public a(int i, int i4, int i6) {
        this.f17125a = i;
        this.f17126b = i4;
        this.c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17125a == aVar.f17125a && this.f17126b == aVar.f17126b && this.c == aVar.c;
    }

    public final int hashCode() {
        return (((this.f17125a * 31) + this.f17126b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MayaWizardPagerItem(imageResId=");
        sb2.append(this.f17125a);
        sb2.append(", titleStringResId=");
        sb2.append(this.f17126b);
        sb2.append(", descriptionResId=");
        return s.o(sb2, ")", this.c);
    }
}
