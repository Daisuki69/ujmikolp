package Kh;

import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lg.C1829b;
import retrofit2.Call;

/* JADX INFO: renamed from: Kh.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0301f extends Ah.h implements ch.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2726b;

    public /* synthetic */ C0301f(Object obj, int i) {
        this.f2725a = i;
        this.f2726b = obj;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        boolean z4;
        switch (this.f2725a) {
            case 0:
                C0300e c0300e = new C0300e(jVar);
                jVar.a(c0300e);
                try {
                    ((Ah.i) this.f2726b).c(c0300e);
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    c0300e.b(th2);
                    return;
                }
                break;
            case 1:
                io.reactivex.rxjava3.disposables.b bVar = Dh.b.f1156a;
                try {
                    Iterator it = ((List) this.f2726b).iterator();
                    try {
                        if (!it.hasNext()) {
                            jVar.a(bVar);
                            jVar.onComplete();
                        } else {
                            v vVar = new v(jVar, it);
                            jVar.a(vVar);
                            if (!vVar.f2766d) {
                                while (!vVar.c) {
                                    try {
                                        Object next = vVar.f2765b.next();
                                        Objects.requireNonNull(next, "The iterator returned a null value");
                                        vVar.f2764a.onNext(next);
                                        if (vVar.c) {
                                            break;
                                        } else {
                                            try {
                                                if (!vVar.f2765b.hasNext()) {
                                                    if (!vVar.c) {
                                                        vVar.f2764a.onComplete();
                                                    }
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                AbstractC0983W.G(th3);
                                                vVar.f2764a.onError(th3);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        AbstractC0983W.G(th4);
                                        vVar.f2764a.onError(th4);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        AbstractC0983W.G(th5);
                        jVar.a(bVar);
                        jVar.onError(th5);
                        return;
                    }
                } catch (Throwable th6) {
                    AbstractC0983W.G(th6);
                    jVar.a(bVar);
                    jVar.onError(th6);
                    return;
                }
                break;
            case 2:
                ((ch.l) this.f2726b).subscribe(new C1829b(jVar));
                break;
            default:
                Call callClone = ((Call) this.f2726b).clone();
                mg.b bVar2 = new mg.b(callClone);
                jVar.a(bVar2);
                if (!bVar2.f18413b) {
                    try {
                        Object objExecute = callClone.execute();
                        if (!bVar2.f18413b) {
                            jVar.onNext(objExecute);
                        }
                        if (!bVar2.f18413b) {
                            try {
                                jVar.onComplete();
                                break;
                            } catch (Throwable th7) {
                                th = th7;
                                z4 = true;
                                AbstractC0983W.G(th);
                                if (z4) {
                                    E1.c.k(th);
                                    return;
                                }
                                if (bVar2.f18413b) {
                                    return;
                                }
                                try {
                                    jVar.onError(th);
                                    return;
                                } catch (Throwable th8) {
                                    AbstractC0983W.G(th8);
                                    E1.c.k(new CompositeException(th, th8));
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z4 = false;
                    }
                }
                break;
        }
    }

    public C0301f(List list) {
        this.f2725a = 1;
        this.f2726b = list;
    }
}
