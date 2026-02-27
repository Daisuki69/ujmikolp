package V2;

import We.s;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6038b;

    public a(String str, String str2) {
        this.f6037a = str;
        if (str2 == null) {
            throw new NullPointerException(numX49.tnTj78("bPKP"));
        }
        this.f6038b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6037a.equals(aVar.f6037a) && this.f6038b.equals(aVar.f6038b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6037a.hashCode() ^ 1000003) * 1000003) ^ this.f6038b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bPKb"));
        sb2.append(this.f6037a);
        sb2.append(numX49.tnTj78("bPK2"));
        return s.p(sb2, this.f6038b, "}");
    }
}
