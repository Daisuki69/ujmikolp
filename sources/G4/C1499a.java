package g4;

import We.s;
import android.view.View;
import ch.l;
import ch.r;
import ch.w;
import ih.EnumC1605c;
import j4.ViewOnClickListenerC1668a;
import java.util.Iterator;
import jh.e;
import kotlin.jvm.internal.j;
import nh.C1950a;
import of.p;
import ph.M0;
import ph.P0;
import ph.Q0;
import x3.d;

/* JADX INFO: renamed from: g4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1499a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16787b;

    public /* synthetic */ C1499a(Object obj, int i) {
        this.f16786a = i;
        this.f16787b = obj;
    }

    @Override // ch.l
    public final void subscribeActual(r observer) {
        switch (this.f16786a) {
            case 0:
                j.h(observer, "observer");
                ((AbstractC1500b) this.f16787b).e(observer);
                break;
            case 1:
                j.h(observer, "observer");
                if (d.h(observer)) {
                    View view = (View) this.f16787b;
                    ViewOnClickListenerC1668a viewOnClickListenerC1668a = new ViewOnClickListenerC1668a(view, observer);
                    observer.onSubscribe(viewOnClickListenerC1668a);
                    view.setOnClickListener(viewOnClickListenerC1668a);
                    break;
                }
                break;
            case 2:
                Object[] objArr = (Object[]) this.f16787b;
                M0 m0 = new M0(observer, objArr);
                observer.onSubscribe(m0);
                if (!m0.f19271d) {
                    int length = objArr.length;
                    for (int i = 0; i < length && !m0.e; i++) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            m0.f19269a.onError(new NullPointerException(s.g(i, "The element at index ", " is null")));
                        } else {
                            m0.f19269a.onNext(obj);
                        }
                        break;
                    }
                    if (!m0.e) {
                        m0.f19269a.onComplete();
                    }
                    break;
                }
                break;
            case 3:
                try {
                    Iterator it = ((Iterable) this.f16787b).iterator();
                    try {
                        if (it.hasNext()) {
                            P0 p02 = new P0(observer, it);
                            observer.onSubscribe(p02);
                            if (!p02.f19301d) {
                                while (!p02.c) {
                                    try {
                                        Object next = p02.f19300b.next();
                                        e.b(next, "The iterator returned a null value");
                                        p02.f19299a.onNext(next);
                                        if (p02.c) {
                                            break;
                                        } else {
                                            try {
                                                if (!p02.f19300b.hasNext()) {
                                                    if (!p02.c) {
                                                        p02.f19299a.onComplete();
                                                    }
                                                    break;
                                                }
                                            } catch (Throwable th2) {
                                                p.F(th2);
                                                p02.f19299a.onError(th2);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        p.F(th3);
                                        p02.f19299a.onError(th3);
                                        return;
                                    }
                                }
                            }
                        } else {
                            EnumC1605c.a(observer);
                        }
                    } catch (Throwable th4) {
                        p.F(th4);
                        EnumC1605c.c(th4, observer);
                        return;
                    }
                } catch (Throwable th5) {
                    p.F(th5);
                    EnumC1605c.c(th5, observer);
                    return;
                }
                break;
            case 4:
                ((nk.a) this.f16787b).a(new Q0(observer));
                break;
            case 5:
                ((ch.p) this.f16787b).subscribe(observer);
                break;
            default:
                ((w) this.f16787b).c(new C1950a(observer, 1));
                break;
        }
    }

    public C1499a(View view) {
        this.f16786a = 1;
        j.h(view, "view");
        this.f16787b = view;
    }
}
