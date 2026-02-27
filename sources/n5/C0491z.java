package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.MayaCustomCardView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: renamed from: N5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0491z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4303b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4304d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4305g;
    public final Object h;

    public /* synthetic */ C0491z(ViewGroup viewGroup, View view, TextView textView, TextView textView2, TextView textView3, View view2, View view3, int i) {
        this.f4302a = i;
        this.f4303b = viewGroup;
        this.c = view;
        this.f4304d = textView;
        this.h = textView2;
        this.e = textView3;
        this.f = view2;
        this.f4305g = view3;
    }

    public static C0491z a(View view) {
        Toolbar toolbar = (Toolbar) view;
        int i = R.id.percentage_progress_bar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.percentage_progress_bar);
        if (progressBar != null) {
            i = R.id.right_inset_space;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.right_inset_space);
            if (viewFindChildViewById != null) {
                i = R.id.steps_indicator_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.steps_indicator_text_view);
                if (textView != null) {
                    i = R.id.toolbar_content_constraint_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.toolbar_content_constraint_layout);
                    if (constraintLayout != null) {
                        i = R.id.toolbar_title_text_view;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.toolbar_title_text_view);
                        if (textView2 != null) {
                            return new C0491z(toolbar, toolbar, progressBar, viewFindChildViewById, textView, constraintLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static C0491z b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_holder_in_progress_mission_item, viewGroup, false);
        int i = R.id.in_progress_campaign_name_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_campaign_name_text_view);
        if (textView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.in_progress_left_guideline;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_left_guideline)) != null) {
                i = R.id.in_progress_mission_reward_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_mission_reward_text_view);
                if (textView2 != null) {
                    i = R.id.in_progress_progress_indicator_progress_bar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_progress_indicator_progress_bar);
                    if (progressBar != null) {
                        i = R.id.in_progress_right_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_right_guideline)) != null) {
                            i = R.id.in_progress_tasks_completed_text_view;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_tasks_completed_text_view);
                            if (textView3 != null) {
                                i = R.id.in_progress_validity_period_text_view;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.in_progress_validity_period_text_view);
                                if (textView4 != null) {
                                    return new C0491z(constraintLayout, textView, constraintLayout, textView2, progressBar, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4302a) {
            case 0:
                return (ConstraintLayout) this.f4303b;
            case 1:
                return (ConstraintLayout) this.f4303b;
            case 2:
                return (ConstraintLayout) this.f4303b;
            case 3:
                return (SpringView) this.f4303b;
            case 4:
                return (ConstraintLayout) this.f4303b;
            case 5:
                return (FrameLayout) this.f4303b;
            case 6:
                return (NestedScrollView) this.f4305g;
            case 7:
                return (ConstraintLayout) this.f4303b;
            case 8:
                return (NestedScrollView) this.f4305g;
            case 9:
                return (ConstraintLayout) this.f4303b;
            case 10:
                return (ConstraintLayout) this.f4303b;
            case 11:
                return (ConstraintLayout) this.f4303b;
            case 12:
                return (ConstraintLayout) this.f4303b;
            case 13:
                return (ConstraintLayout) this.f4303b;
            case 14:
                return (ConstraintLayout) this.f4303b;
            case 15:
                return (ConstraintLayout) this.f4303b;
            case 16:
                return (ConstraintLayout) this.f4303b;
            case 17:
                return (NestedScrollView) this.f4305g;
            case 18:
                return (SpringView) this.f4303b;
            case 19:
                return (CardView) this.f4303b;
            case 20:
                return (ConstraintLayout) this.f4303b;
            case 21:
                return (ConstraintLayout) this.f4303b;
            case 22:
                return (CardView) this.c;
            case 23:
                return (Toolbar) this.c;
            case 24:
                return (ConstraintLayout) this.f4303b;
            case 25:
                return (ConstraintLayout) this.f4303b;
            case 26:
                return (ConstraintLayout) this.f4303b;
            case 27:
                return (ConstraintLayout) this.f4303b;
            case 28:
                return (LinearLayout) this.f4303b;
            default:
                return (CoordinatorLayout) this.f4303b;
        }
    }

    public /* synthetic */ C0491z(ViewGroup viewGroup, View view, Object obj, Object obj2, View view2, View view3, View view4, int i) {
        this.f4302a = i;
        this.f4303b = viewGroup;
        this.c = view;
        this.e = obj;
        this.f = obj2;
        this.f4305g = view2;
        this.f4304d = view3;
        this.h = view4;
    }

    public /* synthetic */ C0491z(ViewGroup viewGroup, TextView textView, View view, TextView textView2, TextView textView3, View view2, View view3, int i) {
        this.f4302a = i;
        this.f4303b = viewGroup;
        this.c = textView;
        this.e = view;
        this.f4304d = textView2;
        this.h = textView3;
        this.f = view2;
        this.f4305g = view3;
    }

    public /* synthetic */ C0491z(ConstraintLayout constraintLayout, View view, View view2, View view3, TextView textView, TextView textView2, Object obj, int i) {
        this.f4302a = i;
        this.f4303b = constraintLayout;
        this.c = view;
        this.e = view2;
        this.f = view3;
        this.f4304d = textView;
        this.h = textView2;
        this.f4305g = obj;
    }

    public C0491z(CardView cardView, ImageView imageView, CardView cardView2, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f4302a = 22;
        this.c = cardView;
        this.e = imageView;
        this.f = cardView2;
        this.f4303b = constraintLayout;
        this.f4304d = textView;
        this.h = textView2;
        this.f4305g = textView3;
    }

    public C0491z(Toolbar toolbar, Toolbar toolbar2, ProgressBar progressBar, View view, TextView textView, ConstraintLayout constraintLayout, TextView textView2) {
        this.f4302a = 23;
        this.c = toolbar;
        this.e = toolbar2;
        this.f = progressBar;
        this.f4305g = view;
        this.f4304d = textView;
        this.f4303b = constraintLayout;
        this.h = textView2;
    }

    public C0491z(SpringView springView, Button button, RecyclerView recyclerView, SpringView springView2, TextView textView, TextView textView2, Group group) {
        this.f4302a = 18;
        this.f4303b = springView;
        this.c = button;
        this.f = recyclerView;
        this.e = springView2;
        this.f4304d = textView;
        this.h = textView2;
        this.f4305g = group;
    }

    public C0491z(View view, Button button, Button button2, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MayaInputLayout mayaInputLayout) {
        this.f4302a = 13;
        this.f4303b = constraintLayout;
        this.c = button;
        this.e = mayaInputLayout;
        this.f = constraintLayout2;
        this.f4304d = textView;
        this.f4305g = view;
        this.h = button2;
    }

    public C0491z(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, ProgressBar progressBar, TextView textView3, TextView textView4) {
        this.f4302a = 26;
        this.f4303b = constraintLayout;
        this.f4304d = textView;
        this.c = constraintLayout2;
        this.h = textView2;
        this.e = progressBar;
        this.f = textView3;
        this.f4305g = textView4;
    }

    public C0491z(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, MayaInputLayout mayaInputLayout, MayaInputLayout mayaInputLayout2, NestedScrollView nestedScrollView, MultiColorTextView multiColorTextView) {
        this.f4302a = 15;
        this.f4303b = constraintLayout;
        this.c = button;
        this.f4304d = textView2;
        this.e = mayaInputLayout;
        this.f = mayaInputLayout2;
        this.f4305g = nestedScrollView;
        this.h = multiColorTextView;
    }

    public C0491z(ConstraintLayout constraintLayout, Button button, TextView textView, Group group, TabLayout tabLayout, Toolbar toolbar, ViewPager viewPager) {
        this.f4302a = 9;
        this.f4303b = constraintLayout;
        this.c = button;
        this.f4304d = textView;
        this.e = group;
        this.f = tabLayout;
        this.f4305g = toolbar;
        this.h = viewPager;
    }

    public C0491z(ConstraintLayout constraintLayout, View view, TextView textView, Button button, Button button2, View view2, View view3) {
        this.f4302a = 12;
        this.f4303b = constraintLayout;
        this.e = view;
        this.f4304d = textView;
        this.c = button;
        this.f = button2;
        this.f4305g = view2;
        this.h = view3;
    }

    public C0491z(ConstraintLayout constraintLayout, View view, View view2, NumberPicker numberPicker, View view3, Button button, View view4) {
        this.f4302a = 11;
        this.f4303b = constraintLayout;
        this.e = view;
        this.f = view2;
        this.f4305g = numberPicker;
        this.f4304d = view3;
        this.c = button;
        this.h = view4;
    }

    public C0491z(ConstraintLayout constraintLayout, LinearLayout linearLayout, NestedScrollView nestedScrollView, View view, AppCompatCheckBox appCompatCheckBox, Button button, TextView textView) {
        this.f4302a = 7;
        this.f4303b = constraintLayout;
        this.e = linearLayout;
        this.f4305g = nestedScrollView;
        this.f = view;
        this.h = appCompatCheckBox;
        this.c = button;
        this.f4304d = textView;
    }

    public C0491z(ConstraintLayout constraintLayout, Group group, Group group2, AppCompatEditText appCompatEditText, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, RecyclerView recyclerView) {
        this.f4302a = 14;
        this.f4303b = constraintLayout;
        this.c = group;
        this.f4305g = group2;
        this.f4304d = appCompatEditText;
        this.e = appCompatImageView;
        this.h = lottieAnimationView;
        this.f = recyclerView;
    }

    public C0491z(NestedScrollView nestedScrollView, FrameLayout frameLayout, Group group, View view, View view2, RecyclerView recyclerView, MayaCustomCardView mayaCustomCardView) {
        this.f4302a = 6;
        this.f4305g = nestedScrollView;
        this.f4303b = frameLayout;
        this.c = group;
        this.e = view;
        this.f4304d = view2;
        this.f = recyclerView;
        this.h = mayaCustomCardView;
    }

    public C0491z(NestedScrollView nestedScrollView, HtmlTextView htmlTextView, SwitchCompat switchCompat, AppCompatTextView appCompatTextView, View view, View view2, View view3) {
        this.f4302a = 8;
        this.f4305g = nestedScrollView;
        this.f4303b = htmlTextView;
        this.c = switchCompat;
        this.e = appCompatTextView;
        this.f = view;
        this.f4304d = view2;
        this.h = view3;
    }

    public C0491z(NestedScrollView nestedScrollView, Group group, RecyclerView recyclerView, RecyclerView recyclerView2, AppCompatTextView appCompatTextView, HtmlTextView htmlTextView, G0 g02) {
        this.f4302a = 17;
        this.f4305g = nestedScrollView;
        this.f4303b = group;
        this.f = recyclerView;
        this.c = recyclerView2;
        this.e = appCompatTextView;
        this.f4304d = htmlTextView;
        this.h = g02;
    }

    public C0491z(CoordinatorLayout coordinatorLayout, TextView textView, Button button, AppBarLayout appBarLayout, View view, View view2, TextView textView2, Toolbar toolbar) {
        this.f4302a = 29;
        this.f4303b = coordinatorLayout;
        this.f4304d = textView;
        this.c = button;
        this.e = appBarLayout;
        this.f = view;
        this.f4305g = view2;
        this.h = textView2;
    }
}
