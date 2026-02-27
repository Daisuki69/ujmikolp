package com.paymaya.mayaui.login.view.fragment.impl;

import Bb.a;
import N5.C0453g;
import S5.c;
import W5.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.login.view.fragment.impl.BaseMayaWelcomeFragment;
import eb.g;
import g9.InterfaceC1512g;
import h9.InterfaceC1543b;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class BaseMayaWelcomeFragment extends MayaBaseFragment implements InterfaceC1512g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f12766U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f12767V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f12768W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public a f12769X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC1543b f12770Y;

    public static final void G1(BaseMayaWelcomeFragment baseMayaWelcomeFragment, ActivityResult activityResult) {
        baseMayaWelcomeFragment.getClass();
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            String stringExtra = data != null ? data.getStringExtra("source_screen") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            baseMayaWelcomeFragment.K1(stringExtra);
        }
    }

    public static final void I1(BaseMayaWelcomeFragment baseMayaWelcomeFragment) {
        Button button = baseMayaWelcomeFragment.f12768W;
        if (button == null) {
            j.n("mButtonRegister");
            throw null;
        }
        C1219h c1219hL1 = L1(button.getText().toString(), "Start an account");
        baseMayaWelcomeFragment.o1().c(baseMayaWelcomeFragment.getActivity(), c1219hL1);
        c cVarQ1 = baseMayaWelcomeFragment.q1();
        String strC = c1219hL1.c();
        j.f(strC, "getResolvedEvent(...)");
        cVarQ1.g(strC, e.f6314b, c1219hL1.j);
        InterfaceC1543b interfaceC1543b = ((BaseMayaWelcomeFragment) ((InterfaceC1512g) baseMayaWelcomeFragment.H1().c.get())).f12770Y;
        if (interfaceC1543b != null) {
            MayaWelcomeActivity mayaWelcomeActivity = (MayaWelcomeActivity) interfaceC1543b;
            mayaWelcomeActivity.n1().R(mayaWelcomeActivity);
        }
    }

    public static final void J1(BaseMayaWelcomeFragment baseMayaWelcomeFragment) {
        Button button = baseMayaWelcomeFragment.f12767V;
        if (button == null) {
            j.n("mButtonLogin");
            throw null;
        }
        baseMayaWelcomeFragment.o1().c(baseMayaWelcomeFragment.getActivity(), L1(button.getText().toString(), "Login Page"));
        a aVarH1 = baseMayaWelcomeFragment.H1();
        if (!aVarH1.e.E()) {
            BaseMayaWelcomeFragment baseMayaWelcomeFragment2 = (BaseMayaWelcomeFragment) ((InterfaceC1512g) aVarH1.c.get());
            InterfaceC1543b interfaceC1543b = baseMayaWelcomeFragment2.f12770Y;
            if (interfaceC1543b != null) {
                MayaWelcomeActivity mayaWelcomeActivity = (MayaWelcomeActivity) interfaceC1543b;
                mayaWelcomeActivity.V1(new g(1, baseMayaWelcomeFragment2, BaseMayaWelcomeFragment.class, "handleLoginResult", "handleLoginResult(Landroidx/activity/result/ActivityResult;)V", 0, 10));
                return;
            }
            return;
        }
        BaseMayaWelcomeFragment baseMayaWelcomeFragment3 = (BaseMayaWelcomeFragment) ((InterfaceC1512g) aVarH1.c.get());
        InterfaceC1543b interfaceC1543b2 = baseMayaWelcomeFragment3.f12770Y;
        if (interfaceC1543b2 != null) {
            MayaWelcomeActivity mayaWelcomeActivity2 = (MayaWelcomeActivity) interfaceC1543b2;
            mayaWelcomeActivity2.f12737o = new g(1, baseMayaWelcomeFragment3, BaseMayaWelcomeFragment.class, "handleLoginResult", "handleLoginResult(Landroidx/activity/result/ActivityResult;)V", 0, 9);
            mayaWelcomeActivity2.n1();
            mayaWelcomeActivity2.f12739q.launch(new Intent(mayaWelcomeActivity2.getApplicationContext(), (Class<?>) MayaLoginActivity.class));
        }
    }

    public static C1219h L1(String str, String str2) {
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(2));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Reg Maya Start Page");
        map.put("button", str);
        map.put("destination_page", str2);
        c1219hE.i();
        return c1219hE;
    }

    public final a H1() {
        a aVar = this.f12769X;
        if (aVar != null) {
            return aVar;
        }
        j.n("mWelcomeFragmentPresenter");
        throw null;
    }

    public final void K1(String str) {
        C1220i c1220iO1 = o1();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.u(2));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("source_page", str);
        c1219hE.i();
        c1220iO1.c(fragmentActivityRequireActivity, c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f12770Y = (InterfaceC1543b) getActivity();
        O5.a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12769X = new a((com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get(), 16);
        H1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_welcome, viewGroup, false);
        ScrollView scrollView = (ScrollView) viewInflate;
        int i = R.id.device_info_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.device_info_text_view);
        if (textView != null) {
            i = R.id.login_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.login_button);
            if (button != null) {
                i = R.id.maya_logo_lockup_image_view;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_logo_lockup_image_view)) != null) {
                    i = R.id.register_button;
                    Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.register_button);
                    if (button2 != null) {
                        i = R.id.regulation_notice_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.regulation_notice_text_view)) != null) {
                            this.f12766U = new C0453g(scrollView, scrollView, textView, button, button2);
                            j.f(scrollView, "getRoot(...)");
                            return scrollView;
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
        this.f12766U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f12766U;
        j.d(c0453g);
        j.g((ScrollView) c0453g.c, "<set-?>");
        C0453g c0453g2 = this.f12766U;
        j.d(c0453g2);
        this.f12767V = (Button) c0453g2.f4095d;
        C0453g c0453g3 = this.f12766U;
        j.d(c0453g3);
        this.f12768W = (Button) c0453g3.e;
        j.d(this.f12766U);
        Button button = this.f12768W;
        if (button == null) {
            j.n("mButtonRegister");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaWelcomeFragment f16937b;

            {
                this.f16937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        BaseMayaWelcomeFragment baseMayaWelcomeFragment = this.f16937b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaWelcomeFragment.I1(baseMayaWelcomeFragment);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaWelcomeFragment baseMayaWelcomeFragment2 = this.f16937b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaWelcomeFragment.J1(baseMayaWelcomeFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f12767V;
        if (button2 == null) {
            j.n("mButtonLogin");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseMayaWelcomeFragment f16937b;

            {
                this.f16937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        BaseMayaWelcomeFragment baseMayaWelcomeFragment = this.f16937b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaWelcomeFragment.I1(baseMayaWelcomeFragment);
                            return;
                        } finally {
                        }
                    default:
                        BaseMayaWelcomeFragment baseMayaWelcomeFragment2 = this.f16937b;
                        Callback.onClick_enter(view2);
                        try {
                            BaseMayaWelcomeFragment.J1(baseMayaWelcomeFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        H1().j();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("SOURCE_SCREEN")) == null) {
            string = "";
        }
        K1(string);
    }
}
