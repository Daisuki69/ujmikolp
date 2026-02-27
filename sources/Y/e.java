package Y;

import D.H;
import D.InterfaceC0191y;
import D.S;
import D.b0;
import D.d0;
import Kh.T;
import Lh.h;
import M8.C0376l;
import O4.k;
import Q6.r;
import R4.i;
import T3.l;
import We.InterfaceC0604h;
import a3.AbstractC0628e;
import a3.C0625b;
import a3.C0627d;
import ag.AbstractC0693c;
import ag.C0692b;
import ag.C0703m;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Base64OutputStream;
import android.util.Log;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ba.u;
import bg.C0952A;
import bg.C0956C;
import bg.C0957C0;
import bg.C0965G0;
import bg.C0966H;
import bg.C0972K;
import bg.C0974M;
import bg.C0985Y;
import bg.C0989b;
import bg.C0999g;
import bg.C1003i;
import bg.C1007k;
import bg.C1010n;
import bg.C1012p;
import bg.C1013q;
import bg.C1015s;
import bg.C1016t;
import bg.C1018v;
import bg.C1019w;
import bg.C1020x;
import bg.C1021y;
import bg.n0;
import bg.o0;
import bg.p0;
import bg.q0;
import bg.r0;
import bg.s0;
import bg.t0;
import bg.u0;
import bg.x0;
import bj.C1034e;
import cj.C1110A;
import cj.C1112C;
import cj.C1127m;
import cj.C1132s;
import cj.G;
import cj.L;
import cj.M;
import cj.t;
import cj.x;
import com.appsflyer.AppsFlyerLib;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.paymaya.R;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.KycInHouseApi;
import com.paymaya.data.api.KycProfileRegulatoryApi;
import com.paymaya.data.api.KycRegulatoryProfileCmsApi;
import com.paymaya.data.api.UpdateProfileApi;
import com.paymaya.data.api.UserProfileUpdateApi;
import com.paymaya.data.database.repository.C1239c;
import com.paymaya.data.database.repository.F;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.KycAdditionalDocsUploadRequest;
import com.paymaya.domain.model.KycUploadRequest;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.Recommendation;
import com.paymaya.domain.model.RecommendationResponse;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.domain.model.User;
import com.paymaya.domain.store.B0;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.L0;
import com.paymaya.domain.store.P0;
import com.paymaya.domain.store.Q0;
import com.paymaya.domain.store.Z;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaAutoProvisionDataPrivacyPolicyFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import com.tencent.could.component.common.ai.net.TxNetWorkHelper;
import dc.C1353d;
import e1.InterfaceC1418b;
import g6.C1504c;
import g9.InterfaceC1508c;
import g9.InterfaceC1509d;
import h9.o;
import ha.p;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import k0.C1689a;
import k2.v0;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Ch.c, W6.d, b0.c, W6.e, Ch.f, InterfaceC1418b, InterfaceC0604h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6708b;
    public Object c;

    public /* synthetic */ e(int i) {
        this.f6707a = i;
    }

    @Override // b0.c
    public boolean a(String str) {
        boolean zA = d0.a(str, ((b0.e) this.f6708b).f8270a);
        ((CleverTapInstanceConfig) this.c).e("ON_USER_LOGIN", "isIdentity [Key: " + str + " , Value: " + zA + "]");
        return zA;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        String string;
        OngoingRegistration ongoingRegistration;
        int i = 2;
        int i4 = 0;
        int i6 = 1;
        switch (this.f6707a) {
            case 4:
                Throwable it = (Throwable) obj;
                j.g(it, "it");
                ((Function1) this.f6708b).invoke(((Z8.a) this.c).f(it, true));
                break;
            case 5:
                j.g((MFAChallengeVerificationResult) obj, "it");
                Lb.a aVar = (Lb.a) this.f6708b;
                String challengeId = (String) this.c;
                aVar.getClass();
                j.g(challengeId, "challengeId");
                C1293x0 c1293x0 = (C1293x0) aVar.f2942g;
                Bundle arguments = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar.c.get())).getArguments();
                String str = (arguments == null || (string = arguments.getString("mobile_number", "")) == null) ? "" : string;
                Bundle arguments2 = ((MayaLoginOTPFragment) ((InterfaceC1508c) aVar.c.get())).getArguments();
                boolean z4 = arguments2 != null ? arguments2.getBoolean("is_from_login") : true;
                MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) ((InterfaceC1508c) aVar.c.get());
                mayaLoginOTPFragment.getClass();
                new T(5, new Lh.d(new Lh.d(new h(c1293x0.k(z4, str, challengeId, AppsFlyerLib.getInstance().getAppsFlyerUID(mayaLoginOTPFragment.requireContext()), "OTP"), zh.b.a(), i4), new l(aVar, 16), i), new r(aVar, 18), i4), new Z8.d(aVar, i6)).e();
                break;
            case 6:
                List<? extends Consent> it2 = (List) obj;
                j.g(it2, "it");
                com.paymaya.data.preference.a aVar2 = ((Z8.f) this.f6708b).f;
                if (aVar2.e().isPartnerOnboardingEnabled() && aVar2.K()) {
                    String strP = aVar2.p();
                    j.f(strP, "getMayaOnboardingPartner(...)");
                    C.s0(aVar2, strP, true);
                }
                Z8.f fVar = (Z8.f) this.f6708b;
                String str2 = (String) this.c;
                fVar.getClass();
                o oVar = ((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get())).f12800e0;
                OngoingRegistration ongoingRegistration2 = null;
                User registeringUser = (oVar == null || (ongoingRegistration = ((MayaRegistrationActivity) oVar).f12734q) == null) ? null : ongoingRegistration.getRegisteringUser();
                if (registeringUser == null) {
                    registeringUser = User.sBuilder().build();
                }
                User userBuild = registeringUser.toBuilder().mPassword(str2).build();
                Identity identityBuild = Identity.sBuilder().mType("msisdn").mValue(C.r(((MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get())).K1())).build();
                InterfaceC1509d interfaceC1509d = (InterfaceC1509d) fVar.c.get();
                j.d(userBuild);
                j.d(identityBuild);
                MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = (MayaRegistrationIdentityFragment) interfaceC1509d;
                mayaRegistrationIdentityFragment.getClass();
                o oVar2 = mayaRegistrationIdentityFragment.f12800e0;
                if (oVar2 != null) {
                    MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) oVar2;
                    OngoingRegistration ongoingRegistration3 = mayaRegistrationActivity.f12734q;
                    if (ongoingRegistration3 != null) {
                        ongoingRegistration3.setRegisteringUser(userBuild);
                        ongoingRegistration3.setRegisteringLoginIdentity(identityBuild);
                        ongoingRegistration2 = ongoingRegistration3;
                    }
                    mayaRegistrationActivity.f12734q = ongoingRegistration2;
                }
                if (fVar.f.e().isSavingsAutoProvisioningEnabled()) {
                    MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment2 = (MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get());
                    mayaRegistrationIdentityFragment2.getClass();
                    o oVar3 = mayaRegistrationIdentityFragment2.f12800e0;
                    if (oVar3 != null) {
                        MayaRegistrationActivity mayaRegistrationActivity2 = (MayaRegistrationActivity) oVar3;
                        OngoingRegistration ongoingRegistration4 = mayaRegistrationActivity2.f12734q;
                        if (ongoingRegistration4 != null) {
                            ongoingRegistration4.setConsentsList(it2);
                        }
                        String string2 = mayaRegistrationActivity2.getString(R.string.maya_label_option_wallet);
                        j.f(string2, "getString(...)");
                        String string3 = mayaRegistrationActivity2.getString(R.string.maya_label_option_wallet_description);
                        j.f(string3, "getString(...)");
                        DataPrivacyProvision dataPrivacyProvision = new DataPrivacyProvision(DataPrivacyProvision.ID_WALLET, 2131231681, R.color.mauve_purple_25_alpha, string2, string3, false, true);
                        String string4 = mayaRegistrationActivity2.getString(R.string.maya_label_option_savings);
                        j.f(string4, "getString(...)");
                        String string5 = mayaRegistrationActivity2.getString(R.string.maya_label_option_savings_description);
                        j.f(string5, "getString(...)");
                        ArrayList arrayListH = C1132s.h(dataPrivacyProvision, new DataPrivacyProvision(DataPrivacyProvision.ID_SAVINGS, 2131231536, R.color.neon_green_15_opacity, string4, string5, true, true));
                        Bundle bundleD = androidx.media3.datasource.cache.c.d("source", "registration");
                        bundleD.putParcelableArrayList("data_privacy_provisions", new ArrayList<>(arrayListH));
                        MayaAutoProvisionDataPrivacyPolicyFragment mayaAutoProvisionDataPrivacyPolicyFragment = new MayaAutoProvisionDataPrivacyPolicyFragment();
                        mayaAutoProvisionDataPrivacyPolicyFragment.setArguments(bundleD);
                        AbstractC1236z.i(mayaRegistrationActivity2, R.id.fragment_container, mayaAutoProvisionDataPrivacyPolicyFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    }
                } else {
                    MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment3 = (MayaRegistrationIdentityFragment) ((InterfaceC1509d) fVar.c.get());
                    mayaRegistrationIdentityFragment3.getClass();
                    o oVar4 = mayaRegistrationIdentityFragment3.f12800e0;
                    if (oVar4 != null) {
                        MayaRegistrationActivity mayaRegistrationActivity3 = (MayaRegistrationActivity) oVar4;
                        OngoingRegistration ongoingRegistration5 = mayaRegistrationActivity3.f12734q;
                        if (ongoingRegistration5 != null) {
                            ongoingRegistration5.setConsentsList(it2);
                        }
                        Bundle bundleD2 = androidx.media3.datasource.cache.c.d("source", "registration");
                        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = new MayaDataPrivacyPolicyFragment();
                        mayaDataPrivacyPolicyFragment.setArguments(bundleD2);
                        AbstractC1236z.i(mayaRegistrationActivity3, R.id.fragment_container, mayaDataPrivacyPolicyFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                    }
                }
                break;
            case 13:
                j.g((Throwable) obj, "it");
                u uVar = (u) this.f6708b;
                BillerTransaction billerTransaction = (BillerTransaction) this.c;
                uVar.getClass();
                j.g(billerTransaction, "billerTransaction");
                MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment = (MayaPayBillsConfirmationFragment) ((ga.d) uVar.c.get());
                mayaPayBillsConfirmationFragment.getClass();
                p pVar = mayaPayBillsConfirmationFragment.f13411e0;
                if (pVar != null) {
                    ((MayaPayBillsActivity) pVar).Z1(billerTransaction, mayaPayBillsConfirmationFragment.I1(), FavoriteStatus.FAVORITE_UPDATE_FAILURE);
                }
                break;
            case 22:
                List<ShopProviderCategory> shopProviderCategoryList = (List) obj;
                j.g(shopProviderCategoryList, "shopProviderCategoryList");
                L0 l02 = (L0) this.f6708b;
                F f = l02.f11368b;
                f.getClass();
                f.f11298a.f2812a.b("shop_provider_category", String.format("%s <> ?", Arrays.copyOf(new Object[]{TtmlNode.ATTR_ID}, 1)), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                F f3 = l02.f11368b;
                f3.getClass();
                ArrayList arrayList = new ArrayList(shopProviderCategoryList.size());
                for (ShopProviderCategory shopProviderCategory : shopProviderCategoryList) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(TtmlNode.ATTR_ID, shopProviderCategory.getId());
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, shopProviderCategory.getName());
                    contentValues.put("code", shopProviderCategory.getCode());
                    contentValues.put("priority", shopProviderCategory.getPriority());
                    arrayList.add(contentValues);
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                j.f(listUnmodifiableList, "unmodifiableList(...)");
                f3.f11298a.a("shop_provider_category", listUnmodifiableList);
                l02.f11369d.f11330b.edit().putString("key_shop_provider_category_date", (String) this.c).apply();
                break;
            default:
                List<ShopProviderSubcategory> shopProviderSubcategoryList = (List) obj;
                j.g(shopProviderSubcategoryList, "shopProviderSubcategoryList");
                List list = shopProviderSubcategoryList;
                ArrayList arrayList2 = new ArrayList(t.l(list, 10));
                Iterator it3 = list.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    String str3 = (String) this.c;
                    if (!zHasNext) {
                        com.paymaya.data.database.repository.C c = ((P0) this.f6708b).c;
                        c.getClass();
                        A7.f fVarA = c.f11295a.a();
                        fVarA.j("shop_provider_subcategory", "provider_name = ?", new String[]{str3});
                        ArrayList arrayList3 = new ArrayList(shopProviderSubcategoryList.size());
                        for (ShopProviderSubcategory shopProviderSubcategory : shopProviderSubcategoryList) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("provider_name", shopProviderSubcategory.getProviderName());
                            contentValues2.put(TtmlNode.ATTR_ID, shopProviderSubcategory.getId());
                            contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, shopProviderSubcategory.getName());
                            contentValues2.put("code", shopProviderSubcategory.getCode());
                            Integer priority = shopProviderSubcategory.getPriority();
                            contentValues2.put("priority", Integer.valueOf(priority != null ? priority.intValue() : Integer.MAX_VALUE));
                            arrayList3.add(contentValues2);
                        }
                        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList3);
                        j.f(listUnmodifiableList2, "unmodifiableList(...)");
                        fVarA.k("shop_provider_subcategory", listUnmodifiableList2);
                        fVarA.d();
                    } else {
                        ((ShopProviderSubcategory) it3.next()).setProviderName(str3);
                        arrayList2.add(Unit.f18162a);
                    }
                    break;
                }
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f6707a) {
            case 21:
                RecommendationResponse it = (RecommendationResponse) obj;
                j.g(it, "it");
                List<Recommendation> recommendations = it.getRecommendations();
                if (recommendations == null) {
                    recommendations = C1112C.f9377a;
                }
                B0 b02 = (B0) this.f6708b;
                C1239c c1239c = b02.c;
                c1239c.f11305a.b("action_card_recommendation", "", null);
                if (recommendations != null && !recommendations.isEmpty()) {
                    com.google.gson.j jVar = A.f10366a;
                    ArrayList arrayList = new ArrayList();
                    for (Recommendation recommendation : recommendations) {
                        String strK = jVar.k(recommendation.getMedia());
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(TtmlNode.ATTR_ID, recommendation.getId());
                        contentValues.put("title", recommendation.getTitle());
                        contentValues.put("subtitle", recommendation.getSubtitle());
                        contentValues.put("color", recommendation.getColor());
                        contentValues.put("application_uri", recommendation.getApplicationUri());
                        contentValues.put("media", strK);
                        arrayList.add(contentValues);
                    }
                    c1239c.f11305a.c("action_card_recommendation", C1110A.V(arrayList));
                }
                b02.f11339d.f11330b.edit().putString("key_action_card_date", (String) this.c).apply();
                return Ah.p.c(recommendations);
            default:
                Boolean shouldGetUpdate = (Boolean) obj;
                j.g(shouldGetUpdate, "shouldGetUpdate");
                boolean zBooleanValue = shouldGetUpdate.booleanValue();
                Q0 q02 = (Q0) this.f6708b;
                if (zBooleanValue) {
                    return q02.f11383b.getShopPurchaseHistory((HashMap) this.c).d(Z.f11418q);
                }
                q02.getClass();
                List listA = q02.c.a(new N4.d(9));
                j.f(listA, "query(...)");
                return Ah.p.c(listA);
        }
    }

    @Override // b0.c
    public b0.e b() {
        return (b0.e) this.f6708b;
    }

    public e c(e eVar) {
        Z3.a aVar = (Z3.a) eVar.f6708b;
        Z3.a aVar2 = (Z3.a) this.f6708b;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (p()) {
            return eVar;
        }
        if (eVar.p()) {
            return this;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = (int[]) eVar.c;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i = length2; i < iArr.length; i++) {
            iArr3[i] = aVar2.a(iArr2[i - length2], iArr[i]);
        }
        return new e(aVar2, iArr3);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, java.util.Map] */
    public x3.d d() {
        C0965G0 c0965g0;
        Wf.c context;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        x3.d aVar;
        x3.d aVar2;
        ByteArrayOutputStream byteArrayOutputStream;
        Base64OutputStream base64OutputStream;
        DeflaterOutputStream deflaterOutputStream;
        int length;
        int i;
        int i4 = 0;
        int i6 = 1;
        Object obj = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(C1003i.class.getName());
        if (obj == null) {
            j.l();
        }
        Object objInvoke = ((Function0) obj).invoke();
        if (objInvoke == null) {
            throw new TypeCastException("null cannot be cast to non-null type credoapp.contract.IDataExtractor");
        }
        C1003i c1003i = (C1003i) objInvoke;
        Object obj2 = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(C1013q.class.getName());
        if (obj2 == null) {
            j.l();
        }
        Object objInvoke2 = ((Function0) obj2).invoke();
        if (objInvoke2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type credoapp.contract.IModuleDiscovery");
        }
        C1013q c1013q = (C1013q) objInvoke2;
        Object obj3 = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(r0.class.getName());
        if (obj3 == null) {
            j.l();
        }
        Object objInvoke3 = ((Function0) obj3).invoke();
        if (objInvoke3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type credoapp.contract.ISerializator");
        }
        r0 r0Var = (r0) objInvoke3;
        Object obj4 = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(C1012p.class.getName());
        if (obj4 == null) {
            j.l();
        }
        Object objInvoke4 = ((Function0) obj4).invoke();
        if (objInvoke4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type credoapp.core.compression.DeflateCompressor");
        }
        synchronized (c1013q) {
            try {
                c1013q.f9108a = new C1010n((Wf.c) c1013q.c.invoke(), new ArrayList(), new LinkedHashMap());
                for (Xf.c cVar : c1013q.f9109b) {
                    C1010n c1010n = c1013q.f9108a;
                    if (c1010n == null) {
                        j.n("_discoveryEntity");
                        throw null;
                    }
                    c1010n.f9100b.add(new C1018v(cVar, new ArrayList()));
                    C1010n c1010n2 = c1013q.f9108a;
                    if (c1010n2 == null) {
                        j.n("_discoveryEntity");
                        throw null;
                    }
                    cVar.a(c1010n2.f9099a);
                }
                C1010n c1010n3 = c1013q.f9108a;
                if (c1010n3 == null) {
                    j.n("_discoveryEntity");
                    throw null;
                }
                Wf.c context2 = c1010n3.f9099a;
                Xf.c[] cVarArr = c1013q.f9109b;
                ArrayList arrayList2 = new ArrayList(cVarArr.length);
                int length2 = cVarArr.length;
                int i10 = 0;
                while (i10 < length2) {
                    Xf.c cVar2 = cVarArr[i10];
                    int i11 = i6;
                    C1010n c1010n4 = c1013q.f9108a;
                    if (c1010n4 == null) {
                        j.n("_discoveryEntity");
                        throw null;
                    }
                    arrayList2.add(cVar2.b(c1010n4.f9099a));
                    i10++;
                    i6 = i11;
                }
                int i12 = i6;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    x.p(C1127m.c((String[]) it.next()), arrayList3);
                }
                Object[] array = C1110A.w(arrayList3).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                C1010n c1010n5 = c1013q.f9108a;
                if (c1010n5 == null) {
                    j.n("_discoveryEntity");
                    throw null;
                }
                ArrayList<C1018v> arrayList4 = c1010n5.f9100b;
                C0956C c0956c = new C0956C();
                ArrayList arrayList5 = new ArrayList(t.l(arrayList4, 10));
                for (C1018v c1018v : arrayList4) {
                    arrayList5.add(new Pair(c1018v.f9129a.c(), c1018v.a()));
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ArrayList arrayList7 = ((C1018v) it2.next()).f9130b;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it3 = arrayList7.iterator();
                    while (it3.hasNext()) {
                        x.p(C1127m.c((C0703m[]) it3.next()), arrayList8);
                    }
                    ArrayList arrayList9 = new ArrayList(t.l(arrayList8, 10));
                    Iterator it4 = arrayList8.iterator();
                    while (it4.hasNext()) {
                        arrayList9.add((C0703m) it4.next());
                    }
                    x.p(arrayList9, arrayList6);
                }
                j.h(context2, "context");
                Object obj5 = context2.f6431b.get("v1.context");
                if (obj5 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                Context context3 = (Context) obj5;
                Object obj6 = context2.f6431b.get("v1.permission_helper");
                if (obj6 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type credoapp.utils.PermissionManager");
                }
                n0 n0Var = (n0) obj6;
                Xf.b bVar = (Xf.b) context2.f6431b.get("v1.logger");
                if (bVar == null) {
                    c0965g0 = null;
                } else {
                    if (context2.f6431b.get("v1.au_info") != null) {
                        throw new ClassCastException();
                    }
                    c0965g0 = new C0965G0(bVar, new C1019w(i4, 6));
                }
                s0 s0Var = new s0(context3, n0Var, strArr, c0965g0);
                AbstractC0693c.c(s0Var, s0.f, null, C0985Y.f8907s, 2);
                AbstractC0693c.c(s0Var, s0.f9115g, null, new k(s0Var, 8), 2);
                C0703m c0703mF = s0Var.f();
                C0974M c0974m = new C0974M(context3, arrayList5, c0965g0);
                AbstractC0693c.c(c0974m, C0974M.e, null, C0999g.f8973K, 2);
                AbstractC0693c.c(c0974m, C0974M.f, null, C0999g.f8975Q, 2);
                AbstractC0693c.c(c0974m, C0974M.f8822g, null, C0999g.f8994y, 2);
                AbstractC0693c.c(c0974m, C0974M.h, null, C0999g.f8972B, 2);
                C0703m c0703mF2 = c0974m.f();
                C0703m[] c0703mArr = new C0703m[2];
                c0703mArr[0] = c0703mF;
                c0703mArr[i12] = c0703mF2;
                ArrayList arrayListH = C1132s.h(c0703mArr);
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(arrayListH);
                arrayList10.addAll(arrayList6);
                Unit unit = Unit.f18162a;
                arrayListH.add(0, new C1021y(context3, arrayList10, c0965g0).f());
                Object[] array2 = arrayListH.toArray(new C0703m[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                C0703m[][] c0703mArr2 = new C0703m[i12][];
                c0703mArr2[0] = (C0703m[]) array2;
                c1010n3.f9100b.add(0, new C1018v(c0956c, C1132s.h(c0703mArr2)));
                C1010n c1010n6 = c1013q.f9108a;
                if (c1010n6 == null) {
                    j.n("_discoveryEntity");
                    throw null;
                }
                context = c1010n6.f9099a;
                arrayList = c1010n6.f9100b;
                linkedHashMap = c1010n6.c;
                j.h(context, "context");
            } finally {
            }
        }
        ArrayList arrayList11 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            x.p(((C1018v) it5.next()).a(), arrayList11);
        }
        Map mapA = G.a(new C0692b(1, arrayList11));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap2 = null;
        }
        x3.d aVar3 = linkedHashMap2 != null ? new Wf.a(String.format("Duplicate areas: %s", Arrays.copyOf(new Object[]{C1110A.z(linkedHashMap2.keySet())}, 1)), 30) : new Wf.b(Unit.f18162a);
        if (aVar3 instanceof Wf.a) {
            return (Wf.a) aVar3;
        }
        ArrayList arrayList12 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        arrayList12.addAll(c1003i.e(arrayList));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String str = (String) M.m(linkedHashMap).get("v1.androidId");
        Object obj7 = context.f6431b.get("v1.context");
        if (obj7 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
        }
        C1016t c1016t = new C1016t((Context) obj7, jCurrentTimeMillis, jCurrentTimeMillis2, str, (Xf.b) context.f6431b.get("v1.logger"));
        AbstractC0693c.c(c1016t, C1016t.i, null, new C0989b(c1016t, 1), 2);
        AbstractC0693c.c(c1016t, C1016t.j, null, new C0989b(c1016t, 4), 2);
        AbstractC0693c.c(c1016t, C1016t.f9117k, null, new C0989b(c1016t, 0), 2);
        AbstractC0693c.c(c1016t, C1016t.f9118l, null, new C0989b(c1016t, 3), 2);
        AbstractC0693c.c(c1016t, C1016t.m, null, C0985Y.f8908t, 2);
        AbstractC0693c.c(c1016t, C1016t.f9119n, null, C0985Y.f8911w, 2);
        AbstractC0693c.c(c1016t, C1016t.f9120o, null, C0985Y.f8896R, 2);
        AbstractC0693c.c(c1016t, C1016t.f9121p, null, new C0989b(c1016t, 2), 2);
        AbstractC0693c.c(c1016t, C1016t.f9122q, null, C0999g.f8984o, 2);
        AbstractC0693c.c(c1016t, C1016t.f9123r, null, C0999g.f8981k, 2);
        Xf.a aVar4 = c1016t.f().c;
        ArrayList arrayList13 = new ArrayList();
        try {
            arrayList13.add(0, aVar4.b());
        } catch (Exception e) {
            String areaName = aVar4.d();
            String strC = X5.f.c(e);
            j.h(areaName, "areaName");
            arrayList13.add(L.c(new Pair(areaName, strC)));
            Xf.b bVar2 = c1003i.f9013b;
            if (bVar2 != null) {
                bVar2.b("Core", e, null);
            }
        }
        arrayList12.addAll(0, arrayList13);
        if (arrayList12.isEmpty()) {
            aVar = new Wf.a("Data is empty", 90);
        } else {
            try {
                Object[] array3 = arrayList12.toArray(new Map[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Map[] mapArr = (Map[]) array3;
                aVar = new Wf.b(r0Var.a(C1132s.h((Map[]) Arrays.copyOf(mapArr, mapArr.length))));
            } catch (Exception e7) {
                aVar = new Wf.a(e7.toString(), 90);
            }
        }
        if (aVar instanceof Wf.a) {
            return aVar;
        }
        String value = (String) ((Wf.b) aVar).f6429b;
        j.h(value, "value");
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            deflaterOutputStream = new DeflaterOutputStream(base64OutputStream, new Deflater(8, true));
            length = value.length();
            i = 0;
        } catch (Exception e10) {
            aVar2 = new Wf.a(e10.toString(), 90);
        }
        while (true) {
            int i13 = i + 10000;
            String strSubstring = value.substring(i, i13 >= length ? length : i13);
            j.f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Charset charsetForName = Charset.forName("UTF-8");
            j.f(charsetForName, "Charset.forName(charsetName)");
            byte[] bytes = strSubstring.getBytes(charsetForName);
            j.f(bytes, "(this as java.lang.String).getBytes(charset)");
            deflaterOutputStream.write(bytes, 0, bytes.length);
            if (i13 > length) {
                break;
            }
            i = i13;
            return aVar2;
        }
        deflaterOutputStream.close();
        base64OutputStream.close();
        String string = byteArrayOutputStream.toString();
        j.c(string, "byteArrayOutputStream.toString()");
        byteArrayOutputStream.close();
        aVar2 = new Wf.b(string);
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList e() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Qd.a aVar = (Qd.a) this.c;
        Context context = (Context) this.f6708b;
        Class cls = (Class) aVar.f5354b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C2.b((String) it.next(), 1));
        }
        return arrayList2;
    }

    public int f(int i) {
        if (i == 0) {
            return k(0);
        }
        Z3.a aVar = (Z3.a) this.f6708b;
        int[] iArr = (int[]) this.c;
        if (i == 1) {
            int iA = 0;
            for (int i4 : iArr) {
                iA = aVar.a(iA, i4);
            }
            return iA;
        }
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i6 = 1; i6 < length; i6++) {
            iA2 = aVar.a(aVar.c(i, iA2), iArr[i6]);
        }
        return iA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory g(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.e.g(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        return new d1.e((Context) ((d3.c) this.f6708b).f16259b, (d1.d) ((com.paymaya.domain.store.M) this.c).get());
    }

    public JSONObject h(Context context) {
        SharedPreferences sharedPreferencesR;
        String str = (String) this.c;
        j.g(context, "context");
        try {
            String strM = m();
            if (strM == null) {
                return null;
            }
            Map<String, ?> all = b0.f(context, strM).getAll();
            j.f(all, "getAll(...)");
            if (all.isEmpty()) {
                S.s(str, "Old ARP Key = ARP:".concat(str));
                sharedPreferencesR = r(context, strM, "ARP:".concat(str));
            } else {
                sharedPreferencesR = b0.f(context, strM);
            }
            Map<String, ?> all2 = sharedPreferencesR.getAll();
            Iterator<Map.Entry<String, ?>> it = all2.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                j.d(value);
                if ((value instanceof Number) && ((Number) value).intValue() == -1) {
                    it.remove();
                }
            }
            JSONObject jSONObject = new JSONObject(all2);
            S.s(str, "Fetched ARP for namespace key: " + strM + " values: " + all2);
            return jSONObject;
        } catch (Exception e) {
            S.t(str, "Failed to construct ARP object", e);
            return null;
        }
    }

    public C0627d i(X2.f fVar) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = fVar.f6486g;
        long j = fVar.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                X2.f fVarC = ((X2.d) this.f6708b).c();
                String string3 = null;
                if (fVarC == null) {
                    string = null;
                } else {
                    try {
                        string = fVarC.f6484b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    X2.f fVarC2 = ((X2.d) this.c).c();
                    if (fVarC2 != null) {
                        try {
                            string3 = fVarC2.f6484b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i4 = AbstractC0628e.f6992a;
                C0625b c0625b = new C0625b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                c0625b.f6986a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                c0625b.f6987b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                c0625b.c = strOptString;
                c0625b.f6988d = string;
                c0625b.e = j;
                c0625b.f = (byte) (c0625b.f | 1);
                hashSet.add(c0625b.a());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new C0627d(hashSet);
    }

    public Y3.a j(int i) {
        Y3.a aVar;
        Y3.a aVar2;
        int iO = o(i);
        Y3.a[] aVarArr = (Y3.a[]) this.c;
        Y3.a aVar3 = aVarArr[iO];
        if (aVar3 != null) {
            return aVar3;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            int iO2 = o(i) - i4;
            if (iO2 >= 0 && (aVar2 = aVarArr[iO2]) != null) {
                return aVar2;
            }
            int iO3 = o(i) + i4;
            if (iO3 < aVarArr.length && (aVar = aVarArr[iO3]) != null) {
                return aVar;
            }
        }
        return null;
    }

    public int k(int i) {
        return ((int[]) this.c)[(r0.length - 1) - i];
    }

    public int l() {
        return ((int[]) this.c).length - 1;
    }

    public String m() {
        String str = (String) this.c;
        StringBuilder sb2 = new StringBuilder("New ARP Key = ARP:");
        sb2.append(str);
        sb2.append(':');
        H h = (H) this.f6708b;
        sb2.append(h.f());
        S.s(str, sb2.toString());
        return "ARP:" + str + ':' + h.f();
    }

    public void n(Context context, JSONObject jSONObject) {
        String strM;
        j.g(context, "context");
        if (jSONObject.length() == 0 || (strM = m()) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = b0.f(context, strM).edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext = itKeys.hasNext();
            String str = (String) this.c;
            if (!zHasNext) {
                S.s(str, "Stored ARP for namespace key: " + strM + " values: " + jSONObject);
                b0.i(editorEdit);
                return;
            }
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof Number) {
                    editorEdit.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof String) {
                    if (((String) obj).length() < 100) {
                        editorEdit.putString(next, (String) obj);
                    } else {
                        S.s(str, "ARP update for key " + next + " rejected (string value too long)");
                        Unit unit = Unit.f18162a;
                    }
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    S.s(str, "ARP update for key " + next + " rejected (invalid data type)");
                    Unit unit2 = Unit.f18162a;
                }
            } catch (Exception unused) {
            }
        }
    }

    public int o(int i) {
        return i - ((Y3.c) this.f6708b).h;
    }

    @Override // W6.d
    public void onClose() {
        switch (this.f6707a) {
            case 7:
                ((eb.k) this.f6708b).invoke(((MayaErrorDialogFragment) this.c).o1().getText().toString());
                break;
            default:
                ((S7.e) this.f6708b).invoke(((MayaErrorDialogFragment) this.c).o1().getText().toString());
                break;
        }
    }

    @Override // W6.e
    public void onDismiss() {
        C1220i c1220iL1 = ((MayaErrorDialogFragment) this.f6708b).l1();
        C1219h c1219hD = C1219h.d(EnumC1215d.FACE_AUTH_FAIL);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.GOT_IT);
        c1220iL1.c((MayaLoginActivity) this.c, c1219hD);
    }

    @Override // We.InterfaceC0604h
    public void onError(Exception exc) {
        C1353d c1353d = (C1353d) this.f6708b;
        c1353d.i.setImageDrawable((Drawable) this.c);
        c1353d.i.setBackgroundResource(R.drawable.maya_bg_shop_placeholder);
    }

    @Override // We.InterfaceC0604h
    public void onSuccess() {
        ((C1353d) this.f6708b).i.setBackgroundResource(R.drawable.maya_bg_circle_icon);
    }

    public boolean p() {
        return ((int[]) this.c)[0] == 0;
    }

    public void q(String str) {
        TxNetWorkHelper.AnonymousClass1 anonymousClass1 = (TxNetWorkHelper.AnonymousClass1) this.c;
        if (AbstractC2217b.a(3, v0.f18022d) >= 0) {
            v0.f(str, anonymousClass1);
        }
    }

    public SharedPreferences r(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesF = b0.f(context, str2);
        SharedPreferences sharedPreferencesF2 = b0.f(context, str);
        SharedPreferences.Editor editorEdit = sharedPreferencesF2.edit();
        Map<String, ?> all = sharedPreferencesF.getAll();
        j.d(all);
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str3 = (String) this.c;
            if (!zHasNext) {
                S.s(str3, "Completed ARP update for namespace key: ".concat(str));
                b0.i(editorEdit);
                SharedPreferences.Editor editorEdit2 = sharedPreferencesF.edit();
                editorEdit2.clear();
                editorEdit2.apply();
                return sharedPreferencesF2;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            Object value = next.getValue();
            j.d(value);
            if (value instanceof Number) {
                editorEdit.putInt(key, ((Number) value).intValue());
            } else if (value instanceof String) {
                String str4 = (String) value;
                if (str4.length() < 100) {
                    editorEdit.putString(key, str4);
                } else {
                    S.s(str3, "ARP update for key " + key + " rejected (string value too long)");
                    Unit unit = Unit.f18162a;
                }
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else {
                S.s(str3, "ARP update for key " + key + " rejected (invalid data type)");
                Unit unit2 = Unit.f18162a;
            }
        }
    }

    public e s(int i) {
        Z3.a aVar = (Z3.a) this.f6708b;
        if (i == 0) {
            return aVar.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = aVar.c(iArr[i4], i);
        }
        return new e(aVar, iArr2);
    }

    public e t(e eVar) {
        Z3.a aVar = (Z3.a) eVar.f6708b;
        Z3.a aVar2 = (Z3.a) this.f6708b;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (p() || eVar.p()) {
            return aVar2.c;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = (int[]) eVar.c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i4 = iArr[i];
            for (int i6 = 0; i6 < length2; i6++) {
                int i10 = i + i6;
                iArr3[i10] = aVar2.a(iArr3[i10], aVar2.c(i4, iArr2[i6]));
            }
        }
        return new e(aVar2, iArr3);
    }

    public String toString() {
        switch (this.f6707a) {
            case 2:
                Formatter formatter = new Formatter();
                try {
                    int i = 0;
                    for (Y3.a aVar : (Y3.a[]) this.c) {
                        if (aVar == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i));
                            i++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(aVar.f), Integer.valueOf(aVar.e));
                            i++;
                        }
                    }
                    String string = formatter.toString();
                    formatter.close();
                    return string;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            formatter.close();
                            break;
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            case 3:
                StringBuilder sb2 = new StringBuilder(l() * 8);
                for (int iL = l(); iL >= 0; iL--) {
                    int iK = k(iL);
                    if (iK != 0) {
                        if (iK < 0) {
                            sb2.append(" - ");
                            iK = -iK;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (iL == 0 || iK != 1) {
                            sb2.append(iK);
                        }
                        if (iL != 0) {
                            if (iL == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(iL);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            f2.b bVar = "clx".equals(bundle2.getString("_o")) ? (U8.c) this.f6708b : (com.paymaya.domain.store.T) this.c;
            if (bVar == null) {
                return;
            }
            bVar.b(bundle2, string);
        }
    }

    public h v(KycAdditionalDocsUploadRequest kycAdditionalDocsUploadRequest) {
        return ((KycInHouseApi) this.f6708b).postAdditionalDocs(kycAdditionalDocsUploadRequest).h(Th.e.c);
    }

    public Hh.f w(int i, KycUploadRequest kycUploadRequest) {
        boolean zIsSupportSecondaryIdFlowEnabled = ((com.paymaya.data.preference.a) this.c).e().isSupportSecondaryIdFlowEnabled();
        KycInHouseApi kycInHouseApi = (KycInHouseApi) this.f6708b;
        return zIsSupportSecondaryIdFlowEnabled ? kycInHouseApi.postSimpleCaptureUploadWithOrder(i, kycUploadRequest).f(Th.e.c) : kycInHouseApi.postSimpleCaptureUpload(kycUploadRequest).f(Th.e.c);
    }

    public h x(String str) {
        MediaType mediaType = Je.d.f2515a;
        return ((UpdateProfileApi) this.c).saveUserProfile(RequestBody.Companion.create(Je.d.f2515a, str)).h(Th.e.c);
    }

    public void y(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f6708b).send(messageObtain);
    }

    public e z(e eVar) {
        if (!((Z3.a) this.f6708b).equals((Z3.a) eVar.f6708b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (eVar.p()) {
            return this;
        }
        int[] iArr = (int[]) eVar.c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            Z3.a aVar = (Z3.a) eVar.f6708b;
            if (i >= length) {
                return c(new e(aVar, iArr2));
            }
            int i4 = iArr[i];
            aVar.getClass();
            iArr2[i] = (929 - i4) % 929;
            i++;
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f6707a = i;
        this.f6708b = obj;
        this.c = obj2;
    }

    public e(Context context, int i) {
        this.f6707a = i;
        switch (i) {
            case 26:
                this.c = null;
                this.f6708b = context;
                break;
            default:
                this.c = context;
                this.f6708b = C1034e.b(new C0376l(this, 14));
                break;
        }
    }

    public e(Context context, ArrayList arrayList, Wf.d credoAppService, ArrayList arrayList2) {
        int i;
        this.f6707a = 14;
        j.h(credoAppService, "credoAppService");
        i iVar = new i();
        int i4 = 9;
        LinkedHashMap linkedHashMapI = M.i(new Pair(C0952A.class.getName(), C1019w.c), new Pair(n0.class.getName(), new C1020x(iVar, 6)), new Pair(r0.class.getName(), new C1020x(iVar, 7)), new Pair(C1012p.class.getName(), C1019w.e), new Pair(C1015s.class.getName(), new C1020x(iVar, 8)), new Pair(C0972K.class.getName(), C1019w.f), new Pair(C0957C0.class.getName(), new C1020x(iVar, 9)), new Pair(x0.class.getName(), C1019w.f9132g), new Pair(t0.class.getName(), C1019w.h), new Pair(C0966H.class.getName(), C1019w.f9131b), new Pair(o0.class.getName(), new C1020x(iVar, 0)), new Pair(C1013q.class.getName(), new C1020x(iVar, 1)), new Pair(C1013q.class.getName(), new C1020x(iVar, 2)), new Pair(bg.v0.class.getName(), new C1020x(iVar, 3)), new Pair(C1003i.class.getName(), new C1020x(iVar, 4)), new Pair(Wf.c.class.getName(), new C1020x(iVar, 5)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMapI);
        linkedHashMap2.putAll(linkedHashMap);
        LinkedHashMap linkedHashMapO = M.o(linkedHashMap2);
        iVar.f5470b = linkedHashMapO;
        u0 u0Var = new u0();
        C0376l c0376l = new C0376l(u0Var, 16);
        String name = u0.class.getName();
        linkedHashMapO.put(name.equals(Object.class.getName()) ? u0Var instanceof Xf.b ? Xf.b.class.getName() : u0.class.getName() : name, c0376l);
        this.f6708b = iVar;
        C1034e.b(new p0(this, 1));
        C1007k c1007k = new C1007k(context, 17);
        String name2 = Context.class.getName();
        linkedHashMapO.put(name2.equals(Object.class.getName()) ? context instanceof Xf.b ? Xf.b.class.getName() : Context.class.getName() : name2, c1007k);
        q0 q0Var = new q0(credoAppService, 0);
        String name3 = Wf.d.class.getName();
        linkedHashMapO.put(name3.equals(Object.class.getName()) ? credoAppService instanceof Xf.b ? Xf.b.class.getName() : Wf.d.class.getName() : name3, q0Var);
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                arrayList.add(new Zf.a(1));
                i iVar2 = (i) this.f6708b;
                C0376l c0376l2 = new C0376l(arrayList, 20);
                String name4 = Xf.c[].class.getName();
                ((LinkedHashMap) iVar2.f5470b).put(name4.equals(Object.class.getName()) ? c0376l2.invoke() instanceof Xf.b ? Xf.b.class.getName() : Xf.c[].class.getName() : name4, c0376l2);
                i iVar3 = (i) this.f6708b;
                C1007k c1007k2 = new C1007k(context, 18);
                String name5 = Context.class.getName();
                ((LinkedHashMap) iVar3.f5470b).put(name5.equals(Object.class.getName()) ? context instanceof Xf.b ? Xf.b.class.getName() : Context.class.getName() : name5, c1007k2);
                i iVar4 = (i) this.f6708b;
                q0 q0Var2 = new q0(credoAppService, 1);
                String name6 = Wf.d.class.getName();
                ((LinkedHashMap) iVar4.f5470b).put(name6.equals(Object.class.getName()) ? credoAppService instanceof Xf.b ? Xf.b.class.getName() : Wf.d.class.getName() : name6, q0Var2);
                Object obj = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(Xf.c[].class.getName());
                if (obj == null) {
                    j.l();
                }
                Object objInvoke = ((Function0) obj).invoke();
                if (objInvoke != null) {
                    C1013q c1013q = new C1013q((Xf.c[]) objInvoke, new p0(this, 2));
                    i iVar5 = (i) this.f6708b;
                    C0376l c0376l3 = new C0376l(c1013q, 21);
                    String name7 = C1013q.class.getName();
                    ((LinkedHashMap) iVar5.f5470b).put(name7.equals(Object.class.getName()) ? c1013q instanceof Xf.b ? Xf.b.class.getName() : C1013q.class.getName() : name7, c0376l3);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                    }
                    Iterator it3 = arrayList3.iterator();
                    if (!it3.hasNext()) {
                        Function0 function0 = (Function0) ((LinkedHashMap) ((i) this.f6708b).f5470b).get(Xf.b.class.getName());
                        Object objInvoke2 = function0 != null ? function0.invoke() : null;
                        Xf.b bVar = (Xf.b) (objInvoke2 instanceof Xf.b ? objInvoke2 : null);
                        if (bVar != null) {
                            this.c = new C0965G0(bVar, new p0(this, 0));
                            return;
                        }
                        return;
                    }
                    if (it3.next() != null) {
                        throw new ClassCastException();
                    }
                    Object obj2 = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(Context.class.getName());
                    if (obj2 == null) {
                        j.l();
                    }
                    Object objInvoke3 = ((Function0) obj2).invoke();
                    if (objInvoke3 != null) {
                        Pair pair = new Pair("v1.context", (Context) objInvoke3);
                        Object obj3 = ((LinkedHashMap) ((i) this.f6708b).f5470b).get(bg.v0.class.getName());
                        if (obj3 == null) {
                            j.l();
                        }
                        Object objInvoke4 = ((Function0) obj3).invoke();
                        if (objInvoke4 != null) {
                            M.h(pair, new Pair("v1.ex_service", (bg.v0) objInvoke4));
                            throw null;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type credoapp.internal.v1.contract.IDataExtractor");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<credoapp.internal.v1.contract.IModule>");
            }
            if (it.next() == null) {
                try {
                    i iVar6 = (i) this.f6708b;
                    i = i4;
                    try {
                        C1019w c1019w = new C1019w(0, i);
                        String name8 = Object.class.getName();
                        if (!name8.equals(Object.class.getName())) {
                            ((LinkedHashMap) iVar6.f5470b).put(name8, c1019w);
                        } else {
                            throw null;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                } catch (Exception unused2) {
                    i = i4;
                }
                i4 = i;
            } else {
                throw new ClassCastException();
            }
        }
    }

    public e(C1504c c1504c) {
        this.f6707a = 12;
        this.f6708b = c1504c;
    }

    public e(String str, S s9, H h) {
        this.f6707a = 15;
        this.c = str;
        this.f6708b = h;
    }

    public e(KycProfileRegulatoryApi mKycProfileRegulatoryApi, KycRegulatoryProfileCmsApi kycRegulatoryProfileCmsApi) {
        this.f6707a = 20;
        j.g(mKycProfileRegulatoryApi, "mKycProfileRegulatoryApi");
        j.g(kycRegulatoryProfileCmsApi, "kycRegulatoryProfileCmsApi");
        this.f6708b = mKycProfileRegulatoryApi;
        this.c = kycRegulatoryProfileCmsApi;
    }

    public e(UserProfileUpdateApi updateProfileAPI, UpdateProfileApi profileApi) {
        this.f6707a = 25;
        j.g(updateProfileAPI, "updateProfileAPI");
        j.g(profileApi, "profileApi");
        this.f6708b = updateProfileAPI;
        this.c = profileApi;
    }

    public e(KycInHouseApi mKycInHouseApi, com.paymaya.data.preference.a mPreference) {
        this.f6707a = 19;
        j.g(mKycInHouseApi, "mKycInHouseApi");
        j.g(mPreference, "mPreference");
        this.f6708b = mKycInHouseApi;
        this.c = mPreference;
    }

    public e(C1689a c1689a, String accountId) {
        this.f6707a = 0;
        j.g(accountId, "accountId");
        this.f6708b = c1689a;
        this.c = "inApp:".concat(accountId);
    }

    public e(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f6707a = 10;
        this.c = cleverTapInstanceConfig;
        this.f6708b = new b0.e(InterfaceC0191y.f959b);
        cleverTapInstanceConfig.e("ON_USER_LOGIN", "LegacyIdentityRepo Setting the default IdentitySet[" + ((b0.e) this.f6708b) + "]");
    }

    public e(Z3.a aVar, int[] iArr) {
        this.f6707a = 3;
        if (iArr.length != 0) {
            this.f6708b = aVar;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.c = new int[]{0};
                    return;
                }
                int i4 = length - i;
                int[] iArr2 = new int[i4];
                this.c = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i4);
                return;
            }
            this.c = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public e(Y3.c cVar) {
        this.f6707a = 2;
        Y3.c cVar2 = new Y3.c();
        K3.b bVar = cVar.f6740a;
        C3.l lVar = cVar.f6741b;
        C3.l lVar2 = cVar.c;
        C3.l lVar3 = cVar.f6742d;
        C3.l lVar4 = cVar.e;
        cVar2.f6740a = bVar;
        cVar2.f6741b = lVar;
        cVar2.c = lVar2;
        cVar2.f6742d = lVar3;
        cVar2.e = lVar4;
        cVar2.a();
        this.f6708b = cVar2;
        this.c = new Y3.a[(cVar.i - cVar.h) + 1];
    }
}
