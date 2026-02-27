package com.paymaya.mayaui.favorite.view.fragment.impl;

import G5.A;
import M8.W2;
import N5.C0435a;
import N5.C0491z;
import S5.c;
import U7.a;
import Uh.d;
import Y6.h;
import Y7.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.work.impl.e;
import c8.InterfaceC1083a;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.favorite.view.dialog.impl.MayaFavoriteReminderSampleBottomSheetDialogFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment;
import d8.InterfaceC1337b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import w5.C2383a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAddFavoriteFragment extends MayaBaseFragment implements InterfaceC1083a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0435a f12321U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MayaInputLayout f12322V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12323W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public RecyclerView f12324X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f12325Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ConstraintLayout f12326Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public SwitchCompat f12327a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f12328b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public HtmlTextView f12329c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public View f12330d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Group f12331e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public b f12332f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public InterfaceC1337b f12333g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public a f12335i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Integer f12336j0;
    public String m0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f12334h0 = "";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f12337k0 = "n";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f12338l0 = "0.00";

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H1(com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment.H1(com.paymaya.mayaui.favorite.view.fragment.impl.MayaAddFavoriteFragment):void");
    }

    public final X7.a G1() {
        b bVar = this.f12332f0;
        if (bVar != null) {
            return bVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void I1() {
        InterfaceC1337b interfaceC1337b = this.f12333g0;
        if (interfaceC1337b != null) {
            Integer num = this.f12336j0;
            String eventAttributeService = this.f12334h0;
            MayaAddFavoriteActivity mayaAddFavoriteActivity = (MayaAddFavoriteActivity) interfaceC1337b;
            j.g(eventAttributeService, "eventAttributeService");
            String strD = AbstractC1236z.d(mayaAddFavoriteActivity, MayaFavoriteReminderScheduleBottomSheetFragment.class);
            MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment = new MayaFavoriteReminderScheduleBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("last_selected_day", num != null ? num.intValue() : 1);
            bundle.putString("event_attribute_service", eventAttributeService);
            mayaFavoriteReminderScheduleBottomSheetFragment.setArguments(bundle);
            mayaFavoriteReminderScheduleBottomSheetFragment.show(mayaAddFavoriteActivity.getSupportFragmentManager(), strD);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f12333g0 = (InterfaceC1337b) getActivity();
        O5.a aVar = W4.a.e().m().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        Q q9 = aVar.q();
        d sessionSubject = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f12332f0 = new b(preference, q9, sessionSubject);
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_add_favorite, viewGroup, false);
        int i = R.id.button_save;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_save);
        if (button != null) {
            i = R.id.maya_input_layout_favorite_name;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_favorite_name);
            if (mayaInputLayout != null) {
                i = R.id.recycler_view_dynamic_details;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_dynamic_details);
                if (recyclerView != null) {
                    i = R.id.scroll_view_favorite_details;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_favorite_details)) != null) {
                        i = R.id.text_view_description;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description)) != null) {
                            i = R.id.text_view_details_header;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_header);
                            if (textView != null) {
                                i = R.id.text_view_title_header;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header)) != null) {
                                    i = R.id.view_favorite_set_reminder_section;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_favorite_set_reminder_section);
                                    if (viewFindChildViewById != null) {
                                        int i4 = R.id.constraint_group_chosen_reminder_inner_section;
                                        Group group = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_group_chosen_reminder_inner_section);
                                        if (group != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindChildViewById;
                                            i4 = R.id.image_view_chosen_reminder_chevron;
                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_chosen_reminder_chevron)) != null) {
                                                i4 = R.id.space_bottom_chosen_reminder_day_inner_section;
                                                if (((Space) ViewBindings.findChildViewById(viewFindChildViewById, R.id.space_bottom_chosen_reminder_day_inner_section)) != null) {
                                                    i4 = R.id.switch_toggle_reminder_day;
                                                    SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewFindChildViewById, R.id.switch_toggle_reminder_day);
                                                    if (switchCompat != null) {
                                                        i4 = R.id.text_view_chosen_reminder_day;
                                                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_chosen_reminder_day);
                                                        if (htmlTextView != null) {
                                                            i4 = R.id.text_view_new_feature_badge;
                                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_new_feature_badge)) != null) {
                                                                i4 = R.id.text_view_remind_me_on_label;
                                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_remind_me_on_label)) != null) {
                                                                    i4 = R.id.text_view_reminder_view_sample;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_reminder_view_sample);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.text_view_set_reminders_label;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_set_reminders_label)) != null) {
                                                                            i4 = R.id.view_chosen_reminder_day_inner_section;
                                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_chosen_reminder_day_inner_section);
                                                                            if (viewFindChildViewById2 != null) {
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                                this.f12321U = new C0435a(constraintLayout2, button, mayaInputLayout, recyclerView, textView, new C0491z((ViewGroup) constraintLayout, (View) group, (Object) constraintLayout, (Object) switchCompat, (View) htmlTextView, (View) textView2, viewFindChildViewById2, 25), 8);
                                                                                j.f(constraintLayout2, "getRoot(...)");
                                                                                return constraintLayout2;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        getParentFragmentManager().clearFragmentResultListener("request_select_reminder_day");
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f12321U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f12321U;
        j.d(c0435a);
        this.f12322V = (MayaInputLayout) c0435a.f4048d;
        C0435a c0435a2 = this.f12321U;
        j.d(c0435a2);
        this.f12323W = (TextView) c0435a2.f;
        C0435a c0435a3 = this.f12321U;
        j.d(c0435a3);
        this.f12324X = (RecyclerView) c0435a3.e;
        C0435a c0435a4 = this.f12321U;
        j.d(c0435a4);
        this.f12325Y = (Button) c0435a4.c;
        C0435a c0435a5 = this.f12321U;
        j.d(c0435a5);
        C0491z c0491z = (C0491z) c0435a5.f4049g;
        this.f12326Z = (ConstraintLayout) c0491z.e;
        this.f12328b0 = (TextView) c0491z.f4304d;
        this.f12327a0 = (SwitchCompat) c0491z.f;
        this.f12331e0 = (Group) c0491z.c;
        this.f12330d0 = (View) c0491z.h;
        this.f12329c0 = (HtmlTextView) c0491z.f4305g;
        Button button = this.f12325Y;
        if (button == null) {
            j.n("mButtonSave");
            throw null;
        }
        button.setEnabled(false);
        a aVar = new a(new C2383a());
        this.f12335i0 = aVar;
        RecyclerView recyclerView = this.f12324X;
        if (recyclerView == null) {
            j.n("mRecyclerViewDynamicDetails");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        RecyclerView recyclerView2 = this.f12324X;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewDynamicDetails");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        O6.b bVar = new O6.b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view_long);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        RecyclerView recyclerView3 = this.f12324X;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewDynamicDetails");
            throw null;
        }
        recyclerView3.addItemDecoration(bVar);
        TextView textView = this.f12328b0;
        if (textView == null) {
            j.n("mTextViewReminderViewSample");
            throw null;
        }
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: d8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAddFavoriteFragment f16291b;

            {
                this.f16291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment = this.f16291b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SAMPLE_REMINDER);
                            c1219h.i();
                            mayaAddFavoriteFragment.A1(c1219h);
                            InterfaceC1337b interfaceC1337b = mayaAddFavoriteFragment.f12333g0;
                            if (interfaceC1337b != null) {
                                new MayaFavoriteReminderSampleBottomSheetDialogFragment().show(((MayaAddFavoriteActivity) interfaceC1337b).getSupportFragmentManager(), "alert_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment2 = this.f16291b;
                        Callback.onClick_enter(view2);
                        try {
                            ((MayaAddFavoriteFragment) ((InterfaceC1083a) ((Y7.b) mayaAddFavoriteFragment2.G1()).c.get())).I1();
                            return;
                        } finally {
                        }
                    default:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment3 = this.f16291b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAddFavoriteFragment.H1(mayaAddFavoriteFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        SwitchCompat switchCompat = this.f12327a0;
        if (switchCompat == null) {
            j.n("mSwitchToggleReminderDay");
            throw null;
        }
        switchCompat.setOnCheckedChangeListener(new W2(this, 3));
        View view2 = this.f12330d0;
        if (view2 == null) {
            j.n("mViewReminderChosenDayInnerSection");
            throw null;
        }
        final int i4 = 1;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: d8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAddFavoriteFragment f16291b;

            {
                this.f16291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i4) {
                    case 0:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment = this.f16291b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SAMPLE_REMINDER);
                            c1219h.i();
                            mayaAddFavoriteFragment.A1(c1219h);
                            InterfaceC1337b interfaceC1337b = mayaAddFavoriteFragment.f12333g0;
                            if (interfaceC1337b != null) {
                                new MayaFavoriteReminderSampleBottomSheetDialogFragment().show(((MayaAddFavoriteActivity) interfaceC1337b).getSupportFragmentManager(), "alert_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment2 = this.f16291b;
                        Callback.onClick_enter(view22);
                        try {
                            ((MayaAddFavoriteFragment) ((InterfaceC1083a) ((Y7.b) mayaAddFavoriteFragment2.G1()).c.get())).I1();
                            return;
                        } finally {
                        }
                    default:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment3 = this.f16291b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaAddFavoriteFragment.H1(mayaAddFavoriteFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f12325Y;
        if (button2 == null) {
            j.n("mButtonSave");
            throw null;
        }
        final int i6 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: d8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAddFavoriteFragment f16291b;

            {
                this.f16291b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i6) {
                    case 0:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment = this.f16291b;
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.SAMPLE_REMINDER);
                            c1219h.i();
                            mayaAddFavoriteFragment.A1(c1219h);
                            InterfaceC1337b interfaceC1337b = mayaAddFavoriteFragment.f12333g0;
                            if (interfaceC1337b != null) {
                                new MayaFavoriteReminderSampleBottomSheetDialogFragment().show(((MayaAddFavoriteActivity) interfaceC1337b).getSupportFragmentManager(), "alert_dialog");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment2 = this.f16291b;
                        Callback.onClick_enter(view22);
                        try {
                            ((MayaAddFavoriteFragment) ((InterfaceC1083a) ((Y7.b) mayaAddFavoriteFragment2.G1()).c.get())).I1();
                            return;
                        } finally {
                        }
                    default:
                        MayaAddFavoriteFragment mayaAddFavoriteFragment3 = this.f16291b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaAddFavoriteFragment.H1(mayaAddFavoriteFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        getParentFragmentManager().setFragmentResultListener("request_select_reminder_day", this, new e(this, 28));
        MayaInputLayout mayaInputLayout = this.f12322V;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutFavoriteName");
            throw null;
        }
        mayaInputLayout.setHelperErrorText(getString(R.string.maya_label_required));
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        A a8 = new A(new A5.j(11), (Function0) null, (Function0) null, 14);
        a8.e = new W4.b(this, 16);
        a8.c = new h(mayaInputLayout, 3);
        a8.f1715d = new h(mayaInputLayout, 4);
        inputEditText.addTextChangedListener(a8);
        ((b) G1()).j();
    }
}
