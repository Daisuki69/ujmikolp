package jh;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: jh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class CallableC1682a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17809a;

    public CallableC1682a(int i) {
        this.f17809a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList(this.f17809a);
    }
}
