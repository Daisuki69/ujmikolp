package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class F2 extends ArrayDeque implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19187b;
    public InterfaceC1486b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f19188d;

    public F2(ch.r rVar, int i) {
        this.f19186a = rVar;
        this.f19187b = i;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19188d) {
            return;
        }
        this.f19188d = true;
        this.c.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        ch.r rVar = this.f19186a;
        while (!this.f19188d) {
            Object objPoll = poll();
            if (objPoll == null) {
                if (this.f19188d) {
                    return;
                }
                rVar.onComplete();
                return;
            }
            rVar.onNext(objPoll);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f19186a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19187b == size()) {
            poll();
        }
        offer(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.c, interfaceC1486b)) {
            this.c = interfaceC1486b;
            this.f19186a.onSubscribe(this);
        }
    }
}
