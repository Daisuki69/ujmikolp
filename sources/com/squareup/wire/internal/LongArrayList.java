package com.squareup.wire.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class LongArrayList {
    public static final Companion Companion = new Companion(null);
    private long[] data;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LongArrayList forDecoding(long j, long j6) {
            long j7 = j / j6;
            if (j7 > 2147483647L) {
                j7 = 2147483647L;
            }
            return new LongArrayList((int) j7);
        }

        private Companion() {
        }

        public final LongArrayList forDecoding(int i, int i4) {
            return new LongArrayList(i / i4);
        }
    }

    public LongArrayList(int i) {
        this.data = new long[i];
    }

    private final void ensureCapacity(int i) {
        long[] jArr = this.data;
        if (i > jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(((jArr.length * 3) / 2) + 1, i));
            j.f(jArrCopyOf, "copyOf(...)");
            this.data = jArrCopyOf;
        }
    }

    public final void add(long j) {
        ensureCapacity(this.size + 1);
        long[] jArr = this.data;
        int i = this.size;
        this.size = i + 1;
        jArr[i] = j;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final long[] toArray() {
        int i = this.size;
        long[] jArr = this.data;
        if (i < jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            j.f(jArrCopyOf, "copyOf(...)");
            this.data = jArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        long[] jArrCopyOf = Arrays.copyOf(this.data, this.size);
        j.f(jArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(jArrCopyOf);
        j.f(string, "toString(...)");
        return string;
    }
}
