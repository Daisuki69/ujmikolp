package Z9;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6921b;

    public b(String title, String value) {
        j.g(title, "title");
        j.g(value, "value");
        this.f6920a = title;
        this.f6921b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.b(this.f6920a, bVar.f6920a) && j.b(this.f6921b, bVar.f6921b);
    }

    public final int hashCode() {
        return this.f6921b.hashCode() + (this.f6920a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentFieldReviewUiModel(title=");
        sb2.append(this.f6920a);
        sb2.append(", value=");
        return s.p(sb2, this.f6921b, ")");
    }
}
