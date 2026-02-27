package com.paymaya.ui.travel.view.fragment.impl;

import He.d;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.vipulasri.ticketview.TicketView;
import nl.dionsegijn.konfetti.KonfettiView;

/* JADX INFO: loaded from: classes4.dex */
public class TravelTicketFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TravelTicketFragment f14938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14939b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14940d;
    public View e;

    @UiThread
    public TravelTicketFragment_ViewBinding(TravelTicketFragment travelTicketFragment, View view) {
        this.f14938a = travelTicketFragment;
        travelTicketFragment.mTicketView = (TicketView) Utils.findRequiredViewAsType(view, R.id.ticket_view_pma_fragment_travel_qr_ticket, "field 'mTicketView'", TicketView.class);
        travelTicketFragment.mConstraintLayoutContent = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.constraint_layout_pma_view_travel_qr_ticket_content, "field 'mConstraintLayoutContent'", ConstraintLayout.class);
        travelTicketFragment.mTextViewTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewTitle'", TextView.class);
        travelTicketFragment.mTextViewInstruction = (TextView) Utils.findRequiredViewAsType(view, R.id.instruction_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewInstruction'", TextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.qr_image_view_pma_fragment_travel_qr_ticket, "field 'mImageViewQr' and method 'onImageClicked'");
        travelTicketFragment.mImageViewQr = (ImageView) Utils.castView(viewFindRequiredView, R.id.qr_image_view_pma_fragment_travel_qr_ticket, "field 'mImageViewQr'", ImageView.class);
        this.f14939b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new d(travelTicketFragment, 0));
        travelTicketFragment.mTextViewTicketNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.ticket_number_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewTicketNumber'", TextView.class);
        travelTicketFragment.mTextViewPurchaseDate = (TextView) Utils.findRequiredViewAsType(view, R.id.purchase_date_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewPurchaseDate'", TextView.class);
        travelTicketFragment.mTextViewReminder = (TextView) Utils.findRequiredViewAsType(view, R.id.reminder_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewReminder'", TextView.class);
        travelTicketFragment.mTextViewOperatorLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.operator_label_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewOperatorLabel'", TextView.class);
        travelTicketFragment.mTextViewOperator = (TextView) Utils.findRequiredViewAsType(view, R.id.operator_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewOperator'", TextView.class);
        travelTicketFragment.mTextViewRoute = (TextView) Utils.findRequiredViewAsType(view, R.id.route_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewRoute'", TextView.class);
        travelTicketFragment.mTextViewOrigin = (TextView) Utils.findRequiredViewAsType(view, R.id.origin_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewOrigin'", TextView.class);
        travelTicketFragment.mTextViewDestination = (TextView) Utils.findRequiredViewAsType(view, R.id.destination_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewDestination'", TextView.class);
        travelTicketFragment.mTextViewFare = (TextView) Utils.findRequiredViewAsType(view, R.id.fare_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewFare'", TextView.class);
        travelTicketFragment.mTextViewFee = (TextView) Utils.findRequiredViewAsType(view, R.id.fee_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewFee'", TextView.class);
        travelTicketFragment.mTextViewTotalPrice = (TextView) Utils.findRequiredViewAsType(view, R.id.total_price_text_view_pma_fragment_travel_qr_ticket, "field 'mTextViewTotalPrice'", TextView.class);
        travelTicketFragment.mProgressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progress_bar_pma_fragment_travel_qr_ticket, "field 'mProgressBar'", ProgressBar.class);
        travelTicketFragment.mGroupContent = (Group) Utils.findRequiredViewAsType(view, R.id.content_group_pma_fragment_travel_qr_ticket, "field 'mGroupContent'", Group.class);
        travelTicketFragment.mKonfettiView = (KonfettiView) Utils.findRequiredViewAsType(view, R.id.confetti_view_pma_fragment_travel_qr_ticket, "field 'mKonfettiView'", KonfettiView.class);
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.share_view_group_pma_fragment_travel_qr_ticket, "field 'mFrameLayoutShare' and method 'onShareClicked'");
        travelTicketFragment.mFrameLayoutShare = (FrameLayout) Utils.castView(viewFindRequiredView2, R.id.share_view_group_pma_fragment_travel_qr_ticket, "field 'mFrameLayoutShare'", FrameLayout.class);
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new d(travelTicketFragment, 1));
        View viewFindRequiredView3 = Utils.findRequiredView(view, R.id.save_view_group_pma_fragment_travel_qr_ticket, "field 'mFrameLayoutSave' and method 'onSaveClicked'");
        travelTicketFragment.mFrameLayoutSave = (FrameLayout) Utils.castView(viewFindRequiredView3, R.id.save_view_group_pma_fragment_travel_qr_ticket, "field 'mFrameLayoutSave'", FrameLayout.class);
        this.f14940d = viewFindRequiredView3;
        viewFindRequiredView3.setOnClickListener(new d(travelTicketFragment, 2));
        travelTicketFragment.mImageViewLayoutBackground = (ImageView) Utils.findRequiredViewAsType(view, R.id.layout_background_pma_fragment_travel_qr_ticket, "field 'mImageViewLayoutBackground'", ImageView.class);
        View viewFindRequiredView4 = Utils.findRequiredView(view, R.id.done_view_group_pma_fragment_travel_qr_ticket, "method 'onDoneClicked'");
        this.e = viewFindRequiredView4;
        viewFindRequiredView4.setOnClickListener(new d(travelTicketFragment, 3));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        TravelTicketFragment travelTicketFragment = this.f14938a;
        if (travelTicketFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14938a = null;
        travelTicketFragment.mTicketView = null;
        travelTicketFragment.mConstraintLayoutContent = null;
        travelTicketFragment.mTextViewTitle = null;
        travelTicketFragment.mTextViewInstruction = null;
        travelTicketFragment.mImageViewQr = null;
        travelTicketFragment.mTextViewTicketNumber = null;
        travelTicketFragment.mTextViewPurchaseDate = null;
        travelTicketFragment.mTextViewReminder = null;
        travelTicketFragment.mTextViewOperatorLabel = null;
        travelTicketFragment.mTextViewOperator = null;
        travelTicketFragment.mTextViewRoute = null;
        travelTicketFragment.mTextViewOrigin = null;
        travelTicketFragment.mTextViewDestination = null;
        travelTicketFragment.mTextViewFare = null;
        travelTicketFragment.mTextViewFee = null;
        travelTicketFragment.mTextViewTotalPrice = null;
        travelTicketFragment.mProgressBar = null;
        travelTicketFragment.mGroupContent = null;
        travelTicketFragment.mKonfettiView = null;
        travelTicketFragment.mFrameLayoutShare = null;
        travelTicketFragment.mFrameLayoutSave = null;
        travelTicketFragment.mImageViewLayoutBackground = null;
        this.f14939b.setOnClickListener(null);
        this.f14939b = null;
        this.c.setOnClickListener(null);
        this.c = null;
        this.f14940d.setOnClickListener(null);
        this.f14940d = null;
        this.e.setOnClickListener(null);
        this.e = null;
    }
}
