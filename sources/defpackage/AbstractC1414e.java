package defpackage;

import A5.b;
import D.S;
import N2.d;
import P2.h;
import Ri.a;
import S5.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.util.Timer;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.shield.android.Shield;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import okhttp3.OkHttpClient;
import org.json.JSONException;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1414e {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "AES_128_CBC";
        }
        if (i == 2) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ long b(int i) {
        if (i == 1) {
            return 1099511627776L;
        }
        if (i == 2) {
            return 1073741824L;
        }
        if (i == 3) {
            return 1048576L;
        }
        if (i == 4) {
            return 1024L;
        }
        if (i == 5) {
            return 1L;
        }
        throw null;
    }

    public static int c(int i, int i4, String str) {
        return (str.hashCode() + i) * i4;
    }

    public static int d(List list, int i, int i4) {
        return (list.hashCode() + i) * i4;
    }

    public static View e(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z4) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z4);
    }

    public static Object f(Retrofit.Builder builder, String str, OkHttpClient okHttpClient, Class cls) {
        return builder.baseUrl(str).client(okHttpClient).build().create(cls);
    }

    public static String g(MayaInputLayout mayaInputLayout) {
        return String.valueOf(mayaInputLayout.getInputEditText().getText());
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment, int i, String str3) {
        j.f(str, str2);
        String string = mayaKycCompletePersonalInformationFragment.getString(i);
        j.f(string, str3);
        return string;
    }

    public static ArrayList j(ProtoReader protoReader, String str) {
        j.g(protoReader, str);
        return new ArrayList();
    }

    public static void k(c cVar, b bVar, Map map, String str) {
        map.put(str, Boolean.valueOf(c.b(cVar, bVar)));
    }

    public static void l(Timer timer, d dVar, d dVar2) {
        dVar.i(timer.a());
        h.c(dVar2);
    }

    public static void m(C1219h c1219h, EnumC1216e enumC1216e, int i) {
        c1219h.r(enumC1216e);
        c1219h.n(i);
        c1219h.i();
    }

    public static void n(C1219h c1219h, EnumC1217f enumC1217f, C1220i c1220i, FragmentActivity fragmentActivity, C1219h c1219h2) {
        c1219h.t(enumC1217f);
        c1219h.i();
        c1220i.c(fragmentActivity, c1219h2);
    }

    public static void o(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getLocalizedMessage());
        a.g(sb2.toString());
    }

    public static void p(String str, StringBuilder sb2, ArrayList arrayList) {
        sb2.append(Internal.sanitize(str));
        arrayList.add(sb2.toString());
    }

    public static void q(StringBuilder sb2, Boolean bool, ArrayList arrayList) {
        sb2.append(bool);
        arrayList.add(sb2.toString());
    }

    public static void r(StringBuilder sb2, Integer num, ArrayList arrayList) {
        sb2.append(num);
        arrayList.add(sb2.toString());
    }

    public static void s(StringBuilder sb2, List list, ArrayList arrayList) {
        sb2.append(list);
        arrayList.add(sb2.toString());
    }

    public static void t(JSONException jSONException, StringBuilder sb2) {
        sb2.append(jSONException.getLocalizedMessage());
        S.l(sb2.toString());
    }

    public static /* synthetic */ boolean u(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "TEST";
        }
        if (i == 2) {
            return Shield.ENVIRONMENT_STAGING;
        }
        if (i == 3) {
            return "SANDBOX";
        }
        if (i == 4) {
            return "PRODUCTION";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return ShareTarget.METHOD_GET;
        }
        if (i == 2) {
            return ShareTarget.METHOD_POST;
        }
        throw null;
    }
}
