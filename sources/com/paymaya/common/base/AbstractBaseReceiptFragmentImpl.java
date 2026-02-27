package com.paymaya.common.base;

import G5.t;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.RetryPolicy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.DefaultLoadControl;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C1223l;
import com.paymaya.common.utility.C1225n;
import com.paymaya.common.widget.HtmlTextView;
import w1.RunnableC2367e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBaseReceiptFragmentImpl extends BaseFragment implements t {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Handler f10233S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f10234T = true;

    @BindView(R.id.additional_button_text_pma_fragment_receipt_body)
    AppCompatTextView mAdditionalButtonText;

    @BindView(R.id.additional_button_view_group_pma_fragment_receipt_body)
    View mAdditionalButtonView;

    @BindView(R.id.back_to_home_text_pma_fragment_receipt_body)
    AppCompatTextView mBackToHomeButtonText;

    @BindView(R.id.description_text_pma_fragment_receipt_body)
    TextView mDescriptionText;

    @BindView(R.id.end_guide_pma_fragment_receipt_body)
    Guideline mEndGuideline;

    @BindView(R.id.error_spiel_divider_pma_fragment_receipt_body)
    View mErrorSpielDividerView;

    @BindView(R.id.error_spiel_text_pma_fragment_receipt_body)
    TextView mErrorSpielText;

    @BindView(R.id.label_guide_pma_fragment_receipt_body)
    Guideline mLabelCenterGuideline;

    @BindView(R.id.layout_background_pma_fragment_receipt_body)
    ImageView mLayoutBackgroundImage;

    @BindView(R.id.progress_bar_pma_fragment_receipt_body)
    ProgressBar mProgressbar;

    @BindView(R.id.report_here_text_pma_fragment_receipt_body)
    HtmlTextView mReportHereText;

    @BindView(R.id.scroll_container_view_pma_fragment_receipt_body)
    ConstraintLayout mScrollContainerLayout;

    @BindView(R.id.share_view_group_pma_fragment_receipt_body)
    View mShareButtonView;

    @BindView(R.id.start_guide_pma_fragment_receipt_body)
    Guideline mStartGuideline;

    @BindView(R.id.status_image_view_pma_fragment_receipt_body)
    ImageView mStatusImage;

    @BindView(R.id.top_snackbar_text_pma_fragment_receipt_body)
    TextView mTextViewSnackBar;

    @BindView(R.id.thank_you_group_pma_fragment_receipt_body)
    Group mThankYouGroup;

    @BindView(R.id.title_text_pma_fragment_receipt_body)
    TextView mTitleText;

    @BindView(R.id.updated_balance_group_pma_fragment_receipt_body)
    Group mUpdatedBalanceGroup;

    @BindView(R.id.updated_balance_text_pma_fragment_receipt_body)
    TextView mUpdatedBalanceText;

    @BindView(R.id.updated_balance_title_text_pma_fragment_receipt_body)
    TextView mUpdatedBalanceTitle;

    @BindView(R.id.via_qrph_logo_image_view_pma_fragment_receipt_body)
    ImageView mViaQRPHLogoImageView;

    public abstract void A1();

    public final void B1() {
        this.mAdditionalButtonText.setText(getString(R.string.pma_label_view_qr_ticket));
        this.mAdditionalButtonText.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(getContext(), R.drawable.pma_ic_view_my_qr), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void C1() {
        this.mBackToHomeButtonText.setText(getString(R.string.pma_label_done));
        this.mBackToHomeButtonText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void D1(int i) {
        this.mBackToHomeButtonText.setText(getString(i));
    }

    public abstract View E1(LayoutInflater layoutInflater);

    public final void F1(int i) {
        this.mDescriptionText.setVisibility(0);
        this.mDescriptionText.setText(i);
    }

    public final void G1(String str) {
        this.mDescriptionText.setVisibility(0);
        this.mDescriptionText.setText(str);
    }

    public void H1() {
        this.mStatusImage.setImageDrawable(ContextCompat.getDrawable(getContext(), 2131232023));
    }

    public final void I1() {
        this.mStatusImage.setImageDrawable(ContextCompat.getDrawable(getContext(), 2131232024));
    }

    public final void J1(int i) {
        this.mTitleText.setText(i);
    }

    public final void K1(String str) {
        this.mTitleText.setText(str);
    }

    public final void L1(String str) {
        this.mUpdatedBalanceGroup.setVisibility(0);
        this.mUpdatedBalanceText.setText(str);
    }

    public final void M1() {
        this.mAdditionalButtonView.setVisibility(0);
    }

    public final void N1() {
        this.mDescriptionText.setVisibility(0);
    }

    public void O1() {
    }

    public final void P1() {
        this.mErrorSpielDividerView.setVisibility(0);
        this.mReportHereText.setOnLinkClickListener(this);
        this.mReportHereText.setVisibility(0);
    }

    public void Q1() {
        this.mShareButtonView.setVisibility(0);
    }

    public final void R1() {
        if (this.f10234T) {
            this.mTextViewSnackBar.setText(R.string.pma_label_code_copied);
            this.mTextViewSnackBar.setBackground(ContextCompat.getDrawable(getContext(), R.color.primary_dark));
            this.f10234T = false;
            TextView textView = this.mTextViewSnackBar;
            DecelerateInterpolator decelerateInterpolator = AbstractC1228q.f11227a;
            float height = textView.getHeight();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "translationY", height);
            objectAnimatorOfFloat.setInterpolator(AbstractC1228q.f11228b);
            objectAnimatorOfFloat.setRepeatCount(0);
            objectAnimatorOfFloat.setDuration(500L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, "translationY", height);
            objectAnimatorOfFloat2.setRepeatCount(0);
            objectAnimatorOfFloat2.setDuration(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f);
            objectAnimatorOfFloat3.setInterpolator(AbstractC1228q.f11227a);
            objectAnimatorOfFloat3.setRepeatCount(0);
            objectAnimatorOfFloat3.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.addListener(new C1223l(textView, 1));
            animatorSet.start();
            Handler handler = this.f10233S;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f10233S.postDelayed(new RunnableC2367e(this, 4), RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
            }
        }
    }

    public final void S1() {
        this.mUpdatedBalanceTitle.setVisibility(0);
        this.mUpdatedBalanceText.setVisibility(0);
    }

    public final void T1() {
        this.mViaQRPHLogoImageView.setVisibility(0);
    }

    public final void U1() {
        ConstraintLayout constraintLayout = this.mScrollContainerLayout;
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f = displayMetrics.heightPixels;
        ImageView imageView = this.mStatusImage.getVisibility() == 8 ? null : this.mStatusImage;
        DecelerateInterpolator decelerateInterpolator = AbstractC1228q.f11227a;
        AnimatorSet animatorSet = new AnimatorSet();
        constraintLayout.setTranslationY(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, "translationY", f, -50.0f);
        objectAnimatorOfFloat.setDuration(350L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(constraintLayout, "translationY", -50.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new C1225n(constraintLayout, imageView, animatorSet));
        animatorSet.setStartDelay(550L);
        animatorSet.start();
    }

    @OnClick({R.id.additional_button_view_group_pma_fragment_receipt_body})
    public void handleAdditionalButtonClick() {
        A1();
    }

    @OnClick({R.id.back_to_home_view_group_pma_fragment_receipt_body})
    public void handleCloseClick() {
        onCloseClick();
    }

    @OnClick({R.id.share_view_group_pma_fragment_receipt_body})
    public void handleShareClick() {
        onShareClick();
    }

    @Override // G5.t
    public final void m(String str, View view) {
        if (str.equals("Report")) {
            O1();
        }
    }

    public abstract void onCloseClick();

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10233S = new Handler();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.pma_fragment_receipt_body, viewGroup, false);
        ((FrameLayout) viewInflate.findViewById(R.id.content_layout_pma_fragment_receipt_body)).addView(E1(layoutInflater));
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Handler handler = this.f10233S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    public abstract void onShareClick();

    public final ImageView r1() {
        return this.mLayoutBackgroundImage;
    }

    public final View[] s1() {
        return new View[]{this.mReportHereText, this.mErrorSpielDividerView};
    }

    public final ConstraintLayout t1() {
        return this.mScrollContainerLayout;
    }

    public final Group u1() {
        return this.mUpdatedBalanceGroup;
    }

    public final void v1() {
        this.mAdditionalButtonView.setVisibility(8);
    }

    public void w1() {
        this.mDescriptionText.setVisibility(8);
    }

    public void x1() {
        this.mShareButtonView.setVisibility(8);
    }

    public final void y1() {
        this.mStatusImage.setVisibility(8);
    }

    public final void z1() {
        this.mUpdatedBalanceTitle.setVisibility(8);
        this.mUpdatedBalanceText.setVisibility(8);
    }
}
