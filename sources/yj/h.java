package yj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f21320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21321b = -2;
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    public final void a() {
        Object objInvoke;
        int i = this.f21321b;
        i iVar = this.c;
        if (i == -2) {
            objInvoke = ((Function0) iVar.f21323b).invoke();
        } else {
            Function1 function1 = (Function1) iVar.c;
            Object obj = this.f21320a;
            kotlin.jvm.internal.j.d(obj);
            objInvoke = function1.invoke(obj);
        }
        this.f21320a = objInvoke;
        this.f21321b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21321b < 0) {
            a();
        }
        return this.f21321b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21321b < 0) {
            a();
        }
        if (this.f21321b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f21320a;
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f21321b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
