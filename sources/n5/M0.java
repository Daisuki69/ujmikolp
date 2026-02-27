package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.qr.view.widget.MayaCameraHeaderQRPH;
import com.paymaya.mayaui.qr.view.widget.MayaCameraSourcePreview;
import com.paymaya.mayaui.qr.view.widget.MayaQrScannerMaskView;

/* JADX INFO: loaded from: classes4.dex */
public final class M0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3766a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3767b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3768d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f3769g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f3771l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f3772n;

    public M0(ViewGroup viewGroup, ImageView imageView, AppCompatEditText appCompatEditText, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView, ImageView imageView3, TextView textView2, AppCompatEditText appCompatEditText2, TextView textView3, ImageView imageView4, ImageView imageView5, TextView textView4) {
        this.f3768d = viewGroup;
        this.e = imageView;
        this.f = appCompatEditText;
        this.f3767b = constraintLayout;
        this.f3769g = imageView2;
        this.h = textView;
        this.c = imageView3;
        this.i = textView2;
        this.j = appCompatEditText2;
        this.f3770k = textView3;
        this.f3771l = imageView4;
        this.m = imageView5;
        this.f3772n = textView4;
    }

    public static M0 a(LayoutInflater layoutInflater, MayaInputLayout mayaInputLayout) {
        layoutInflater.inflate(R.layout.maya_view_input_layout, mayaInputLayout);
        int i = R.id.close_icon_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(mayaInputLayout, R.id.close_icon_image_view);
        if (imageView != null) {
            i = R.id.floating_prefix;
            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(mayaInputLayout, R.id.floating_prefix);
            if (appCompatEditText != null) {
                i = R.id.form_constraint_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(mayaInputLayout, R.id.form_constraint_layout);
                if (constraintLayout != null) {
                    i = R.id.helper_error_icon_image_view;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(mayaInputLayout, R.id.helper_error_icon_image_view);
                    if (imageView2 != null) {
                        i = R.id.helper_error_spiel_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(mayaInputLayout, R.id.helper_error_spiel_text_view);
                        if (textView != null) {
                            i = R.id.helper_info_icon_image_view;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(mayaInputLayout, R.id.helper_info_icon_image_view);
                            if (imageView3 != null) {
                                i = R.id.helper_info_spiel_text_view;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(mayaInputLayout, R.id.helper_info_spiel_text_view);
                                if (textView2 != null) {
                                    i = R.id.input_edit_text;
                                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) ViewBindings.findChildViewById(mayaInputLayout, R.id.input_edit_text);
                                    if (appCompatEditText2 != null) {
                                        i = R.id.label_text_view;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(mayaInputLayout, R.id.label_text_view);
                                        if (textView3 != null) {
                                            i = R.id.primary_icon_image_view;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(mayaInputLayout, R.id.primary_icon_image_view);
                                            if (imageView4 != null) {
                                                i = R.id.secondary_icon_image_view;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(mayaInputLayout, R.id.secondary_icon_image_view);
                                                if (imageView5 != null) {
                                                    i = R.id.sub_label_text_view;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(mayaInputLayout, R.id.sub_label_text_view);
                                                    if (textView4 != null) {
                                                        return new M0(mayaInputLayout, imageView, appCompatEditText, constraintLayout, imageView2, textView, imageView3, textView2, appCompatEditText2, textView3, imageView4, imageView5, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(mayaInputLayout.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3766a) {
            case 0:
                return this.f3767b;
            case 1:
                return (SpringView) this.f3768d;
            case 2:
                return (ViewGroup) this.f3768d;
            default:
                return this.f3767b;
        }
    }

    public M0(SpringView springView, ConstraintLayout constraintLayout, SpringView springView2, FrameLayout frameLayout, Group group, FrameLayout frameLayout2, C0491z c0491z, C0446d1 c0446d1, C0449e1 c0449e1, C0443c1 c0443c1, C0435a c0435a, I i, C0441c c0441c) {
        this.f3768d = springView;
        this.f3767b = constraintLayout;
        this.e = springView2;
        this.f = frameLayout;
        this.c = group;
        this.f3769g = frameLayout2;
        this.h = c0491z;
        this.i = c0446d1;
        this.j = c0449e1;
        this.f3770k = c0443c1;
        this.f3771l = c0435a;
        this.m = i;
        this.f3772n = c0441c;
    }

    public M0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MayaButtonWithIcon mayaButtonWithIcon, View view, Group group, TextView textView, MayaCameraSourcePreview mayaCameraSourcePreview, MayaQrScannerMaskView mayaQrScannerMaskView, AppCompatTextView appCompatTextView, TextView textView2, MayaButtonWithIcon mayaButtonWithIcon2, C0441c c0441c, MayaCameraHeaderQRPH mayaCameraHeaderQRPH) {
        this.f3767b = constraintLayout;
        this.f3768d = appCompatImageView;
        this.e = mayaButtonWithIcon;
        this.f3769g = view;
        this.c = group;
        this.h = textView;
        this.j = mayaCameraSourcePreview;
        this.f3770k = mayaQrScannerMaskView;
        this.f3771l = appCompatTextView;
        this.i = textView2;
        this.f = mayaButtonWithIcon2;
        this.m = c0441c;
        this.f3772n = mayaCameraHeaderQRPH;
    }

    public M0(ConstraintLayout constraintLayout, Button button, HtmlTextView htmlTextView, AppBarLayout appBarLayout, View view, View view2, View view3, View view4, View view5, CheckBox checkBox, TextView textView, View view6, View view7) {
        this.f3767b = constraintLayout;
        this.f3768d = button;
        this.e = htmlTextView;
        this.f = appBarLayout;
        this.f3769g = view;
        this.c = view2;
        this.i = view3;
        this.j = view4;
        this.f3770k = view5;
        this.f3771l = checkBox;
        this.h = textView;
        this.m = view6;
        this.f3772n = view7;
    }
}
