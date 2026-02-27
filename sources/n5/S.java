package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextView f3887A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final TextView f3888B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final TextView f3889C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final TextView f3890D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final TextView f3891E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final TextView f3892F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final TextView f3893G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0456h f3895b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f3896d;
    public final ImageView e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f3897g;
    public final ImageView h;
    public final ImageView i;
    public final ImageView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f3898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConstraintLayout f3899l;
    public final G0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0491z f3900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final NestedScrollView f3901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f3902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f3903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f3904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f3905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f3906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f3907u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f3908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f3909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f3910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f3911y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f3912z;

    public S(FrameLayout frameLayout, C0456h c0456h, Button button, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ConstraintLayout constraintLayout2, G0 g02, C0491z c0491z, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18) {
        this.f3894a = frameLayout;
        this.f3895b = c0456h;
        this.c = button;
        this.f3896d = constraintLayout;
        this.e = imageView;
        this.f = imageView2;
        this.f3897g = imageView3;
        this.h = imageView4;
        this.i = imageView5;
        this.j = imageView6;
        this.f3898k = imageView7;
        this.f3899l = constraintLayout2;
        this.m = g02;
        this.f3900n = c0491z;
        this.f3901o = nestedScrollView;
        this.f3902p = textView;
        this.f3903q = textView2;
        this.f3904r = textView3;
        this.f3905s = textView4;
        this.f3906t = textView5;
        this.f3907u = textView6;
        this.f3908v = textView7;
        this.f3909w = textView8;
        this.f3910x = textView9;
        this.f3911y = textView10;
        this.f3912z = textView11;
        this.f3887A = textView12;
        this.f3888B = textView13;
        this.f3889C = textView14;
        this.f3890D = textView15;
        this.f3891E = textView16;
        this.f3892F = textView17;
        this.f3893G = textView18;
    }

    public static S a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_kyc_account_under_review, viewGroup, false);
        int i = R.id.button_copy_number;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.button_copy_number);
        if (viewFindChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindChildViewById;
            int i4 = R.id.maya_button_icon;
            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_button_icon)) != null) {
                i4 = R.id.maya_button_text;
                if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_button_text)) != null) {
                    C0456h c0456h = new C0456h(constraintLayout, constraintLayout, 1);
                    i = R.id.button_resend_validation_code;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_resend_validation_code);
                    if (button != null) {
                        i = R.id.card_view_validation_code;
                        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_validation_code)) != null) {
                            i = R.id.constrain_layout_work_information;
                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constrain_layout_work_information)) != null) {
                                i = R.id.constraint_layout_identification;
                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_identification)) != null) {
                                    i = R.id.constraint_layout_information;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_information);
                                    if (constraintLayout2 != null) {
                                        i = R.id.constraint_layout_personal_information;
                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_personal_information)) != null) {
                                            i = R.id.image_view_birth_certificate;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_birth_certificate);
                                            if (imageView != null) {
                                                i = R.id.image_view_consent_form;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_consent_form);
                                                if (imageView2 != null) {
                                                    i = R.id.image_view_divider_1;
                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_1)) != null) {
                                                        i = R.id.image_view_divider_10;
                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_10)) != null) {
                                                            i = R.id.image_view_divider_11;
                                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_11)) != null) {
                                                                i = R.id.image_view_divider_2;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_2)) != null) {
                                                                    i = R.id.image_view_divider_3;
                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_3)) != null) {
                                                                        i = R.id.image_view_divider_4;
                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_4);
                                                                        if (imageView3 != null) {
                                                                            i = R.id.image_view_divider_5;
                                                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_5);
                                                                            if (imageView4 != null) {
                                                                                i = R.id.image_view_divider_6;
                                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_6)) != null) {
                                                                                    i = R.id.image_view_divider_7;
                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_7)) != null) {
                                                                                        i = R.id.image_view_divider_8;
                                                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_8)) != null) {
                                                                                            i = R.id.image_view_divider_9;
                                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_divider_9);
                                                                                            if (imageView5 != null) {
                                                                                                i = R.id.image_view_id_photo;
                                                                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_id_photo);
                                                                                                if (imageView6 != null) {
                                                                                                    i = R.id.image_view_information_icon;
                                                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_information_icon)) != null) {
                                                                                                        i = R.id.image_view_parent_id;
                                                                                                        ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_parent_id);
                                                                                                        if (imageView7 != null) {
                                                                                                            i = R.id.linear_layout_additional_documents;
                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_additional_documents);
                                                                                                            if (constraintLayout3 != null) {
                                                                                                                i = R.id.linear_layout_address;
                                                                                                                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_address)) != null) {
                                                                                                                    i = R.id.linear_layout_birth_certificate;
                                                                                                                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_birth_certificate)) != null) {
                                                                                                                        i = R.id.linear_layout_consent_form;
                                                                                                                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_consent_form)) != null) {
                                                                                                                            i = R.id.linear_layout_id_photo;
                                                                                                                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_id_photo)) != null) {
                                                                                                                                i = R.id.linear_layout_parent_id;
                                                                                                                                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_parent_id)) != null) {
                                                                                                                                    i = R.id.loader;
                                                                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.loader);
                                                                                                                                    if (viewFindChildViewById2 != null) {
                                                                                                                                        G0 g0A = G0.a(viewFindChildViewById2);
                                                                                                                                        i = R.id.maya_kyc_toolbar_layout;
                                                                                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_toolbar_layout);
                                                                                                                                        if (viewFindChildViewById3 != null) {
                                                                                                                                            C0491z c0491zA = C0491z.a(viewFindChildViewById3);
                                                                                                                                            i = R.id.scroll_view_layout;
                                                                                                                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_layout);
                                                                                                                                            if (nestedScrollView != null) {
                                                                                                                                                i = R.id.text_view_additional_documents;
                                                                                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_additional_documents);
                                                                                                                                                if (textView != null) {
                                                                                                                                                    i = R.id.text_view_address_header;
                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_address_header)) != null) {
                                                                                                                                                        i = R.id.text_view_birth_certificate_label;
                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birth_certificate_label)) != null) {
                                                                                                                                                            i = R.id.text_view_birth_date;
                                                                                                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birth_date);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                i = R.id.text_view_birth_date_label;
                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birth_date_label)) != null) {
                                                                                                                                                                    i = R.id.text_view_birthplace;
                                                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birthplace);
                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                        i = R.id.text_view_birthplace_label;
                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_birthplace_label)) != null) {
                                                                                                                                                                            i = R.id.text_view_consent_form_label;
                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_consent_form_label)) != null) {
                                                                                                                                                                                i = R.id.text_view_employment_detail;
                                                                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_employment_detail);
                                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                                    i = R.id.text_view_employment_detail_label;
                                                                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_employment_detail_label);
                                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                                        i = R.id.text_view_expiry_date;
                                                                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_expiry_date);
                                                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                                                            i = R.id.text_view_expiry_date_label;
                                                                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_expiry_date_label);
                                                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                                                i = R.id.text_view_full_name;
                                                                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_full_name);
                                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                                    i = R.id.text_view_full_name_label;
                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_full_name_label)) != null) {
                                                                                                                                                                                                        i = R.id.text_view_header;
                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                                                                                                                                                                                            i = R.id.text_view_header_subtext;
                                                                                                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext);
                                                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                                                i = R.id.text_view_id_number;
                                                                                                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_number);
                                                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                                                    i = R.id.text_view_id_number_label;
                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_number_label)) != null) {
                                                                                                                                                                                                                        i = R.id.text_view_id_photo_label;
                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_photo_label)) != null) {
                                                                                                                                                                                                                            i = R.id.text_view_id_type;
                                                                                                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_type);
                                                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                                                i = R.id.text_view_id_type_label;
                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_id_type_label)) != null) {
                                                                                                                                                                                                                                    i = R.id.text_view_identification;
                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_identification)) != null) {
                                                                                                                                                                                                                                        i = R.id.text_view_income_source;
                                                                                                                                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_income_source);
                                                                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                                                                            i = R.id.text_view_income_source_label;
                                                                                                                                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_income_source_label);
                                                                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                                                                i = R.id.text_view_information;
                                                                                                                                                                                                                                                if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_information)) != null) {
                                                                                                                                                                                                                                                    i = R.id.text_view_nationality;
                                                                                                                                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_nationality);
                                                                                                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                                                                                                        i = R.id.text_view_nationality_label;
                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_nationality_label)) != null) {
                                                                                                                                                                                                                                                            i = R.id.text_view_parent_id_label;
                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_parent_id_label)) != null) {
                                                                                                                                                                                                                                                                i = R.id.text_view_permanent_address;
                                                                                                                                                                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_permanent_address);
                                                                                                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                                                                                                    i = R.id.text_view_permanent_address_label;
                                                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_permanent_address_label)) != null) {
                                                                                                                                                                                                                                                                        i = R.id.text_view_personal_information;
                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_personal_information)) != null) {
                                                                                                                                                                                                                                                                            i = R.id.text_view_present_address;
                                                                                                                                                                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_present_address);
                                                                                                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                                                                                                i = R.id.text_view_present_address_label;
                                                                                                                                                                                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_present_address_label)) != null) {
                                                                                                                                                                                                                                                                                    i = R.id.text_view_validation_code;
                                                                                                                                                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_validation_code);
                                                                                                                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.text_view_validation_information;
                                                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_validation_information)) != null) {
                                                                                                                                                                                                                                                                                            i = R.id.text_view_work_information;
                                                                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_work_information)) != null) {
                                                                                                                                                                                                                                                                                                i = R.id.text_view_work_nature;
                                                                                                                                                                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_work_nature);
                                                                                                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.text_view_work_nature_label;
                                                                                                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_work_nature_label)) != null) {
                                                                                                                                                                                                                                                                                                        return new S((FrameLayout) viewInflate, c0456h, button, constraintLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, constraintLayout3, g0A, c0491zA, nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18);
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
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3894a;
    }
}
