package D;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: D.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0189w implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f953a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f954b;
    public final /* synthetic */ CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f955d;
    public final /* synthetic */ Y.f e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f956g;
    public final /* synthetic */ Object h;

    public /* synthetic */ CallableC0189w(H h, A a8, CleverTapInstanceConfig cleverTapInstanceConfig, Context context, Y.f fVar, N.e eVar, l0.c cVar) {
        this.f954b = h;
        this.f = a8;
        this.c = cleverTapInstanceConfig;
        this.f955d = context;
        this.e = fVar;
        this.f956g = eVar;
        this.h = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws JSONException {
        switch (this.f953a) {
            case 0:
                H h = this.f954b;
                Y.f fVar = this.e;
                Cg.c cVar = (Cg.c) this.f;
                CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
                R.c cVar2 = (R.c) this.f956g;
                r rVar = (r) this.h;
                if (h.f() != null) {
                    Y.d dVar = fVar.f6709a;
                    String str = cleverTapInstanceConfig.f9439a;
                    List list = rVar.f938k;
                    Context context = this.f955d;
                    String strTnTj78 = numX49.tnTj78("PerA");
                    String strTnTj782 = numX49.tnTj78("PerY");
                    if (dVar == null) {
                        String strF = h.f();
                        kotlin.jvm.internal.j.f(strF, strTnTj782);
                        kotlin.jvm.internal.j.f(str, strTnTj78);
                        Y.d dVarD = c0.d(context, cVar, strF, str);
                        fVar.f6709a = dVarD;
                        cVar2.e();
                        list.add(dVarD);
                    }
                    if (fVar.f6710b == null) {
                        String strF2 = h.f();
                        kotlin.jvm.internal.j.f(strF2, strTnTj782);
                        kotlin.jvm.internal.j.f(str, strTnTj78);
                        kotlin.jvm.internal.j.g(context, numX49.tnTj78("PerT"));
                        Y.b bVar = new Y.b(c0.c(context, c0.a(2, strF2, str)));
                        fVar.f6710b = bVar;
                        list.add(bVar);
                    }
                }
                break;
            default:
                H h6 = this.f954b;
                A a8 = (A) this.f;
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.c;
                Y.f fVar2 = this.e;
                N.e eVar = (N.e) this.f956g;
                l0.c cVar3 = (l0.c) this.h;
                String strF3 = h6.f();
                if (strF3 != null && ((K) a8.f791a) == null) {
                    S sC = cleverTapInstanceConfig2.c();
                    String strP = We.s.p(new StringBuilder(), cleverTapInstanceConfig2.f9439a, numX49.tnTj78("Perv"));
                    String strConcat = numX49.tnTj78("Per7").concat(strF3);
                    sC.getClass();
                    S.s(strP, strConcat);
                    a8.f791a = new K(this.f955d, cleverTapInstanceConfig2, strF3, fVar2, eVar, cVar3, n0.c.f18542a);
                }
                break;
        }
        return Unit.f18162a;
    }

    public /* synthetic */ CallableC0189w(H h, Y.f fVar, c0 c0Var, Context context, Cg.c cVar, CleverTapInstanceConfig cleverTapInstanceConfig, R.c cVar2, r rVar) {
        this.f954b = h;
        this.e = fVar;
        this.f955d = context;
        this.f = cVar;
        this.c = cleverTapInstanceConfig;
        this.f956g = cVar2;
        this.h = rVar;
    }
}
