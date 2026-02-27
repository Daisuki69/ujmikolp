package com.paymaya.mayaui.rekyc.view.fragment.impl;

import N5.C0453g;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycNudgeActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycNudgeFragment;
import java.util.HashMap;
import jb.a;
import kb.b;
import kotlin.jvm.internal.j;
import lb.InterfaceC1822c;

/* JADX INFO: loaded from: classes4.dex */
public class ReKycNudgeFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f13707U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13708V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13709W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public a f13710X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Bb.a f13711Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC1822c f13712Z;

    public static final void J1(ReKycNudgeFragment reKycNudgeFragment) {
        Bb.a aVarG1 = reKycNudgeFragment.G1();
        InterfaceC1822c interfaceC1822c = ((ReKycNudgeFragment) ((b) aVarG1.c.get())).f13712Z;
        if (interfaceC1822c != null) {
            ReKycNudgeActivity reKycNudgeActivity = (ReKycNudgeActivity) interfaceC1822c;
            reKycNudgeActivity.startActivity(reKycNudgeActivity.n1().o0(reKycNudgeActivity));
            reKycNudgeActivity.finish();
        }
        ((ReKycNudgeFragment) ((b) aVarG1.c.get())).I1(EnumC1217f.UPDATE_NOW);
    }

    public final Bb.a G1() {
        Bb.a aVar = this.f13711Y;
        if (aVar != null) {
            return aVar;
        }
        j.n("mReKycNudgeFragmentPresenter");
        throw null;
    }

    public final void H1() {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.REKYC_NUDGE);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strX = t1().x();
        HashMap map = c1219hD.j;
        map.put("rekyc_status", strX);
        map.put("rekyc_reason", t1().w());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    public final void I1(EnumC1217f enumC1217f) {
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.REKYC_NUDGE);
        c1219hD.n(17);
        c1219hD.t(enumC1217f);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strX = t1().x();
        HashMap map = c1219hD.j;
        map.put("rekyc_status", strX);
        map.put("rekyc_reason", t1().w());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.REKYC_NUDGE;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycNudgeFragment.ReKycNudgeFragmentListener");
        this.f13712Z = (InterfaceC1822c) activity;
        O5.a aVar = W4.a.e().F().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f13711Y = new Bb.a((com.paymaya.data.preference.a) aVar.e.get(), 21);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_re_kyc_nudge, viewGroup, false);
        int i = R.id.button_do_it_later;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.button_do_it_later);
        if (textView != null) {
            i = R.id.button_update_now;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_update_now);
            if (button != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.image_view_nudge_image;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_nudge_image)) != null) {
                    i = R.id.recycler_view_nudge_features;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_nudge_features);
                    if (recyclerView != null) {
                        i = R.id.text_view_header;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                            i = R.id.text_view_header_subtext;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                                this.f13707U = new C0453g(16, constraintLayout, textView, button, recyclerView);
                                return constraintLayout;
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
        this.f13707U = null;
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        G1().i();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1822c interfaceC1822c = this.f13712Z;
        if (interfaceC1822c != null) {
            ((ReKycNudgeActivity) interfaceC1822c).Q(this);
        }
        Bb.a aVarG1 = G1();
        if (!aVarG1.e.e().isPartnerOnboardingEnabled()) {
            ((ReKycNudgeFragment) ((b) aVarG1.c.get())).H1();
            return;
        }
        String strP = aVarG1.e.p();
        j.f(strP, "getMayaOnboardingPartner(...)");
        if (strP.length() <= 0) {
            ((ReKycNudgeFragment) ((b) aVarG1.c.get())).H1();
            return;
        }
        ReKycNudgeFragment reKycNudgeFragment = (ReKycNudgeFragment) ((b) aVarG1.c.get());
        C1220i c1220iO1 = reKycNudgeFragment.o1();
        FragmentActivity activity = reKycNudgeFragment.getActivity();
        C1219h c1219hD = C1219h.d(reKycNudgeFragment.u1());
        c1219hD.r(EnumC1216e.REKYC_NUDGE);
        c1219hD.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strX = reKycNudgeFragment.t1().x();
        HashMap map = c1219hD.j;
        map.put("rekyc_status", strX);
        map.put("rekyc_reason", reKycNudgeFragment.t1().w());
        map.put("partner", reKycNudgeFragment.t1().p());
        map.put("branch", reKycNudgeFragment.t1().q());
        map.put("kyc_level", reKycNudgeFragment.t1().k().toString());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f13707U;
        j.d(c0453g);
        this.f13708V = (Button) c0453g.f4095d;
        C0453g c0453g2 = this.f13707U;
        j.d(c0453g2);
        this.f13709W = (TextView) c0453g2.c;
        Button button = this.f13708V;
        if (button == null) {
            j.n("mButtonUpdateNow");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: lb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReKycNudgeFragment f18285b;

            {
                this.f18285b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        ReKycNudgeFragment reKycNudgeFragment = this.f18285b;
                        Callback.onClick_enter(view2);
                        try {
                            ReKycNudgeFragment.J1(reKycNudgeFragment);
                            return;
                        } finally {
                        }
                    default:
                        ReKycNudgeFragment reKycNudgeFragment2 = this.f18285b;
                        Callback.onClick_enter(view2);
                        try {
                            Bb.a aVarG1 = reKycNudgeFragment2.G1();
                            InterfaceC1822c interfaceC1822c = ((ReKycNudgeFragment) ((kb.b) aVarG1.c.get())).f13712Z;
                            if (interfaceC1822c != null) {
                                ((ReKycNudgeActivity) interfaceC1822c).finish();
                            }
                            ((ReKycNudgeFragment) ((kb.b) aVarG1.c.get())).I1(EnumC1217f.DO_LATER);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f13709W;
        if (textView == null) {
            j.n("mButtonDoItLater");
            throw null;
        }
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReKycNudgeFragment f18285b;

            {
                this.f18285b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        ReKycNudgeFragment reKycNudgeFragment = this.f18285b;
                        Callback.onClick_enter(view2);
                        try {
                            ReKycNudgeFragment.J1(reKycNudgeFragment);
                            return;
                        } finally {
                        }
                    default:
                        ReKycNudgeFragment reKycNudgeFragment2 = this.f18285b;
                        Callback.onClick_enter(view2);
                        try {
                            Bb.a aVarG1 = reKycNudgeFragment2.G1();
                            InterfaceC1822c interfaceC1822c = ((ReKycNudgeFragment) ((kb.b) aVarG1.c.get())).f13712Z;
                            if (interfaceC1822c != null) {
                                ((ReKycNudgeActivity) interfaceC1822c).finish();
                            }
                            ((ReKycNudgeFragment) ((kb.b) aVarG1.c.get())).I1(EnumC1217f.DO_LATER);
                            return;
                        } finally {
                        }
                }
            }
        });
        G1().j();
    }
}
