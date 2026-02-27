package com.shield.android;

import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15454b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.f15453a = i;
        this.f15454b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15453a) {
            case 0:
                ((e) this.f15454b).h((String) this.c);
                break;
            case 1:
                ((Shield) this.f15454b).b((Application) this.c);
                break;
            default:
                b.b((String) this.c, (com.shield.android.d.f) this.f15454b);
                break;
        }
    }

    public /* synthetic */ k(String str, com.shield.android.d.f fVar) {
        this.f15453a = 2;
        this.c = str;
        this.f15454b = fVar;
    }
}
