package E;

import D.S;
import D.d0;
import android.content.Context;
import androidx.media3.exoplayer.DefaultLoadControl;
import cj.L;
import cj.M;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import dOYHB6.tiZVw8.numX49;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import w.C2361c;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1214a = new g(1000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS, L.c(new Pair(numX49.tnTj78("P4u"), numX49.tnTj78("P4V"))));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f1215b = new g(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS, NetWorkParam.DEFAULT_CONNECT_TIME_OUT, M.e());

    public static final c0.f a(e eVar, a aVar) {
        int iOrdinal = eVar.ordinal();
        boolean z4 = aVar.f1204b;
        String str = aVar.f1203a;
        int i = aVar.f;
        g gVar = f1215b;
        String strTnTj78 = numX49.tnTj78("P4S");
        g gVar2 = f1214a;
        Context context = aVar.c;
        switch (iOrdinal) {
            case 0:
                C2361c c2361c = new C2361c(new b(gVar2, new c(false, 7)), 18);
                S.l(strTnTj78);
                return (str == null || C2576A.H(str)) ? d0.f(z4, context, new c0.f(null, c0.e.f9187b, -1L, null)) : d0.f(z4, context, c2361c.b(aVar));
            case 1:
                return new J5.a(new J5.c(new C2361c(new b(gVar2, new d()), 18), 20), 22).b(aVar);
            case 2:
                C2361c c2361c2 = new C2361c(new b(gVar2, new d(), new Pair(Boolean.TRUE, Integer.valueOf(i))), 18);
                S.l(strTnTj78);
                return (str == null || C2576A.H(str)) ? d0.f(z4, context, new c0.f(null, c0.e.f9187b, -1L, null)) : d0.f(z4, context, c2361c2.b(aVar));
            case 3:
                return new J5.a(new J5.c(new C2361c(new b(gVar2, new d(), new Pair(Boolean.TRUE, Integer.valueOf(i))), 18), 20), 22).b(aVar);
            case 4:
                return new C2361c(new b(gVar, new c(true, 6)), 18).b(aVar);
            case 5:
                return new C2361c(new b(gVar2, new d()), 18).b(aVar);
            case 6:
                return new C2361c(new b(gVar, new c(true, 4)), 18).b(aVar);
            case 7:
                return new J5.a(new C2361c(new b(gVar2, new c(true, 4)), 18), 22).b(aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
