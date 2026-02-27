package com.paymaya.ui.shopv3.view.fragment.impl;

import Bb.a;
import N5.D1;
import N5.K;
import N5.k1;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import l9.C1803a;
import qf.d;
import v.AbstractC2329d;
import ve.l;
import we.InterfaceC2408M;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3ReceiptFragment extends AbstractBaseReceiptFragmentImpl implements l {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public K f14879U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Order f14880V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public PaymentConfirmationSummary f14881W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Handler f14882X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f14883Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2408M f14884Z;

    public static final void c2(ShopV3ReceiptFragment shopV3ReceiptFragment) {
        shopV3ReceiptFragment.R1();
        Object systemService = shopV3ReceiptFragment.requireActivity().getSystemService("clipboard");
        j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String string = ((TextView) shopV3ReceiptFragment.V1().f3583d).getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = j.i(string.charAt(!z4 ? i : length), 32) <= 0;
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
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Coupon Code", string.subSequence(i, length + 1).toString()));
        ((AppCompatTextView) shopV3ReceiptFragment.V1().c).setText(shopV3ReceiptFragment.getString(R.string.pma_label_copied));
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void A1() {
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final View E1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_receipt, (ViewGroup) null, false);
        int i = R.id.amount_divider_pma_fragment_shop_receipt;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.amount_divider_pma_fragment_shop_receipt);
        if (viewFindChildViewById != null) {
            i = R.id.amount_text_pma_fragment_shop_receipt;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_pma_fragment_shop_receipt);
            if (textView != null) {
                i = R.id.amount_title_text_pma_fragment_shop_receipt;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_title_text_pma_fragment_shop_receipt)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.fund_source_barrier_pma_fragment_shop_receipt;
                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_barrier_pma_fragment_shop_receipt)) != null) {
                        i = R.id.fund_source_group_pma_fragment_shop_receipt;
                        if (((Group) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_group_pma_fragment_shop_receipt)) != null) {
                            i = R.id.fund_source_label_text_pma_fragment_shop_receipt;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_label_text_pma_fragment_shop_receipt);
                            if (textView2 != null) {
                                i = R.id.fund_source_text_pma_fragment_shop_receipt;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_text_pma_fragment_shop_receipt);
                                if (textView3 != null) {
                                    i = R.id.label_guide_pma_fragment_shop_receipt;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.label_guide_pma_fragment_shop_receipt);
                                    if (guideline != null) {
                                        i = R.id.message_text_pma_fragment_shop_receipt;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.message_text_pma_fragment_shop_receipt);
                                        if (textView4 != null) {
                                            i = R.id.order_coupon_container_view_pma_fragment_shop_receipt;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.order_coupon_container_view_pma_fragment_shop_receipt);
                                            if (viewFindChildViewById2 != null) {
                                                D1 d1A = D1.a(viewFindChildViewById2);
                                                i = R.id.payment_reference_id_barrier_pma_fragment_shop_receipt;
                                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.payment_reference_id_barrier_pma_fragment_shop_receipt)) != null) {
                                                    i = R.id.payment_reference_id_label_text_pma_fragment_shop_receipt;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_reference_id_label_text_pma_fragment_shop_receipt);
                                                    if (textView5 != null) {
                                                        i = R.id.payment_reference_id_text_pma_fragment_shop_receipt;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_reference_id_text_pma_fragment_shop_receipt);
                                                        if (textView6 != null) {
                                                            i = R.id.product_container_pma_fragment_shop_receipt;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.product_container_pma_fragment_shop_receipt);
                                                            if (relativeLayout != null) {
                                                                i = R.id.product_divider_pma_fragment_shop_receipt;
                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.product_divider_pma_fragment_shop_receipt);
                                                                if (viewFindChildViewById3 != null) {
                                                                    i = R.id.product_image_view_pma_fragment_shop_receipt;
                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.product_image_view_pma_fragment_shop_receipt);
                                                                    if (imageView != null) {
                                                                        i = R.id.product_name_label_text_pma_fragment_shop_receipt;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_label_text_pma_fragment_shop_receipt)) != null) {
                                                                            i = R.id.product_name_text_pma_fragment_shop_receipt;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_text_pma_fragment_shop_receipt);
                                                                            if (textView7 != null) {
                                                                                i = R.id.recipient_barrier_pma_fragment_shop_recipient;
                                                                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.recipient_barrier_pma_fragment_shop_recipient)) != null) {
                                                                                    i = R.id.recipient_group_pma_fragment_shop_receipt;
                                                                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.recipient_group_pma_fragment_shop_receipt);
                                                                                    if (group != null) {
                                                                                        i = R.id.recipient_label_text_pma_fragment_shop_receipt;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_label_text_pma_fragment_shop_receipt);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.recipient_text_pma_fragment_shop_receipt;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_text_pma_fragment_shop_receipt);
                                                                                            if (textView9 != null) {
                                                                                                i = R.id.transaction_details_product_name_barrier_pma_fragment_shop_receipt;
                                                                                                Barrier barrier = (Barrier) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_barrier_pma_fragment_shop_receipt);
                                                                                                if (barrier != null) {
                                                                                                    i = R.id.transaction_details_product_name_group_pma_fragment_shop_receipt;
                                                                                                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_group_pma_fragment_shop_receipt);
                                                                                                    if (group2 != null) {
                                                                                                        i = R.id.transaction_details_product_name_label_text_pma_fragment_shop_receipt;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_label_text_pma_fragment_shop_receipt);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.transaction_details_product_name_text_pma_fragment_shop_receipt;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_text_pma_fragment_shop_receipt);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.transaction_details_title_text_pma_fragment_shop_receipt;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_title_text_pma_fragment_shop_receipt)) != null) {
                                                                                                                    i = R.id.transaction_status_note_text_view_pma_fragment_shop_receipt;
                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_status_note_text_view_pma_fragment_shop_receipt);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i = R.id.treats_coupon_container_view_pma_fragment_shop_receipt;
                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.treats_coupon_container_view_pma_fragment_shop_receipt);
                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                            this.f14879U = new K(constraintLayout, viewFindChildViewById, textView, constraintLayout, textView2, textView3, guideline, textView4, d1A, textView5, textView6, relativeLayout, viewFindChildViewById3, imageView, textView7, group, textView8, textView9, barrier, group2, textView10, textView11, textView12, k1.a(viewFindChildViewById4));
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

    public final D1 V1() {
        K k8 = this.f14879U;
        j.d(k8);
        D1 orderCouponContainerViewPmaFragmentShopReceipt = (D1) k8.f3704q;
        j.f(orderCouponContainerViewPmaFragmentShopReceipt, "orderCouponContainerViewPmaFragmentShopReceipt");
        return orderCouponContainerViewPmaFragmentShopReceipt;
    }

    public final k1 W1() {
        K k8 = this.f14879U;
        j.d(k8);
        k1 treatsCouponContainerViewPmaFragmentShopReceipt = (k1) k8.f3712y;
        j.f(treatsCouponContainerViewPmaFragmentShopReceipt, "treatsCouponContainerViewPmaFragmentShopReceipt");
        return treatsCouponContainerViewPmaFragmentShopReceipt;
    }

    public final ConstraintLayout X1() {
        K k8 = this.f14879U;
        j.d(k8);
        ConstraintLayout containerPmaFragmentShopReceipt = k8.e;
        j.f(containerPmaFragmentShopReceipt, "containerPmaFragmentShopReceipt");
        return containerPmaFragmentShopReceipt;
    }

    public final TextView Y1() {
        K k8 = this.f14879U;
        j.d(k8);
        TextView recipientLabelTextPmaFragmentShopReceipt = k8.m;
        j.f(recipientLabelTextPmaFragmentShopReceipt, "recipientLabelTextPmaFragmentShopReceipt");
        return recipientLabelTextPmaFragmentShopReceipt;
    }

    public final TextView Z1() {
        K k8 = this.f14879U;
        j.d(k8);
        TextView textView = (TextView) k8.f3711x;
        j.f(textView, "transactionStatusNoteTex…iewPmaFragmentShopReceipt");
        return textView;
    }

    public final CardView a2() {
        CardView cardView = (CardView) V1().f3582b;
        j.f(cardView, "getRoot(...)");
        return cardView;
    }

    public final CardView b2() {
        CardView cardView = (CardView) W1().e;
        j.f(cardView, "getRoot(...)");
        return cardView;
    }

    public final void d2(Bitmap bitmap) {
        File file = new File(requireContext().getCacheDir(), "Pictures");
        file.mkdirs();
        File file2 = new File(file, String.format("coupon_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1)));
        C.D0(bitmap, file2);
        Uri uriForFile = FileProvider.getUriForFile(requireContext(), requireContext().getPackageName() + ".fileprovider", file2);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        intent.setDataAndType(uriForFile, requireContext().getContentResolver().getType(uriForFile));
        startActivity(Intent.createChooser(intent, "Share Coupon"));
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.RECEIPT;
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onCloseClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BACK_TO_HOME);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", "shop");
        o1(c1219hH);
        InterfaceC2408M interfaceC2408M = this.f14884Z;
        if (interfaceC2408M != null) {
            interfaceC2408M.f();
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("screen", "shop");
        this.f14884Z = (InterfaceC2408M) getActivity();
        O5.a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        a aVar2 = new a((com.paymaya.data.preference.a) aVar.e.get(), 28);
        this.f14883Y = aVar2;
        aVar2.h(this);
        this.f14882X = new Handler(Looper.getMainLooper());
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Handler handler = this.f14882X;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        a aVar = this.f14883Y;
        if (aVar == null) {
            j.n("mShopV3ReceiptFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14879U = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2408M interfaceC2408M = this.f14884Z;
        if (interfaceC2408M != null) {
            interfaceC2408M.Q(this);
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onShareClick() {
        String strMCode;
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SHARE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", "shop");
        o1(c1219hH);
        a aVar = this.f14883Y;
        if (aVar == null) {
            j.n("mShopV3ReceiptFragmentPresenter");
            throw null;
        }
        Order order = this.f14880V;
        PaymentConfirmationSummary paymentConfirmationSummary = this.f14881W;
        ProductV3 targetProduct = paymentConfirmationSummary != null ? paymentConfirmationSummary.getTargetProduct() : null;
        if (order == null || (strMCode = order.mCode()) == null || C2576A.H(strMCode) || targetProduct == null) {
            ShopV3ReceiptFragment shopV3ReceiptFragment = (ShopV3ReceiptFragment) ((l) aVar.c.get());
            shopV3ReceiptFragment.getClass();
            String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
            h0 h0VarD = h0.d(shopV3ReceiptFragment.t1(), new C1803a(shopV3ReceiptFragment, 25));
            h0VarD.f11211g = shopV3ReceiptFragment.getResources().getDimensionPixelSize(R.dimen.pma_margin_large);
            h0VarD.e(ContextCompat.getColor(shopV3ReceiptFragment.requireContext(), R.color.light_light));
            h0VarD.f11209b = shopV3ReceiptFragment.r1();
            h0VarD.f(shopV3ReceiptFragment.u1());
            h0VarD.b(str);
            return;
        }
        if (targetProduct.isProductShareTreats()) {
            ShopV3ReceiptFragment shopV3ReceiptFragment2 = (ShopV3ReceiptFragment) ((l) aVar.c.get());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(shopV3ReceiptFragment2.b2().getWidth(), shopV3ReceiptFragment2.b2().getHeight(), Bitmap.Config.ARGB_8888);
            j.f(bitmapCreateBitmap, "createBitmap(...)");
            shopV3ReceiptFragment2.b2().draw(new Canvas(bitmapCreateBitmap));
            shopV3ReceiptFragment2.d2(bitmapCreateBitmap);
            return;
        }
        ShopV3ReceiptFragment shopV3ReceiptFragment3 = (ShopV3ReceiptFragment) ((l) aVar.c.get());
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(shopV3ReceiptFragment3.a2().getWidth(), shopV3ReceiptFragment3.a2().getHeight(), Bitmap.Config.ARGB_8888);
        j.f(bitmapCreateBitmap2, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        ((FrameLayout) shopV3ReceiptFragment3.V1().e).setVisibility(8);
        shopV3ReceiptFragment3.a2().draw(canvas);
        ((FrameLayout) shopV3ReceiptFragment3.V1().e).setVisibility(0);
        shopV3ReceiptFragment3.d2(bitmapCreateBitmap2);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14880V = (Order) arguments.getParcelable("order");
            this.f14881W = (PaymentConfirmationSummary) arguments.getParcelable("payment_confirmation_summary");
            a aVar = this.f14883Y;
            if (aVar == null) {
                j.n("mShopV3ReceiptFragmentPresenter");
                throw null;
            }
            aVar.j();
        }
        ((FrameLayout) V1().e).setOnClickListener(new d(this, 10));
        v1();
        U1();
    }
}
