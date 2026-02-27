package com.shield.android.f;

import android.os.Looper;
import com.shield.android.ShieldCallback;
import com.shield.android.e.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements com.shield.android.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15350b;
    public final /* synthetic */ Looper c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ShieldCallback f15351d;
    public final /* synthetic */ Thread e;

    public /* synthetic */ j(f fVar, Looper looper, ShieldCallback shieldCallback, Thread thread, int i) {
        this.f15349a = i;
        this.f15350b = fVar;
        this.c = looper;
        this.f15351d = shieldCallback;
        this.e = thread;
    }

    @Override // com.shield.android.e.h
    public final void notifyState(i.a aVar) {
        switch (this.f15349a) {
            case 0:
                this.f15350b.c(this.c, this.f15351d, this.e, aVar);
                break;
            case 1:
                this.f15350b.d(this.c, this.f15351d, this.e, aVar);
                break;
            case 2:
                this.f15350b.e(this.c, this.f15351d, this.e, aVar);
                break;
            case 3:
                this.f15350b.b(this.c, this.f15351d, this.e, aVar);
                break;
            default:
                this.f15350b.a(this.c, this.f15351d, this.e, aVar);
                break;
        }
    }
}
