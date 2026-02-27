package com.paymaya.ui.ekyc.view.widget;

import Bd.j;
import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDRelatedCompaniesFragment;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import o6.f;
import sd.d;
import yd.i;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDInput extends ConstraintLayout implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bd.a f14596d;
    public EDDInput e;

    @BindView(R.id.edd_edit_text_pma_view_edd_input)
    public TextInputEditText mEditText;

    @BindView(R.id.remove_image_view_pma_view_edd_input)
    public ImageView mRemoveImageView;

    @BindView(R.id.edd_text_input_layout_pma_view_edd_input)
    public TextInputLayout mTextInputLayout;

    public static final class MyState extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<MyState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f14597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyState(Parcelable parcelable, String input) {
            super(parcelable);
            kotlin.jvm.internal.j.g(input, "input");
            this.f14597a = parcelable;
            this.f14598b = input;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            kotlin.jvm.internal.j.g(dest, "dest");
            dest.writeParcelable(this.f14597a, i);
            dest.writeString(this.f14598b);
        }
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

    public final EDDInput getFirstItem() {
        return this.e;
    }

    public final String getInput() {
        String string;
        Editable text = getMEditText().getText();
        if (text == null || (string = text.toString()) == null) {
            return null;
        }
        return C2576A.b0(string).toString();
    }

    public final Bd.a getMEDDInputListener() {
        return this.f14596d;
    }

    public final TextInputEditText getMEditText() {
        TextInputEditText textInputEditText = this.mEditText;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        kotlin.jvm.internal.j.n("mEditText");
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // Bd.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isEmpty() {
        /*
            r2 = this;
            com.paymaya.ui.ekyc.view.widget.EDDInput r0 = r2.e
            if (r0 == 0) goto L12
            boolean r0 = r0.b()
            r1 = 1
            if (r0 != r1) goto L12
            boolean r0 = r2.b()
            if (r0 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1c
            com.paymaya.ui.ekyc.view.widget.EDDInput r0 = r2.e
            if (r0 == 0) goto L1c
            r0.c()
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.ekyc.view.widget.EDDInput.isEmpty():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @OnClick({R.id.remove_image_view_pma_view_edd_input})
    public final void onRemove() {
        Bd.a aVar = this.f14596d;
        if (aVar != null) {
            f fVar = (f) aVar;
            ((EDDRelatedCompaniesFragment) fVar.f18793b).f14508V.remove(this);
            ((EDDRelatedCompaniesFragment) fVar.f18793b).s1().removeView(this);
            d dVarZ1 = ((EDDRelatedCompaniesFragment) fVar.f18793b).z1();
            int size = ((AbstractBaseEDDFormFragmentImpl) ((i) dVarZ1.c.get())).f14508V.size();
            EDDSettings eDDSettingsA = dVarZ1.e.a();
            if (size < (eDDSettingsA != null ? eDDSettingsA.getMaxRelatedCompanies() : 0)) {
                View view = ((AbstractBaseEDDFormFragmentImpl) ((i) dVarZ1.c.get())).mAddItemButton;
                if (view != null) {
                    view.setVisibility(0);
                } else {
                    kotlin.jvm.internal.j.n("mAddItemButton");
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        Parcelable parcelable2;
        MyState myState = parcelable instanceof MyState ? (MyState) parcelable : null;
        if (myState != null && (parcelable2 = myState.f14597a) != null) {
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
        TextInputEditText mEditText = getMEditText();
        if (myState == null || (str = myState.f14598b) == null) {
            str = "";
        }
        mEditText.setText(str);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new MyState(super.onSaveInstanceState(), String.valueOf(getMEditText().getText()));
    }

    public final void setFirstItem(EDDInput eDDInput) {
        this.e = eDDInput;
    }

    public final void setInput(String str) {
        if (str != null) {
            getMEditText().setText(str);
        }
    }

    public final void setMEDDInputListener(Bd.a aVar) {
        this.f14596d = aVar;
    }

    public final void setMEditText(TextInputEditText textInputEditText) {
        kotlin.jvm.internal.j.g(textInputEditText, "<set-?>");
        this.mEditText = textInputEditText;
    }

    public final void setMRemoveImageView(ImageView imageView) {
        kotlin.jvm.internal.j.g(imageView, "<set-?>");
        this.mRemoveImageView = imageView;
    }

    public final void setMTextInputLayout(TextInputLayout textInputLayout) {
        kotlin.jvm.internal.j.g(textInputLayout, "<set-?>");
        this.mTextInputLayout = textInputLayout;
    }
}
