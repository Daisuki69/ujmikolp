package Rj;

import cj.H;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Iterable, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5570b;

    public /* synthetic */ g(Object obj, int i) {
        this.f5569a = i;
        this.f5570b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5569a) {
            case 0:
                return new f((Tj.f) this.f5570b);
            case 1:
                return new H((Iterator) ((Function0) this.f5570b).invoke());
            default:
                return new zj.d((zj.e) this.f5570b);
        }
    }
}
