package a7;

import M8.D0;
import N5.y1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: renamed from: a7.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0657r extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f7053d;
    public final ConstraintLayout e;
    public final ShapeableImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f7054g;
    public final TextView h;
    public final AppCompatCheckBox i;
    public boolean j;

    public C0657r(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_view_provision_option_item, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.provision_check_box;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.provision_check_box);
        if (appCompatCheckBox != null) {
            i = R.id.provision_icon_image_view;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(viewInflate, R.id.provision_icon_image_view);
            if (shapeableImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.provision_name_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.provision_name_text_view);
                if (textView != null) {
                    i = R.id.provision_spiel_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.provision_spiel_text_view);
                    if (textView2 != null) {
                        this.f7053d = new y1(constraintLayout, appCompatCheckBox, shapeableImageView, constraintLayout, textView, textView2);
                        this.e = getBinding().f4301d;
                        this.f = getBinding().c;
                        this.f7054g = getBinding().e;
                        this.h = getBinding().f;
                        this.i = getBinding().f4300b;
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final y1 getBinding() {
        y1 y1Var = this.f7053d;
        kotlin.jvm.internal.j.d(y1Var);
        return y1Var;
    }

    public final void b(int i, int i4) {
        ShapeableImageView shapeableImageView = this.f;
        if (shapeableImageView == null) {
            kotlin.jvm.internal.j.n("mProvisionIconImageView");
            throw null;
        }
        shapeableImageView.setImageDrawable(ContextCompat.getDrawable(getContext(), i));
        ShapeableImageView shapeableImageView2 = this.f;
        if (shapeableImageView2 != null) {
            shapeableImageView2.setBackgroundColor(ContextCompat.getColor(getContext(), i4));
        } else {
            kotlin.jvm.internal.j.n("mProvisionIconImageView");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final AppCompatCheckBox getProvisionCheckbox() {
        AppCompatCheckBox appCompatCheckBox = this.i;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox;
        }
        kotlin.jvm.internal.j.n("mProvisionCheckbox");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("state_child_views");
            if (sparseParcelableArray != null) {
                jk.b.t(this, sparseParcelableArray);
            }
            parcelable = bundle.getParcelable("state_super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_super_state", super.onSaveInstanceState());
        bundle.putSparseParcelableArray("state_child_views", jk.b.u(this));
        return bundle;
    }

    public final void setProvisionCheckBoxChecked(boolean z4) {
        this.j = true;
        AppCompatCheckBox appCompatCheckBox = this.i;
        if (appCompatCheckBox == null) {
            kotlin.jvm.internal.j.n("mProvisionCheckbox");
            throw null;
        }
        appCompatCheckBox.setChecked(z4);
        this.j = false;
    }

    public final void setProvisionCheckboxClickable(boolean z4) {
        if (!z4) {
            AppCompatCheckBox appCompatCheckBox = this.i;
            if (appCompatCheckBox == null) {
                kotlin.jvm.internal.j.n("mProvisionCheckbox");
                throw null;
            }
            appCompatCheckBox.setAlpha(0.25f);
        }
        AppCompatCheckBox appCompatCheckBox2 = this.i;
        if (appCompatCheckBox2 != null) {
            appCompatCheckBox2.setClickable(z4);
        } else {
            kotlin.jvm.internal.j.n("mProvisionCheckbox");
            throw null;
        }
    }

    public final void setProvisionCheckboxEnabled(boolean z4) {
        AppCompatCheckBox appCompatCheckBox = this.i;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mProvisionCheckbox");
            throw null;
        }
    }

    public final void setProvisionCheckboxHidden(boolean z4) {
        AppCompatCheckBox appCompatCheckBox = this.i;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setVisibility(z4 ? 4 : 0);
        } else {
            kotlin.jvm.internal.j.n("mProvisionCheckbox");
            throw null;
        }
    }

    public final void setProvisionItemBackground(@DrawableRes int i) {
        ConstraintLayout constraintLayout = this.e;
        if (constraintLayout != null) {
            constraintLayout.setBackground(ContextCompat.getDrawable(getContext(), i));
        } else {
            kotlin.jvm.internal.j.n("mProvisionItem");
            throw null;
        }
    }

    public final void setProvisionItemBackgroundColor(@ColorRes int i) {
        ConstraintLayout constraintLayout = this.e;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(ContextCompat.getColor(getContext(), i));
        } else {
            kotlin.jvm.internal.j.n("mProvisionItem");
            throw null;
        }
    }

    public final void setProvisionItemName(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        TextView textView = this.f7054g;
        if (textView != null) {
            textView.setText(name);
        } else {
            kotlin.jvm.internal.j.n("mProvisionNameTextView");
            throw null;
        }
    }

    public final void setProvisionItemSpiel(String spiel) {
        kotlin.jvm.internal.j.g(spiel, "spiel");
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(spiel);
        } else {
            kotlin.jvm.internal.j.n("mProvisionSpielTextView");
            throw null;
        }
    }

    public final void setProvisionOnCheckedListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        kotlin.jvm.internal.j.g(onCheckedChangeListener, "onCheckedChangeListener");
        AppCompatCheckBox appCompatCheckBox = this.i;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(new D0(3, this, onCheckedChangeListener));
        } else {
            kotlin.jvm.internal.j.n("mProvisionCheckbox");
            throw null;
        }
    }

    public final void setProvisionOptionId(String provisionOptionId) {
        kotlin.jvm.internal.j.g(provisionOptionId, "provisionOptionId");
        AppCompatCheckBox appCompatCheckBox = this.i;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setTag(provisionOptionId);
        } else {
            kotlin.jvm.internal.j.n("mProvisionCheckbox");
            throw null;
        }
    }
}
