package Ui;

import io.split.android.client.dtos.DataType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5988b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5989d;
    public final DataType e;

    public d(long j, long j6, DataType dataType) {
        this.f5987a = j;
        this.f5988b = j6;
        this.e = dataType;
        if (dataType == DataType.DATETIME) {
            this.c = l.b(Long.valueOf(j)).longValue();
            this.f5989d = l.b(Long.valueOf(j6)).longValue();
        } else {
            this.c = j;
            this.f5989d = j6;
        }
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        Long lB = this.e == DataType.DATETIME ? l.b(obj) : l.c(obj);
        return lB != null && lB.longValue() >= this.c && lB.longValue() <= this.f5989d;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5987a == dVar.f5987a && this.f5988b == dVar.f5988b;
    }

    public final int hashCode() {
        long j = this.f5987a;
        int i = (527 + ((int) (j ^ (j >>> 32)))) * 31;
        long j6 = this.f5988b;
        return i + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "between " + this.f5987a + " and " + this.f5988b;
    }
}
