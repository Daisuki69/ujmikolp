package com.paymaya.mayaui.qr.view.fragment.impl;

import Bb.c;
import Ja.g;
import Ma.d;
import N5.M;
import Na.q;
import O5.a;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.model.User;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaRequestMoneyActivity;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaRequestMoneyFragment extends BaseFragment implements d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public M f13630S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ConstraintLayout f13631T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ImageView f13632U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f13633V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13634W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13635X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ConstraintLayout f13636Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f13637Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13638a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ConstraintLayout f13639b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f13640c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f13641d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Button f13642e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Button f13643f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Group f13644g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public g f13645h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public q f13646i0;

    public static final void s1(MayaRequestMoneyFragment mayaRequestMoneyFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.CUSTOMIZE);
        mayaRequestMoneyFragment.o1(c1219hH);
        g gVar = (g) mayaRequestMoneyFragment.r1();
        if ("kyc1".equalsIgnoreCase(gVar.f2506d.l())) {
            q qVar = ((MayaRequestMoneyFragment) ((d) gVar.c.get())).f13646i0;
            if (qVar != null) {
                MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment = new MayaRequestMoneyFormFragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("has_generated_new_qr", false);
                mayaRequestMoneyFormFragment.setArguments(bundle);
                AbstractC1236z.h((MayaRequestMoneyActivity) qVar, R.id.fragment_container, mayaRequestMoneyFormFragment);
                return;
            }
            return;
        }
        q qVar2 = ((MayaRequestMoneyFragment) ((d) gVar.c.get())).f13646i0;
        if (qVar2 != null) {
            MayaRequestMoneyActivity mayaRequestMoneyActivity = (MayaRequestMoneyActivity) qVar2;
            String string = mayaRequestMoneyActivity.getString(R.string.maya_label_upgrade_dialog_title);
            j.f(string, "getString(...)");
            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, mayaRequestMoneyActivity.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaRequestMoneyActivity.getString(R.string.maya_label_upgrade_now), new Ag.d(mayaRequestMoneyActivity, 25)), new Pair(mayaRequestMoneyActivity.getString(R.string.maya_label_maybe_later), null), null, 96);
            mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
            mayaAlertBottomSheetDialogFragmentN.show(mayaRequestMoneyActivity.getSupportFragmentManager(), "alert_dialog");
        }
    }

    public static final void t1(MayaRequestMoneyFragment mayaRequestMoneyFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SHARE);
        mayaRequestMoneyFragment.o1(c1219hH);
        g gVar = (g) mayaRequestMoneyFragment.r1();
        User userA = gVar.e.a();
        TransferAppLink transferAppLink = gVar.h;
        if (transferAppLink == null) {
            j.n("mTransferAppLink");
            throw null;
        }
        String strM = C.m(transferAppLink);
        d dVar = (d) gVar.c.get();
        String fullName = userA.getFullName();
        MayaRequestMoneyFragment mayaRequestMoneyFragment2 = (MayaRequestMoneyFragment) dVar;
        mayaRequestMoneyFragment2.getClass();
        String str = String.format("myqr_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        ConstraintLayout constraintLayout = mayaRequestMoneyFragment2.f13631T;
        if (constraintLayout == null) {
            j.n("mViewScreenshot");
            throw null;
        }
        h0 h0VarD = h0.d(constraintLayout, new c(6, mayaRequestMoneyFragment2, fullName, strM));
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = mayaRequestMoneyFragment2.requireContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(R.attr.mayaColorBackgroundWithOpacity, typedValue, true);
        }
        TypedValue typedValue2 = new TypedValue();
        Resources.Theme theme2 = mayaRequestMoneyFragment2.requireContext().getTheme();
        if (theme2 != null) {
            theme2.resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue2, true);
        }
        h0VarD.e(ColorUtils.compositeColors(ContextCompat.getColor(mayaRequestMoneyFragment2.requireContext(), typedValue.resourceId), ContextCompat.getColor(mayaRequestMoneyFragment2.requireContext(), typedValue2.resourceId)));
        ImageView imageView = mayaRequestMoneyFragment2.f13637Z;
        if (imageView == null) {
            j.n("mImageViewVerifiedSellerInfoIcon");
            throw null;
        }
        if (imageView.isShown() && !mayaRequestMoneyFragment2.f10246K.e().isRequestMoneyTileUpdateEnabled()) {
            ImageView imageView2 = mayaRequestMoneyFragment2.f13637Z;
            if (imageView2 == null) {
                j.n("mImageViewVerifiedSellerInfoIcon");
                throw null;
            }
            h0VarD.f(imageView2);
        }
        h0VarD.b(str);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFragment.MayaRequestMoneyFragmentListener");
        this.f13646i0 = (q) activity;
        a aVar = W4.a.e().v().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f13645h0 = new g((com.paymaya.data.preference.a) aVar.e.get(), aVar.X(), aVar.v(), aVar.c());
        ((AbstractC2509a) r1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_request_money, viewGroup, false);
        int i = R.id.amount_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_view);
        if (textView != null) {
            i = R.id.card_container;
            if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_container)) != null) {
                i = R.id.content_scroll;
                if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_scroll)) != null) {
                    i = R.id.custom_qr_options_group;
                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.custom_qr_options_group);
                    if (group != null) {
                        i = R.id.custom_values_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.custom_values_container);
                        if (constraintLayout != null) {
                            i = R.id.dotted_line;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.dotted_line)) != null) {
                                i = R.id.generate_custom_code_button;
                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.generate_custom_code_button);
                                if (button != null) {
                                    i = R.id.maya_logo;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.maya_logo)) != null) {
                                        i = R.id.mobile_number_container;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_container);
                                        if (textView2 != null) {
                                            i = R.id.purpose_text_view;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.purpose_text_view);
                                            if (textView3 != null) {
                                                i = R.id.qr_code_image;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.qr_code_image);
                                                if (imageView != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                    i = R.id.screenshot_container;
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.screenshot_container);
                                                    if (constraintLayout3 != null) {
                                                        i = R.id.share_button;
                                                        Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.share_button);
                                                        if (button2 != null) {
                                                            i = R.id.text_view_transfer_fees_apply;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_fees_apply);
                                                            if (textView4 != null) {
                                                                i = R.id.text_view_username;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_username);
                                                                if (textView5 != null) {
                                                                    i = R.id.title_text_view;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view);
                                                                    if (textView6 != null) {
                                                                        i = R.id.verified_seller_container;
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.verified_seller_container);
                                                                        if (constraintLayout4 != null) {
                                                                            i = R.id.verified_seller_info_icon_image_view;
                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.verified_seller_info_icon_image_view);
                                                                            if (imageView2 != null) {
                                                                                this.f13630S = new M(constraintLayout2, textView, group, constraintLayout, button, textView2, textView3, imageView, constraintLayout3, button2, textView4, textView5, textView6, constraintLayout4, imageView2);
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
        ((AbstractC2509a) r1()).i();
        super.onDestroy();
        this.f13630S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q qVar = this.f13646i0;
        if (qVar != null) {
            ((MayaRequestMoneyActivity) qVar).Q(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0173  */
    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 1358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final Ia.c r1() {
        g gVar = this.f13645h0;
        if (gVar != null) {
            return gVar;
        }
        j.n("mRequestMoneyV3FragmentPresenter");
        throw null;
    }
}
