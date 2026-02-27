package Ej;

import Bj.C0151l;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements Bj.W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1414b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0151l f1415d;

    public T(V v7, long j, Object obj, C0151l c0151l) {
        this.f1413a = v7;
        this.f1414b = j;
        this.c = obj;
        this.f1415d = c0151l;
    }

    @Override // Bj.W
    public final void dispose() {
        V v7 = this.f1413a;
        synchronized (v7) {
            if (this.f1414b < v7.n()) {
                return;
            }
            Object[] objArr = v7.h;
            kotlin.jvm.internal.j.d(objArr);
            long j = this.f1414b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            W.d(objArr, j, W.f1422a);
            v7.i();
            Unit unit = Unit.f18162a;
        }
    }
}
