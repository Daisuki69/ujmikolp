package b2;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f8374b;

    public n(Class cls, Class cls2) {
        this.f8373a = cls;
        this.f8374b = cls2;
    }

    public static n a(Class cls) {
        return new n(m.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f8374b.equals(nVar.f8374b)) {
            return this.f8373a.equals(nVar.f8373a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8373a.hashCode() + (this.f8374b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f8374b;
        Class cls2 = this.f8373a;
        if (cls2 == m.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + Global.BLANK + cls.getName();
    }
}
