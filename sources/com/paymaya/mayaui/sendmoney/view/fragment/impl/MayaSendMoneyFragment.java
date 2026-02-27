package com.paymaya.mayaui.sendmoney.view.fragment.impl;

import Bb.g;
import Bb.h;
import Bb.i;
import Bb.l;
import Bb.m;
import Bb.n;
import Bj.C0165x;
import Eb.a;
import Fb.c;
import G5.A;
import G5.C0256f;
import G5.r;
import G7.F;
import G7.t;
import Gb.e;
import Gb.k;
import Gh.f;
import Ke.d;
import Kh.T;
import N5.C0446d1;
import N5.C0489y;
import N5.G0;
import N5.I;
import N5.N0;
import ac.C0679c;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import m5.C1847a;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import yb.C2518b;
import yb.InterfaceC2517a;
import zh.b;
import zj.C2576A;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSendMoneyFragment extends MayaBaseLoadingFragment implements c, InterfaceC2517a {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f13776A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public AppCompatTextView f13777B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ConstraintLayout f13778C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ConstraintLayout f13779D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ConstraintLayout f13780E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Button f13781F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public MayaAutoCompleteInputLayout f13782G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ForcedAutoCompleteTextView f13783H0;
    public ImageView I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public MayaInputLayout f13784J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C0256f f13785K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public MayaInputLayout f13786L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public AppCompatCheckBox f13787M0;
    public TextView N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public ConstraintLayout f13788O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public View f13789P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public Group f13790Q0;
    public Group R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public RecyclerView f13791S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public LottieAnimationView f13792T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public Button f13793U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public TextView f13794V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public TextView f13795W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public Button f13796X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public M f13797Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public boolean f13798Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public FavoriteDetails f13799a1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f13803e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public double f13804f1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0679c f13805o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C2518b f13806p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public n f13807q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C0446d1 f13808r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BannerAdCarousel f13809s0;
    public boolean t0;
    public a u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public k f13810v0;
    public N0 w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f13811x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public RecyclerView f13812z0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f13800b1 = "";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f13801c1 = "";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public String f13802d1 = "";
    public final InterfaceC1033d g1 = C1034e.b(new e(this, 0));

    public static final void c2(MayaSendMoneyFragment mayaSendMoneyFragment) {
        if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
            mayaSendMoneyFragment.U1(d.a("PREVIEW"), "Preview Screen");
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.PREVIEW);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(SessionDescription.ATTR_TYPE, "theme");
            Decoration decorationR1 = mayaSendMoneyFragment.R1();
            c1219hH.j.put("theme_id", decorationR1 != null ? decorationR1.getMId() : null);
            mayaSendMoneyFragment.A1(c1219hH);
        }
        k kVar = mayaSendMoneyFragment.f13810v0;
        if (kVar != null) {
            Decoration decorationR12 = mayaSendMoneyFragment.R1();
            Amount amountP = ((n) mayaSendMoneyFragment.P1()).p();
            String message = ((n) mayaSendMoneyFragment.P1()).o();
            j.g(message, "message");
            Bundle bundle = new Bundle();
            bundle.putParcelable("decoration", decorationR12);
            bundle.putParcelable("amount", amountP);
            bundle.putString("message", message);
            bundle.putBoolean("show_selection", true);
            MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = new MayaSendMoneyDecorationPreviewFragment();
            mayaSendMoneyDecorationPreviewFragment.setArguments(bundle);
            AbstractC1236z.i((MayaSendMoneyActivity) kVar, R.id.fragment_container_frame_layout, mayaSendMoneyDecorationPreviewFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public static final void d2(MayaSendMoneyFragment mayaSendMoneyFragment) {
        n nVar = (n) mayaSendMoneyFragment.P1();
        MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((c) nVar.c.get());
        mayaSendMoneyFragment2.getClass();
        try {
            AbstractC1955a.l(mayaSendMoneyFragment2).e(b.a()).g(new Gh.e(0, new f(new h(nVar, 4), Eh.d.f1366d), new m(nVar, 3)));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public static final void e2(MayaSendMoneyFragment mayaSendMoneyFragment) {
        boolean z4;
        if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
            mayaSendMoneyFragment.U1("Continue", "Send Money Confirmation Screen");
        } else {
            C1220i c1220iO1 = mayaSendMoneyFragment.o1();
            FragmentActivity activity = mayaSendMoneyFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaSendMoneyFragment.u1());
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.CONTINUE);
            c1220iO1.c(activity, c1219hD);
        }
        C0256f c0256f = mayaSendMoneyFragment.f13785K0;
        if (c0256f != null) {
            c0256f.a();
        }
        n nVar = (n) mayaSendMoneyFragment.P1();
        boolean z5 = false;
        if (C2576A.H(((MayaSendMoneyFragment) ((c) nVar.c.get())).Q1())) {
            ((MayaSendMoneyFragment) ((c) nVar.c.get())).Z1();
            MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = ((MayaSendMoneyFragment) ((c) nVar.c.get())).f13782G0;
            if (mayaAutoCompleteInputLayout == null) {
                j.n("mMayaInputLayoutRecipient");
                throw null;
            }
            mayaAutoCompleteInputLayout.getHelperErrorSpielTextView().setVisibility(0);
            z4 = false;
        } else {
            z4 = true;
        }
        MayaInputLayout mayaInputLayout = ((MayaSendMoneyFragment) ((c) nVar.c.get())).f13784J0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
        if (C2576A.H(C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString())) {
            ((MayaSendMoneyFragment) ((c) nVar.c.get())).Y1();
        } else {
            Double dE = x.e(nVar.n());
            if ((dE != null ? dE.doubleValue() : 0.0d) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) ((c) nVar.c.get());
                String string = mayaSendMoneyFragment2.getString(R.string.pma_toast_error_title_send_money_error);
                String string2 = mayaSendMoneyFragment2.getString(R.string.pma_toast_error_invalid_amount);
                k kVar = mayaSendMoneyFragment2.f13810v0;
                if (kVar != null) {
                    ((MayaSendMoneyActivity) kVar).o(string, string2);
                }
            } else {
                z5 = z4;
            }
        }
        if (z5) {
            boolean zA0 = C.a0(((MayaSendMoneyFragment) ((c) nVar.c.get())).Q1());
            if (nVar.q() && !zA0) {
                MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) ((c) nVar.c.get());
                String string3 = mayaSendMoneyFragment3.getString(R.string.pma_toast_error_title_send_money_error);
                String string4 = mayaSendMoneyFragment3.getString(R.string.pma_dialog_error_enter_a_valid_account_number);
                k kVar2 = mayaSendMoneyFragment3.f13810v0;
                if (kVar2 != null) {
                    ((MayaSendMoneyActivity) kVar2).o(string3, string4);
                    return;
                }
                return;
            }
            ((MayaBaseFragment) ((c) nVar.c.get())).E1();
            if (zA0) {
                TransferRecipient transferRecipientK = nVar.k();
                Amount amountP = nVar.p();
                String strO = nVar.o();
                Decoration decorationR1 = ((MayaSendMoneyFragment) ((c) nVar.c.get())).R1();
                new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(nVar.h.a(transferRecipientK, amountP, strO, decorationR1 != null ? decorationR1.getMId() : null, null), b.a(), 0), new h(nVar, 0), 2), new i(nVar, 0), 0), new g(nVar, 2)), new Bb.j(nVar, 0), 1).e();
                return;
            }
            TransferRecipient transferRecipientK2 = nVar.k();
            Amount amountP2 = nVar.p();
            String strO2 = nVar.o();
            Decoration decorationR12 = ((MayaSendMoneyFragment) ((c) nVar.c.get())).R1();
            new Lh.d(new T(5, new Lh.d(new Lh.d(new Lh.h(nVar.h.a(transferRecipientK2, amountP2, strO2, decorationR12 != null ? decorationR12.getMId() : null, Boolean.valueOf(S5.c.b(nVar.f416k, A5.b.f141v1))), b.a(), 0), new Bb.k(nVar, 0), 2), new l(nVar, 0), 0), new g(nVar, 0)), new m(nVar, 0), 1).e();
        }
    }

    public static final void f2(ForcedAutoCompleteTextView forcedAutoCompleteTextView, MayaSendMoneyFragment mayaSendMoneyFragment, View view, int i) {
        String str;
        String str2;
        j.g(view, "<unused var>");
        forcedAutoCompleteTextView.setSelection(0);
        C.R(mayaSendMoneyFragment.getActivity());
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = mayaSendMoneyFragment.f13782G0;
        if (mayaAutoCompleteInputLayout == null) {
            j.n("mMayaInputLayoutRecipient");
            throw null;
        }
        mayaAutoCompleteInputLayout.clearFocus();
        C0679c c0679c = mayaSendMoneyFragment.f13805o0;
        if (c0679c == null) {
            j.n("mMayaRecipientAdapter");
            throw null;
        }
        Cursor cursor = (Cursor) c0679c.getItem(i);
        str = "";
        if (cursor != null) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("display_name"));
            if (string == null) {
                string = "";
            }
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("data1"));
            str2 = string2 != null ? string2 : "";
            str = string;
        } else {
            str2 = "";
        }
        Contact contactBuild = Contact.sBuilder().mName(str).mNumber(str2).build();
        j.f(contactBuild, "build(...)");
        n nVar = (n) mayaSendMoneyFragment.P1();
        c cVar = (c) nVar.c.get();
        String strMName = contactBuild.mName();
        j.f(strMName, "mName(...)");
        MayaSendMoneyFragment mayaSendMoneyFragment2 = (MayaSendMoneyFragment) cVar;
        mayaSendMoneyFragment2.getClass();
        mayaSendMoneyFragment2.f13800b1 = strMName;
        c cVar2 = (c) nVar.c.get();
        String strMNumber = contactBuild.mNumber();
        j.f(strMNumber, "mNumber(...)");
        MayaSendMoneyFragment mayaSendMoneyFragment3 = (MayaSendMoneyFragment) cVar2;
        mayaSendMoneyFragment3.getClass();
        mayaSendMoneyFragment3.f13801c1 = strMNumber;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_send_money, viewGroup, false);
        int i = R.id.barrier_favorites_section_bottom;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_favorites_section_bottom)) != null) {
            i = R.id.button_continue;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
            if (button != null) {
                i = R.id.checkbox_include_signature;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.checkbox_include_signature);
                if (appCompatCheckBox != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.guideline_left;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_left)) != null) {
                        i = R.id.guideline_right;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_right)) != null) {
                            i = R.id.layout_decoration_personalization;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_decoration_personalization);
                            if (viewFindChildViewById != null) {
                                int i4 = R.id.button_change_gif;
                                Button button2 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_change_gif);
                                if (button2 != null) {
                                    i4 = R.id.button_select_gif;
                                    Button button3 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_select_gif);
                                    if (button3 != null) {
                                        i4 = R.id.button_show_gif_preview;
                                        Button button4 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_show_gif_preview);
                                        if (button4 != null) {
                                            i4 = R.id.button_show_theme_preview;
                                            Button button5 = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_show_theme_preview);
                                            if (button5 != null) {
                                                i4 = R.id.constraint_group_gif_call_to_actions;
                                                Group group = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_gif_call_to_actions);
                                                if (group != null) {
                                                    i4 = R.id.constraint_group_gif_empty;
                                                    Group group2 = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_gif_empty);
                                                    if (group2 != null) {
                                                        i4 = R.id.constraint_group_gif_preview_failed;
                                                        Group group3 = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_gif_preview_failed);
                                                        if (group3 != null) {
                                                            i4 = R.id.constraint_group_theme_design_selection;
                                                            Group group4 = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_theme_design_selection);
                                                            if (group4 != null) {
                                                                i4 = R.id.constraint_group_theme_preview_failed;
                                                                Group group5 = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_theme_preview_failed);
                                                                if (group5 != null) {
                                                                    i4 = R.id.constraint_layout_gif_decoration_page;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_gif_decoration_page);
                                                                    if (constraintLayout2 != null) {
                                                                        i4 = R.id.constraint_layout_theme_decoration_page;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_theme_decoration_page);
                                                                        if (constraintLayout3 != null) {
                                                                            i4 = R.id.guideline_gif_preview_display_divider;
                                                                            if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_gif_preview_display_divider)) != null) {
                                                                                i4 = R.id.image_button_remove_gif;
                                                                                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_button_remove_gif);
                                                                                if (appCompatImageButton != null) {
                                                                                    i4 = R.id.image_view_gif_preview_display;
                                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_gif_preview_display);
                                                                                    if (imageView != null) {
                                                                                        i4 = R.id.lottie_animation_view_gif_loading_shimmer;
                                                                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_view_gif_loading_shimmer);
                                                                                        if (lottieAnimationView != null) {
                                                                                            i4 = R.id.lottie_animation_view_theme_loading_shimmer;
                                                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_view_theme_loading_shimmer);
                                                                                            if (lottieAnimationView2 != null) {
                                                                                                i4 = R.id.recycler_view_themes_design_selection;
                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.recycler_view_themes_design_selection);
                                                                                                if (recyclerView != null) {
                                                                                                    i4 = R.id.tab_layout_decoration_mode_tabs;
                                                                                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.tab_layout_decoration_mode_tabs);
                                                                                                    if (tabLayout != null) {
                                                                                                        i4 = R.id.text_view_clear_theme;
                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_clear_theme);
                                                                                                        if (textView != null) {
                                                                                                            i4 = R.id.text_view_gif_preview_failed_label;
                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_gif_preview_failed_label)) != null) {
                                                                                                                i4 = R.id.text_view_gif_tap_to_retry;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_gif_tap_to_retry)) != null) {
                                                                                                                    i4 = R.id.text_view_personalization_section_header;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_personalization_section_header)) != null) {
                                                                                                                        i4 = R.id.text_view_powered_by_giphy_label;
                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_powered_by_giphy_label)) != null) {
                                                                                                                            i4 = R.id.text_view_theme_preview_failed_label;
                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_theme_preview_failed_label)) != null) {
                                                                                                                                i4 = R.id.text_view_theme_tap_to_retry;
                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_theme_tap_to_retry);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i4 = R.id.view_gif_preview_area;
                                                                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_gif_preview_area);
                                                                                                                                    if (viewFindChildViewById2 != null) {
                                                                                                                                        i4 = R.id.view_gif_retry_background;
                                                                                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_gif_retry_background);
                                                                                                                                        if (viewFindChildViewById3 != null) {
                                                                                                                                            i4 = R.id.view_theme_retry_background;
                                                                                                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_theme_retry_background);
                                                                                                                                            if (viewFindChildViewById4 != null) {
                                                                                                                                                I i6 = new I((ConstraintLayout) viewFindChildViewById, button2, button3, button4, button5, group, group2, group3, group4, group5, constraintLayout2, constraintLayout3, appCompatImageButton, imageView, lottieAnimationView, lottieAnimationView2, recyclerView, tabLayout, textView, textView2, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
                                                                                                                                                i = R.id.layout_favorites_error_card;
                                                                                                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.layout_favorites_error_card);
                                                                                                                                                if (viewFindChildViewById5 != null) {
                                                                                                                                                    C0489y c0489yA = C0489y.a(viewFindChildViewById5);
                                                                                                                                                    i = R.id.layout_favorites_loading_card;
                                                                                                                                                    View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.layout_favorites_loading_card);
                                                                                                                                                    if (viewFindChildViewById6 != null) {
                                                                                                                                                        G0 g0C = G0.c(viewFindChildViewById6);
                                                                                                                                                        i = R.id.layout_favorites_maintenance_card;
                                                                                                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.layout_favorites_maintenance_card);
                                                                                                                                                        if (viewFindChildViewById7 != null) {
                                                                                                                                                            G0 g0B = G0.b(viewFindChildViewById7);
                                                                                                                                                            i = R.id.maya_input_layout_amount_field;
                                                                                                                                                            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_amount_field);
                                                                                                                                                            if (mayaInputLayout != null) {
                                                                                                                                                                i = R.id.maya_input_layout_optional_note_field;
                                                                                                                                                                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_optional_note_field);
                                                                                                                                                                if (mayaInputLayout2 != null) {
                                                                                                                                                                    i = R.id.maya_input_layout_recipient_field;
                                                                                                                                                                    MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_recipient_field);
                                                                                                                                                                    if (mayaAutoCompleteInputLayout != null) {
                                                                                                                                                                        i = R.id.nested_scroll_view_contents;
                                                                                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nested_scroll_view_contents);
                                                                                                                                                                        if (nestedScrollView != null) {
                                                                                                                                                                            i = R.id.recycler_view_send_money_favorites;
                                                                                                                                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_send_money_favorites);
                                                                                                                                                                            if (recyclerView2 != null) {
                                                                                                                                                                                i = R.id.text_view_empty_favorites_message;
                                                                                                                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_empty_favorites_message);
                                                                                                                                                                                if (appCompatTextView != null) {
                                                                                                                                                                                    i = R.id.text_view_favorites_see_all;
                                                                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorites_see_all);
                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                        i = R.id.text_view_include_signature_prefix;
                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_include_signature_prefix)) != null) {
                                                                                                                                                                                            i = R.id.text_view_included_signature_name;
                                                                                                                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_included_signature_name);
                                                                                                                                                                                            if (textView4 != null) {
                                                                                                                                                                                                i = R.id.text_view_my_favorites_title;
                                                                                                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_my_favorites_title);
                                                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                                                    i = R.id.text_view_title_header;
                                                                                                                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                                                                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                                                                        i = R.id.view_ad_banner;
                                                                                                                                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.view_ad_banner);
                                                                                                                                                                                                        if (viewFindChildViewById8 != null) {
                                                                                                                                                                                                            this.w0 = new N0(constraintLayout, button, appCompatCheckBox, i6, c0489yA, g0C, g0B, mayaInputLayout, mayaInputLayout2, mayaAutoCompleteInputLayout, nestedScrollView, recyclerView2, appCompatTextView, textView3, textView4, textView5, textView6, C0446d1.a(viewFindChildViewById8));
                                                                                                                                                                                                            j.f(constraintLayout, "getRoot(...)");
                                                                                                                                                                                                            return constraintLayout;
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
                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final Ab.b P1() {
        n nVar = this.f13807q0;
        if (nVar != null) {
            return nVar;
        }
        j.n("mIMayaSendMoneyFragmentPresenter");
        throw null;
    }

    public final String Q1() {
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = this.f13783H0;
        if (forcedAutoCompleteTextView == null) {
            j.n("mAutoCompleteTextViewRecipient");
            throw null;
        }
        String string = forcedAutoCompleteTextView.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = j.i(string.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                }
                length--;
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        return string.subSequence(i, length + 1).toString();
    }

    public final Decoration R1() {
        k kVar = this.f13810v0;
        if (kVar != null) {
            return ((MayaSendMoneyActivity) kVar).f13743t;
        }
        return null;
    }

    public final void S1() {
        Button button = this.f13793U0;
        if (button == null) {
            j.n("mButtonShowThemePreview");
            throw null;
        }
        button.setVisibility(8);
        TextView textView = this.f13794V0;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            j.n("mTextViewClearTheme");
            throw null;
        }
    }

    public final boolean T1() {
        AppCompatCheckBox appCompatCheckBox = this.f13787M0;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox.isChecked();
        }
        j.n("mCheckboxIncludeSignature");
        throw null;
    }

    public final void U1(String str, String str2) {
        k kVar = this.f13810v0;
        String str3 = kVar != null ? ((MayaSendMoneyActivity) kVar).f13744u : null;
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("SEND_MONEY_SCREEN_" + EnumC1212a.BUTTON + Global.UNDERSCORE + AbstractC1173g.G(18));
        HashMap map = c1219hE.j;
        map.put("source_page", str3);
        map.put("button", str);
        map.put("destination_page", str2);
        map.put("has_signature", String.valueOf(T1()));
        c1220iO1.b(c1219hE);
    }

    public final void V1(String str, String str2, boolean z4) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        k kVar = this.f13810v0;
        Boolean boolValueOf3 = null;
        String str3 = kVar != null ? ((MayaSendMoneyActivity) kVar).f13744u : null;
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("SEND_MONEY_SCREEN_".concat(AbstractC1173g.G(40)));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", str3);
        map.put("input_label", str);
        map.put("is_invalid", String.valueOf(z4));
        map.put("invalid_reason", str2);
        map.put("is_disabled", "false");
        MayaInputLayout mayaInputLayout = this.f13784J0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
        Editable text = mayaInputLayout.getInputEditText().getText();
        if (text != null) {
            boolValueOf = Boolean.valueOf(text.length() > 0);
        } else {
            boolValueOf = null;
        }
        map.put("is_amount_filled", String.valueOf(boolValueOf));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = this.f13782G0;
        if (mayaAutoCompleteInputLayout == null) {
            j.n("mMayaInputLayoutRecipient");
            throw null;
        }
        Editable text2 = mayaAutoCompleteInputLayout.getInputAutoCompleteEditText().getText();
        if (text2 != null) {
            boolValueOf2 = Boolean.valueOf(text2.length() > 0);
        } else {
            boolValueOf2 = null;
        }
        map.put("is_recipient_filled", String.valueOf(boolValueOf2));
        MayaInputLayout mayaInputLayout2 = this.f13786L0;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutOptionalNote");
            throw null;
        }
        Editable text3 = mayaInputLayout2.getInputEditText().getText();
        if (text3 != null) {
            boolValueOf3 = Boolean.valueOf(text3.length() > 0);
        }
        map.put("is_note_filled", String.valueOf(boolValueOf3));
        c1220iO1.b(c1219hE);
    }

    public final void W1(int i) {
        if (t1().e().isAppEventV2SendMoneyEnabled()) {
            k kVar = this.f13810v0;
            String str = kVar != null ? ((MayaSendMoneyActivity) kVar).f13744u : null;
            C1220i c1220iO1 = o1();
            C1219h c1219hE = C1219h.e("SEND_MONEY_SCREEN_".concat(AbstractC1173g.G(2)));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("source_page", str);
            map.put("has_favorites", String.valueOf(i > 0));
            map.put("number_of_favorites", String.valueOf(i));
            c1220iO1.b(c1219hE);
        }
    }

    public final void X1(double d10) {
        MayaInputLayout mayaInputLayout = this.f13784J0;
        if (mayaInputLayout != null) {
            mayaInputLayout.getInputEditText().setText(getString(R.string.maya_format_currency_with_amount_display, (String) this.g1.getValue(), Double.valueOf(d10)));
        } else {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
    }

    public final void Y1() {
        MayaInputLayout mayaInputLayout = this.f13784J0;
        if (mayaInputLayout != null) {
            mayaInputLayout.setHelperErrorText(getString(R.string.maya_format_error_no_amount, C.u(Double.valueOf(this.f13804f1))));
        } else {
            j.n("mMayaInputLayoutAmount");
            throw null;
        }
    }

    public final void Z1() {
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = this.f13782G0;
        if (mayaAutoCompleteInputLayout != null) {
            mayaAutoCompleteInputLayout.getHelperErrorSpielTextView().setText(getString(R.string.maya_format_missing_field_is_required, getString(R.string.maya_label_recipient)));
        } else {
            j.n("mMayaInputLayoutRecipient");
            throw null;
        }
    }

    public final void a2(String contactName, String contactNumber) {
        j.g(contactName, "contactName");
        j.g(contactNumber, "contactNumber");
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = this.f13783H0;
        if (forcedAutoCompleteTextView != null) {
            forcedAutoCompleteTextView.setText(getString(R.string.maya_format_selected_contacts_name_and_number, contactName, contactNumber));
        } else {
            j.n("mAutoCompleteTextViewRecipient");
            throw null;
        }
    }

    public final void b2() {
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.mayaDrawable_CommonInformationPrimaryBadge, typedValue, true);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), typedValue.resourceId);
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = this.f13782G0;
        if (mayaAutoCompleteInputLayout != null) {
            mayaAutoCompleteInputLayout.getHelperInfoIconImageView().setImageDrawable(drawable);
        } else {
            j.n("mMayaInputLayoutRecipient");
            throw null;
        }
    }

    @Override // yb.InterfaceC2517a
    public final void e(Decoration decoration) {
        if (t1().e().isAppEventV2SendMoneyEnabled()) {
            EnumC1217f enumC1217f = EnumC1217f.ACCEPT_CONFIRM_CREDENTIAL;
            U1(d.a("THEME"), "Send Money Form Screen");
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.THEME);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("theme_id", decoration != null ? decoration.getMId() : null);
            A1(c1219hH);
        }
        ((n) P1()).r(decoration);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().x().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f13805o0 = new C0679c((Context) aVar.f4709d.get(), (com.paymaya.data.preference.a) aVar.e.get(), (com.paymaya.data.database.repository.k) aVar.f4732o0.get());
        this.f13807q0 = new n((com.paymaya.data.preference.a) aVar.e.get(), aVar.X(), aVar.a(), aVar.k(), aVar.T(), aVar.o(), aVar.q(), (S5.c) aVar.f4724k.get(), (Uh.d) aVar.f4748y.get());
        this.f10338R = true;
        this.f13810v0 = (k) getActivity();
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BannerAdCarousel bannerAdCarousel = this.f13809s0;
        if (bannerAdCarousel == null) {
            j.n("mViewBannerAdCarousel");
            throw null;
        }
        bannerAdCarousel.c();
        yk.a.a();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 3;
        int i4 = 0;
        super.onResume();
        k kVar = this.f13810v0;
        if (kVar != null) {
            ((MayaSendMoneyActivity) kVar).Q(this);
        }
        ((n) P1()).v();
        n nVar = (n) P1();
        ((MayaSendMoneyFragment) ((c) nVar.c.get())).O1();
        new T(5, new Lh.d(new Lh.h(nVar.f.a(), b.a(), 0), new h(nVar, i), i4), new g(nVar, 1)).e();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("attribution", n1().f10371a);
        A1(c1219h);
        ((n) P1()).z();
        n nVar2 = (n) P1();
        if (S5.c.b(nVar2.f416k, A5.b.f138u1)) {
            MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) ((c) nVar2.c.get());
            if (mayaSendMoneyFragment.f13797Y0 == null) {
                M m = new M(mayaSendMoneyFragment, s5.f.h);
                F f = new F(3);
                C1847a c1847a = (C1847a) m.f11371b;
                c1847a.f17717d = f;
                c1847a.e = new F(4);
                c1847a.f = new C0165x(12);
                mayaSendMoneyFragment.f13797Y0 = m;
            }
            M m2 = mayaSendMoneyFragment.f13797Y0;
            if (m2 != null) {
                m2.j();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        N0 n02 = this.w0;
        j.d(n02);
        this.f13811x0 = n02.f;
        this.y0 = n02.e;
        this.f13776A0 = n02.c;
        this.f13777B0 = (AppCompatTextView) n02.f3804q;
        this.f13812z0 = (RecyclerView) n02.f3803p;
        this.f13778C0 = ((G0) n02.f3799k).f3627b;
        this.f13779D0 = ((G0) n02.f3800l).f3627b;
        C0489y c0489y = (C0489y) n02.j;
        this.f13780E0 = c0489y.f4296b;
        this.f13781F0 = c0489y.c;
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) n02.f3802o;
        this.f13783H0 = mayaAutoCompleteInputLayout.getInputAutoCompleteEditText();
        this.I0 = mayaAutoCompleteInputLayout.getPrimaryIconImageView();
        this.f13782G0 = mayaAutoCompleteInputLayout;
        this.f13784J0 = (MayaInputLayout) n02.m;
        this.f13786L0 = (MayaInputLayout) n02.f3801n;
        this.f13787M0 = (AppCompatCheckBox) n02.h;
        this.N0 = n02.f3797d;
        I i = (I) n02.i;
        this.f13788O0 = (ConstraintLayout) i.e;
        this.f13789P0 = (View) i.f3649k;
        this.f13790Q0 = (Group) i.h;
        this.R0 = (Group) i.f3647d;
        this.f13791S0 = (RecyclerView) i.f3648g;
        this.f13793U0 = (Button) i.f;
        this.f13792T0 = (LottieAnimationView) i.i;
        this.f13795W0 = (TextView) i.c;
        N0 n03 = this.w0;
        j.d(n03);
        C0446d1 c0446d1 = (C0446d1) n03.f3805r;
        this.f13808r0 = c0446d1;
        this.f13809s0 = c0446d1.c;
        this.f13794V0 = i.f3646b;
        this.f13796X0 = (Button) n02.f3798g;
        Button button = this.f13793U0;
        if (button == null) {
            j.n("mButtonShowThemePreview");
            throw null;
        }
        button.setVisibility(4);
        TextView textView = this.f13794V0;
        if (textView == null) {
            j.n("mTextViewClearTheme");
            throw null;
        }
        textView.setVisibility(4);
        TextView textView2 = this.f13776A0;
        if (textView2 == null) {
            j.n("mTextViewFavoritesSeeAll");
            throw null;
        }
        final int i4 = 3;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b = mayaSendMoneyFragment.f13806p0;
                            if (c2518b == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13781F0;
        if (button2 == null) {
            j.n("mButtonFavoritesErrorRetry");
            throw null;
        }
        final int i6 = 4;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b = mayaSendMoneyFragment.f13806p0;
                            if (c2518b == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = this.f13782G0;
        if (mayaAutoCompleteInputLayout2 == null) {
            j.n("mMayaInputLayoutRecipient");
            throw null;
        }
        final int i10 = 5;
        mayaAutoCompleteInputLayout2.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b = mayaSendMoneyFragment.f13806p0;
                            if (c2518b == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button3 = this.f13796X0;
        if (button3 == null) {
            j.n("mButtonContinue");
            throw null;
        }
        final int i11 = 6;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b = mayaSendMoneyFragment.f13806p0;
                            if (c2518b == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        ForcedAutoCompleteTextView forcedAutoCompleteTextView = this.f13783H0;
        if (forcedAutoCompleteTextView == null) {
            j.n("mAutoCompleteTextViewRecipient");
            throw null;
        }
        forcedAutoCompleteTextView.addTextChangedListener(new A((Function0) null, new e(this, 2), new e(this, 3), 9));
        ForcedAutoCompleteTextView forcedAutoCompleteTextView2 = this.f13783H0;
        if (forcedAutoCompleteTextView2 == null) {
            j.n("mAutoCompleteTextViewRecipient");
            throw null;
        }
        forcedAutoCompleteTextView2.addTextChangedListener(new G5.F(this, 2));
        getParentFragmentManager().setFragmentResultListener("key_contact_request", this, new t(this, 3));
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout3 = this.f13782G0;
        if (mayaAutoCompleteInputLayout3 == null) {
            j.n("mMayaInputLayoutRecipient");
            throw null;
        }
        final int i12 = 0;
        mayaAutoCompleteInputLayout3.getInputAutoCompleteEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1952b;

            {
                this.f1952b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i12) {
                    case 0:
                        if (z4) {
                            return;
                        }
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1952b;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout4 = mayaSendMoneyFragment.f13782G0;
                        if (mayaAutoCompleteInputLayout4 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                            throw null;
                        }
                        Editable text = mayaAutoCompleteInputLayout4.getInputAutoCompleteEditText().getText();
                        boolean z5 = true;
                        if (text != null && text.length() != 0) {
                            z5 = false;
                        }
                        mayaSendMoneyFragment.V1("recipient", null, z5);
                        return;
                    default:
                        if (z4) {
                            return;
                        }
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1952b;
                        MayaInputLayout mayaInputLayout = mayaSendMoneyFragment2.f13786L0;
                        if (mayaInputLayout != null) {
                            mayaSendMoneyFragment2.V1("note", null, mayaInputLayout.f12073w);
                            return;
                        } else {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutOptionalNote");
                            throw null;
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout = this.f13786L0;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutOptionalNote");
            throw null;
        }
        final int i13 = 1;
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: Gb.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1952b;

            {
                this.f1952b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i13) {
                    case 0:
                        if (z4) {
                            return;
                        }
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1952b;
                        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout4 = mayaSendMoneyFragment.f13782G0;
                        if (mayaAutoCompleteInputLayout4 == null) {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                            throw null;
                        }
                        Editable text = mayaAutoCompleteInputLayout4.getInputAutoCompleteEditText().getText();
                        boolean z5 = true;
                        if (text != null && text.length() != 0) {
                            z5 = false;
                        }
                        mayaSendMoneyFragment.V1("recipient", null, z5);
                        return;
                    default:
                        if (z4) {
                            return;
                        }
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1952b;
                        MayaInputLayout mayaInputLayout2 = mayaSendMoneyFragment2.f13786L0;
                        if (mayaInputLayout2 != null) {
                            mayaSendMoneyFragment2.V1("note", null, mayaInputLayout2.f12073w);
                            return;
                        } else {
                            kotlin.jvm.internal.j.n("mMayaInputLayoutOptionalNote");
                            throw null;
                        }
                }
            }
        });
        TextView textView3 = this.f13794V0;
        if (textView3 == null) {
            j.n("mTextViewClearTheme");
            throw null;
        }
        final int i14 = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b = mayaSendMoneyFragment.f13806p0;
                            if (c2518b == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        this.u0 = new a(this);
        RecyclerView recyclerView = this.f13812z0;
        if (recyclerView == null) {
            j.n("mRecyclerViewFavorites");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        a aVar = this.u0;
        if (aVar == null) {
            j.n("mMayaSendMoneyFavoriteAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        Context context = recyclerView.getContext();
        j.f(context, "getContext(...)");
        recyclerView.addItemDecoration(new Rc.d(context, R.dimen.maya_padding_large, R.dimen.maya_padding_small));
        new LinearSnapHelper().attachToRecyclerView(recyclerView);
        this.f13806p0 = new C2518b(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_padding_large);
        RecyclerView recyclerView2 = this.f13791S0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewThemeDesignSelection");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
        C2518b c2518b = this.f13806p0;
        if (c2518b == null) {
            j.n("mMayaSendMoneyDecorationAdapter");
            throw null;
        }
        recyclerView2.setAdapter(c2518b);
        recyclerView2.addItemDecoration(new r(dimensionPixelSize / 2, dimensionPixelSize, dimensionPixelSize));
        recyclerView2.setItemAnimator(null);
        Button button4 = this.f13793U0;
        if (button4 == null) {
            j.n("mButtonShowThemePreview");
            throw null;
        }
        final int i15 = 1;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b2 = mayaSendMoneyFragment.f13806p0;
                            if (c2518b2 == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b2.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView4 = this.f13795W0;
        if (textView4 == null) {
            j.n("mTextViewThemeRetry");
            throw null;
        }
        final int i16 = 2;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyFragment f1946b;

            {
                this.f1946b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        MayaSendMoneyFragment mayaSendMoneyFragment = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment.U1("Clear", "Send Money Form Screen");
                            }
                            mayaSendMoneyFragment.S1();
                            C2518b c2518b2 = mayaSendMoneyFragment.f13806p0;
                            if (c2518b2 == null) {
                                kotlin.jvm.internal.j.n("mMayaSendMoneyDecorationAdapter");
                                throw null;
                            }
                            c2518b2.e(null);
                            ((Bb.n) mayaSendMoneyFragment.P1()).r(null);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    case 1:
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.c2(mayaSendMoneyFragment2);
                            return;
                        } finally {
                        }
                    case 2:
                        MayaSendMoneyFragment mayaSendMoneyFragment3 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment3.P1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaSendMoneyFragment mayaSendMoneyFragment4 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSendMoneyFragment4.t1().e().isAppEventV2SendMoneyEnabled()) {
                                mayaSendMoneyFragment4.U1("See all", "Send Money Favorite Screen");
                            }
                            k kVar = mayaSendMoneyFragment4.f13810v0;
                            if (kVar != null) {
                                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) kVar;
                                mayaSendMoneyActivity.n1();
                                B5.i.p(mayaSendMoneyActivity, "moneysend");
                            }
                            return;
                        } finally {
                        }
                    case 4:
                        MayaSendMoneyFragment mayaSendMoneyFragment5 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            ((Bb.n) mayaSendMoneyFragment5.P1()).v();
                            return;
                        } finally {
                        }
                    case 5:
                        MayaSendMoneyFragment mayaSendMoneyFragment6 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.d2(mayaSendMoneyFragment6);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyFragment mayaSendMoneyFragment7 = this.f1946b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyFragment.e2(mayaSendMoneyFragment7);
                            return;
                        } finally {
                        }
                }
            }
        });
        ((n) P1()).j();
        TextView textView5 = this.f13811x0;
        if (textView5 != null) {
            textView5.setVisibility(8);
        } else {
            j.n("mTextViewTitleHeader");
            throw null;
        }
    }
}
