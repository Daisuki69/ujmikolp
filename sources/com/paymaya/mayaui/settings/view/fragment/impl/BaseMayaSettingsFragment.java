package com.paymaya.mayaui.settings.view.fragment.impl;

import E1.b;
import E1.e;
import E1.f;
import F1.k;
import F1.q;
import G6.v;
import J5.c;
import Kh.T;
import L9.C0323a;
import Lh.h;
import M8.C0332a;
import N5.P;
import Rb.j;
import Sb.a;
import Sb.d;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.install.InstallException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.J0;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import dOYHB6.yFtIp6.svM7M6;
import kotlin.Pair;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public class BaseMayaSettingsFragment extends MayaBaseFragment implements j {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public P f13882U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public NestedScrollView f13883V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public View f13884W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Group f13885X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public View f13886Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public View f13887Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Group f13888a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View f13889b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public View f13890c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SwitchCompat f13891d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View f13892e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View f13893f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f13894g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public View f13895h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public View f13896i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View f13897j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f13898k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public View f13899l0;
    public View m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public View f13900n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public View f13901o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public HtmlTextView f13902p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Group f13903q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f13904r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f13905s0;
    public Group t0;
    public C0323a u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public d f13906v0;
    public KeyguardManager w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a f13907x0 = new a(this);

    public static final void K1(BaseMayaSettingsFragment baseMayaSettingsFragment) {
        C0323a c0323aH1 = baseMayaSettingsFragment.H1();
        SwitchCompat switchCompat = baseMayaSettingsFragment.f13891d0;
        if (switchCompat == null) {
            kotlin.jvm.internal.j.n("mSwitchScreenLockLogin");
            throw null;
        }
        EnumC1217f enumC1217f = !switchCompat.isChecked() ? EnumC1217f.SCREENLOCK_ON : EnumC1217f.SCREENLOCK_OFF;
        s sVar = (j) c0323aH1.c.get();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(enumC1217f);
        c1219h.i();
        ((MayaBaseFragment) sVar).z1(c1219h);
        baseMayaSettingsFragment.H1().q();
    }

    public final b G1() {
        Context baseContext;
        c cVar;
        FragmentActivity activity = getActivity();
        if (activity == null || (baseContext = activity.getBaseContext()) == null) {
            return null;
        }
        synchronized (E1.c.class) {
            try {
                if (E1.c.f1224a == null) {
                    Context applicationContext = baseContext.getApplicationContext();
                    if (applicationContext != null) {
                        baseContext = applicationContext;
                    }
                    E1.c.f1224a = new c(new e(baseContext));
                }
                cVar = E1.c.f1224a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (b) ((F1.c) cVar.f2418b).zza();
    }

    public final C0323a H1() {
        C0323a c0323a = this.u0;
        if (c0323a != null) {
            return c0323a;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final void I1(int i) {
        b bVarG1;
        int i4 = 6;
        if (i == 5) {
            N1(R.string.pma_label_update_failed, new Pair(getString(R.string.pma_label_retry), new Sb.b(this, 7)));
            return;
        }
        if (i == 6) {
            N1(R.string.pma_label_update_cancelled, new Pair(getString(R.string.pma_label_retry), new Sb.b(this, i4)));
            return;
        }
        if (i == 11 && (bVarG1 = G1()) != null) {
            com.google.android.play.core.appupdate.a aVar = (com.google.android.play.core.appupdate.a) bVarG1;
            String packageName = aVar.c.getPackageName();
            E1.j jVar = aVar.f9724a;
            q qVar = jVar.f1234a;
            if (qVar != null) {
                E1.j.e.c("completeUpdate(%s)", packageName);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                qVar.a().post(new f(qVar, taskCompletionSource, taskCompletionSource, new f(jVar, taskCompletionSource, taskCompletionSource, packageName, 1), 2));
                taskCompletionSource.getTask();
                return;
            }
            Object[] objArr = {-9};
            k kVar = E1.j.e;
            kVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", k.e(kVar.f1526b, "onError(%d)", objArr));
            }
            Tasks.forException(new InstallException(-9));
        }
    }

    public final void J1(EnumC1217f enumC1217f) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.n(17);
        c1219hD.t(enumC1217f);
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    public final void L1() {
        d dVar = this.f13906v0;
        if (dVar != null) {
            Bb.a aVarX1 = ((MayaSettingsActivity) dVar).X1();
            if (kotlin.jvm.internal.j.b(aVarX1.e.l(), "kyc1")) {
                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) ((Mb.c) aVarX1.c.get());
                mayaSettingsActivity.getClass();
                AbstractC1236z.h(mayaSettingsActivity, R.id.frame_layout_container, new MayaChangeMinFragment());
            } else {
                MayaSettingsActivity mayaSettingsActivity2 = (MayaSettingsActivity) ((Mb.c) aVarX1.c.get());
                String string = mayaSettingsActivity2.getString(R.string.maya_label_upgrade_dialog_change_min_title);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                z2.d.n(2131231670, string, mayaSettingsActivity2.getString(R.string.maya_label_upgrade_dialog_change_min_description), new Pair(mayaSettingsActivity2.getString(R.string.maya_label_upgrade_now), new Nb.a(mayaSettingsActivity2, 1)), new Pair(mayaSettingsActivity2.getString(R.string.maya_label_maybe_later), null), null, 96).show(mayaSettingsActivity2.getSupportFragmentManager(), "alert_dialog");
            }
        }
    }

    public final void M1() {
        d dVar = this.f13906v0;
        if (dVar != null) {
            String string = getString(R.string.maya_label_settings_updated_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String string2 = getString(R.string.maya_label_settings_updated_description);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) dVar;
            z2.d.n(2131231645, string, string2, new Pair(mayaSettingsActivity.getString(R.string.maya_label_got_it), null), null, null, 112).show(mayaSettingsActivity.getSupportFragmentManager(), "alert_dialog");
        }
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.FINGERPRINT_ENABLED);
        c1219hH.i();
        A1(c1219hH);
    }

    public final void N1(int i, Pair pair) {
        NestedScrollView nestedScrollView = this.f13883V;
        if (nestedScrollView == null) {
            kotlin.jvm.internal.j.n("mScrollViewContainer");
            throw null;
        }
        Snackbar snackbarMake = Snackbar.make(nestedScrollView, i, -1);
        snackbarMake.setAction((CharSequence) pair.f18160a, (View.OnClickListener) pair.f18161b);
        ((TextView) snackbarMake.getView().findViewById(R.id.snackbar_text)).setTextColor(-1);
        snackbarMake.show();
    }

    public final void O1() {
        b bVarG1 = G1();
        Task taskA = bVarG1 != null ? ((com.google.android.play.core.appupdate.a) bVarG1).a() : null;
        if (taskA != null) {
            taskA.addOnSuccessListener(new Na.d(new Sb.c(this, 0), 14));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i != 400 || i4 != -1) {
            if (i == 400 && i4 == 0) {
                H1().v();
                return;
            }
            return;
        }
        String stringExtra = intent != null ? intent.getStringExtra("input") : null;
        C0323a c0323aH1 = H1();
        ((MayaBaseFragment) ((j) c0323aH1.c.get())).E1();
        String strMValue = ((C1293x0) c0323aH1.e).f().mValue();
        String string = svM7M6.getString(((com.paymaya.data.preference.a) c0323aH1.i).f11330b, "key_device_token", "");
        C1293x0 c1293x0 = (C1293x0) c0323aH1.e;
        BaseMayaSettingsFragment baseMayaSettingsFragment = (BaseMayaSettingsFragment) ((j) c0323aH1.c.get());
        baseMayaSettingsFragment.getClass();
        new T(5, new Lh.d(new Lh.d(new h(c1293x0.l(strMValue, stringExtra, string, false, AppsFlyerLib.getInstance().getAppsFlyerUID(baseMayaSettingsFragment.requireContext()), "SETTINGS"), zh.b.a(), 0), new Cg.c(11, c0323aH1, strMValue, stringExtra), 2), new v(c0323aH1, 19), 0), new Lb.f(c0323aH1, 0)).e();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13906v0 = (d) getActivity();
        FragmentActivity activity = getActivity();
        Object systemService = activity != null ? activity.getSystemService("keyguard") : null;
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.w0 = (KeyguardManager) systemService;
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        K deviceStore = (K) aVar.f4671K.get();
        C1293x0 c1293x0J = aVar.J();
        S0 s0S = aVar.S();
        C1284t c1284tJ = aVar.j();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        J0 j02 = new J0();
        j02.f11362b = payMayaClientApi;
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(deviceStore, "deviceStore");
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.u0 = new C0323a(deviceStore, c1293x0J, s0S, c1284tJ, j02, preference, sessionSubject);
        H1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_settings, viewGroup, false);
        int i = R.id.card_view_settings;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_settings)) != null) {
            i = R.id.constraint_layout_settings_container;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_settings_container)) != null) {
                i = R.id.group_appdome_threat_events;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_appdome_threat_events);
                if (group != null) {
                    i = R.id.group_change_min_option;
                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_change_min_option);
                    if (group2 != null) {
                        i = R.id.group_clear_extracted_flag;
                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_clear_extracted_flag);
                        if (group3 != null) {
                            i = R.id.group_clear_install_id;
                            Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_clear_install_id);
                            if (group4 != null) {
                                i = R.id.group_display_name_option;
                                Group group5 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_display_name_option);
                                if (group5 != null) {
                                    i = R.id.group_extract;
                                    Group group6 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_extract);
                                    if (group6 != null) {
                                        i = R.id.group_flag_configuration_option;
                                        Group group7 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_flag_configuration_option);
                                        if (group7 != null) {
                                            i = R.id.group_get_location;
                                            Group group8 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_get_location);
                                            if (group8 != null) {
                                                i = R.id.group_manage_notifications_option;
                                                Group group9 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_manage_notifications_option);
                                                if (group9 != null) {
                                                    i = R.id.group_toggles_option;
                                                    Group group10 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_toggles_option);
                                                    if (group10 != null) {
                                                        i = R.id.group_update_available;
                                                        Group group11 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_update_available);
                                                        if (group11 != null) {
                                                            i = R.id.html_text_view_update_available_description;
                                                            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_update_available_description);
                                                            if (htmlTextView != null) {
                                                                i = R.id.image_view_account_recovery_option_arrow;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_account_recovery_option_arrow)) != null) {
                                                                    i = R.id.image_view_appdome_threat_events_arrow;
                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_appdome_threat_events_arrow)) != null) {
                                                                        i = R.id.image_view_change_min_option_arrow;
                                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_change_min_option_arrow)) != null) {
                                                                            i = R.id.image_view_change_password_option_arrow;
                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_change_password_option_arrow)) != null) {
                                                                                i = R.id.image_view_clear_extracted_flag_arrow;
                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_clear_extracted_flag_arrow)) != null) {
                                                                                    i = R.id.image_view_clear_install_id_arrow;
                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_clear_install_id_arrow)) != null) {
                                                                                        i = R.id.image_view_close_account_option_arrow;
                                                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_close_account_option_arrow)) != null) {
                                                                                            i = R.id.image_view_data_personalization_option_arrow;
                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_data_personalization_option_arrow)) != null) {
                                                                                                i = R.id.image_view_display_name_option_arrow;
                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_display_name_option_arrow)) != null) {
                                                                                                    i = R.id.image_view_extract_arrow;
                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_extract_arrow)) != null) {
                                                                                                        i = R.id.image_view_flag_configuration_option_arrow;
                                                                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_flag_configuration_option_arrow)) != null) {
                                                                                                            i = R.id.image_view_get_location_arrow;
                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_get_location_arrow)) != null) {
                                                                                                                i = R.id.image_view_licenses_option_arrow;
                                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_licenses_option_arrow)) != null) {
                                                                                                                    i = R.id.image_view_manage_notifications_option_arrow;
                                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_manage_notifications_option_arrow)) != null) {
                                                                                                                        i = R.id.image_view_maya_logo;
                                                                                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maya_logo)) != null) {
                                                                                                                            i = R.id.image_view_privacy_policy_option_arrow;
                                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_privacy_policy_option_arrow)) != null) {
                                                                                                                                i = R.id.image_view_terms_conditions_option_arrow;
                                                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_terms_conditions_option_arrow)) != null) {
                                                                                                                                    i = R.id.image_view_toggles_option_arrow;
                                                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_toggles_option_arrow)) != null) {
                                                                                                                                        i = R.id.image_view_update_available_icon;
                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_update_available_icon)) != null) {
                                                                                                                                            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                                                                                            i = R.id.space_update_available_bottom;
                                                                                                                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_update_available_bottom)) != null) {
                                                                                                                                                i = R.id.space_update_available_top;
                                                                                                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_update_available_top)) != null) {
                                                                                                                                                    i = R.id.switch_screen_lock_login_toggle;
                                                                                                                                                    SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.switch_screen_lock_login_toggle);
                                                                                                                                                    if (switchCompat != null) {
                                                                                                                                                        i = R.id.text_view_about_maya_title;
                                                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_about_maya_title)) != null) {
                                                                                                                                                            i = R.id.text_view_account_recovery_option;
                                                                                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_recovery_option)) != null) {
                                                                                                                                                                i = R.id.text_view_account_title;
                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_title)) != null) {
                                                                                                                                                                    i = R.id.text_view_app_version;
                                                                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_app_version);
                                                                                                                                                                    if (textView != null) {
                                                                                                                                                                        i = R.id.text_view_appdome_threat_events;
                                                                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_appdome_threat_events)) != null) {
                                                                                                                                                                            i = R.id.text_view_change_min_option;
                                                                                                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_change_min_option)) != null) {
                                                                                                                                                                                i = R.id.text_view_change_password_option;
                                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_change_password_option)) != null) {
                                                                                                                                                                                    i = R.id.text_view_clear_extracted_flag;
                                                                                                                                                                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_clear_extracted_flag)) != null) {
                                                                                                                                                                                        i = R.id.text_view_clear_install_id;
                                                                                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_clear_install_id)) != null) {
                                                                                                                                                                                            i = R.id.text_view_close_account_option;
                                                                                                                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_close_account_option)) != null) {
                                                                                                                                                                                                i = R.id.text_view_data_personalization_option;
                                                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_data_personalization_option)) != null) {
                                                                                                                                                                                                    i = R.id.text_view_display_name_option;
                                                                                                                                                                                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_display_name_option)) != null) {
                                                                                                                                                                                                        i = R.id.text_view_display_title;
                                                                                                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_display_title)) != null) {
                                                                                                                                                                                                            i = R.id.text_view_extract;
                                                                                                                                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_extract)) != null) {
                                                                                                                                                                                                                i = R.id.text_view_flag_configuration_option;
                                                                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_flag_configuration_option)) != null) {
                                                                                                                                                                                                                    i = R.id.text_view_get_location;
                                                                                                                                                                                                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_get_location)) != null) {
                                                                                                                                                                                                                        i = R.id.text_view_licenses_option;
                                                                                                                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_licenses_option)) != null) {
                                                                                                                                                                                                                            i = R.id.text_view_made_for_ph;
                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_made_for_ph)) != null) {
                                                                                                                                                                                                                                i = R.id.text_view_manage_notifications_option;
                                                                                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_manage_notifications_option)) != null) {
                                                                                                                                                                                                                                    i = R.id.text_view_privacy_policy_option;
                                                                                                                                                                                                                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_privacy_policy_option)) != null) {
                                                                                                                                                                                                                                        i = R.id.text_view_privacy_security_title;
                                                                                                                                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_privacy_security_title)) != null) {
                                                                                                                                                                                                                                            i = R.id.text_view_screen_lock_login_option;
                                                                                                                                                                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_screen_lock_login_option)) != null) {
                                                                                                                                                                                                                                                i = R.id.text_view_terms_conditions_option;
                                                                                                                                                                                                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_terms_conditions_option)) != null) {
                                                                                                                                                                                                                                                    i = R.id.text_view_toggles_option;
                                                                                                                                                                                                                                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_toggles_option)) != null) {
                                                                                                                                                                                                                                                        i = R.id.text_view_update_available_title;
                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_update_available_title)) != null) {
                                                                                                                                                                                                                                                            i = R.id.view_account_recovery_clickable;
                                                                                                                                                                                                                                                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_account_recovery_clickable);
                                                                                                                                                                                                                                                            if (viewFindChildViewById != null) {
                                                                                                                                                                                                                                                                i = R.id.view_appdome_threat_events_clickable;
                                                                                                                                                                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_appdome_threat_events_clickable);
                                                                                                                                                                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                                                                                                                                                                    i = R.id.view_change_min_clickable;
                                                                                                                                                                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_change_min_clickable);
                                                                                                                                                                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                                                                                                                                                                        i = R.id.view_change_password_clickable;
                                                                                                                                                                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_change_password_clickable);
                                                                                                                                                                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                                                                                                                                                                            i = R.id.view_clear_extracted_flag_clickable;
                                                                                                                                                                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_clear_extracted_flag_clickable);
                                                                                                                                                                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                                                                                                                                                                i = R.id.view_clear_install_id_clickable;
                                                                                                                                                                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_clear_install_id_clickable);
                                                                                                                                                                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.view_close_account_clickable;
                                                                                                                                                                                                                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.view_close_account_clickable);
                                                                                                                                                                                                                                                                                    if (viewFindChildViewById7 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.view_data_personalization_clickable;
                                                                                                                                                                                                                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.view_data_personalization_clickable);
                                                                                                                                                                                                                                                                                        if (viewFindChildViewById8 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.view_display_name_clickable;
                                                                                                                                                                                                                                                                                            View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, R.id.view_display_name_clickable);
                                                                                                                                                                                                                                                                                            if (viewFindChildViewById9 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.view_extract_clickable;
                                                                                                                                                                                                                                                                                                View viewFindChildViewById10 = ViewBindings.findChildViewById(viewInflate, R.id.view_extract_clickable);
                                                                                                                                                                                                                                                                                                if (viewFindChildViewById10 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.view_flag_configuration_clickable;
                                                                                                                                                                                                                                                                                                    View viewFindChildViewById11 = ViewBindings.findChildViewById(viewInflate, R.id.view_flag_configuration_clickable);
                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById11 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.view_get_location_clickable;
                                                                                                                                                                                                                                                                                                        View viewFindChildViewById12 = ViewBindings.findChildViewById(viewInflate, R.id.view_get_location_clickable);
                                                                                                                                                                                                                                                                                                        if (viewFindChildViewById12 != null) {
                                                                                                                                                                                                                                                                                                            i = R.id.view_licenses_clickable;
                                                                                                                                                                                                                                                                                                            View viewFindChildViewById13 = ViewBindings.findChildViewById(viewInflate, R.id.view_licenses_clickable);
                                                                                                                                                                                                                                                                                                            if (viewFindChildViewById13 != null) {
                                                                                                                                                                                                                                                                                                                i = R.id.view_manage_notifications_clickable;
                                                                                                                                                                                                                                                                                                                View viewFindChildViewById14 = ViewBindings.findChildViewById(viewInflate, R.id.view_manage_notifications_clickable);
                                                                                                                                                                                                                                                                                                                if (viewFindChildViewById14 != null) {
                                                                                                                                                                                                                                                                                                                    i = R.id.view_privacy_policy_clickable;
                                                                                                                                                                                                                                                                                                                    View viewFindChildViewById15 = ViewBindings.findChildViewById(viewInflate, R.id.view_privacy_policy_clickable);
                                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById15 != null) {
                                                                                                                                                                                                                                                                                                                        i = R.id.view_screen_lock_login_clickable;
                                                                                                                                                                                                                                                                                                                        View viewFindChildViewById16 = ViewBindings.findChildViewById(viewInflate, R.id.view_screen_lock_login_clickable);
                                                                                                                                                                                                                                                                                                                        if (viewFindChildViewById16 != null) {
                                                                                                                                                                                                                                                                                                                            i = R.id.view_terms_conditions_clickable;
                                                                                                                                                                                                                                                                                                                            View viewFindChildViewById17 = ViewBindings.findChildViewById(viewInflate, R.id.view_terms_conditions_clickable);
                                                                                                                                                                                                                                                                                                                            if (viewFindChildViewById17 != null) {
                                                                                                                                                                                                                                                                                                                                i = R.id.view_toggles_clickable;
                                                                                                                                                                                                                                                                                                                                View viewFindChildViewById18 = ViewBindings.findChildViewById(viewInflate, R.id.view_toggles_clickable);
                                                                                                                                                                                                                                                                                                                                if (viewFindChildViewById18 != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.view_update_available_container;
                                                                                                                                                                                                                                                                                                                                    View viewFindChildViewById19 = ViewBindings.findChildViewById(viewInflate, R.id.view_update_available_container);
                                                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById19 != null) {
                                                                                                                                                                                                                                                                                                                                        this.f13882U = new P(nestedScrollView, group, group2, group3, group4, group5, group6, group7, group8, group9, group10, group11, htmlTextView, nestedScrollView, switchCompat, textView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, viewFindChildViewById12, viewFindChildViewById13, viewFindChildViewById14, viewFindChildViewById15, viewFindChildViewById16, viewFindChildViewById17, viewFindChildViewById18, viewFindChildViewById19);
                                                                                                                                                                                                                                                                                                                                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                                                                                                                                                                                                                                                                                                                                        return nestedScrollView;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        H1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13882U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        d dVar = this.f13906v0;
        if (dVar != null) {
            ((MayaSettingsActivity) dVar).Q(this);
        }
        H1().v();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        P p10 = this.f13882U;
        kotlin.jvm.internal.j.d(p10);
        this.f13883V = (NestedScrollView) p10.j;
        P p11 = this.f13882U;
        kotlin.jvm.internal.j.d(p11);
        this.f13884W = p11.f3850s;
        P p12 = this.f13882U;
        kotlin.jvm.internal.j.d(p12);
        this.f13885X = p12.c;
        P p13 = this.f13882U;
        kotlin.jvm.internal.j.d(p13);
        this.f13886Y = p13.h;
        P p14 = this.f13882U;
        kotlin.jvm.internal.j.d(p14);
        this.f13887Z = p14.m;
        P p15 = this.f13882U;
        kotlin.jvm.internal.j.d(p15);
        this.f13888a0 = p15.f3840b;
        P p16 = this.f13882U;
        kotlin.jvm.internal.j.d(p16);
        this.f13889b0 = p16.f3849r;
        P p17 = this.f13882U;
        kotlin.jvm.internal.j.d(p17);
        this.f13890c0 = p17.f3848q;
        P p18 = this.f13882U;
        kotlin.jvm.internal.j.d(p18);
        this.f13891d0 = (SwitchCompat) p18.f3843k;
        P p19 = this.f13882U;
        kotlin.jvm.internal.j.d(p19);
        this.f13892e0 = p19.f3845n;
        P p20 = this.f13882U;
        kotlin.jvm.internal.j.d(p20);
        this.f13893f0 = p20.f3856y;
        P p21 = this.f13882U;
        kotlin.jvm.internal.j.d(p21);
        this.f13894g0 = p21.f3836A;
        P p22 = this.f13882U;
        kotlin.jvm.internal.j.d(p22);
        this.f13895h0 = p22.f3854w;
        P p23 = this.f13882U;
        kotlin.jvm.internal.j.d(p23);
        this.f13896i0 = p23.f3837B;
        P p24 = this.f13882U;
        kotlin.jvm.internal.j.d(p24);
        this.f13897j0 = p24.f3852u;
        kotlin.jvm.internal.j.d(this.f13882U);
        kotlin.jvm.internal.j.d(this.f13882U);
        P p25 = this.f13882U;
        kotlin.jvm.internal.j.d(p25);
        this.f13902p0 = p25.f;
        P p26 = this.f13882U;
        kotlin.jvm.internal.j.d(p26);
        this.f13903q0 = p26.e;
        P p27 = this.f13882U;
        kotlin.jvm.internal.j.d(p27);
        this.f13904r0 = p27.f3842g;
        P p28 = this.f13882U;
        kotlin.jvm.internal.j.d(p28);
        this.f13905s0 = p28.f3855x;
        P p29 = this.f13882U;
        kotlin.jvm.internal.j.d(p29);
        this.t0 = p29.f3841d;
        P p30 = this.f13882U;
        kotlin.jvm.internal.j.d(p30);
        this.f13898k0 = p30.f3851t;
        kotlin.jvm.internal.j.d(this.f13882U);
        P p31 = this.f13882U;
        kotlin.jvm.internal.j.d(p31);
        this.f13899l0 = p31.f3853v;
        kotlin.jvm.internal.j.d(this.f13882U);
        P p32 = this.f13882U;
        kotlin.jvm.internal.j.d(p32);
        this.m0 = p32.f3847p;
        kotlin.jvm.internal.j.d(this.f13882U);
        P p33 = this.f13882U;
        kotlin.jvm.internal.j.d(p33);
        this.f13900n0 = p33.f3844l;
        kotlin.jvm.internal.j.d(this.f13882U);
        P p34 = this.f13882U;
        kotlin.jvm.internal.j.d(p34);
        this.f13901o0 = p34.f3846o;
        kotlin.jvm.internal.j.d(this.f13882U);
        H1().j();
        H1().v();
        b bVarG1 = G1();
        Task taskA = bVarG1 != null ? ((com.google.android.play.core.appupdate.a) bVarG1).a() : null;
        if (taskA != null) {
            taskA.addOnSuccessListener(new Na.d(new Sb.c(this, 2), 17));
        }
        View view2 = this.f13884W;
        if (view2 == null) {
            kotlin.jvm.internal.j.n("mViewDisplayNameClickable");
            throw null;
        }
        view2.setOnClickListener(new Sb.b(this, 10));
        View view3 = this.f13886Y;
        if (view3 == null) {
            kotlin.jvm.internal.j.n("mViewAccountRecoveryClickable");
            throw null;
        }
        view3.setOnClickListener(new Sb.b(this, 11));
        View view4 = this.f13887Z;
        if (view4 == null) {
            kotlin.jvm.internal.j.n("mViewChangeMobileNumberClickable");
            throw null;
        }
        view4.setOnClickListener(new Sb.b(this, 12));
        View view5 = this.f13889b0;
        if (view5 == null) {
            kotlin.jvm.internal.j.n("mViewDataPersonalizationClickable");
            throw null;
        }
        view5.setOnClickListener(new Sb.b(this, 0));
        View view6 = this.f13890c0;
        if (view6 == null) {
            kotlin.jvm.internal.j.n("mViewCloseAccountClickable");
            throw null;
        }
        view6.setOnClickListener(new Sb.b(this, 1));
        SwitchCompat switchCompat = this.f13891d0;
        if (switchCompat == null) {
            kotlin.jvm.internal.j.n("mSwitchScreenLockLogin");
            throw null;
        }
        switchCompat.setOnClickListener(new Sb.b(this, 2));
        View view7 = this.f13892e0;
        if (view7 == null) {
            kotlin.jvm.internal.j.n("mViewChangePasswordClickable");
            throw null;
        }
        view7.setOnClickListener(new Sb.b(this, 3));
        View view8 = this.f13893f0;
        if (view8 == null) {
            kotlin.jvm.internal.j.n("mViewPrivacyPolicyClickable");
            throw null;
        }
        view8.setOnClickListener(new Sb.b(this, 4));
        View view9 = this.f13894g0;
        if (view9 == null) {
            kotlin.jvm.internal.j.n("mViewTermsConditionsClickable");
            throw null;
        }
        view9.setOnClickListener(new Sb.b(this, 8));
        View view10 = this.f13895h0;
        if (view10 == null) {
            kotlin.jvm.internal.j.n("mViewLicensesClickable");
            throw null;
        }
        view10.setOnClickListener(new Sb.b(this, 9));
        HtmlTextView htmlTextView = this.f13902p0;
        if (htmlTextView == null) {
            kotlin.jvm.internal.j.n("mTextViewUpdateAvailable");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new Na.d(this, 16));
        View view11 = this.f13905s0;
        if (view11 != null) {
            C.r0(view11, new C0332a(this, 27));
        } else {
            kotlin.jvm.internal.j.n("mViewManageNotificationsClickable");
            throw null;
        }
    }
}
