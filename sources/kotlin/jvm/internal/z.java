package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f18196a;

    static {
        A a8 = null;
        try {
            a8 = (A) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a8 == null) {
            a8 = new A();
        }
        f18196a = a8;
    }

    public static C1790e a(Class cls) {
        f18196a.getClass();
        return new C1790e(cls);
    }

    public static void b(E e, F f) {
        A a8 = f18196a;
        List upperBounds = Collections.singletonList(f);
        a8.getClass();
        j.g(upperBounds, "upperBounds");
        if (e.f18177b == null) {
            e.f18177b = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + e + "' have already been initialized.").toString());
    }

    public static F c(Class cls) {
        C1790e c1790eA = a(cls);
        List list = Collections.EMPTY_LIST;
        f18196a.getClass();
        return A.b(c1790eA, list, false);
    }
}
