package D;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: D.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC0186t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f942a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f943b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f944d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f945g;

    public /* synthetic */ CallableC0186t(C0187u c0187u, Y.f fVar, c0 c0Var, Cg.c cVar, String str, String str2, R.c cVar2) {
        this.f943b = c0187u;
        this.c = fVar;
        this.f944d = cVar;
        this.e = str;
        this.f = str2;
        this.f945g = cVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws JSONException {
        switch (this.f942a) {
            case 0:
                C0187u c0187u = (C0187u) this.f943b;
                Y.f fVar = (Y.f) this.c;
                Y.d dVar = fVar.f6709a;
                C c = c0187u.f949b;
                String str = (String) this.e;
                String str2 = (String) this.f;
                Context context = c0187u.f948a;
                if (dVar == null) {
                    Y.d dVarD = c0.d(context, (Cg.c) this.f944d, str, str2);
                    fVar.f6709a = dVarD;
                    ((R.c) this.f945g).e();
                    ((r) c.i).f938k.add(dVarD);
                }
                if (fVar.f6710b != null) {
                    return null;
                }
                kotlin.jvm.internal.j.g(context, numX49.tnTj78("PeB9"));
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("PeBP"));
                kotlin.jvm.internal.j.g(str2, numX49.tnTj78("PeBb"));
                Y.b bVar = new Y.b(c0.c(context, c0.a(2, str, str2)));
                fVar.f6710b = bVar;
                ((r) c.i).f938k.add(bVar);
                return null;
            default:
                A a8 = (A) this.c;
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f944d;
                H h = (H) this.e;
                r rVar = (r) this.f;
                C0176i c0176i = (C0176i) this.f945g;
                S sC = cleverTapInstanceConfig.c();
                StringBuilder sb2 = new StringBuilder();
                String str3 = cleverTapInstanceConfig.f9439a;
                String strTnTj78 = numX49.tnTj78("Pekq");
                String strP = We.s.p(sb2, str3, strTnTj78);
                String str4 = numX49.tnTj78("Pekz") + h.f();
                sC.getClass();
                S.s(strP, str4);
                if (cleverTapInstanceConfig.h) {
                    cleverTapInstanceConfig.c().getClass();
                    S.g(str3, numX49.tnTj78("Pekl"));
                } else {
                    a8.f793d = new L.b(h.f(), cleverTapInstanceConfig, rVar, c0176i, new n0.d((Context) this.f943b, cleverTapInstanceConfig));
                    cleverTapInstanceConfig.c().getClass();
                    S.s(str3 + strTnTj78, numX49.tnTj78("PekW"));
                }
                return Unit.f18162a;
        }
    }

    public /* synthetic */ CallableC0186t(Context context, A a8, CleverTapInstanceConfig cleverTapInstanceConfig, H h, r rVar, C0176i c0176i) {
        this.f943b = context;
        this.c = a8;
        this.f944d = cleverTapInstanceConfig;
        this.e = h;
        this.f = rVar;
        this.f945g = c0176i;
    }
}
