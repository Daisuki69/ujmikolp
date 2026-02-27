package com.paymaya.domain.store;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.appsflyer.AppsFlyerLib;
import com.dynatrace.android.agent.Dynatrace;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1240d;
import com.paymaya.data.database.repository.C1241e;
import com.paymaya.domain.model.Address;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.User;
import d2.C1328c;
import dOYHB6.yFtIp6.svM7M6;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import kotlin.UninitializedPropertyAccessException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ph.C2070f1;

/* JADX INFO: renamed from: com.paymaya.domain.store.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1293x0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.preference.a f11496b;
    public PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.database.repository.H f11497d;
    public C1240d e;
    public com.paymaya.data.database.repository.t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.paymaya.data.database.repository.s f11498g;
    public C1241e h;
    public S0 i;
    public F0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1220i f11499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public S5.c f11500l;

    public static void a(A7.f fVar) {
        String str = Build.BRAND;
        if (str != null) {
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    ((LinkedHashMap) fVar.f210b).put("xx-brand-name", str);
                    return;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
    }

    public static void b(A7.f fVar) {
        String str = Build.MODEL;
        if (str != null) {
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    ((LinkedHashMap) fVar.f210b).put("xx-device-model", str);
                    return;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
    }

    public static String c() {
        try {
            String str = E4.d.c;
            if (str != null) {
                return str;
            }
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        } catch (UninitializedPropertyAccessException e) {
            C1328c.a().b(e);
            return "";
        }
    }

    public static String d() {
        try {
            String str = E4.d.f1258b;
            if (str != null) {
                return str;
            }
            throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
        } catch (UninitializedPropertyAccessException e) {
            C1328c.a().b(e);
            return "";
        }
    }

    public final Map e(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        String strA;
        com.paymaya.data.preference.a aVar = this.f11496b;
        String strI = aVar.i();
        String strG = aVar.g();
        String strH = aVar.h();
        String strB = com.paymaya.common.utility.i0.b();
        String userAgent = aVar.B();
        String str2 = com.paymaya.common.utility.i0.f11215b;
        String strB2 = Je.b.b();
        kotlin.jvm.internal.j.g(userAgent, "userAgent");
        A7.f fVar = new A7.f(19);
        try {
            strA = F5.b.a(strI, We.s.p(new StringBuilder("android"), (String) fVar.c, userAgent), strG);
        } catch (Exception unused) {
            yk.a.d();
            strA = null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f210b;
        if (strA != null) {
            linkedHashMap.put("x-request-token", strA);
        }
        linkedHashMap.put("source", "android");
        if (strB != null) {
            linkedHashMap.put("session_id", strB);
        }
        if (strH != null) {
            linkedHashMap.put(CmcdConfiguration.KEY_CONTENT_ID, strH);
        }
        linkedHashMap.put("client_app_version", Ke.d.c());
        linkedHashMap.put("client_os_name", "android");
        if (str != null) {
            linkedHashMap.put("appsflyer_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("shid", str2);
        }
        if (strB2 != null) {
            linkedHashMap.put("dcid", strB2);
        }
        a(fVar);
        b(fVar);
        String strO = aVar.o();
        if (strO.isEmpty()) {
            S1.r.c(fVar, strI, strG, strH);
        } else {
            S1.r.b(fVar, strI, strG, strO);
        }
        if (this.f11500l.a(A5.b.f147y)) {
            SharedPreferences sharedPreferences = S1.r.f5623a;
            String string = sharedPreferences != null ? svM7M6.getString(sharedPreferences, "DDID", null) : null;
            if (string != null) {
                linkedHashMap.put("dcrn", string);
            }
        }
        linkedHashMap.put("xx-device-session-id", d());
        linkedHashMap.put("xx-app-install-id", c());
        return cj.M.m(linkedHashMap);
    }

    public final Identity f() {
        try {
            return this.f.b(new z2.d(7));
        } catch (Exception unused) {
            yk.a.b();
            return null;
        }
    }

    public final Lh.d g() {
        Ah.p<Profile> profile = this.c.getProfile();
        C1287u0 c1287u0 = new C1287u0(this, 0);
        profile.getClass();
        return new Lh.d(profile, c1287u0, 2);
    }

    public final Lh.i h(Profile profile, boolean z4, String str, String str2) {
        m(profile, z4, str, str2);
        boolean zIsCustomerRestrictionsEnabled = this.f11496b.e().isCustomerRestrictionsEnabled();
        F0 f02 = this.j;
        Ah.p pVarA = (zIsCustomerRestrictionsEnabled || profile.mAccountStatus().equals("LIMITED")) ? f02.a() : Ah.p.c(Collections.EMPTY_LIST);
        Lh.d dVar = new Lh.d(new Lh.d(pVarA, new C1287u0(this, 5), 2), new C1287u0(this, 6), 0);
        List list = Collections.EMPTY_LIST;
        Objects.requireNonNull(list, "item is null");
        return new Lh.i(dVar, null, list);
    }

    public final Map i(String sessionId, String glimpseClientId, String str, String appsflyerId, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeyException {
        kotlin.jvm.internal.j.g(sessionId, "sessionId");
        kotlin.jvm.internal.j.g(glimpseClientId, "glimpseClientId");
        kotlin.jvm.internal.j.g(appsflyerId, "appsflyerId");
        A7.f fVar = new A7.f(19);
        LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f210b;
        linkedHashMap.put("session_id", sessionId);
        linkedHashMap.put(CmcdConfiguration.KEY_CONTENT_ID, glimpseClientId);
        linkedHashMap.put("client_app_version", str);
        linkedHashMap.put("client_os_name", "android");
        linkedHashMap.put("appsflyer_id", appsflyerId);
        if (str2 != null) {
            linkedHashMap.put("shid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("dcid", str3);
        }
        linkedHashMap.put("source", "android");
        a(fVar);
        b(fVar);
        com.paymaya.data.preference.a aVar = this.f11496b;
        String strI = aVar.i();
        String strG = aVar.g();
        String strO = aVar.o();
        if (strO.isEmpty()) {
            S1.r.c(fVar, strI, strG, glimpseClientId);
        } else {
            S1.r.b(fVar, strI, strG, strO);
        }
        if (this.f11500l.a(A5.b.f51B)) {
            SharedPreferences sharedPreferences = S1.r.f5623a;
            String string = sharedPreferences != null ? svM7M6.getString(sharedPreferences, "DDID", null) : null;
            if (string != null) {
                linkedHashMap.put("dcrn", string);
            }
        }
        linkedHashMap.put("xx-device-session-id", d());
        linkedHashMap.put("xx-app-install-id", c());
        return cj.M.m(linkedHashMap);
    }

    public final User j() {
        try {
            com.paymaya.data.database.repository.H h = this.f11497d;
            z2.d dVar = new z2.d(8);
            if (h.a(dVar).isEmpty()) {
                return null;
            }
            return (User) h.a(dVar).get(0);
        } catch (Exception unused) {
            yk.a.b();
            return null;
        }
    }

    public final Lh.h k(boolean z4, String str, String str2, String str3, String str4) throws NoSuchAlgorithmException, InvalidKeyException {
        boolean zIsRestrictedLoginEnabled = this.f11496b.e().isRestrictedLoginEnabled();
        PayMayaClientApi payMayaClientApi = this.c;
        MediaType mediaType = y5.f.f21063a;
        if (zIsRestrictedLoginEnabled) {
            byte[] bArrC = I5.a.c(str2);
            Ah.p<Profile> pVarLoginV5 = payMayaClientApi.loginV5(RequestBody.create(mediaType, bArrC), e(str3));
            C1289v0 c1289v0 = new C1289v0(this, z4, str, str4, 2);
            pVarLoginV5.getClass();
            return new Lh.f(pVarLoginV5, c1289v0, 0).h(Th.e.c);
        }
        byte[] bArrC2 = I5.a.c(str2);
        Ah.p<Profile> pVarLoginV52 = payMayaClientApi.loginV5(RequestBody.create(mediaType, bArrC2), e(str3));
        C1289v0 c1289v02 = new C1289v0(this, z4, str, str4, 3);
        pVarLoginV52.getClass();
        return new Lh.d(pVarLoginV52, c1289v02, 2).h(Th.e.c);
    }

    public final Lh.h l(String str, String str2, String str3, boolean z4, String str4, String str5) throws NoSuchAlgorithmException, InvalidKeyException {
        boolean zIsRestrictedLoginEnabled = this.f11496b.e().isRestrictedLoginEnabled();
        PayMayaClientApi payMayaClientApi = this.c;
        MediaType mediaType = y5.f.f21063a;
        if (zIsRestrictedLoginEnabled) {
            byte[] bArrB = I5.a.b(str, str2, str3);
            Ah.p<Profile> pVarLoginV5 = payMayaClientApi.loginV5(RequestBody.create(mediaType, bArrB), e(str4));
            C1289v0 c1289v0 = new C1289v0(this, z4, str, str5, 1);
            pVarLoginV5.getClass();
            return new Lh.f(pVarLoginV5, c1289v0, 0).h(Th.e.c);
        }
        byte[] bArrB2 = I5.a.b(str, str2, str3);
        Ah.p<Profile> pVarLoginV52 = payMayaClientApi.loginV5(RequestBody.create(mediaType, bArrB2), e(str4));
        C1289v0 c1289v02 = new C1289v0(this, z4, str, str5, 0);
        pVarLoginV52.getClass();
        return new Lh.d(pVarLoginV52, c1289v02, 2).h(Th.e.c);
    }

    public final void m(Profile profile, boolean z4, String str, String str2) {
        if (z4 && !this.f11496b.r().equals(str)) {
            this.i.a();
        }
        o(profile);
        FirebaseMessaging.c().e().addOnCompleteListener(new C1291w0(this));
        C1220i c1220i = this.f11499k;
        FirebaseAnalytics.getInstance(c1220i.c).f9742a.zzo(profile.mWalletId());
        if (this.f11500l.a(A5.b.f66K)) {
            String strMWalletId = profile.mWalletId();
            if (qk.i.c) {
                if (strMWalletId == null || strMWalletId.length() == 0) {
                    yk.a.g("Maya-Dynatrace").getClass();
                    C2070f1.b();
                }
                Dynatrace.identifyUser(strMWalletId);
                yk.a.g("Maya-Dynatrace").getClass();
                C2070f1.b();
            } else {
                yk.a.g("Maya-Dynatrace").getClass();
                C2070f1.b();
            }
        }
        p(profile.mWalletId(), str2);
        String strMWalletId2 = profile.mWalletId();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        ((HashMap) Cg.c.k().f769d).put("lifestyle_id", strMWalletId2);
    }

    public final void n(Throwable th2) {
        this.f11496b.p0("");
        yk.a.b();
        com.paymaya.common.utility.C.i(C1293x0.class.getSimpleName(), "onRestrictionError" + th2.toString());
    }

    public final void o(Profile profile) {
        com.paymaya.data.preference.a aVar = this.f11496b;
        aVar.c0();
        SharedPreferences sharedPreferences = aVar.f11330b;
        int i = 1;
        sharedPreferences.edit().putBoolean("key_is_logged_in", true).apply();
        aVar.r0(false);
        aVar.f11330b.edit().putString("key_kyc_status", profile.mKyc()).apply();
        sharedPreferences.edit().putString("key_kyc_level", profile.mKycLevel()).apply();
        aVar.n0(profile.mReKycStatus());
        aVar.f11330b.edit().putString("key_rekyc_reason", profile.mReKycReason()).apply();
        sharedPreferences.edit().putString("key_account_type", profile.mAccountType().mId()).apply();
        sharedPreferences.edit().putString("key_status", profile.mStatus()).apply();
        sharedPreferences.edit().putBoolean("key_can_link_card", profile.canLinkCard()).apply();
        aVar.o0("");
        Iterator<Identity> it = profile.mIdentities().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Identity next = it.next();
            if ("msisdn".equals(next.mType())) {
                aVar.h0(next.mValue());
                break;
            }
        }
        sharedPreferences.edit().putString("key_account_status", profile.mAccountStatus()).apply();
        sharedPreferences.edit().putBoolean("key_has_government_id", profile.mHasGovernmentId()).apply();
        aVar.l0(profile.mProfileId());
        if (profile.mWalletId() != null) {
            aVar.w0(profile.mWalletId());
        }
        if (profile.mBackupIdentity() != null) {
            BackUpIdentity backUpIdentityBuild = BackUpIdentity.sBuilder().mType(profile.mBackupIdentity().mType()).mValue(profile.mBackupIdentity().mValue()).mIsVerified(profile.mBackupIdentity().mIsVerified()).build();
            C1241e c1241e = this.h;
            c1241e.f11307a.b("backup_identity", "", null);
            List<BackUpIdentity> listSingletonList = Collections.singletonList(backUpIdentityBuild);
            ArrayList arrayList = new ArrayList(listSingletonList.size());
            for (BackUpIdentity backUpIdentity : listSingletonList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(SessionDescription.ATTR_TYPE, backUpIdentity.mType());
                contentValues.put("value", backUpIdentity.mValue());
                contentValues.put("is_verified", backUpIdentity.mIsVerified());
                arrayList.add(contentValues);
            }
            c1241e.f11307a.c("backup_identity", Collections.unmodifiableList(arrayList));
        }
        if (profile.mPrivacyPolicy() != null) {
            aVar.f11330b.edit().putString("key_privacy_policy_status", profile.mPrivacyPolicy().mStatus()).apply();
            if (profile.mPrivacyPolicy().mVersion() != null) {
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_privacy_policy_version", profile.mPrivacyPolicy().mVersion());
            }
        }
        if (!com.paymaya.common.utility.C.e(profile.mToken())) {
            aVar.j0(profile.mToken());
        }
        if (profile.mDeviceToken() != null) {
            androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_device_token", profile.mDeviceToken());
        }
        aVar.f11330b.edit().putString("key_edd_status", profile.mEddStatus()).apply();
        User userMUser = profile.mUser();
        com.paymaya.data.database.repository.H h = this.f11497d;
        h.getClass();
        List<User> listSingletonList2 = Collections.singletonList(userMUser);
        ArrayList arrayList2 = new ArrayList(listSingletonList2.size());
        for (User user : listSingletonList2) {
            ContentValues contentValues2 = new ContentValues(5);
            contentValues2.put("user_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            contentValues2.put("first_name", user.mFirstName());
            contentValues2.put("middle_name", user.mMiddleName());
            contentValues2.put("last_name", user.mLastName());
            contentValues2.put("birth_date", user.mBirthDate());
            arrayList2.add(contentValues2);
        }
        h.f11300a.c("user", Collections.unmodifiableList(arrayList2));
        if (!com.paymaya.common.utility.C.e(profile.mUser().mAddress())) {
            Address addressMAddress = profile.mUser().mAddress();
            C1240d c1240d = this.e;
            c1240d.getClass();
            List<Address> listSingletonList3 = Collections.singletonList(addressMAddress);
            ArrayList arrayList3 = new ArrayList(listSingletonList3.size());
            for (Address address : listSingletonList3) {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("address_id", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                contentValues3.put("line1", address.mLine1());
                contentValues3.put("line2", address.mLine2());
                contentValues3.put("locality", address.mLocality());
                contentValues3.put("city", address.mCity());
                contentValues3.put("state", address.mState());
                contentValues3.put("zip_code", address.mZipCode());
                contentValues3.put("country_code", address.mCountryCode());
                arrayList3.add(contentValues3);
            }
            c1240d.f11306a.c("address", Collections.unmodifiableList(arrayList3));
        }
        List<Identity> listMIdentities = profile.mIdentities();
        com.paymaya.data.database.repository.t tVar = this.f;
        tVar.getClass();
        ArrayList arrayList4 = new ArrayList(listMIdentities.size());
        for (Identity identity : listMIdentities) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(SessionDescription.ATTR_TYPE, identity.mType());
            contentValues4.put("value", identity.mValue());
            contentValues4.put("verified", Integer.valueOf(identity.mVerified().booleanValue() ? 1 : 0));
            arrayList4.add(contentValues4);
        }
        tVar.f11322a.c("identity", Collections.unmodifiableList(arrayList4));
        com.paymaya.data.database.repository.s sVar = this.f11498g;
        sVar.f11321a.b("fund_source", "", null);
        ArrayList<FundSource> arrayList5 = new ArrayList(profile.mFundSources());
        Collections.sort(arrayList5, com.paymaya.data.database.repository.s.f11320b);
        ListIterator listIterator = arrayList5.listIterator();
        while (listIterator.hasNext()) {
            FundSource fundSource = (FundSource) listIterator.next();
            if (fundSource.isTypeBlocked()) {
                listIterator.remove();
            } else if (fundSource.isTypePhysical()) {
                arrayList5.set(listIterator.previousIndex(), fundSource.toBuilder().mName(We.s.f(i, "PayMaya Card ")).build());
                i++;
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        for (FundSource fundSource2 : arrayList5) {
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put("value", fundSource2.mId());
            contentValues5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, fundSource2.mName());
            contentValues5.put(SessionDescription.ATTR_TYPE, fundSource2.mType());
            contentValues5.put("status", fundSource2.mStatus());
            contentValues5.put("transaction_enabled", Integer.valueOf(fundSource2.mTransactionEnabled().booleanValue() ? 1 : 0));
            contentValues5.put("scheme", fundSource2.mCardProfile().mScheme());
            contentValues5.put("brand", fundSource2.mCardProfile().mBrand());
            arrayList6.add(contentValues5);
        }
        sVar.f11321a.c("fund_source", Collections.unmodifiableList(arrayList6));
    }

    public final void p(String str, String str2) {
        EnumC1215d enumC1215d = EnumC1215d.APPSFLYER;
        C1220i c1220i = this.f11499k;
        if (str == null || str.isEmpty()) {
            C1219h c1219h = new C1219h();
            c1219h.p(enumC1215d);
            c1219h.t(EnumC1217f.CUSTOMER_ID);
            c1219h.n(12);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("source", str2);
            c1220i.b(c1219h);
            return;
        }
        AppsFlyerLib.getInstance().setCustomerUserId(str);
        C1219h c1219h2 = new C1219h();
        c1219h2.p(enumC1215d);
        c1219h2.t(EnumC1217f.CUSTOMER_ID);
        c1219h2.n(14);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h2.j.put("source", str2);
        c1220i.b(c1219h2);
    }
}
