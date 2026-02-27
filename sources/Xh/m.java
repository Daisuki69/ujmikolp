package Xh;

import D.S;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.split.android.client.storage.splits.c f6656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qi.c f6657b;
    public final zi.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b f6658d;

    public m(io.split.android.client.storage.splits.c cVar, Qi.c cVar2, zi.c cVar3) {
        this.f6656a = cVar;
        this.f6657b = cVar2;
        this.c = cVar3;
    }

    public final b a() {
        if (this.f6658d == null) {
            synchronized (this) {
                try {
                    if (this.f6658d == null) {
                        this.f6658d = new b(new Cg.c(new S(), this.f6656a), new Si.d(), this.f6657b, new c(), this.c);
                    }
                } finally {
                }
            }
        }
        return this.f6658d;
    }
}
