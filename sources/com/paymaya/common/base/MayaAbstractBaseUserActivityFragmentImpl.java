package com.paymaya.common.base;

import N5.K;
import U6.d;
import a7.C0633A;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import com.paymaya.common.widget.TextViewWithImagesKt;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import i2.C1585a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;
import y5.p;
import y5.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaAbstractBaseUserActivityFragmentImpl extends MayaBaseFragment implements v {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public K f10297U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ConstraintLayout f10298V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f10299W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f10300X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f10301Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f10302Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageView f10303a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ImageView f10304b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f10305c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ImageView f10306d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f10307e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f10308f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f10309g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f10310h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f10311i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ConstraintLayout f10312j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ImageView f10313k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f10314l0;
    public ImageView m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public RecyclerView f10315n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public TextViewWithImagesKt f10316o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f10317p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public FrameLayout f10318q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public LinearLayoutManager f10319r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f10320s0;
    public p t0;

    public static final void O1(MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl) {
        AbstractC2252a abstractC2252aG1 = mayaAbstractBaseUserActivityFragmentImpl.G1();
        Bundle arguments = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) abstractC2252aG1.c.get())).getArguments();
        if (arguments != null ? arguments.getBoolean("is_from_dashboard") : false) {
            p pVar = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) abstractC2252aG1.c.get())).t0;
            if (pVar != null) {
                pVar.finish();
                return;
            }
            return;
        }
        p pVar2 = ((MayaAbstractBaseUserActivityFragmentImpl) ((v) abstractC2252aG1.c.get())).t0;
        if (pVar2 != null) {
            ((MayaTransactionsActivity) pVar2).onBackPressed();
        }
    }

    public abstract AbstractC2252a G1();

    public final ImageView H1() {
        ImageView imageView = this.f10303a0;
        if (imageView != null) {
            return imageView;
        }
        j.n("mImageViewActivityIcon");
        throw null;
    }

    public final TextView I1() {
        TextView textView = this.f10301Y;
        if (textView != null) {
            return textView;
        }
        j.n("mTextViewActivityAmount");
        throw null;
    }

    public final TextView J1() {
        TextView textView = this.f10307e0;
        if (textView != null) {
            return textView;
        }
        j.n("mTextViewActivityStatus");
        throw null;
    }

    public final String K1() {
        String string = getString(R.string.maya_php_currency);
        j.f(string, "getString(...)");
        return string;
    }

    public final String L1() {
        String string = getString(R.string.maya_label_receipt_reference_id);
        j.f(string, "getString(...)");
        return string;
    }

    public final UserActivity M1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (UserActivity) arguments.getParcelable("user_activity");
        }
        return null;
    }

    public final void N1() {
        View view = this.f10309g0;
        if (view == null) {
            j.n("mViewStaticMessageDivider");
            throw null;
        }
        view.setVisibility(8);
        TextView textView = this.f10310h0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            j.n("mTextViewStaticMessage");
            throw null;
        }
    }

    public final void P1() {
        H1().setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_user_activity_icon_default));
    }

    public final void Q1(String str) {
        TextView textView = this.f10302Z;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mTextViewActivityTarget");
            throw null;
        }
    }

    public final void R1(C0633A c0633a) {
        d dVar = this.f10320s0;
        if (dVar != null) {
            ArrayList oldList = dVar.f5955b;
            j.g(oldList, "oldList");
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new J7.d(oldList, c0633a));
            j.f(diffResultCalculateDiff, "calculateDiff(...)");
            oldList.clear();
            oldList.addAll(c0633a);
            diffResultCalculateDiff.dispatchUpdatesTo(dVar);
        }
    }

    public void S1() {
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.DETAILS);
        c1219h.n(17);
        c1219h.t(EnumC1217f.SHARE_OR_SAVE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        UserActivity userActivityM1 = M1();
        c1219h.j.put("service", userActivityM1 != null ? userActivityM1.mMethod() : null);
        c1219h.i();
        z1(c1219h);
    }

    public final void T1(String str) {
        TextView textView = this.f10310h0;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mTextViewStaticMessage");
            throw null;
        }
    }

    public final void U1(String str, String str2) {
        String str3 = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        ConstraintLayout constraintLayout = this.f10298V;
        if (constraintLayout == null) {
            j.n("mViewContainer");
            throw null;
        }
        h0 h0VarD = h0.d(constraintLayout, new C1585a(7, this, str, str2));
        h0VarD.e(ContextCompat.getColor(requireContext(), R.color.maya_shades_of_grey_1));
        ImageView imageView = this.f10300X;
        if (imageView == null) {
            j.n("mImageViewClose");
            throw null;
        }
        TextViewWithImagesKt textViewWithImagesKt = this.f10316o0;
        if (textViewWithImagesKt == null) {
            j.n("mButtonShare");
            throw null;
        }
        TextView textView = this.f10317p0;
        if (textView == null) {
            j.n("mTextViewReport");
            throw null;
        }
        h0VarD.f(imageView, textViewWithImagesKt, textView);
        h0VarD.b(str3);
    }

    public final void V1() {
        TextViewWithImagesKt textViewWithImagesKt = this.f10316o0;
        if (textViewWithImagesKt != null) {
            textViewWithImagesKt.setVisibility(0);
        } else {
            j.n("mButtonShare");
            throw null;
        }
    }

    public final void W1() {
        View view = this.f10309g0;
        if (view == null) {
            j.n("mViewStaticMessageDivider");
            throw null;
        }
        view.setVisibility(0);
        TextView textView = this.f10310h0;
        if (textView != null) {
            textView.setVisibility(0);
        } else {
            j.n("mTextViewStaticMessage");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        c1219hM1.r(EnumC1216e.DETAILS);
        c1219hM1.i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_base_user_activity_container, viewGroup, false);
        int i = R.id.barrier_activity_message;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_activity_message)) != null) {
            i = R.id.barrier_activity_static_message;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_activity_static_message)) != null) {
                i = R.id.barrier_activity_target;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_activity_target)) != null) {
                    i = R.id.button_share;
                    TextViewWithImagesKt textViewWithImagesKt = (TextViewWithImagesKt) ViewBindings.findChildViewById(viewInflate, R.id.button_share);
                    if (textViewWithImagesKt != null) {
                        i = R.id.guideline_activity_status_date;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_activity_status_date)) != null) {
                            i = R.id.image_view_activity_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_activity_icon);
                            if (imageView != null) {
                                i = R.id.image_view_activity_status_icon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_activity_status_icon);
                                if (imageView2 != null) {
                                    i = R.id.image_view_activity_sub_icon;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_activity_sub_icon);
                                    if (imageView3 != null) {
                                        i = R.id.image_view_close_icon;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_close_icon);
                                        if (appCompatImageView != null) {
                                            i = R.id.image_view_decoration_thumbnail;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_decoration_thumbnail);
                                            if (imageView4 != null) {
                                                i = R.id.image_view_maya_logo;
                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maya_logo)) != null) {
                                                    i = R.id.image_view_message_arrow;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_message_arrow);
                                                    if (imageView5 != null) {
                                                        i = R.id.recycler_view_label_value_fields;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_label_value_fields);
                                                        if (recyclerView != null) {
                                                            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                            i = R.id.space_decorated_message;
                                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_decorated_message)) != null) {
                                                                i = R.id.space_left_header_inset;
                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_left_header_inset)) != null) {
                                                                    i = R.id.space_right_header_inset;
                                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_right_header_inset)) != null) {
                                                                        i = R.id.text_view_activity_action;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_action);
                                                                        if (textView != null) {
                                                                            i = R.id.text_view_activity_amount;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_amount);
                                                                            if (textView2 != null) {
                                                                                i = R.id.text_view_activity_date_time;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_date_time);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.text_view_activity_decorated_message;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_decorated_message);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.text_view_activity_information;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_information);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.text_view_activity_message;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_message);
                                                                                            if (textView6 != null) {
                                                                                                i = R.id.text_view_activity_status;
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_status);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.text_view_activity_target;
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_activity_target);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.text_view_powered_by_giphy_label;
                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_powered_by_giphy_label);
                                                                                                        if (appCompatTextView != null) {
                                                                                                            i = R.id.text_view_report;
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_report);
                                                                                                            if (textView9 != null) {
                                                                                                                i = R.id.text_view_static_message;
                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_static_message);
                                                                                                                if (textView10 != null) {
                                                                                                                    i = R.id.view_activity_header;
                                                                                                                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_activity_header)) != null) {
                                                                                                                        i = R.id.view_container;
                                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_container);
                                                                                                                        if (constraintLayout != null) {
                                                                                                                            i = R.id.view_container_decorated_message;
                                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_container_decorated_message);
                                                                                                                            if (constraintLayout2 != null) {
                                                                                                                                i = R.id.view_custom_view;
                                                                                                                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.view_custom_view);
                                                                                                                                if (frameLayout != null) {
                                                                                                                                    i = R.id.view_divider_static_message;
                                                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_static_message);
                                                                                                                                    if (viewFindChildViewById != null) {
                                                                                                                                        this.f10297U = new K(nestedScrollView, textViewWithImagesKt, imageView, imageView2, imageView3, appCompatImageView, imageView4, imageView5, recyclerView, nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, appCompatTextView, textView9, textView10, constraintLayout, constraintLayout2, frameLayout, viewFindChildViewById);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final int i = 0;
        final int i4 = 1;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        K k8 = this.f10297U;
        j.d(k8);
        j.g((NestedScrollView) k8.f3704q, "<set-?>");
        K k10 = this.f10297U;
        j.d(k10);
        this.f10298V = k10.f3696b;
        K k11 = this.f10297U;
        j.d(k11);
        this.f10299W = k11.f3697d;
        K k12 = this.f10297U;
        j.d(k12);
        this.f10300X = (AppCompatImageView) k12.f3710w;
        K k13 = this.f10297U;
        j.d(k13);
        this.f10301Y = k13.f;
        K k14 = this.f10297U;
        j.d(k14);
        this.f10302Z = k14.m;
        K k15 = this.f10297U;
        j.d(k15);
        this.f10303a0 = k15.f3699k;
        K k16 = this.f10297U;
        j.d(k16);
        this.f10304b0 = (ImageView) k16.f3707t;
        K k17 = this.f10297U;
        j.d(k17);
        this.f10305c0 = k17.i;
        K k18 = this.f10297U;
        j.d(k18);
        this.f10306d0 = (ImageView) k18.f3706s;
        K k19 = this.f10297U;
        j.d(k19);
        this.f10307e0 = k19.f3700l;
        K k20 = this.f10297U;
        j.d(k20);
        this.f10308f0 = k20.f3698g;
        K k21 = this.f10297U;
        j.d(k21);
        this.f10309g0 = k21.c;
        K k22 = this.f10297U;
        j.d(k22);
        this.f10310h0 = (TextView) k22.f3702o;
        K k23 = this.f10297U;
        j.d(k23);
        this.f10311i0 = k23.j;
        K k24 = this.f10297U;
        j.d(k24);
        this.f10312j0 = k24.e;
        K k25 = this.f10297U;
        j.d(k25);
        this.f10314l0 = k25.h;
        K k26 = this.f10297U;
        j.d(k26);
        this.f10313k0 = (ImageView) k26.f3708u;
        j.d(this.f10297U);
        K k27 = this.f10297U;
        j.d(k27);
        this.m0 = (ImageView) k27.f3709v;
        K k28 = this.f10297U;
        j.d(k28);
        this.f10315n0 = (RecyclerView) k28.f3711x;
        K k29 = this.f10297U;
        j.d(k29);
        this.f10316o0 = (TextViewWithImagesKt) k29.f3705r;
        K k30 = this.f10297U;
        j.d(k30);
        this.f10317p0 = (TextView) k30.f3701n;
        K k31 = this.f10297U;
        j.d(k31);
        this.f10318q0 = (FrameLayout) k31.f3712y;
        this.f10319r0 = new LinearLayoutManager(getContext(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        d dVar = new d(contextRequireContext);
        this.f10320s0 = dVar;
        RecyclerView recyclerView = this.f10315n0;
        if (recyclerView == null) {
            j.n("mRecyclerViewLabelValueFields");
            throw null;
        }
        recyclerView.setAdapter(dVar);
        RecyclerView recyclerView2 = this.f10315n0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewLabelValueFields");
            throw null;
        }
        recyclerView2.setLayoutManager(this.f10319r0);
        ImageView imageView = this.f10300X;
        if (imageView == null) {
            j.n("mImageViewClose");
            throw null;
        }
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: y5.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseUserActivityFragmentImpl f21072b;

            {
                this.f21072b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAbstractBaseUserActivityFragmentImpl.O1(mayaAbstractBaseUserActivityFragmentImpl);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseUserActivityFragmentImpl2.S1();
                            return;
                        } finally {
                        }
                    default:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl3 = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.GET_HELP);
                            c1219h.i();
                            mayaAbstractBaseUserActivityFragmentImpl3.A1(c1219h);
                            p pVar = mayaAbstractBaseUserActivityFragmentImpl3.t0;
                            if (pVar != null) {
                                ((MayaTransactionsActivity) pVar).X1();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextViewWithImagesKt textViewWithImagesKt = this.f10316o0;
        if (textViewWithImagesKt == null) {
            j.n("mButtonShare");
            throw null;
        }
        textViewWithImagesKt.setOnClickListener(new View.OnClickListener(this) { // from class: y5.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseUserActivityFragmentImpl f21072b;

            {
                this.f21072b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAbstractBaseUserActivityFragmentImpl.O1(mayaAbstractBaseUserActivityFragmentImpl);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseUserActivityFragmentImpl2.S1();
                            return;
                        } finally {
                        }
                    default:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl3 = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.GET_HELP);
                            c1219h.i();
                            mayaAbstractBaseUserActivityFragmentImpl3.A1(c1219h);
                            p pVar = mayaAbstractBaseUserActivityFragmentImpl3.t0;
                            if (pVar != null) {
                                ((MayaTransactionsActivity) pVar).X1();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f10317p0;
        if (textView == null) {
            j.n("mTextViewReport");
            throw null;
        }
        final int i6 = 2;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: y5.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseUserActivityFragmentImpl f21072b;

            {
                this.f21072b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaAbstractBaseUserActivityFragmentImpl.O1(mayaAbstractBaseUserActivityFragmentImpl);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl2 = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseUserActivityFragmentImpl2.S1();
                            return;
                        } finally {
                        }
                    default:
                        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl3 = this.f21072b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.GET_HELP);
                            c1219h.i();
                            mayaAbstractBaseUserActivityFragmentImpl3.A1(c1219h);
                            p pVar = mayaAbstractBaseUserActivityFragmentImpl3.t0;
                            if (pVar != null) {
                                ((MayaTransactionsActivity) pVar).X1();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        UserActivity userActivityM1 = M1();
        c1219hM1.j.put("service", userActivityM1 != null ? userActivityM1.mMethod() : null);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.ACTIVITY_LIST;
    }
}
