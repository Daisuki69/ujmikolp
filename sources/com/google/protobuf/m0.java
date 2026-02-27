package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends n0 {
    @Override // com.google.protobuf.n0
    public final boolean c(Object obj, long j) {
        return this.f10114a.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.n0
    public final byte d(Object obj, long j) {
        return this.f10114a.getByte(obj, j);
    }

    @Override // com.google.protobuf.n0
    public final double e(Object obj, long j) {
        return this.f10114a.getDouble(obj, j);
    }

    @Override // com.google.protobuf.n0
    public final float f(Object obj, long j) {
        return this.f10114a.getFloat(obj, j);
    }

    @Override // com.google.protobuf.n0
    public final void k(Object obj, long j, boolean z4) {
        this.f10114a.putBoolean(obj, j, z4);
    }

    @Override // com.google.protobuf.n0
    public final void l(Object obj, long j, byte b8) {
        this.f10114a.putByte(obj, j, b8);
    }

    @Override // com.google.protobuf.n0
    public final void m(Object obj, long j, double d10) {
        this.f10114a.putDouble(obj, j, d10);
    }

    @Override // com.google.protobuf.n0
    public final void n(Object obj, long j, float f) {
        this.f10114a.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.n0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f10114a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            o0.a(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.n0
    public final boolean s() {
        Unsafe unsafe = this.f10114a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (o0.e() != null) {
                    try {
                        Class<?> cls3 = this.f10114a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        o0.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                o0.a(th3);
            }
        }
        return false;
    }
}
