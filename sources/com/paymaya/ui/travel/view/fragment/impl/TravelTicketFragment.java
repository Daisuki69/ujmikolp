package com.paymaya.ui.travel.view.fragment.impl;

import Ah.o;
import D.CallableC0170c;
import Gh.d;
import He.b;
import He.c;
import Kh.J;
import Lh.g;
import Lh.h;
import Th.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.T;
import com.paymaya.common.utility.Z;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.ui.travel.view.activity.impl.TravelActivity;
import com.vipulasri.ticketview.TicketView;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nl.dionsegijn.konfetti.KonfettiView;
import v.AbstractC2329d;
import y5.InterfaceC2511c;

/* JADX INFO: loaded from: classes4.dex */
public class TravelTicketFragment extends BaseFragment implements InterfaceC2511c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Ee.a f14935S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public c f14936T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Dh.c f14937U = new Dh.c(1);

    @BindView(R.id.constraint_layout_pma_view_travel_qr_ticket_content)
    ConstraintLayout mConstraintLayoutContent;

    @BindView(R.id.save_view_group_pma_fragment_travel_qr_ticket)
    FrameLayout mFrameLayoutSave;

    @BindView(R.id.share_view_group_pma_fragment_travel_qr_ticket)
    FrameLayout mFrameLayoutShare;

    @BindView(R.id.content_group_pma_fragment_travel_qr_ticket)
    Group mGroupContent;

    @BindView(R.id.layout_background_pma_fragment_travel_qr_ticket)
    ImageView mImageViewLayoutBackground;

    @BindView(R.id.qr_image_view_pma_fragment_travel_qr_ticket)
    ImageView mImageViewQr;

    @BindView(R.id.confetti_view_pma_fragment_travel_qr_ticket)
    KonfettiView mKonfettiView;

    @BindView(R.id.progress_bar_pma_fragment_travel_qr_ticket)
    ProgressBar mProgressBar;

    @BindView(R.id.destination_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewDestination;

    @BindView(R.id.fare_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewFare;

    @BindView(R.id.fee_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewFee;

    @BindView(R.id.instruction_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewInstruction;

    @BindView(R.id.operator_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewOperator;

    @BindView(R.id.operator_label_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewOperatorLabel;

    @BindView(R.id.origin_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewOrigin;

    @BindView(R.id.purchase_date_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewPurchaseDate;

    @BindView(R.id.reminder_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewReminder;

    @BindView(R.id.route_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewRoute;

    @BindView(R.id.ticket_number_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewTicketNumber;

    @BindView(R.id.title_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewTitle;

    @BindView(R.id.total_price_text_view_pma_fragment_travel_qr_ticket)
    TextView mTextViewTotalPrice;

    @BindView(R.id.ticket_view_pma_fragment_travel_qr_ticket)
    TicketView mTicketView;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.QR;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        ((TravelActivity) this.f14936T).finish();
        return true;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        O5.a aVar = (O5.a) W4.a.e().I().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14935S = new Ee.a(0);
        this.f14936T = (c) getActivity();
        this.f14935S.h(this);
        Z.a(getActivity(), 1.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_travel_qr_ticket, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14937U.d();
        super.onDestroyView();
    }

    @OnClick({R.id.done_view_group_pma_fragment_travel_qr_ticket})
    public void onDoneClicked() {
        ((TravelActivity) this.f14936T).finish();
    }

    @OnClick({R.id.qr_image_view_pma_fragment_travel_qr_ticket})
    public void onImageClicked(ImageView imageView) {
        c cVar = this.f14936T;
        int id = imageView.getId();
        TravelActivity travelActivity = (TravelActivity) cVar;
        travelActivity.getClass();
        ImageView imageView2 = (ImageView) getView().findViewById(id);
        Bitmap bitmap = ((BitmapDrawable) imageView2.getDrawable()).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        Bundle bundleD = androidx.media3.datasource.cache.c.d("bitmap_base64", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        ImageViewerFragment imageViewerFragment = new ImageViewerFragment();
        imageViewerFragment.setArguments(bundleD);
        imageViewerFragment.setSharedElementEnterTransition(new Ie.a());
        imageViewerFragment.setSharedElementReturnTransition(new Ie.a());
        imageViewerFragment.setEnterTransition(new Fade());
        setExitTransition(new Fade());
        travelActivity.getSupportFragmentManager().beginTransaction().addSharedElement(imageView2, travelActivity.getString(R.string.pma_transition_tap_to_zoom)).replace(R.id.fragment_container_frame_layout_pma_activity_travel, imageViewerFragment, AbstractC1236z.d(travelActivity, ImageViewerFragment.class)).addToBackStack(AbstractC1236z.d(travelActivity, ImageViewerFragment.class)).commit();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((TravelActivity) this.f14936T).Q(this);
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        o1(c1219h);
    }

    @OnClick({R.id.save_view_group_pma_fragment_travel_qr_ticket})
    public void onSaveClicked() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SAVE);
        o1(c1219hH);
        s1();
    }

    @OnClick({R.id.share_view_group_pma_fragment_travel_qr_ticket})
    public void onShareClicked() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SHARE);
        o1(c1219hH);
        String strI = androidx.media3.datasource.cache.c.i(System.currentTimeMillis(), "qr_ticket_", ".jpg");
        h0 h0VarD = h0.d(this.mConstraintLayoutContent, new b(this));
        h0VarD.f11209b = this.mImageViewLayoutBackground;
        h0VarD.e(ContextCompat.getColor(requireContext(), R.color.light_light));
        h0VarD.b(strI);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            PurchasedTicket purchasedTicket = (PurchasedTicket) getArguments().getParcelable("purchased_ticket");
            Ee.a aVar = this.f14935S;
            TravelTicketFragment travelTicketFragment = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment.mGroupContent.setVisibility(4);
            travelTicketFragment.mProgressBar.setVisibility(0);
            ((TravelTicketFragment) aVar.c.get()).w1(false);
            ((TravelTicketFragment) aVar.c.get()).v1(false);
            ((TravelTicketFragment) aVar.c.get()).u1(false);
            if (purchasedTicket.mMeta() != null && purchasedTicket.mMeta().containsKey("heading")) {
                TravelTicketFragment travelTicketFragment2 = (TravelTicketFragment) aVar.c.get();
                travelTicketFragment2.mTextViewTitle.setText(purchasedTicket.mMeta().get("heading"));
            }
            if (purchasedTicket.mMeta() == null || !purchasedTicket.mMeta().containsKey("instructions")) {
                ((TravelTicketFragment) aVar.c.get()).mTextViewInstruction.setText(8);
            } else {
                TravelTicketFragment travelTicketFragment3 = (TravelTicketFragment) aVar.c.get();
                travelTicketFragment3.mTextViewInstruction.setText(purchasedTicket.mMeta().get("instructions"));
                ((TravelTicketFragment) aVar.c.get()).mTextViewInstruction.setVisibility(0);
            }
            TravelTicketFragment travelTicketFragment4 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment4.mTextViewTicketNumber.setText(purchasedTicket.mNumber());
            TravelTicketFragment travelTicketFragment5 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment5.mTextViewPurchaseDate.setText(AbstractC1234x.f.withLocale(AbstractC1234x.l()).print(AbstractC1234x.b(purchasedTicket.mDateIssued())));
            TravelTicketFragment travelTicketFragment6 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment6.mTextViewOperator.setText(purchasedTicket.mOperator().mName());
            Operator operatorMOperator = purchasedTicket.mOperator();
            if (operatorMOperator == null || operatorMOperator.mType() == null) {
                ((TravelTicketFragment) aVar.c.get()).t1();
            } else {
                String strMType = operatorMOperator.mType();
                strMType.getClass();
                if (strMType.equals("BUS")) {
                    TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(((TravelTicketFragment) aVar.c.get()).mTextViewOperatorLabel, R.drawable.pma_ic_bus_small, 0, 0, 0);
                } else if (strMType.equals("FERRY")) {
                    TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(((TravelTicketFragment) aVar.c.get()).mTextViewOperatorLabel, R.drawable.pma_ic_ferry_small, 0, 0, 0);
                } else {
                    ((TravelTicketFragment) aVar.c.get()).t1();
                }
            }
            TravelTicketFragment travelTicketFragment7 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment7.mTextViewRoute.setText(purchasedTicket.mRoute().mName());
            TravelTicketFragment travelTicketFragment8 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment8.mTextViewOrigin.setText(purchasedTicket.mRoute().mOrigin().mName());
            TravelTicketFragment travelTicketFragment9 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment9.mTextViewDestination.setText(purchasedTicket.mRoute().mDestination().mName());
            TravelTicketFragment travelTicketFragment10 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment10.mTextViewFare.setText(purchasedTicket.mAmount().getCurrencyFormattedFare());
            TravelTicketFragment travelTicketFragment11 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment11.mTextViewFee.setText(purchasedTicket.mAmount().getCurrencyFormattedConvenienceFee());
            TravelTicketFragment travelTicketFragment12 = (TravelTicketFragment) aVar.c.get();
            travelTicketFragment12.mTextViewTotalPrice.setText(purchasedTicket.mAmount().getCurrencyFormattedValue());
            TravelTicketFragment travelTicketFragment13 = (TravelTicketFragment) aVar.c.get();
            String strMData = purchasedTicket.mData();
            Context context = travelTicketFragment13.getContext();
            T t5 = Z.f10458a;
            h hVarH = new J(new CallableC0170c(14, context, strMData), 3).h(e.f5841b);
            o oVarA = zh.b.a();
            d dVar = new d(1, new a(travelTicketFragment13, 0), Eh.d.f1366d);
            try {
                hVarH.f(new g(dVar, oVarA));
                travelTicketFragment13.f14937U.a(dVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
            }
        }
    }

    public final int[] r1() {
        return new int[]{ContextCompat.getColor(getContext(), R.color.brick_red), ContextCompat.getColor(getContext(), R.color.pale_salmon), ContextCompat.getColor(getContext(), R.color.nice_blue), ContextCompat.getColor(getContext(), R.color.jungle_green), ContextCompat.getColor(getContext(), R.color.mango_yellow)};
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1() {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.travel.view.fragment.impl.TravelTicketFragment.s1():void");
    }

    public final void t1() {
        TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds(this.mTextViewOperatorLabel, R.drawable.pma_ic_default_operator_small, 0, 0, 0);
    }

    public final void u1(boolean z4) {
        this.mImageViewQr.setClickable(z4);
    }

    public final void v1(boolean z4) {
        this.mFrameLayoutSave.setClickable(z4);
        this.mFrameLayoutSave.setAlpha(z4 ? 1.0f : 0.5f);
    }

    public final void w1(boolean z4) {
        this.mFrameLayoutShare.setClickable(z4);
        this.mFrameLayoutShare.setAlpha(z4 ? 1.0f : 0.5f);
    }

    public final void x1() {
        float width = this.mConstraintLayoutContent.getWidth();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(height);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(4L);
        RoundingMode roundingMode = RoundingMode.UP;
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, roundingMode);
        BigDecimal bigDecimalDivide2 = BigDecimal.valueOf(height).multiply(BigDecimal.valueOf(2L)).divide(BigDecimal.valueOf(3L), roundingMode);
        KonfettiView konfettiView = this.mKonfettiView;
        konfettiView.getClass();
        Zj.c cVar = new Zj.c(konfettiView);
        ck.a aVar = cVar.f;
        cVar.c = r1();
        double radians = Math.toRadians(-45.0d);
        dk.b bVar = cVar.f6969b;
        bVar.f16541a = radians;
        bVar.f16542b = Double.valueOf(Math.toRadians(-90.0d));
        cVar.c();
        aVar.f9396a = true;
        aVar.f9397b = 100L;
        ck.b bVar2 = ck.b.f9398a;
        cVar.a(bVar2);
        cVar.b(new ck.c(10, 1.0f));
        Float fValueOf = Float.valueOf(0.0f);
        float fFloatValue = bigDecimalDivide.floatValue();
        Float fValueOf2 = Float.valueOf(bigDecimalDivide2.floatValue());
        dk.a aVar2 = cVar.f6968a;
        aVar2.f16538a = 0.0f;
        aVar2.f16539b = fValueOf;
        aVar2.c = fFloatValue;
        aVar2.f16540d = fValueOf2;
        aVar.c = 350L;
        cVar.d();
        KonfettiView konfettiView2 = this.mKonfettiView;
        konfettiView2.getClass();
        Zj.c cVar2 = new Zj.c(konfettiView2);
        ck.a aVar3 = cVar2.f;
        cVar2.c = r1();
        double radians2 = Math.toRadians(225.0d);
        dk.b bVar3 = cVar2.f6969b;
        bVar3.f16541a = radians2;
        bVar3.f16542b = Double.valueOf(Math.toRadians(270.0d));
        cVar2.c();
        aVar3.f9396a = true;
        aVar3.f9397b = 100L;
        cVar2.a(bVar2);
        cVar2.b(new ck.c(10, 1.0f));
        Float fValueOf3 = Float.valueOf(width);
        float fFloatValue2 = bigDecimalDivide.floatValue();
        Float fValueOf4 = Float.valueOf(bigDecimalDivide2.floatValue());
        dk.a aVar4 = cVar2.f6968a;
        aVar4.f16538a = width;
        aVar4.f16539b = fValueOf3;
        aVar4.c = fFloatValue2;
        aVar4.f16540d = fValueOf4;
        aVar3.c = 350L;
        cVar2.d();
    }
}
