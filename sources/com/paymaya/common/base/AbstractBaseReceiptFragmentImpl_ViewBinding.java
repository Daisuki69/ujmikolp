package com.paymaya.common.base;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import y5.C2510b;

/* JADX INFO: loaded from: classes3.dex */
public class AbstractBaseReceiptFragmentImpl_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractBaseReceiptFragmentImpl f10235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f10236b;
    public View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f10237d;

    @UiThread
    public AbstractBaseReceiptFragmentImpl_ViewBinding(AbstractBaseReceiptFragmentImpl abstractBaseReceiptFragmentImpl, View view) {
        this.f10235a = abstractBaseReceiptFragmentImpl;
        abstractBaseReceiptFragmentImpl.mTextViewSnackBar = (TextView) Utils.findRequiredViewAsType(view, R.id.top_snackbar_text_pma_fragment_receipt_body, "field 'mTextViewSnackBar'", TextView.class);
        abstractBaseReceiptFragmentImpl.mLayoutBackgroundImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.layout_background_pma_fragment_receipt_body, "field 'mLayoutBackgroundImage'", ImageView.class);
        abstractBaseReceiptFragmentImpl.mProgressbar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progress_bar_pma_fragment_receipt_body, "field 'mProgressbar'", ProgressBar.class);
        abstractBaseReceiptFragmentImpl.mScrollContainerLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.scroll_container_view_pma_fragment_receipt_body, "field 'mScrollContainerLayout'", ConstraintLayout.class);
        abstractBaseReceiptFragmentImpl.mStartGuideline = (Guideline) Utils.findRequiredViewAsType(view, R.id.start_guide_pma_fragment_receipt_body, "field 'mStartGuideline'", Guideline.class);
        abstractBaseReceiptFragmentImpl.mLabelCenterGuideline = (Guideline) Utils.findRequiredViewAsType(view, R.id.label_guide_pma_fragment_receipt_body, "field 'mLabelCenterGuideline'", Guideline.class);
        abstractBaseReceiptFragmentImpl.mEndGuideline = (Guideline) Utils.findRequiredViewAsType(view, R.id.end_guide_pma_fragment_receipt_body, "field 'mEndGuideline'", Guideline.class);
        abstractBaseReceiptFragmentImpl.mStatusImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.status_image_view_pma_fragment_receipt_body, "field 'mStatusImage'", ImageView.class);
        abstractBaseReceiptFragmentImpl.mTitleText = (TextView) Utils.findRequiredViewAsType(view, R.id.title_text_pma_fragment_receipt_body, "field 'mTitleText'", TextView.class);
        abstractBaseReceiptFragmentImpl.mDescriptionText = (TextView) Utils.findRequiredViewAsType(view, R.id.description_text_pma_fragment_receipt_body, "field 'mDescriptionText'", TextView.class);
        abstractBaseReceiptFragmentImpl.mViaQRPHLogoImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.via_qrph_logo_image_view_pma_fragment_receipt_body, "field 'mViaQRPHLogoImageView'", ImageView.class);
        abstractBaseReceiptFragmentImpl.mUpdatedBalanceGroup = (Group) Utils.findRequiredViewAsType(view, R.id.updated_balance_group_pma_fragment_receipt_body, "field 'mUpdatedBalanceGroup'", Group.class);
        abstractBaseReceiptFragmentImpl.mUpdatedBalanceTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.updated_balance_title_text_pma_fragment_receipt_body, "field 'mUpdatedBalanceTitle'", TextView.class);
        abstractBaseReceiptFragmentImpl.mUpdatedBalanceText = (TextView) Utils.findRequiredViewAsType(view, R.id.updated_balance_text_pma_fragment_receipt_body, "field 'mUpdatedBalanceText'", TextView.class);
        abstractBaseReceiptFragmentImpl.mErrorSpielDividerView = Utils.findRequiredView(view, R.id.error_spiel_divider_pma_fragment_receipt_body, "field 'mErrorSpielDividerView'");
        abstractBaseReceiptFragmentImpl.mErrorSpielText = (TextView) Utils.findRequiredViewAsType(view, R.id.error_spiel_text_pma_fragment_receipt_body, "field 'mErrorSpielText'", TextView.class);
        abstractBaseReceiptFragmentImpl.mReportHereText = (HtmlTextView) Utils.findRequiredViewAsType(view, R.id.report_here_text_pma_fragment_receipt_body, "field 'mReportHereText'", HtmlTextView.class);
        View viewFindRequiredView = Utils.findRequiredView(view, R.id.share_view_group_pma_fragment_receipt_body, "field 'mShareButtonView' and method 'handleShareClick'");
        abstractBaseReceiptFragmentImpl.mShareButtonView = viewFindRequiredView;
        this.f10236b = viewFindRequiredView;
        viewFindRequiredView.setOnClickListener(new C2510b(abstractBaseReceiptFragmentImpl, 0));
        View viewFindRequiredView2 = Utils.findRequiredView(view, R.id.additional_button_view_group_pma_fragment_receipt_body, "field 'mAdditionalButtonView' and method 'handleAdditionalButtonClick'");
        abstractBaseReceiptFragmentImpl.mAdditionalButtonView = viewFindRequiredView2;
        this.c = viewFindRequiredView2;
        viewFindRequiredView2.setOnClickListener(new C2510b(abstractBaseReceiptFragmentImpl, 1));
        abstractBaseReceiptFragmentImpl.mAdditionalButtonText = (AppCompatTextView) Utils.findRequiredViewAsType(view, R.id.additional_button_text_pma_fragment_receipt_body, "field 'mAdditionalButtonText'", AppCompatTextView.class);
        abstractBaseReceiptFragmentImpl.mBackToHomeButtonText = (AppCompatTextView) Utils.findRequiredViewAsType(view, R.id.back_to_home_text_pma_fragment_receipt_body, "field 'mBackToHomeButtonText'", AppCompatTextView.class);
        abstractBaseReceiptFragmentImpl.mThankYouGroup = (Group) Utils.findRequiredViewAsType(view, R.id.thank_you_group_pma_fragment_receipt_body, "field 'mThankYouGroup'", Group.class);
        View viewFindRequiredView3 = Utils.findRequiredView(view, R.id.back_to_home_view_group_pma_fragment_receipt_body, "method 'handleCloseClick'");
        this.f10237d = viewFindRequiredView3;
        viewFindRequiredView3.setOnClickListener(new C2510b(abstractBaseReceiptFragmentImpl, 2));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AbstractBaseReceiptFragmentImpl abstractBaseReceiptFragmentImpl = this.f10235a;
        if (abstractBaseReceiptFragmentImpl == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f10235a = null;
        abstractBaseReceiptFragmentImpl.mTextViewSnackBar = null;
        abstractBaseReceiptFragmentImpl.mLayoutBackgroundImage = null;
        abstractBaseReceiptFragmentImpl.mProgressbar = null;
        abstractBaseReceiptFragmentImpl.mScrollContainerLayout = null;
        abstractBaseReceiptFragmentImpl.mStartGuideline = null;
        abstractBaseReceiptFragmentImpl.mLabelCenterGuideline = null;
        abstractBaseReceiptFragmentImpl.mEndGuideline = null;
        abstractBaseReceiptFragmentImpl.mStatusImage = null;
        abstractBaseReceiptFragmentImpl.mTitleText = null;
        abstractBaseReceiptFragmentImpl.mDescriptionText = null;
        abstractBaseReceiptFragmentImpl.mViaQRPHLogoImageView = null;
        abstractBaseReceiptFragmentImpl.mUpdatedBalanceGroup = null;
        abstractBaseReceiptFragmentImpl.mUpdatedBalanceTitle = null;
        abstractBaseReceiptFragmentImpl.mUpdatedBalanceText = null;
        abstractBaseReceiptFragmentImpl.mErrorSpielDividerView = null;
        abstractBaseReceiptFragmentImpl.mErrorSpielText = null;
        abstractBaseReceiptFragmentImpl.mReportHereText = null;
        abstractBaseReceiptFragmentImpl.mShareButtonView = null;
        abstractBaseReceiptFragmentImpl.mAdditionalButtonView = null;
        abstractBaseReceiptFragmentImpl.mAdditionalButtonText = null;
        abstractBaseReceiptFragmentImpl.mBackToHomeButtonText = null;
        abstractBaseReceiptFragmentImpl.mThankYouGroup = null;
        this.f10236b.setOnClickListener(null);
        this.f10236b = null;
        this.c.setOnClickListener(null);
        this.c = null;
        this.f10237d.setOnClickListener(null);
        this.f10237d = null;
    }
}
