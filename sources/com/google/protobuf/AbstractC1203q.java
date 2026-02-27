package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1203q extends AbstractC1187a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1203q> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected f0 unknownFields;

    public AbstractC1203q() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = f0.f;
    }

    public static AbstractC1203q l(Class cls) {
        AbstractC1203q abstractC1203q = defaultInstanceMap.get(cls);
        if (abstractC1203q == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1203q = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1203q != null) {
            return abstractC1203q;
        }
        AbstractC1203q abstractC1203q2 = (AbstractC1203q) ((AbstractC1203q) o0.b(cls)).k(6);
        if (abstractC1203q2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1203q2);
        return abstractC1203q2;
    }

    public static Object m(Method method, AbstractC1187a abstractC1187a, Object... objArr) {
        try {
            return method.invoke(abstractC1187a, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static InterfaceC1206u p(InterfaceC1206u interfaceC1206u) {
        int size = interfaceC1206u.size();
        return interfaceC1206u.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static void q(Class cls, AbstractC1203q abstractC1203q) {
        abstractC1203q.o();
        defaultInstanceMap.put(cls, abstractC1203q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t5 = T.c;
        t5.getClass();
        return t5.a(getClass()).d(this, (AbstractC1203q) obj);
    }

    @Override // com.google.protobuf.AbstractC1187a
    public final int h(W w6) {
        int iC;
        int iC2;
        if (n()) {
            if (w6 == null) {
                T t5 = T.c;
                t5.getClass();
                iC2 = t5.a(getClass()).c(this);
            } else {
                iC2 = w6.c(this);
            }
            if (iC2 >= 0) {
                return iC2;
            }
            throw new IllegalStateException(We.s.f(iC2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (w6 == null) {
            T t10 = T.c;
            t10.getClass();
            iC = t10.a(getClass()).c(this);
        } else {
            iC = w6.c(this);
        }
        r(iC);
        return iC;
    }

    public final int hashCode() {
        if (n()) {
            T t5 = T.c;
            t5.getClass();
            return t5.a(getClass()).b(this);
        }
        if (this.memoizedHashCode == 0) {
            T t10 = T.c;
            t10.getClass();
            this.memoizedHashCode = t10.a(getClass()).b(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC1187a
    public final void i(C1193g c1193g) {
        T t5 = T.c;
        t5.getClass();
        W wA = t5.a(getClass());
        E e = c1193g.c;
        if (e == null) {
            e = new E(c1193g);
        }
        wA.a(this, e);
    }

    public final AbstractC1201o j() {
        return (AbstractC1201o) k(5);
    }

    public abstract Object k(int i);

    public final boolean n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void r(int i) {
        if (i < 0) {
            throw new IllegalStateException(We.s.f(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = L.f10055a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        L.c(this, sb2, 0);
        return sb2.toString();
    }
}
