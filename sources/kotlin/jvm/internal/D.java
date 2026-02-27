package kotlin.jvm.internal;

import bj.InterfaceC1031b;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import rj.InterfaceC2210a;
import rj.InterfaceC2211b;
import rj.InterfaceC2212c;
import rj.InterfaceC2214e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f18175a = new Object[0];

    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC2210a) && !(obj instanceof InterfaceC2211b)) {
            g(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            j.k(e, D.class.getName());
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof InterfaceC2210a) && !(obj instanceof InterfaceC2212c)) {
            g(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            j.k(e, D.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC2210a) && !(obj instanceof InterfaceC2214e)) {
            g(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            j.k(e, D.class.getName());
            throw e;
        }
    }

    public static void d(int i, Object obj) {
        if (obj == null || e(i, obj)) {
            return;
        }
        g(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean e(int i, Object obj) {
        if (obj instanceof InterfaceC1031b) {
            if ((obj instanceof InterfaceC1792g ? ((InterfaceC1792g) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof qj.n ? 3 : obj instanceof qj.o ? 4 : obj instanceof qj.p ? 5 : obj instanceof qj.q ? 6 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final Rj.f f(Object[] array) {
        j.g(array, "array");
        return new Rj.f(array);
    }

    public static void g(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(androidx.camera.core.impl.a.j(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        j.k(classCastException, D.class.getName());
        throw classCastException;
    }

    public static final Object[] h(Collection collection) {
        j.g(collection, "collection");
        int size = collection.size();
        Object[] objArr = f18175a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i4 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i4 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i6 = ((i4 * 3) + 1) >>> 1;
                if (i6 <= i4) {
                    i6 = 2147483645;
                    if (i4 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                j.f(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i4);
                j.f(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i = i4;
        }
    }

    public static final Object[] i(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        j.g(collection, "collection");
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    j.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i4 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i4 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i6 = ((i4 * 3) + 1) >>> 1;
                        if (i6 <= i4) {
                            i6 = 2147483645;
                            if (i4 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                        j.f(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i4] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i4);
                        j.f(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i4;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
