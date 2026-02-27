package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.qr.view.widget.MayaCameraHeaderQRPH;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3585a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3586b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f3587d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3588g;
    public final View h;
    public final View i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f3590l;
    public final Object m;

    public E(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, Toolbar toolbar, PreviewView previewView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2) {
        this.f3587d = constraintLayout;
        this.c = constraintLayout2;
        this.e = constraintLayout3;
        this.f3589k = toolbar;
        this.f3586b = previewView;
        this.f3590l = view;
        this.f = textView;
        this.f3588g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.m = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3585a) {
            case 0:
                return (FrameLayout) this.f3587d;
            case 1:
                return (ScrollView) this.f3587d;
            case 2:
                return (ConstraintLayout) this.f3587d;
            case 3:
                return (ConstraintLayout) this.f3587d;
            case 4:
                return (ConstraintLayout) this.c;
            case 5:
                return (ConstraintLayout) this.f3587d;
            case 6:
                return (SpringView) this.c;
            case 7:
                return (ItemSlideLayoutView) this.f3587d;
            case 8:
                return (ConstraintLayout) this.f3587d;
            default:
                return (NestedScrollView) this.f3587d;
        }
    }

    public E(ItemSlideLayoutView itemSlideLayoutView, ConstraintLayout constraintLayout, Group group, ImageView imageView, ImageView imageView2, ItemSlideLayoutView itemSlideLayoutView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.f3587d = itemSlideLayoutView;
        this.f3590l = group;
        this.c = imageView;
        this.e = imageView2;
        this.f3589k = itemSlideLayoutView2;
        this.f3586b = constraintLayout2;
        this.f = textView;
        this.f3588g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.m = view;
    }

    public E(NestedScrollView nestedScrollView, TextInputEditText textInputEditText, Group group, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, Button button, SwitchCompat switchCompat, TextInputEditText textInputEditText2, Group group2, TextInputLayout textInputLayout2, HtmlTextView htmlTextView, SwitchCompat switchCompat2) {
        this.f3587d = nestedScrollView;
        this.c = textInputEditText;
        this.f3590l = group;
        this.e = textInputLayout;
        this.f = constraintLayout;
        this.f3586b = button;
        this.f3588g = switchCompat;
        this.h = textInputEditText2;
        this.i = group2;
        this.j = textInputLayout2;
        this.f3589k = htmlTextView;
        this.m = switchCompat2;
    }

    public E(ConstraintLayout constraintLayout, View view, View view2, ConstraintLayout constraintLayout2, Group group, ImageView imageView, HtmlTextView htmlTextView, HtmlTextView htmlTextView2, TextView textView, TextView textView2, View view3, View view4) {
        this.f3587d = constraintLayout;
        this.c = view;
        this.e = view2;
        this.h = constraintLayout2;
        this.f3590l = group;
        this.i = imageView;
        this.j = htmlTextView;
        this.f3589k = htmlTextView2;
        this.f = textView;
        this.f3588g = textView2;
        this.f3586b = view3;
        this.m = view4;
    }

    public E(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f3587d = constraintLayout;
        this.f3586b = button;
        this.c = button2;
        this.e = imageView;
        this.f3590l = imageView2;
        this.f = textView;
        this.f3588g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f3589k = textView6;
        this.m = textView7;
    }

    public E(SpringView springView, SpringView springView2, BannerAdCarousel bannerAdCarousel, FrameLayout frameLayout, C0450f c0450f, HtmlTextView htmlTextView, HtmlTextView htmlTextView2, C0450f c0450f2, v1 v1Var, C0489y c0489y, G0 g02, C0491z c0491z) {
        this.c = springView;
        this.e = springView2;
        this.f = bannerAdCarousel;
        this.f3587d = frameLayout;
        this.f3588g = c0450f;
        this.h = htmlTextView;
        this.i = htmlTextView2;
        this.j = c0450f2;
        this.f3589k = v1Var;
        this.f3586b = c0489y;
        this.f3590l = g02;
        this.m = c0491z;
    }

    public E(ScrollView scrollView, Button button, Button button2, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MultiColorTextView multiColorTextView, MultiColorTextView multiColorTextView2, MultiColorTextView multiColorTextView3) {
        this.f3587d = scrollView;
        this.f3586b = button;
        this.e = button2;
        this.f = imageView;
        this.f3588g = imageView2;
        this.h = imageView3;
        this.c = linearLayout;
        this.i = linearLayout2;
        this.j = linearLayout3;
        this.f3589k = multiColorTextView;
        this.f3590l = multiColorTextView2;
        this.m = multiColorTextView3;
    }

    public E(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, MayaButtonWithIcon mayaButtonWithIcon, View view, Group group, TextView textView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, TextView textView2, MayaButtonWithIcon mayaButtonWithIcon2, C0441c c0441c, MayaCameraHeaderQRPH mayaCameraHeaderQRPH) {
        this.c = constraintLayout;
        this.e = appCompatImageView;
        this.h = mayaButtonWithIcon;
        this.i = view;
        this.f3590l = group;
        this.f = textView;
        this.f3587d = frameLayout;
        this.j = appCompatTextView;
        this.f3588g = textView2;
        this.f3589k = mayaButtonWithIcon2;
        this.f3586b = c0441c;
        this.m = mayaCameraHeaderQRPH;
    }

    public E(ConstraintLayout constraintLayout, MayaInputLayout mayaInputLayout, MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout, C0466m c0466m, LinearLayout linearLayout, MayaInputLayout mayaInputLayout2, AppCompatCheckBox appCompatCheckBox, TextView textView, TextView textView2, Button button, MayaInputLayout mayaInputLayout3, Group group) {
        this.f3587d = constraintLayout;
        this.h = mayaInputLayout;
        this.i = mayaAutoCompleteInputLayout;
        this.j = c0466m;
        this.c = linearLayout;
        this.f3589k = mayaInputLayout2;
        this.e = appCompatCheckBox;
        this.f = textView;
        this.f3588g = textView2;
        this.f3586b = button;
        this.m = mayaInputLayout3;
        this.f3590l = group;
    }

    public E(FrameLayout frameLayout, LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, TextView textView, Button button, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, Group group, MayaStaticToolTipView mayaStaticToolTipView) {
        this.f3587d = frameLayout;
        this.c = linearLayout;
        this.e = appCompatCheckBox;
        this.f = textView;
        this.f3586b = button;
        this.f3588g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.f3589k = textView6;
        this.f3590l = group;
        this.m = mayaStaticToolTipView;
    }
}
