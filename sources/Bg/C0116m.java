package Bg;

import Ng.AbstractC0494b;
import Ng.C0496d;

/* JADX INFO: renamed from: Bg.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0116m extends Og.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0496d f542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f543b;
    public final /* synthetic */ Object c;

    public C0116m(C0496d c0496d, Object obj) {
        this.c = obj;
        if (c0496d == null) {
            C0496d c0496d2 = AbstractC0494b.f4422a;
            c0496d = AbstractC0494b.f4423b;
        }
        this.f542a = c0496d;
        this.f543b = ((byte[]) obj).length;
    }

    @Override // Og.f
    public final Long a() {
        return Long.valueOf(this.f543b);
    }

    @Override // Og.f
    public final C0496d b() {
        return this.f542a;
    }

    @Override // Og.d
    public final byte[] e() {
        return (byte[]) this.c;
    }
}
