package com.paymaya.ui.ekyc.view.widget;

import Bd.i;
import We.A;
import We.G;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.io.File;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class FinancialDocumentPhoto extends ConstraintLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BaseFragment f14611d;

    @BindView(R.id.pma_item_edd_financial_document_document_text_view)
    public TextView mDocumentTextView;

    @BindView(R.id.pma_item_edd_financial_document_photo_group)
    public Group mPhotoGroup;

    @BindView(R.id.pma_item_edd_financial_document_photo)
    public ImageView mPhotoImageView;

    public FinancialDocumentPhoto(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.pma_item_edd_financial_document, this);
        ButterKnife.bind(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(FinancialDocumentPhoto financialDocumentPhoto, String str, String str2, String str3, i iVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        financialDocumentPhoto.f14611d = (BaseFragment) iVar;
        financialDocumentPhoto.getMDocumentTextView().setText(str);
        if (str2 == null) {
            if (str3 != null) {
                financialDocumentPhoto.getMPhotoGroup().setVisibility(0);
                financialDocumentPhoto.getContext();
                C.e0(str3, financialDocumentPhoto.getMPhotoImageView(), 2131231811);
                financialDocumentPhoto.getMPhotoImageView().setOnClickListener(new Ad.a(2, financialDocumentPhoto, str3));
                return;
            }
            return;
        }
        File file = new File(str2);
        financialDocumentPhoto.getMPhotoGroup().setVisibility(0);
        financialDocumentPhoto.getContext();
        ImageView mPhotoImageView = financialDocumentPhoto.getMPhotoImageView();
        A aD = A.d();
        aD.getClass();
        G g8 = aD.g(Uri.fromFile(file));
        g8.h(2131231811);
        g8.f(2);
        g8.e(mPhotoImageView, null);
        financialDocumentPhoto.getMPhotoImageView().setOnClickListener(new Ad.a(1, financialDocumentPhoto, file));
    }

    public final TextView getMDocumentTextView() {
        TextView textView = this.mDocumentTextView;
        if (textView != null) {
            return textView;
        }
        j.n("mDocumentTextView");
        throw null;
    }

    public final Group getMPhotoGroup() {
        Group group = this.mPhotoGroup;
        if (group != null) {
            return group;
        }
        j.n("mPhotoGroup");
        throw null;
    }

    public final ImageView getMPhotoImageView() {
        ImageView imageView = this.mPhotoImageView;
        if (imageView != null) {
            return imageView;
        }
        j.n("mPhotoImageView");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setMDocumentTextView(TextView textView) {
        j.g(textView, "<set-?>");
        this.mDocumentTextView = textView;
    }

    public final void setMPhotoGroup(Group group) {
        j.g(group, "<set-?>");
        this.mPhotoGroup = group;
    }

    public final void setMPhotoImageView(ImageView imageView) {
        j.g(imageView, "<set-?>");
        this.mPhotoImageView = imageView;
    }
}
