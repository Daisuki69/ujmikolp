package com.squareup.wire.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FloatArrayList {
    public static final Companion Companion = new Companion(null);
    private float[] data;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FloatArrayList forDecoding(long j, long j6) {
            long j7 = j / j6;
            if (j7 > 2147483647L) {
                j7 = 2147483647L;
            }
            return new FloatArrayList((int) j7);
        }

        private Companion() {
        }

        public final FloatArrayList forDecoding(int i, int i4) {
            return new FloatArrayList(i / i4);
        }
    }

    public FloatArrayList(int i) {
        this.data = new float[i];
    }

    private final void ensureCapacity(int i) {
        float[] fArr = this.data;
        if (i > fArr.length) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(((fArr.length * 3) / 2) + 1, i));
            j.f(fArrCopyOf, "copyOf(...)");
            this.data = fArrCopyOf;
        }
    }

    public final void add(float f) {
        ensureCapacity(this.size + 1);
        float[] fArr = this.data;
        int i = this.size;
        this.size = i + 1;
        fArr[i] = f;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final float[] toArray() {
        int i = this.size;
        float[] fArr = this.data;
        if (i < fArr.length) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            j.f(fArrCopyOf, "copyOf(...)");
            this.data = fArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        float[] fArrCopyOf = Arrays.copyOf(this.data, this.size);
        j.f(fArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(fArrCopyOf);
        j.f(string, "toString(...)");
        return string;
    }
}
