package n;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f18532b;

    public w(Object obj) {
        this.f18531a = obj;
        this.f18532b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        Object obj2 = this.f18531a;
        if (obj2 != null && obj2.equals(wVar.f18531a)) {
            return true;
        }
        Throwable th2 = this.f18532b;
        if (th2 == null || wVar.f18532b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18531a, this.f18532b});
    }

    public w(Throwable th2) {
        this.f18532b = th2;
        this.f18531a = null;
    }
}
