package Ag;

import Bg.C0104a;
import Bg.C0105b;
import Bg.C0107d;
import Bg.C0108e;
import Bg.C0118o;
import Bg.C0120q;
import Bg.C0124v;
import Bg.C0127y;
import Bg.C0128z;
import Bg.G;
import Bg.I;
import Bg.J;
import Bg.K;
import Bg.M;
import Bg.Y;
import Bg.d0;
import Bg.g0;
import Bg.i0;
import Bj.A;
import Fg.t;
import M8.A0;
import N5.C0466m;
import android.view.View;
import androidx.camera.video.AudioStats;
import b5.C0910b;
import b5.C0916h;
import cj.C1110A;
import cj.C1132s;
import cj.N;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import gj.InterfaceC1526a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import okhttp3.OkHttpClient;
import w.C2360b;
import zj.C2579a;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277a;

    public /* synthetic */ a(int i) {
        this.f277a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 3;
        int i4 = 2;
        z = false;
        boolean z4 = false;
        int i6 = 1;
        InterfaceC1526a interfaceC1526a = null;
        switch (this.f277a) {
            case 0:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                kotlin.jvm.internal.j.g(builder, "<this>");
                builder.followRedirects(false);
                builder.followSslRedirects(false);
                builder.retryOnConnectionFailure(true);
                return Unit.f18162a;
            case 1:
                kotlin.jvm.internal.j.g((OkHttpClient) obj, "it");
                return Unit.f18162a;
            case 2:
                Cg.b createClientPlugin = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.a(C0105b.c, new C0107d(3, null));
                createClientPlugin.a(C0105b.f513b, new C0108e(2, null));
                return Unit.f18162a;
            case 3:
                Cg.b createClientPlugin2 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin2, "$this$createClientPlugin");
                ((d0) createClientPlugin2.f765b).getClass();
                createClientPlugin2.f764a.h.f(Kg.b.f2659g, new C0118o(i, interfaceC1526a, i4));
                return Unit.f18162a;
            case 4:
                Cg.b createClientPlugin3 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin3, "$this$createClientPlugin");
                C0124v c0124v = (C0124v) createClientPlugin3.f765b;
                List listO = C1110A.O(c0124v.f560a);
                List listO2 = C1110A.O(c0124v.f561b);
                createClientPlugin3.a(Cg.g.f776d, new C0127y(c0124v.c, null));
                createClientPlugin3.a(Cg.g.c, new C0104a(listO, interfaceC1526a, i6));
                createClientPlugin3.a(C0105b.f, new C0128z(listO2, interfaceC1526a, z ? 1 : 0));
                createClientPlugin3.a(C0105b.f514d, new C0128z(listO2, interfaceC1526a, i6));
                return Unit.f18162a;
            case 5:
                Cg.b createClientPlugin4 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin4, "$this$createClientPlugin");
                G g8 = (G) createClientPlugin4.f765b;
                List<Pair> listQ = C1110A.Q(new K(i6), N.p(g8.f476b));
                LinkedHashSet linkedHashSet = g8.f475a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedHashSet) {
                    if (!g8.f476b.containsKey((Charset) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<Charset> listQ2 = C1110A.Q(new K(z ? 1 : 0), arrayList);
                StringBuilder sb2 = new StringBuilder();
                for (Charset charset : listQ2) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(A0.o(charset));
                }
                for (Pair pair : listQ) {
                    Charset charset2 = (Charset) pair.f18160a;
                    float fFloatValue = ((Number) pair.f18161b).floatValue();
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    double d10 = fFloatValue;
                    if (AudioStats.AUDIO_AMPLITUDE_NONE > d10 || d10 > 1.0d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    sb2.append(A0.o(charset2) + ";q=" + (((double) sj.b.b(100 * fFloatValue)) / 100.0d));
                }
                int length = sb2.length();
                Charset charset3 = g8.c;
                if (length == 0) {
                    sb2.append(A0.o(charset3));
                }
                String string = sb2.toString();
                kotlin.jvm.internal.j.f(string, "toString(...)");
                Charset charset4 = (Charset) C1110A.B(listQ2);
                if (charset4 == null) {
                    Pair pair2 = (Pair) C1110A.B(listQ);
                    charset4 = pair2 != null ? (Charset) pair2.f18160a : null;
                    if (charset4 == null) {
                        charset4 = C2581c.f21468b;
                    }
                }
                createClientPlugin4.a(C0105b.e, new I(string, charset4, null));
                createClientPlugin4.a(Cg.g.f, new J(charset3, null));
                return Unit.f18162a;
            case 6:
                Cg.b createClientPlugin5 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin5, "$this$createClientPlugin");
                ((M) createClientPlugin5.f765b).getClass();
                createClientPlugin5.a(Cg.g.c, new C0104a(createClientPlugin5, interfaceC1526a, i4));
                return Unit.f18162a;
            case 7:
                Cg.b createClientPlugin6 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin6, "$this$createClientPlugin");
                createClientPlugin6.a(C0105b.f515g, new C0104a(createClientPlugin6, interfaceC1526a, i));
                return Unit.f18162a;
            case 8:
                Cg.b createClientPlugin7 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin7, "$this$createClientPlugin");
                Y y7 = (Y) createClientPlugin7.f765b;
                createClientPlugin7.a(Cg.g.c, new C0120q(y7.f507a, y7.f508b, y7.c, null));
                return Unit.f18162a;
            case 9:
                Cg.b createClientPlugin8 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin8, "$this$createClientPlugin");
                createClientPlugin8.a(Cg.g.f775b, new i0(((g0) createClientPlugin8.f765b).f528a, null));
                return Unit.f18162a;
            case 10:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof A) {
                    return (A) element;
                }
                return null;
            case 11:
                return Boolean.valueOf(((String) obj).split(",").length == 2);
            case 12:
                Cg.b createClientPlugin9 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin9, "$this$createClientPlugin");
                Dg.b bVar = (Dg.b) createClientPlugin9.f765b;
                ArrayList arrayList2 = bVar.f1137b;
                Set set = bVar.f1136a;
                createClientPlugin9.a(Cg.g.e, new Dg.d(createClientPlugin9, null, arrayList2, set));
                createClientPlugin9.a(Cg.g.f, new Dg.e(createClientPlugin9, null, arrayList2, set));
                return Unit.f18162a;
            case 13:
                Dg.a it = (Dg.a) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return it.f1134a.toString();
            case 14:
                View child = (View) obj;
                kotlin.jvm.internal.j.g(child, "child");
                C0466m c0466mA = C0466m.a(child);
                return C1132s.g(new Pair((MayaProfileInputLayout) c0466mA.f, KycFieldType.FIRST_NAME), new Pair((MayaProfileInputLayout) c0466mA.h, KycFieldType.MIDDLE_NAME), new Pair((MayaProfileInputLayout) c0466mA.f4152g, KycFieldType.LAST_NAME));
            case 15:
                Pair pair3 = (Pair) obj;
                kotlin.jvm.internal.j.g(pair3, "<destruct>");
                Object obj3 = pair3.f18160a;
                kotlin.jvm.internal.j.f(obj3, "component1(...)");
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) obj3;
                if (mayaProfileInputLayout.getVisibility() == 0 && mayaProfileInputLayout.isEnabled()) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 16:
                Pair it2 = (Pair) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                return (MayaInputLayout) it2.f18160a;
            case 17:
                Pair it3 = (Pair) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                return (MayaInputLayout) it3.f18160a;
            case 18:
                MatchResult matchResult = (MatchResult) obj;
                kotlin.jvm.internal.j.g(matchResult, "matchResult");
                String str = (String) matchResult.a().get(1);
                C2579a.a(16);
                return String.valueOf((char) Integer.parseInt(str, 16));
            case 19:
                MatchResult matchResult2 = (MatchResult) obj;
                kotlin.jvm.internal.j.g(matchResult2, "matchResult");
                String str2 = (String) matchResult2.a().get(1);
                C2579a.a(16);
                return String.valueOf((char) Integer.parseInt(str2, 16));
            case 20:
                Cg.b createClientPlugin10 = (Cg.b) obj;
                kotlin.jvm.internal.j.g(createClientPlugin10, "$this$createClientPlugin");
                Fg.i iVar = (Fg.i) createClientPlugin10.f765b;
                Fg.g c2360b = iVar.c;
                if (c2360b == null) {
                    int i10 = Fg.h.f1609a;
                    c2360b = new C2360b();
                }
                Fg.e eVar = iVar.f1612d;
                ArrayList arrayList3 = iVar.f1610a;
                ArrayList arrayList4 = iVar.f1611b;
                createClientPlugin10.a(t.f1632d, new Fg.k(arrayList3, c2360b, eVar, arrayList4, null));
                createClientPlugin10.a(t.c, new C0120q(eVar, arrayList4, null));
                createClientPlugin10.a(t.f1631b, new C0104a(eVar, interfaceC1526a, 6));
                if (!eVar.c) {
                    return Unit.f18162a;
                }
                Fg.m mVar = new Fg.m(eVar, null);
                Cg.c cVar = Gg.j.f1981a;
                Object objInvoke = ((Function0) cVar.f768b).invoke();
                Gg.g prepare = (Gg.g) objInvoke;
                kotlin.jvm.internal.j.g(prepare, "$this$prepare");
                prepare.f1977a = mVar;
                Unit unit = Unit.f18162a;
                cVar.b(new Cg.d((Rg.a) cVar.f769d, objInvoke, (Function1) cVar.c), createClientPlugin10.f764a);
                return Unit.f18162a;
            case 21:
                C0916h interstitialAdVariables = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 22:
                C0916h interstitialAdVariables2 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables2, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 23:
                C0916h interstitialAdVariables3 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables3, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 24:
                C0916h interstitialAdVariables4 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables4, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 25:
                C0910b bannerItemVariables = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 26:
                C0910b bannerItemVariables2 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables2, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
            case 27:
                C0916h interstitialAdVariables5 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables5, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            case 28:
                C0916h interstitialAdVariables6 = (C0916h) obj;
                kotlin.jvm.internal.j.g(interstitialAdVariables6, "interstitialAdVariables");
                yk.a.a();
                return Unit.f18162a;
            default:
                C0910b bannerItemVariables3 = (C0910b) obj;
                kotlin.jvm.internal.j.g(bannerItemVariables3, "bannerItemVariables");
                yk.a.a();
                return Unit.f18162a;
        }
    }
}
