package qk;

import java.util.concurrent.ConcurrentHashMap;
import oi.C1983a;
import p0.C2004c;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok.a f19811b;
    public final rk.a c;

    public d(int i) {
        this.f19810a = i;
        switch (i) {
            case 1:
                this.f19811b = new g();
                new ConcurrentHashMap();
                this.c = new C1983a();
                break;
            default:
                this.f19811b = new c();
                new ConcurrentHashMap();
                this.c = new C2004c();
                break;
        }
    }

    public final ok.a a() {
        switch (this.f19810a) {
            case 0:
                return (c) this.f19811b;
            default:
                return (g) this.f19811b;
        }
    }
}
