package Dj;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f1193b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1194a;

    public static final Object a(Object obj) {
        if (obj instanceof k) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return kotlin.jvm.internal.j.b(this.f1194a, ((l) obj).f1194a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1194a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f1194a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
