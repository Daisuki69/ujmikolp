package com.google.protobuf;

import com.google.android.gms.internal.ads.AbstractC1173g;

/* JADX INFO: loaded from: classes2.dex */
public final class N implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1187a f10061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f10062b;
    public final C1196j c;

    public N(e0 e0Var, C1196j c1196j, AbstractC1187a abstractC1187a) {
        this.f10062b = e0Var;
        c1196j.getClass();
        this.c = c1196j;
        this.f10061a = abstractC1187a;
    }

    @Override // com.google.protobuf.W
    public final void a(Object obj, E e) {
        this.c.getClass();
        AbstractC1173g.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.W
    public final int b(AbstractC1203q abstractC1203q) {
        ((g0) this.f10062b).getClass();
        return abstractC1203q.unknownFields.hashCode();
    }

    @Override // com.google.protobuf.W
    public final int c(AbstractC1203q abstractC1203q) {
        ((g0) this.f10062b).getClass();
        f0 f0Var = abstractC1203q.unknownFields;
        int i = f0Var.f10095d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i4 = 0; i4 < f0Var.f10093a; i4++) {
            int i6 = f0Var.f10094b[i4] >>> 3;
            iD += C1193g.d(3, (C1192f) f0Var.c[i4]) + C1193g.i(i6) + C1193g.h(2) + (C1193g.h(1) * 2);
        }
        f0Var.f10095d = iD;
        return iD;
    }

    @Override // com.google.protobuf.W
    public final boolean d(AbstractC1203q abstractC1203q, AbstractC1203q abstractC1203q2) {
        g0 g0Var = (g0) this.f10062b;
        g0Var.getClass();
        f0 f0Var = abstractC1203q.unknownFields;
        g0Var.getClass();
        return f0Var.equals(abstractC1203q2.unknownFields);
    }

    @Override // com.google.protobuf.W
    public final boolean isInitialized(Object obj) {
        this.c.getClass();
        AbstractC1173g.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.W
    public final void makeImmutable(Object obj) {
        ((g0) this.f10062b).getClass();
        f0 f0Var = ((AbstractC1203q) obj).unknownFields;
        if (f0Var.e) {
            f0Var.e = false;
        }
        this.c.getClass();
        AbstractC1173g.w(obj);
        throw null;
    }

    @Override // com.google.protobuf.W
    public final void mergeFrom(Object obj, Object obj2) {
        X.j(this.f10062b, obj, obj2);
    }

    @Override // com.google.protobuf.W
    public final AbstractC1203q newInstance() {
        AbstractC1187a abstractC1187a = this.f10061a;
        return abstractC1187a instanceof AbstractC1203q ? (AbstractC1203q) ((AbstractC1203q) abstractC1187a).k(4) : ((AbstractC1201o) ((AbstractC1203q) abstractC1187a).k(5)).h();
    }
}
