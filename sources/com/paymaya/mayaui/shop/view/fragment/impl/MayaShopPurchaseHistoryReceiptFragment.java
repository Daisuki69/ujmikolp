package com.paymaya.mayaui.shop.view.fragment.impl;

import D.C0187u;
import M5.e;
import N5.C0447e;
import N5.M;
import N5.Z0;
import O5.a;
import S5.c;
import W4.b;
import Xb.B;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import b7.l;
import bc.m;
import c7.C1079c;
import c7.C1080d;
import cc.D;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.J;
import com.paymaya.common.utility.h0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelTwoValuesReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueLinkReviewInfoItem;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.j;
import y5.n;
import y5.u;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopPurchaseHistoryReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements m {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Group f14117A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public Group f14118B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ImageView f14119C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public View f14120D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Z0 f14121E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public TextView f14122F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public HtmlTextView f14123G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ImageView f14124H0;
    public MayaLabelTwoValuesReviewInfoItem I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C0447e f14125J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public MayaLabelValueLinkReviewInfoItem f14126K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public MayaLabelTwoValuesReviewInfoItem f14127L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public MayaReviewInfoRecyclerView f14128M0;
    public ShopPurchaseHistory N0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f14130P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public B f14131Q0;
    public D R0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public M f14133v0;
    public View w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View f14134x0;
    public View y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Group f14135z0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final f f14129O0 = new f();

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final EnumC1215d f14132S0 = EnumC1215d.RECEIPT;

    public static final void o2(MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment) {
        Object systemService = mayaShopPurchaseHistoryReceiptFragment.requireActivity().getSystemService("clipboard");
        j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String string = mayaShopPurchaseHistoryReceiptFragment.getString(R.string.maya_shop_coupon_code);
        TextView textView = mayaShopPurchaseHistoryReceiptFragment.f14122F0;
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
        D d10 = mayaShopPurchaseHistoryReceiptFragment.R0;
        if (d10 != null) {
            ((MayaShopV2Activity) d10).g2();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.R0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return m2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_purchase_history_receipt, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.coupon_view;
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
                                            i = R.id.official_receipt_available_view;
                                            MayaLabelValueLinkReviewInfoItem mayaLabelValueLinkReviewInfoItem = (MayaLabelValueLinkReviewInfoItem) ViewBindings.findChildViewById(viewInflate, R.id.official_receipt_available_view);
                                            if (mayaLabelValueLinkReviewInfoItem != null) {
                                                i = R.id.official_receipt_pending_view;
                                                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = (MayaLabelTwoValuesReviewInfoItem) ViewBindings.findChildViewById(viewInflate, R.id.official_receipt_pending_view);
                                                if (mayaLabelTwoValuesReviewInfoItem != null) {
                                                    i = R.id.official_receipt_top_divider_view;
                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.official_receipt_top_divider_view);
                                                    if (viewFindChildViewById3 != null) {
                                                        i = R.id.payment_receipt_items_view;
                                                        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.payment_receipt_items_view)) != null) {
                                                            i = R.id.reference_id_receipt_item;
                                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.reference_id_receipt_item);
                                                            if (viewFindChildViewById4 != null) {
                                                                C0447e c0447eA = C0447e.a(viewFindChildViewById4);
                                                                i = R.id.reference_id_top_divider_view;
                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.reference_id_top_divider_view);
                                                                if (viewFindChildViewById5 != null) {
                                                                    i = R.id.right_guideline_receipt;
                                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline_receipt)) != null) {
                                                                        i = R.id.selectable_view_transaction_details;
                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.selectable_view_transaction_details);
                                                                        if (viewFindChildViewById6 != null) {
                                                                            i = R.id.target_receipt_item;
                                                                            MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2 = (MayaLabelTwoValuesReviewInfoItem) ViewBindings.findChildViewById(viewInflate, R.id.target_receipt_item);
                                                                            if (mayaLabelTwoValuesReviewInfoItem2 != null) {
                                                                                i = R.id.text_view_transaction_details_label;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_details_label)) != null) {
                                                                                    this.f14133v0 = new M(constraintLayout, constraintLayout, z0A, viewFindChildViewById2, mayaReviewInfoRecyclerView, group, group2, group3, imageView, mayaLabelValueLinkReviewInfoItem, mayaLabelTwoValuesReviewInfoItem, viewFindChildViewById3, c0447eA, viewFindChildViewById5, viewFindChildViewById6, mayaLabelTwoValuesReviewInfoItem2);
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

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        D d10 = this.R0;
        if (d10 != null) {
            ((MayaShopV2Activity) d10).g1();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        D d10 = this.R0;
        if (d10 != null) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) d10;
            mayaShopV2Activity.n1().u(mayaShopV2Activity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaShopV2Activity.getString(R.string.pma_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        int i = 4;
        B bM2 = m2();
        boolean z4 = !this.f14130P0 && bM2.f6552g;
        if (z4) {
            bM2.z();
        }
        MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
        mayaShopPurchaseHistoryReceiptFragment.getClass();
        TypedValue typedValue = new TypedValue();
        int i4 = mayaShopPurchaseHistoryReceiptFragment.requireContext().getTheme().resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true) ? typedValue.resourceId : R.color.maya_primary_white;
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        mayaShopPurchaseHistoryReceiptFragment.Q1().setVisibility(4);
        h0 h0VarD = h0.d(mayaShopPurchaseHistoryReceiptFragment.M1(), new Gb.n(z4, mayaShopPurchaseHistoryReceiptFragment, i));
        h0VarD.e(ContextCompat.getColor(mayaShopPurchaseHistoryReceiptFragment.requireContext(), i4));
        ImageView imageViewO1 = mayaShopPurchaseHistoryReceiptFragment.O1();
        ImageView imageViewN1 = mayaShopPurchaseHistoryReceiptFragment.N1();
        TextView textViewK1 = mayaShopPurchaseHistoryReceiptFragment.K1();
        CardView cardViewL1 = mayaShopPurchaseHistoryReceiptFragment.L1();
        ImageView imageView = mayaShopPurchaseHistoryReceiptFragment.f14119C0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        ImageView imageView2 = mayaShopPurchaseHistoryReceiptFragment.f14124H0;
        if (imageView2 == null) {
            j.n("mCouponCopyImageView");
            throw null;
        }
        h0VarD.f(imageViewO1, imageViewN1, textViewK1, cardViewL1, imageView, imageView2);
        h0VarD.b(str);
    }

    public final B m2() {
        B b8 = this.f14131Q0;
        if (b8 != null) {
            return b8;
        }
        j.n("mShopReceiptFragmentPresenter");
        throw null;
    }

    public final void n2() {
        this.f14130P0 = false;
        ImageView imageView = this.f14119C0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_chevron_down_primary));
        Group group = this.f14117A0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            j.n("mGroupAllTransactionDetails");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        c1219hM1.i();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen", "shop");
        this.R0 = (D) getActivity();
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        this.f14131Q0 = new B(aVar.H(), (com.paymaya.data.preference.a) aVar.e.get(), (c) aVar.f4724k.get());
        m2().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        m2().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D d10 = this.R0;
        if (d10 != null) {
            ((MayaShopV2Activity) d10).Q(this);
        }
        Z1("shop_purchase_history");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [c7.c] */
    /* JADX WARN: Type inference failed for: r1v65, types: [c7.c] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map] */
    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Throwable th2;
        ShopPurchaseHistory shopPurchaseHistory;
        boolean z4;
        boolean z5;
        ShopPurchaseHistory shopPurchaseHistory2;
        ?? map;
        ?? C10;
        String upperCase;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f14133v0);
        M m = this.f14133v0;
        j.d(m);
        this.f14128M0 = (MayaReviewInfoRecyclerView) m.e;
        M m2 = this.f14133v0;
        j.d(m2);
        this.w0 = m2.i;
        M m3 = this.f14133v0;
        j.d(m3);
        this.f14134x0 = m3.f3761k;
        M m6 = this.f14133v0;
        j.d(m6);
        this.I0 = (MayaLabelTwoValuesReviewInfoItem) m6.f3765p;
        M m10 = this.f14133v0;
        j.d(m10);
        this.f14125J0 = (C0447e) m10.f3764o;
        M m11 = this.f14133v0;
        j.d(m11);
        this.f14135z0 = (Group) m11.f3760g;
        M m12 = this.f14133v0;
        j.d(m12);
        this.f14117A0 = (Group) m12.f;
        M m13 = this.f14133v0;
        j.d(m13);
        this.f14118B0 = (Group) m13.h;
        M m14 = this.f14133v0;
        j.d(m14);
        this.f14119C0 = (ImageView) m14.f3758b;
        M m15 = this.f14133v0;
        j.d(m15);
        this.f14120D0 = m15.f3762l;
        M m16 = this.f14133v0;
        j.d(m16);
        Z0 z02 = (Z0) m16.f3759d;
        this.f14121E0 = z02;
        this.f14122F0 = z02.e;
        this.f14123G0 = z02.f4045d;
        this.f14124H0 = z02.c;
        M m17 = this.f14133v0;
        j.d(m17);
        this.f14126K0 = (MayaLabelValueLinkReviewInfoItem) m17.m;
        M m18 = this.f14133v0;
        j.d(m18);
        this.f14127L0 = (MayaLabelTwoValuesReviewInfoItem) m18.f3763n;
        M m19 = this.f14133v0;
        j.d(m19);
        this.y0 = m19.j;
        Bundle arguments = getArguments();
        if (arguments == null || (shopPurchaseHistory = (ShopPurchaseHistory) arguments.getParcelable("shop_purchase_history")) == null) {
            th2 = null;
        } else {
            this.N0 = shopPurchaseHistory;
            B bM2 = m2();
            bM2.j();
            String strMNetwork = shopPurchaseHistory.mNetwork();
            String strMProductName = shopPurchaseHistory.mProductName();
            String strMIconUrl = shopPurchaseHistory.mIconUrl();
            String strMCode = shopPurchaseHistory.mCode();
            if (strMCode == null) {
                strMCode = "";
            }
            Iterator<String> it = bM2.e.e().mShopConfig().mTreatsNetworks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    th2 = null;
                    z4 = false;
                    break;
                }
                String next = it.next();
                j.d(next);
                int length = next.length() - 1;
                int i = 0;
                boolean z8 = false;
                while (true) {
                    if (i > length) {
                        th2 = null;
                        break;
                    }
                    th2 = null;
                    boolean z9 = j.i(next.charAt(!z8 ? i : length), 32) <= 0;
                    if (z8) {
                        if (!z9) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z9) {
                        i++;
                    } else {
                        z8 = true;
                    }
                }
                if (z.o(next.subSequence(i, length + 1).toString(), strMNetwork, true)) {
                    z4 = true;
                    break;
                }
            }
            e eVar = new e(2);
            eVar.f3087b = "";
            eVar.c = "";
            String string = ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).getString(R.string.maya_shop_account_number_label);
            j.f(string, "getString(...)");
            eVar.c = string;
            String string2 = ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).getString(R.string.maya_shop_recipient_label);
            j.f(string2, "getString(...)");
            eVar.f3087b = string2;
            bM2.f = eVar;
            String strMStatus = shopPurchaseHistory.mStatus();
            j.f(strMStatus, "mStatus(...)");
            boolean zMWithReceipt = shopPurchaseHistory.mWithReceipt();
            boolean zMAvailableReceipt = shopPurchaseHistory.mAvailableReceipt();
            m mVar = (m) bM2.c.get();
            if (!strMStatus.equals("DISBURSEMENT_SUCCESSFUL") || !zMWithReceipt || !bM2.e.e().isShopPurchaseDigitalOREnabled()) {
                z5 = z4;
                shopPurchaseHistory2 = shopPurchaseHistory;
            } else if (!zMAvailableReceipt) {
                z5 = z4;
                shopPurchaseHistory2 = shopPurchaseHistory;
                if (bM2.f == null) {
                    j.n("shopHistoryReviewInfoHelper");
                    throw th2;
                }
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) mVar;
                String string3 = mayaShopPurchaseHistoryReceiptFragment.getString(R.string.maya_shop_official_receipt_label);
                j.f(string3, "getString(...)");
                String string4 = mayaShopPurchaseHistoryReceiptFragment.getString(R.string.maya_shop_official_receipt_status_pending);
                j.f(string4, "getString(...)");
                String string5 = mayaShopPurchaseHistoryReceiptFragment.getString(R.string.maya_shop_official_receipt_pending_info);
                j.f(string5, "getString(...)");
                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = mayaShopPurchaseHistoryReceiptFragment.f14127L0;
                if (mayaLabelTwoValuesReviewInfoItem == null) {
                    j.n("mOfficialReceiptPendingItem");
                    throw th2;
                }
                mayaLabelTwoValuesReviewInfoItem.setTitle(string3);
                mayaLabelTwoValuesReviewInfoItem.setValue(string4);
                mayaLabelTwoValuesReviewInfoItem.setSecondValue(string5);
                mayaLabelTwoValuesReviewInfoItem.setIcon(R.drawable.maya_ic_transaction_receipt_status_processing);
                mayaLabelTwoValuesReviewInfoItem.setVisibility(0);
                View view2 = mayaShopPurchaseHistoryReceiptFragment.y0;
                if (view2 == null) {
                    j.n("mOfficialReceiptTopDividerView");
                    throw th2;
                }
                view2.setVisibility(0);
            } else {
                if (bM2.f == null) {
                    j.n("shopHistoryReviewInfoHelper");
                    throw th2;
                }
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment2 = (MayaShopPurchaseHistoryReceiptFragment) mVar;
                String string6 = mayaShopPurchaseHistoryReceiptFragment2.getString(R.string.maya_shop_official_receipt_label);
                j.f(string6, "getString(...)");
                String string7 = mayaShopPurchaseHistoryReceiptFragment2.getString(R.string.maya_shop_official_receipt_status_available);
                j.f(string7, "getString(...)");
                String string8 = mayaShopPurchaseHistoryReceiptFragment2.getString(R.string.maya_shop_official_receipt_view);
                j.f(string8, "getString(...)");
                z5 = z4;
                shopPurchaseHistory2 = shopPurchaseHistory;
                C1080d c1080d = new C1080d(string6, string7, string8, new b(mayaShopPurchaseHistoryReceiptFragment2, 9));
                MayaLabelValueLinkReviewInfoItem mayaLabelValueLinkReviewInfoItem = mayaShopPurchaseHistoryReceiptFragment2.f14126K0;
                if (mayaLabelValueLinkReviewInfoItem == null) {
                    j.n("mOfficialReceiptAvailableItem");
                    throw th2;
                }
                mayaLabelValueLinkReviewInfoItem.setTitle(string6);
                mayaLabelValueLinkReviewInfoItem.setValue(string7);
                l lVar = new l(c1080d, 1);
                C0447e c0447e = mayaLabelValueLinkReviewInfoItem.f12097a;
                ((TextView) c0447e.f).setText(string8);
                ((TextView) c0447e.f).setOnClickListener(lVar);
                mayaLabelValueLinkReviewInfoItem.setVisibility(0);
                View view3 = mayaShopPurchaseHistoryReceiptFragment2.y0;
                if (view3 == null) {
                    j.n("mOfficialReceiptTopDividerView");
                    throw th2;
                }
                view3.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            if (bM2.f == null) {
                j.n("shopHistoryReviewInfoHelper");
                throw th2;
            }
            List<OrderProviderField> listMOtherFields = shopPurchaseHistory2.mOtherFields();
            if (listMOtherFields == null || listMOtherFields.isEmpty()) {
                map = th2;
            } else {
                map = new HashMap();
                List<OrderProviderField> listMOtherFields2 = shopPurchaseHistory2.mOtherFields();
                j.d(listMOtherFields2);
                for (OrderProviderField orderProviderField : listMOtherFields2) {
                    map.put(orderProviderField.mName(), orderProviderField.mValue());
                }
            }
            if (map != 0) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    e eVar2 = bM2.f;
                    if (eVar2 == null) {
                        j.n("shopHistoryReviewInfoHelper");
                        throw th2;
                    }
                    C1079c c1079cC = e.c(eVar2, str, str2);
                    if (c1079cC != null) {
                        arrayList.add(c1079cC);
                    }
                }
                bM2.f6552g = true;
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment3 = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
                MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = mayaShopPurchaseHistoryReceiptFragment3.f14128M0;
                if (mayaReviewInfoRecyclerView == null) {
                    j.n("mDynamicFieldsRecyclerView");
                    throw th2;
                }
                mayaReviewInfoRecyclerView.setVisibility(0);
                View view4 = mayaShopPurchaseHistoryReceiptFragment3.w0;
                if (view4 == null) {
                    j.n("mDynamicFieldsBottomDividerView");
                    throw th2;
                }
                view4.setVisibility(0);
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment4 = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
                mayaShopPurchaseHistoryReceiptFragment4.getClass();
                mayaShopPurchaseHistoryReceiptFragment4.f14129O0.e(arrayList);
            }
            e eVar3 = bM2.f;
            if (eVar3 == null) {
                j.n("shopHistoryReviewInfoHelper");
                throw th2;
            }
            String strR = bM2.e.r();
            String strMNetwork2 = shopPurchaseHistory2.mNetwork();
            String strMRecipient = shopPurchaseHistory2.mRecipient();
            if (strMRecipient == null) {
                strMRecipient = "";
            }
            boolean z10 = shopPurchaseHistory2.mOtherFields() != null ? !r7.isEmpty() : false;
            if ((strMNetwork2 != null && !C2576A.H(strMNetwork2) && "Cignal".equalsIgnoreCase(strMNetwork2)) || (strMNetwork2 != null && !C2576A.H(strMNetwork2) && "beep".equalsIgnoreCase(strMNetwork2))) {
                C10 = e.c(eVar3, eVar3.c, strMRecipient);
            } else if (z10) {
                C10 = th2;
            } else {
                if (strMRecipient.length() != 0) {
                    strR = strMRecipient;
                }
                C10 = e.c(eVar3, eVar3.f3087b, C.p(strR));
            }
            if (C10 != 0) {
                bM2.h = true;
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment5 = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
                mayaShopPurchaseHistoryReceiptFragment5.getClass();
                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2 = mayaShopPurchaseHistoryReceiptFragment5.I0;
                if (mayaLabelTwoValuesReviewInfoItem2 == null) {
                    j.n("mTargetItem");
                    throw th2;
                }
                mayaLabelTwoValuesReviewInfoItem2.setVisibility(0);
                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem3 = mayaShopPurchaseHistoryReceiptFragment5.I0;
                if (mayaLabelTwoValuesReviewInfoItem3 == null) {
                    j.n("mTargetItem");
                    throw th2;
                }
                mayaLabelTwoValuesReviewInfoItem3.setTitle(C10.f9300a);
                mayaLabelTwoValuesReviewInfoItem3.setValue(C10.f9301b);
                mayaLabelTwoValuesReviewInfoItem3.setSecondValue(C10.c);
            }
            e eVar4 = bM2.f;
            if (eVar4 == null) {
                j.n("shopHistoryReviewInfoHelper");
                throw th2;
            }
            String string9 = ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).getString(R.string.maya_shop_payment_id_label);
            j.f(string9, "getString(...)");
            String strMPaymentTrn = shopPurchaseHistory2.mPaymentTrn();
            if (strMPaymentTrn != null) {
                Locale locale = Locale.getDefault();
                j.f(locale, "getDefault(...)");
                upperCase = strMPaymentTrn.toUpperCase(locale);
                j.f(upperCase, "toUpperCase(...)");
            } else {
                upperCase = "";
            }
            C1079c c1079cC2 = e.c(eVar4, string9, upperCase);
            if (c1079cC2 != null) {
                int length2 = c1079cC2.f9301b.length();
                ?? r1 = c1079cC2;
                if (length2 <= 0) {
                    r1 = th2;
                }
                if (r1 != 0) {
                    MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment6 = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
                    mayaShopPurchaseHistoryReceiptFragment6.getClass();
                    C0447e c0447e2 = mayaShopPurchaseHistoryReceiptFragment6.f14125J0;
                    if (c0447e2 == null) {
                        j.n("mReferenceIDItem");
                        throw th2;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) c0447e2.f4079b;
                    j.f(constraintLayout, "getRoot(...)");
                    constraintLayout.setVisibility(0);
                    C0447e c0447e3 = mayaShopPurchaseHistoryReceiptFragment6.f14125J0;
                    if (c0447e3 == null) {
                        j.n("mReferenceIDItem");
                        throw th2;
                    }
                    ((TextView) c0447e3.f).setText(r1.f9300a);
                    ((TextView) c0447e3.e).setText(r1.f9301b);
                    View view5 = mayaShopPurchaseHistoryReceiptFragment6.f14134x0;
                    if (view5 == null) {
                        j.n("mReferenceIdTopDividerView");
                        throw th2;
                    }
                    view5.setVisibility(0);
                }
            }
            if (bM2.f6552g) {
                Group group = ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).f14135z0;
                if (group == null) {
                    j.n("mGroupTransactionDetailsLabel");
                    throw th2;
                }
                group.setVisibility(0);
                ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).n2();
            }
            ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).f2(strMIconUrl);
            ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).d2(strMProductName);
            if ("KYUUBI_PENDING".equalsIgnoreCase(shopPurchaseHistory2.mStatus())) {
                ((MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get())).i2();
            } else {
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment7 = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
                mayaShopPurchaseHistoryReceiptFragment7.getClass();
                MayaAbstractBaseReceiptFragmentImpl.h2(mayaShopPurchaseHistoryReceiptFragment7);
            }
            String strH = AbstractC1414e.h("₱", J.f10420a.format(shopPurchaseHistory2.mPrice()));
            MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment8 = (MayaShopPurchaseHistoryReceiptFragment) ((m) bM2.c.get());
            mayaShopPurchaseHistoryReceiptFragment8.e2(mayaShopPurchaseHistoryReceiptFragment8.getString(R.string.maya_format_negative_amount_value, strH));
            m mVar2 = (m) bM2.c.get();
            if (C2576A.H(strMCode)) {
                Z0 z03 = ((MayaShopPurchaseHistoryReceiptFragment) mVar2).f14121E0;
                if (z03 == null) {
                    j.n("mCouponContainerView");
                    throw th2;
                }
                z03.f4044b.setVisibility(8);
            } else {
                if (z5) {
                    HtmlTextView htmlTextView = ((MayaShopPurchaseHistoryReceiptFragment) mVar2).f14123G0;
                    if (htmlTextView == null) {
                        j.n("mCouponPoweredByTextView");
                        throw th2;
                    }
                    htmlTextView.setVisibility(0);
                } else {
                    HtmlTextView htmlTextView2 = ((MayaShopPurchaseHistoryReceiptFragment) mVar2).f14123G0;
                    if (htmlTextView2 == null) {
                        j.n("mCouponPoweredByTextView");
                        throw th2;
                    }
                    htmlTextView2.setVisibility(8);
                }
                if (z5) {
                    StringBuilder sb2 = new StringBuilder();
                    String strT = z.t(strMCode, Global.NEWLINE, "");
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (sb2.length() > 0) {
                            sb2.append(Global.NEWLINE);
                        }
                        int i6 = i4 * 13;
                        int iMin = Math.min(strT.length(), i6 + 13);
                        String strSubstring = strT.substring(i6, iMin);
                        j.f(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        if (strT.length() == iMin) {
                            break;
                        }
                    }
                    strMCode = sb2.toString();
                    j.f(strMCode, "toString(...)");
                }
                MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment9 = (MayaShopPurchaseHistoryReceiptFragment) mVar2;
                mayaShopPurchaseHistoryReceiptFragment9.getClass();
                TextView textView = mayaShopPurchaseHistoryReceiptFragment9.f14122F0;
                if (textView == null) {
                    j.n("mCouponValueTextView");
                    throw th2;
                }
                textView.setText(strMCode);
                Z0 z04 = mayaShopPurchaseHistoryReceiptFragment9.f14121E0;
                if (z04 == null) {
                    j.n("mCouponContainerView");
                    throw th2;
                }
                z04.f4044b.setVisibility(0);
            }
            if (bM2.e.e().isInAppReviewPurchaseHistoryEnabled()) {
                ((MayaBaseFragment) ((m) bM2.c.get())).B1("purchase history");
            }
        }
        ImageView imageView = this.f14124H0;
        if (imageView == null) {
            j.n("mCouponCopyImageView");
            throw th2;
        }
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cc.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopPurchaseHistoryReceiptFragment f9324b;

            {
                this.f9324b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                switch (i10) {
                    case 0:
                        MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment10 = this.f9324b;
                        Callback.onClick_enter(view6);
                        try {
                            MayaShopPurchaseHistoryReceiptFragment.o2(mayaShopPurchaseHistoryReceiptFragment10);
                            return;
                        } finally {
                        }
                    default:
                        MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment11 = this.f9324b;
                        Callback.onClick_enter(view6);
                        try {
                            Xb.B bM22 = mayaShopPurchaseHistoryReceiptFragment11.m2();
                            if (mayaShopPurchaseHistoryReceiptFragment11.f14130P0) {
                                ((MayaShopPurchaseHistoryReceiptFragment) ((bc.m) bM22.c.get())).n2();
                            } else {
                                bM22.z();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        View view6 = this.f14120D0;
        if (view6 == null) {
            j.n("mSelectableViewTransactionDetails");
            throw th2;
        }
        final int i11 = 1;
        view6.setOnClickListener(new View.OnClickListener(this) { // from class: cc.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopPurchaseHistoryReceiptFragment f9324b;

            {
                this.f9324b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view62) {
                switch (i11) {
                    case 0:
                        MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment10 = this.f9324b;
                        Callback.onClick_enter(view62);
                        try {
                            MayaShopPurchaseHistoryReceiptFragment.o2(mayaShopPurchaseHistoryReceiptFragment10);
                            return;
                        } finally {
                        }
                    default:
                        MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment11 = this.f9324b;
                        Callback.onClick_enter(view62);
                        try {
                            Xb.B bM22 = mayaShopPurchaseHistoryReceiptFragment11.m2();
                            if (mayaShopPurchaseHistoryReceiptFragment11.f14130P0) {
                                ((MayaShopPurchaseHistoryReceiptFragment) ((bc.m) bM22.c.get())).n2();
                            } else {
                                bM22.z();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        a2();
        b2(R.string.maya_label_shop_receipt_title);
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2 = this.f14128M0;
        if (mayaReviewInfoRecyclerView2 == null) {
            j.n("mDynamicFieldsRecyclerView");
            throw th2;
        }
        mayaReviewInfoRecyclerView2.setAdapter(this.f14129O0);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f14132S0;
    }
}
