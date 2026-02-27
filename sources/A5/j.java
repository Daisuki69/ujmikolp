package A5;

import cj.C1132s;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.adkit.data.network.AdUserTagApi;
import com.paymaya.domain.model.BillerInput;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.J0;
import defpackage.Thread;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import u5.AbstractC2302a;
import w.C2360b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;

    public /* synthetic */ j(int i) {
        this.f170a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f170a) {
            case 0:
                return new C5.a();
            case 1:
                return new OkHttpClient.Builder().build();
            case 2:
                return Unit.f18162a;
            case 3:
                return Unit.f18162a;
            case 4:
                return Unit.f18162a;
            case 5:
                return Unit.f18162a;
            case 6:
                return new String[20];
            case 7:
                return new String[20];
            case 8:
                return new String[12];
            case 9:
                return new String[12];
            case 10:
                C2360b c2360b = new C2360b();
                try {
                    return !(ok.d.b().a() instanceof qk.c) ? new Ff.f(c2360b) : new Ff.f(new A7.f(Class.forName("android.util.Log"), c2360b));
                } catch (ClassNotFoundException unused) {
                    return new Ff.f(c2360b);
                }
            case 11:
                return Boolean.TRUE;
            case 12:
                return new LinkedHashMap();
            case 13:
                return Unit.f18162a;
            case 14:
                return new ArrayList();
            case 15:
                return new ArrayList();
            case 16:
                try {
                    return Class.forName("io.ktor.utils.io.jvm.javaio.PollersKt").getMethod("isParkingAllowed", null);
                } catch (Throwable unused2) {
                    return null;
                }
            case 17:
                return ProtoAdapter.Companion.newMapAdapter(ProtoAdapter.UINT32, Thread.ADAPTER);
            case 18:
                return ProtoAdapter.Companion.newMapAdapter(ProtoAdapter.UINT32, Thread.ADAPTER);
            case 19:
                int i = PayMayaApplication.f10200l;
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = AbstractC2302a.a().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new JSONObject((Map) it.next()).toString());
                        break;
                    }
                } catch (Exception unused3) {
                    yk.a.e();
                }
                return arrayList;
            case 20:
                return new J0();
            case 21:
                return (AdUserTagApi) new Retrofit.Builder().baseUrl("https://boost-maya-ads-service-proxy-production.voyagerapis.com/").addConverterFactory(GsonConverterFactory.create()).client(Y4.a.f6749a).build().create(AdUserTagApi.class);
            case 22:
                return new com.google.gson.j();
            case 23:
                return Integer.valueOf((new SecureRandom().nextInt(10) + 1) * 1000);
            case 24:
                return ReverseProtoWriter.forwardBuffer_delegate$lambda$0();
            case 25:
                return C1132s.g(new i9.a(2131231408, R.string.maya_label_wizard_pager_item_title_1, R.string.maya_label_wizard_pager_item_description_1), new i9.a(2131231409, R.string.maya_label_wizard_pager_item_title_2, R.string.maya_label_wizard_pager_item_description_2), new i9.a(2131231410, R.string.maya_label_wizard_pager_item_title_3, R.string.maya_label_wizard_pager_item_description_3), new i9.a(2131231411, R.string.maya_label_wizard_pager_item_title_4, R.string.maya_label_wizard_pager_item_description_4), new i9.a(2131231412, R.string.maya_label_wizard_pager_item_title_5, R.string.maya_label_wizard_pager_item_description_5));
            case 26:
                return new LinkedHashMap();
            case 27:
                return BillerInput.sBuilder();
            case 28:
                return 33554432;
            default:
                return SharedPreferencesAsyncApi.Companion.codec_delegate$lambda$0();
        }
    }
}
