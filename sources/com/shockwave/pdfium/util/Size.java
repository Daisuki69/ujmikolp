package com.shockwave.pdfium.util;

/* JADX INFO: loaded from: classes4.dex */
public class Size {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15514b;

    public Size(int i, int i4) {
        this.f15513a = i;
        this.f15514b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f15513a == size.f15513a && this.f15514b == size.f15514b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f15513a;
        return ((i >>> 16) | (i << 16)) ^ this.f15514b;
    }

    public final String toString() {
        return this.f15513a + "x" + this.f15514b;
    }
}
