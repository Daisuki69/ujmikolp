package com.paymaya.common.utility;

import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes3.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10435b;
    public final String c;

    public T(String str, String str2, String str3) {
        this.f10434a = str;
        this.f10435b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t5 = (T) obj;
        return kotlin.jvm.internal.j.b(this.f10434a, t5.f10434a) && kotlin.jvm.internal.j.b(this.f10435b, t5.f10435b) && kotlin.jvm.internal.j.b(this.c, t5.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1414e.c(this.f10434a.hashCode() * 31, 31, this.f10435b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QRFieldTag(rootTag=");
        sb2.append(this.f10434a);
        sb2.append(", subTag=");
        sb2.append(this.f10435b);
        sb2.append(", name=");
        return We.s.p(sb2, this.c, ")");
    }
}
