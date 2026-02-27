package com.paymaya.mayaui.vouchers.view.fragment.impl;

import D.C0187u;
import Fc.e;
import G5.t;
import Gc.j;
import N5.E;
import O5.a;
import S5.c;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.b0;
import com.paymaya.common.utility.h0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import java.util.Arrays;
import v.AbstractC2329d;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVouchersReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements e, t, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ImageView f14321A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public HtmlTextView f14322B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public HtmlTextView f14323C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f14324D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Group f14325E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final EnumC1215d f14326F0 = EnumC1215d.VOUCHER;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public E f14327v0;
    public Dc.e w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public j f14328x0;
    public ConstraintLayout y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f14329z0;

    public static final void m2(MayaVouchersReceiptFragment mayaVouchersReceiptFragment) {
        String string;
        TextView textView = mayaVouchersReceiptFragment.f14329z0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mRefCodeTextView");
            throw null;
        }
        String string2 = textView.getText().toString();
        Object systemService = mayaVouchersReceiptFragment.requireActivity().getSystemService("clipboard");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (string2 != null) {
            int length = string2.length() - 1;
            int i = 0;
            boolean z4 = false;
            while (i <= length) {
                boolean z5 = kotlin.jvm.internal.j.i(string2.charAt(!z4 ? i : length), 32) <= 0;
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
            string = string2.subSequence(i, length + 1).toString();
        } else {
            string = null;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Voucher Promo Code", string));
        FragmentActivity activity = mayaVouchersReceiptFragment.getActivity();
        ConstraintLayout constraintLayout = mayaVouchersReceiptFragment.y0;
        if (constraintLayout != null) {
            b0.e(activity, constraintLayout, null, R.string.maya_label_voucher_code_copied, R.drawable.maya_bg_snackbar_with_border_success, R.style.JekoBoldSmallText_Snackbar_Success, 0, 0, 852);
        } else {
            kotlin.jvm.internal.j.n("mLayoutContainer");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.f14328x0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        Dc.e eVar = this.w0;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.j.n("mVouchersReceiptFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_vouchers_receipt_details, (ViewGroup) null, false);
        int i = R.id.background_view_details;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.background_view_details);
        if (viewFindChildViewById != null) {
            i = R.id.background_view_ref_code;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.background_view_ref_code);
            if (viewFindChildViewById2 != null) {
                i = R.id.bottom_space_details;
                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_details)) != null) {
                    i = R.id.bottom_space_ref_code;
                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bottom_space_ref_code)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.group_ref_code;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_ref_code);
                        if (group != null) {
                            i = R.id.guideline_half_ref_code;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_half_ref_code)) != null) {
                                i = R.id.image_view_ref_code_copy;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_ref_code_copy);
                                if (imageView != null) {
                                    i = R.id.text_view_details_info_label;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_info_label)) != null) {
                                        i = R.id.text_view_details_info_value;
                                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_info_value);
                                        if (htmlTextView != null) {
                                            i = R.id.text_view_details_terms_label;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_terms_label)) != null) {
                                                i = R.id.text_view_details_terms_value;
                                                HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_terms_value);
                                                if (htmlTextView2 != null) {
                                                    i = R.id.text_view_details_validity_label;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_validity_label)) != null) {
                                                        i = R.id.text_view_details_validity_value;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_details_validity_value);
                                                        if (textView != null) {
                                                            i = R.id.text_view_ref_code_label;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ref_code_label)) != null) {
                                                                i = R.id.text_view_ref_code_value;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ref_code_value);
                                                                if (textView2 != null) {
                                                                    i = R.id.view_divider_details_info;
                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_details_info);
                                                                    if (viewFindChildViewById3 != null) {
                                                                        i = R.id.view_divider_details_terms;
                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_details_terms);
                                                                        if (viewFindChildViewById4 != null) {
                                                                            this.f14327v0 = new E(constraintLayout, viewFindChildViewById, viewFindChildViewById2, constraintLayout, group, imageView, htmlTextView, htmlTextView2, textView, textView2, viewFindChildViewById3, viewFindChildViewById4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BACK_TO_HOME);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", "vouchers");
        A1(c1219hH);
        j jVar = this.f14328x0;
        if (jVar != null) {
            ((MayaVouchersActivity) jVar).f();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        j jVar = this.f14328x0;
        if (jVar != null) {
            MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) jVar;
            String string = mayaVouchersActivity.getString(R.string.maya_label_help);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            mayaVouchersActivity.n1().u(mayaVouchersActivity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", string);
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        TypedValue typedValue = new TypedValue();
        int i = requireContext().getTheme().resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true) ? typedValue.resourceId : R.color.maya_primary_white;
        h0 h0VarD = h0.d(M1(), new G7.t(this, 5));
        h0VarD.e(ContextCompat.getColor(requireContext(), i));
        ImageView imageViewO1 = O1();
        ImageView imageViewN1 = N1();
        CardView cardViewL1 = L1();
        TextView textViewK1 = K1();
        ImageView imageView = this.f14321A0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mRefCodeCopyImageView");
            throw null;
        }
        TextView textViewS1 = S1();
        ImageView imageView2 = this.f10285g0;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mTransactionStatusBadgeImageView");
            throw null;
        }
        h0VarD.f(imageViewO1, imageViewN1, cardViewL1, textViewK1, imageView, textViewS1, imageView2);
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        j jVar = this.f14328x0;
        if (jVar == null) {
            return true;
        }
        ((MayaVouchersActivity) jVar).f();
        return true;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        j jVar = this.f14328x0;
        if (jVar != null) {
            MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) jVar;
            mayaVouchersActivity.n1().k0(mayaVouchersActivity, str);
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen", "vouchers");
        this.f14328x0 = (j) getActivity();
        a aVar = W4.a.e().C().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        Dc.e eVar = new Dc.e(flagConfigurationService, 0, 0);
        this.w0 = eVar;
        eVar.h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Dc.e eVar = this.w0;
        if (eVar == null) {
            kotlin.jvm.internal.j.n("mVouchersReceiptFragmentPresenter");
            throw null;
        }
        eVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f14328x0;
        if (jVar != null) {
            ((MayaVouchersActivity) jVar).Q(this);
        }
        Z1("vouchers");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        E e = this.f14327v0;
        kotlin.jvm.internal.j.d(e);
        this.y0 = (ConstraintLayout) e.h;
        E e7 = this.f14327v0;
        kotlin.jvm.internal.j.d(e7);
        this.f14329z0 = (TextView) e7.f3588g;
        E e10 = this.f14327v0;
        kotlin.jvm.internal.j.d(e10);
        this.f14321A0 = (ImageView) e10.i;
        E e11 = this.f14327v0;
        kotlin.jvm.internal.j.d(e11);
        this.f14322B0 = (HtmlTextView) e11.j;
        E e12 = this.f14327v0;
        kotlin.jvm.internal.j.d(e12);
        this.f14323C0 = (HtmlTextView) e12.f3589k;
        E e13 = this.f14327v0;
        kotlin.jvm.internal.j.d(e13);
        this.f14324D0 = (TextView) e13.f;
        E e14 = this.f14327v0;
        kotlin.jvm.internal.j.d(e14);
        this.f14325E0 = (Group) e14.f3590l;
        a2();
        b2(R.string.maya_label_vouchers);
        g2(R.drawable.maya_ic_voucher_available_logo_circle);
        ImageView imageView = this.f10285g0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mTransactionStatusBadgeImageView");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(R1().getContext(), R.drawable.maya_ic_transaction_receipt_status_completed));
        S1().setText(getString(R.string.maya_label_voucher_claim_completed));
        U1();
        l2();
        ImageView imageView2 = this.f14321A0;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n("mRefCodeCopyImageView");
            throw null;
        }
        imageView2.setOnClickListener(new Ba.a(this, 10));
        HtmlTextView htmlTextView = this.f14322B0;
        if (htmlTextView == null) {
            kotlin.jvm.internal.j.n("mDetailsInfoTextView");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        HtmlTextView htmlTextView2 = this.f14323C0;
        if (htmlTextView2 == null) {
            kotlin.jvm.internal.j.n("mDetailsTermsTextView");
            throw null;
        }
        htmlTextView2.setOnLinkClickListener(this);
        Dc.e eVar = this.w0;
        if (eVar != null) {
            eVar.j();
        } else {
            kotlin.jvm.internal.j.n("mVouchersReceiptFragmentPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f14326F0;
    }
}
