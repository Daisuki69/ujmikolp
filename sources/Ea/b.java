package ea;

import We.s;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16609b;

    public b(String str) {
        super(0);
        this.f16609b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && kotlin.jvm.internal.j.b(this.f16609b, ((b) obj).f16609b);
    }

    public final int hashCode() {
        return this.f16609b.hashCode();
    }

    public final String toString() {
        return s.p(new StringBuilder(numX49.tnTj78("bdWu")), this.f16609b, numX49.tnTj78("bdWV"));
    }
}
