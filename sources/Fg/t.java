package Fg;

import Bg.c0;
import bj.InterfaceC1031b;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Cg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f1631b = new t(0);
    public static final t c = new t(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f1632d = new t(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1633a;

    public /* synthetic */ t(int i) {
        this.f1633a = i;
    }

    @Override // Cg.a
    public final void a(wg.c client, InterfaceC1031b interfaceC1031b) {
        switch (this.f1633a) {
            case 0:
                kotlin.jvm.internal.j.g(client, "client");
                client.f.f(Kg.b.j, new c0((qj.n) interfaceC1031b, null, 3));
                break;
            case 1:
                kotlin.jvm.internal.j.g(client, "client");
                client.h.f(Kg.b.h, new c0((qj.n) interfaceC1031b, null, 4));
                break;
            default:
                kotlin.jvm.internal.j.g(client, "client");
                client.f20790g.f(Jg.f.f2531n, new c0((qj.n) interfaceC1031b, null, 5));
                break;
        }
    }
}
