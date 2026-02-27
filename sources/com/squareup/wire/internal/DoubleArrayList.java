package com.squareup.wire.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleArrayList {
    public static final Companion Companion = new Companion(null);
    private double[] data;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DoubleArrayList forDecoding(long j, long j6) {
            long j7 = j / j6;
            if (j7 > 2147483647L) {
                j7 = 2147483647L;
            }
            return new DoubleArrayList((int) j7);
        }

        private Companion() {
        }

        public final DoubleArrayList forDecoding(int i, int i4) {
            return new DoubleArrayList(i / i4);
        }
    }

    public DoubleArrayList(int i) {
        this.data = new double[i];
    }

    private final void ensureCapacity(int i) {
        double[] dArr = this.data;
        if (i > dArr.length) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(((dArr.length * 3) / 2) + 1, i));
            j.f(dArrCopyOf, "copyOf(...)");
            this.data = dArrCopyOf;
        }
    }

    public final void add(double d10) {
        ensureCapacity(this.size + 1);
        double[] dArr = this.data;
        int i = this.size;
        this.size = i + 1;
        dArr[i] = d10;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final double[] toArray() {
        int i = this.size;
        double[] dArr = this.data;
        if (i < dArr.length) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            j.f(dArrCopyOf, "copyOf(...)");
            this.data = dArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        double[] dArrCopyOf = Arrays.copyOf(this.data, this.size);
        j.f(dArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(dArrCopyOf);
        j.f(string, "toString(...)");
        return string;
    }
}
