package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f10117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f10118b;
    public static final n0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f10119d;
    public static final boolean e;
    public static final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f10120g;

    static {
        Unsafe unsafeJ = j();
        f10117a = unsafeJ;
        f10118b = AbstractC1189c.f10081a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        n0 m0Var = null;
        if (unsafeJ != null) {
            if (!AbstractC1189c.a()) {
                m0Var = new m0(unsafeJ);
            } else if (zF) {
                m0Var = new l0(unsafeJ, 1);
            } else if (zF2) {
                m0Var = new l0(unsafeJ, 0);
            }
        }
        c = m0Var;
        f10119d = m0Var == null ? false : m0Var.s();
        e = m0Var == null ? false : m0Var.r();
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && m0Var != null) {
            m0Var.j(fieldE);
        }
        f10120g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f10117a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1189c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!AbstractC1189c.a()) {
            return false;
        }
        try {
            Class cls2 = f10118b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j) {
        return c.d(bArr, f + j);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((c.g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((c.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new k0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b8) {
        c.l(bArr, f + j, b8);
    }

    public static void l(Object obj, long j, byte b8) {
        long j6 = (-4) & j;
        int iG = c.g(obj, j6);
        int i = ((~((int) j)) & 3) << 3;
        n(obj, j6, ((255 & b8) << i) | (iG & (~(255 << i))));
    }

    public static void m(Object obj, long j, byte b8) {
        long j6 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(obj, j6, ((255 & b8) << i) | (c.g(obj, j6) & (~(255 << i))));
    }

    public static void n(Object obj, long j, int i) {
        c.o(obj, j, i);
    }

    public static void o(Object obj, long j, Object obj2) {
        c.q(obj, j, obj2);
    }
}
