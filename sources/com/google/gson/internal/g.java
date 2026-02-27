package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9982a;

    public g(String str) {
        this.f9982a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f9982a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f9982a.equals(((g) obj).f9982a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f9982a);
    }

    public final int hashCode() {
        return this.f9982a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f9982a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return e.j(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f9982a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return e.j(str).longValue();
        }
    }

    public final String toString() {
        return this.f9982a;
    }
}
