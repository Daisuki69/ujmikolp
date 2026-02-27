package Fg;

import Ng.C0496d;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Og.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.utils.io.k f1606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0496d f1607b;
    public final Long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ng.v f1608d;
    public final Ng.m e;

    public f(Og.f originalContent, io.ktor.utils.io.k kVar) {
        kotlin.jvm.internal.j.g(originalContent, "originalContent");
        this.f1606a = kVar;
        this.f1607b = originalContent.b();
        this.c = originalContent.a();
        this.f1608d = originalContent.d();
        this.e = originalContent.c();
    }

    @Override // Og.f
    public final Long a() {
        return this.c;
    }

    @Override // Og.f
    public final C0496d b() {
        return this.f1607b;
    }

    @Override // Og.f
    public final Ng.m c() {
        return this.e;
    }

    @Override // Og.f
    public final Ng.v d() {
        return this.f1608d;
    }

    @Override // Og.e
    public final io.ktor.utils.io.n e() {
        return this.f1606a;
    }
}
