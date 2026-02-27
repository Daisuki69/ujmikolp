package Ui;

import io.split.android.client.dtos.DataType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5996b;
    public final DataType c;

    public h(long j, DataType dataType) {
        this.f5995a = j;
        this.c = dataType;
        if (dataType == DataType.DATETIME) {
            this.f5996b = l.a(Long.valueOf(j)).longValue();
        } else {
            this.f5996b = j;
        }
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        Long lA = this.c == DataType.DATETIME ? l.a(obj) : l.c(obj);
        return lA != null && lA.longValue() == this.f5996b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f5995a == ((h) obj).f5995a;
    }

    public final int hashCode() {
        long j = this.f5995a;
        return 527 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "== " + this.f5995a;
    }
}
