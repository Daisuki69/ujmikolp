package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;

/* JADX INFO: loaded from: classes4.dex */
public final class G0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3627b;

    public /* synthetic */ G0(ConstraintLayout constraintLayout, int i) {
        this.f3626a = i;
        this.f3627b = constraintLayout;
    }

    public static G0 a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        if (((LottieAnimationView) ViewBindings.findChildViewById(view, R.id.maya_kyc_lottie_view)) != null) {
            return new G0(constraintLayout, 7);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.maya_kyc_lottie_view)));
    }

    public static G0 b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        if (((ImageView) ViewBindings.findChildViewById(view, R.id.image_view)) != null) {
            return new G0(constraintLayout, 10);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.image_view)));
    }

    public static G0 c(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.icon_lottie_animation_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.icon_lottie_animation_view);
        if (viewFindChildViewById != null) {
            i = R.id.text1_lottie_animation_view;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.text1_lottie_animation_view);
            if (viewFindChildViewById2 != null) {
                i = R.id.text2_lottie_animation_view;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.text2_lottie_animation_view);
                if (viewFindChildViewById3 != null) {
                    i = R.id.text3_lottie_animation_view;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.text3_lottie_animation_view);
                    if (viewFindChildViewById4 != null) {
                        return new G0(constraintLayout, 11);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static G0 d(View view) {
        int i = R.id.lottie_animation_activity_1_action_loading;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_action_loading);
        if (viewFindChildViewById != null) {
            i = R.id.lottie_animation_activity_1_amount_loading;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_amount_loading);
            if (viewFindChildViewById2 != null) {
                i = R.id.lottie_animation_activity_1_date_loading;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_date_loading);
                if (viewFindChildViewById3 != null) {
                    i = R.id.lottie_animation_activity_1_target_loading;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_target_loading);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.lottie_animation_activity_2_action_loading;
                        View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_action_loading);
                        if (viewFindChildViewById5 != null) {
                            i = R.id.lottie_animation_activity_2_amount_loading;
                            View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_amount_loading);
                            if (viewFindChildViewById6 != null) {
                                i = R.id.lottie_animation_activity_2_date_loading;
                                View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_date_loading);
                                if (viewFindChildViewById7 != null) {
                                    i = R.id.lottie_animation_activity_2_fee_label_loading;
                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_fee_label_loading);
                                    if (viewFindChildViewById8 != null) {
                                        i = R.id.lottie_animation_activity_2_fee_loading;
                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_fee_loading);
                                        if (viewFindChildViewById9 != null) {
                                            i = R.id.lottie_animation_activity_2_target_loading;
                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_target_loading);
                                            if (viewFindChildViewById10 != null) {
                                                i = R.id.lottie_animation_activity_3_action_label_loading;
                                                View viewFindChildViewById11 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_action_label_loading);
                                                if (viewFindChildViewById11 != null) {
                                                    i = R.id.lottie_animation_activity_3_amount_loading;
                                                    View viewFindChildViewById12 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_amount_loading);
                                                    if (viewFindChildViewById12 != null) {
                                                        i = R.id.lottie_animation_activity_3_date_loading;
                                                        View viewFindChildViewById13 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_date_loading);
                                                        if (viewFindChildViewById13 != null) {
                                                            i = R.id.lottie_animation_activity_3_target_label_loading;
                                                            View viewFindChildViewById14 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_target_label_loading);
                                                            if (viewFindChildViewById14 != null) {
                                                                i = R.id.lottie_animation_activity_4_action_label_loading;
                                                                View viewFindChildViewById15 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_action_label_loading);
                                                                if (viewFindChildViewById15 != null) {
                                                                    i = R.id.lottie_animation_activity_4_amount_loading;
                                                                    View viewFindChildViewById16 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_amount_loading);
                                                                    if (viewFindChildViewById16 != null) {
                                                                        i = R.id.lottie_animation_activity_4_date_loading;
                                                                        View viewFindChildViewById17 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_date_loading);
                                                                        if (viewFindChildViewById17 != null) {
                                                                            i = R.id.lottie_animation_activity_4_target_label_loading;
                                                                            View viewFindChildViewById18 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_target_label_loading);
                                                                            if (viewFindChildViewById18 != null) {
                                                                                i = R.id.lottie_animation_activity_5_action_label_loading;
                                                                                View viewFindChildViewById19 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_action_label_loading);
                                                                                if (viewFindChildViewById19 != null) {
                                                                                    i = R.id.lottie_animation_activity_5_amount_loading;
                                                                                    View viewFindChildViewById20 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_amount_loading);
                                                                                    if (viewFindChildViewById20 != null) {
                                                                                        i = R.id.lottie_animation_activity_5_date_loading;
                                                                                        View viewFindChildViewById21 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_date_loading);
                                                                                        if (viewFindChildViewById21 != null) {
                                                                                            i = R.id.lottie_animation_activity_5_target_label_loading;
                                                                                            View viewFindChildViewById22 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_target_label_loading);
                                                                                            if (viewFindChildViewById22 != null) {
                                                                                                i = R.id.lottie_animation_see_all_loading;
                                                                                                View viewFindChildViewById23 = ViewBindings.findChildViewById(view, R.id.lottie_animation_see_all_loading);
                                                                                                if (viewFindChildViewById23 != null) {
                                                                                                    i = R.id.lottie_animation_transactions_label_loading;
                                                                                                    View viewFindChildViewById24 = ViewBindings.findChildViewById(view, R.id.lottie_animation_transactions_label_loading);
                                                                                                    if (viewFindChildViewById24 != null) {
                                                                                                        return new G0((ConstraintLayout) view, 13);
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

    public static G0 e(View view) {
        int i = R.id.lottie_animation_activity_1_action_loading;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_action_loading);
        if (viewFindChildViewById != null) {
            i = R.id.lottie_animation_activity_1_amount_loading;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_amount_loading);
            if (viewFindChildViewById2 != null) {
                i = R.id.lottie_animation_activity_1_date_loading;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_date_loading);
                if (viewFindChildViewById3 != null) {
                    i = R.id.lottie_animation_activity_1_target_loading;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_1_target_loading);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.lottie_animation_activity_2_action_loading;
                        View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_action_loading);
                        if (viewFindChildViewById5 != null) {
                            i = R.id.lottie_animation_activity_2_amount_loading;
                            View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_amount_loading);
                            if (viewFindChildViewById6 != null) {
                                i = R.id.lottie_animation_activity_2_date_loading;
                                View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_date_loading);
                                if (viewFindChildViewById7 != null) {
                                    i = R.id.lottie_animation_activity_2_target_loading;
                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_2_target_loading);
                                    if (viewFindChildViewById8 != null) {
                                        i = R.id.lottie_animation_activity_3_action_label_loading;
                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_action_label_loading);
                                        if (viewFindChildViewById9 != null) {
                                            i = R.id.lottie_animation_activity_3_amount_loading;
                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_amount_loading);
                                            if (viewFindChildViewById10 != null) {
                                                i = R.id.lottie_animation_activity_3_date_loading;
                                                View viewFindChildViewById11 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_date_loading);
                                                if (viewFindChildViewById11 != null) {
                                                    i = R.id.lottie_animation_activity_3_target_label_loading;
                                                    View viewFindChildViewById12 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_3_target_label_loading);
                                                    if (viewFindChildViewById12 != null) {
                                                        i = R.id.lottie_animation_activity_4_action_label_loading;
                                                        View viewFindChildViewById13 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_action_label_loading);
                                                        if (viewFindChildViewById13 != null) {
                                                            i = R.id.lottie_animation_activity_4_amount_loading;
                                                            View viewFindChildViewById14 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_amount_loading);
                                                            if (viewFindChildViewById14 != null) {
                                                                i = R.id.lottie_animation_activity_4_date_loading;
                                                                View viewFindChildViewById15 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_date_loading);
                                                                if (viewFindChildViewById15 != null) {
                                                                    i = R.id.lottie_animation_activity_4_target_label_loading;
                                                                    View viewFindChildViewById16 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_4_target_label_loading);
                                                                    if (viewFindChildViewById16 != null) {
                                                                        i = R.id.lottie_animation_activity_5_action_label_loading;
                                                                        View viewFindChildViewById17 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_action_label_loading);
                                                                        if (viewFindChildViewById17 != null) {
                                                                            i = R.id.lottie_animation_activity_5_amount_loading;
                                                                            View viewFindChildViewById18 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_amount_loading);
                                                                            if (viewFindChildViewById18 != null) {
                                                                                i = R.id.lottie_animation_activity_5_date_loading;
                                                                                View viewFindChildViewById19 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_date_loading);
                                                                                if (viewFindChildViewById19 != null) {
                                                                                    i = R.id.lottie_animation_activity_5_target_label_loading;
                                                                                    View viewFindChildViewById20 = ViewBindings.findChildViewById(view, R.id.lottie_animation_activity_5_target_label_loading);
                                                                                    if (viewFindChildViewById20 != null) {
                                                                                        i = R.id.text_view_loading_see_all_label;
                                                                                        if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_loading_see_all_label)) != null) {
                                                                                            i = R.id.text_view_loading_transactions_label;
                                                                                            if (((TextView) ViewBindings.findChildViewById(view, R.id.text_view_loading_transactions_label)) != null) {
                                                                                                return new G0((ConstraintLayout) view, 14);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static G0 f(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.loading_description_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.loading_description_view);
        if (viewFindChildViewById != null) {
            i = R.id.loading_name_view;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.loading_name_view);
            if (viewFindChildViewById2 != null) {
                i = R.id.loading_price_view;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.loading_price_view);
                if (viewFindChildViewById3 != null) {
                    i = R.id.loading_product_icon;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.loading_product_icon);
                    if (viewFindChildViewById4 != null) {
                        return new G0(constraintLayout, 25);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static G0 g(View view) {
        if (((LottieAnimationView) ViewBindings.findChildViewById(view, R.id.partner_loading)) != null) {
            return new G0((ConstraintLayout) view, 27);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.partner_loading)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3626a) {
        }
        return this.f3627b;
    }

    public G0(ConstraintLayout constraintLayout, BannerAdCarousel bannerAdCarousel) {
        this.f3626a = 1;
        this.f3627b = constraintLayout;
    }

    public G0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView, TextView textView2) {
        this.f3626a = 22;
        this.f3627b = constraintLayout;
    }

    public G0(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, CardView cardView6, Guideline guideline, Guideline guideline2, RecyclerView recyclerView, CardView cardView7, CardView cardView8, CardView cardView9, CardView cardView10, CardView cardView11, CardView cardView12, TextView textView) {
        this.f3626a = 26;
        this.f3627b = constraintLayout;
    }
}
