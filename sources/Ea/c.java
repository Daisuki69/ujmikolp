package ea;

import com.paymaya.domain.model.Biller;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Biller f16610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Biller biller) {
        super(1);
        kotlin.jvm.internal.j.g(biller, numX49.tnTj78("bdWG"));
        this.f16610b = biller;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.j.b(this.f16610b, ((c) obj).f16610b);
    }

    public final int hashCode() {
        return this.f16610b.hashCode();
    }

    public final String toString() {
        return numX49.tnTj78("bdW3") + this.f16610b + numX49.tnTj78("bdWy");
    }
}
