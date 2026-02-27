package Ai;

import bi.h;
import bi.i;
import e2.C1421c;
import ki.C1781b;
import xi.C2483b;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1781b f324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1421c f325b;
    public final C2483b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.split.android.client.storage.attributes.d f326d;

    public b(C1781b c1781b, h hVar, C1421c c1421c, io.split.android.client.storage.attributes.d dVar) {
        this.f324a = c1781b;
        this.f325b = c1421c;
        this.f326d = dVar;
        this.c = new C2483b(hVar, i.i);
    }

    @Override // Ai.a
    public final void a() {
        C1421c c1421c = this.f325b;
        this.f324a.l(new Ci.a(3, (String) c1421c.f16555b, (io.split.android.client.storage.attributes.c) c1421c.c, this.f326d), this.c);
    }
}
