package com.paymaya.mayaui.shop.view.fragment.impl;

import D.C0187u;
import N5.C0447e;
import N5.M;
import N5.Z0;
import O5.a;
import S5.c;
import Xb.C;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import b7.f;
import bc.n;
import cc.G;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelTwoValuesReviewInfoItem;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopReceiptFragment;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import y5.InterfaceC2511c;
import y5.u;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements n, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public MayaLabelTwoValuesReviewInfoItem f14136A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public MayaLabelTwoValuesReviewInfoItem f14137B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public C0447e f14138C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f14139D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Z0 f14140E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public TextView f14141F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public HtmlTextView f14142G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ImageView f14143H0;
    public Group I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public Group f14144J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public Group f14145K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ImageView f14146L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public View f14147M0;
    public Order N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public PaymentConfirmationSummary f14148O0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f14150Q0;
    public C R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public G f14151S0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public M f14153v0;
    public MayaReviewInfoRecyclerView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View f14154x0;
    public View y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public View f14155z0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final f f14149P0 = new f();

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final EnumC1216e f14152T0 = EnumC1216e.RECEIPT;

    public static final void p2(MayaShopReceiptFragment mayaShopReceiptFragment) {
        Object systemService = mayaShopReceiptFragment.requireActivity().getSystemService("clipboard");
        j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String string = mayaShopReceiptFragment.getString(R.string.maya_shop_coupon_code);
        TextView textView = mayaShopReceiptFragment.f14141F0;
        if (textView == null) {
            j.n("mCouponValueTextView");
            throw null;
        }
        String string2 = textView.getText().toString();
        int length = string2.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = j.i(string2.charAt(!z4 ? i : length), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i++;
            } else {
                z4 = true;
            }
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(string, string2.subSequence(i, length + 1).toString()));
        G g8 = mayaShopReceiptFragment.f14151S0;
        if (g8 != null) {
            ((MayaShopV2Activity) g8).g2();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final y5.n H1() {
        return this.f14151S0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return m2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_receipt, (ViewGroup) null, false);
        int i = R.id.additional_message_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.additional_message_view);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.coupon_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.coupon_view);
            if (viewFindChildViewById != null) {
                Z0 z0A = Z0.a(viewFindChildViewById);
                i = R.id.dynamic_fields_bottom_divider_view;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.dynamic_fields_bottom_divider_view);
                if (viewFindChildViewById2 != null) {
                    i = R.id.dynamic_fields_recycler_view;
                    MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_fields_recycler_view);
                    if (mayaReviewInfoRecyclerView != null) {
                        i = R.id.group_transaction_details_all_fields;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details_all_fields);
                        if (group != null) {
                            i = R.id.group_transaction_details_label;
                            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details_label);
                            if (group2 != null) {
                                i = R.id.group_transaction_details_obligatory_fields;
                                Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details_obligatory_fields);
                                if (group3 != null) {
                                    i = R.id.image_view_transaction_details_arrow;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_transaction_details_arrow);
                                    if (imageView != null) {
                                        i = R.id.items_container;
                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.items_container)) != null) {
                                            i = R.id.left_guideline_receipt;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline_receipt)) != null) {
                                                i = R.id.payment_method_receipt_item;
                                                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = (MayaLabelTwoValuesReviewInfoItem) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_receipt_item);
                                                if (mayaLabelTwoValuesReviewInfoItem != null) {
                                                    i = R.id.payment_receipt_items_view;
                                                    if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.payment_receipt_items_view)) != null) {
                                                        i = R.id.reference_id_bottom_divider_view;
                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.reference_id_bottom_divider_view);
                                                        if (viewFindChildViewById3 != null) {
                                                            i = R.id.reference_id_receipt_item;
                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.reference_id_receipt_item);
                                                            if (viewFindChildViewById4 != null) {
                                                                C0447e c0447eA = C0447e.a(viewFindChildViewById4);
                                                                i = R.id.right_guideline_receipt;
                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline_receipt)) != null) {
                                                                    i = R.id.selectable_view_transaction_details;
                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.selectable_view_transaction_details);
                                                                    if (viewFindChildViewById5 != null) {
                                                                        i = R.id.target_item_bottom_divider_view;
                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.target_item_bottom_divider_view);
                                                                        if (viewFindChildViewById6 != null) {
                                                                            i = R.id.target_receipt_item;
                                                                            MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2 = (MayaLabelTwoValuesReviewInfoItem) ViewBindings.findChildViewById(viewInflate, R.id.target_receipt_item);
                                                                            if (mayaLabelTwoValuesReviewInfoItem2 != null) {
                                                                                i = R.id.text_view_transaction_details_label;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_details_label)) != null) {
                                                                                    this.f14153v0 = new M(constraintLayout, textView, constraintLayout, z0A, viewFindChildViewById2, mayaReviewInfoRecyclerView, group, group2, group3, imageView, mayaLabelTwoValuesReviewInfoItem, viewFindChildViewById3, c0447eA, viewFindChildViewById5, viewFindChildViewById6, mayaLabelTwoValuesReviewInfoItem2);
                                                                                    j.f(constraintLayout, "getRoot(...)");
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

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return this.f14152T0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        G g8 = this.f14151S0;
        if (g8 != null) {
            ((MayaShopV2Activity) g8).f();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        G g8 = this.f14151S0;
        if (g8 != null) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) g8;
            mayaShopV2Activity.n1().u(mayaShopV2Activity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaShopV2Activity.getString(R.string.pma_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        final boolean z4 = !this.f14150Q0;
        Group group = this.I0;
        if (group == null) {
            j.n("mGroupTransactionDetailsLabel");
            throw null;
        }
        final boolean z5 = group.getVisibility() == 0;
        C cM2 = m2();
        if (!cM2.f && cM2.f6554g) {
            cM2.z();
        }
        TypedValue typedValue = new TypedValue();
        int i = requireContext().getTheme().resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true) ? typedValue.resourceId : R.color.maya_primary_white;
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        Q1().setVisibility(4);
        h0 h0VarD = h0.d(M1(), new g0() { // from class: cc.F
            @Override // com.paymaya.common.utility.g0
            public final void b(File file) {
                boolean z8 = z4;
                MayaShopReceiptFragment mayaShopReceiptFragment = this;
                if (z8 && z5) {
                    mayaShopReceiptFragment.M1().postDelayed(new androidx.window.layout.adapter.extensions.a(mayaShopReceiptFragment, 4), 50L);
                }
                G g8 = mayaShopReceiptFragment.f14151S0;
                if (g8 != null) {
                    String string = mayaShopReceiptFragment.getString(R.string.maya_shop_share_receipt);
                    Uri uriC = h0.c(mayaShopReceiptFragment.getActivity(), file);
                    MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) g8;
                    mayaShopV2Activity.n1();
                    B5.i.D(mayaShopV2Activity, string, null, uriC);
                }
            }
        });
        h0VarD.e(ContextCompat.getColor(requireContext(), i));
        ImageView imageViewO1 = O1();
        ImageView imageViewN1 = N1();
        TextView textViewK1 = K1();
        CardView cardViewL1 = L1();
        ImageView imageView = this.f14146L0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        ImageView imageView2 = this.f14143H0;
        if (imageView2 == null) {
            j.n("mCouponCopyImageView");
            throw null;
        }
        h0VarD.f(imageViewO1, imageViewN1, textViewK1, cardViewL1, imageView, imageView2);
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        G g8 = this.f14151S0;
        if (g8 == null) {
            return true;
        }
        ((MayaShopV2Activity) g8).f();
        return true;
    }

    public final C m2() {
        C c = this.R0;
        if (c != null) {
            return c;
        }
        j.n("mShopReceiptFragmentPresenter");
        throw null;
    }

    public final void n2() {
        this.f14150Q0 = false;
        ImageView imageView = this.f14146L0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_chevron_down_primary));
        Group group = this.f14144J0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            j.n("mGroupAllTransactionDetails");
            throw null;
        }
    }

    public final void o2() {
        MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = this.f14136A0;
        if (mayaLabelTwoValuesReviewInfoItem == null) {
            j.n("mPaymentMethodItem");
            throw null;
        }
        mayaLabelTwoValuesReviewInfoItem.setVisibility(8);
        View view = this.f14155z0;
        if (view == null) {
            j.n("mTargetFieldBottomDividerView");
            throw null;
        }
        view.setVisibility(8);
        View view2 = this.y0;
        if (view2 == null) {
            j.n("mReferenceIDBottomDividerView");
            throw null;
        }
        MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2 = this.f14137B0;
        if (mayaLabelTwoValuesReviewInfoItem2 != null) {
            view2.setVisibility(mayaLabelTwoValuesReviewInfoItem2.getVisibility() == 0 ? 0 : 8);
        } else {
            j.n("mTargetItem");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f14151S0 = (G) getActivity();
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        this.R0 = new C((com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get());
        m2().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        m2().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14153v0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G g8 = this.f14151S0;
        if (g8 != null) {
            ((MayaShopV2Activity) g8).Q(this);
        }
        Z1("shop");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f14153v0);
        M m = this.f14153v0;
        j.d(m);
        this.w0 = (MayaReviewInfoRecyclerView) m.e;
        M m2 = this.f14153v0;
        j.d(m2);
        this.f14154x0 = m2.i;
        M m3 = this.f14153v0;
        j.d(m3);
        this.y0 = m3.j;
        M m6 = this.f14153v0;
        j.d(m6);
        this.f14155z0 = m6.f3762l;
        M m10 = this.f14153v0;
        j.d(m10);
        this.f14136A0 = (MayaLabelTwoValuesReviewInfoItem) m10.f3763n;
        M m11 = this.f14153v0;
        j.d(m11);
        this.f14137B0 = (MayaLabelTwoValuesReviewInfoItem) m11.f3765p;
        M m12 = this.f14153v0;
        j.d(m12);
        this.f14138C0 = (C0447e) m12.f3764o;
        M m13 = this.f14153v0;
        j.d(m13);
        this.f14139D0 = (TextView) m13.f3758b;
        M m14 = this.f14153v0;
        j.d(m14);
        Z0 z02 = (Z0) m14.f3759d;
        this.f14140E0 = z02;
        this.f14141F0 = z02.e;
        this.f14142G0 = z02.f4045d;
        this.f14143H0 = z02.c;
        M m15 = this.f14153v0;
        j.d(m15);
        this.I0 = (Group) m15.f3760g;
        M m16 = this.f14153v0;
        j.d(m16);
        this.f14144J0 = (Group) m16.f;
        M m17 = this.f14153v0;
        j.d(m17);
        this.f14145K0 = (Group) m17.h;
        M m18 = this.f14153v0;
        j.d(m18);
        this.f14146L0 = (ImageView) m18.m;
        M m19 = this.f14153v0;
        j.d(m19);
        this.f14147M0 = m19.f3761k;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.N0 = (Order) arguments.getParcelable("order");
            this.f14148O0 = (PaymentConfirmationSummary) arguments.getParcelable("payment_confirmation_summary");
            m2().j();
        }
        ImageView imageView = this.f14143H0;
        if (imageView == null) {
            j.n("mCouponCopyImageView");
            throw null;
        }
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopReceiptFragment f9326b;

            {
                this.f9326b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaShopReceiptFragment mayaShopReceiptFragment = this.f9326b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopReceiptFragment.p2(mayaShopReceiptFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaShopReceiptFragment mayaShopReceiptFragment2 = this.f9326b;
                        Callback.onClick_enter(view2);
                        try {
                            Xb.C cM2 = mayaShopReceiptFragment2.m2();
                            boolean z4 = mayaShopReceiptFragment2.f14150Q0;
                            cM2.f = !z4;
                            if (z4) {
                                ((MayaShopReceiptFragment) ((bc.n) cM2.c.get())).n2();
                            } else {
                                cM2.z();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view2 = this.f14147M0;
        if (view2 == null) {
            j.n("mSelectableViewTransactionDetails");
            throw null;
        }
        final int i4 = 1;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: cc.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopReceiptFragment f9326b;

            {
                this.f9326b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i4) {
                    case 0:
                        MayaShopReceiptFragment mayaShopReceiptFragment = this.f9326b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaShopReceiptFragment.p2(mayaShopReceiptFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaShopReceiptFragment mayaShopReceiptFragment2 = this.f9326b;
                        Callback.onClick_enter(view22);
                        try {
                            Xb.C cM2 = mayaShopReceiptFragment2.m2();
                            boolean z4 = mayaShopReceiptFragment2.f14150Q0;
                            cM2.f = !z4;
                            if (z4) {
                                ((MayaShopReceiptFragment) ((bc.n) cM2.c.get())).n2();
                            } else {
                                cM2.z();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        U1();
        a2();
        b2(R.string.maya_label_shop_receipt_title);
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = this.w0;
        if (mayaReviewInfoRecyclerView != null) {
            mayaReviewInfoRecyclerView.setAdapter(this.f14149P0);
        } else {
            j.n("mDynamicFieldsRecyclerView");
            throw null;
        }
    }
}
