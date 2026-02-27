package com.paymaya.mayaui.banktransfer.view.fragment.impl;

import D.C0187u;
import N5.N0;
import O5.a;
import S5.c;
import Uh.d;
import android.content.Intent;
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
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import java.util.Arrays;
import o6.o;
import s6.InterfaceC2244e;
import t6.j;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankTransferReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements InterfaceC2244e, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f11580A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ImageView f11581B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public View f11582C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f11583D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public TextView f11584E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Group f11585F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public o f11586G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public j f11587H0;
    public boolean I0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public N0 f11588v0;
    public TextView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f11589x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f11590z0;

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.f11587H0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return m2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_bank_transfer_receipt_details, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.divider_view_destination;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_destination);
        if (viewFindChildViewById != null) {
            i = R.id.divider_view_gateway;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_gateway);
            if (viewFindChildViewById2 != null) {
                i = R.id.divider_view_purpose;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_purpose);
                if (viewFindChildViewById3 != null) {
                    i = R.id.divider_view_source;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_source);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.divider_view_trace_number;
                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_trace_number);
                        if (viewFindChildViewById5 != null) {
                            i = R.id.divider_view_transfer_fee;
                            View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.divider_view_transfer_fee);
                            if (viewFindChildViewById6 != null) {
                                i = R.id.group_trace_number;
                                if (((Group) ViewBindings.findChildViewById(viewInflate, R.id.group_trace_number)) != null) {
                                    i = R.id.group_transaction_details;
                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details);
                                    if (group != null) {
                                        i = R.id.group_transaction_details_label;
                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details_label);
                                        if (group2 != null) {
                                            i = R.id.guideline_top_section_center;
                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_top_section_center)) != null) {
                                                i = R.id.image_view_gateway_logo;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_gateway_logo);
                                                if (imageView != null) {
                                                    i = R.id.image_view_transaction_details_arrow;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_transaction_details_arrow);
                                                    if (imageView2 != null) {
                                                        i = R.id.selectable_view_transaction_details;
                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.selectable_view_transaction_details);
                                                        if (viewFindChildViewById7 != null) {
                                                            i = R.id.text_view_destination_bank_name;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_bank_name);
                                                            if (textView != null) {
                                                                i = R.id.text_view_destination_label;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_label)) != null) {
                                                                    i = R.id.text_view_destination_recipient_account;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_recipient_account);
                                                                    if (textView2 != null) {
                                                                        i = R.id.text_view_destination_recipient_name;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_recipient_name);
                                                                        if (textView3 != null) {
                                                                            i = R.id.text_view_gateway_label;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_gateway_label)) != null) {
                                                                                i = R.id.text_view_purpose_label;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_purpose_label)) != null) {
                                                                                    i = R.id.text_view_purpose_text;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_purpose_text);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.text_view_reference_id_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reference_id_label)) != null) {
                                                                                            i = R.id.text_view_reference_id_text;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reference_id_text);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.text_view_source_label;
                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_label)) != null) {
                                                                                                    i = R.id.text_view_source_mobile_number;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_mobile_number);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.text_view_source_name;
                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_name)) != null) {
                                                                                                            i = R.id.text_view_trace_number_label;
                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_trace_number_label)) != null) {
                                                                                                                i = R.id.text_view_trace_number_text;
                                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_trace_number_text);
                                                                                                                if (textView7 != null) {
                                                                                                                    i = R.id.text_view_transaction_details_label;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_details_label)) != null) {
                                                                                                                        i = R.id.text_view_transfer_fee_label;
                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_fee_label)) != null) {
                                                                                                                            i = R.id.text_view_transfer_fee_text;
                                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_fee_text);
                                                                                                                            if (textView8 != null) {
                                                                                                                                this.f11588v0 = new N0(constraintLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, group, group2, imageView, imageView2, viewFindChildViewById7, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        j jVar = this.f11587H0;
        if (jVar != null) {
            ((MayaBankTransferActivity) jVar).f();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        j jVar = this.f11587H0;
        if (jVar != null) {
            MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) jVar;
            mayaBankTransferActivity.n1().u(mayaBankTransferActivity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaBankTransferActivity.getString(R.string.pma_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void X1() {
        o oVarM2 = m2();
        Bundle arguments = ((MayaBankTransferReceiptFragment) ((InterfaceC2244e) oVarM2.c.get())).getArguments();
        FavoriteDetails favoriteDetails = arguments != null ? (FavoriteDetails) arguments.getParcelable("favorite_details") : null;
        if (favoriteDetails != null) {
            MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment = (MayaBankTransferReceiptFragment) ((InterfaceC2244e) oVarM2.c.get());
            mayaBankTransferReceiptFragment.getClass();
            j jVar = mayaBankTransferReceiptFragment.f11587H0;
            if (jVar != null) {
                MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) jVar;
                mayaBankTransferActivity.n1();
                Intent intent = new Intent(mayaBankTransferActivity, (Class<?>) MayaAddFavoriteActivity.class);
                intent.putExtra("favorite_details", favoriteDetails);
                mayaBankTransferActivity.startActivityForResult(intent, 600);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        boolean z4 = this.I0;
        boolean z5 = !z4;
        if (!z4) {
            o2();
        }
        TypedValue typedValue = new TypedValue();
        int i = requireContext().getTheme().resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true) ? typedValue.resourceId : R.color.maya_primary_white;
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        Q1().setVisibility(4);
        h0 h0VarD = h0.d(M1(), new Gb.n(z5, this, 6));
        h0VarD.e(ContextCompat.getColor(requireContext(), i));
        ImageView imageViewO1 = O1();
        ImageView imageViewN1 = N1();
        TextView textViewK1 = K1();
        CardView cardViewL1 = L1();
        ImageView imageView = this.f11581B0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        h0VarD.f(imageViewO1, imageViewN1, textViewK1, cardViewL1, imageView);
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        j jVar = this.f11587H0;
        if (jVar == null) {
            return true;
        }
        ((MayaBankTransferActivity) jVar).f();
        return true;
    }

    public final o m2() {
        o oVar = this.f11586G0;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final void n2() {
        this.I0 = false;
        ImageView imageView = this.f11581B0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_chevron_down_primary));
        Group group = this.f11585F0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mGroupTransactionDetails");
            throw null;
        }
    }

    public final void o2() {
        this.I0 = true;
        ImageView imageView = this.f11581B0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_chevron_up_primary));
        Group group = this.f11585F0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            kotlin.jvm.internal.j.n("mGroupTransactionDetails");
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
        c1219hM1.j.put("screen", "bank_transfer");
        this.f11587H0 = (j) getActivity();
        a aVar = W4.a.e().h().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        d sessionSubject = (d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f11586G0 = new o(flagConfigurationService, sessionSubject, preference);
        m2().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        m2().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11588v0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f11587H0;
        if (jVar != null) {
            ((MayaBankTransferActivity) jVar).Q(this);
        }
        Z1("bank_transfer");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        N0 n02 = this.f11588v0;
        kotlin.jvm.internal.j.d(n02);
        this.w0 = (TextView) n02.f3804q;
        N0 n03 = this.f11588v0;
        kotlin.jvm.internal.j.d(n03);
        this.f11589x0 = n03.c;
        N0 n04 = this.f11588v0;
        kotlin.jvm.internal.j.d(n04);
        this.y0 = n04.e;
        N0 n05 = this.f11588v0;
        kotlin.jvm.internal.j.d(n05);
        this.f11590z0 = n05.f3797d;
        N0 n06 = this.f11588v0;
        kotlin.jvm.internal.j.d(n06);
        this.f11580A0 = n06.f;
        N0 n07 = this.f11588v0;
        kotlin.jvm.internal.j.d(n07);
        this.f11581B0 = (ImageView) n07.f3801n;
        N0 n08 = this.f11588v0;
        kotlin.jvm.internal.j.d(n08);
        this.f11582C0 = n08.f3802o;
        N0 n09 = this.f11588v0;
        kotlin.jvm.internal.j.d(n09);
        this.f11583D0 = (TextView) n09.f3805r;
        kotlin.jvm.internal.j.d(this.f11588v0);
        kotlin.jvm.internal.j.d(this.f11588v0);
        N0 n010 = this.f11588v0;
        kotlin.jvm.internal.j.d(n010);
        this.f11584E0 = (TextView) n010.f3803p;
        kotlin.jvm.internal.j.d(this.f11588v0);
        N0 n011 = this.f11588v0;
        kotlin.jvm.internal.j.d(n011);
        this.f11585F0 = (Group) n011.m;
        i2();
        U1();
        a2();
        g2(R.drawable.maya_ic_bank_transfer_placeholder_green);
        b2(R.string.maya_label_bank_transfer_receipt_title);
        l2();
        k2();
        m2().j();
        View view2 = this.f11582C0;
        if (view2 != null) {
            view2.setOnClickListener(new qf.d(this, 3));
        } else {
            kotlin.jvm.internal.j.n("mSelectableViewTransactionDetails");
            throw null;
        }
    }
}
