package com.shockwave.pdfium.util;

/* JADX INFO: loaded from: classes4.dex */
public class SizeF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15516b;

    public SizeF(float f, float f3) {
        this.f15515a = f;
        this.f15516b = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeF) {
            SizeF sizeF = (SizeF) obj;
            if (this.f15515a == sizeF.f15515a && this.f15516b == sizeF.f15516b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15515a) ^ Float.floatToIntBits(this.f15516b);
    }

    public final String toString() {
        return this.f15515a + "x" + this.f15516b;
    }
}
