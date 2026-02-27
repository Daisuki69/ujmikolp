package com.paymaya.ui.qr.view.fragment.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import de.l;

/* JADX INFO: loaded from: classes4.dex */
public class MyQRFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MyQRFragment f14685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f14686b;
    public View c;

    @UiThread
    public MyQRFragment_ViewBinding(MyQRFragment myQRFragment, View view) {
        this.f14685a = myQRFragment;
        myQRFragment.mTextViewName = (TextView) Utils.findRequiredViewAsType(view, R.id.name_text_view_pma_fragment_my_qr, "field 'mTextViewName'", TextView.class);
        myQRFragment.mTextViewNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.number_text_view_pma_fragment_my_qr, "field 'mTextViewNumber'", TextView.class);
        myQRFragment.mImageViewQR = (ImageView) Utils.findRequiredViewAsType(view, R.id.qr_code_image_view_pma_fragment_my_qr, "field 'mImageViewQR'", ImageView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.request_money_instruction_text_view_pma_fragment_my_qr, "method 'onHowRequestMoneyLinkWorksClick'");
        this.f14686b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new l(myQRFragment, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.send_request_money_link_button_pma_fragment_my_qr, "method 'onSendRequestLinkClick'");
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new l(myQRFragment, 1));
    }

    @Override // butterknife.Unbinder
    public final void unbind() {
        MyQRFragment myQRFragment = this.f14685a;
        if (myQRFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f14685a = null;
        myQRFragment.mTextViewName = null;
        myQRFragment.mTextViewNumber = null;
        myQRFragment.mImageViewQR = null;
        this.f14686b.setOnClickListener(null);
        this.f14686b = null;
        this.c.setOnClickListener(null);
        this.c = null;
    }
}
