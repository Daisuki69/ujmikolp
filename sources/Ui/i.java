package Ui;

import io.split.android.client.dtos.DataType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5998b;
    public final DataType c;

    public i(long j, DataType dataType) {
        this.f5997a = j;
        this.c = dataType;
        if (dataType == DataType.DATETIME) {
            this.f5998b = l.b(Long.valueOf(j)).longValue();
        } else {
            this.f5998b = j;
        }
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        Long lB = this.c == DataType.DATETIME ? l.b(obj) : l.c(obj);
        return lB != null && lB.longValue() >= this.f5998b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f5997a == ((i) obj).f5997a;
    }

    public final int hashCode() {
        long j = this.f5997a;
        return 527 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return ">= " + this.f5997a;
    }
}
