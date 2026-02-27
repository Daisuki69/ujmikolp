package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1200n f10044b = new C1200n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10045a;

    public E(C1193g c1193g) {
        Charset charset = AbstractC1207v.f10124a;
        if (c1193g == null) {
            throw new NullPointerException("output");
        }
        this.f10045a = c1193g;
        c1193g.c = this;
    }

    public void a(int i, Object obj, W w6) {
        C1193g c1193g = (C1193g) this.f10045a;
        c1193g.t(i, 3);
        w6.a((AbstractC1187a) obj, c1193g.c);
        c1193g.t(i, 4);
    }

    public void b(int i, Object obj, W w6) {
        AbstractC1187a abstractC1187a = (AbstractC1187a) obj;
        C1193g c1193g = (C1193g) this.f10045a;
        c1193g.t(i, 2);
        c1193g.u(abstractC1187a.h(w6));
        w6.a(abstractC1187a, c1193g.c);
    }

    public E() {
        K k8;
        try {
            k8 = (K) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k8 = f10044b;
        }
        K[] kArr = {C1200n.f10112b, k8};
        D d10 = new D();
        d10.f10043a = kArr;
        Charset charset = AbstractC1207v.f10124a;
        this.f10045a = d10;
    }
}
