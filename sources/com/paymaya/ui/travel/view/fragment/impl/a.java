package com.paymaya.ui.travel.view.fragment.impl;

import Ch.c;
import android.graphics.Bitmap;
import com.paymaya.R;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TravelTicketFragment f14942b;

    public /* synthetic */ a(TravelTicketFragment travelTicketFragment, int i) {
        this.f14941a = i;
        this.f14942b = travelTicketFragment;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f14941a) {
            case 0:
                TravelTicketFragment travelTicketFragment = this.f14942b;
                travelTicketFragment.mImageViewQr.setImageBitmap((Bitmap) obj);
                TravelTicketFragment travelTicketFragment2 = (TravelTicketFragment) travelTicketFragment.f14935S.c.get();
                travelTicketFragment2.mTicketView.setScallopPositionPercent(BigDecimal.valueOf(100L).multiply(BigDecimal.valueOf(BigDecimal.valueOf(BigDecimal.valueOf(travelTicketFragment2.mTextViewReminder.getBottom()).subtract(BigDecimal.valueOf(travelTicketFragment2.mTicketView.getTop())).floatValue()).add(BigDecimal.valueOf(travelTicketFragment2.getResources().getDimensionPixelSize(R.dimen.pma_margin_normal))).floatValue())).divide(BigDecimal.valueOf(travelTicketFragment2.mTicketView.getHeight()), RoundingMode.UP).floatValue());
                if (travelTicketFragment2.getArguments() == null) {
                    travelTicketFragment2.f14935S.l(true);
                } else {
                    travelTicketFragment2.f14935S.l(travelTicketFragment2.getArguments().getBoolean("show_confetti"));
                }
                break;
            default:
                TravelTicketFragment travelTicketFragment3 = this.f14942b;
                travelTicketFragment3.mGroupContent.setVisibility(0);
                travelTicketFragment3.mProgressBar.setVisibility(8);
                break;
        }
    }
}
