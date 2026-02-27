package com.paymaya.mayaui.settings.view.fragment.impl;

import Ee.a;
import G5.t;
import Lh.c;
import M8.W2;
import N5.C0491z;
import Rb.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.SettingsDisplayName;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNameGuideBottomSheetDialogFragment;
import kotlin.jvm.internal.j;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDisplayNameFragment extends MayaBaseFragment implements i, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f13976U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AppCompatTextView f13977V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SwitchCompat f13978W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HtmlTextView f13979X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f13980Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Sb.t f13981Z;

    public final a G1() {
        a aVar = this.f13980Y;
        if (aVar != null) {
            return aVar;
        }
        j.n("mDisplayNameFragmentPresenter");
        throw null;
    }

    @Override // G5.t
    public final void m(String link, View view) {
        j.g(link, "link");
        j.g(view, "view");
        Sb.t tVar = this.f13981Z;
        if (tVar != null) {
            new MayaDisplayNameGuideBottomSheetDialogFragment().show(((MayaSettingsActivity) tVar).getSupportFragmentManager(), "guide_dialog");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13981Z = (Sb.t) getActivity();
        c cVarY = W4.a.e().y();
        O5.a aVar = (O5.a) cVarY.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((C1916a) cVarY.f2990b).getClass();
        this.f13980Y = new a(1);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_display_name, viewGroup, false);
        int i = R.id.bottom_space_display_name_details;
        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_display_name_details)) != null) {
            i = R.id.bottom_space_guide;
            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_guide)) != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                i = R.id.html_text_view_guide_description;
                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_guide_description);
                if (htmlTextView != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.right_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                            i = R.id.switch_toggle_show_my_name;
                            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.switch_toggle_show_my_name);
                            if (switchCompat != null) {
                                i = R.id.text_view_details_name;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_name);
                                if (appCompatTextView != null) {
                                    i = R.id.text_view_details_show_my_name_switch;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_show_my_name_switch)) != null) {
                                        i = R.id.text_view_details_show_to_others;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_show_to_others)) != null) {
                                            i = R.id.text_view_display_name_description;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_display_name_description)) != null) {
                                                i = R.id.text_view_display_name_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_display_name_title)) != null) {
                                                    i = R.id.text_view_guide_title;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_guide_title)) != null) {
                                                        i = R.id.view_details_background;
                                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_details_background);
                                                        if (viewFindChildViewById != null) {
                                                            i = R.id.view_details_divider;
                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_details_divider);
                                                            if (viewFindChildViewById2 != null) {
                                                                i = R.id.view_guide_background;
                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_guide_background);
                                                                if (viewFindChildViewById3 != null) {
                                                                    this.f13976U = new C0491z(nestedScrollView, htmlTextView, switchCompat, appCompatTextView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
                                                                    j.f(nestedScrollView, "getRoot(...)");
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
        this.f13976U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Sb.t tVar = this.f13981Z;
        if (tVar != null) {
            ((MayaSettingsActivity) tVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13976U;
        j.d(c0491z);
        this.f13977V = (AppCompatTextView) c0491z.e;
        C0491z c0491z2 = this.f13976U;
        j.d(c0491z2);
        this.f13978W = (SwitchCompat) c0491z2.c;
        C0491z c0491z3 = this.f13976U;
        j.d(c0491z3);
        this.f13979X = (HtmlTextView) c0491z3.f4303b;
        SwitchCompat switchCompat = this.f13978W;
        if (switchCompat == null) {
            j.n("mShowMyNameSwitch");
            throw null;
        }
        switchCompat.setOnCheckedChangeListener(new W2(this, 2));
        Bundle arguments = getArguments();
        if (arguments != null) {
            SettingsDisplayName settingsDisplayName = (SettingsDisplayName) arguments.getParcelable("display_name");
            a aVarG1 = G1();
            aVarG1.j();
            boolean zMIsEnabled = settingsDisplayName != null ? settingsDisplayName.mIsEnabled() : false;
            MayaDisplayNameFragment mayaDisplayNameFragment = (MayaDisplayNameFragment) ((i) aVarG1.c.get());
            HtmlTextView htmlTextView = mayaDisplayNameFragment.f13979X;
            if (htmlTextView == null) {
                j.n("mGuideHtmlTextView");
                throw null;
            }
            htmlTextView.setOnLinkClickListener(mayaDisplayNameFragment);
            i iVar = (i) aVarG1.c.get();
            String displayFullName = settingsDisplayName != null ? settingsDisplayName.getDisplayFullName() : null;
            AppCompatTextView appCompatTextView = ((MayaDisplayNameFragment) iVar).f13977V;
            if (appCompatTextView == null) {
                j.n("mShowMyNameValueTextView");
                throw null;
            }
            appCompatTextView.setText(displayFullName);
            if (zMIsEnabled) {
                aVarG1.e = true;
                SwitchCompat switchCompat2 = ((MayaDisplayNameFragment) ((i) aVarG1.c.get())).f13978W;
                if (switchCompat2 != null) {
                    switchCompat2.setChecked(zMIsEnabled);
                } else {
                    j.n("mShowMyNameSwitch");
                    throw null;
                }
            }
        }
    }
}
