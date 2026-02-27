package com.squareup.wire.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class IntArrayList {
    public static final Companion Companion = new Companion(null);
    private int[] data;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntArrayList forDecoding(long j, long j6) {
            long j7 = j / j6;
            if (j7 > 2147483647L) {
                j7 = 2147483647L;
            }
            return new IntArrayList((int) j7);
        }

        private Companion() {
        }

        public final IntArrayList forDecoding(int i, int i4) {
            return new IntArrayList(i / i4);
        }
    }

    public IntArrayList(int i) {
        this.data = new int[i];
    }

    private final void ensureCapacity(int i) {
        int[] iArr = this.data;
        if (i > iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(((iArr.length * 3) / 2) + 1, i));
            j.f(iArrCopyOf, "copyOf(...)");
            this.data = iArrCopyOf;
        }
    }

    public final void add(int i) {
        ensureCapacity(this.size + 1);
        int[] iArr = this.data;
        int i4 = this.size;
        this.size = i4 + 1;
        iArr[i4] = i;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final int[] toArray() {
        int i = this.size;
        int[] iArr = this.data;
        if (i < iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            j.f(iArrCopyOf, "copyOf(...)");
            this.data = iArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        int[] iArrCopyOf = Arrays.copyOf(this.data, this.size);
        j.f(iArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(iArrCopyOf);
        j.f(string, "toString(...)");
        return string;
    }
}
