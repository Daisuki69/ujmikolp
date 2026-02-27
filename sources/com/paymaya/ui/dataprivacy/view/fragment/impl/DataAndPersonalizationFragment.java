package com.paymaya.ui.dataprivacy.view.fragment.impl;

import Ke.b;
import M7.c;
import N5.k1;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import com.paymaya.ui.dataprivacy.view.widget.PrivacyPolicyItem;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import od.a;

/* JADX INFO: loaded from: classes4.dex */
public class DataAndPersonalizationFragment extends BaseFragment implements a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public k1 f14484S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public c f14485T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public pd.c f14486U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final ArrayList f14487V = new ArrayList();

    public static final void t1(DataAndPersonalizationFragment dataAndPersonalizationFragment) {
        C1220i c1220i = dataAndPersonalizationFragment.f10245B;
        FragmentActivity activity = dataAndPersonalizationFragment.getActivity();
        C1219h c1219hD = C1219h.d(dataAndPersonalizationFragment.m1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.ENABLE_ALL);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        k1 k1Var = dataAndPersonalizationFragment.f14484S;
        j.d(k1Var);
        c1219hD.j.put(Constants.ENABLED, String.valueOf(((CheckBox) k1Var.f).isChecked()));
        c1219hD.j.put("screen", "secondary");
        c1220i.c(activity, c1219hD);
        c cVarR1 = dataAndPersonalizationFragment.r1();
        k1 k1Var2 = dataAndPersonalizationFragment.f14484S;
        j.d(k1Var2);
        boolean zIsChecked = ((CheckBox) k1Var2.f).isChecked();
        Iterator it = ((DataAndPersonalizationFragment) ((a) cVarR1.c.get())).f14487V.iterator();
        while (it.hasNext()) {
            ((PrivacyPolicyItem) it.next()).setCheckBoxConsent(zIsChecked);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14486U = (pd.c) getActivity();
        O5.a aVar = W4.a.e().c().f4752a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14485T = new c(aVar.j(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get(), 1);
        this.f10248Q.r(EnumC1216e.SECONDARY_CONSENTS);
        this.f10249R = true;
        r1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_data_and_personalization, viewGroup, false);
        int i = R.id.bird_image_view_pma_fragment_data_and_personalization;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.bird_image_view_pma_fragment_data_and_personalization)) != null) {
            i = R.id.border_enable_button_pma_fragment_data_and_personalization;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.border_enable_button_pma_fragment_data_and_personalization);
            if (viewFindChildViewById != null) {
                i = R.id.container_linear_layout_pma_fragment_data_and_personalization;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_linear_layout_pma_fragment_data_and_personalization);
                if (linearLayout != null) {
                    i = R.id.enable_check_box_pma_fragment_data_and_personalization;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewInflate, R.id.enable_check_box_pma_fragment_data_and_personalization);
                    if (checkBox != null) {
                        i = R.id.enable_spiel_text_view_pma_fragment_data_and_personalization;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.enable_spiel_text_view_pma_fragment_data_and_personalization)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.next_button_pma_fragment_data_and_personalization;
                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button_pma_fragment_data_and_personalization);
                            if (button != null) {
                                i = R.id.scroll_view_pma_fragment_data_and_personalization;
                                if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_pma_fragment_data_and_personalization)) != null) {
                                    i = R.id.spiel_text_view_pma_fragment_personalization;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.spiel_text_view_pma_fragment_personalization)) != null) {
                                        this.f14484S = new k1((ViewGroup) constraintLayout, (Object) viewFindChildViewById, (Object) linearLayout, (Object) checkBox, (Object) button, 11);
                                        j.f(constraintLayout, "getRoot(...)");
                                        b.a(constraintLayout);
                                        k1 k1Var = this.f14484S;
                                        j.d(k1Var);
                                        return (ConstraintLayout) k1Var.e;
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

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r1().i();
        super.onDestroy();
        this.f14484S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        pd.c cVar = this.f14486U;
        if (cVar != null) {
            ((DataPrivacyActivity) cVar).Q(this);
        }
        r1().j();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        pd.c cVar = this.f14486U;
        j.d(cVar);
        String str = ((DataPrivacyActivity) cVar).f14474l;
        j.d(str);
        c1219h.j.put("source", str);
        super.onStop();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        k1 k1Var = this.f14484S;
        j.d(k1Var);
        final int i = 0;
        ((CheckBox) k1Var.f).setOnClickListener(new View.OnClickListener(this) { // from class: pd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataAndPersonalizationFragment f19090b;

            {
                this.f19090b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        DataAndPersonalizationFragment dataAndPersonalizationFragment = this.f19090b;
                        Callback.onClick_enter(view2);
                        try {
                            DataAndPersonalizationFragment.t1(dataAndPersonalizationFragment);
                            return;
                        } finally {
                        }
                    default:
                        DataAndPersonalizationFragment dataAndPersonalizationFragment2 = this.f19090b;
                        Callback.onClick_enter(view2);
                        try {
                            dataAndPersonalizationFragment2.r1().l();
                            return;
                        } finally {
                        }
                }
            }
        });
        k1 k1Var2 = this.f14484S;
        j.d(k1Var2);
        final int i4 = 1;
        ((Button) k1Var2.f4139d).setOnClickListener(new View.OnClickListener(this) { // from class: pd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataAndPersonalizationFragment f19090b;

            {
                this.f19090b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        DataAndPersonalizationFragment dataAndPersonalizationFragment = this.f19090b;
                        Callback.onClick_enter(view2);
                        try {
                            DataAndPersonalizationFragment.t1(dataAndPersonalizationFragment);
                            return;
                        } finally {
                        }
                    default:
                        DataAndPersonalizationFragment dataAndPersonalizationFragment2 = this.f19090b;
                        Callback.onClick_enter(view2);
                        try {
                            dataAndPersonalizationFragment2.r1().l();
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final c r1() {
        c cVar = this.f14485T;
        if (cVar != null) {
            return cVar;
        }
        j.n("mIDataAndPersonalizationFragmentPresenter");
        throw null;
    }

    public final String s1() {
        pd.c cVar = this.f14486U;
        j.d(cVar);
        String str = ((DataPrivacyActivity) cVar).f14474l;
        j.d(str);
        return str;
    }
}
