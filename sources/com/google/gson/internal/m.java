package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f9996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9997b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f9996a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9996a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new String(this.f9996a, i, i4 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f9997b == null) {
            this.f9997b = new String(this.f9996a);
        }
        return this.f9997b;
    }
}
