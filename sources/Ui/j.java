package Ui;

import io.split.android.client.dtos.DataType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6000b;
    public final DataType c;

    public j(long j, DataType dataType) {
        this.f5999a = j;
        this.c = dataType;
        if (dataType == DataType.DATETIME) {
            this.f6000b = l.b(Long.valueOf(j)).longValue();
        } else {
            this.f6000b = j;
        }
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        Long lB = this.c == DataType.DATETIME ? l.b(obj) : l.c(obj);
        return lB != null && lB.longValue() <= this.f6000b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f5999a == ((j) obj).f5999a;
    }

    public final int hashCode() {
        long j = this.f5999a;
        return 527 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "<= " + this.f5999a;
    }
}
