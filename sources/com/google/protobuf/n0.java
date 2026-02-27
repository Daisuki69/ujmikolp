package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f10114a;

    public n0(Unsafe unsafe) {
        this.f10114a = unsafe;
    }

    public final int a(Class cls) {
        return this.f10114a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f10114a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract byte d(Object obj, long j);

    public abstract double e(Object obj, long j);

    public abstract float f(Object obj, long j);

    public final int g(Object obj, long j) {
        return this.f10114a.getInt(obj, j);
    }

    public final long h(Object obj, long j) {
        return this.f10114a.getLong(obj, j);
    }

    public final Object i(Object obj, long j) {
        return this.f10114a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.f10114a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z4);

    public abstract void l(Object obj, long j, byte b8);

    public abstract void m(Object obj, long j, double d10);

    public abstract void n(Object obj, long j, float f);

    public final void o(Object obj, long j, int i) {
        this.f10114a.putInt(obj, j, i);
    }

    public final void p(Object obj, long j, long j6) {
        this.f10114a.putLong(obj, j, j6);
    }

    public final void q(Object obj, long j, Object obj2) {
        this.f10114a.putObject(obj, j, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f10114a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            o0.a(th2);
            return false;
        }
    }

    public abstract boolean s();
}
