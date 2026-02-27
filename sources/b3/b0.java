package b3;

import android.util.Log;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f8434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f8434b = e0Var;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        b0 b0Var = new b0(this.f8434b, interfaceC1526a);
        b0Var.f8433a = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((C0868H) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        boolean z4;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        C0868H c0868h = (C0868H) this.f8433a;
        e0 e0Var = this.f8434b;
        boolean zD = e0Var.d(c0868h);
        C0864D c0864d = e0Var.f;
        Map mapB = c0868h.c;
        if (mapB != null) {
            c0864d.getClass();
            z4 = false;
            if (!c0864d.f) {
                ArrayList<C0865E> arrayListA = AbstractC0900u.a(c0864d.f8381a);
                ArrayList<Pair> arrayList = new ArrayList();
                for (C0865E c0865e : arrayListA) {
                    C0862B c0862b = (C0862B) mapB.get(c0865e.f8384a);
                    Pair pair = c0862b != null ? new Pair(c0865e, c0862b) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                if (arrayList.isEmpty()) {
                    z4 = true;
                } else {
                    for (Pair pair2 : arrayList) {
                        C0865E c0865e2 = (C0865E) pair2.f18160a;
                        C0862B c0862b2 = (C0862B) pair2.f18161b;
                        boolean zB = kotlin.jvm.internal.j.b(c0864d.a(), c0865e2.f8384a);
                        int i = c0865e2.f8385b;
                        if (zB) {
                            if (i == c0862b2.f8377a && kotlin.jvm.internal.j.b((String) c0864d.f8383d.getValue(), c0862b2.f8378b)) {
                                break;
                            }
                        } else {
                            if (i == c0862b2.f8377a) {
                                break;
                            }
                        }
                    }
                    z4 = true;
                }
            }
            if (z4) {
                Log.d("FirebaseSessions", "Cold app start detected");
            }
        } else {
            Log.d("FirebaseSessions", "No process data map");
            z4 = true;
        }
        boolean zC = e0Var.c(c0868h);
        if (z4) {
            c0864d.getClass();
            mapB = c0864d.b(cj.M.e());
        } else if (zC) {
            mapB = c0864d.b(mapB);
        }
        C0872L c0872l = z4 ? null : c0868h.f8389a;
        if (!zD && !z4) {
            return zC ? C0868H.a(c0868h, null, null, c0864d.b(mapB), 3) : c0868h;
        }
        C0872L c0872lA = e0Var.f8451b.a(c0872l);
        C0878S c0878s = (C0878S) e0Var.c;
        Bj.H.w(Bj.H.c(c0878s.e), null, null, new C0876P(c0878s, c0872lA, null), 3);
        c0864d.f = true;
        return new C0868H(c0872lA, null, mapB);
    }
}
