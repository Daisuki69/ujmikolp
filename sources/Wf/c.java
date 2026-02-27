package Wf;

import R4.i;
import Y.e;
import ag.C0703m;
import bg.C1010n;
import bg.C1013q;
import bg.C1018v;
import cj.C1110A;
import cj.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6431b;

    public c(d dVar, Map map) {
        this.f6430a = dVar;
        this.f6431b = map;
    }

    public final void a(Map map) {
        e eVar = this.f6430a.f6432a;
        eVar.getClass();
        Object obj = ((LinkedHashMap) ((i) eVar.f6708b).f5470b).get(C1013q.class.getName());
        if (obj == null) {
            j.l();
        }
        Object objInvoke = ((Function0) obj).invoke();
        if (objInvoke == null) {
            throw new TypeCastException("null cannot be cast to non-null type credoapp.contract.IModuleRegister");
        }
        C1013q c1013q = (C1013q) objInvoke;
        Object obj2 = map.get("v1.configurations");
        if (obj2 != null) {
            if (!(obj2 instanceof C0703m[])) {
                obj2 = null;
            }
            C0703m[] c0703mArr = (C0703m[]) obj2;
            if (c0703mArr != null) {
                C1010n c1010n = c1013q.f9108a;
                if (c1010n == null) {
                    j.n("_discoveryEntity");
                    throw null;
                }
                ArrayList arrayList = new ArrayList(c0703mArr.length);
                for (C0703m c0703m : c0703mArr) {
                    arrayList.add(new C0703m[]{c0703m});
                }
                Object[] array = arrayList.toArray(new C0703m[0][]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                x.q(((C1018v) C1110A.G(c1010n.f9100b)).f9130b, (C0703m[][]) array);
            }
        }
        Object obj3 = map.get("v1.configurations");
        if (obj3 != null) {
            if (!(obj3 instanceof C0703m[][])) {
                obj3 = null;
            }
            C0703m[][] c0703mArr2 = (C0703m[][]) obj3;
            if (c0703mArr2 != null) {
                C1010n c1010n2 = c1013q.f9108a;
                if (c1010n2 == null) {
                    j.n("_discoveryEntity");
                    throw null;
                }
                x.q(((C1018v) C1110A.G(c1010n2.f9100b)).f9130b, c0703mArr2);
            }
        }
        Object obj4 = map.get("v1.androidId");
        if (obj4 != null) {
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            String str = (String) obj4;
            if (str != null) {
                C1010n c1010n3 = c1013q.f9108a;
                if (c1010n3 == null) {
                    j.n("_discoveryEntity");
                    throw null;
                }
                c1010n3.c.put("v1.androidId", str);
            }
        }
    }
}
