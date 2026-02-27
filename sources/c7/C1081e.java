package c7;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1081e extends AbstractC1082f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9307b;

    public C1081e(String title, String value) {
        j.g(title, "title");
        j.g(value, "value");
        this.f9306a = title;
        this.f9307b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1081e)) {
            return false;
        }
        C1081e c1081e = (C1081e) obj;
        return j.b(this.f9306a, c1081e.f9306a) && j.b(this.f9307b, c1081e.f9307b);
    }

    public final int hashCode() {
        return ((this.f9307b.hashCode() + (this.f9306a.hashCode() * 31)) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LabelValueReviewInfoUiModel(title=");
        sb2.append(this.f9306a);
        sb2.append(", value=");
        return s.p(sb2, this.f9307b, ", isRightAlignment=false)");
    }
}
