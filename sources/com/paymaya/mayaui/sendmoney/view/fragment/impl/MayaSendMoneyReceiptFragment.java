package com.paymaya.mayaui.sendmoney.view.fragment.impl;

import Bb.p;
import D.C0187u;
import Eh.d;
import Fb.e;
import Gb.o;
import Gh.f;
import J5.a;
import J5.c;
import N5.N0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferPersonalization;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyReceiptFragment;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSendMoneyReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements e, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ImageView f13815A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View f13816B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public TextView f13817C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f13818D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Group f13819E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public CardView f13820F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f13821G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ImageView f13822H0;
    public Group I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public p f13823J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public o f13824K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f13825L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public Transfer f13826M0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public N0 f13827v0;
    public TextView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f13828x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f13829z0;

    public static final void q2(MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment) {
        String gifId;
        String decorationId;
        String str;
        TransferPersonalizationMeta meta;
        PersonalizationPayMaya mayaDecoration;
        p pVar = (p) mayaSendMoneyReceiptFragment.m2();
        Transfer transferN2 = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).n2();
        TransferPersonalization transferPersonalizationMPersonalization = transferN2.mPersonalization();
        if (transferPersonalizationMPersonalization == null || (gifId = transferPersonalizationMPersonalization.getGifId()) == null) {
            gifId = "";
        }
        TransferPersonalization transferPersonalizationMPersonalization2 = transferN2.mPersonalization();
        if (transferPersonalizationMPersonalization2 == null || (meta = transferPersonalizationMPersonalization2.getMeta()) == null || (mayaDecoration = meta.getMayaDecoration()) == null || (decorationId = mayaDecoration.getDecorationId()) == null) {
            decorationId = "";
        }
        Decoration decorationB = pVar.f.b(decorationId);
        if (decorationB != null && C2576A.H(gifId)) {
            e eVar = (e) pVar.c.get();
            Amount amountA = pVar.A();
            String strMMessage = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).n2().mMessage();
            str = strMMessage != null ? strMMessage : "";
            MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = (MayaSendMoneyReceiptFragment) eVar;
            mayaSendMoneyReceiptFragment2.getClass();
            o oVar = mayaSendMoneyReceiptFragment2.f13824K0;
            if (oVar != null) {
                ((MayaSendMoneyActivity) oVar).b2(decorationB, amountA, str);
                return;
            }
            return;
        }
        if (C2576A.H(gifId)) {
            return;
        }
        e eVar2 = (e) pVar.c.get();
        Amount amountA2 = pVar.A();
        String strMMessage2 = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).n2().mMessage();
        str = strMMessage2 != null ? strMMessage2 : "";
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment3 = (MayaSendMoneyReceiptFragment) eVar2;
        mayaSendMoneyReceiptFragment3.getClass();
        o oVar2 = mayaSendMoneyReceiptFragment3.f13824K0;
        if (oVar2 != null) {
            MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) oVar2;
            Bundle bundle = new Bundle();
            bundle.putString("gif_id", gifId);
            bundle.putParcelable("amount", amountA2);
            bundle.putString("message", str);
            bundle.putBoolean("show_selection", false);
            MayaSendMoneyDecorationPreviewFragment mayaSendMoneyDecorationPreviewFragment = new MayaSendMoneyDecorationPreviewFragment();
            mayaSendMoneyDecorationPreviewFragment.setArguments(bundle);
            AbstractC1236z.i(mayaSendMoneyActivity, R.id.fragment_container_frame_layout, mayaSendMoneyDecorationPreviewFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public static final void r2(MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.ADD_TO_CONTACTS);
        mayaSendMoneyReceiptFragment.A1(c1219hH);
        p pVar = (p) mayaSendMoneyReceiptFragment.m2();
        if (AbstractC1955a.u(((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).getContext(), "android.permission.READ_CONTACTS")) {
            pVar.z();
            return;
        }
        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = (MayaSendMoneyReceiptFragment) ((e) pVar.c.get());
        mayaSendMoneyReceiptFragment2.getClass();
        try {
            AbstractC1955a.l(mayaSendMoneyReceiptFragment2).e(b.a()).g(new Gh.e(0, new f(new c(pVar, 10), d.f1366d), new a(pVar, 11)));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.f13824K0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return m2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_send_money_receipt_details, (ViewGroup) null, false);
        int i = R.id.card_view_main_details_content;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_main_details_content)) != null) {
            i = R.id.card_view_message_and_decoration_content;
            CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_message_and_decoration_content);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.group_decoration;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_decoration);
                if (group != null) {
                    i = R.id.group_transaction_details;
                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details);
                    if (group2 != null) {
                        i = R.id.group_transaction_details_label;
                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details_label);
                        if (group3 != null) {
                            i = R.id.guideline_top_section_center;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_top_section_center)) != null) {
                                i = R.id.image_view_decoration_thumbnail;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_decoration_thumbnail);
                                if (imageView != null) {
                                    i = R.id.image_view_open_decoration_preview;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_open_decoration_preview);
                                    if (imageView2 != null) {
                                        i = R.id.image_view_transaction_details_arrow;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_transaction_details_arrow);
                                        if (imageView3 != null) {
                                            i = R.id.text_view_message;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_message);
                                            if (textView != null) {
                                                i = R.id.text_view_powered_by_giphy_label;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_powered_by_giphy_label);
                                                if (appCompatTextView != null) {
                                                    i = R.id.text_view_recipient_add_to_contacts;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_recipient_add_to_contacts);
                                                    if (textView2 != null) {
                                                        i = R.id.text_view_recipient_destination_label;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_recipient_destination_label)) != null) {
                                                            i = R.id.text_view_recipient_primary_destination;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_recipient_primary_destination);
                                                            if (textView3 != null) {
                                                                i = R.id.text_view_recipient_secondary_destination;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_recipient_secondary_destination);
                                                                if (textView4 != null) {
                                                                    i = R.id.text_view_reference_id_label;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reference_id_label)) != null) {
                                                                        i = R.id.text_view_reference_id_value;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reference_id_value);
                                                                        if (textView5 != null) {
                                                                            i = R.id.text_view_source_label;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_label)) != null) {
                                                                                i = R.id.text_view_source_mobile_number;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_mobile_number);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.text_view_source_name;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_name);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.text_view_transaction_details_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_details_label)) != null) {
                                                                                            i = R.id.text_view_transaction_fee_label;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_fee_label)) != null) {
                                                                                                i = R.id.text_view_transaction_fee_value;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_fee_value);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.view_recipient_destination_row_divider;
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_recipient_destination_row_divider);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        i = R.id.view_source_row_divider;
                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_source_row_divider);
                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                            i = R.id.view_transaction_details_selectable_region;
                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_transaction_details_selectable_region);
                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                i = R.id.view_transaction_fee_row_divider;
                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_transaction_fee_row_divider);
                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                    this.f13827v0 = new N0(constraintLayout, cardView, group, group2, group3, imageView, imageView2, imageView3, textView, appCompatTextView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        o oVar = this.f13824K0;
        if (oVar != null) {
            ((MayaSendMoneyActivity) oVar).f();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        o oVar = this.f13824K0;
        if (oVar != null) {
            MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) oVar;
            mayaSendMoneyActivity.n1().u(mayaSendMoneyActivity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaSendMoneyActivity.getString(R.string.pma_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void X1() {
        p pVar = (p) m2();
        Bundle arguments = ((MayaSendMoneyReceiptFragment) ((e) pVar.c.get())).getArguments();
        FavoriteDetails favoriteDetails = arguments != null ? (FavoriteDetails) arguments.getParcelable("favorite_details") : null;
        if (favoriteDetails != null) {
            MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = (MayaSendMoneyReceiptFragment) ((e) pVar.c.get());
            mayaSendMoneyReceiptFragment.getClass();
            o oVar = mayaSendMoneyReceiptFragment.f13824K0;
            if (oVar != null) {
                Transfer transferN2 = mayaSendMoneyReceiptFragment.n2();
                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) oVar;
                mayaSendMoneyActivity.n1();
                TransferRecipient transferRecipientMTransferRecipient = transferN2.mTransferRecipient();
                ActivityResultLauncher activityResultLauncher = mayaSendMoneyActivity.f13747x;
                Intent intent = new Intent(mayaSendMoneyActivity, (Class<?>) MayaAddFavoriteActivity.class);
                intent.putExtra("favorite_details", favoriteDetails);
                intent.putExtra("transfer_recipient", transferRecipientMTransferRecipient);
                intent.putExtra("is_result", true);
                activityResultLauncher.launch(intent);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        Resources.Theme theme;
        int i = 0;
        boolean z4 = this.f13825L0;
        boolean z5 = !z4;
        if (!z4) {
            s2();
        }
        Context context = getContext();
        TypedValue typedValue = new TypedValue();
        int i4 = (context == null || (theme = context.getTheme()) == null || !theme.resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true)) ? R.color.maya_primary_white : typedValue.resourceId;
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        Q1().setVisibility(4);
        h0 h0VarD = h0.d(M1(), new Gb.n(z5, this, i));
        h0VarD.e(ContextCompat.getColor(requireContext(), i4));
        ImageView imageViewO1 = O1();
        ImageView imageViewN1 = N1();
        TextView textViewK1 = K1();
        CardView cardViewL1 = L1();
        ImageView imageView = this.f13815A0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        h0VarD.f(imageViewO1, imageViewN1, textViewK1, cardViewL1, imageView);
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        o oVar = this.f13824K0;
        if (oVar == null) {
            return true;
        }
        ((MayaSendMoneyActivity) oVar).f();
        return true;
    }

    public final Ab.d m2() {
        p pVar = this.f13823J0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final Transfer n2() {
        Transfer transfer = this.f13826M0;
        if (transfer != null) {
            return transfer;
        }
        j.n("transfer");
        throw null;
    }

    public final void o2() {
        TextView textView = this.f13829z0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            j.n("mTextViewRecipientAddToContacts");
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
        c1219hM1.j.put("screen", "send_money");
        this.f13824K0 = (o) getActivity();
        O5.a aVar = W4.a.e().x().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        this.f13823J0 = new p((com.paymaya.data.preference.a) aVar.e.get(), aVar.k(), aVar.o(), (S5.c) aVar.f4724k.get(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) m2()).h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) m2()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13827v0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = this.f13824K0;
        if (oVar != null) {
            ((MayaSendMoneyActivity) oVar).Q(this);
        }
        Z1("send_money");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Transfer transferBuild;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f13827v0);
        N0 n02 = this.f13827v0;
        j.d(n02);
        this.w0 = (TextView) n02.m;
        N0 n03 = this.f13827v0;
        j.d(n03);
        this.f13828x0 = n03.e;
        N0 n04 = this.f13827v0;
        j.d(n04);
        this.y0 = n04.f;
        N0 n05 = this.f13827v0;
        j.d(n05);
        this.f13829z0 = n05.f3797d;
        N0 n06 = this.f13827v0;
        j.d(n06);
        this.f13815A0 = (ImageView) n06.f3799k;
        N0 n07 = this.f13827v0;
        j.d(n07);
        this.f13816B0 = n07.f3804q;
        N0 n08 = this.f13827v0;
        j.d(n08);
        this.f13817C0 = (TextView) n08.f3801n;
        N0 n09 = this.f13827v0;
        j.d(n09);
        this.f13818D0 = (TextView) n09.f3800l;
        j.d(this.f13827v0);
        N0 n010 = this.f13827v0;
        j.d(n010);
        this.f13819E0 = (Group) n010.i;
        N0 n011 = this.f13827v0;
        j.d(n011);
        this.f13820F0 = (CardView) n011.f3798g;
        N0 n012 = this.f13827v0;
        j.d(n012);
        this.f13821G0 = n012.c;
        j.d(this.f13827v0);
        N0 n013 = this.f13827v0;
        j.d(n013);
        this.f13822H0 = (ImageView) n013.j;
        j.d(this.f13827v0);
        N0 n014 = this.f13827v0;
        j.d(n014);
        this.I0 = (Group) n014.h;
        MayaAbstractBaseReceiptFragmentImpl.h2(this);
        U1();
        a2();
        Context context = getContext();
        R1().setImageDrawable(context != null ? jk.b.o(context, R.attr.mayaDrawable_SendMoneyReceiptPlaceholder) : null);
        b2(R.string.maya_label_send_money_receipt_title);
        l2();
        k2();
        View view2 = this.f13816B0;
        if (view2 == null) {
            j.n("mViewTransactionDetailsSelectableRegion");
            throw null;
        }
        final int i = 0;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyReceiptFragment f1954b;

            {
                this.f1954b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i) {
                    case 0:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            p pVar = (p) mayaSendMoneyReceiptFragment.m2();
                            if (mayaSendMoneyReceiptFragment.f13825L0) {
                                ((MayaSendMoneyReceiptFragment) ((Fb.e) pVar.c.get())).p2();
                            } else {
                                ((MayaSendMoneyReceiptFragment) ((Fb.e) pVar.c.get())).s2();
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaSendMoneyReceiptFragment.q2(mayaSendMoneyReceiptFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment3 = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaSendMoneyReceiptFragment.r2(mayaSendMoneyReceiptFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        CardView cardView = this.f13820F0;
        if (cardView == null) {
            j.n("mCardViewMessageAndDecorationContent");
            throw null;
        }
        final int i4 = 1;
        cardView.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyReceiptFragment f1954b;

            {
                this.f1954b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i4) {
                    case 0:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            p pVar = (p) mayaSendMoneyReceiptFragment.m2();
                            if (mayaSendMoneyReceiptFragment.f13825L0) {
                                ((MayaSendMoneyReceiptFragment) ((Fb.e) pVar.c.get())).p2();
                            } else {
                                ((MayaSendMoneyReceiptFragment) ((Fb.e) pVar.c.get())).s2();
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaSendMoneyReceiptFragment.q2(mayaSendMoneyReceiptFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment3 = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaSendMoneyReceiptFragment.r2(mayaSendMoneyReceiptFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f13829z0;
        if (textView == null) {
            j.n("mTextViewRecipientAddToContacts");
            throw null;
        }
        final int i6 = 2;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyReceiptFragment f1954b;

            {
                this.f1954b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i6) {
                    case 0:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            p pVar = (p) mayaSendMoneyReceiptFragment.m2();
                            if (mayaSendMoneyReceiptFragment.f13825L0) {
                                ((MayaSendMoneyReceiptFragment) ((Fb.e) pVar.c.get())).p2();
                            } else {
                                ((MayaSendMoneyReceiptFragment) ((Fb.e) pVar.c.get())).s2();
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment2 = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaSendMoneyReceiptFragment.q2(mayaSendMoneyReceiptFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyReceiptFragment mayaSendMoneyReceiptFragment3 = this.f1954b;
                        Callback.onClick_enter(view3);
                        try {
                            MayaSendMoneyReceiptFragment.r2(mayaSendMoneyReceiptFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (transferBuild = (Transfer) arguments.getParcelable("transfer")) == null) {
            transferBuild = Transfer.sBuilder().build();
            j.f(transferBuild, "build(...)");
        }
        this.f13826M0 = transferBuild;
        ((p) m2()).j();
    }

    public final void p2() {
        this.f13825L0 = false;
        ImageView imageView = this.f13815A0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_chevron_down_primary));
        Group group = this.f13819E0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            j.n("mGroupTransactionDetails");
            throw null;
        }
    }

    public final void s2() {
        this.f13825L0 = true;
        ImageView imageView = this.f13815A0;
        if (imageView == null) {
            j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.maya_ic_chevron_up_primary));
        Group group = this.f13819E0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            j.n("mGroupTransactionDetails");
            throw null;
        }
    }
}
