package ac;

import com.paymaya.domain.model.Dated;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ac.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0677a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dated f7090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7091b;

    public C0677a(Dated dated) {
        kotlin.jvm.internal.j.g(dated, numX49.tnTj78("buOZ"));
        this.f7090a = dated;
        this.f7091b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0677a)) {
            return false;
        }
        C0677a c0677a = (C0677a) obj;
        return kotlin.jvm.internal.j.b(this.f7090a, c0677a.f7090a) && kotlin.jvm.internal.j.b(this.f7091b, c0677a.f7091b);
    }

    public final int hashCode() {
        int iHashCode = this.f7090a.hashCode() * 31;
        String str = this.f7091b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return numX49.tnTj78("buOk") + this.f7090a + numX49.tnTj78("buOB") + this.f7091b + numX49.tnTj78("buOu");
    }
}
