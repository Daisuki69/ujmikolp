package com.paymaya.mayaui.common.view.fragment.impl;

import N5.C0450f;
import O5.a;
import Q6.i;
import S.b;
import S5.c;
import X6.g;
import Y6.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUpdaterFragment extends MayaBaseFragment implements g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0450f f11942U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public HtmlTextView f11943V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f11944W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public i f11945X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public k f11946Y;

    public final i G1() {
        i iVar = this.f11945X;
        if (iVar != null) {
            return iVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void H1() {
        C1220i c1220iO1 = o1();
        C1219h c1219h = new C1219h();
        c1219h.o(EnumC1215d.FORCED_UPDATE);
        c1219h.n(17);
        c1219h.t(EnumC1217f.ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("button", "update_now");
        c1220iO1.b(c1219h);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().o(EnumC1215d.FORCED_UPDATE);
        this.f11946Y = (k) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f11945X = new i((c) aVar.f4724k.get());
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_updater, viewGroup, false);
        int i = R.id.button_update;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_update);
        if (button != null) {
            i = R.id.html_text_view_updater_description;
            HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_updater_description);
            if (htmlTextView != null) {
                i = R.id.image_view_maya_logo;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maya_logo)) != null) {
                    i = R.id.image_view_updater_image;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_updater_image)) != null) {
                        i = R.id.text_view_updater_title;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_updater_title)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f11942U = new C0450f((ViewGroup) constraintLayout, (Object) button, (Object) htmlTextView, 12);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
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
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11942U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iO1 = o1();
        C1219h c1219h = new C1219h();
        c1219h.o(EnumC1215d.FORCED_UPDATE);
        c1219h.n(2);
        c1220iO1.b(c1219h);
        G1().m();
        G1().k();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f11942U;
        j.d(c0450f);
        this.f11943V = (HtmlTextView) c0450f.f4088d;
        C0450f c0450f2 = this.f11942U;
        j.d(c0450f2);
        this.f11944W = (Button) c0450f2.f4087b;
        G1().j();
        k kVar = this.f11946Y;
        if (kVar != null) {
            MayaUpdaterActivity mayaUpdaterActivity = (MayaUpdaterActivity) kVar;
            mayaUpdaterActivity.M1(R.color.black);
            WindowCompat.getInsetsController(mayaUpdaterActivity.getWindow(), mayaUpdaterActivity.getWindow().getDecorView()).setAppearanceLightStatusBars(false);
        }
        HtmlTextView htmlTextView = this.f11943V;
        if (htmlTextView == null) {
            j.n("mHtmlTextViewDescription");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new Xa.c(this, 5));
        Button button = this.f11944W;
        if (button != null) {
            button.setOnClickListener(new b(this, 29));
        } else {
            j.n("mButtonUpdate");
            throw null;
        }
    }
}
