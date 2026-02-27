package com.paymaya.mayaui.xp.view.fragment;

import Bb.f;
import Lc.a;
import Lc.c;
import N5.C0447e;
import N5.C0456h;
import N5.k1;
import N5.z1;
import O5.b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.data.api.MayaXpApi;
import com.paymaya.domain.model.MayaXPScore;
import com.paymaya.domain.model.MayaXPTier;
import com.paymaya.domain.store.C1266j0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment;
import com.paymaya.mayaui.xp.view.widgets.MayaXpMeterView;
import kotlin.jvm.internal.j;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaXpEntryFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0447e f14330U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public f f14331V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public c f14332W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public z1 f14333X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0456h f14334Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public k1 f14335Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ConstraintLayout f14336a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ConstraintLayout f14337b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ConstraintLayout f14338c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ConstraintLayout f14339d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Button f14340e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f14341f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public MayaXpMeterView f14342g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public MayaXPScore f14343h0;

    public static Mc.a H1(MayaXPTier mayaXPTier) {
        return new Mc.a(mayaXPTier.getName(), mayaXPTier.getMin(), mayaXPTier.getMin() + "+");
    }

    public static final void I1(MayaXpEntryFragment mayaXpEntryFragment) {
        C1220i c1220iO1 = mayaXpEntryFragment.o1();
        C1219h c1219hE = C1219h.e("MAYA_XP_WIDGET_TAPPED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.g("source_page", "Credit");
        MayaXPScore mayaXPScore = mayaXpEntryFragment.f14343h0;
        if (mayaXPScore == null) {
            j.n("mScoreData");
            throw null;
        }
        c1219hE.g("user_tier", mayaXPScore.getTier());
        MayaXPScore mayaXPScore2 = mayaXpEntryFragment.f14343h0;
        if (mayaXPScore2 == null) {
            j.n("mScoreData");
            throw null;
        }
        c1219hE.g("user_score", String.valueOf(mayaXPScore2.getScore()));
        c1219hE.g("button_name", mayaXpEntryFragment.getString(R.string.maya_xp_earn_more));
        c1220iO1.b(c1219hE);
        c cVar = mayaXpEntryFragment.f14332W;
        if (cVar != null) {
            ((MayaDashboardActivity) cVar).p2("Credit", "paymaya://xp/earn");
        }
    }

    public final void G1() {
        ConstraintLayout constraintLayout = this.f14338c0;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        W4.a aVarE = W4.a.e();
        if (aVarE.f6271c0 == null) {
            O5.a aVar = aVarE.f6267a;
            C2011b c2011b = new C2011b(4);
            aVar.getClass();
            aVarE.f6271c0 = new b(aVar.f4704b, c2011b);
        }
        O5.a aVar2 = aVarE.f6271c0.f4751a;
        this.f10334B = (C1220i) aVar2.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f10336P = (S5.c) aVar2.f4724k.get();
        this.f14331V = new f(new C1266j0((MayaXpApi) aVar2.f4740s0.get()), 4);
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14332W = (c) getActivity();
        f fVar = this.f14331V;
        if (fVar != null) {
            fVar.h(this);
        } else {
            j.n("mMayaXpFragmentPresenter");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[PHI: r15
  0x0118: PHI (r15v6 int) = (r15v5 int), (r15v8 int) binds: [B:15:0x0063, B:19:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.xp.view.fragment.MayaXpEntryFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f fVar = this.f14331V;
        if (fVar == null) {
            j.n("mMayaXpFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f14332W = null;
        super.onDetach();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f14330U;
        j.d(c0447e);
        this.f14335Z = (k1) c0447e.f;
        C0447e c0447e2 = this.f14330U;
        j.d(c0447e2);
        this.f14334Y = (C0456h) c0447e2.f4080d;
        C0447e c0447e3 = this.f14330U;
        j.d(c0447e3);
        this.f14333X = (z1) c0447e3.c;
        C0447e c0447e4 = this.f14330U;
        j.d(c0447e4);
        C0456h c0456h = (C0456h) c0447e4.e;
        k1 k1Var = this.f14335Z;
        if (k1Var == null) {
            j.n("mMeterContent");
            throw null;
        }
        this.f14336a0 = (ConstraintLayout) k1Var.c;
        C0456h c0456h2 = this.f14334Y;
        if (c0456h2 == null) {
            j.n("mLoadingLayout");
            throw null;
        }
        this.f14337b0 = c0456h2.c;
        z1 z1Var = this.f14333X;
        if (z1Var == null) {
            j.n("mErrorLayout");
            throw null;
        }
        this.f14338c0 = z1Var.c;
        this.f14339d0 = c0456h.c;
        this.f14340e0 = (Button) k1Var.f4138b;
        TextView textView = z1Var.f4319d;
        this.f14341f0 = (TextView) k1Var.f4139d;
        this.f14342g0 = (MayaXpMeterView) k1Var.f;
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Lc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaXpEntryFragment f2956b;

            {
                this.f2956b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaXpEntryFragment mayaXpEntryFragment = this.f2956b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaXpEntryFragment.G1();
                            f fVar = mayaXpEntryFragment.f14331V;
                            if (fVar != null) {
                                fVar.r();
                                return;
                            } else {
                                j.n("mMayaXpFragmentPresenter");
                                throw null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    default:
                        MayaXpEntryFragment mayaXpEntryFragment2 = this.f2956b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaXpEntryFragment.I1(mayaXpEntryFragment2);
                            return;
                        } finally {
                            Callback.onClick_exit();
                        }
                }
            }
        });
        Button button = this.f14340e0;
        if (button == null) {
            j.n("mEarnMoreXPButton");
            throw null;
        }
        final int i4 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Lc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaXpEntryFragment f2956b;

            {
                this.f2956b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaXpEntryFragment mayaXpEntryFragment = this.f2956b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaXpEntryFragment.G1();
                            f fVar = mayaXpEntryFragment.f14331V;
                            if (fVar != null) {
                                fVar.r();
                                return;
                            } else {
                                j.n("mMayaXpFragmentPresenter");
                                throw null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    default:
                        MayaXpEntryFragment mayaXpEntryFragment2 = this.f2956b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaXpEntryFragment.I1(mayaXpEntryFragment2);
                            return;
                        } finally {
                            Callback.onClick_exit();
                        }
                }
            }
        });
        f fVar = this.f14331V;
        if (fVar != null) {
            fVar.j();
        } else {
            j.n("mMayaXpFragmentPresenter");
            throw null;
        }
    }
}
