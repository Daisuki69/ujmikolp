package com.paymaya.data.preference;

import Pf.b;
import W4.e;
import Xh.i;
import a.AbstractC0617a;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.media3.datasource.cache.c;
import com.google.gson.j;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Config;
import dOYHB6.yFtIp6.svM7M6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f11330b;

    public static synchronized a j(Context context) {
        try {
            if (c == null) {
                a aVar = new a();
                aVar.f11330b = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
                c = aVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c;
    }

    public final Map A() {
        String string = svM7M6.getString(this.f11330b, "key_shop_providers_list_by_category_head_dates_map", null);
        if (string == null) {
            return new HashMap();
        }
        return (Map) new j().f(string, new Preference$1().getType());
    }

    public final String B() {
        return svM7M6.getString(this.f11330b, "key_user_agent", "");
    }

    public final String C() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_wallet_id", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_wallet_id", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final boolean D() {
        return this.f11330b.getBoolean("key_is_confirm_credential", false);
    }

    public final boolean E() {
        return this.f11330b.getBoolean("has_data_extracted", false);
    }

    public final boolean F() {
        return this.f11330b.getBoolean("key_is_disclosure_agreed", false);
    }

    public final boolean G() {
        return this.f11330b.getBoolean("key_is_logged_in", false);
    }

    public final boolean H() {
        return this.f11330b.getBoolean("key_migrated_gcm_encryption", false);
    }

    public final boolean I() {
        if (l().equals("kyc0") || l().equals("submitted")) {
            return e().isShortenedFlowUpgradeEnabled();
        }
        if (l().equals("kyc1") || x().equals("submitted")) {
            return e().isShortenedFlowReKycEnabled();
        }
        return false;
    }

    public final boolean J() {
        return this.f11330b.getBoolean("key_sig", true);
    }

    public final boolean K() {
        return this.f11330b.getBoolean("key_to_determine_entrypoint", false);
    }

    public final boolean L() {
        return this.f11330b.getBoolean("key_is_xp_blacklisted", true);
    }

    public final void M() {
        this.f11330b.edit().remove("savings_auto_provision_opt_in").apply();
    }

    public final void N() {
        this.f11330b.edit().remove("savings_auto_provision_opt_in_sent").apply();
    }

    public final void O(String str) {
        Map mapM = i.m(C.y(str));
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_apigee_token", str2).apply();
        sharedPreferences.edit().putString("key_apigee_access_token", (String) mapM.get("data")).apply();
    }

    public final void P(String str) {
        Map mapM = Collections.EMPTY_MAP;
        try {
            mapM = i.m(str);
        } catch (Exception unused) {
        }
        boolean zIsEmpty = mapM.isEmpty();
        SharedPreferences sharedPreferences = this.f11330b;
        if (zIsEmpty) {
            sharedPreferences.edit().putString("key_iv_app_installation_id", "").apply();
            sharedPreferences.edit().putString("key_app_installation_id", "").apply();
        } else {
            this.f11330b.edit().putString("key_iv_app_installation_id", (String) mapM.get("iv")).apply();
            sharedPreferences.edit().putString("key_app_installation_id", (String) mapM.get("data")).apply();
        }
    }

    public final void Q(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_is_app_under_maintenance", z4);
    }

    public final void R(String str) {
        Map mapM = i.m(str);
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_client_key", str2).apply();
        sharedPreferences.edit().putString("key_client_key", (String) mapM.get("data")).apply();
    }

    public final void S(Config config) {
        if (this.f11329a == null) {
            this.f11329a = Config.getInstance(config);
        }
        this.f11329a.setConfig(config);
        this.f11330b.edit().putString("key_config", A.f10366a.k(config)).apply();
    }

    public final void T(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_is_confirm_credential", z4);
    }

    public final void U(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_data_privacy_shown", z4);
    }

    public final void V(String str) {
        Map mapM = i.m(str);
        c.u(this.f11330b, "key_iv_database_password", (String) mapM.get("iv"));
        this.f11330b.edit().putString("key_database_password", (String) mapM.get("data")).apply();
    }

    public final void W(String str) {
        Map mapM = i.m(str);
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_encryption", str2).apply();
        sharedPreferences.edit().putString("key_encryption", (String) mapM.get("data")).apply();
    }

    public final void X(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_has_suspended_session", z4);
    }

    public final void Y(String str) {
        Map mapM = i.m(str);
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_hash", str2).apply();
        sharedPreferences.edit().putString("key_hash", (String) mapM.get("data")).apply();
    }

    public final void Z(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_is_interstitial_flow_guard_enabled", z4);
    }

    public final synchronized void a() {
        boolean z4 = this.f11330b.getBoolean("key_request_contact_permission", true);
        boolean z5 = this.f11330b.getBoolean("key_request_contact_permission_edit", true);
        boolean z8 = this.f11330b.getBoolean("key_has_displayed_more_services_guide", false);
        boolean z9 = this.f11330b.getBoolean("key_has_displayed_shop_purchase_history_guide", false);
        boolean z10 = this.f11330b.getBoolean("key_is_rate_app_done", false);
        boolean z11 = this.f11330b.getBoolean("key_is_interstitial_shown", false);
        boolean z12 = this.f11330b.getBoolean("key_tls_support", true);
        boolean z13 = this.f11330b.getBoolean("key_is_db_migrated_premarshmallow", false);
        boolean z14 = this.f11330b.getBoolean("key_is_keystore_initialize", false);
        boolean zF = F();
        boolean z15 = this.f11330b.getBoolean("key_has_displayed_bills_receipt_share_guide", false);
        boolean z16 = this.f11330b.getBoolean("key_has_displayed_bills_receipt_favorite_guide", false);
        boolean z17 = this.f11330b.getBoolean("key_is_location_permission_shown", false);
        boolean zJ = J();
        boolean zK = K();
        int i = this.f11330b.getInt("key_version_code", 0);
        String strR = r();
        String strB = b();
        String string = svM7M6.getString(this.f11330b, "key_iv_last_cached_session_token", "");
        String strO = o();
        String string2 = svM7M6.getString(this.f11330b, "key_encrypted_key", "");
        String string3 = svM7M6.getString(this.f11330b, "key_database_password", null);
        String string4 = svM7M6.getString(this.f11330b, "key_iv_database_password", "");
        String string5 = svM7M6.getString(this.f11330b, "key_device_token", "");
        String string6 = svM7M6.getString(this.f11330b, "key_firebase_token", "");
        String strH = h();
        String strB2 = B();
        String string7 = svM7M6.getString(this.f11330b, "key_rsa_encryption", "");
        String string8 = svM7M6.getString(this.f11330b, "key_android16_key", "");
        String strZ = z();
        String strD = d();
        String strG = g();
        String strI = i();
        String strT = t();
        String strP = p();
        String strQ = q();
        String strC = c();
        boolean zE = E();
        boolean zH = H();
        int i4 = this.f11330b.getInt("key_resource_database_version", 0);
        boolean z18 = this.f11330b.getBoolean("key_t2p_show_tooltip", true);
        this.f11330b.edit().clear().apply();
        this.f11330b.edit().putBoolean("key_is_keystore_initialize", z14).apply();
        this.f11330b.edit().putInt("key_version_code", i).apply();
        h0(strR);
        this.f11330b.edit().putString("key_encrypted_key", string2).apply();
        O(strB);
        this.f11330b.edit().putString("key_iv_last_cached_session_token", string).apply();
        d0(strO);
        this.f11330b.edit().putBoolean("key_request_contact_permission", z4).apply();
        this.f11330b.edit().putBoolean("key_request_contact_permission_edit", z5).apply();
        this.f11330b.edit().putBoolean("key_has_displayed_more_services_guide", z8).apply();
        this.f11330b.edit().putBoolean("key_has_displayed_shop_purchase_history_guide", z9).apply();
        this.f11330b.edit().putBoolean("key_has_displayed_bills_receipt_share_guide", z15).apply();
        this.f11330b.edit().putBoolean("key_has_displayed_bills_receipt_favorite_guide", z16).apply();
        this.f11330b.edit().putBoolean("key_is_rate_app_done", z10).apply();
        this.f11330b.edit().putString("key_device_token", string5).apply();
        this.f11330b.edit().putBoolean("key_is_interstitial_shown", z11).apply();
        this.f11330b.edit().putBoolean("key_is_disclosure_agreed", zF).apply();
        this.f11330b.edit().putBoolean("key_is_location_permission_shown", z17).apply();
        this.f11330b.edit().putString("key_database_password", string3).apply();
        this.f11330b.edit().putString("key_iv_database_password", string4).apply();
        this.f11330b.edit().putString("key_firebase_token", string6).apply();
        this.f11330b.edit().putBoolean("key_tls_support", z12).apply();
        this.f11330b.edit().putBoolean("key_is_db_migrated_premarshmallow", z13).apply();
        SharedPreferences.Editor editorEdit = this.f11330b.edit();
        ((b) Cg.c.k().f768b).getClass();
        editorEdit.putString(b.f, strH).apply();
        this.f11330b.edit().putInt("key_resource_database_version", i4).apply();
        this.f11330b.edit().putString("key_user_agent", strB2).apply();
        this.f11330b.edit().putString("key_rsa_encryption", string7).apply();
        this.f11330b.edit().putString("key_android16_key", string8).apply();
        q0(strZ);
        R(strD);
        W(strG);
        Y(strI);
        this.f11330b.edit().putBoolean("key_sig", zJ).apply();
        t0(zK);
        f0(strP);
        g0(strQ);
        P(strC);
        this.f11330b.edit().putBoolean("has_data_extracted", zE).apply();
        k0(strT);
        this.f11330b.edit().putBoolean("key_migrated_gcm_encryption", zH).apply();
        this.f11330b.edit().putBoolean("key_t2p_show_tooltip", z18).apply();
    }

    public final void a0(String str) {
        Map mapM = i.m(C.y(str));
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_kyc_pre_submission_id", str2).apply();
        sharedPreferences.edit().putString("key_kyc_pre_submission_id", (String) mapM.get("data")).apply();
    }

    public final String b() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_apigee_access_token", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_apigee_token", "");
        return H() ? C.x0(i.j(string, string2)) : C.x0(AbstractC0617a.r(string, string2));
    }

    public final void b0(String str) {
        Map mapM = i.m(C.y(str));
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_kyc_trace_id", str2).apply();
        sharedPreferences.edit().putString("key_kyc_trace_id", (String) mapM.get("data")).apply();
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_app_installation_id", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_app_installation_id", "");
        try {
            return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
        } catch (Exception unused) {
            return "";
        }
    }

    public final void c0() {
        this.f11330b.edit().putLong("key_last_activity_timestamp", System.currentTimeMillis()).apply();
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_client_key", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_client_key", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final void d0(String str) {
        Map mapM = i.m(C.y(str));
        c.u(this.f11330b, "key_iv_last_cached_session_token", (String) mapM.get("iv"));
        this.f11330b.edit().putString("key_last_cached_session_token", (String) mapM.get("data")).apply();
    }

    public final Config e() {
        return (Config) y().getConfig();
    }

    public final void e0(String str) {
        c.u(this.f11330b, "key_maya_kyc_onboarding_entry_point", str);
    }

    public final String f() {
        SharedPreferences sharedPreferences = this.f11330b;
        if (C.e(svM7M6.getString(sharedPreferences, "key_database_password", ""))) {
            V(UUID.randomUUID().toString());
        }
        String string = svM7M6.getString(sharedPreferences, "key_database_password", "");
        String string2 = svM7M6.getString(this.f11330b, "key_iv_database_password", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final void f0(String str) {
        c.u(this.f11330b, "key_maya_onboarding_partner", str);
    }

    public final String g() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_encryption", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_encryption", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final void g0(String str) {
        c.u(this.f11330b, "key_maya_onboarding_partner_branch", str);
    }

    public final String h() {
        ((b) Cg.c.k().f768b).getClass();
        return svM7M6.getString(this.f11330b, b.f, "");
    }

    public final void h0(String str) {
        c.u(this.f11330b, "key_mobile_number", str);
    }

    public final String i() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_hash", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_hash", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final void i0(String str) {
        Map mapM = i.m(str);
        boolean zIsEmpty = mapM.isEmpty();
        SharedPreferences sharedPreferences = this.f11330b;
        if (zIsEmpty) {
            sharedPreferences.edit().putString("key_iv_password", "").apply();
            sharedPreferences.edit().putString("key_password", "").apply();
        } else {
            this.f11330b.edit().putString("key_iv_password", (String) mapM.get("iv")).apply();
            sharedPreferences.edit().putString("key_password", (String) mapM.get("data")).apply();
        }
    }

    public final void j0(String str) {
        Map mapM = i.m(C.y(str));
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_paymaya_token", str2).apply();
        sharedPreferences.edit().putString("key_paymaya_access_token", (String) mapM.get("data")).apply();
        d0(str);
    }

    public final String k() {
        return svM7M6.getString(this.f11330b, "key_kyc_level", "");
    }

    public final void k0(String str) {
        Map mapM = i.m(str);
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_pin", str2).apply();
        sharedPreferences.edit().putString("key_pin", (String) mapM.get("data")).apply();
    }

    public final String l() {
        return svM7M6.getString(this.f11330b, "key_kyc_status", "");
    }

    public final void l0(String str) {
        Map mapM = i.m(str);
        boolean zIsEmpty = mapM.isEmpty();
        SharedPreferences sharedPreferences = this.f11330b;
        if (zIsEmpty) {
            sharedPreferences.edit().putString("key_iv_profile_id", "").apply();
            sharedPreferences.edit().putString("key_profile_id", "").apply();
        } else {
            this.f11330b.edit().putString("key_iv_profile_id", (String) mapM.get("iv")).apply();
            sharedPreferences.edit().putString("key_profile_id", (String) mapM.get("data")).apply();
        }
    }

    public final String m() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_kyc_pre_submission_id", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_kyc_pre_submission_id", "");
        return H() ? C.x0(i.j(string, string2)) : C.x0(AbstractC0617a.r(string, string2));
    }

    public final void m0(String str) {
        Map mapM = i.m(C.y(str));
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_profile_trace_id", str2).apply();
        sharedPreferences.edit().putString("key_profile_trace_id", (String) mapM.get("data")).apply();
    }

    public final String n() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_kyc_trace_id", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_kyc_trace_id", "");
        return H() ? C.x0(i.j(string, string2)) : C.x0(AbstractC0617a.r(string, string2));
    }

    public final void n0(String str) {
        c.u(this.f11330b, "key_rekyc_status", str);
    }

    public final String o() {
        return C.x0(i.j(svM7M6.getString(this.f11330b, "key_last_cached_session_token", ""), svM7M6.getString(this.f11330b, "key_iv_last_cached_session_token", "")));
    }

    public final void o0(String str) {
        c.u(this.f11330b, "key_registration_id", str);
    }

    public final String p() {
        return svM7M6.getString(this.f11330b, "key_maya_onboarding_partner", "");
    }

    public final void p0(String str) {
        c.u(this.f11330b, "key_restrictions", str);
    }

    public final String q() {
        return svM7M6.getString(this.f11330b, "key_maya_onboarding_partner_branch", "");
    }

    public final void q0(String str) {
        Map mapM = i.m(str);
        String str2 = (String) mapM.get("iv");
        SharedPreferences sharedPreferences = this.f11330b;
        sharedPreferences.edit().putString("key_iv_secret_key", str2).apply();
        sharedPreferences.edit().putString("key_secret_key", (String) mapM.get("data")).apply();
    }

    public final String r() {
        return svM7M6.getString(this.f11330b, "key_mobile_number", "");
    }

    public final void r0(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_is_session_expired", z4);
    }

    public final String s() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_paymaya_access_token", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_paymaya_token", "");
        return H() ? C.x0(i.j(string, string2)) : C.x0(AbstractC0617a.r(string, string2));
    }

    public final void s0(String str, String str2) {
        Map mapA = A();
        mapA.put(str, str2);
        c.u(this.f11330b, "key_shop_providers_list_by_category_head_dates_map", new j().l(mapA, new Preference$2().getType()));
    }

    public final String t() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_pin", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_pin", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final void t0(boolean z4) {
        androidx.camera.core.impl.a.A(this.f11330b, "key_to_determine_entrypoint", z4);
    }

    public final String u() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_profile_id", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_profile_id", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }

    public final void u0(int i) {
        this.f11330b.edit().putInt("unread_support_channel_count", i).apply();
    }

    public final String v() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_profile_trace_id", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_profile_trace_id", "");
        return H() ? C.x0(i.j(string, string2)) : C.x0(AbstractC0617a.r(string, string2));
    }

    public final void v0(String str) {
        Map mapM = i.m(str);
        boolean zIsEmpty = mapM.isEmpty();
        SharedPreferences sharedPreferences = this.f11330b;
        if (zIsEmpty) {
            sharedPreferences.edit().putString("key_iv_username", "").apply();
            sharedPreferences.edit().putString("key_username", "").apply();
        } else {
            this.f11330b.edit().putString("key_iv_username", (String) mapM.get("iv")).apply();
            sharedPreferences.edit().putString("key_username", (String) mapM.get("data")).apply();
        }
    }

    public final String w() {
        return svM7M6.getString(this.f11330b, "key_rekyc_reason", "");
    }

    public final void w0(String str) {
        Map mapM = i.m(str);
        boolean zIsEmpty = mapM.isEmpty();
        SharedPreferences sharedPreferences = this.f11330b;
        if (zIsEmpty) {
            sharedPreferences.edit().putString("key_iv_wallet_id", "").apply();
            sharedPreferences.edit().putString("key_wallet_id", "").apply();
        } else {
            this.f11330b.edit().putString("key_iv_wallet_id", (String) mapM.get("iv")).apply();
            sharedPreferences.edit().putString("key_wallet_id", (String) mapM.get("data")).apply();
        }
    }

    public final String x() {
        return svM7M6.getString(this.f11330b, "key_rekyc_status", "none");
    }

    public final e y() {
        if (this.f11329a == null) {
            j jVar = A.f10366a;
            this.f11329a = Config.getInstance((Config) jVar.e(svM7M6.getString(this.f11330b, "key_config", jVar.k(Config.sBuilder().build())), Config.class));
        }
        return this.f11329a;
    }

    public final String z() {
        SharedPreferences sharedPreferences = this.f11330b;
        String string = svM7M6.getString(sharedPreferences, "key_secret_key", "");
        String string2 = svM7M6.getString(sharedPreferences, "key_iv_secret_key", "");
        return H() ? i.j(string, string2) : AbstractC0617a.r(string, string2);
    }
}
