package com.paymaya.mayaui.dataprivacy.view.fragment.impl;

import D8.C0214w;
import M8.D2;
import N5.C0491z;
import R7.b;
import S5.c;
import S7.f;
import T7.a;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.store.C1284t;
import com.paymaya.domain.store.E0;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDataPrivacyDataPersonalizationFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f12279U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public LinearLayout f12280V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public NestedScrollView f12281W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12282X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AppCompatCheckBox f12283Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f12284Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0214w f12285a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C1229s f12286b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public f f12287c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f12288d0 = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f12289e0 = "";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ArrayList f12290f0 = new ArrayList();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f12291g0 = true;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final D2 f12292h0 = new D2(this, 6);

    public static final void I1(MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment) {
        C1219h c1219hE;
        C0214w c0214wH1 = mayaDataPrivacyDataPersonalizationFragment.H1();
        AppCompatCheckBox appCompatCheckBox = mayaDataPrivacyDataPersonalizationFragment.f12283Y;
        if (appCompatCheckBox == null) {
            j.n("mEnableAllCheckbox");
            throw null;
        }
        boolean zIsChecked = appCompatCheckBox.isChecked();
        String str = zIsChecked ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
        String str2 = zIsChecked ? "check" : "uncheck";
        String str3 = ((MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get())).f12289e0;
        if (j.b(str3, "login")) {
            c1219hE = C1219h.e("LOGIN_DATA_PERSONALIZATION_SELECTED");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", "Data personalization");
            c1219hE.j.put("checkbox", str);
            c1219hE.j.put("action_function", str2);
        } else if (j.b(str3, "registration")) {
            c1219hE = C1219h.e(AbstractC1213b.o(6));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", "Data personalization");
            c1219hE.j.put("checkbox", str);
            c1219hE.j.put("action_function", str2);
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = (MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get());
        if (c1219hE != null) {
            C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment2.o1();
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("option_label", "Enable all data personalization");
            c1219hE.i();
            c1220iO1.b(c1219hE);
        } else {
            mayaDataPrivacyDataPersonalizationFragment2.getClass();
        }
        C0214w c0214wH12 = mayaDataPrivacyDataPersonalizationFragment.H1();
        AppCompatCheckBox appCompatCheckBox2 = mayaDataPrivacyDataPersonalizationFragment.f12283Y;
        if (appCompatCheckBox2 == null) {
            j.n("mEnableAllCheckbox");
            throw null;
        }
        boolean zIsChecked2 = appCompatCheckBox2.isChecked();
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = (MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH12.c.get());
        for (a aVar : mayaDataPrivacyDataPersonalizationFragment3.f12288d0) {
            mayaDataPrivacyDataPersonalizationFragment3.f12291g0 = false;
            aVar.setCheckBoxConsentChecked(zIsChecked2);
            mayaDataPrivacyDataPersonalizationFragment3.f12291g0 = true;
        }
    }

    public static final void J1(MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment) {
        C1219h c1219hE;
        C0214w c0214wH1 = mayaDataPrivacyDataPersonalizationFragment.H1();
        String str = ((MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get())).f12289e0;
        if (j.b(str, "login")) {
            c1219hE = C1219h.e(AbstractC1213b.l(6));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", "Data personalization");
            c1219hE.j.put("destination_page", "Dashboard");
        } else if (j.b(str, "registration")) {
            c1219hE = C1219h.e(AbstractC1213b.o(3));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("source_page", "Data personalization");
            c1219hE.j.put("destination_page", "Reg Verification Page (OTP)");
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = (MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get());
        if (c1219hE != null) {
            C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment2.o1();
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            Button button = mayaDataPrivacyDataPersonalizationFragment2.f12284Z;
            if (button == null) {
                j.n("mSaveButton");
                throw null;
            }
            c1219hE.j.put("button", button.getText().toString());
            c1219hE.i();
            c1220iO1.b(c1219hE);
        } else {
            mayaDataPrivacyDataPersonalizationFragment2.getClass();
        }
        mayaDataPrivacyDataPersonalizationFragment.H1().A();
    }

    public final C1229s G1() {
        C1229s c1229s = this.f12286b0;
        if (c1229s != null) {
            return c1229s;
        }
        j.n("mAuthAnalyticsUtils");
        throw null;
    }

    public final C0214w H1() {
        C0214w c0214w = this.f12285a0;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mMayaDataPrivacyDataPersonalizationFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        ArrayList arrayList;
        super.onCreate(bundle);
        this.f12287c0 = (f) getActivity();
        O5.a aVar = W4.a.e().l().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        E0 e0M = aVar.M();
        C1284t c1284tJ = aVar.j();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        d sessionSubject = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f12285a0 = new C0214w(e0M, c1284tJ, preference, sessionSubject);
        this.f12286b0 = (C1229s) aVar.f4684R.get();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("source")) == null) {
            string = "";
        }
        this.f12289e0 = string;
        if (arguments == null || (arrayList = arguments.getParcelableArrayList("consents_list")) == null) {
            arrayList = new ArrayList();
        }
        this.f12290f0 = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            str = str + ((Consent) it.next());
        }
        H1().h(this);
        C0214w c0214wH1 = H1();
        if (j.b(((MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get())).f12289e0, "login")) {
            MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get());
            mayaDataPrivacyDataPersonalizationFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.A(6).concat("_SCREEN"));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", "Data personalization");
            c1219hE.i();
            mayaDataPrivacyDataPersonalizationFragment.f10337Q = c1219hE;
            mayaDataPrivacyDataPersonalizationFragment.f10338R = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_data_privacy_data_personalization, viewGroup, false);
        int i = R.id.consents_container_linear_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.consents_container_linear_layout);
        if (linearLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.content_nested_scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_nested_scroll_view);
            if (nestedScrollView != null) {
                i = R.id.enable_all_border_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.enable_all_border_view);
                if (viewFindChildViewById != null) {
                    i = R.id.enable_all_checkbox;
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.enable_all_checkbox);
                    if (appCompatCheckBox != null) {
                        i = R.id.enable_all_container_linear_layout;
                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.enable_all_container_linear_layout)) != null) {
                            i = R.id.enable_all_label_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.enable_all_label_text_view)) != null) {
                                i = R.id.graphic_image_view;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.graphic_image_view)) != null) {
                                    i = R.id.save_button;
                                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.save_button);
                                    if (button != null) {
                                        i = R.id.spiel_text_view;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.spiel_text_view)) != null) {
                                            i = R.id.title_header_text_view;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view);
                                            if (textView != null) {
                                                this.f12279U = new C0491z(constraintLayout, linearLayout, nestedScrollView, viewFindChildViewById, appCompatCheckBox, button, textView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        H1().i();
        super.onDestroy();
        this.f12279U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f fVar = this.f12287c0;
        if (fVar != null) {
            fVar.Q(this);
        }
        H1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("source", this.f12289e0);
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1(this.f12292h0);
        C0491z c0491z = this.f12279U;
        j.d(c0491z);
        this.f12280V = (LinearLayout) c0491z.e;
        C0491z c0491z2 = this.f12279U;
        j.d(c0491z2);
        this.f12283Y = (AppCompatCheckBox) c0491z2.h;
        C0491z c0491z3 = this.f12279U;
        j.d(c0491z3);
        this.f12284Z = (Button) c0491z3.c;
        C0491z c0491z4 = this.f12279U;
        j.d(c0491z4);
        this.f12282X = (TextView) c0491z4.f4304d;
        C0491z c0491z5 = this.f12279U;
        j.d(c0491z5);
        this.f12281W = (NestedScrollView) c0491z5.f4305g;
        C0214w c0214wH1 = H1();
        if (j.b(((MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get())).f12289e0, "login")) {
            MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = (MayaDataPrivacyDataPersonalizationFragment) ((b) c0214wH1.c.get());
            C1220i c1220iO1 = mayaDataPrivacyDataPersonalizationFragment.o1();
            C1219h c1219hE = C1219h.e(AbstractC1213b.A(6).concat("_VIEWED"));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("page_name", "Data personalization");
            Bundle arguments = mayaDataPrivacyDataPersonalizationFragment.getArguments();
            if (arguments == null || (string = arguments.getString("origin_screen")) == null) {
                string = "";
            }
            map.put("source_page", string);
            c1219hE.i();
            c1220iO1.b(c1219hE);
        }
        NestedScrollView nestedScrollView = this.f12281W;
        if (nestedScrollView == null) {
            j.n("mScrollableNestedScrollView");
            throw null;
        }
        nestedScrollView.setOnScrollChangeListener(new Na.d(this, 13));
        AppCompatCheckBox appCompatCheckBox = this.f12283Y;
        if (appCompatCheckBox == null) {
            j.n("mEnableAllCheckbox");
            throw null;
        }
        final int i = 0;
        appCompatCheckBox.setOnClickListener(new View.OnClickListener(this) { // from class: S7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDataPrivacyDataPersonalizationFragment f5676b;

            {
                this.f5676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = this.f5676b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyDataPersonalizationFragment.I1(mayaDataPrivacyDataPersonalizationFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = this.f5676b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyDataPersonalizationFragment.J1(mayaDataPrivacyDataPersonalizationFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f12284Z;
        if (button == null) {
            j.n("mSaveButton");
            throw null;
        }
        final int i4 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: S7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDataPrivacyDataPersonalizationFragment f5676b;

            {
                this.f5676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = this.f5676b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyDataPersonalizationFragment.I1(mayaDataPrivacyDataPersonalizationFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = this.f5676b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDataPrivacyDataPersonalizationFragment.J1(mayaDataPrivacyDataPersonalizationFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
