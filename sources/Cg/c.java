package Cg;

import Ah.q;
import Bg.E;
import D.InterfaceC0191y;
import D.S;
import F.k;
import G6.m;
import Kh.T;
import L9.C0323a;
import L9.I;
import N5.C0466m;
import P5.C0533b;
import P5.X;
import P5.Y;
import Q6.o;
import S1.v;
import T3.l;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bg.AbstractC0983W;
import cg.InterfaceC1101b;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.zxing.FormatException;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.C1282s;
import com.paymaya.domain.store.H;
import com.paymaya.domain.store.U0;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import com.voyager.glimpse.network.SendAnalyticsException;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.split.android.client.dtos.Event;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.z;
import kotlin.reflect.KTypeProjection;
import okhttp3.OkHttpClient;
import pg.r;
import pg.s;
import pg.t;
import w.C2361c;
import yf.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements E, Ch.c, F1.c, H, q, InterfaceC1101b, s {
    public static c e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f768b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f769d;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.f767a = i;
        this.f768b = obj;
        this.c = obj2;
        this.f769d = obj3;
    }

    public static c k() {
        c cVar = e;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Glimpse not born yet.");
    }

    public static void n(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        Dh.d dVar = (Dh.d) this.f768b;
        dVar.getClass();
        Dh.a.c(dVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f767a) {
            case 1:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((MayaDashboardFragment) ((F7.a) ((A7.h) this.f768b).c.get())).J1("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                ((t) this.f769d).error("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", "MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.c);
                return;
            case 2:
                Bb.e eVar = (Bb.e) this.f768b;
                Transfer transfer = (Transfer) this.c;
                FavoriteDetails favoriteDetails = (FavoriteDetails) this.f769d;
                kotlin.jvm.internal.j.f(eVar.f((Throwable) obj, true), "mayaErrorHandling(...)");
                kotlin.jvm.internal.j.g(transfer, "transfer");
                kotlin.jvm.internal.j.g(favoriteDetails, "favoriteDetails");
                MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = (MayaSendMoneyConfirmationFragment) ((Fb.a) eVar.c.get());
                mayaSendMoneyConfirmationFragment.getClass();
                Gb.b bVar = mayaSendMoneyConfirmationFragment.f13761g0;
                if (bVar != null) {
                    ((MayaSendMoneyActivity) bVar).d2(transfer, favoriteDetails, FavoriteStatus.FAVORITE_UPDATE_FAILURE);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaSendMoneyConfirmationFragmentListener");
                    throw null;
                }
            case 8:
                G6.g gVar = (G6.g) this.f768b;
                PayMayaError payMayaErrorF = gVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                BankPullPaymentOption paymentOption = (BankPullPaymentOption) this.c;
                String str = (String) this.f769d;
                kotlin.jvm.internal.j.g(paymentOption, "paymentOption");
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                MayaBankPullV2Fragment mayaBankPullV2Fragment = (MayaBankPullV2Fragment) ((K6.e) gVar.c.get());
                mayaBankPullV2Fragment.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(12);
                c1219h.t(EnumC1217f.UNLINK);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                c1219h.j.put("bank", paymentOption.getId());
                LinkedPaymentOption paymentOption2 = paymentOption.getPaymentOption();
                c1219h.j.put("account_number", paymentOption2 != null ? paymentOption2.getLastFourDigits() : null);
                c1219h.j.put("bank_status", str);
                c1219h.i();
                mayaBankPullV2Fragment.z1(c1219h);
                FragmentActivity fragmentActivityRequireActivity = mayaBankPullV2Fragment.requireActivity();
                C0466m c0466m = mayaBankPullV2Fragment.f11642o0;
                kotlin.jvm.internal.j.d(c0466m);
                NestedScrollView nestedScrollView = (NestedScrollView) c0466m.f4150b;
                kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                b0.e(fragmentActivityRequireActivity, nestedScrollView, null, R.string.maya_label_account_unlink_failed_title_v2, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                return;
            case 10:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                m mVar = (m) this.f768b;
                ?? r02 = this.c;
                mVar.l("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", r02);
                ((t) this.f769d).error("MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", "MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", r02);
                return;
            case 11:
                Profile it3 = (Profile) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                C0323a c0323a = (C0323a) this.f768b;
                String str2 = (String) this.c;
                String str3 = (String) this.f769d;
                if (((com.paymaya.data.preference.a) c0323a.i).D()) {
                    ((com.paymaya.data.preference.a) c0323a.i).v0("");
                    ((com.paymaya.data.preference.a) c0323a.i).i0("");
                    ((com.paymaya.data.preference.a) c0323a.i).T(false);
                    c0323a.v();
                    ((BaseMayaSettingsFragment) ((Rb.j) c0323a.c.get())).M1();
                    return;
                }
                ((com.paymaya.data.preference.a) c0323a.i).v0(C.r(str2));
                ((com.paymaya.data.preference.a) c0323a.i).i0(str3);
                ((com.paymaya.data.preference.a) c0323a.i).T(true);
                c0323a.v();
                ((BaseMayaSettingsFragment) ((Rb.j) c0323a.c.get())).M1();
                return;
            case 12:
                Ze.a it4 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                if (it4.f6934b) {
                    ((LauncherActivity) ((Md.b) ((I) this.f768b).c.get())).t1(RtspHeaders.ALLOW);
                } else {
                    ((LauncherActivity) ((Md.b) ((I) this.f768b).c.get())).t1("Deny");
                }
                ((I) this.f768b).r((String) this.c, (String) this.f769d);
                return;
            default:
                MFAChallengeInformation it5 = (MFAChallengeInformation) obj;
                kotlin.jvm.internal.j.g(it5, "it");
                MfaMeta mfaMeta = (MfaMeta) this.c;
                ((o) this.f768b).r(mfaMeta.getChallengeId(), mfaMeta.getTransactionType(), (String) this.f769d);
                return;
        }
    }

    @Override // Bg.E
    public void b(Object obj, wg.c scope) {
        d plugin = (d) obj;
        kotlin.jvm.internal.j.g(plugin, "plugin");
        kotlin.jvm.internal.j.g(scope, "scope");
        b bVar = new b(plugin.f770a, scope, plugin.f771b);
        plugin.c.invoke(bVar);
        plugin.f772d = bVar.f766d;
        for (e eVar : bVar.c) {
            eVar.getClass();
            eVar.f773a.a(scope, eVar.f774b);
        }
    }

    @Override // Bg.E
    public Object c(Function1 function1) {
        Object objInvoke = ((Function0) this.f768b).invoke();
        function1.invoke(objInvoke);
        return new d((Rg.a) this.f769d, objInvoke, (Function1) this.c);
    }

    public String d(String cipherText, F.e eVar) {
        kotlin.jvm.internal.j.g(cipherText, "cipherText");
        return ((c) this.f769d).i(eVar).a(cipherText);
    }

    public String e(String cipherText, String key) {
        F.e eVar = F.e.f1496b;
        kotlin.jvm.internal.j.g(cipherText, "cipherText");
        kotlin.jvm.internal.j.g(key, "key");
        if (!X5.f.t(cipherText)) {
            return cipherText;
        }
        F.d dVarI = ((c) this.f769d).i(eVar);
        return F.f.f1497a[((k) this.f768b).ordinal()] == 1 ? InterfaceC0191y.f960d.contains(key) ? dVarI.a(cipherText) : cipherText : dVarI.a(cipherText);
    }

    public void f() {
        HashMap map = (HashMap) this.f769d;
        Iterator it = new ArrayList(map.values()).iterator();
        while (it.hasNext()) {
            ((Re.b) it.next()).h();
        }
        map.clear();
    }

    public String g(String plainText) {
        F.e eVar = F.e.f1496b;
        kotlin.jvm.internal.j.g(plainText, "plainText");
        return ((c) this.f769d).i(eVar).b(plainText);
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        switch (this.f767a) {
            case 20:
                return new X((OkHttpClient) ((InterfaceC1101b) this.f769d).get(), (C1261h) ((C0533b) this.f768b).get(), (com.paymaya.data.preference.a) ((InterfaceC1101b) this.c).get());
            case 21:
                return new X((OkHttpClient) ((InterfaceC1101b) this.f769d).get(), (com.paymaya.data.preference.a) ((InterfaceC1101b) this.f768b).get(), (U0) ((C0533b) this.c).get());
            default:
                PayMayaClientApi payMayaClientApi = (PayMayaClientApi) ((InterfaceC1101b) this.c).get();
                com.paymaya.data.preference.a aVar = (com.paymaya.data.preference.a) ((InterfaceC1101b) this.f769d).get();
                ((Kh.I) this.f768b).getClass();
                C1282s c1282s = new C1282s();
                c1282s.c = payMayaClientApi;
                c1282s.f11479b = aVar;
                return c1282s;
        }
    }

    @Override // Bg.E
    public Rg.a getKey() {
        return (Rg.a) this.f769d;
    }

    public String h(String plainText, String key) {
        F.e eVar = F.e.f1496b;
        kotlin.jvm.internal.j.g(plainText, "plainText");
        kotlin.jvm.internal.j.g(key, "key");
        if (X5.f.t(plainText)) {
            return plainText;
        }
        return (F.f.f1497a[((k) this.f768b).ordinal()] == 1 && InterfaceC0191y.f960d.contains(key)) ? ((c) this.f769d).i(eVar).b(plainText) : plainText;
    }

    public F.d i(F.e eVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f769d;
        Object aVar = linkedHashMap.get(eVar);
        if (aVar == null) {
            String str = (String) this.f768b;
            mg.c cVar = (mg.c) this.c;
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                aVar = new F.a(str);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new F.c(cVar);
            }
            linkedHashMap.put(eVar, aVar);
        }
        return (F.d) aVar;
    }

    public Cipher j(int i) {
        try {
            Cipher cipher = (Cipher) ((Gi.c) this.f768b).a();
            cipher.init(i, (SecretKey) this.c, (IvParameterSpec) this.f769d);
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
            Ri.a.g("Error initializing cipher: " + e7.getMessage());
            return null;
        }
    }

    public int l(String campaignId) {
        kotlin.jvm.internal.j.g(campaignId, "campaignId");
        SharedPreferences sharedPreferencesW = w();
        if (sharedPreferencesW == null) {
            return 0;
        }
        return sharedPreferencesW.getInt("__triggers_".concat(campaignId), 0);
    }

    public File m(Context context) {
        ((N4.d) this.c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void o() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f768b;
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.c).edit();
        kotlin.jvm.internal.j.d(all);
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (String.class.isInstance(value) && ((Boolean) ((Ag.a) this.f769d).invoke(value)).booleanValue()) {
                if (String.class.equals(Boolean.class)) {
                    kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.Boolean");
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (String.class.equals(Integer.class)) {
                    kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.Int");
                    editorEdit.putInt(key, ((Integer) value).intValue());
                } else if (String.class.equals(Long.class)) {
                    kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.Long");
                    editorEdit.putLong(key, ((Long) value).longValue());
                } else if (String.class.equals(Float.class)) {
                    kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.Float");
                    editorEdit.putFloat(key, ((Float) value).floatValue());
                } else if (String.class.equals(String.class)) {
                    kotlin.jvm.internal.j.e(value, "null cannot be cast to non-null type kotlin.String");
                    editorEdit.putString(key, (String) value);
                } else {
                    if (value instanceof Boolean) {
                        editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        editorEdit.putInt(key, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        editorEdit.putLong(key, ((Number) value).longValue());
                    } else if (value instanceof Float) {
                        editorEdit.putFloat(key, ((Number) value).floatValue());
                    } else if (value instanceof String) {
                        editorEdit.putString(key, (String) value);
                    }
                    Unit unit = Unit.f18162a;
                }
            }
        }
        D.b0.i(editorEdit);
        sharedPreferences.edit().clear().apply();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H, Ah.q, Ah.b
    public void onError(Throwable th2) {
        switch (this.f767a) {
            case 13:
                Le.b.a((Le.b) this.f768b, (Activity) this.c, "MAYA_DATA_EXTRACTION_EXTRACT_FAILURE", this.f769d);
                break;
            default:
                Dh.a.c((Dh.d) this.f768b, ((Nh.e) ((T) this.f769d).c).c(new v(10, this, th2, false), 0L, TimeUnit.MILLISECONDS));
                break;
        }
    }

    @Override // pg.s
    public void onMethodCall(r rVar, t tVar) {
        HashMap map;
        String str = rVar.f19112a;
        str.getClass();
        map = (HashMap) this.f769d;
        switch (str) {
            case "init":
                String str2 = (String) rVar.a(TtmlNode.ATTR_ID);
                if (!map.containsKey(str2)) {
                    List list = (List) rVar.a("androidAudioEffects");
                    map.put(str2, new Re.b((Context) this.f768b, (pg.j) this.c, str2, (Map) rVar.a("audioLoadConfiguration"), list, (Boolean) rVar.a("androidOffloadSchedulingEnabled")));
                    tVar.success(null);
                    break;
                } else {
                    tVar.error(We.s.j("Platform player ", str2, " already exists"), null, null);
                    break;
                }
                break;
            case "disposePlayer":
                String str3 = (String) rVar.a(TtmlNode.ATTR_ID);
                Re.b bVar = (Re.b) map.get(str3);
                if (bVar != null) {
                    bVar.h();
                    map.remove(str3);
                }
                tVar.success(new HashMap());
                break;
            case "disposeAllPlayers":
                f();
                tVar.success(new HashMap());
                break;
            default:
                tVar.notImplemented();
                break;
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        Dh.a.c((Dh.d) this.f768b, ((Nh.e) ((T) this.f769d).c).c(new v(11, this, obj, false), 300L, TimeUnit.MILLISECONDS));
    }

    public void p(int i, long j) {
        this.c = new Bf.j();
        ((HashMap) this.f768b).put(Long.valueOf(j), (Bf.j) this.c);
        ((Bf.j) this.c).getClass();
    }

    public boolean q(int i, int i4, int i6, int i10) {
        if (i < 0) {
            i += i6;
            i4 += 4 - ((i6 + 4) & 7);
        }
        if (i4 < 0) {
            i4 += i10;
            i += 4 - ((i10 + 4) & 7);
        }
        ((K3.b) this.c).f(i4, i);
        return ((K3.b) this.f768b).b(i4, i);
    }

    public int r(int i, int i4, int i6, int i10) {
        int i11 = i - 2;
        int i12 = i4 - 2;
        int i13 = (q(i11, i12, i6, i10) ? 1 : 0) << 1;
        int i14 = i4 - 1;
        if (q(i11, i14, i6, i10)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i - 1;
        if (q(i16, i12, i6, i10)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (q(i16, i14, i6, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (q(i16, i4, i6, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (q(i, i12, i6, i10)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (q(i, i14, i6, i10)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        return q(i, i4, i6, i10) ? i21 | 1 : i21;
    }

    public void s(Cipher cipher) {
        ((Gi.c) this.f768b).f2001a.release(cipher);
    }

    public void t() {
        Qf.b bVar = (Qf.b) this.f768b;
        J1.e eVar = (J1.e) this.c;
        if (eVar != null) {
            Lh.c cVar = (Lh.c) this.f769d;
            try {
                if (cVar != null) {
                    try {
                        HashMap mapG = cVar.g();
                        if (mapG.isEmpty()) {
                            bVar.b();
                        } else {
                            for (String str : mapG.keySet()) {
                                eVar.a((String) mapG.get(str));
                                new File((File) ((l) cVar.c).f5786b, str).delete();
                            }
                        }
                        bVar.finish();
                        return;
                    } catch (SendAnalyticsException e7) {
                        if (S1.r.f5624b) {
                            Log.w("Glimpse", "Error sending analytics.", null);
                        }
                        e7.printStackTrace();
                        bVar.finish();
                        return;
                    }
                }
            } catch (Throwable th2) {
                bVar.finish();
                throw th2;
            }
        }
        bVar.b();
    }

    public String toString() {
        switch (this.f767a) {
            case 17:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f768b);
                sb2.append('{');
                Lh.c cVar = (Lh.c) ((Lh.c) this.c).c;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f2990b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    cVar = (Lh.c) cVar.c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(long j) {
        if (((Bf.j) this.f769d) != null) {
            Log.w("PdfBox-Android", "Method must be called only ones with last startxref value.");
            return;
        }
        Bf.j jVar = new Bf.j();
        this.f769d = jVar;
        jVar.f463a = new yf.d();
        HashMap map = (HashMap) this.f768b;
        Bf.j jVar2 = (Bf.j) map.get(Long.valueOf(j));
        ArrayList arrayList = new ArrayList();
        if (jVar2 == null) {
            Log.w("PdfBox-Android", "Did not found XRef object at specified startxref position " + j);
            arrayList.addAll(map.keySet());
            Collections.sort(arrayList);
        } else {
            ((Bf.j) this.f769d).getClass();
            arrayList.add(Long.valueOf(j));
            while (true) {
                yf.d dVar = jVar2.f463a;
                if (dVar == null) {
                    break;
                }
                long jY = dVar.y(yf.j.f21213c1);
                if (jY == -1) {
                    break;
                }
                jVar2 = (Bf.j) map.get(Long.valueOf(jY));
                if (jVar2 == null) {
                    Log.w("PdfBox-Android", "Did not found XRef object pointed to by 'Prev' key at position " + jY);
                    break;
                } else {
                    arrayList.add(Long.valueOf(jY));
                    if (arrayList.size() >= map.size()) {
                        break;
                    }
                }
            }
            Collections.reverse(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bf.j jVar3 = (Bf.j) map.get((Long) it.next());
            yf.d dVar2 = jVar3.f463a;
            if (dVar2 != null) {
                ((Bf.j) this.f769d).f463a.f(dVar2);
            }
            ((Bf.j) this.f769d).f464b.putAll(jVar3.f464b);
        }
    }

    public void v(n nVar, long j) {
        Bf.j jVar = (Bf.j) this.c;
        if (jVar != null) {
            if (jVar.f464b.containsKey(nVar)) {
                return;
            }
            ((Bf.j) this.c).f464b.put(nVar, Long.valueOf(j));
        } else {
            Log.w("PdfBox-Android", "Cannot add XRef entry for '" + nVar.f21273a + "' because XRef start was not signalled.");
        }
    }

    public SharedPreferences w() {
        String str = "triggers_per_inapp:" + ((D.H) this.c).f() + ':' + ((String) this.f768b);
        Context context = (Context) ((WeakReference) this.f769d).get();
        if (context == null) {
            return null;
        }
        return D.b0.f(context, str);
    }

    public c x(Event event, boolean z4) {
        c cVarP = ((S) this.c).p(event.key);
        if (cVarP != null) {
            return cVarP;
        }
        String str = event.trafficTypeName;
        if (str == null) {
            return new c(200, "you passed a null or undefined traffic_type_name, traffic_type_name must be a non-empty string", false);
        }
        if (AbstractC0983W.q(str.trim())) {
            return new c(200, "you passed an empty traffic_type_name, traffic_type_name must be a non-empty string", false);
        }
        String str2 = event.eventTypeId;
        if (str2 == null) {
            return new c(200, "you passed a null or undefined event_type, event_type must be a non-empty String", false);
        }
        if (AbstractC0983W.q(str2.trim())) {
            return new c(200, "you passed an empty event_type, event_type must be a non-empty String", false);
        }
        String str3 = event.eventTypeId;
        String str4 = (String) this.f768b;
        if (!str3.matches(str4)) {
            return new c(200, androidx.camera.core.impl.a.p(new StringBuilder("you passed "), event.eventTypeId, ", event name must adhere to the regular expression ", str4, ". This means an event name must be alphanumeric, cannot be more than 80 characters long, and can only include a dash,  underscore, period, or colon as separators of alphanumeric characters."), false);
        }
        if (!event.trafficTypeName.toLowerCase().equals(event.trafficTypeName)) {
            cVarP = new c(101, "traffic_type_name should be all lowercase - converting string to lowercase", true);
        }
        if (z4 && !((io.split.android.client.storage.splits.c) this.f769d).k(event.trafficTypeName)) {
            String strP = We.s.p(new StringBuilder("Traffic Type "), event.trafficTypeName, " does not have any corresponding feature flags in this environment, make sure you’re tracking your events to a valid traffic type defined in the Split user interface");
            if (cVarP == null) {
                return new c(102, strP, true);
            }
            if (strP != null) {
                ((HashMap) cVarP.f769d).put(102, strP);
            }
        }
        return cVarP;
    }

    @Override // F1.c
    public Object zza() {
        return new com.google.android.play.core.appupdate.a((E1.j) ((F1.c) this.f768b).zza(), (E1.d) ((F1.c) this.c).zza(), ((E1.e) ((C2361c) this.f769d).f20518b).f1229a);
    }

    public /* synthetic */ c(Y y7, InterfaceC1101b interfaceC1101b, InterfaceC1101b interfaceC1101b2, InterfaceC1101b interfaceC1101b3, int i) {
        this.f767a = i;
        this.f768b = interfaceC1101b;
        this.c = interfaceC1101b2;
        this.f769d = interfaceC1101b3;
    }

    public c(String str, mg.c cVar) {
        this.f767a = 5;
        this.f768b = str;
        this.c = cVar;
        this.f769d = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.paymaya.domain.store.H
    public void onSuccess() {
        Le.b.a((Le.b) this.f768b, (Activity) this.c, "MAYA_DATA_EXTRACTION_EXTRACT_SUCCESS", this.f769d);
    }

    public c(k kVar, String str, F.i iVar, c cVar) {
        this.f767a = 6;
        this.f768b = kVar;
        this.c = iVar;
        this.f769d = cVar;
    }

    public c(Context context, String str, D.H h) {
        this.f767a = 16;
        kotlin.jvm.internal.j.g(context, "context");
        this.f768b = str;
        this.c = h;
        this.f769d = new WeakReference(context);
    }

    public c(S s9, io.split.android.client.storage.splits.c cVar) {
        this.f767a = 27;
        this.f768b = "^[a-zA-Z0-9][-_.:a-zA-Z0-9]{0,79}$";
        this.c = s9;
        this.f769d = cVar;
    }

    public c(SharedPreferences sharedPreferences, SharedPreferences newSharedPreferences, Ag.a aVar) {
        this.f767a = 15;
        kotlin.jvm.internal.j.g(newSharedPreferences, "newSharedPreferences");
        this.f768b = sharedPreferences;
        this.c = newSharedPreferences;
        this.f769d = aVar;
    }

    public c(Set set, Set set2, List list) {
        this.f767a = 29;
        this.f768b = set == null ? new HashSet() : set;
        this.c = set2 == null ? new HashSet() : set2;
        this.f769d = list;
    }

    public c(pg.j jVar, Context context) {
        this.f767a = 26;
        this.f769d = new HashMap();
        this.f768b = context;
        this.c = jVar;
    }

    public c(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, H.b bVar) {
        this.f767a = 7;
        kotlin.jvm.internal.j.g(context, "context");
        this.f768b = context;
        this.c = cleverTapInstanceConfig;
        this.f769d = bVar;
    }

    public c(int i, String str, boolean z4) {
        this.f767a = 28;
        this.f768b = null;
        HashMap map = new HashMap();
        this.f769d = map;
        if (!z4) {
            this.f768b = Integer.valueOf(i);
            this.c = str;
        } else {
            map.put(Integer.valueOf(i), str);
        }
    }

    public c(String str, int i) {
        SecretKey secretKeyGenerateKey;
        this.f767a = i;
        switch (i) {
            case 17:
                Lh.c cVar = new Lh.c(8);
                this.c = cVar;
                this.f769d = cVar;
                this.f768b = str;
                break;
            default:
                Ri.a.d("Using SecureKeyStorageProvider");
                String str2 = "split_key_" + str;
                SecretKey secretKey = null;
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (!keyStore.containsAlias(str2)) {
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        keyGenerator.init(new KeyGenParameterSpec.Builder(str2, 3).setKeySize(128).setBlockModes("CBC").setRandomizedEncryptionRequired(false).setEncryptionPaddings("PKCS7Padding").build());
                        secretKeyGenerateKey = keyGenerator.generateKey();
                    } else {
                        secretKeyGenerateKey = (SecretKey) keyStore.getKey(str2, null);
                    }
                    secretKey = secretKeyGenerateKey;
                } catch (Exception e7) {
                    Ri.a.g("Error while getting key from Android KeyStore: " + e7.getMessage());
                }
                this.c = secretKey;
                byte[] bArr = new byte[16];
                System.arraycopy(str.getBytes(), 0, bArr, 0, 16);
                this.f769d = new IvParameterSpec(bArr);
                this.f768b = new Gi.c(new z2.d(3));
                break;
        }
    }

    public c(K3.b bVar) throws FormatException {
        int i;
        int i4;
        this.f767a = 19;
        int i6 = bVar.f2590b;
        if (i6 >= 8 && i6 <= 144 && (i = i6 & 1) == 0) {
            O3.c[] cVarArr = O3.c.h;
            if (i == 0) {
                int i10 = bVar.f2589a;
                if ((i10 & 1) == 0) {
                    O3.c[] cVarArr2 = O3.c.h;
                    for (int i11 = 0; i11 < 30; i11++) {
                        O3.c cVar = cVarArr2[i11];
                        int i12 = cVar.f4636b;
                        if (i12 == i6 && (i4 = cVar.c) == i10) {
                            this.f769d = cVar;
                            if (i6 == i12) {
                                int i13 = cVar.f4637d;
                                int i14 = i12 / i13;
                                int i15 = cVar.e;
                                int i16 = i4 / i15;
                                K3.b bVar2 = new K3.b(i16 * i15, i14 * i13);
                                for (int i17 = 0; i17 < i14; i17++) {
                                    int i18 = i17 * i13;
                                    for (int i19 = 0; i19 < i16; i19++) {
                                        int i20 = i19 * i15;
                                        for (int i21 = 0; i21 < i13; i21++) {
                                            int i22 = ((i13 + 2) * i17) + 1 + i21;
                                            int i23 = i18 + i21;
                                            for (int i24 = 0; i24 < i15; i24++) {
                                                if (bVar.b(((i15 + 2) * i19) + 1 + i24, i22)) {
                                                    bVar2.f(i20 + i24, i23);
                                                }
                                            }
                                        }
                                    }
                                }
                                this.f768b = bVar2;
                                this.c = new K3.b(bVar2.f2589a, bVar2.f2590b);
                                return;
                            }
                            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                        }
                    }
                    throw FormatException.a();
                }
            }
            throw FormatException.a();
        }
        throw FormatException.a();
    }

    public c(T t5, Dh.d dVar, q qVar) {
        this.f767a = 14;
        this.f769d = t5;
        this.f768b = dVar;
        this.c = qVar;
    }

    public c(String str, Function0 createConfiguration, Function1 function1) {
        F fB;
        this.f767a = 0;
        kotlin.jvm.internal.j.g(createConfiguration, "createConfiguration");
        this.f768b = createConfiguration;
        this.c = function1;
        C1790e c1790eA = z.a(d.class);
        try {
            KTypeProjection.a aVar = KTypeProjection.c;
            C1790e c1790eA2 = z.a(c.class);
            xj.r rVar = xj.r.f21013a;
            A a8 = z.f18196a;
            a8.getClass();
            kotlin.jvm.internal.E e7 = new kotlin.jvm.internal.E(c1790eA2);
            z.b(e7, z.c(Object.class));
            F fB2 = A.b(e7, Collections.EMPTY_LIST, false);
            aVar.getClass();
            KTypeProjection kTypeProjection = new KTypeProjection(xj.r.f21013a, fB2);
            C1790e c1790eA3 = z.a(d.class);
            List listSingletonList = Collections.singletonList(kTypeProjection);
            a8.getClass();
            fB = A.b(c1790eA3, listSingletonList, false);
        } catch (Throwable unused) {
            fB = null;
        }
        this.f769d = new Rg.a(str, new Wg.a(c1790eA, fB));
    }

    public c(int i) {
        this.f767a = i;
        switch (i) {
            case 18:
                N4.d dVar = new N4.d(11);
                M2.b bVar = new M2.b(11);
                this.f768b = new HashSet();
                this.c = dVar;
                this.f769d = bVar;
                break;
            case 23:
                break;
            default:
                this.f768b = new HashMap();
                this.c = null;
                this.f769d = null;
                break;
        }
    }
}
