package com.paymaya.ui.shopv3.view.fragment.impl;

import A7.j;
import Ah.p;
import Lh.d;
import N5.D1;
import N5.O0;
import N5.k1;
import O5.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
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
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.ShareCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseOfficialReceipt;
import com.paymaya.domain.store.C1283s0;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryReceiptFragment;
import d4.AbstractC1331a;
import java.io.File;
import java.util.Arrays;
import o6.C1967a;
import qc.c;
import ve.k;
import we.InterfaceC2407L;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3PurchaseHistoryReceiptFragment extends AbstractBaseReceiptFragmentImpl implements k {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public j f14874U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public InterfaceC2407L f14875V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Handler f14876W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ShopPurchaseHistory f14877X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public O0 f14878Y;

    public static final void e2(ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment) {
        shopV3PurchaseHistoryReceiptFragment.R1();
        Object systemService = shopV3PurchaseHistoryReceiptFragment.requireActivity().getSystemService("clipboard");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String string = ((TextView) shopV3PurchaseHistoryReceiptFragment.V1().f3583d).getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean z5 = kotlin.jvm.internal.j.i(string.charAt(!z4 ? i : length), 32) <= 0;
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
        ((AppCompatTextView) shopV3PurchaseHistoryReceiptFragment.V1().c).setText(shopV3PurchaseHistoryReceiptFragment.getString(R.string.pma_label_copied));
    }

    public static final void f2(ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment) {
        j jVarY1 = shopV3PurchaseHistoryReceiptFragment.Y1();
        ShopPurchaseHistory shopPurchaseHistory = shopV3PurchaseHistoryReceiptFragment.f14877X;
        String strMOrderReferenceNumber = shopPurchaseHistory != null ? shopPurchaseHistory.mOrderReferenceNumber() : null;
        ((BaseFragment) ((k) jVarY1.c.get())).p1();
        p<ShopPurchaseOfficialReceipt> purchaseOfficialReceipt = ((C1283s0) jVarY1.e).f11480b.getPurchaseOfficialReceipt(strMOrderReferenceNumber);
        new d(new d(AbstractC1331a.l(purchaseOfficialReceipt, purchaseOfficialReceipt, b.a()), new C1967a(jVarY1, 17), 2), new c(jVarY1, 12), 0).e();
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void A1() {
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final View E1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_shop_v3_purchase_history_receipt, (ViewGroup) null, false);
        int i = R.id.account_number_barrier_pma_fragment_shop_v3_purchase_history_receipt;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.account_number_barrier_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
            i = R.id.account_number_constraint_group_pma_fragment_shop_v3_purchase_history_receipt;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.account_number_constraint_group_pma_fragment_shop_v3_purchase_history_receipt);
            if (group != null) {
                i = R.id.account_number_label_text_view_pma_fragment_shop_v3_purchase_history_receipt;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_label_text_view_pma_fragment_shop_v3_purchase_history_receipt);
                if (textView != null) {
                    i = R.id.account_number_value_text_view_pma_fragment_shop_v3_purchase_history_receipt;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_value_text_view_pma_fragment_shop_v3_purchase_history_receipt);
                    if (textView2 != null) {
                        i = R.id.amount_divider_pma_fragment_shop_v3_purchase_history_receipt;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.amount_divider_pma_fragment_shop_v3_purchase_history_receipt);
                        if (viewFindChildViewById != null) {
                            i = R.id.amount_text_pma_fragment_shop_v3_purchase_history_receipt;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_pma_fragment_shop_v3_purchase_history_receipt);
                            if (textView3 != null) {
                                i = R.id.amount_title_text_pma_fragment_shop_v3_purchase_history_receipt;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_title_text_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = R.id.date_barrier_pma_fragment_shop_v3_purchase_history_receipt;
                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.date_barrier_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                        i = R.id.date_label_text_pma_fragment_shop_v3_purchase_history_receipt;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.date_label_text_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                            i = R.id.date_text_pma_fragment_shop_v3_purchase_history_receipt;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.date_text_pma_fragment_shop_v3_purchase_history_receipt);
                                            if (textView4 != null) {
                                                i = R.id.label_guide_pma_fragment_shop_v3_purchase_history_receipt;
                                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.label_guide_pma_fragment_shop_v3_purchase_history_receipt);
                                                if (guideline != null) {
                                                    i = R.id.official_receipt_divider_pma_fragment_shop_v3_purchase_history_receipt;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.official_receipt_divider_pma_fragment_shop_v3_purchase_history_receipt);
                                                    if (viewFindChildViewById2 != null) {
                                                        i = R.id.official_receipt_link_text_view_pma_fragment_shop_v3_purchase_history_receipt;
                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.official_receipt_link_text_view_pma_fragment_shop_v3_purchase_history_receipt);
                                                        if (appCompatTextView != null) {
                                                            i = R.id.official_receipt_note_text_view_pma_fragment_shop_v3_purchase_history_receipt;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.official_receipt_note_text_view_pma_fragment_shop_v3_purchase_history_receipt);
                                                            if (textView5 != null) {
                                                                i = R.id.order_coupon_container_view_pma_fragment_shop_v3_purchase_history_receipt;
                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.order_coupon_container_view_pma_fragment_shop_v3_purchase_history_receipt);
                                                                if (viewFindChildViewById3 != null) {
                                                                    D1 d1A = D1.a(viewFindChildViewById3);
                                                                    i = R.id.product_coupon_divider_pma_fragment_shop_v3_purchase_history_receipt;
                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.product_coupon_divider_pma_fragment_shop_v3_purchase_history_receipt);
                                                                    if (viewFindChildViewById4 != null) {
                                                                        i = R.id.recipient_barrier_pma_fragment_shop_v3_purchase_history_recipient;
                                                                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.recipient_barrier_pma_fragment_shop_v3_purchase_history_recipient)) != null) {
                                                                            i = R.id.recipient_group_pma_fragment_shop_v3_purchase_history_receipt;
                                                                            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.recipient_group_pma_fragment_shop_v3_purchase_history_receipt);
                                                                            if (group2 != null) {
                                                                                i = R.id.recipient_label_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_label_text_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                                                                    i = R.id.recipient_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_text_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.reference_id_barrier_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_barrier_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                                                                            i = R.id.reference_id_label_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_label_text_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                                                                                i = R.id.reference_id_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reference_id_text_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.transaction_details_product_name_barrier_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_barrier_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                                    if (barrier != null) {
                                                                                                        i = R.id.transaction_details_product_name_group_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_group_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                                        if (group3 != null) {
                                                                                                            i = R.id.transaction_details_product_name_label_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_label_text_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                                                                                                i = R.id.transaction_details_product_name_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_product_name_text_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                                                if (textView8 != null) {
                                                                                                                    i = R.id.transaction_details_title_text_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_details_title_text_pma_fragment_shop_v3_purchase_history_receipt)) != null) {
                                                                                                                        i = R.id.transaction_status_note_text_view_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_status_note_text_view_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i = R.id.treats_coupon_container_view_pma_fragment_shop_v3_purchase_history_receipt;
                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.treats_coupon_container_view_pma_fragment_shop_v3_purchase_history_receipt);
                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                this.f14878Y = new O0(constraintLayout, group, textView, textView2, viewFindChildViewById, textView3, constraintLayout, textView4, guideline, viewFindChildViewById2, appCompatTextView, textView5, d1A, viewFindChildViewById4, group2, textView6, textView7, barrier, group3, textView8, textView9, k1.a(viewFindChildViewById5));
                                                                                                                                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final D1 V1() {
        O0 o02 = this.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        D1 d12 = (D1) o02.f3828p;
        kotlin.jvm.internal.j.f(d12, "orderCouponContainerView…pV3PurchaseHistoryReceipt");
        return d12;
    }

    public final k1 W1() {
        O0 o02 = this.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        k1 k1Var = (k1) o02.f3835w;
        kotlin.jvm.internal.j.f(k1Var, "treatsCouponContainerVie…pV3PurchaseHistoryReceipt");
        return k1Var;
    }

    public final ConstraintLayout X1() {
        O0 o02 = this.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        ConstraintLayout containerPmaFragmentShopV3PurchaseHistoryReceipt = o02.f;
        kotlin.jvm.internal.j.f(containerPmaFragmentShopV3PurchaseHistoryReceipt, "containerPmaFragmentShopV3PurchaseHistoryReceipt");
        return containerPmaFragmentShopV3PurchaseHistoryReceipt;
    }

    public final j Y1() {
        j jVar = this.f14874U;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mShopReceiptFragmentPresenter");
        throw null;
    }

    public final AppCompatTextView Z1() {
        O0 o02 = this.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        AppCompatTextView appCompatTextView = (AppCompatTextView) o02.f3826n;
        kotlin.jvm.internal.j.f(appCompatTextView, "officialReceiptLinkTextV…pV3PurchaseHistoryReceipt");
        return appCompatTextView;
    }

    public final TextView a2() {
        O0 o02 = this.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        TextView textView = (TextView) o02.f3827o;
        kotlin.jvm.internal.j.f(textView, "officialReceiptNoteTextV…pV3PurchaseHistoryReceipt");
        return textView;
    }

    public final TextView b2() {
        O0 o02 = this.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        TextView textView = (TextView) o02.f3834v;
        kotlin.jvm.internal.j.f(textView, "transactionStatusNoteTex…pV3PurchaseHistoryReceipt");
        return textView;
    }

    public final CardView c2() {
        CardView cardView = (CardView) V1().f3582b;
        kotlin.jvm.internal.j.f(cardView, "getRoot(...)");
        return cardView;
    }

    public final CardView d2() {
        CardView cardView = (CardView) W1().e;
        kotlin.jvm.internal.j.f(cardView, "getRoot(...)");
        return cardView;
    }

    public final void g2(Bitmap bitmap) {
        File file = new File(requireContext().getCacheDir(), "Pictures");
        file.mkdirs();
        File file2 = new File(file, String.format("coupon_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1)));
        C.D0(bitmap, file2);
        Uri uriForFile = FileProvider.getUriForFile(requireContext(), requireContext().getPackageName() + ".fileprovider", file2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        ComponentName componentName = fragmentActivityRequireActivity.getComponentName();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, fragmentActivityRequireActivity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, fragmentActivityRequireActivity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
        action.addFlags(524288);
        action.addFlags(1);
        action.setType(requireContext().getContentResolver().getType(uriForFile));
        action.putExtra("android.intent.extra.STREAM", uriForFile);
        ShareSaveDialogFragment shareSaveDialogFragment = new ShareSaveDialogFragment();
        Bundle bundleE = androidx.media3.datasource.cache.c.e("title", "Share Coupon", "filename", null);
        bundleE.putParcelable("intent", action);
        shareSaveDialogFragment.setArguments(bundleE);
        shareSaveDialogFragment.show(fragmentActivityRequireActivity.getSupportFragmentManager(), "share");
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.RECEIPT;
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onCloseClick() {
        InterfaceC2407L interfaceC2407L = this.f14875V;
        if (interfaceC2407L != null) {
            ((ShopV3Activity) interfaceC2407L).g1();
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("screen", "shop");
        this.f14875V = (InterfaceC2407L) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14874U = new j(aVar.H(), (com.paymaya.data.preference.a) aVar.e.get());
        Y1().h(this);
        this.f14876W = new Handler(Looper.getMainLooper());
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Handler handler = this.f14876W;
        if (handler == null) {
            kotlin.jvm.internal.j.n("mHandler");
            throw null;
        }
        handler.removeCallbacksAndMessages(null);
        Y1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14878Y = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2407L interfaceC2407L = this.f14875V;
        if (interfaceC2407L != null) {
            ((ShopV3Activity) interfaceC2407L).Q(this);
        }
    }

    @Override // com.paymaya.common.base.AbstractBaseReceiptFragmentImpl
    public final void onShareClick() {
        final int i = 0;
        final int i4 = 1;
        j jVarY1 = Y1();
        ShopPurchaseHistory shopPurchaseHistory = ((ShopV3PurchaseHistoryReceiptFragment) ((k) jVarY1.c.get())).f14877X;
        if (jVarY1.x(shopPurchaseHistory != null ? shopPurchaseHistory.mNetwork() : null)) {
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = (ShopV3PurchaseHistoryReceiptFragment) ((k) jVarY1.c.get());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(shopV3PurchaseHistoryReceiptFragment.d2().getWidth(), shopV3PurchaseHistoryReceiptFragment.d2().getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.j.f(bitmapCreateBitmap, "createBitmap(...)");
            shopV3PurchaseHistoryReceiptFragment.d2().draw(new Canvas(bitmapCreateBitmap));
            shopV3PurchaseHistoryReceiptFragment.g2(bitmapCreateBitmap);
            return;
        }
        String strMCode = shopPurchaseHistory != null ? shopPurchaseHistory.mCode() : null;
        if (strMCode != null && !C2576A.H(strMCode) && (shopPurchaseHistory == null || !shopPurchaseHistory.mIsGifted())) {
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment2 = (ShopV3PurchaseHistoryReceiptFragment) ((k) jVarY1.c.get());
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(shopV3PurchaseHistoryReceiptFragment2.c2().getWidth(), shopV3PurchaseHistoryReceiptFragment2.c2().getHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.j.f(bitmapCreateBitmap2, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            ((FrameLayout) shopV3PurchaseHistoryReceiptFragment2.V1().e).setVisibility(8);
            shopV3PurchaseHistoryReceiptFragment2.c2().draw(canvas);
            ((FrameLayout) shopV3PurchaseHistoryReceiptFragment2.V1().e).setVisibility(0);
            shopV3PurchaseHistoryReceiptFragment2.g2(bitmapCreateBitmap2);
            return;
        }
        if (!"DISBURSEMENT_SUCCESSFUL".equals(shopPurchaseHistory != null ? shopPurchaseHistory.mStatus() : null) || !shopPurchaseHistory.mWithReceipt() || !((com.paymaya.data.preference.a) jVarY1.f).e().isShopPurchaseDigitalOREnabled()) {
            final ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment3 = (ShopV3PurchaseHistoryReceiptFragment) ((k) jVarY1.c.get());
            shopV3PurchaseHistoryReceiptFragment3.getClass();
            String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
            h0 h0VarD = h0.d(shopV3PurchaseHistoryReceiptFragment3.t1(), new g0(shopV3PurchaseHistoryReceiptFragment3) { // from class: we.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ShopV3PurchaseHistoryReceiptFragment f20744b;

                {
                    this.f20744b = shopV3PurchaseHistoryReceiptFragment3;
                }

                @Override // com.paymaya.common.utility.g0
                public final void b(File file) {
                    switch (i) {
                        case 0:
                            h0.g(this.f20744b.getActivity(), "Share Receipt", file);
                            break;
                        default:
                            h0.g(this.f20744b.getActivity(), "Share Receipt", file);
                            break;
                    }
                }
            });
            h0VarD.f11211g = shopV3PurchaseHistoryReceiptFragment3.getResources().getDimensionPixelSize(R.dimen.pma_margin_large);
            h0VarD.e(ContextCompat.getColor(shopV3PurchaseHistoryReceiptFragment3.requireContext(), R.color.light_light));
            h0VarD.f11209b = shopV3PurchaseHistoryReceiptFragment3.r1();
            h0VarD.b(str);
            return;
        }
        final ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment4 = (ShopV3PurchaseHistoryReceiptFragment) ((k) jVarY1.c.get());
        shopV3PurchaseHistoryReceiptFragment4.getClass();
        String str2 = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        h0 h0VarD2 = h0.d(shopV3PurchaseHistoryReceiptFragment4.t1(), new g0(shopV3PurchaseHistoryReceiptFragment4) { // from class: we.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopV3PurchaseHistoryReceiptFragment f20744b;

            {
                this.f20744b = shopV3PurchaseHistoryReceiptFragment4;
            }

            @Override // com.paymaya.common.utility.g0
            public final void b(File file) {
                switch (i4) {
                    case 0:
                        h0.g(this.f20744b.getActivity(), "Share Receipt", file);
                        break;
                    default:
                        h0.g(this.f20744b.getActivity(), "Share Receipt", file);
                        break;
                }
            }
        });
        O0 o02 = shopV3PurchaseHistoryReceiptFragment4.f14878Y;
        kotlin.jvm.internal.j.d(o02);
        h0VarD2.f(o02.f3823g, shopV3PurchaseHistoryReceiptFragment4.Z1(), shopV3PurchaseHistoryReceiptFragment4.a2());
        h0VarD2.f11211g = shopV3PurchaseHistoryReceiptFragment4.getResources().getDimensionPixelSize(R.dimen.pma_margin_large);
        h0VarD2.e(ContextCompat.getColor(shopV3PurchaseHistoryReceiptFragment4.requireContext(), R.color.light_light));
        h0VarD2.f11209b = shopV3PurchaseHistoryReceiptFragment4.r1();
        h0VarD2.b(str2);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14877X = (ShopPurchaseHistory) arguments.getParcelable("shop_purchase_history");
            Y1().j();
        }
        final int i = 0;
        ((FrameLayout) V1().e).setOnClickListener(new View.OnClickListener(this) { // from class: we.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopV3PurchaseHistoryReceiptFragment f20742b;

            {
                this.f20742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = this.f20742b;
                        Callback.onClick_enter(view2);
                        try {
                            ShopV3PurchaseHistoryReceiptFragment.e2(shopV3PurchaseHistoryReceiptFragment);
                            return;
                        } finally {
                        }
                    default:
                        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment2 = this.f20742b;
                        Callback.onClick_enter(view2);
                        try {
                            ShopV3PurchaseHistoryReceiptFragment.f2(shopV3PurchaseHistoryReceiptFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        Z1().setOnClickListener(new View.OnClickListener(this) { // from class: we.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopV3PurchaseHistoryReceiptFragment f20742b;

            {
                this.f20742b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = this.f20742b;
                        Callback.onClick_enter(view2);
                        try {
                            ShopV3PurchaseHistoryReceiptFragment.e2(shopV3PurchaseHistoryReceiptFragment);
                            return;
                        } finally {
                        }
                    default:
                        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment2 = this.f20742b;
                        Callback.onClick_enter(view2);
                        try {
                            ShopV3PurchaseHistoryReceiptFragment.f2(shopV3PurchaseHistoryReceiptFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        y1();
        v1();
        C1();
        U1();
    }
}
