package Bj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Bj.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0153m extends C0162u {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C0153m.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0153m(C0151l c0151l, Throwable th2, boolean z4) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + c0151l + " was cancelled normally");
        }
        super(th2, z4);
        this._resumed$volatile = 0;
    }
}
