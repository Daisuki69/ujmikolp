package com.paymaya.mayaui.regv2.view.bottomsheet.impl;

import M7.a;
import M8.M1;
import M8.T2;
import N5.C0447e;
import S5.c;
import Y6.o;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import androidx.work.impl.e;
import bb.InterfaceC0937a;
import cb.b;
import cj.L;
import com.google.firebase.messaging.n;
import com.paymaya.PayMayaApplication;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.i0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.regv2.view.bottomsheet.impl.MayaProminentDisclosureBottomSheetDialogFragment;
import com.shield.android.Shield;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaProminentDisclosureBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements InterfaceC0937a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f13672S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C1229s f13673T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f13674U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public b f13675V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f13676W;

    public static final void s1(MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment) {
        String strA;
        a aVar = mayaProminentDisclosureBottomSheetDialogFragment.f13674U;
        if (aVar == null) {
            j.n("mMayaProminentDisclosureBottomSheetDialogFragmentPresenter");
            throw null;
        }
        androidx.camera.core.impl.a.A(aVar.e.f11330b, "key_is_disclosure_agreed", true);
        if (c.b(aVar.f, A5.b.f60F1)) {
            ((MayaProminentDisclosureBottomSheetDialogFragment) ((InterfaceC0937a) aVar.c.get())).getClass();
            yk.a.a();
            i0.c = true;
        }
        MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment2 = (MayaProminentDisclosureBottomSheetDialogFragment) ((InterfaceC0937a) aVar.c.get());
        FragmentActivity fragmentActivityRequireActivity = mayaProminentDisclosureBottomSheetDialogFragment2.requireActivity();
        synchronized (i0.class) {
            if (i0.c) {
                yk.a.a();
            } else {
                yk.a.a();
                if (!i0.f11214a) {
                    ((PayMayaApplication) fragmentActivityRequireActivity.getApplicationContext()).getClass();
                    try {
                        strA = PayMayaApplication.a(PayMayaApplication.getEncryptedShield());
                    } catch (Exception unused) {
                        yk.a.e();
                        strA = "";
                    }
                    Shield.setSingletonInstance(new Shield.Builder((Activity) fragmentActivityRequireActivity, "940c5ecf154a2dd669454fc022ed18283a8196d9", strA).setLogLevel(Shield.LogLevel.NONE).setEnvironment(i0.c()).build());
                    Shield.getInstance().setDeviceResultStateListener(new n(12));
                    i0.f11214a = true;
                }
            }
        }
        b bVar = mayaProminentDisclosureBottomSheetDialogFragment2.f13675V;
        if (bVar != null) {
            bVar.p0();
        }
        b bVar2 = mayaProminentDisclosureBottomSheetDialogFragment2.f13675V;
        if (bVar2 != null) {
            bVar2.m(new M1(1, mayaProminentDisclosureBottomSheetDialogFragment2, MayaProminentDisclosureBottomSheetDialogFragment.class, "sendTappedAnalyticsEvent", "sendTappedAnalyticsEvent(Ljava/lang/String;)V", 0, 29));
        }
        mayaProminentDisclosureBottomSheetDialogFragment2.dismiss();
        Dialog dialog = mayaProminentDisclosureBottomSheetDialogFragment.getDialog();
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        j.g(dialog, "dialog");
        super.onCancel(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1219h c1219hE = C1219h.e(AbstractC1213b.h(10));
        c1219hE.i();
        this.f10326K = c1219hE;
        this.f10327P = true;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        O5.a aVar = W4.a.e().w().f4755a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f13673T = (C1229s) aVar.f4684R.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f13674U = new a(preference, flagConfigurationService, 3);
        this.f13675V = (b) getActivity();
        a aVar2 = this.f13674U;
        if (aVar2 != null) {
            aVar2.h(this);
        } else {
            j.n("mMayaProminentDisclosureBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new Fa.c(this, 28));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_prominent_disclosure, viewGroup, false);
        int i = R.id.additional_information_section_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.additional_information_section_text_view);
        if (textView != null) {
            i = R.id.agree_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.agree_button);
            if (button != null) {
                i = R.id.closing_information_section_1_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.closing_information_section_1_text_view)) != null) {
                    i = R.id.closing_information_section_2_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.closing_information_section_2_text_view)) != null) {
                        i = R.id.closing_information_section_3_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.closing_information_section_3_text_view)) != null) {
                            i = R.id.closing_information_title_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.closing_information_title_text_view)) != null) {
                                i = R.id.data_privacy_section_1_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.data_privacy_section_1_text_view)) != null) {
                                    i = R.id.data_privacy_section_2_text_view;
                                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.data_privacy_section_2_text_view);
                                    if (htmlTextView != null) {
                                        i = R.id.data_privacy_section_header_text_view;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.data_privacy_section_header_text_view)) != null) {
                                            i = R.id.data_privacy_subtitle_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.data_privacy_subtitle_text_view)) != null) {
                                                i = R.id.data_privacy_title_text_view;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.data_privacy_title_text_view)) != null) {
                                                    i = R.id.installed_application_section_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.installed_application_section_text_view)) != null) {
                                                        i = R.id.installed_application_title_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.installed_application_title_text_view)) != null) {
                                                            i = R.id.key_highlights_section_1_text_view;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.key_highlights_section_1_text_view)) != null) {
                                                                i = R.id.key_highlights_title_text_view;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.key_highlights_title_text_view)) != null) {
                                                                    i = R.id.scroll_view_content;
                                                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content);
                                                                    if (scrollView != null) {
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                        this.f13672S = new C0447e(constraintLayout, textView, (View) button, (TextView) htmlTextView, (View) scrollView, 2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13672S;
        j.d(c0447e);
        ((TextView) c0447e.f).setText(T2.i(2, 0, 0, (CharSequence[]) Arrays.copyOf(new CharSequence[]{getText(R.string.maya_label_prominent_disclosure_bullet_device_attributes), getText(R.string.maya_label_prominent_disclosure_bullet_device_identifiers), getText(R.string.maya_label_prominent_disclosure_bullet_device_signals), getText(R.string.maya_label_prominent_disclosure_bullet_device_network_connections), getText(R.string.maya_label_prominent_disclosure_bullet_device_settings)}, 5)));
        C0447e c0447e2 = this.f13672S;
        j.d(c0447e2);
        ((HtmlTextView) c0447e2.f4080d).setOnLinkClickListener(new e(this, 6));
        C0447e c0447e3 = this.f13672S;
        j.d(c0447e3);
        ((Button) c0447e3.c).setOnClickListener(new o(this, 11));
        C0447e c0447e4 = this.f13672S;
        j.d(c0447e4);
        final ScrollView scrollView = (ScrollView) c0447e4.e;
        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: cb.a
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i4, int i6, int i10) {
                View childAt = scrollView.getChildAt(0);
                if (childAt != null && view2.getHeight() + i4 >= childAt.getHeight()) {
                    MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment = this;
                    if (mayaProminentDisclosureBottomSheetDialogFragment.f13676W) {
                        return;
                    }
                    mayaProminentDisclosureBottomSheetDialogFragment.f13676W = true;
                    C1220i c1220iN1 = mayaProminentDisclosureBottomSheetDialogFragment.n1();
                    C1219h c1219hE = C1219h.e("REGV2_DISCLOSURE_SCROLLED");
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    HashMap map = c1219hE.j;
                    map.put("screen_name", "Prominent Disclosure (Bottom sheet)");
                    map.put("scroll", "Prominent Disclosure");
                    c1219hE.i();
                    c1220iN1.b(c1219hE);
                }
            }
        });
        C1229s c1229s = this.f13673T;
        if (c1229s == null) {
            j.n("mAuthAnalyticsUtils");
            throw null;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        String strV = AbstractC1213b.v(10);
        j.f(strV, "viewed(...)");
        C1229s.d(c1229s, fragmentActivityRequireActivity, strV, "Initialize", null, null, null, L.c(new Pair(EnumC1212a.SCREEN_NAME, "Prominent Disclosure (Bottom sheet)")), 56);
    }
}
