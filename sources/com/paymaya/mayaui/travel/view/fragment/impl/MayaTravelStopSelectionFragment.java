package com.paymaya.mayaui.travel.view.fragment.impl;

import Ah.p;
import D8.C0214w;
import Je.d;
import N5.C0453g;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.Stop;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.W0;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelStopSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import java.util.List;
import jc.f;
import kc.j;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import yk.a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTravelStopSelectionFragment extends MayaBaseFragment implements f {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f14223U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MayaInputLayout f14224V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaInputLayout f14225W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f14226X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0214w f14227Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j f14228Z;

    public static final void I1(MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment) {
        C0214w c0214wG1 = mayaTravelStopSelectionFragment.G1();
        f fVar = (f) c0214wG1.c.get();
        List stops = (List) c0214wG1.f1106g;
        if (stops == null) {
            stops = C1112C.f9377a;
        }
        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment2 = (MayaTravelStopSelectionFragment) fVar;
        mayaTravelStopSelectionFragment2.getClass();
        kotlin.jvm.internal.j.g(stops, "stops");
        j jVar = mayaTravelStopSelectionFragment2.f14228Z;
        if (jVar != null) {
            MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = mayaTravelStopSelectionFragment2.H1();
            Stop stop = mayaTravelViewDataSelectionH1 != null ? mayaTravelViewDataSelectionH1.e : null;
            MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) jVar;
            String string = mayaTravelActivity.getString(R.string.maya_label_travel_select_origin);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            mayaTravelActivity.W1("choices_origin_key", string, stop, stops);
        }
    }

    public static final void J1(MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment) {
        List list;
        C0214w c0214wG1 = mayaTravelStopSelectionFragment.G1();
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).H1();
        Stop stop = mayaTravelViewDataSelectionH1 != null ? mayaTravelViewDataSelectionH1.e : null;
        List list2 = (List) c0214wG1.f1106g;
        List stops = (stop == null || (list = list2) == null || list.isEmpty()) ? C1112C.f9377a : list2.subList(list2.indexOf(stop) + 1, list2.size());
        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment2 = (MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get());
        mayaTravelStopSelectionFragment2.getClass();
        kotlin.jvm.internal.j.g(stops, "stops");
        j jVar = mayaTravelStopSelectionFragment2.f14228Z;
        if (jVar != null) {
            MayaTravelViewDataSelection mayaTravelViewDataSelectionH12 = mayaTravelStopSelectionFragment2.H1();
            Stop stop2 = mayaTravelViewDataSelectionH12 != null ? mayaTravelViewDataSelectionH12.f : null;
            MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) jVar;
            String string = mayaTravelActivity.getString(R.string.maya_label_travel_select_destination);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            mayaTravelActivity.W1("choices_destination_key", string, stop2, stops);
        }
    }

    public static final void K1(MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.NEXT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = mayaTravelStopSelectionFragment.H1();
        Stop stop = mayaTravelViewDataSelectionH1 != null ? mayaTravelViewDataSelectionH1.e : null;
        c1219hH.j.put("origin", stop != null ? stop.mName() : null);
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH12 = mayaTravelStopSelectionFragment.H1();
        Stop stop2 = mayaTravelViewDataSelectionH12 != null ? mayaTravelViewDataSelectionH12.f : null;
        c1219hH.j.put("destination", stop2 != null ? stop2.mName() : null);
        c1219hH.i();
        mayaTravelStopSelectionFragment.A1(c1219hH);
        C0214w c0214wG1 = mayaTravelStopSelectionFragment.G1();
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH13 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).H1();
        Operator operator = mayaTravelViewDataSelectionH13 != null ? mayaTravelViewDataSelectionH13.f14229a : null;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH14 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).H1();
        Route route = mayaTravelViewDataSelectionH14 != null ? mayaTravelViewDataSelectionH14.c : null;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH15 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).H1();
        Stop stop3 = mayaTravelViewDataSelectionH15 != null ? mayaTravelViewDataSelectionH15.e : null;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH16 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).H1();
        Stop stop4 = mayaTravelViewDataSelectionH16 != null ? mayaTravelViewDataSelectionH16.f : null;
        ((MayaBaseFragment) ((f) c0214wG1.c.get())).E1();
        if (operator == null || route == null || stop3 == null || stop4 == null) {
            return;
        }
        W0 w0 = (W0) c0214wG1.e;
        w0.getClass();
        String strMId = operator.mId();
        String strMId2 = route.mId();
        String strMId3 = stop3.mId();
        String strMId4 = stop4.mId();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("operator", Integer.parseInt(strMId));
        } catch (JSONException unused) {
            a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(TtmlNode.ATTR_ID, Integer.parseInt(strMId2));
        } catch (JSONException unused2) {
            a.e();
        }
        try {
            jSONObject2.put("origin", Integer.parseInt(strMId3));
        } catch (JSONException unused3) {
            a.e();
        }
        try {
            jSONObject2.put("destination", Integer.parseInt(strMId4));
        } catch (JSONException unused4) {
            a.e();
        }
        try {
            jSONObject.put("route", jSONObject2);
        } catch (JSONException unused5) {
            a.e();
        }
        p<TicketPurchaseConfirmation> pVarCreateTicketPurchase = w0.f11403b.createTicketPurchase(d.a(jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        c0214wG1.e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateTicketPurchase, pVarCreateTicketPurchase, b.a()), new M(c0214wG1, 9), 2), new com.google.firebase.messaging.p(c0214wG1, 11), 0).e());
    }

    public final C0214w G1() {
        C0214w c0214w = this.f14227Y;
        if (c0214w != null) {
            return c0214w;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final MayaTravelViewDataSelection H1() {
        j jVar = this.f14228Z;
        if (jVar != null) {
            return (MayaTravelViewDataSelection) ((MayaTravelActivity) jVar).V1().e;
        }
        return null;
    }

    public final void L1(Stop stop) {
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = H1();
        if (mayaTravelViewDataSelectionH1 != null) {
            mayaTravelViewDataSelectionH1.f = stop;
        }
        MayaInputLayout mayaInputLayout = this.f14225W;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutStopDestination");
            throw null;
        }
        mayaInputLayout.getInputEditText().setText(stop != null ? stop.mName() : null);
        f fVar = (f) G1().c.get();
        boolean z4 = stop != null;
        Button button = ((MayaTravelStopSelectionFragment) fVar).f14226X;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
    }

    public final void M1(Stop stop) {
        List list;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = H1();
        if (mayaTravelViewDataSelectionH1 != null) {
            mayaTravelViewDataSelectionH1.e = stop;
        }
        MayaInputLayout mayaInputLayout = this.f14224V;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutStopOrigin");
            throw null;
        }
        mayaInputLayout.getInputEditText().setText(stop != null ? stop.mName() : null);
        C0214w c0214wG1 = G1();
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH12 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).H1();
        Stop stop2 = mayaTravelViewDataSelectionH12 != null ? mayaTravelViewDataSelectionH12.f : null;
        List list2 = (List) c0214wG1.f1106g;
        if (!((stop == null || (list = list2) == null || list.isEmpty()) ? C1112C.f9377a : list2.subList(list2.indexOf(stop) + 1, list2.size())).isEmpty()) {
            List list3 = (List) c0214wG1.f1106g;
            int iL = C0214w.l(stop, list3);
            int iL2 = C0214w.l(stop2, list3);
            if (iL == -1 || iL2 == -1 || iL < iL2) {
                f fVar = (f) c0214wG1.c.get();
                boolean z4 = stop2 != null;
                Button button = ((MayaTravelStopSelectionFragment) fVar).f14226X;
                if (button == null) {
                    kotlin.jvm.internal.j.n("mButtonContinue");
                    throw null;
                }
                button.setEnabled(z4);
                ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).L1(stop2);
                return;
            }
        }
        Button button2 = ((MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get())).f14226X;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
        button2.setEnabled(false);
        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment = (MayaTravelStopSelectionFragment) ((f) c0214wG1.c.get());
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH13 = mayaTravelStopSelectionFragment.H1();
        if (mayaTravelViewDataSelectionH13 != null) {
            mayaTravelViewDataSelectionH13.f = null;
        }
        MayaInputLayout mayaInputLayout2 = mayaTravelStopSelectionFragment.f14225W;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getInputEditText().setText("");
        } else {
            kotlin.jvm.internal.j.n("mMayaInputLayoutStopDestination");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.STOPS;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        MayaTravelViewDataSelection mayaTravelViewDataSelectionH1 = H1();
        if (mayaTravelViewDataSelectionH1 == null) {
            return false;
        }
        mayaTravelViewDataSelectionH1.e = null;
        mayaTravelViewDataSelectionH1.f = null;
        return false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f14228Z = (j) getActivity();
        O5.a aVar = W4.a.e().A().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        W0 w0U = aVar.U();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f14227Y = new C0214w(w0U, sessionPublishSubject, 11);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_travel_stop_selection, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            i = R.id.maya_input_layout_selected_destination;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_selected_destination);
            if (mayaInputLayout != null) {
                i = R.id.maya_input_layout_selected_origin;
                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_selected_origin);
                if (mayaInputLayout2 != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                    i = R.id.text_view_title_header;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header)) != null) {
                        this.f14223U = new C0453g(18, nestedScrollView, button, mayaInputLayout, mayaInputLayout2);
                        kotlin.jvm.internal.j.f(nestedScrollView, "getRoot(...)");
                        return nestedScrollView;
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
        this.f14223U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        c1219h.i();
        A1(c1219h);
        j jVar = this.f14228Z;
        if (jVar != null) {
            ((MayaTravelActivity) jVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f14223U;
        kotlin.jvm.internal.j.d(c0453g);
        this.f14224V = (MayaInputLayout) c0453g.e;
        C0453g c0453g2 = this.f14223U;
        kotlin.jvm.internal.j.d(c0453g2);
        this.f14225W = (MayaInputLayout) c0453g2.f4095d;
        C0453g c0453g3 = this.f14223U;
        kotlin.jvm.internal.j.d(c0453g3);
        this.f14226X = (Button) c0453g3.c;
        G1().j();
        MayaInputLayout mayaInputLayout = this.f14224V;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutStopOrigin");
            throw null;
        }
        final int i = 0;
        mayaInputLayout.setOnDisabledClickListener(new View.OnClickListener(this) { // from class: kc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaTravelStopSelectionFragment f18121b;

            {
                this.f18121b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.I1(mayaTravelStopSelectionFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment2 = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.J1(mayaTravelStopSelectionFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment3 = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.K1(mayaTravelStopSelectionFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout2 = this.f14225W;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutStopDestination");
            throw null;
        }
        final int i4 = 1;
        mayaInputLayout2.setOnDisabledClickListener(new View.OnClickListener(this) { // from class: kc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaTravelStopSelectionFragment f18121b;

            {
                this.f18121b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.I1(mayaTravelStopSelectionFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment2 = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.J1(mayaTravelStopSelectionFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment3 = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.K1(mayaTravelStopSelectionFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f14226X;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
        final int i6 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: kc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaTravelStopSelectionFragment f18121b;

            {
                this.f18121b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.I1(mayaTravelStopSelectionFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment2 = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.J1(mayaTravelStopSelectionFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaTravelStopSelectionFragment mayaTravelStopSelectionFragment3 = this.f18121b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaTravelStopSelectionFragment.K1(mayaTravelStopSelectionFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i10 = 0;
        getParentFragmentManager().setFragmentResultListener("choices_origin_key", this, new FragmentResultListener(this) { // from class: kc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaTravelStopSelectionFragment f18123b;

            {
                this.f18123b = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                switch (i10) {
                    case 0:
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        this.f18123b.M1((Stop) bundle2.getParcelable("model_values"));
                        break;
                    default:
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        this.f18123b.L1((Stop) bundle2.getParcelable("model_values"));
                        break;
                }
            }
        });
        final int i11 = 1;
        getParentFragmentManager().setFragmentResultListener("choices_destination_key", this, new FragmentResultListener(this) { // from class: kc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaTravelStopSelectionFragment f18123b;

            {
                this.f18123b = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        this.f18123b.M1((Stop) bundle2.getParcelable("model_values"));
                        break;
                    default:
                        kotlin.jvm.internal.j.g(str, "str");
                        kotlin.jvm.internal.j.g(bundle2, "bundle");
                        this.f18123b.L1((Stop) bundle2.getParcelable("model_values"));
                        break;
                }
            }
        });
    }
}
