package b2;

import G5.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0859a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8350b;
    public final Set c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8351d;
    public final int e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f8352g;

    public C0859a(String str, Set set, Set set2, int i, int i4, c cVar, Set set3) {
        this.f8349a = str;
        this.f8350b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.f8351d = i;
        this.e = i4;
        this.f = cVar;
        this.f8352g = Collections.unmodifiableSet(set3);
    }

    public static K3.d a(n nVar) {
        return new K3.d(nVar, new n[0]);
    }

    public static K3.d b(Class cls) {
        return new K3.d(cls, new Class[0]);
    }

    public static C0859a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(n.a(cls));
        for (Class cls2 : clsArr) {
            E1.c.d(cls2, "Null interface");
            hashSet.add(n.a(cls2));
        }
        return new C0859a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new p(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8350b.toArray()) + ">{" + this.f8351d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
