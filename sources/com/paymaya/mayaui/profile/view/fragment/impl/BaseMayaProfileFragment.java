package com.paymaya.mayaui.profile.view.fragment.impl;

import B5.i;
import D.C0187u;
import D.P;
import Gh.f;
import Kh.I;
import Lh.h;
import N5.C0440b1;
import N5.G0;
import N5.L0;
import O5.g;
import Th.e;
import a7.EnumC0650k;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.Scopes;
import com.google.firebase.messaging.p;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PushApprovalApi;
import com.paymaya.data.api.ReferralEligibilityClientApi;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycUpdateOtherIdsActivity;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.score.view.activity.impl.MayaScoreActivity;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import l9.C1803a;
import ma.C1859a;
import na.InterfaceC1942a;
import o5.C1963b;
import o6.C1967a;
import oa.ViewOnClickListenerC1973a;
import oi.C1983a;
import pa.a;
import pg.t;
import pg.u;
import qa.c;
import qa.d;
import v.AbstractC2329d;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class BaseMayaProfileFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Group f13495A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C0440b1 f13496B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Button f13497C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public FlutterEngine f13498D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Intent f13499E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public t f13500F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public f f13501G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public MayaCarousel f13502H0;
    public C1220i I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C0187u f13503J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C1859a f13504K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public d f13505L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final ActivityResultLauncher f13506M0;
    public final ActivityResultLauncher N0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public L0 f13507U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Uh.d f13508V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ImageView f13509W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f13510X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13511Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13512Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13513a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ConstraintLayout f13514b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ConstraintLayout f13515c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ConstraintLayout f13516d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ConstraintLayout f13517e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ConstraintLayout f13518f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f13519g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public View f13520h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public View f13521i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View f13522j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public View f13523k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Group f13524l0;
    public View m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public View f13525n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public View f13526o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f13527p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f13528q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Group f13529r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Group f13530s0;
    public View t0;
    public Group u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public View f13531v0;
    public View w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Group f13532x0;
    public Group y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public View f13533z0;

    public BaseMayaProfileFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new c(this, 0));
        j.f(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f13506M0 = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new c(this, 1));
        j.f(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.N0 = activityResultLauncherRegisterForActivityResult2;
    }

    public static final void G1(MayaCarousel mayaCarousel) {
        j.g(mayaCarousel, "<this>");
        int dimensionPixelSize = mayaCarousel.getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        ViewParent parent = mayaCarousel.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int measuredWidth = viewGroup != null ? viewGroup.getMeasuredWidth() : 0;
        int i = measuredWidth - (dimensionPixelSize * 2);
        int i4 = (int) (i / 3.2f);
        if (i > 0 || i4 > 0 || measuredWidth > 0) {
            mayaCarousel.h(i, i4, measuredWidth);
            mayaCarousel.j(i, i4, measuredWidth);
        }
    }

    public static final void N1(BaseMayaProfileFragment baseMayaProfileFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.GET_HELP);
        c1219hH.i();
        baseMayaProfileFragment.A1(c1219hH);
        C1859a c1859aH1 = baseMayaProfileFragment.H1();
        String strC = C.c("https://support.maya.ph/s/", c1859aH1.j.r(), c1859aH1.j.u(), c1859aH1.f18391g.a());
        BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((a) c1859aH1.c.get());
        baseMayaProfileFragment2.getClass();
        d dVar = baseMayaProfileFragment2.f13505L0;
        if (dVar != null) {
            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
            mayaProfileActivity.n1().v(mayaProfileActivity, strC, baseMayaProfileFragment2.getString(R.string.maya_label_help));
            mayaProfileActivity.finish();
        }
    }

    public static final void O1(BaseMayaProfileFragment baseMayaProfileFragment) {
        C1219h c1219hE = C1219h.e("MGM_REFERRER_PAGE_PERFORMED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("screen", "profile_page");
        c1219hE.j.put("activity", "button_tapped");
        c1219hE.j.put("component", "refer_&_earn_button");
        baseMayaProfileFragment.A1(c1219hE);
        C1859a c1859aH1 = baseMayaProfileFragment.H1();
        if ("kyc1".equalsIgnoreCase(c1859aH1.j.l())) {
            BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((a) c1859aH1.c.get());
            d dVar = baseMayaProfileFragment2.f13505L0;
            if (dVar != null) {
                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                ActivityResultLauncher resultLauncher = baseMayaProfileFragment2.f13506M0;
                j.g(resultLauncher, "resultLauncher");
                mayaProfileActivity.n1();
                i.Q(mayaProfileActivity, "inviteFriendScreen", Scopes.PROFILE, resultLauncher);
                return;
            }
            return;
        }
        BaseMayaProfileFragment baseMayaProfileFragment3 = (BaseMayaProfileFragment) ((a) c1859aH1.c.get());
        d dVar2 = baseMayaProfileFragment3.f13505L0;
        if (dVar2 != null) {
            MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
            ActivityResultLauncher resultLauncher2 = baseMayaProfileFragment3.N0;
            j.g(resultLauncher2, "resultLauncher");
            String string = mayaProfileActivity2.getString(R.string.maya_label_upgrade_dialog_title);
            j.f(string, "getString(...)");
            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaProfileActivity2.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaProfileActivity2.getString(R.string.maya_label_upgrade_now), new C1963b(1, mayaProfileActivity2, resultLauncher2)), new Pair(mayaProfileActivity2.getString(R.string.maya_label_maybe_later), null), null, 96);
            mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
            mayaAlertBottomSheetDialogFragmentN.f11820c0 = mayaAlertBottomSheetDialogFragmentN.f11820c0;
            mayaAlertBottomSheetDialogFragmentN.show(mayaProfileActivity2.getSupportFragmentManager(), "alert_dialog");
        }
    }

    public static final void P1(BaseMayaProfileFragment baseMayaProfileFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.LOGOUT);
        c1219hH.i();
        baseMayaProfileFragment.A1(c1219hH);
        C1859a c1859aH1 = baseMayaProfileFragment.H1();
        ((MayaBaseFragment) ((a) c1859aH1.c.get())).E1();
        c1859aH1.e(new Hh.a(new Hh.f(c1859aH1.f.b(), b.a(), 0), new C1803a(c1859aH1, 3), 1).c());
    }

    public static final void Q1(BaseMayaProfileFragment baseMayaProfileFragment) {
        C1219h c1219hE = C1219h.e("MGM_REFEREE_PAGE_PERFORMED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("screen", "profile_page");
        map.put("activity", "button_tapped");
        map.put("component", "submit_invite_code_button");
        baseMayaProfileFragment.A1(c1219hE);
        d dVar = baseMayaProfileFragment.f13505L0;
        if (dVar != null) {
            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
            ActivityResultLauncher resultLauncher = baseMayaProfileFragment.N0;
            j.g(resultLauncher, "resultLauncher");
            mayaProfileActivity.n1();
            i.Q(mayaProfileActivity, "submitInviteCodeScreen", Scopes.PROFILE, resultLauncher);
        }
    }

    public final C1859a H1() {
        C1859a c1859a = this.f13504K0;
        if (c1859a != null) {
            return c1859a;
        }
        j.n("mMayaProfileFragmentPresenter");
        throw null;
    }

    public final void I1() {
        ConstraintLayout constraintLayout = this.f13515c0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            j.n("mViewBannerSectionAccountOutdatedInfo");
            throw null;
        }
    }

    public final void J1() {
        ConstraintLayout constraintLayout = this.f13517e0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            j.n("mViewBannerSectionAccountUnderReview");
            throw null;
        }
    }

    public final void K1() {
        ConstraintLayout constraintLayout = this.f13514b0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            j.n("mViewBannerSectionUpgradeYourAccount");
            throw null;
        }
    }

    public final void L1() {
        MayaCarousel mayaCarousel = this.f13502H0;
        if (mayaCarousel == null) {
            j.n("mayaCarousel");
            throw null;
        }
        mayaCarousel.setVisibility(0);
        C1219h c1219h = new C1219h();
        c1219h.p(EnumC1215d.MENU);
        c1219h.r(EnumC1216e.BANNER);
        c1219h.n(2);
        mayaCarousel.setFilterAdsByScreen(c1219h.c());
        Resources resources = mayaCarousel.getResources();
        j.f(resources, "getResources(...)");
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.maya_clevertap_width);
        Resources resources2 = mayaCarousel.getResources();
        j.f(resources2, "getResources(...)");
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.maya_clevertap_height);
        mayaCarousel.h(dimensionPixelSize, dimensionPixelSize2, 0);
        mayaCarousel.j(dimensionPixelSize, dimensionPixelSize2, 0);
        mayaCarousel.setAdsCornerRadiusDimens(R.dimen.maya_radius_16dp);
        mayaCarousel.setDividerMode(EnumC0650k.f7026b);
        mayaCarousel.setDividerSizeInPx(mayaCarousel.getResources().getDimensionPixelSize(R.dimen.maya_margin_medium) / 2);
        mayaCarousel.setAutomaticScrolling(true);
        mayaCarousel.setEndlessScrolling(true);
        mayaCarousel.setHideCarouselTitle(true);
        mayaCarousel.setIndicatorEnabled(false);
        mayaCarousel.setDefaultImagePlaceholder(2131231031);
        mayaCarousel.setClevertapAdTextStyle(ClevertapAd.TextStyle.FULL_SIZE_BANNER);
        mayaCarousel.setBannerPriorityFixEnabled(S5.c.b(q1(), A5.b.f125o1));
        int i = 3;
        mayaCarousel.setCarouselListener(new C1983a(this, i));
        mayaCarousel.setCarouselStateListener(new o6.f(this, i));
        OneShotPreDrawListener.add(mayaCarousel, new P(8, mayaCarousel, mayaCarousel, this, false));
    }

    public final void M1() {
        FlutterEngine flutterEngine = new FlutterEngine(requireContext());
        this.f13498D0 = flutterEngine;
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runSetUsername"));
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine2 = this.f13498D0;
        if (flutterEngine2 == null) {
            j.n("setUsernameFlutterFullscreenEngine");
            throw null;
        }
        flutterEngineCache.put("setUsernameFullscreen", flutterEngine2);
        Intent intentBuild = FlutterActivity.withCachedEngine("setUsernameFullscreen").build(requireContext());
        j.g(intentBuild, "<set-?>");
        this.f13499E0 = intentBuild;
        FlutterEngine flutterEngine3 = this.f13498D0;
        if (flutterEngine3 != null) {
            new u(flutterEngine3.getDartExecutor().getBinaryMessenger(), "packages/paymaya_set_username").b(new c(this, 2));
        } else {
            j.n("setUsernameFlutterFullscreenEngine");
            throw null;
        }
    }

    public final void R1(String str, Map map) {
        C1220i c1220iO1 = o1();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        Unit unit = Unit.f18162a;
        c1220iO1.c(fragmentActivityRequireActivity, c1219hE);
    }

    public final void S1(String str) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.CHECK_APPLICATION_STATUS);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, str);
        c1219hH.i();
        A1(c1219hH);
    }

    public final void T1(boolean z4) {
        ConstraintLayout constraintLayout = this.f13518f0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(z4 ? 0 : 8);
        } else {
            j.n("mViewBannerSectionCompleteAccount");
            throw null;
        }
    }

    public final void U1() {
        if (S5.c.b(q1(), A5.b.f100d1)) {
            MayaCarousel mayaCarousel = this.f13502H0;
            if (mayaCarousel == null) {
                j.n("mayaCarousel");
                throw null;
            }
            mayaCarousel.setVisibility(0);
            MayaCarousel mayaCarousel2 = this.f13502H0;
            if (mayaCarousel2 != null) {
                mayaCarousel2.k();
            } else {
                j.n("mayaCarousel");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13505L0 = (d) getActivity();
        W4.a aVarE = W4.a.e();
        if (aVarE.e == null) {
            O5.a aVar = aVarE.f6267a;
            I i = new I(27);
            aVar.getClass();
            aVarE.e = new g(aVar.f4704b, i);
        }
        O5.a aVar2 = aVarE.e.f4756a;
        this.f10334B = (C1220i) aVar2.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f10336P = (S5.c) aVar2.f4724k.get();
        this.f13508V = (Uh.d) aVar2.m0.get();
        this.I0 = (C1220i) aVar2.f4716g.get();
        this.f13503J0 = (C0187u) aVar2.f.get();
        this.f13504K0 = new C1859a(aVar2.X(), aVar2.v(), aVar2.S(), aVar2.e(), aVar2.L(), new C0((ReferralEligibilityClientApi) aVar2.u0.get()), (com.paymaya.data.preference.a) aVar2.e.get(), (S5.c) aVar2.f4724k.get());
        H1().h(this);
        Uh.d dVar = this.f13508V;
        if (dVar == null) {
            j.n("mSessionSuccessSubject");
            throw null;
        }
        f fVar = new f(new C1967a(this, 7), Eh.d.f1366d);
        dVar.g(fVar);
        this.f13501G0 = fVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i;
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_profile, viewGroup, false);
        int i4 = R.id.account_info_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_info_text_view);
        if (textView != null) {
            i4 = R.id.account_limits_arrow_image_view;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.account_limits_arrow_image_view)) != null) {
                i4 = R.id.account_limits_container_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.account_limits_container_view);
                if (viewFindChildViewById != null) {
                    i4 = R.id.account_limits_image_view;
                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.account_limits_image_view)) != null) {
                        i4 = R.id.account_limits_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_limits_text_view)) != null) {
                            i4 = R.id.carousel;
                            MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.carousel);
                            if (mayaCarousel != null) {
                                i4 = R.id.constraint_group_authorize_requests;
                                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_authorize_requests);
                                if (group != null) {
                                    i4 = R.id.constraint_group_invite_friend;
                                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_invite_friend);
                                    if (group2 != null) {
                                        i4 = R.id.constraint_group_maya_score;
                                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_maya_score);
                                        if (group3 != null) {
                                            i4 = R.id.constraint_group_missions;
                                            Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_missions);
                                            if (group4 != null) {
                                                i4 = R.id.constraint_group_rate_this_app;
                                                Group group5 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_rate_this_app);
                                                if (group5 != null) {
                                                    i4 = R.id.constraint_group_security_center;
                                                    Group group6 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_security_center);
                                                    if (group6 != null) {
                                                        i4 = R.id.constraint_group_set_password;
                                                        Group group7 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_set_password);
                                                        if (group7 != null) {
                                                            i4 = R.id.constraint_group_submit_invite_code;
                                                            Group group8 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_submit_invite_code);
                                                            if (group8 != null) {
                                                                i4 = R.id.container_constraint_layout;
                                                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_constraint_layout)) != null) {
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                    i4 = R.id.device_info_text_view;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.device_info_text_view);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.display_name_text_view;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.display_name_text_view);
                                                                        if (textView3 != null) {
                                                                            i4 = R.id.favorites_arrow_image_view;
                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.favorites_arrow_image_view)) != null) {
                                                                                i4 = R.id.favorites_container_view;
                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.favorites_container_view);
                                                                                if (viewFindChildViewById2 != null) {
                                                                                    i4 = R.id.favorites_image_view;
                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.favorites_image_view)) != null) {
                                                                                        i4 = R.id.favorites_text_view;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.favorites_text_view)) != null) {
                                                                                            i4 = R.id.guideline_end;
                                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_end)) != null) {
                                                                                                i4 = R.id.guideline_left_profile_menu;
                                                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_left_profile_menu)) != null) {
                                                                                                    i4 = R.id.guideline_right_profile_menu;
                                                                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_right_profile_menu)) != null) {
                                                                                                        i4 = R.id.guideline_start;
                                                                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start)) != null) {
                                                                                                            i4 = R.id.help_arrow_image_view;
                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.help_arrow_image_view)) != null) {
                                                                                                                i4 = R.id.help_container_view;
                                                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.help_container_view);
                                                                                                                if (viewFindChildViewById3 != null) {
                                                                                                                    i4 = R.id.help_image_view;
                                                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.help_image_view)) != null) {
                                                                                                                        i4 = R.id.help_text_view;
                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.help_text_view)) != null) {
                                                                                                                            i4 = R.id.image_view_arrow_authorize_requests;
                                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_arrow_authorize_requests)) != null) {
                                                                                                                                i4 = R.id.image_view_arrow_submit_invite_code;
                                                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_arrow_submit_invite_code)) != null) {
                                                                                                                                    i4 = R.id.image_view_authorize_requests_icon;
                                                                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_authorize_requests_icon)) != null) {
                                                                                                                                        i4 = R.id.image_view_dedup_account_profile_logo;
                                                                                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_dedup_account_profile_logo);
                                                                                                                                        if (imageView != null) {
                                                                                                                                            i4 = R.id.image_view_rate_this_app_arrow;
                                                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_rate_this_app_arrow)) != null) {
                                                                                                                                                i4 = R.id.image_view_rate_this_app_icon;
                                                                                                                                                if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_rate_this_app_icon)) != null) {
                                                                                                                                                    i4 = R.id.image_view_submit_invite_code;
                                                                                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_submit_invite_code)) != null) {
                                                                                                                                                        i4 = R.id.image_view_user_profile_logo;
                                                                                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_user_profile_logo);
                                                                                                                                                        if (imageView2 != null) {
                                                                                                                                                            i4 = R.id.invite_friend_arrow_image_view;
                                                                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.invite_friend_arrow_image_view)) != null) {
                                                                                                                                                                i4 = R.id.invite_friend_cashback_tag_text_view;
                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.invite_friend_cashback_tag_text_view)) != null) {
                                                                                                                                                                    i4 = R.id.invite_friend_container_view;
                                                                                                                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.invite_friend_container_view);
                                                                                                                                                                    if (viewFindChildViewById4 != null) {
                                                                                                                                                                        i4 = R.id.invite_friend_image_view;
                                                                                                                                                                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.invite_friend_image_view)) != null) {
                                                                                                                                                                            i4 = R.id.invite_friend_text_view;
                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.invite_friend_text_view)) != null) {
                                                                                                                                                                                i4 = R.id.log_out_button;
                                                                                                                                                                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.log_out_button);
                                                                                                                                                                                if (button != null) {
                                                                                                                                                                                    i4 = R.id.maya_score_arrow_image_view;
                                                                                                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_score_arrow_image_view);
                                                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                                                        i4 = R.id.maya_score_badge;
                                                                                                                                                                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.maya_score_badge);
                                                                                                                                                                                        if (viewFindChildViewById5 != null) {
                                                                                                                                                                                            int i6 = R.id.points_difference_arrow_icon;
                                                                                                                                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.points_difference_arrow_icon);
                                                                                                                                                                                            if (imageView4 != null) {
                                                                                                                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindChildViewById5;
                                                                                                                                                                                                i6 = R.id.points_difference_label;
                                                                                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.points_difference_label);
                                                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                                                    i6 = R.id.points_difference_value;
                                                                                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.points_difference_value);
                                                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                                                        i6 = R.id.points_difference_XP;
                                                                                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById5, R.id.points_difference_XP);
                                                                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                                                                            C0440b1 c0440b1 = new C0440b1(constraintLayout, imageView4, constraintLayout, textView4, textView5, textView6);
                                                                                                                                                                                                            i4 = R.id.maya_score_beta_text_view;
                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_score_beta_text_view)) != null) {
                                                                                                                                                                                                                i4 = R.id.maya_score_container_view;
                                                                                                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.maya_score_container_view);
                                                                                                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                                                                                                    i4 = R.id.maya_score_image_view;
                                                                                                                                                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_score_image_view);
                                                                                                                                                                                                                    if (appCompatImageView != null) {
                                                                                                                                                                                                                        i4 = R.id.maya_score_text_view;
                                                                                                                                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.maya_score_text_view);
                                                                                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                                                                                            i4 = R.id.missions_arrow_image_view;
                                                                                                                                                                                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.missions_arrow_image_view)) != null) {
                                                                                                                                                                                                                                i4 = R.id.missions_container_view;
                                                                                                                                                                                                                                View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.missions_container_view);
                                                                                                                                                                                                                                if (viewFindChildViewById7 != null) {
                                                                                                                                                                                                                                    i4 = R.id.missions_image_view;
                                                                                                                                                                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.missions_image_view)) != null) {
                                                                                                                                                                                                                                        i4 = R.id.missions_text_view;
                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.missions_text_view)) != null) {
                                                                                                                                                                                                                                            i4 = R.id.profile_menu_container_constraint_layout;
                                                                                                                                                                                                                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.profile_menu_container_constraint_layout)) != null) {
                                                                                                                                                                                                                                                i4 = R.id.profile_menu_title_text_view;
                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.profile_menu_title_text_view)) != null) {
                                                                                                                                                                                                                                                    i4 = R.id.quick_guide_arrow_image_view;
                                                                                                                                                                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.quick_guide_arrow_image_view)) != null) {
                                                                                                                                                                                                                                                        i4 = R.id.quick_guide_container_view;
                                                                                                                                                                                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.quick_guide_container_view);
                                                                                                                                                                                                                                                        if (viewFindChildViewById8 != null) {
                                                                                                                                                                                                                                                            i4 = R.id.quick_guide_image_view;
                                                                                                                                                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.quick_guide_image_view)) != null) {
                                                                                                                                                                                                                                                                i4 = R.id.quick_guide_text_view;
                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.quick_guide_text_view)) != null) {
                                                                                                                                                                                                                                                                    i4 = R.id.security_center_arrow_image_view;
                                                                                                                                                                                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.security_center_arrow_image_view)) != null) {
                                                                                                                                                                                                                                                                        i4 = R.id.security_center_container_view;
                                                                                                                                                                                                                                                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, R.id.security_center_container_view);
                                                                                                                                                                                                                                                                        if (viewFindChildViewById9 != null) {
                                                                                                                                                                                                                                                                            i4 = R.id.security_center_image_view;
                                                                                                                                                                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.security_center_image_view)) != null) {
                                                                                                                                                                                                                                                                                i4 = R.id.security_center_text_view;
                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.security_center_text_view)) != null) {
                                                                                                                                                                                                                                                                                    i4 = R.id.setpassword_arrow_image_view;
                                                                                                                                                                                                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.setpassword_arrow_image_view)) != null) {
                                                                                                                                                                                                                                                                                        i4 = R.id.setpassword_container_view;
                                                                                                                                                                                                                                                                                        View viewFindChildViewById10 = ViewBindings.findChildViewById(viewInflate, R.id.setpassword_container_view);
                                                                                                                                                                                                                                                                                        if (viewFindChildViewById10 != null) {
                                                                                                                                                                                                                                                                                            i4 = R.id.setpassword_image_view;
                                                                                                                                                                                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.setpassword_image_view)) != null) {
                                                                                                                                                                                                                                                                                                i4 = R.id.setpassword_text_view;
                                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.setpassword_text_view)) != null) {
                                                                                                                                                                                                                                                                                                    i4 = R.id.settings_arrow_image_view;
                                                                                                                                                                                                                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.settings_arrow_image_view)) != null) {
                                                                                                                                                                                                                                                                                                        i4 = R.id.settings_container_view;
                                                                                                                                                                                                                                                                                                        View viewFindChildViewById11 = ViewBindings.findChildViewById(viewInflate, R.id.settings_container_view);
                                                                                                                                                                                                                                                                                                        if (viewFindChildViewById11 != null) {
                                                                                                                                                                                                                                                                                                            i4 = R.id.settings_image_view;
                                                                                                                                                                                                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.settings_image_view)) != null) {
                                                                                                                                                                                                                                                                                                                i4 = R.id.settings_text_view;
                                                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.settings_text_view)) != null) {
                                                                                                                                                                                                                                                                                                                    i4 = R.id.space_user_profile_logo_placeholder;
                                                                                                                                                                                                                                                                                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_user_profile_logo_placeholder)) != null) {
                                                                                                                                                                                                                                                                                                                        i4 = R.id.text_view_authorize_requests;
                                                                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_authorize_requests)) != null) {
                                                                                                                                                                                                                                                                                                                            i4 = R.id.text_view_rate_this_app_label;
                                                                                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_rate_this_app_label)) != null) {
                                                                                                                                                                                                                                                                                                                                i4 = R.id.text_view_submit_invite_code_option;
                                                                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_submit_invite_code_option)) != null) {
                                                                                                                                                                                                                                                                                                                                    i4 = R.id.user_mobile_number_text_view;
                                                                                                                                                                                                                                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.user_mobile_number_text_view);
                                                                                                                                                                                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                                                                                                                                                                                        i4 = R.id.username_text_view;
                                                                                                                                                                                                                                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.username_text_view);
                                                                                                                                                                                                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                                                                                                                                                                                                            i4 = R.id.view_authorize_requests_container;
                                                                                                                                                                                                                                                                                                                                            View viewFindChildViewById12 = ViewBindings.findChildViewById(viewInflate, R.id.view_authorize_requests_container);
                                                                                                                                                                                                                                                                                                                                            if (viewFindChildViewById12 != null) {
                                                                                                                                                                                                                                                                                                                                                i4 = R.id.view_authorize_requests_indicator;
                                                                                                                                                                                                                                                                                                                                                View viewFindChildViewById13 = ViewBindings.findChildViewById(viewInflate, R.id.view_authorize_requests_indicator);
                                                                                                                                                                                                                                                                                                                                                if (viewFindChildViewById13 != null) {
                                                                                                                                                                                                                                                                                                                                                    i4 = R.id.view_background_submit_invite_code;
                                                                                                                                                                                                                                                                                                                                                    View viewFindChildViewById14 = ViewBindings.findChildViewById(viewInflate, R.id.view_background_submit_invite_code);
                                                                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById14 != null) {
                                                                                                                                                                                                                                                                                                                                                        i4 = R.id.view_banner_section_account_outdated_info;
                                                                                                                                                                                                                                                                                                                                                        View viewFindChildViewById15 = ViewBindings.findChildViewById(viewInflate, R.id.view_banner_section_account_outdated_info);
                                                                                                                                                                                                                                                                                                                                                        if (viewFindChildViewById15 != null) {
                                                                                                                                                                                                                                                                                                                                                            int i10 = R.id.image_view_banner_account_under_review_graphic;
                                                                                                                                                                                                                                                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.image_view_banner_account_under_review_graphic)) != null) {
                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.text_view_banner_account_info_outdated_title;
                                                                                                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.text_view_banner_account_info_outdated_title)) != null) {
                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.text_view_banner_account_under_review_message;
                                                                                                                                                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.text_view_banner_account_under_review_message)) != null) {
                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.text_view_banner_update_outdated_info;
                                                                                                                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById15, R.id.text_view_banner_update_outdated_info)) != null) {
                                                                                                                                                                                                                                                                                                                                                                            G0 g02 = new G0((ConstraintLayout) viewFindChildViewById15, 17);
                                                                                                                                                                                                                                                                                                                                                                            View viewFindChildViewById16 = ViewBindings.findChildViewById(viewInflate, R.id.view_banner_section_account_under_review);
                                                                                                                                                                                                                                                                                                                                                                            if (viewFindChildViewById16 != null) {
                                                                                                                                                                                                                                                                                                                                                                                if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById16, R.id.image_view_banner_account_under_review_graphic)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.text_view_banner_account_under_review_message;
                                                                                                                                                                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById16, R.id.text_view_banner_account_under_review_message)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.text_view_banner_account_under_review_title;
                                                                                                                                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById16, R.id.text_view_banner_account_under_review_title)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.text_view_banner_check_status;
                                                                                                                                                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById16, R.id.text_view_banner_check_status)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                G0 g03 = new G0((ConstraintLayout) viewFindChildViewById16, 18);
                                                                                                                                                                                                                                                                                                                                                                                                i4 = R.id.view_banner_section_complete_account;
                                                                                                                                                                                                                                                                                                                                                                                                View viewFindChildViewById17 = ViewBindings.findChildViewById(viewInflate, R.id.view_banner_section_complete_account);
                                                                                                                                                                                                                                                                                                                                                                                                if (viewFindChildViewById17 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    int i11 = R.id.image_view_banner_account_complete_account_graphic;
                                                                                                                                                                                                                                                                                                                                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById17, R.id.image_view_banner_account_complete_account_graphic)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i11 = R.id.text_view_banner_complete_account_cta_spiel;
                                                                                                                                                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById17, R.id.text_view_banner_complete_account_cta_spiel)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i11 = R.id.text_view_banner_complete_account_message;
                                                                                                                                                                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById17, R.id.text_view_banner_complete_account_message)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                i11 = R.id.text_view_banner_complete_account_title;
                                                                                                                                                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById17, R.id.text_view_banner_complete_account_title)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    G0 g04 = new G0((ConstraintLayout) viewFindChildViewById17, 19);
                                                                                                                                                                                                                                                                                                                                                                                                                    View viewFindChildViewById18 = ViewBindings.findChildViewById(viewInflate, R.id.view_banner_section_create_username);
                                                                                                                                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById18 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        int i12 = R.id.image_view_banner_account_under_review_graphic;
                                                                                                                                                                                                                                                                                                                                                                                                                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById18, R.id.image_view_banner_account_under_review_graphic)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            i12 = R.id.text_view_banner_invite_friends_cta_spiel;
                                                                                                                                                                                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById18, R.id.text_view_banner_invite_friends_cta_spiel)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                i12 = R.id.text_view_banner_invite_friends_main_spiel;
                                                                                                                                                                                                                                                                                                                                                                                                                                if (((HtmlTextView) ViewBindings.findChildViewById(viewFindChildViewById18, R.id.text_view_banner_invite_friends_main_spiel)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    i12 = R.id.text_view_banner_invite_friends_overline_spiel;
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById18, R.id.text_view_banner_invite_friends_overline_spiel)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        G0 g05 = new G0((ConstraintLayout) viewFindChildViewById18, 20);
                                                                                                                                                                                                                                                                                                                                                                                                                                        i4 = R.id.view_banner_section_upgrade_your_account;
                                                                                                                                                                                                                                                                                                                                                                                                                                        View viewFindChildViewById19 = ViewBindings.findChildViewById(viewInflate, R.id.view_banner_section_upgrade_your_account);
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (viewFindChildViewById19 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            int i13 = R.id.image_view_banner_account_upgrade_account_graphic;
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById19, R.id.image_view_banner_account_upgrade_account_graphic)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                i13 = R.id.text_view_banner_upgrade_account_cta_spiel;
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById19, R.id.text_view_banner_upgrade_account_cta_spiel)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    i13 = R.id.text_view_banner_upgrade_account_message;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById19, R.id.text_view_banner_upgrade_account_message)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        i13 = R.id.text_view_banner_upgrade_account_title;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById19, R.id.text_view_banner_upgrade_account_title)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            G0 g06 = new G0((ConstraintLayout) viewFindChildViewById19, 21);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            int i14 = R.id.view_rate_this_app_container;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            View viewFindChildViewById20 = ViewBindings.findChildViewById(viewInflate, R.id.view_rate_this_app_container);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (viewFindChildViewById20 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                i14 = R.id.vouchers_arrow_image_view;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.vouchers_arrow_image_view)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i14 = R.id.vouchers_container_view;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    View viewFindChildViewById21 = ViewBindings.findChildViewById(viewInflate, R.id.vouchers_container_view);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById21 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i14 = R.id.vouchers_image_view;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.vouchers_image_view)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i14 = R.id.vouchers_text_view;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.vouchers_text_view)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                this.f13507U = new L0(nestedScrollView, textView, viewFindChildViewById, mayaCarousel, group, group2, group3, group4, group5, group6, group7, group8, nestedScrollView, textView2, textView3, viewFindChildViewById2, viewFindChildViewById3, imageView, imageView2, viewFindChildViewById4, button, imageView3, c0440b1, viewFindChildViewById6, appCompatImageView, textView7, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, textView8, textView9, viewFindChildViewById12, viewFindChildViewById13, viewFindChildViewById14, g02, g03, g04, g05, g06, viewFindChildViewById20, viewFindChildViewById21);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                L0 l02 = this.f13507U;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                j.d(l02);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                NestedScrollView nestedScrollView2 = l02.f3738a;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                j.f(nestedScrollView2, "getRoot(...)");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                return nestedScrollView2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            i4 = i14;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById19.getResources().getResourceName(i13)));
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById18.getResources().getResourceName(i12)));
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    i4 = R.id.view_banner_section_create_username;
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById17.getResources().getResourceName(i11)));
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.image_view_banner_account_under_review_graphic;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById16.getResources().getResourceName(i)));
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                            i4 = R.id.view_banner_section_account_under_review;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    view = viewFindChildViewById15;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                view = viewFindChildViewById15;
                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                view = viewFindChildViewById15;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
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
                                                                                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById5.getResources().getResourceName(i6)));
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f13501G0;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
        H1().i();
        super.onDestroy();
        this.f13507U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        if (S5.c.b(q1(), A5.b.f100d1)) {
            MayaCarousel mayaCarousel = this.f13502H0;
            if (mayaCarousel == null) {
                j.n("mayaCarousel");
                throw null;
            }
            mayaCarousel.m();
        }
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2;
        int i4 = 0;
        super.onResume();
        C1859a c1859aH1 = H1();
        if (c1859aH1.j.e().isAuthorizeRequestsEnabled()) {
            Group group = ((BaseMayaProfileFragment) ((a) c1859aH1.c.get())).u0;
            if (group == null) {
                j.n("mConstraintGroupAuthorizeRequests");
                throw null;
            }
            group.setVisibility(0);
            c1859aH1.e(new Lh.d(new Lh.d(new h(((PushApprovalApi) c1859aH1.h.f9799b).getPendingApprovalRequests().h(e.c), b.a(), 0), new p(c1859aH1, 23), i), new A0(c1859aH1, 24), i4).e());
        } else {
            Group group2 = ((BaseMayaProfileFragment) ((a) c1859aH1.c.get())).u0;
            if (group2 == null) {
                j.n("mConstraintGroupAuthorizeRequests");
                throw null;
            }
            group2.setVisibility(8);
        }
        C1220i c1220iO1 = o1();
        C1219h c1219h = new C1219h();
        EnumC1215d enumC1215d = EnumC1215d.MENU;
        c1219h.p(enumC1215d);
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("attribution", n1().f10371a);
        c1220iO1.b(c1219h);
        S5.c cVarQ1 = q1();
        A5.b bVar = A5.b.f100d1;
        if (S5.c.b(cVarQ1, bVar)) {
            C1220i c1220iO12 = o1();
            C1219h c1219h2 = new C1219h();
            c1219h2.p(enumC1215d);
            c1219h2.r(EnumC1216e.BANNER);
            c1219h2.n(2);
            c1219h2.j.put("attribution", n1().f10371a);
            c1220iO12.b(c1219h2);
        }
        if (S5.c.b(q1(), bVar)) {
            MayaCarousel mayaCarousel = this.f13502H0;
            if (mayaCarousel == null) {
                j.n("mayaCarousel");
                throw null;
            }
            if (mayaCarousel.f12022o0) {
                U1();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        L0 l02 = this.f13507U;
        j.d(l02);
        j.g(l02.f3742k, "<set-?>");
        L0 l03 = this.f13507U;
        j.d(l03);
        this.f13502H0 = l03.c;
        L0 l04 = this.f13507U;
        j.d(l04);
        this.f13509W = l04.f3746p;
        L0 l05 = this.f13507U;
        j.d(l05);
        this.f13510X = l05.f3745o;
        L0 l06 = this.f13507U;
        j.d(l06);
        this.f13511Y = l06.f3743l;
        L0 l07 = this.f13507U;
        j.d(l07);
        this.f13512Z = l07.f3728D;
        L0 l08 = this.f13507U;
        j.d(l08);
        this.f13513a0 = l08.f3727C;
        j.d(this.f13507U);
        j.d(this.f13507U);
        L0 l09 = this.f13507U;
        j.d(l09);
        this.f13514b0 = l09.f3735L.f3627b;
        L0 l010 = this.f13507U;
        j.d(l010);
        this.f13517e0 = l010.f3733I.f3627b;
        L0 l011 = this.f13507U;
        j.d(l011);
        this.f13515c0 = l011.f3732H.f3627b;
        L0 l012 = this.f13507U;
        j.d(l012);
        this.f13518f0 = l012.J.f3627b;
        L0 l013 = this.f13507U;
        j.d(l013);
        this.f13519g0 = l013.f3726B;
        L0 l014 = this.f13507U;
        j.d(l014);
        this.f13520h0 = l014.f3744n;
        L0 l015 = this.f13507U;
        j.d(l015);
        this.f13521i0 = l015.f3736M;
        L0 l016 = this.f13507U;
        j.d(l016);
        this.f13522j0 = l016.f3756z;
        L0 l017 = this.f13507U;
        j.d(l017);
        this.f13524l0 = l017.i;
        L0 l018 = this.f13507U;
        j.d(l018);
        this.f13523k0 = l018.f3747q;
        L0 l019 = this.f13507U;
        j.d(l019);
        this.m0 = l019.f3755y;
        L0 l020 = this.f13507U;
        j.d(l020);
        this.f13525n0 = l020.m;
        L0 l021 = this.f13507U;
        j.d(l021);
        this.w0 = l021.f3754x;
        L0 l022 = this.f13507U;
        j.d(l022);
        this.f13532x0 = l022.f3741g;
        L0 l023 = this.f13507U;
        j.d(l023);
        this.f13526o0 = l023.f3739b;
        L0 l024 = this.f13507U;
        j.d(l024);
        this.f13527p0 = l024.f3737N;
        L0 l025 = this.f13507U;
        j.d(l025);
        this.f13528q0 = l025.f3731G;
        L0 l026 = this.f13507U;
        j.d(l026);
        this.f13529r0 = l026.j;
        L0 l027 = this.f13507U;
        j.d(l027);
        this.f13530s0 = l027.e;
        L0 l028 = this.f13507U;
        j.d(l028);
        this.t0 = l028.f3729E;
        L0 l029 = this.f13507U;
        j.d(l029);
        this.u0 = l029.f3740d;
        L0 l030 = this.f13507U;
        j.d(l030);
        this.f13531v0 = l030.f3730F;
        L0 l031 = this.f13507U;
        j.d(l031);
        this.y0 = l031.h;
        j.d(this.f13507U);
        L0 l032 = this.f13507U;
        j.d(l032);
        this.f13533z0 = l032.f3751u;
        L0 l033 = this.f13507U;
        j.d(l033);
        this.f13495A0 = l033.f;
        L0 l034 = this.f13507U;
        j.d(l034);
        this.f13496B0 = l034.f3750t;
        L0 l035 = this.f13507U;
        j.d(l035);
        this.f13497C0 = l035.f3748r;
        L0 l036 = this.f13507U;
        j.d(l036);
        this.f13516d0 = l036.f3734K.f3627b;
        L1();
        ImageView imageView = this.f13510X;
        if (imageView == null) {
            j.n("mImageViewDedupAccountProfileLogo");
            throw null;
        }
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        ConstraintLayout constraintLayout = this.f13514b0;
        if (constraintLayout == null) {
            j.n("mViewBannerSectionUpgradeYourAccount");
            throw null;
        }
        final int i4 = 0;
        C.r0(constraintLayout, new Function0(this) { // from class: qa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19757b;

            {
                this.f19757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d dVar;
                d dVar2;
                switch (i4) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19757b;
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.UPGRADE);
                        c1219hH.i();
                        baseMayaProfileFragment.A1(c1219hH);
                        C1859a c1859aH1 = baseMayaProfileFragment.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH1.j.l()) && (dVar = ((BaseMayaProfileFragment) ((pa.a) c1859aH1.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                            mayaProfileActivity.n1().s(mayaProfileActivity, true);
                            mayaProfileActivity.finish();
                        }
                        return Unit.f18162a;
                    case 1:
                        C1859a c1859aH12 = this.f19757b.H1();
                        if ("kyc1".equalsIgnoreCase(c1859aH12.j.l())) {
                            d dVar3 = ((BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get())).f13505L0;
                            if (dVar3 != null) {
                                Bb.a aVarV1 = ((MayaProfileActivity) dVar3).V1();
                                if (aVarV1.e.I()) {
                                    MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity2.n1().s(mayaProfileActivity2, true);
                                    mayaProfileActivity2.finish();
                                } else {
                                    MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity3.n1().f367a.e0("");
                                    mayaProfileActivity3.startActivity(new Intent(mayaProfileActivity3, (Class<?>) MayaKycUpdateOtherIdsActivity.class));
                                    mayaProfileActivity3.finish();
                                }
                            }
                            BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get());
                            C1220i c1220i = baseMayaProfileFragment2.I0;
                            if (c1220i == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity = baseMayaProfileFragment2.getActivity();
                            C1219h c1219h = new C1219h();
                            c1219h.p(EnumC1215d.EKYC_V6);
                            c1219h.n(17);
                            AbstractC1414e.n(c1219h, EnumC1217f.REKYC_PROFILE, c1220i, activity, c1219h);
                        }
                        return Unit.f18162a;
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19757b;
                        C1219h c1219hH2 = AbstractC2329d.h(17);
                        c1219hH2.p(EnumC1215d.PROFILE);
                        c1219hH2.t(EnumC1217f.SET_USERNAME);
                        c1219hH2.i();
                        baseMayaProfileFragment3.A1(c1219hH2);
                        BaseMayaProfileFragment baseMayaProfileFragment4 = (BaseMayaProfileFragment) ((pa.a) baseMayaProfileFragment3.H1().c.get());
                        Intent intent = baseMayaProfileFragment4.f13499E0;
                        if (intent != null) {
                            baseMayaProfileFragment4.startActivity(intent);
                            return Unit.f18162a;
                        }
                        j.n("setUsernameActivityIntent");
                        throw null;
                    case 3:
                        C1859a c1859aH13 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH13.j.l())) {
                            if ("for_edd".equalsIgnoreCase(c1859aH13.j.l())) {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("edd");
                            } else {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("ekyc");
                            }
                            d dVar4 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1().s(mayaProfileActivity4, true);
                                mayaProfileActivity4.finish();
                            }
                        } else if (j.b(c1859aH13.j.x(), "submitted")) {
                            BaseMayaProfileFragment baseMayaProfileFragment5 = (BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get());
                            C1220i c1220i2 = baseMayaProfileFragment5.I0;
                            if (c1220i2 == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity2 = baseMayaProfileFragment5.getActivity();
                            C1219h c1219h2 = new C1219h();
                            c1219h2.q("EKYC_V6");
                            AbstractC1414e.m(c1219h2, EnumC1216e.REKYC_CHECK_STATUS, 2);
                            c1220i2.c(activity2, c1219h2);
                            d dVar5 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1().s(mayaProfileActivity5, true);
                                mayaProfileActivity5.finish();
                            }
                        }
                        return Unit.f18162a;
                    default:
                        C1859a c1859aH14 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH14.j.l()) && c1859aH14.j.e().isShowDnfbpFromProfileEnabled() && (dVar2 = ((BaseMayaProfileFragment) ((pa.a) c1859aH14.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar2;
                            mayaProfileActivity6.n1().s(mayaProfileActivity6, true);
                            mayaProfileActivity6.finish();
                        }
                        return Unit.f18162a;
                }
            }
        });
        ConstraintLayout constraintLayout2 = this.f13515c0;
        if (constraintLayout2 == null) {
            j.n("mViewBannerSectionAccountOutdatedInfo");
            throw null;
        }
        final int i6 = 1;
        C.r0(constraintLayout2, new Function0(this) { // from class: qa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19757b;

            {
                this.f19757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d dVar;
                d dVar2;
                switch (i6) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19757b;
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.UPGRADE);
                        c1219hH.i();
                        baseMayaProfileFragment.A1(c1219hH);
                        C1859a c1859aH1 = baseMayaProfileFragment.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH1.j.l()) && (dVar = ((BaseMayaProfileFragment) ((pa.a) c1859aH1.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                            mayaProfileActivity.n1().s(mayaProfileActivity, true);
                            mayaProfileActivity.finish();
                        }
                        return Unit.f18162a;
                    case 1:
                        C1859a c1859aH12 = this.f19757b.H1();
                        if ("kyc1".equalsIgnoreCase(c1859aH12.j.l())) {
                            d dVar3 = ((BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get())).f13505L0;
                            if (dVar3 != null) {
                                Bb.a aVarV1 = ((MayaProfileActivity) dVar3).V1();
                                if (aVarV1.e.I()) {
                                    MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity2.n1().s(mayaProfileActivity2, true);
                                    mayaProfileActivity2.finish();
                                } else {
                                    MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity3.n1().f367a.e0("");
                                    mayaProfileActivity3.startActivity(new Intent(mayaProfileActivity3, (Class<?>) MayaKycUpdateOtherIdsActivity.class));
                                    mayaProfileActivity3.finish();
                                }
                            }
                            BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get());
                            C1220i c1220i = baseMayaProfileFragment2.I0;
                            if (c1220i == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity = baseMayaProfileFragment2.getActivity();
                            C1219h c1219h = new C1219h();
                            c1219h.p(EnumC1215d.EKYC_V6);
                            c1219h.n(17);
                            AbstractC1414e.n(c1219h, EnumC1217f.REKYC_PROFILE, c1220i, activity, c1219h);
                        }
                        return Unit.f18162a;
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19757b;
                        C1219h c1219hH2 = AbstractC2329d.h(17);
                        c1219hH2.p(EnumC1215d.PROFILE);
                        c1219hH2.t(EnumC1217f.SET_USERNAME);
                        c1219hH2.i();
                        baseMayaProfileFragment3.A1(c1219hH2);
                        BaseMayaProfileFragment baseMayaProfileFragment4 = (BaseMayaProfileFragment) ((pa.a) baseMayaProfileFragment3.H1().c.get());
                        Intent intent = baseMayaProfileFragment4.f13499E0;
                        if (intent != null) {
                            baseMayaProfileFragment4.startActivity(intent);
                            return Unit.f18162a;
                        }
                        j.n("setUsernameActivityIntent");
                        throw null;
                    case 3:
                        C1859a c1859aH13 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH13.j.l())) {
                            if ("for_edd".equalsIgnoreCase(c1859aH13.j.l())) {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("edd");
                            } else {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("ekyc");
                            }
                            d dVar4 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1().s(mayaProfileActivity4, true);
                                mayaProfileActivity4.finish();
                            }
                        } else if (j.b(c1859aH13.j.x(), "submitted")) {
                            BaseMayaProfileFragment baseMayaProfileFragment5 = (BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get());
                            C1220i c1220i2 = baseMayaProfileFragment5.I0;
                            if (c1220i2 == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity2 = baseMayaProfileFragment5.getActivity();
                            C1219h c1219h2 = new C1219h();
                            c1219h2.q("EKYC_V6");
                            AbstractC1414e.m(c1219h2, EnumC1216e.REKYC_CHECK_STATUS, 2);
                            c1220i2.c(activity2, c1219h2);
                            d dVar5 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1().s(mayaProfileActivity5, true);
                                mayaProfileActivity5.finish();
                            }
                        }
                        return Unit.f18162a;
                    default:
                        C1859a c1859aH14 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH14.j.l()) && c1859aH14.j.e().isShowDnfbpFromProfileEnabled() && (dVar2 = ((BaseMayaProfileFragment) ((pa.a) c1859aH14.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar2;
                            mayaProfileActivity6.n1().s(mayaProfileActivity6, true);
                            mayaProfileActivity6.finish();
                        }
                        return Unit.f18162a;
                }
            }
        });
        ConstraintLayout constraintLayout3 = this.f13516d0;
        if (constraintLayout3 == null) {
            j.n("mViewBannerSectionSetupUsername");
            throw null;
        }
        final int i10 = 2;
        C.r0(constraintLayout3, new Function0(this) { // from class: qa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19757b;

            {
                this.f19757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d dVar;
                d dVar2;
                switch (i10) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19757b;
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.UPGRADE);
                        c1219hH.i();
                        baseMayaProfileFragment.A1(c1219hH);
                        C1859a c1859aH1 = baseMayaProfileFragment.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH1.j.l()) && (dVar = ((BaseMayaProfileFragment) ((pa.a) c1859aH1.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                            mayaProfileActivity.n1().s(mayaProfileActivity, true);
                            mayaProfileActivity.finish();
                        }
                        return Unit.f18162a;
                    case 1:
                        C1859a c1859aH12 = this.f19757b.H1();
                        if ("kyc1".equalsIgnoreCase(c1859aH12.j.l())) {
                            d dVar3 = ((BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get())).f13505L0;
                            if (dVar3 != null) {
                                Bb.a aVarV1 = ((MayaProfileActivity) dVar3).V1();
                                if (aVarV1.e.I()) {
                                    MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity2.n1().s(mayaProfileActivity2, true);
                                    mayaProfileActivity2.finish();
                                } else {
                                    MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity3.n1().f367a.e0("");
                                    mayaProfileActivity3.startActivity(new Intent(mayaProfileActivity3, (Class<?>) MayaKycUpdateOtherIdsActivity.class));
                                    mayaProfileActivity3.finish();
                                }
                            }
                            BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get());
                            C1220i c1220i = baseMayaProfileFragment2.I0;
                            if (c1220i == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity = baseMayaProfileFragment2.getActivity();
                            C1219h c1219h = new C1219h();
                            c1219h.p(EnumC1215d.EKYC_V6);
                            c1219h.n(17);
                            AbstractC1414e.n(c1219h, EnumC1217f.REKYC_PROFILE, c1220i, activity, c1219h);
                        }
                        return Unit.f18162a;
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19757b;
                        C1219h c1219hH2 = AbstractC2329d.h(17);
                        c1219hH2.p(EnumC1215d.PROFILE);
                        c1219hH2.t(EnumC1217f.SET_USERNAME);
                        c1219hH2.i();
                        baseMayaProfileFragment3.A1(c1219hH2);
                        BaseMayaProfileFragment baseMayaProfileFragment4 = (BaseMayaProfileFragment) ((pa.a) baseMayaProfileFragment3.H1().c.get());
                        Intent intent = baseMayaProfileFragment4.f13499E0;
                        if (intent != null) {
                            baseMayaProfileFragment4.startActivity(intent);
                            return Unit.f18162a;
                        }
                        j.n("setUsernameActivityIntent");
                        throw null;
                    case 3:
                        C1859a c1859aH13 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH13.j.l())) {
                            if ("for_edd".equalsIgnoreCase(c1859aH13.j.l())) {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("edd");
                            } else {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("ekyc");
                            }
                            d dVar4 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1().s(mayaProfileActivity4, true);
                                mayaProfileActivity4.finish();
                            }
                        } else if (j.b(c1859aH13.j.x(), "submitted")) {
                            BaseMayaProfileFragment baseMayaProfileFragment5 = (BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get());
                            C1220i c1220i2 = baseMayaProfileFragment5.I0;
                            if (c1220i2 == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity2 = baseMayaProfileFragment5.getActivity();
                            C1219h c1219h2 = new C1219h();
                            c1219h2.q("EKYC_V6");
                            AbstractC1414e.m(c1219h2, EnumC1216e.REKYC_CHECK_STATUS, 2);
                            c1220i2.c(activity2, c1219h2);
                            d dVar5 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1().s(mayaProfileActivity5, true);
                                mayaProfileActivity5.finish();
                            }
                        }
                        return Unit.f18162a;
                    default:
                        C1859a c1859aH14 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH14.j.l()) && c1859aH14.j.e().isShowDnfbpFromProfileEnabled() && (dVar2 = ((BaseMayaProfileFragment) ((pa.a) c1859aH14.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar2;
                            mayaProfileActivity6.n1().s(mayaProfileActivity6, true);
                            mayaProfileActivity6.finish();
                        }
                        return Unit.f18162a;
                }
            }
        });
        ConstraintLayout constraintLayout4 = this.f13517e0;
        if (constraintLayout4 == null) {
            j.n("mViewBannerSectionAccountUnderReview");
            throw null;
        }
        final int i11 = 3;
        C.r0(constraintLayout4, new Function0(this) { // from class: qa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19757b;

            {
                this.f19757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d dVar;
                d dVar2;
                switch (i11) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19757b;
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.UPGRADE);
                        c1219hH.i();
                        baseMayaProfileFragment.A1(c1219hH);
                        C1859a c1859aH1 = baseMayaProfileFragment.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH1.j.l()) && (dVar = ((BaseMayaProfileFragment) ((pa.a) c1859aH1.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                            mayaProfileActivity.n1().s(mayaProfileActivity, true);
                            mayaProfileActivity.finish();
                        }
                        return Unit.f18162a;
                    case 1:
                        C1859a c1859aH12 = this.f19757b.H1();
                        if ("kyc1".equalsIgnoreCase(c1859aH12.j.l())) {
                            d dVar3 = ((BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get())).f13505L0;
                            if (dVar3 != null) {
                                Bb.a aVarV1 = ((MayaProfileActivity) dVar3).V1();
                                if (aVarV1.e.I()) {
                                    MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity2.n1().s(mayaProfileActivity2, true);
                                    mayaProfileActivity2.finish();
                                } else {
                                    MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity3.n1().f367a.e0("");
                                    mayaProfileActivity3.startActivity(new Intent(mayaProfileActivity3, (Class<?>) MayaKycUpdateOtherIdsActivity.class));
                                    mayaProfileActivity3.finish();
                                }
                            }
                            BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get());
                            C1220i c1220i = baseMayaProfileFragment2.I0;
                            if (c1220i == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity = baseMayaProfileFragment2.getActivity();
                            C1219h c1219h = new C1219h();
                            c1219h.p(EnumC1215d.EKYC_V6);
                            c1219h.n(17);
                            AbstractC1414e.n(c1219h, EnumC1217f.REKYC_PROFILE, c1220i, activity, c1219h);
                        }
                        return Unit.f18162a;
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19757b;
                        C1219h c1219hH2 = AbstractC2329d.h(17);
                        c1219hH2.p(EnumC1215d.PROFILE);
                        c1219hH2.t(EnumC1217f.SET_USERNAME);
                        c1219hH2.i();
                        baseMayaProfileFragment3.A1(c1219hH2);
                        BaseMayaProfileFragment baseMayaProfileFragment4 = (BaseMayaProfileFragment) ((pa.a) baseMayaProfileFragment3.H1().c.get());
                        Intent intent = baseMayaProfileFragment4.f13499E0;
                        if (intent != null) {
                            baseMayaProfileFragment4.startActivity(intent);
                            return Unit.f18162a;
                        }
                        j.n("setUsernameActivityIntent");
                        throw null;
                    case 3:
                        C1859a c1859aH13 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH13.j.l())) {
                            if ("for_edd".equalsIgnoreCase(c1859aH13.j.l())) {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("edd");
                            } else {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("ekyc");
                            }
                            d dVar4 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1().s(mayaProfileActivity4, true);
                                mayaProfileActivity4.finish();
                            }
                        } else if (j.b(c1859aH13.j.x(), "submitted")) {
                            BaseMayaProfileFragment baseMayaProfileFragment5 = (BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get());
                            C1220i c1220i2 = baseMayaProfileFragment5.I0;
                            if (c1220i2 == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity2 = baseMayaProfileFragment5.getActivity();
                            C1219h c1219h2 = new C1219h();
                            c1219h2.q("EKYC_V6");
                            AbstractC1414e.m(c1219h2, EnumC1216e.REKYC_CHECK_STATUS, 2);
                            c1220i2.c(activity2, c1219h2);
                            d dVar5 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1().s(mayaProfileActivity5, true);
                                mayaProfileActivity5.finish();
                            }
                        }
                        return Unit.f18162a;
                    default:
                        C1859a c1859aH14 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH14.j.l()) && c1859aH14.j.e().isShowDnfbpFromProfileEnabled() && (dVar2 = ((BaseMayaProfileFragment) ((pa.a) c1859aH14.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar2;
                            mayaProfileActivity6.n1().s(mayaProfileActivity6, true);
                            mayaProfileActivity6.finish();
                        }
                        return Unit.f18162a;
                }
            }
        });
        ConstraintLayout constraintLayout5 = this.f13518f0;
        if (constraintLayout5 == null) {
            j.n("mViewBannerSectionCompleteAccount");
            throw null;
        }
        final int i12 = 4;
        C.r0(constraintLayout5, new Function0(this) { // from class: qa.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19757b;

            {
                this.f19757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                d dVar;
                d dVar2;
                switch (i12) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19757b;
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.UPGRADE);
                        c1219hH.i();
                        baseMayaProfileFragment.A1(c1219hH);
                        C1859a c1859aH1 = baseMayaProfileFragment.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH1.j.l()) && (dVar = ((BaseMayaProfileFragment) ((pa.a) c1859aH1.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                            mayaProfileActivity.n1().s(mayaProfileActivity, true);
                            mayaProfileActivity.finish();
                        }
                        return Unit.f18162a;
                    case 1:
                        C1859a c1859aH12 = this.f19757b.H1();
                        if ("kyc1".equalsIgnoreCase(c1859aH12.j.l())) {
                            d dVar3 = ((BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get())).f13505L0;
                            if (dVar3 != null) {
                                Bb.a aVarV1 = ((MayaProfileActivity) dVar3).V1();
                                if (aVarV1.e.I()) {
                                    MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity2.n1().s(mayaProfileActivity2, true);
                                    mayaProfileActivity2.finish();
                                } else {
                                    MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
                                    mayaProfileActivity3.n1().f367a.e0("");
                                    mayaProfileActivity3.startActivity(new Intent(mayaProfileActivity3, (Class<?>) MayaKycUpdateOtherIdsActivity.class));
                                    mayaProfileActivity3.finish();
                                }
                            }
                            BaseMayaProfileFragment baseMayaProfileFragment2 = (BaseMayaProfileFragment) ((pa.a) c1859aH12.c.get());
                            C1220i c1220i = baseMayaProfileFragment2.I0;
                            if (c1220i == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity = baseMayaProfileFragment2.getActivity();
                            C1219h c1219h = new C1219h();
                            c1219h.p(EnumC1215d.EKYC_V6);
                            c1219h.n(17);
                            AbstractC1414e.n(c1219h, EnumC1217f.REKYC_PROFILE, c1220i, activity, c1219h);
                        }
                        return Unit.f18162a;
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19757b;
                        C1219h c1219hH2 = AbstractC2329d.h(17);
                        c1219hH2.p(EnumC1215d.PROFILE);
                        c1219hH2.t(EnumC1217f.SET_USERNAME);
                        c1219hH2.i();
                        baseMayaProfileFragment3.A1(c1219hH2);
                        BaseMayaProfileFragment baseMayaProfileFragment4 = (BaseMayaProfileFragment) ((pa.a) baseMayaProfileFragment3.H1().c.get());
                        Intent intent = baseMayaProfileFragment4.f13499E0;
                        if (intent != null) {
                            baseMayaProfileFragment4.startActivity(intent);
                            return Unit.f18162a;
                        }
                        j.n("setUsernameActivityIntent");
                        throw null;
                    case 3:
                        C1859a c1859aH13 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH13.j.l())) {
                            if ("for_edd".equalsIgnoreCase(c1859aH13.j.l())) {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("edd");
                            } else {
                                ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).S1("ekyc");
                            }
                            d dVar4 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1().s(mayaProfileActivity4, true);
                                mayaProfileActivity4.finish();
                            }
                        } else if (j.b(c1859aH13.j.x(), "submitted")) {
                            BaseMayaProfileFragment baseMayaProfileFragment5 = (BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get());
                            C1220i c1220i2 = baseMayaProfileFragment5.I0;
                            if (c1220i2 == null) {
                                j.n("mAnalyticsUtilsForEkycV6");
                                throw null;
                            }
                            FragmentActivity activity2 = baseMayaProfileFragment5.getActivity();
                            C1219h c1219h2 = new C1219h();
                            c1219h2.q("EKYC_V6");
                            AbstractC1414e.m(c1219h2, EnumC1216e.REKYC_CHECK_STATUS, 2);
                            c1220i2.c(activity2, c1219h2);
                            d dVar5 = ((BaseMayaProfileFragment) ((pa.a) c1859aH13.c.get())).f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1().s(mayaProfileActivity5, true);
                                mayaProfileActivity5.finish();
                            }
                        }
                        return Unit.f18162a;
                    default:
                        C1859a c1859aH14 = this.f19757b.H1();
                        if (!"kyc1".equalsIgnoreCase(c1859aH14.j.l()) && c1859aH14.j.e().isShowDnfbpFromProfileEnabled() && (dVar2 = ((BaseMayaProfileFragment) ((pa.a) c1859aH14.c.get())).f13505L0) != null) {
                            MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar2;
                            mayaProfileActivity6.n1().s(mayaProfileActivity6, true);
                            mayaProfileActivity6.finish();
                        }
                        return Unit.f18162a;
                }
            }
        });
        View view2 = this.f13519g0;
        if (view2 == null) {
            j.n("mViewSettingsContainer");
            throw null;
        }
        final int i13 = 2;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i13) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view3 = this.f13520h0;
        if (view3 == null) {
            j.n("mViewHelpContainer");
            throw null;
        }
        final int i14 = 3;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i14) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view4 = this.f13521i0;
        if (view4 == null) {
            j.n("mViewRateThisAppContainer");
            throw null;
        }
        final int i15 = 4;
        view4.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i15) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view5 = this.f13522j0;
        if (view5 == null) {
            j.n("mViewSecurityCenterContainer");
            throw null;
        }
        final int i16 = 5;
        view5.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i16) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view6 = this.f13523k0;
        if (view6 == null) {
            j.n("mViewInviteFriendContainer");
            throw null;
        }
        final int i17 = 6;
        view6.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i17) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view7 = this.m0;
        if (view7 == null) {
            j.n("mViewQuickGuideContainer");
            throw null;
        }
        final int i18 = 7;
        view7.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i18) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view8 = this.f13525n0;
        if (view8 == null) {
            j.n("mViewFavoritesContainer");
            throw null;
        }
        final int i19 = 8;
        view8.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i19) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f13497C0;
        if (button == null) {
            j.n("mButtonLogout");
            throw null;
        }
        final int i20 = 9;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i20) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view9 = this.f13526o0;
        if (view9 == null) {
            j.n("mViewAccountLimitsContainer");
            throw null;
        }
        final int i21 = 10;
        view9.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i21) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view10 = this.w0;
        if (view10 == null) {
            j.n("mViewMissionsContainer");
            throw null;
        }
        final int i22 = 11;
        view10.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i22) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view11 = this.f13527p0;
        if (view11 == null) {
            j.n("mViewVouchersContainer");
            throw null;
        }
        final int i23 = 12;
        view11.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i23) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view12 = this.f13528q0;
        if (view12 == null) {
            j.n("mViewBackgroundSubmitInviteCode");
            throw null;
        }
        final int i24 = 13;
        view12.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i24) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view13 = this.t0;
        if (view13 == null) {
            j.n("mViewContainerAuthorizeRequests");
            throw null;
        }
        final int i25 = 14;
        view13.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i25) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view14 = this.f13533z0;
        if (view14 == null) {
            j.n("mViewContainerMayaScore");
            throw null;
        }
        final int i26 = 1;
        view14.setOnClickListener(new View.OnClickListener(this) { // from class: qa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaProfileFragment f19755b;

            {
                this.f19755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i26) {
                    case 0:
                        BaseMayaProfileFragment baseMayaProfileFragment = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar = baseMayaProfileFragment.f13505L0;
                            if (dVar != null) {
                                MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                                M2.b.Z(2131231338, mayaProfileActivity.getString(R.string.maya_error_title_duplicate_account), mayaProfileActivity.getString(R.string.maya_error_message_duplicate_account), mayaProfileActivity.getString(R.string.maya_label_resolve_dedup_account), null, false, null, new ViewOnClickListenerC1973a(mayaProfileActivity, 3), false, 352).show(mayaProfileActivity.getSupportFragmentManager(), "error_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        BaseMayaProfileFragment baseMayaProfileFragment2 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            d dVar2 = baseMayaProfileFragment2.f13505L0;
                            if (dVar2 != null) {
                                MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) dVar2;
                                mayaProfileActivity2.n1();
                                Intent intent = new Intent(mayaProfileActivity2, (Class<?>) MayaScoreActivity.class);
                                intent.putExtra("route", "paymaya://xp");
                                intent.putExtra("source", "Profile Page");
                                mayaProfileActivity2.startActivity(intent);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        BaseMayaProfileFragment baseMayaProfileFragment3 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SETTINGS);
                            c1219h.i();
                            baseMayaProfileFragment3.A1(c1219h);
                            d dVar3 = baseMayaProfileFragment3.f13505L0;
                            if (dVar3 != null) {
                                MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) dVar3;
                                mayaProfileActivity3.n1();
                                i.V(mayaProfileActivity3, null);
                                mayaProfileActivity3.finish();
                            }
                            return;
                        } finally {
                        }
                    case 3:
                        BaseMayaProfileFragment baseMayaProfileFragment4 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.N1(baseMayaProfileFragment4);
                            return;
                        } finally {
                        }
                    case 4:
                        BaseMayaProfileFragment baseMayaProfileFragment5 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.RATE_THIS_APP);
                            c1219h2.i();
                            baseMayaProfileFragment5.A1(c1219h2);
                            d dVar4 = baseMayaProfileFragment5.f13505L0;
                            if (dVar4 != null) {
                                MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) dVar4;
                                mayaProfileActivity4.n1();
                                try {
                                    i.f(mayaProfileActivity4, "market://details?id=com.paymaya");
                                } catch (ActivityNotFoundException unused) {
                                    yk.a.e();
                                    i.f(mayaProfileActivity4, "https://play.google.com/store/apps/details?id=com.paymaya");
                                }
                                break;
                            }
                            return;
                        } finally {
                        }
                    case 5:
                        BaseMayaProfileFragment baseMayaProfileFragment6 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219hH = AbstractC2329d.h(17);
                            c1219hH.t(EnumC1217f.SECURITY_CENTER);
                            c1219hH.i();
                            baseMayaProfileFragment6.A1(c1219hH);
                            d dVar5 = baseMayaProfileFragment6.f13505L0;
                            if (dVar5 != null) {
                                MayaProfileActivity mayaProfileActivity5 = (MayaProfileActivity) dVar5;
                                mayaProfileActivity5.n1();
                                i.S(mayaProfileActivity5, Scopes.PROFILE, "Security Center Button", new W4.b(mayaProfileActivity5, 23));
                            }
                            return;
                        } finally {
                        }
                    case 6:
                        BaseMayaProfileFragment baseMayaProfileFragment7 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.O1(baseMayaProfileFragment7);
                            return;
                        } finally {
                        }
                    case 7:
                        BaseMayaProfileFragment baseMayaProfileFragment8 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.QUICK_GUIDE);
                            c1219h3.i();
                            baseMayaProfileFragment8.A1(c1219h3);
                            d dVar6 = baseMayaProfileFragment8.f13505L0;
                            if (dVar6 != null) {
                                MayaProfileActivity mayaProfileActivity6 = (MayaProfileActivity) dVar6;
                                mayaProfileActivity6.n1().w(mayaProfileActivity6, "https://www.paymaya.com/quick-guide#guides");
                                mayaProfileActivity6.finish();
                            }
                            return;
                        } finally {
                        }
                    case 8:
                        BaseMayaProfileFragment baseMayaProfileFragment9 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.MY_FAVORITES);
                            c1219h4.i();
                            baseMayaProfileFragment9.A1(c1219h4);
                            d dVar7 = baseMayaProfileFragment9.f13505L0;
                            if (dVar7 != null) {
                                MayaProfileActivity mayaProfileActivity7 = (MayaProfileActivity) dVar7;
                                mayaProfileActivity7.n1();
                                Intent intent2 = new Intent(mayaProfileActivity7, (Class<?>) MayaFavoriteActivity.class);
                                intent2.setData(mayaProfileActivity7.getIntent().getData());
                                i.v0(mayaProfileActivity7, intent2);
                                mayaProfileActivity7.startActivity(intent2);
                                mayaProfileActivity7.finish();
                            }
                            return;
                        } finally {
                        }
                    case 9:
                        BaseMayaProfileFragment baseMayaProfileFragment10 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.P1(baseMayaProfileFragment10);
                            return;
                        } finally {
                        }
                    case 10:
                        BaseMayaProfileFragment baseMayaProfileFragment11 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.ACCOUNT_LIMITS);
                            c1219h5.i();
                            baseMayaProfileFragment11.A1(c1219h5);
                            d dVar8 = baseMayaProfileFragment11.f13505L0;
                            if (dVar8 != null) {
                                MayaProfileActivity mayaProfileActivity8 = (MayaProfileActivity) dVar8;
                                mayaProfileActivity8.n1();
                                i.b(mayaProfileActivity8);
                                mayaProfileActivity8.finish();
                            }
                            return;
                        } finally {
                        }
                    case 11:
                        BaseMayaProfileFragment baseMayaProfileFragment12 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h6 = new C1219h();
                            c1219h6.n(17);
                            c1219h6.t(EnumC1217f.MISSIONS);
                            c1219h6.i();
                            baseMayaProfileFragment12.A1(c1219h6);
                            d dVar9 = baseMayaProfileFragment12.f13505L0;
                            if (dVar9 != null) {
                                MayaProfileActivity mayaProfileActivity9 = (MayaProfileActivity) dVar9;
                                mayaProfileActivity9.n1();
                                Intent intent3 = new Intent(mayaProfileActivity9, (Class<?>) MayaMissionsActivity.class);
                                intent3.setData(mayaProfileActivity9.getIntent().getData());
                                i.v0(mayaProfileActivity9, intent3);
                                mayaProfileActivity9.startActivity(intent3);
                                mayaProfileActivity9.finish();
                            }
                            return;
                        } finally {
                        }
                    case 12:
                        BaseMayaProfileFragment baseMayaProfileFragment13 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h7 = new C1219h();
                            c1219h7.n(17);
                            c1219h7.t(EnumC1217f.VOUCHERS);
                            c1219h7.i();
                            baseMayaProfileFragment13.A1(c1219h7);
                            d dVar10 = baseMayaProfileFragment13.f13505L0;
                            if (dVar10 != null) {
                                MayaProfileActivity mayaProfileActivity10 = (MayaProfileActivity) dVar10;
                                mayaProfileActivity10.n1();
                                i.g0(mayaProfileActivity10, null);
                                mayaProfileActivity10.finish();
                            }
                            return;
                        } finally {
                        }
                    case 13:
                        BaseMayaProfileFragment baseMayaProfileFragment14 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            BaseMayaProfileFragment.Q1(baseMayaProfileFragment14);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaProfileFragment baseMayaProfileFragment15 = this.f19755b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h8 = new C1219h();
                            c1219h8.n(17);
                            c1219h8.t(EnumC1217f.AUTHORIZE_REQUESTS);
                            c1219h8.i();
                            baseMayaProfileFragment15.A1(c1219h8);
                            d dVar11 = baseMayaProfileFragment15.f13505L0;
                            if (dVar11 != null) {
                                MayaProfileActivity mayaProfileActivity11 = (MayaProfileActivity) dVar11;
                                mayaProfileActivity11.n1();
                                mayaProfileActivity11.startActivity(new Intent(mayaProfileActivity11, (Class<?>) MayaPushApprovalActivity.class));
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        H1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.MENU;
    }
}
