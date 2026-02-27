package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.k f10034a = new com.google.gson.internal.k(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof q) && ((q) obj).f10034a.equals(this.f10034a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f10034a.hashCode();
    }

    public final void k(String str, o oVar) {
        if (oVar == null) {
            oVar = p.f10033a;
        }
        this.f10034a.put(str, oVar);
    }

    public final void l(String str, String str2) {
        k(str, str2 == null ? p.f10033a : new r(str2));
    }

    public final o m(String str) {
        return (o) this.f10034a.get(str);
    }

    public final q n(String str) {
        return (q) this.f10034a.get(str);
    }
}
