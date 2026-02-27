package Zf;

import S1.s;
import Xf.b;
import Xf.c;
import Y.e;
import ag.AbstractC0693c;
import ag.C0691a;
import ag.C0694d;
import ag.C0702l;
import ag.C0703m;
import android.content.Context;
import android.provider.Settings;
import bg.C0958D;
import bg.C0960E;
import bg.C0965G0;
import bg.C0970J;
import bg.C0985Y;
import bg.C0995e;
import bg.C0999g;
import bg.C1000g0;
import bg.C1008l;
import bg.C1019w;
import bg.l0;
import bg.n0;
import bg.x0;
import cj.C1110A;
import cj.L;
import cj.M;
import cj.x;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yf.a f6940b;

    public a(int i) {
        this.f6939a = i;
        switch (i) {
            case 1:
                this.f6940b = new Yf.a("4.5.0", String.valueOf(1705599297), "CoreModule");
                break;
            default:
                this.f6940b = new Yf.a("4.1.0", String.valueOf(1699008029), "ApplicationModule");
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public static U8.c d(Wf.c cVar) {
        Object obj = cVar.f6431b.get("v1.context");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
        }
        Context context = (Context) obj;
        ?? r42 = cVar.f6431b;
        Object obj2 = r42.get("v1.context");
        if (obj2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
        }
        e eVar = new e((Context) obj2, 8);
        b bVar = (b) r42.get("v1.logger");
        return new U8.c(12, context, eVar, bVar != null ? new C0694d(bVar) : null);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    @Override // Xf.c
    public final void a(Wf.c context) {
        C0965G0 c0965g0;
        int i = this.f6939a;
        j.h(context, "context");
        switch (i) {
            case 0:
                context.a(L.c(new Pair("v1.configurations", d(context).a())));
                return;
            default:
                ?? r1 = context.f6431b;
                Object obj = r1.get("v1.context");
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                Context context2 = (Context) obj;
                Object obj2 = r1.get("v1.location_transformer");
                if (obj2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.ILocationTransformer");
                }
                x0 x0Var = (x0) obj2;
                Object obj3 = r1.get("v1.permission_helper");
                if (obj3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IPermissionHelper");
                }
                n0 n0Var = (n0) obj3;
                b bVar = (b) r1.get("v1.logger");
                if (bVar == null) {
                    c0965g0 = null;
                } else {
                    if (r1.get("v1.au_info") != null) {
                        throw new ClassCastException();
                    }
                    c0965g0 = new C0965G0(bVar, new C1019w(0, 10));
                }
                r rVar = new r(context2, x0Var, n0Var, c0965g0, 12);
                C0965G0 c0965g02 = c0965g0;
                ArrayList arrayList = new ArrayList();
                x.q(arrayList, rVar.h());
                C1000g0 c1000g0 = new C1000g0(context2, c0965g02);
                AbstractC0693c.c(c1000g0, C1000g0.f8996d, null, C0985Y.c, 2);
                AbstractC0693c.c(c1000g0, C1000g0.e, null, C0985Y.j, 2);
                AbstractC0693c.c(c1000g0, C1000g0.f, null, C0985Y.f8898b, 2);
                x.q(arrayList, new C0703m[]{c1000g0.f()});
                C1008l c1008l = new C1008l(context2, c0965g02);
                AbstractC0693c.c(c1008l, C1008l.f9061g, null, new C0995e(c1008l, 6), 2);
                AbstractC0693c.c(c1008l, C1008l.h, null, new C0970J(c1008l, 13), 2);
                AbstractC0693c.c(c1008l, C1008l.i, null, new l0(c1008l, 8), 2);
                AbstractC0693c.c(c1008l, C1008l.j, null, new C0970J(c1008l, 0), 2);
                AbstractC0693c.c(c1008l, C1008l.f9066k, null, new l0(c1008l, 13), 2);
                AbstractC0693c.c(c1008l, C1008l.f9068l, null, new C0995e(c1008l, 7), 2);
                AbstractC0693c.c(c1008l, C1008l.m, null, new l0(c1008l, 16), 2);
                AbstractC0693c.c(c1008l, C1008l.f9070n, null, new C0995e(c1008l, 10), 2);
                AbstractC0693c.c(c1008l, C1008l.f9072o, null, new C0995e(c1008l, 20), 2);
                AbstractC0693c.c(c1008l, C1008l.f9074p, null, new C0970J(c1008l, 5), 2);
                AbstractC0693c.c(c1008l, C1008l.f9076q, null, new C0970J(c1008l, 14), 2);
                AbstractC0693c.c(c1008l, C1008l.f9078r, null, new C0995e(c1008l, 26), 2);
                AbstractC0693c.c(c1008l, C1008l.f9080s, null, new C0995e(c1008l, 13), 2);
                AbstractC0693c.c(c1008l, C1008l.f9082t, null, new C0995e(c1008l, 22), 2);
                AbstractC0693c.c(c1008l, C1008l.f9083u, null, new C0970J(c1008l, 1), 2);
                AbstractC0693c.c(c1008l, C1008l.f9084v, null, new C0995e(c1008l, 16), 2);
                AbstractC0693c.c(c1008l, C1008l.f9086w, null, new C0970J(c1008l, 16), 2);
                AbstractC0693c.c(c1008l, C1008l.f9087x, null, new C0970J(c1008l, 25), 2);
                AbstractC0693c.c(c1008l, C1008l.f9089y, null, new l0(c1008l, 4), 2);
                AbstractC0693c.c(c1008l, C1008l.f9090z, null, new C0970J(c1008l, 19), 2);
                AbstractC0693c.c(c1008l, C1008l.f9023A, null, new C0995e(c1008l, 29), 2);
                AbstractC0693c.c(c1008l, C1008l.f9025B, null, new C0995e(c1008l, 17), 2);
                AbstractC0693c.c(c1008l, C1008l.f9027C, null, new C0995e(c1008l, 23), 2);
                AbstractC0693c.c(c1008l, C1008l.f9029D, null, new l0(c1008l, 10), 2);
                AbstractC0693c.c(c1008l, C1008l.f9031E, null, new C0970J(c1008l, 7), 2);
                AbstractC0693c.c(c1008l, C1008l.f9033F, null, new C0995e(c1008l, 3), 2);
                AbstractC0693c.c(c1008l, C1008l.f9035G, null, new C0970J(c1008l, 22), 2);
                AbstractC0693c.c(c1008l, C1008l.f9037H, null, new l0(c1008l, 1), 2);
                AbstractC0693c.c(c1008l, C1008l.f9038I, null, new C0970J(c1008l, 2), 2);
                AbstractC0693c.c(c1008l, C1008l.J, null, new C0970J(c1008l, 11), 2);
                AbstractC0693c.c(c1008l, C1008l.f9039K, null, new C0995e(c1008l, 19), 2);
                AbstractC0693c.c(c1008l, C1008l.f9040L, null, new C0995e(c1008l, 28), 2);
                AbstractC0693c.c(c1008l, C1008l.f9041M, null, new C0970J(c1008l, 28), 2);
                AbstractC0693c.c(c1008l, C1008l.f9042N, null, new l0(c1008l, 7), 2);
                AbstractC0693c.c(c1008l, C1008l.f9043O, null, new C0970J(c1008l, 8), 2);
                AbstractC0693c.c(c1008l, C1008l.f9044P, null, new C0970J(c1008l, 17), 2);
                AbstractC0693c.c(c1008l, C1008l.f9045Q, null, new C0995e(c1008l, 25), 2);
                AbstractC0693c.c(c1008l, C1008l.f9046R, null, new C0970J(c1008l, 4), 2);
                AbstractC0693c.c(c1008l, C1008l.f9047S, null, new C0995e(c1008l, 14), 2);
                AbstractC0693c.c(c1008l, C1008l.f9048T, null, new C0995e(c1008l, 0), 2);
                AbstractC0693c.c(c1008l, C1008l.f9049U, null, new C0970J(c1008l, 10), 2);
                AbstractC0693c.c(c1008l, C1008l.f9050V, null, new C0995e(c1008l, 27), 2);
                AbstractC0693c.c(c1008l, C1008l.f9051W, null, new C0995e(c1008l, 24), 2);
                AbstractC0693c.c(c1008l, C1008l.f9052X, null, new C0995e(c1008l, 12), 2);
                AbstractC0693c.c(c1008l, C1008l.f9053Y, null, new C0995e(c1008l, 9), 2);
                AbstractC0693c.c(c1008l, C1008l.f9054Z, null, new l0(c1008l, 14), 2);
                AbstractC0693c.c(c1008l, C1008l.f9055a0, null, new l0(c1008l, 11), 2);
                AbstractC0693c.c(c1008l, C1008l.f9056b0, null, new C0995e(c1008l, 5), 2);
                AbstractC0693c.c(c1008l, C1008l.f9057c0, null, new C0995e(c1008l, 2), 2);
                AbstractC0693c.c(c1008l, C1008l.f9058d0, null, new C0995e(c1008l, 15), 2);
                AbstractC0693c.c(c1008l, C1008l.f9059e0, null, new C0995e(c1008l, 11), 2);
                AbstractC0693c.c(c1008l, C1008l.f9060f0, null, new C0995e(c1008l, 8), 2);
                AbstractC0693c.c(c1008l, C1008l.f9062g0, null, new C0995e(c1008l, 4), 2);
                AbstractC0693c.c(c1008l, C1008l.f9063h0, null, new C0995e(c1008l, 21), 2);
                AbstractC0693c.c(c1008l, C1008l.f9064i0, null, new C0995e(c1008l, 18), 2);
                AbstractC0693c.c(c1008l, C1008l.f9065j0, null, new C0995e(c1008l, 1), 2);
                AbstractC0693c.c(c1008l, C1008l.f9067k0, null, new l0(c1008l, 17), 2);
                AbstractC0693c.c(c1008l, C1008l.f9069l0, null, new l0(c1008l, 6), 2);
                AbstractC0693c.c(c1008l, C1008l.m0, null, new l0(c1008l, 3), 2);
                AbstractC0693c.c(c1008l, C1008l.f9071n0, null, new l0(c1008l, 0), 2);
                AbstractC0693c.c(c1008l, C1008l.f9073o0, null, new C0970J(c1008l, 27), 2);
                AbstractC0693c.c(c1008l, C1008l.f9075p0, null, new l0(c1008l, 12), 2);
                AbstractC0693c.c(c1008l, C1008l.f9077q0, null, new l0(c1008l, 9), 2);
                AbstractC0693c.c(c1008l, C1008l.f9079r0, null, new C0970J(c1008l, 24), 2);
                AbstractC0693c.c(c1008l, C1008l.f9081s0, null, new C0970J(c1008l, 21), 2);
                AbstractC0693c.c(c1008l, C1008l.t0, null, new C0970J(c1008l, 12), 2);
                AbstractC0693c.c(c1008l, C1008l.u0, null, new C0970J(c1008l, 9), 2);
                AbstractC0693c.c(c1008l, C1008l.f9085v0, null, new C0970J(c1008l, 18), 2);
                AbstractC0693c.c(c1008l, C1008l.w0, null, new C0970J(c1008l, 15), 2);
                AbstractC0693c.c(c1008l, C1008l.f9088x0, null, new l0(c1008l, 18), 2);
                AbstractC0693c.c(c1008l, C1008l.y0, null, new l0(c1008l, 15), 2);
                AbstractC0693c.c(c1008l, C1008l.f9091z0, null, new C0970J(c1008l, 6), 2);
                AbstractC0693c.c(c1008l, C1008l.f9024A0, null, new C0970J(c1008l, 3), 2);
                AbstractC0693c.c(c1008l, C1008l.f9026B0, null, new l0(c1008l, 5), 2);
                AbstractC0693c.c(c1008l, C1008l.f9028C0, null, new l0(c1008l, 2), 2);
                AbstractC0693c.c(c1008l, C1008l.f9030D0, null, new C0970J(c1008l, 29), 2);
                AbstractC0693c.c(c1008l, C1008l.f9032E0, null, new C0970J(c1008l, 23), 2);
                AbstractC0693c.c(c1008l, C1008l.f9034F0, null, new C0970J(c1008l, 20), 2);
                AbstractC0693c.c(c1008l, C1008l.f9036G0, null, new C0970J(c1008l, 26), 2);
                x.q(arrayList, new C0703m[]{c1008l.f()});
                C0958D c0958d = new C0958D(context2, c0965g02);
                AbstractC0693c.c(c0958d, C0958D.f8721d, null, C0999g.f8983n, 2);
                AbstractC0693c.c(c0958d, C0958D.e, null, C0691a.f7186r, 2);
                AbstractC0693c.c(c0958d, C0958D.f, null, C0999g.f8986q, 2);
                AbstractC0693c.c(c0958d, C0958D.f8722g, null, C0999g.f8988s, 2);
                AbstractC0693c.c(c0958d, C0958D.h, null, C0999g.f8991v, 2);
                AbstractC0693c.c(c0958d, C0958D.i, null, C0999g.i, 2);
                x.q(arrayList, new C0703m[]{c0958d.f()});
                Object[] array = arrayList.toArray(new C0703m[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                LinkedHashMap linkedHashMapI = M.i(new Pair("v1.configurations", array));
                String strC = s.c(Settings.Secure.getString(context2.getContentResolver(), "android_id"));
                if (strC != null) {
                    linkedHashMapI.put("v1.androidId", strC);
                }
                context.a(linkedHashMapI);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    @Override // Xf.c
    public final String[] b(Wf.c context) {
        C0965G0 c0965g0;
        switch (this.f6939a) {
            case 0:
                j.h(context, "context");
                C0703m[] c0703mArrA = d(context).a();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 4; i++) {
                    x.p(c0703mArrA[i].f7217b, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x.p(((C0702l) it.next()).c, arrayList2);
                }
                Object[] array = C1110A.w(arrayList2).toArray(new String[0]);
                if (array != null) {
                    return (String[]) array;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            default:
                j.h(context, "context");
                ?? r9 = context.f6431b;
                Object obj = r9.get("v1.context");
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                Context context2 = (Context) obj;
                Object obj2 = r9.get("v1.location_transformer");
                if (obj2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.ILocationTransformer");
                }
                x0 x0Var = (x0) obj2;
                Object obj3 = r9.get("v1.permission_helper");
                if (obj3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IPermissionHelper");
                }
                n0 n0Var = (n0) obj3;
                b bVar = (b) r9.get("v1.logger");
                if (bVar == null) {
                    c0965g0 = null;
                } else {
                    if (r9.get("v1.au_info") != null) {
                        throw new ClassCastException();
                    }
                    c0965g0 = new C0965G0(bVar, new C1019w(0, 11));
                }
                C0703m[] c0703mArrH = new r(context2, x0Var, n0Var, c0965g0, 12).h();
                ArrayList arrayList3 = new ArrayList();
                for (int i4 = 0; i4 < 10; i4++) {
                    x.p(c0703mArrH[i4].f7217b, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    x.p(((C0960E) it2.next()).c, arrayList4);
                }
                Object[] array2 = C1110A.w(arrayList4).toArray(new String[0]);
                if (array2 != null) {
                    return (String[]) array2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @Override // Xf.c
    public final Yf.a c() {
        switch (this.f6939a) {
        }
        return this.f6940b;
    }
}
