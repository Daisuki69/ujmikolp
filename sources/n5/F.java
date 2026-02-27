package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f3614b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f3615d;
    public final View e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3616g;
    public final Object h;
    public final Object i;
    public final Object j;

    public /* synthetic */ F(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f3613a = i;
        this.f3614b = constraintLayout;
        this.f3615d = view;
        this.c = view2;
        this.e = view3;
        this.f = view4;
        this.f3616g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    public static F a(View view) {
        int i = R.id.card_content_view;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.card_content_view);
        if (constraintLayout != null) {
            i = R.id.card_masked_number_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.card_masked_number_text_view);
            if (textView != null) {
                i = R.id.card_name_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.card_name_text_view);
                if (textView2 != null) {
                    i = R.id.check_image_view;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.check_image_view);
                    if (imageView != null) {
                        i = R.id.logo_image_view;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.logo_image_view);
                        if (imageView2 != null) {
                            i = R.id.maintenance_text_view;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.maintenance_text_view);
                            if (textView3 != null) {
                                i = R.id.remove_content_view;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.remove_content_view);
                                if (constraintLayout2 != null) {
                                    i = R.id.remove_image_view;
                                    if (((ImageView) ViewBindings.findChildViewById(view, R.id.remove_image_view)) != null) {
                                        i = R.id.remove_text_view;
                                        if (((TextView) ViewBindings.findChildViewById(view, R.id.remove_text_view)) != null) {
                                            i = R.id.vaulted_card_divider_view;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.vaulted_card_divider_view);
                                            if (viewFindChildViewById != null) {
                                                ItemSlideLayoutView itemSlideLayoutView = (ItemSlideLayoutView) view;
                                                return new F(itemSlideLayoutView, constraintLayout, textView, textView2, imageView, imageView2, textView3, constraintLayout2, viewFindChildViewById, itemSlideLayoutView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static F b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_search, viewGroup, false);
        int i = R.id.clear_search_input_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.clear_search_input_icon);
        if (imageView != null) {
            i = R.id.left_guideline;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                i = R.id.loading_group;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.loading_group);
                if (group != null) {
                    i = R.id.loading_message_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.loading_message_text_view)) != null) {
                        i = R.id.lottie_animation_view_loading;
                        if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_animation_view_loading)) != null) {
                            i = R.id.no_search_results_group;
                            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.no_search_results_group);
                            if (group2 != null) {
                                i = R.id.no_search_results_image_view;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.no_search_results_image_view)) != null) {
                                    i = R.id.no_search_results_message_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.no_search_results_message_text_view)) != null) {
                                        i = R.id.no_search_results_title_text_view;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.no_search_results_title_text_view)) != null) {
                                            i = R.id.products_recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.products_recycler_view);
                                            if (recyclerView != null) {
                                                i = R.id.products_scrollview;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.products_scrollview);
                                                if (nestedScrollView != null) {
                                                    i = R.id.right_guideline;
                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                        i = R.id.search_icon;
                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.search_icon)) != null) {
                                                            i = R.id.search_input_edit_text;
                                                            AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(viewInflate, R.id.search_input_edit_text);
                                                            if (appCompatEditText != null) {
                                                                i = R.id.search_input_layout;
                                                                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.search_input_layout)) != null) {
                                                                    i = R.id.view_error_content;
                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_error_content);
                                                                    if (viewFindChildViewById != null) {
                                                                        int i4 = R.id.button_retry;
                                                                        Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_retry);
                                                                        if (button != null) {
                                                                            i4 = R.id.image_view_error_image;
                                                                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_error_image)) != null) {
                                                                                i4 = R.id.text_view_error_message;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_error_message);
                                                                                if (textView != null) {
                                                                                    i4 = R.id.text_view_error_title;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_error_title);
                                                                                    if (textView2 != null) {
                                                                                        F0 f02 = new F0((ConstraintLayout) viewFindChildViewById, button, textView, textView2, 2);
                                                                                        i = R.id.view_load_v2_banner;
                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_load_v2_banner);
                                                                                        if (viewFindChildViewById2 != null) {
                                                                                            int i6 = R.id.image_view_load_v2_chevron_right;
                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.image_view_load_v2_chevron_right)) != null) {
                                                                                                i6 = R.id.image_view_load_v2_new_tag;
                                                                                                if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.image_view_load_v2_new_tag)) != null) {
                                                                                                    i6 = R.id.text_view_load_v2_banner_subtitle;
                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_load_v2_banner_subtitle)) != null) {
                                                                                                        i6 = R.id.text_view_load_v2_banner_title;
                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.text_view_load_v2_banner_title)) != null) {
                                                                                                            return new F((ConstraintLayout) viewInflate, imageView, group, group2, recyclerView, nestedScrollView, appCompatEditText, f02, new G0((ConstraintLayout) viewFindChildViewById2, 23), 5);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i6)));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3613a) {
            case 0:
                return (ConstraintLayout) this.f3614b;
            case 1:
                return (ConstraintLayout) this.f3614b;
            case 2:
                return (NestedScrollView) this.f3614b;
            case 3:
                return (ConstraintLayout) this.f3614b;
            case 4:
                return (ConstraintLayout) this.f3614b;
            case 5:
                return (ConstraintLayout) this.f3614b;
            case 6:
                return (NestedScrollView) this.f3614b;
            case 7:
                return (ConstraintLayout) this.f3614b;
            case 8:
                return (ItemSlideLayoutView) this.c;
            case 9:
                return (ItemSlideLayoutView) this.f3615d;
            default:
                return (ConstraintLayout) this.f3614b;
        }
    }

    public /* synthetic */ F(NestedScrollView nestedScrollView, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, View view2, View view3, int i) {
        this.f3613a = i;
        this.f3614b = nestedScrollView;
        this.c = button;
        this.f3615d = textView;
        this.e = textView2;
        this.f = textView3;
        this.f3616g = textView4;
        this.j = view;
        this.h = view2;
        this.i = view3;
    }

    public F(ItemSlideLayoutView itemSlideLayoutView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, ConstraintLayout constraintLayout2, View view, ItemSlideLayoutView itemSlideLayoutView2) {
        this.f3613a = 9;
        this.f3615d = itemSlideLayoutView;
        this.c = textView;
        this.e = textView2;
        this.f = imageView;
        this.f3616g = imageView2;
        this.h = textView3;
        this.f3614b = constraintLayout2;
        this.j = view;
        this.i = itemSlideLayoutView2;
    }

    public F(ConstraintLayout constraintLayout, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView, AppCompatCheckBox appCompatCheckBox, FrameLayout frameLayout2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.f3613a = 10;
        this.f3614b = constraintLayout;
        this.c = textView;
        this.e = textView2;
        this.f = frameLayout;
        this.f3616g = imageView;
        this.h = appCompatCheckBox;
        this.i = frameLayout2;
        this.f3615d = constraintLayout2;
        this.j = textView3;
    }

    public F(ItemSlideLayoutView itemSlideLayoutView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, View view, ItemSlideLayoutView itemSlideLayoutView2) {
        this.f3613a = 8;
        this.c = itemSlideLayoutView;
        this.f3614b = constraintLayout;
        this.e = textView;
        this.f = textView2;
        this.f3616g = imageView;
        this.h = imageView2;
        this.f3615d = constraintLayout2;
        this.j = view;
        this.i = itemSlideLayoutView2;
    }

    public F(ConstraintLayout constraintLayout, Button button, MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout, Button button2, MayaInputLayout mayaInputLayout, MayaInputLayout mayaInputLayout2, ConstraintLayout constraintLayout2, MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2, View view) {
        this.f3613a = 0;
        this.f3614b = constraintLayout;
        this.c = button;
        this.f = mayaAutoCompleteInputLayout;
        this.e = button2;
        this.h = mayaInputLayout;
        this.i = mayaInputLayout2;
        this.f3615d = constraintLayout2;
        this.f3616g = mayaAutoCompleteInputLayout2;
        this.j = view;
    }

    public F(ConstraintLayout constraintLayout, Button button, Button button2, Group group, ImageView imageView, View view, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView, MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2, TextView textView, TextView textView2, TextView textView3) {
        this.f3613a = 4;
        this.f3614b = constraintLayout;
        this.c = button;
        this.e = button2;
        this.f3615d = group;
        this.j = view;
        this.f = mayaReviewInfoRecyclerView;
        this.f3616g = mayaReviewInfoRecyclerView2;
        this.h = textView;
        this.i = textView3;
    }
}
