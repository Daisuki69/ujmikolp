package c7;

import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1079c extends AbstractC1082f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9301b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f9302d;

    public C1079c(String title, String value, String str, Integer num, int i) {
        num = (i & 8) != 0 ? null : num;
        j.g(title, "title");
        j.g(value, "value");
        this.f9300a = title;
        this.f9301b = value;
        this.c = str;
        this.f9302d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1079c)) {
            return false;
        }
        C1079c c1079c = (C1079c) obj;
        return j.b(this.f9300a, c1079c.f9300a) && j.b(this.f9301b, c1079c.f9301b) && j.b(this.c, c1079c.c) && j.b(this.f9302d, c1079c.f9302d);
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(this.f9300a.hashCode() * 31, 31, this.f9301b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f9302d;
        return AbstractC1331a.k(iHashCode, num != null ? num.hashCode() : 0, 31, 1237);
    }

    public final String toString() {
        return "LabelTwoValuesReviewInfoUiModel(title=" + this.f9300a + ", value=" + this.f9301b + ", secondValue=" + this.c + ", icon=" + this.f9302d + ", isRightAlignment=false)";
    }
}
