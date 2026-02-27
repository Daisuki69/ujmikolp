package com.paymaya.ui.ekyc.view.widget;

import Bd.b;
import Bd.j;
import E8.E;
import Eh.d;
import Gh.f;
import Kh.B;
import We.A;
import We.G;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.res.ResourcesCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import c9.c;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EKycPhotoCaptureActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.io.File;
import java.util.UUID;
import o1.AbstractC1955a;
import pg.C2038a;
import sd.C2254c;
import td.InterfaceC2283a;
import zd.l;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDInputFinancialDocument extends ConstraintLayout implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14599d;
    public b e;
    public FinancialDocument f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14600g;
    public String h;
    public final String i;
    public EDDInputFinancialDocument j;

    @BindView(R.id.upload_clickable_background_view_pma_view_edd_input_financial_document)
    public View mBackgroundDocument;

    @BindView(R.id.choose_one_edit_text_pma_fragment_edd_financial_document)
    public TextInputEditText mEditText;

    @BindView(R.id.preview_image_view_pma_view_edd_input_financial_document)
    public ImageView mImageView;

    @BindView(R.id.preview_group_pma_view_edd_input_financial_document)
    public Group mPreviewGroup;

    @BindView(R.id.remove_image_view_pma_view_edd_input_financial_document)
    public ImageView mRemoveImageView;

    @BindView(R.id.edd_dropdown_pma_view_input_financial_document)
    public TextInputLayout mTextInputLayout;

    @BindView(R.id.photo_error_text_pma_view_edd_input_financial_document)
    public TextView mTextViewError;

    @BindView(R.id.upload_group_pma_view_edd_input_financial_document)
    public Group mUploadGroup;

    @BindView(R.id.upload_label_group_pma_view_edd_input_financial_document)
    public Group mUploadLabelGroup;

    @BindView(R.id.divider_view_pma_view_edd_input_financial_document)
    public View mViewDivider;

    public EDDInputFinancialDocument(Context context) {
        super(context);
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        this.i = string;
        View.inflate(getContext(), R.layout.pma_view_edd_input_financial_document, this);
        ButterKnife.bind(this);
        getMUploadLabelGroup().setVisibility(8);
        getMUploadGroup().setVisibility(8);
        getMPreviewGroup().setVisibility(8);
        getMEditText().setSaveEnabled(false);
    }

    public final boolean b() {
        return String.valueOf(getMEditText().getText()).length() == 0;
    }

    public final void c() {
        if (getMTextInputLayout().isHintEnabled()) {
            getMTextInputLayout().setHintEnabled(false);
            getMTextInputLayout().setError(getContext().getString(R.string.pma_error_missing_this_field_p));
        }
    }

    public final String getDocumentId() {
        return this.i;
    }

    public final EDDFinancialDocument getEDDFinancialDocument() {
        String type;
        FinancialDocument financialDocument = this.f;
        if (financialDocument == null || (type = financialDocument.getType()) == null) {
            type = "";
        }
        return new EDDFinancialDocument(type, null, this.f14600g, this.f, 2, null);
    }

    public final EDDInputFinancialDocument getFirstItem() {
        return this.j;
    }

    public final View getMBackgroundDocument() {
        View view = this.mBackgroundDocument;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.j.n("mBackgroundDocument");
        throw null;
    }

    public final b getMEDDInputListener() {
        return this.e;
    }

    public final TextInputEditText getMEditText() {
        TextInputEditText textInputEditText = this.mEditText;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        kotlin.jvm.internal.j.n("mEditText");
        throw null;
    }

    public final String getMFileUrl() {
        return this.f14600g;
    }

    public final FinancialDocument getMFinancialDocument() {
        return this.f;
    }

    public final String getMId() {
        return this.i;
    }

    public final ImageView getMImageView() {
        ImageView imageView = this.mImageView;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.j.n("mImageView");
        throw null;
    }

    public final String getMName() {
        return this.h;
    }

    public final Group getMPreviewGroup() {
        Group group = this.mPreviewGroup;
        if (group != null) {
            return group;
        }
        kotlin.jvm.internal.j.n("mPreviewGroup");
        throw null;
    }

    public final ImageView getMRemoveImageView() {
        ImageView imageView = this.mRemoveImageView;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.j.n("mRemoveImageView");
        throw null;
    }

    public final TextInputLayout getMTextInputLayout() {
        TextInputLayout textInputLayout = this.mTextInputLayout;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        kotlin.jvm.internal.j.n("mTextInputLayout");
        throw null;
    }

    public final TextView getMTextViewError() {
        TextView textView = this.mTextViewError;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.j.n("mTextViewError");
        throw null;
    }

    public final Group getMUploadGroup() {
        Group group = this.mUploadGroup;
        if (group != null) {
            return group;
        }
        kotlin.jvm.internal.j.n("mUploadGroup");
        throw null;
    }

    public final Group getMUploadLabelGroup() {
        Group group = this.mUploadLabelGroup;
        if (group != null) {
            return group;
        }
        kotlin.jvm.internal.j.n("mUploadLabelGroup");
        throw null;
    }

    public final View getMViewDivider() {
        View view = this.mViewDivider;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.j.n("mViewDivider");
        throw null;
    }

    @Override // Bd.j
    public final boolean isEmpty() {
        EDDInputFinancialDocument eDDInputFinancialDocument = this.j;
        if (eDDInputFinancialDocument != null && eDDInputFinancialDocument.b() && b()) {
            EDDInputFinancialDocument eDDInputFinancialDocument2 = this.j;
            if (eDDInputFinancialDocument2 != null) {
                eDDInputFinancialDocument2.c();
                return true;
            }
        } else {
            EDDInputFinancialDocument eDDInputFinancialDocument3 = this.j;
            if (eDDInputFinancialDocument3 == null) {
                return false;
            }
            String str = eDDInputFinancialDocument3.f14600g;
            if (str != null && !C2576A.H(str)) {
                return false;
            }
            String str2 = this.f14600g;
            if (str2 != null && !C2576A.H(str2)) {
                return false;
            }
            EDDInputFinancialDocument eDDInputFinancialDocument4 = this.j;
            if (eDDInputFinancialDocument4 != null && eDDInputFinancialDocument4.f14599d) {
                eDDInputFinancialDocument4.getMBackgroundDocument().setBackground(ResourcesCompat.getDrawable(eDDInputFinancialDocument4.getResources(), R.drawable.pma_background_dark_white_red_thin_border, null));
                eDDInputFinancialDocument4.getMTextViewError().setVisibility(0);
                return true;
            }
            if (eDDInputFinancialDocument4 != null) {
                eDDInputFinancialDocument4.c();
            }
        }
        return true;
    }

    @OnClick({R.id.choose_one_edit_text_pma_fragment_edd_financial_document})
    public final void onChooseClick() {
        b bVar = this.e;
        if (bVar != null) {
            ((C2038a) bVar).i();
        }
    }

    @OnFocusChange({R.id.choose_one_edit_text_pma_fragment_edd_financial_document})
    public final void onChooseFocused(TextInputEditText editText, boolean z4) {
        b bVar;
        kotlin.jvm.internal.j.g(editText, "editText");
        if (!z4 || (bVar = this.e) == null) {
            return;
        }
        ((C2038a) bVar).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @OnClick({R.id.remove_image_view_pma_view_edd_input_financial_document})
    public final void onRemove() {
        b bVar = this.e;
        if (bVar != null) {
            String str = this.f14600g;
            boolean z4 = str == null || C2576A.H(str);
            EDDFinancialDocumentsFragment eDDFinancialDocumentsFragment = (EDDFinancialDocumentsFragment) ((C2038a) bVar).f19100b;
            if (z4) {
                eDDFinancialDocumentsFragment.A1(this);
                return;
            }
            eDDFinancialDocumentsFragment.getClass();
            Context context = eDDFinancialDocumentsFragment.getContext();
            if (context != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(context.getString(R.string.pma_label_edd_delete_question));
                builder.setMessage(R.string.pma_label_edd_delete_spiel).setPositiveButton(R.string.pma_label_yes, new c(2, eDDFinancialDocumentsFragment, this)).setNegativeButton(R.string.pma_label_cancel, new E(9));
                builder.show();
            }
        }
    }

    @OnClick({R.id.upload_clickable_background_view_pma_view_edd_input_financial_document, R.id.take_photo_label_text_view_pma_view_edd_input_financial_document, R.id.preview_clickable_background_view_pma_view_edd_input_financial_document, R.id.retake_text_view_pma_view_edd_input_financial_document})
    public final void onTakePhoto() {
        boolean z4 = false;
        b bVar = this.e;
        if (bVar != null) {
            C2038a c2038a = (C2038a) bVar;
            l lVar = ((EDDFinancialDocumentsFragment) c2038a.f19100b).f14534Z;
            if (lVar != null) {
                String documentId = ((EDDInputFinancialDocument) c2038a.c).getDocumentId();
                EDDActivity eDDActivity = (EDDActivity) lVar;
                kotlin.jvm.internal.j.g(documentId, "documentId");
                if (AbstractC1955a.u(eDDActivity, "android.permission.CAMERA")) {
                    eDDActivity.e.getClass();
                    Intent intent = new Intent(eDDActivity.getApplicationContext(), (Class<?>) EKycPhotoCaptureActivity.class);
                    intent.putExtra("edd_document_id", documentId);
                    eDDActivity.startActivityForResult(intent, 106);
                    return;
                }
                C2254c c2254cT1 = eDDActivity.t1();
                EDDActivity eDDActivity2 = (EDDActivity) ((InterfaceC2283a) c2254cT1.c.get());
                eDDActivity2.getClass();
                B bE = E1.c.r(new Ze.c(eDDActivity2).b("android.permission.CAMERA")).e(zh.b.a());
                f fVar = new f(new C2038a(11, c2254cT1, documentId, z4), d.f1366d);
                bE.g(fVar);
                c2254cT1.e(fVar);
            }
        }
    }

    public final void setFileUrl(String str) {
        TextView mTextViewError;
        if (str != null) {
            this.f14600g = str;
            File file = new File(str);
            if (file.exists()) {
                getContext();
                ImageView mImageView = getMImageView();
                A aD = A.d();
                aD.getClass();
                G g8 = aD.g(Uri.fromFile(file));
                g8.h(2131231811);
                g8.f(2);
                g8.e(mImageView, null);
                getMUploadGroup().setVisibility(8);
                getMPreviewGroup().setVisibility(0);
                getMTextViewError().setVisibility(8);
                EDDInputFinancialDocument eDDInputFinancialDocument = this.j;
                if (eDDInputFinancialDocument != null && (mTextViewError = eDDInputFinancialDocument.getMTextViewError()) != null) {
                    mTextViewError.setVisibility(8);
                }
                EDDInputFinancialDocument eDDInputFinancialDocument2 = this.j;
                G5.l.a(eDDInputFinancialDocument2 != null ? eDDInputFinancialDocument2.getMTextInputLayout() : null);
                getMBackgroundDocument().setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.pma_background_dark_white_thin_border, null));
            }
        }
    }

    public final void setFirstItem(EDDInputFinancialDocument eDDInputFinancialDocument) {
        this.j = eDDInputFinancialDocument;
    }

    public final void setInput(EDDFinancialDocument eDDFinancialDocument) {
        String name;
        if (eDDFinancialDocument != null) {
            this.f = eDDFinancialDocument.getFinancialDocument();
            setFileUrl(eDDFinancialDocument.getFileUrl());
            FinancialDocument financialDocument = eDDFinancialDocument.getFinancialDocument();
            if (financialDocument == null || (name = financialDocument.getName()) == null) {
                name = "";
            }
            setText(name);
        }
    }

    public final void setMBackgroundDocument(View view) {
        kotlin.jvm.internal.j.g(view, "<set-?>");
        this.mBackgroundDocument = view;
    }

    public final void setMEDDInputListener(b bVar) {
        this.e = bVar;
    }

    public final void setMEditText(TextInputEditText textInputEditText) {
        kotlin.jvm.internal.j.g(textInputEditText, "<set-?>");
        this.mEditText = textInputEditText;
    }

    public final void setMFileUrl(String str) {
        this.f14600g = str;
    }

    public final void setMFinancialDocument(FinancialDocument financialDocument) {
        this.f = financialDocument;
    }

    public final void setMImageView(ImageView imageView) {
        kotlin.jvm.internal.j.g(imageView, "<set-?>");
        this.mImageView = imageView;
    }

    public final void setMName(String str) {
        this.h = str;
    }

    public final void setMPreviewGroup(Group group) {
        kotlin.jvm.internal.j.g(group, "<set-?>");
        this.mPreviewGroup = group;
    }

    public final void setMRemoveImageView(ImageView imageView) {
        kotlin.jvm.internal.j.g(imageView, "<set-?>");
        this.mRemoveImageView = imageView;
    }

    public final void setMTextInputLayout(TextInputLayout textInputLayout) {
        kotlin.jvm.internal.j.g(textInputLayout, "<set-?>");
        this.mTextInputLayout = textInputLayout;
    }

    public final void setMTextViewError(TextView textView) {
        kotlin.jvm.internal.j.g(textView, "<set-?>");
        this.mTextViewError = textView;
    }

    public final void setMUploadGroup(Group group) {
        kotlin.jvm.internal.j.g(group, "<set-?>");
        this.mUploadGroup = group;
    }

    public final void setMUploadLabelGroup(Group group) {
        kotlin.jvm.internal.j.g(group, "<set-?>");
        this.mUploadLabelGroup = group;
    }

    public final void setMViewDivider(View view) {
        kotlin.jvm.internal.j.g(view, "<set-?>");
        this.mViewDivider = view;
    }

    public final void setText(String text) {
        kotlin.jvm.internal.j.g(text, "text");
        this.f14599d = true;
        getMEditText().setText(text);
        getMUploadGroup().setVisibility(0);
        getMUploadLabelGroup().setVisibility(0);
        getMViewDivider().setVisibility(0);
        getMPreviewGroup().setVisibility(8);
    }
}
