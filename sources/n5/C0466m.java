package N5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;

/* JADX INFO: renamed from: N5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0466m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f4150b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4151d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4152g;
    public final Object h;
    public final Object i;

    public /* synthetic */ C0466m(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i) {
        this.f4149a = i;
        this.f4150b = viewGroup;
        this.c = view;
        this.e = view2;
        this.f = view3;
        this.f4152g = view4;
        this.h = view5;
        this.i = view6;
        this.f4151d = view7;
    }

    public static C0466m a(View view) {
        int i = R.id.checkbox_middle_name;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.checkbox_middle_name);
        if (appCompatCheckBox != null) {
            i = R.id.maya_dropdown_relationship;
            MayaDropDown mayaDropDown = (MayaDropDown) ViewBindings.findChildViewById(view, R.id.maya_dropdown_relationship);
            if (mayaDropDown != null) {
                i = R.id.maya_input_first_name;
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(view, R.id.maya_input_first_name);
                if (mayaProfileInputLayout != null) {
                    i = R.id.maya_input_last_name;
                    MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) ViewBindings.findChildViewById(view, R.id.maya_input_last_name);
                    if (mayaProfileInputLayout2 != null) {
                        i = R.id.maya_input_middle_name;
                        MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) ViewBindings.findChildViewById(view, R.id.maya_input_middle_name);
                        if (mayaProfileInputLayout3 != null) {
                            i = R.id.text_view_cancel;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_view_cancel);
                            if (textView != null) {
                                i = R.id.text_view_relatives_information;
                                if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_relatives_information)) != null) {
                                    i = R.id.view_separator_relatives_and_bank_roles;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.view_separator_relatives_and_bank_roles);
                                    if (viewFindChildViewById != null) {
                                        return new C0466m((ViewGroup) view, (View) appCompatCheckBox, (View) mayaDropDown, (View) mayaProfileInputLayout, (View) mayaProfileInputLayout2, (View) mayaProfileInputLayout3, (View) textView, viewFindChildViewById, 16);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4149a) {
        }
        return (ConstraintLayout) this.f4150b;
    }

    public /* synthetic */ C0466m(ViewGroup viewGroup, Object obj, View view, Object obj2, Object obj3, Object obj4, View view2, View view3, int i) {
        this.f4149a = i;
        this.f4150b = viewGroup;
        this.c = obj;
        this.f4151d = view;
        this.e = obj2;
        this.f = obj3;
        this.f4152g = obj4;
        this.h = view2;
        this.i = view3;
    }

    public C0466m(ConstraintLayout constraintLayout, View view, View view2, View view3, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3) {
        this.f4149a = 18;
        this.f4150b = constraintLayout;
        this.f4151d = view;
        this.e = view2;
        this.f = view3;
        this.c = textView;
        this.f4152g = appCompatImageView;
        this.h = textView2;
        this.i = textView3;
    }

    public C0466m(ConstraintLayout constraintLayout, Button button, Group group, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, G0 g02, G0 g03) {
        this.f4149a = 17;
        this.f4150b = constraintLayout;
        this.c = group;
        this.f4151d = recyclerView;
        this.e = textView;
        this.f = textView2;
        this.f4152g = textView3;
        this.h = g02;
        this.i = g03;
    }

    public C0466m(ItemSlideLayoutView itemSlideLayoutView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, ConstraintLayout constraintLayout, ItemSlideLayoutView itemSlideLayoutView2, ConstraintLayout constraintLayout2) {
        this.f4149a = 19;
        this.c = itemSlideLayoutView;
        this.f4151d = imageView;
        this.e = imageView2;
        this.f = textView;
        this.f4152g = textView2;
        this.f4150b = constraintLayout;
        this.h = itemSlideLayoutView2;
        this.i = constraintLayout2;
    }

    public C0466m(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Button button, TextView textView3, MayaInputLayout mayaInputLayout, Button button2, TextView textView4) {
        this.f4149a = 12;
        this.f4150b = constraintLayout;
        this.f4151d = textView;
        this.e = textView2;
        this.c = button;
        this.f = textView3;
        this.f4152g = mayaInputLayout;
        this.h = button2;
        this.i = textView4;
    }

    public C0466m(NestedScrollView nestedScrollView, Group group, RecyclerView recyclerView, RecyclerView recyclerView2, AppCompatTextView appCompatTextView, TextView textView, View view, View view2, View view3) {
        this.f4149a = 2;
        this.f4150b = nestedScrollView;
        this.c = group;
        this.f4152g = recyclerView;
        this.h = recyclerView2;
        this.i = appCompatTextView;
        this.f4151d = view;
        this.e = view2;
        this.f = view3;
    }

    public C0466m(SpringView springView, View view, Group group, SpringView springView2, RecyclerView recyclerView, RecyclerView recyclerView2, Group group2, TextView textView) {
        this.f4149a = 11;
        this.f4150b = springView;
        this.f4151d = view;
        this.c = group;
        this.e = springView2;
        this.f = recyclerView;
        this.f4152g = recyclerView2;
        this.h = group2;
        this.i = textView;
    }

    public C0466m(NestedScrollView nestedScrollView, Button button, TextView textView, TextView textView2, TextView textView3, View view, View view2, View view3) {
        this.f4149a = 5;
        this.f4150b = nestedScrollView;
        this.c = button;
        this.f4152g = textView;
        this.h = textView2;
        this.i = textView3;
        this.f4151d = view;
        this.e = view2;
        this.f = view3;
    }
}
