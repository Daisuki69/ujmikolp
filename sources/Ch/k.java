package ch;

import dOYHB6.tiZVw8.numX49;
import vh.C2356g;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f9368b = new k(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9369a;

    public k(Object obj) {
        this.f9369a = obj;
    }

    public final Throwable a() {
        Object obj = this.f9369a;
        if (obj instanceof C2356g) {
            return ((C2356g) obj).f20505a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return jh.e.a(this.f9369a, ((k) obj).f9369a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9369a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f9369a;
        if (obj == null) {
            return numX49.tnTj78("bt8uo");
        }
        boolean z4 = obj instanceof C2356g;
        String strTnTj78 = numX49.tnTj78("bt8uK");
        if (z4) {
            return numX49.tnTj78("bt8uw") + ((C2356g) obj).f20505a + strTnTj78;
        }
        return numX49.tnTj78("bt8uc") + obj + strTnTj78;
    }
}
