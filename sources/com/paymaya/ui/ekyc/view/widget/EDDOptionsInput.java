package com.paymaya.ui.ekyc.view.widget;

import Bd.g;
import Bd.j;
import G5.k;
import G5.l;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.dynatrace.android.agent.Global;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.domain.model.EDDOptionInput;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;
import com.paymaya.ui.ekyc.view.widget.EDDOptionsInput;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDOptionsInput extends ConstraintLayout implements j {
    public static int i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractBaseEDDFormFragmentImpl f14607d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14608g;
    public EDDOptionsInput h;

    @BindView(R.id.edd_edit_text_pma_view_edd_input)
    public TextInputEditText mEditText;

    @BindView(R.id.edd_options_edit_text_pma_view_edd_input)
    public TextInputEditText mOptionsEditText;

    @BindView(R.id.edd_options_text_input_layout_pma_view_edd_input)
    public TextInputLayout mOptionsTextInputLayout;

    @BindView(R.id.remove_image_view_pma_view_edd_input)
    public ImageView mRemoveImageView;

    @BindView(R.id.edd_text_input_layout_pma_view_edd_input)
    public TextInputLayout mTextInputLayout;

    public EDDOptionsInput(Context context) {
        super(context);
        this.f14608g = "";
        View.inflate(getContext(), R.layout.pma_view_edd_options_input, this);
        ButterKnife.bind(this);
        getMEditText().setSaveEnabled(false);
        getMOptionsEditText().setSaveEnabled(false);
    }

    private final void setInputVisibility(String str) {
        if (C2576A.x(str, "other", true)) {
            this.e = true;
            getMTextInputLayout().setVisibility(0);
        } else {
            this.e = false;
            getMTextInputLayout().setVisibility(8);
        }
    }

    public final void b(k isValidListener) {
        kotlin.jvm.internal.j.g(isValidListener, "isValidListener");
        TextInputEditText mOptionsEditText = getMOptionsEditText();
        EDDOptionsInput eDDOptionsInput = this.h;
        l lVar = new l(eDDOptionsInput != null ? eDDOptionsInput.getMOptionsTextInputLayout() : null);
        final int i4 = 0;
        lVar.f1751b = new G5.j(this) { // from class: Bd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EDDOptionsInput f426b;

            {
                this.f426b = this;
            }

            @Override // G5.j
            public final void c() {
                EDDOptionsInput eDDOptionsInput2 = this.f426b;
                switch (i4) {
                    case 0:
                        int i6 = EDDOptionsInput.i;
                        eDDOptionsInput2.h();
                        break;
                    default:
                        int i10 = EDDOptionsInput.i;
                        eDDOptionsInput2.h();
                        break;
                }
            }
        };
        lVar.c = isValidListener;
        mOptionsEditText.addTextChangedListener(lVar);
        TextInputEditText mEditText = getMEditText();
        EDDOptionsInput eDDOptionsInput2 = this.h;
        l lVar2 = new l(eDDOptionsInput2 != null ? eDDOptionsInput2.getMTextInputLayout() : null);
        final int i6 = 1;
        lVar2.f1751b = new G5.j(this) { // from class: Bd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EDDOptionsInput f426b;

            {
                this.f426b = this;
            }

            @Override // G5.j
            public final void c() {
                EDDOptionsInput eDDOptionsInput22 = this.f426b;
                switch (i6) {
                    case 0:
                        int i62 = EDDOptionsInput.i;
                        eDDOptionsInput22.h();
                        break;
                    default:
                        int i10 = EDDOptionsInput.i;
                        eDDOptionsInput22.h();
                        break;
                }
            }
        };
        lVar2.c = isValidListener;
        mEditText.addTextChangedListener(lVar2);
    }

    public final boolean c() {
        return this.e && String.valueOf(getMEditText().getText()).length() == 0;
    }

    public final boolean d() {
        return String.valueOf(getMOptionsEditText().getText()).length() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str, String str2, boolean z4, g gVar) {
        int i4 = i + 1;
        i = i4;
        this.f = i4;
        getMOptionsTextInputLayout().setHint(str);
        getMTextInputLayout().setHint(str2);
        getMRemoveImageView().setVisibility(z4 ? 0 : 8);
        this.f14607d = (AbstractBaseEDDFormFragmentImpl) gVar;
    }

    public final void f() {
        if (getMTextInputLayout().isHintEnabled()) {
            getMTextInputLayout().setHintEnabled(false);
            getMTextInputLayout().setError(getContext().getString(R.string.pma_error_missing_this_field_p));
        }
    }

    public final void g() {
        if (getMOptionsTextInputLayout().isHintEnabled()) {
            getMOptionsTextInputLayout().setHintEnabled(false);
            getMOptionsTextInputLayout().setError(getContext().getString(R.string.pma_error_missing_this_field_p));
        }
    }

    public final EDDOptionsInput getFirstItem() {
        return this.h;
    }

    public final String getInput() {
        String string;
        String string2;
        String string3 = null;
        if (!this.e) {
            Editable text = getMOptionsEditText().getText();
            if (text == null || (string = text.toString()) == null) {
                return null;
            }
            return C2576A.b0(string).toString();
        }
        String str = this.f14608g;
        Editable text2 = getMEditText().getText();
        if (text2 != null && (string2 = text2.toString()) != null) {
            string3 = C2576A.b0(string2).toString();
        }
        return C2576A.b0(str + Global.BLANK + string3).toString();
    }

    public final EDDOptionInput getInputAsEDDOptionInput() {
        return new EDDOptionInput(String.valueOf(getMOptionsEditText().getText()), String.valueOf(getMEditText().getText()));
    }

    public final int getItemId() {
        return this.f;
    }

    public final TextInputEditText getMEditText() {
        TextInputEditText textInputEditText = this.mEditText;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        kotlin.jvm.internal.j.n("mEditText");
        throw null;
    }

    public final TextInputEditText getMOptionsEditText() {
        TextInputEditText textInputEditText = this.mOptionsEditText;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        kotlin.jvm.internal.j.n("mOptionsEditText");
        throw null;
    }

    public final TextInputLayout getMOptionsTextInputLayout() {
        TextInputLayout textInputLayout = this.mOptionsTextInputLayout;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        kotlin.jvm.internal.j.n("mOptionsTextInputLayout");
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

    public final String getPrefix() {
        return this.f14608g;
    }

    public final void h() {
        EDDOptionsInput eDDOptionsInput;
        EDDOptionsInput eDDOptionsInput2 = this.h;
        if (eDDOptionsInput2 != null && eDDOptionsInput2.c()) {
            EDDOptionsInput eDDOptionsInput3 = this.h;
            if (eDDOptionsInput3 != null) {
                eDDOptionsInput3.f();
                return;
            }
            return;
        }
        EDDOptionsInput eDDOptionsInput4 = this.h;
        if (!((eDDOptionsInput4 != null && eDDOptionsInput4.d()) || d() || c()) || (eDDOptionsInput = this.h) == null) {
            return;
        }
        eDDOptionsInput.g();
    }

    @Override // Bd.j
    public final boolean isEmpty() {
        boolean z4;
        EDDOptionsInput eDDOptionsInput = this.h;
        if (eDDOptionsInput != null && eDDOptionsInput.d() && d()) {
            EDDOptionsInput eDDOptionsInput2 = this.h;
            if (eDDOptionsInput2 != null) {
                eDDOptionsInput2.g();
            }
            z4 = true;
        } else {
            z4 = false;
        }
        EDDOptionsInput eDDOptionsInput3 = this.h;
        if (eDDOptionsInput3 != null && eDDOptionsInput3.c()) {
            EDDOptionsInput eDDOptionsInput4 = this.h;
            if (eDDOptionsInput4 != null) {
                eDDOptionsInput4.f();
            }
            z4 = true;
        }
        if (!c()) {
            return z4;
        }
        EDDOptionsInput eDDOptionsInput5 = this.h;
        if (eDDOptionsInput5 != null) {
            eDDOptionsInput5.f();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bd.g, com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @OnClick({R.id.edd_options_edit_text_pma_view_edd_input})
    public final void onClickOptions() {
        ?? r02 = this.f14607d;
        if (r02 != 0) {
            r02.l(this.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bd.g, com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl] */
    @OnClick({R.id.remove_image_view_pma_view_edd_input})
    public final void onRemove() {
        ?? r02 = this.f14607d;
        if (r02 != 0) {
            r02.Q0(this);
        }
    }

    public final void setFirstItem(EDDOptionsInput eDDOptionsInput) {
        this.h = eDDOptionsInput;
    }

    public final void setInput(EDDOptionInput eDDOptionInput) {
        if (eDDOptionInput != null) {
            String input = eDDOptionInput.getInput();
            if (input == null) {
                input = "";
            }
            setSelectedOption(input);
            if (this.e) {
                getMEditText().setText(eDDOptionInput.getOthersInput());
            }
        }
    }

    public final void setItemId(int i4) {
        this.f = i4;
    }

    public final void setMEditText(TextInputEditText textInputEditText) {
        kotlin.jvm.internal.j.g(textInputEditText, "<set-?>");
        this.mEditText = textInputEditText;
    }

    public final void setMOptionsEditText(TextInputEditText textInputEditText) {
        kotlin.jvm.internal.j.g(textInputEditText, "<set-?>");
        this.mOptionsEditText = textInputEditText;
    }

    public final void setMOptionsTextInputLayout(TextInputLayout textInputLayout) {
        kotlin.jvm.internal.j.g(textInputLayout, "<set-?>");
        this.mOptionsTextInputLayout = textInputLayout;
    }

    public final void setMRemoveImageView(ImageView imageView) {
        kotlin.jvm.internal.j.g(imageView, "<set-?>");
        this.mRemoveImageView = imageView;
    }

    public final void setMTextInputLayout(TextInputLayout textInputLayout) {
        kotlin.jvm.internal.j.g(textInputLayout, "<set-?>");
        this.mTextInputLayout = textInputLayout;
    }

    public final void setPrefix(String str) {
        kotlin.jvm.internal.j.g(str, "<set-?>");
        this.f14608g = str;
    }

    public final void setSelectedOption(String text) {
        kotlin.jvm.internal.j.g(text, "text");
        setInputVisibility(text);
        getMOptionsEditText().setText(text);
    }
}
