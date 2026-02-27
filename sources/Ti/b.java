package Ti;

import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5846b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5847d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5848g;
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f5849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f5850l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f5851n;

    public b(String str, int i, boolean z4, String str2, List list, String str3, long j, int i4, int i6, int i10, Map map, Set set, boolean z5, ArrayList arrayList) {
        this.f5845a = str;
        this.f5846b = i;
        this.c = z4;
        this.f5847d = str2;
        this.e = Collections.unmodifiableList(new ArrayList(list));
        this.f = str3;
        this.f5848g = j;
        this.j = i10;
        this.f5849k = map;
        this.m = z5;
        if (str2 == null) {
            throw new IllegalArgumentException("DefaultTreatment is null");
        }
        this.h = i4;
        this.i = i6;
        this.f5850l = set;
        this.f5851n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5845a.equals(bVar.f5845a) && this.f5846b == bVar.f5846b && this.c == bVar.c && this.f5847d.equals(bVar.f5847d) && this.e.equals(bVar.e) && Objects.equals(this.f, bVar.f) && this.f5848g == bVar.f5848g && this.j == bVar.j && Objects.equals(this.f5849k, bVar.f5849k) && Objects.equals(this.f5850l, bVar.f5850l) && this.m == bVar.m && Objects.equals(this.f5851n, bVar.f5851n);
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(527, 31, this.f5845a);
        int i = this.f5846b;
        int iHashCode = (this.e.hashCode() + AbstractC1414e.c((((iC + (i ^ (i >>> 32))) * 31) + (this.c ? 1 : 0)) * 31, 31, this.f5847d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        long j = this.f5848g;
        int i4 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        int i6 = this.j;
        int i10 = (i4 + (i6 ^ (i6 >>> 32))) * 31;
        Set set = this.f5850l;
        int iHashCode3 = (((i10 + (set != null ? set.hashCode() : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        ArrayList arrayList = this.f5851n;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "name:" + this.f5845a + ", seed:" + this.f5846b + ", killed:" + this.c + ", default treatment:" + this.f5847d + ", parsedConditions:" + this.e + ", trafficTypeName:" + this.f + ", changeNumber:" + this.f5848g + ", algo:" + this.j + ", config:" + this.f5849k + ", sets:" + this.f5850l + ", impressionsDisabled:" + this.m + ", prerequisites:" + this.f5851n;
    }
}
