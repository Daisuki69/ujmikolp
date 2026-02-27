package M8;

import N5.C0450f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.kyczoloz.view.widget.KycInformationTextView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class N extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f3201a = new N(3, N5.W.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/paymaya/databinding/MayaFragmentKycCompletePersonalInformationBinding;", 0);

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p02 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.j.g(p02, "p0");
        View viewInflate = p02.inflate(R.layout.maya_fragment_kyc_complete_personal_information, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.layout_form;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_form);
        if (viewFindChildViewById != null) {
            int i4 = R.id.button_continue_action;
            Button button = (Button) ViewBindings.findChildViewById(viewFindChildViewById, R.id.button_continue_action);
            if (button != null) {
                i4 = R.id.checkbox_middle_name;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewFindChildViewById, R.id.checkbox_middle_name);
                if (appCompatCheckBox != null) {
                    i4 = R.id.checkbox_use_current_address;
                    AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(viewFindChildViewById, R.id.checkbox_use_current_address);
                    if (appCompatCheckBox2 != null) {
                        i4 = R.id.constraint_layout_form_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.constraint_layout_form_container);
                        if (constraintLayout != null) {
                            i4 = R.id.container_birth_city;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_birth_city);
                            if (viewFindChildViewById2 != null) {
                                C0450f c0450fC = C0450f.c(viewFindChildViewById2);
                                i4 = R.id.container_birth_state;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_birth_state);
                                if (viewFindChildViewById3 != null) {
                                    C0450f c0450fC2 = C0450f.c(viewFindChildViewById3);
                                    i4 = R.id.container_current_city;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_current_city);
                                    if (viewFindChildViewById4 != null) {
                                        C0450f c0450fC3 = C0450f.c(viewFindChildViewById4);
                                        i4 = R.id.container_current_district;
                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_current_district);
                                        if (viewFindChildViewById5 != null) {
                                            C0450f c0450fC4 = C0450f.c(viewFindChildViewById5);
                                            i4 = R.id.container_current_state;
                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_current_state);
                                            if (viewFindChildViewById6 != null) {
                                                C0450f c0450fC5 = C0450f.c(viewFindChildViewById6);
                                                i4 = R.id.container_current_zip_code;
                                                View viewFindChildViewById7 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_current_zip_code);
                                                if (viewFindChildViewById7 != null) {
                                                    C0450f c0450fC6 = C0450f.c(viewFindChildViewById7);
                                                    i4 = R.id.container_permanent_city;
                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_permanent_city);
                                                    if (viewFindChildViewById8 != null) {
                                                        C0450f c0450fC7 = C0450f.c(viewFindChildViewById8);
                                                        i4 = R.id.container_permanent_district;
                                                        View viewFindChildViewById9 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_permanent_district);
                                                        if (viewFindChildViewById9 != null) {
                                                            C0450f c0450fC8 = C0450f.c(viewFindChildViewById9);
                                                            i4 = R.id.container_permanent_state;
                                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_permanent_state);
                                                            if (viewFindChildViewById10 != null) {
                                                                C0450f c0450fC9 = C0450f.c(viewFindChildViewById10);
                                                                i4 = R.id.container_permanent_zip_code;
                                                                View viewFindChildViewById11 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.container_permanent_zip_code);
                                                                if (viewFindChildViewById11 != null) {
                                                                    C0450f c0450fC10 = C0450f.c(viewFindChildViewById11);
                                                                    i4 = R.id.flow_birth_date;
                                                                    if (((Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_birth_date)) != null) {
                                                                        i4 = R.id.flow_birth_place;
                                                                        if (((Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_birth_place)) != null) {
                                                                            i4 = R.id.flow_current_address;
                                                                            Flow flow = (Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_current_address);
                                                                            if (flow != null) {
                                                                                i4 = R.id.flow_full_name;
                                                                                if (((Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_full_name)) != null) {
                                                                                    i4 = R.id.flow_id_details;
                                                                                    if (((Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_id_details)) != null) {
                                                                                        i4 = R.id.flow_nationality;
                                                                                        if (((Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_nationality)) != null) {
                                                                                            i4 = R.id.flow_nature_of_work;
                                                                                            Flow flow2 = (Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_nature_of_work);
                                                                                            if (flow2 != null) {
                                                                                                i4 = R.id.flow_permanent_address;
                                                                                                Flow flow3 = (Flow) ViewBindings.findChildViewById(viewFindChildViewById, R.id.flow_permanent_address);
                                                                                                if (flow3 != null) {
                                                                                                    i4 = R.id.group_permanent_address;
                                                                                                    Group group = (Group) ViewBindings.findChildViewById(viewFindChildViewById, R.id.group_permanent_address);
                                                                                                    if (group != null) {
                                                                                                        i4 = R.id.guideline_end;
                                                                                                        if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_end)) != null) {
                                                                                                            i4 = R.id.guideline_start;
                                                                                                            if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.guideline_start)) != null) {
                                                                                                                i4 = R.id.kyc_info_box;
                                                                                                                KycInformationTextView kycInformationTextView = (KycInformationTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.kyc_info_box);
                                                                                                                if (kycInformationTextView != null) {
                                                                                                                    i4 = R.id.linear_layout_id_image;
                                                                                                                    if (((LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_id_image)) != null) {
                                                                                                                        i4 = R.id.linear_layout_second_id_image;
                                                                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.linear_layout_second_id_image);
                                                                                                                        if (linearLayout != null) {
                                                                                                                            i4 = R.id.maya_input_birth_country;
                                                                                                                            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_birth_country);
                                                                                                                            if (mayaInputLayout != null) {
                                                                                                                                i4 = R.id.maya_input_birth_date;
                                                                                                                                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_birth_date);
                                                                                                                                if (mayaInputLayout2 != null) {
                                                                                                                                    i4 = R.id.maya_input_current_additional_address;
                                                                                                                                    MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_current_additional_address);
                                                                                                                                    if (mayaInputLayout3 != null) {
                                                                                                                                        i4 = R.id.maya_input_current_country;
                                                                                                                                        MayaInputLayout mayaInputLayout4 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_current_country);
                                                                                                                                        if (mayaInputLayout4 != null) {
                                                                                                                                            i4 = R.id.maya_input_current_full_address;
                                                                                                                                            MayaInputLayout mayaInputLayout5 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_current_full_address);
                                                                                                                                            if (mayaInputLayout5 != null) {
                                                                                                                                                i4 = R.id.maya_input_employment_detail;
                                                                                                                                                MayaInputLayout mayaInputLayout6 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_employment_detail);
                                                                                                                                                if (mayaInputLayout6 != null) {
                                                                                                                                                    i4 = R.id.maya_input_first_name;
                                                                                                                                                    MayaInputLayout mayaInputLayout7 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_first_name);
                                                                                                                                                    if (mayaInputLayout7 != null) {
                                                                                                                                                        i4 = R.id.maya_input_id_expiration_date;
                                                                                                                                                        MayaInputLayout mayaInputLayout8 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_id_expiration_date);
                                                                                                                                                        if (mayaInputLayout8 != null) {
                                                                                                                                                            i4 = R.id.maya_input_id_number;
                                                                                                                                                            MayaInputLayout mayaInputLayout9 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_id_number);
                                                                                                                                                            if (mayaInputLayout9 != null) {
                                                                                                                                                                i4 = R.id.maya_input_income_source;
                                                                                                                                                                MayaInputLayout mayaInputLayout10 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_income_source);
                                                                                                                                                                if (mayaInputLayout10 != null) {
                                                                                                                                                                    i4 = R.id.maya_input_last_name;
                                                                                                                                                                    MayaInputLayout mayaInputLayout11 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_last_name);
                                                                                                                                                                    if (mayaInputLayout11 != null) {
                                                                                                                                                                        i4 = R.id.maya_input_middle_name;
                                                                                                                                                                        MayaInputLayout mayaInputLayout12 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_middle_name);
                                                                                                                                                                        if (mayaInputLayout12 != null) {
                                                                                                                                                                            i4 = R.id.maya_input_nationality;
                                                                                                                                                                            MayaInputLayout mayaInputLayout13 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_nationality);
                                                                                                                                                                            if (mayaInputLayout13 != null) {
                                                                                                                                                                                i4 = R.id.maya_input_nature_of_work_others;
                                                                                                                                                                                MayaInputLayout mayaInputLayout14 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_nature_of_work_others);
                                                                                                                                                                                if (mayaInputLayout14 != null) {
                                                                                                                                                                                    i4 = R.id.maya_input_permanent_additional_address;
                                                                                                                                                                                    MayaInputLayout mayaInputLayout15 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_permanent_additional_address);
                                                                                                                                                                                    if (mayaInputLayout15 != null) {
                                                                                                                                                                                        i4 = R.id.maya_input_permanent_country;
                                                                                                                                                                                        MayaInputLayout mayaInputLayout16 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_permanent_country);
                                                                                                                                                                                        if (mayaInputLayout16 != null) {
                                                                                                                                                                                            i4 = R.id.maya_input_permanent_full_address;
                                                                                                                                                                                            MayaInputLayout mayaInputLayout17 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_permanent_full_address);
                                                                                                                                                                                            if (mayaInputLayout17 != null) {
                                                                                                                                                                                                i4 = R.id.maya_input_second_id_expiration_date;
                                                                                                                                                                                                MayaInputLayout mayaInputLayout18 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_second_id_expiration_date);
                                                                                                                                                                                                if (mayaInputLayout18 != null) {
                                                                                                                                                                                                    i4 = R.id.maya_input_second_id_number;
                                                                                                                                                                                                    MayaInputLayout mayaInputLayout19 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_second_id_number);
                                                                                                                                                                                                    if (mayaInputLayout19 != null) {
                                                                                                                                                                                                        i4 = R.id.maya_input_work_nature;
                                                                                                                                                                                                        MayaInputLayout mayaInputLayout20 = (MayaInputLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.maya_input_work_nature);
                                                                                                                                                                                                        if (mayaInputLayout20 != null) {
                                                                                                                                                                                                            NestedScrollView nestedScrollView = (NestedScrollView) viewFindChildViewById;
                                                                                                                                                                                                            i4 = R.id.recycler_view_id_thumbnails;
                                                                                                                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.recycler_view_id_thumbnails);
                                                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                                                i4 = R.id.recycler_view_second_id_thumbnails;
                                                                                                                                                                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.recycler_view_second_id_thumbnails);
                                                                                                                                                                                                                if (recyclerView2 != null) {
                                                                                                                                                                                                                    i4 = R.id.text_view_birth_date;
                                                                                                                                                                                                                    if (((MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_birth_date)) != null) {
                                                                                                                                                                                                                        i4 = R.id.text_view_birth_place;
                                                                                                                                                                                                                        if (((MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_birth_place)) != null) {
                                                                                                                                                                                                                            i4 = R.id.text_view_current_address;
                                                                                                                                                                                                                            MultiColorTextView multiColorTextView = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_current_address);
                                                                                                                                                                                                                            if (multiColorTextView != null) {
                                                                                                                                                                                                                                i4 = R.id.text_view_current_address_foreign_title;
                                                                                                                                                                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_current_address_foreign_title);
                                                                                                                                                                                                                                if (textView != null) {
                                                                                                                                                                                                                                    i4 = R.id.text_view_form_header;
                                                                                                                                                                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_form_header);
                                                                                                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                                                                                                        i4 = R.id.text_view_form_sub_header;
                                                                                                                                                                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_form_sub_header);
                                                                                                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                                                                                                            i4 = R.id.text_view_id_details;
                                                                                                                                                                                                                                            MultiColorTextView multiColorTextView2 = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_id_details);
                                                                                                                                                                                                                                            if (multiColorTextView2 != null) {
                                                                                                                                                                                                                                                i4 = R.id.text_view_id_name;
                                                                                                                                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_id_name);
                                                                                                                                                                                                                                                if (textView4 != null) {
                                                                                                                                                                                                                                                    i4 = R.id.text_view_name_header;
                                                                                                                                                                                                                                                    MultiColorTextView multiColorTextView3 = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_name_header);
                                                                                                                                                                                                                                                    if (multiColorTextView3 != null) {
                                                                                                                                                                                                                                                        i4 = R.id.text_view_name_info;
                                                                                                                                                                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_name_info)) != null) {
                                                                                                                                                                                                                                                            i4 = R.id.text_view_nationality;
                                                                                                                                                                                                                                                            if (((MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_nationality)) != null) {
                                                                                                                                                                                                                                                                i4 = R.id.text_view_permanent_address;
                                                                                                                                                                                                                                                                MultiColorTextView multiColorTextView4 = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_permanent_address);
                                                                                                                                                                                                                                                                if (multiColorTextView4 != null) {
                                                                                                                                                                                                                                                                    i4 = R.id.text_view_permanent_address_foreign_title;
                                                                                                                                                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_permanent_address_foreign_title);
                                                                                                                                                                                                                                                                    if (textView5 != null) {
                                                                                                                                                                                                                                                                        i4 = R.id.text_view_second_id_name;
                                                                                                                                                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_second_id_name);
                                                                                                                                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                                                                                                                                            i4 = R.id.text_view_work_details;
                                                                                                                                                                                                                                                                            MultiColorTextView multiColorTextView5 = (MultiColorTextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_work_details);
                                                                                                                                                                                                                                                                            if (multiColorTextView5 != null) {
                                                                                                                                                                                                                                                                                i4 = R.id.view_birth_date_divider;
                                                                                                                                                                                                                                                                                View viewFindChildViewById12 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_birth_date_divider);
                                                                                                                                                                                                                                                                                if (viewFindChildViewById12 != null) {
                                                                                                                                                                                                                                                                                    i4 = R.id.view_birth_place_divider;
                                                                                                                                                                                                                                                                                    View viewFindChildViewById13 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_birth_place_divider);
                                                                                                                                                                                                                                                                                    if (viewFindChildViewById13 != null) {
                                                                                                                                                                                                                                                                                        i4 = R.id.view_current_address_divider;
                                                                                                                                                                                                                                                                                        View viewFindChildViewById14 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_current_address_divider);
                                                                                                                                                                                                                                                                                        if (viewFindChildViewById14 != null) {
                                                                                                                                                                                                                                                                                            i4 = R.id.view_full_name_divider;
                                                                                                                                                                                                                                                                                            View viewFindChildViewById15 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_full_name_divider);
                                                                                                                                                                                                                                                                                            if (viewFindChildViewById15 != null) {
                                                                                                                                                                                                                                                                                                i4 = R.id.view_nationality_divider;
                                                                                                                                                                                                                                                                                                View viewFindChildViewById16 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_nationality_divider);
                                                                                                                                                                                                                                                                                                if (viewFindChildViewById16 != null) {
                                                                                                                                                                                                                                                                                                    i4 = R.id.view_nature_of_work_divider;
                                                                                                                                                                                                                                                                                                    View viewFindChildViewById17 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_nature_of_work_divider);
                                                                                                                                                                                                                                                                                                    if (viewFindChildViewById17 != null) {
                                                                                                                                                                                                                                                                                                        i4 = R.id.view_permanent_address_divider;
                                                                                                                                                                                                                                                                                                        View viewFindChildViewById18 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.view_permanent_address_divider);
                                                                                                                                                                                                                                                                                                        if (viewFindChildViewById18 != null) {
                                                                                                                                                                                                                                                                                                            N5.X x6 = new N5.X(nestedScrollView, button, appCompatCheckBox, appCompatCheckBox2, constraintLayout, c0450fC, c0450fC2, c0450fC3, c0450fC4, c0450fC5, c0450fC6, c0450fC7, c0450fC8, c0450fC9, c0450fC10, flow, flow2, flow3, group, kycInformationTextView, linearLayout, mayaInputLayout, mayaInputLayout2, mayaInputLayout3, mayaInputLayout4, mayaInputLayout5, mayaInputLayout6, mayaInputLayout7, mayaInputLayout8, mayaInputLayout9, mayaInputLayout10, mayaInputLayout11, mayaInputLayout12, mayaInputLayout13, mayaInputLayout14, mayaInputLayout15, mayaInputLayout16, mayaInputLayout17, mayaInputLayout18, mayaInputLayout19, mayaInputLayout20, nestedScrollView, recyclerView, recyclerView2, multiColorTextView, textView, textView2, textView3, multiColorTextView2, textView4, multiColorTextView3, multiColorTextView4, textView5, textView6, multiColorTextView5, viewFindChildViewById12, viewFindChildViewById13, viewFindChildViewById14, viewFindChildViewById15, viewFindChildViewById16, viewFindChildViewById17, viewFindChildViewById18);
                                                                                                                                                                                                                                                                                                            i = R.id.layout_loading;
                                                                                                                                                                                                                                                                                                            View viewFindChildViewById19 = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading);
                                                                                                                                                                                                                                                                                                            if (viewFindChildViewById19 != null) {
                                                                                                                                                                                                                                                                                                                return new N5.W((FrameLayout) viewInflate, x6, N5.Z.a(viewFindChildViewById19));
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
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
