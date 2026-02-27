package com.paymaya.mayaui.missions.view.fragment.impl;

import Ae.a;
import F9.d;
import Fa.c;
import N5.I0;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.model.MissionV2Reward;
import com.paymaya.domain.model.MissionV2Validity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import sj.b;
import w.C2361c;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsEnterCodeSuccessBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public I0 f12998S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public a f12999T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Group f13000U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Group f13001V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Group f13002W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Group f13003X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f13004Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Group f13005Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageView f13006a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f13007b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f13008c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f13009d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ImageView f13010e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f13011f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f13012g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Group f13013h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ImageView f13014i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public LottieAnimationView f13015j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f13016k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ProgressBar f13017l0;
    public MissionV2 m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public MissionV2Action f13018n0;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m0 = (MissionV2) arguments.getParcelable("updated_mission");
            this.f13018n0 = (MissionV2Action) arguments.getParcelable("selected_mission_action");
        }
        this.f10325B = (C1220i) W4.a.e().s().f4753a.f4716g.get();
        a aVar = new a(3);
        this.f12999T = aVar;
        aVar.h(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 3));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_missions_code_success_bottom_sheet, viewGroup, false);
        int i = R.id.close_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.close_button);
        if (button != null) {
            i = R.id.confetti_lottie_animation_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.confetti_lottie_animation_view);
            if (lottieAnimationView != null) {
                i = R.id.connector_dotted_line_view;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.connector_dotted_line_view)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.full_completion_coin_bag_header_image_view;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.full_completion_coin_bag_header_image_view)) != null) {
                        i = R.id.full_completion_header_group;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.full_completion_header_group);
                        if (group != null) {
                            i = R.id.full_completion_partner_logo_background_view;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.full_completion_partner_logo_background_view);
                            if (viewFindChildViewById != null) {
                                i = R.id.full_completion_partner_logo_constraint_group;
                                Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.full_completion_partner_logo_constraint_group);
                                if (group2 != null) {
                                    i = R.id.full_completion_partner_logo_icon_image_view;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.full_completion_partner_logo_icon_image_view);
                                    if (imageView != null) {
                                        i = R.id.full_completion_rewards_group;
                                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.full_completion_rewards_group);
                                        if (group3 != null) {
                                            i = R.id.full_completion_title_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.full_completion_title_text_view)) != null) {
                                                i = R.id.left_guideline;
                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                                    i = R.id.newly_completed_action_name_text_view;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.newly_completed_action_name_text_view);
                                                    if (textView != null) {
                                                        i = R.id.newly_completed_task_indicator_image_view;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.newly_completed_task_indicator_image_view);
                                                        if (imageView2 != null) {
                                                            i = R.id.next_action_name_text_view;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.next_action_name_text_view);
                                                            if (textView2 != null) {
                                                                i = R.id.next_task_indicator_image_view;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.next_task_indicator_image_view)) != null) {
                                                                    i = R.id.partial_completion_coin_bag_header_image_view;
                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_coin_bag_header_image_view)) != null) {
                                                                        i = R.id.partial_completion_header_group;
                                                                        Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_header_group);
                                                                        if (group4 != null) {
                                                                            i = R.id.partial_completion_new_completed_action_group;
                                                                            Group group5 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_new_completed_action_group);
                                                                            if (group5 != null) {
                                                                                i = R.id.partial_completion_next_action_group;
                                                                                Group group6 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_next_action_group);
                                                                                if (group6 != null) {
                                                                                    i = R.id.partial_completion_partner_logo_background_view;
                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_partner_logo_background_view);
                                                                                    if (viewFindChildViewById2 != null) {
                                                                                        i = R.id.partial_completion_partner_logo_constraint_group;
                                                                                        Group group7 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_partner_logo_constraint_group);
                                                                                        if (group7 != null) {
                                                                                            i = R.id.partial_completion_partner_logo_icon_image_view;
                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_partner_logo_icon_image_view);
                                                                                            if (imageView3 != null) {
                                                                                                i = R.id.partial_completion_title_text_view;
                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_title_text_view);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.partial_completion_validity_text_view;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.partial_completion_validity_text_view);
                                                                                                    if (textView4 != null) {
                                                                                                        i = R.id.progress_indicator_progress_bar;
                                                                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progress_indicator_progress_bar);
                                                                                                        if (progressBar != null) {
                                                                                                            i = R.id.reward_background_view;
                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.reward_background_view);
                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                i = R.id.reward_top_space;
                                                                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.reward_top_space)) != null) {
                                                                                                                    i = R.id.rewards_label_text_view;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.rewards_label_text_view)) != null) {
                                                                                                                        i = R.id.rewards_message_text_view;
                                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.rewards_message_text_view);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i = R.id.right_guideline;
                                                                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                                                                                                i = R.id.sheet_background_view;
                                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                                    i = R.id.tasks_background_view;
                                                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.tasks_background_view);
                                                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                                                        i = R.id.tasks_completed_icon_image_view;
                                                                                                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_completed_icon_image_view)) != null) {
                                                                                                                                            i = R.id.tasks_completed_text_view;
                                                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tasks_completed_text_view);
                                                                                                                                            if (textView6 != null) {
                                                                                                                                                i = R.id.tasks_top_space;
                                                                                                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.tasks_top_space)) != null) {
                                                                                                                                                    i = R.id.top_barrier;
                                                                                                                                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.top_barrier)) != null) {
                                                                                                                                                        i = R.id.top_content_barrier;
                                                                                                                                                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.top_content_barrier)) != null) {
                                                                                                                                                            i = R.id.top_space;
                                                                                                                                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.top_space)) != null) {
                                                                                                                                                                this.f12998S = new I0(constraintLayout, button, lottieAnimationView, group, viewFindChildViewById, group2, imageView, group3, textView, imageView2, textView2, group4, group5, group6, viewFindChildViewById2, group7, imageView3, textView3, textView4, progressBar, viewFindChildViewById3, textView5, viewFindChildViewById4, viewFindChildViewById5, textView6);
                                                                                                                                                                j.f(constraintLayout, "getRoot(...)");
                                                                                                                                                                return constraintLayout;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12998S = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        j.g(dialog, "dialog");
        Intent intent = new Intent();
        intent.putExtra("updated_mission", this.m0);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), -1, intent);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        List<MissionV2Action> actions;
        Throwable th2;
        int i;
        char c;
        Object next;
        Object next2;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        I0 i02 = this.f12998S;
        j.d(i02);
        this.f13000U = i02.f3653d;
        I0 i03 = this.f12998S;
        j.d(i03);
        this.f13001V = i03.f3656l;
        I0 i04 = this.f12998S;
        j.d(i04);
        this.f13002W = i04.h;
        I0 i05 = this.f12998S;
        j.d(i05);
        this.f13003X = i05.m;
        I0 i06 = this.f12998S;
        j.d(i06);
        this.f13004Y = i06.f3657n;
        I0 i07 = this.f12998S;
        j.d(i07);
        this.f13005Z = i07.f3659p;
        I0 i08 = this.f12998S;
        j.d(i08);
        this.f13006a0 = i08.f3660q;
        I0 i09 = this.f12998S;
        j.d(i09);
        this.f13007b0 = i09.f3661r;
        I0 i010 = this.f12998S;
        j.d(i010);
        this.f13008c0 = i010.f3662s;
        I0 i011 = this.f12998S;
        j.d(i011);
        this.f13009d0 = i011.f3665v;
        I0 i012 = this.f12998S;
        j.d(i012);
        this.f13010e0 = i012.j;
        I0 i013 = this.f12998S;
        j.d(i013);
        this.f13011f0 = i013.i;
        I0 i014 = this.f12998S;
        j.d(i014);
        this.f13012g0 = i014.f3655k;
        I0 i015 = this.f12998S;
        j.d(i015);
        this.f13013h0 = i015.f;
        I0 i016 = this.f12998S;
        j.d(i016);
        this.f13014i0 = i016.f3654g;
        I0 i017 = this.f12998S;
        j.d(i017);
        this.f13015j0 = i017.c;
        I0 i018 = this.f12998S;
        j.d(i018);
        this.f13016k0 = i018.f3668y;
        I0 i019 = this.f12998S;
        j.d(i019);
        this.f13017l0 = i019.f3663t;
        I0 i020 = this.f12998S;
        j.d(i020);
        i020.f3652b.setOnClickListener(new Ba.a(this, 9));
        a aVar = this.f12999T;
        if (aVar == null) {
            j.n("mMissionsEnterCodeSuccessBottomSheetFragmentPresenter");
            throw null;
        }
        MissionV2 missionV2 = this.m0;
        MissionV2Action missionV2Action = this.f13018n0;
        if (missionV2 == null || missionV2Action == null || (actions = missionV2.getActions()) == null || actions.isEmpty()) {
            return;
        }
        List<MissionV2Action> actions2 = missionV2.getActions();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : actions2) {
            if (j.b(((MissionV2Action) obj).getInSuccessCompleted(), Boolean.TRUE)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            Group group = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13000U;
            if (group == null) {
                j.n("mFullCompletionHeaderGroup");
                throw null;
            }
            group.setVisibility(0);
            Group group2 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13002W;
            if (group2 == null) {
                j.n("mFullCompletionRewardsGroup");
                throw null;
            }
            group2.setVisibility(0);
            LottieAnimationView lottieAnimationView = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13015j0;
            if (lottieAnimationView == null) {
                j.n("mConfettiLottieAnimation");
                throw null;
            }
            lottieAnimationView.setVisibility(0);
            MissionV2Reward reward = missionV2.getReward();
            if ((reward != null ? reward.getTitle() : null) != null && !C2576A.H(reward.getTitle())) {
                d dVar = (d) aVar.c.get();
                String reward2 = reward.getTitle();
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment = (MayaMissionsEnterCodeSuccessBottomSheetFragment) dVar;
                mayaMissionsEnterCodeSuccessBottomSheetFragment.getClass();
                j.g(reward2, "reward");
                TextView textView = mayaMissionsEnterCodeSuccessBottomSheetFragment.f13009d0;
                if (textView == null) {
                    j.n("mRewardsMessageTextView");
                    throw null;
                }
                textView.setText(mayaMissionsEnterCodeSuccessBottomSheetFragment.getString(R.string.maya_label_missions_success_reward_message, reward2));
            }
            String imageUrl = missionV2.getImageUrl();
            if (imageUrl == null || C2576A.H(imageUrl)) {
                Group group3 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13013h0;
                if (group3 == null) {
                    j.n("mFullCompletionPartnerLogoGroup");
                    throw null;
                }
                group3.setVisibility(8);
            } else {
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment2 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get());
                mayaMissionsEnterCodeSuccessBottomSheetFragment2.getClass();
                ImageView imageView = mayaMissionsEnterCodeSuccessBottomSheetFragment2.f13014i0;
                if (imageView == null) {
                    j.n("mFullCompletionPartnerLogo");
                    throw null;
                }
                Group group4 = mayaMissionsEnterCodeSuccessBottomSheetFragment2.f13013h0;
                if (group4 == null) {
                    j.n("mFullCompletionPartnerLogoGroup");
                    throw null;
                }
                int dimensionPixelSize = mayaMissionsEnterCodeSuccessBottomSheetFragment2.getResources().getDimensionPixelSize(R.dimen.maya_mission_partner_logo_size);
                C.b0(imageUrl, imageView, dimensionPixelSize, dimensionPixelSize, new C2361c(group4, 29));
            }
            Group group5 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13001V;
            if (group5 == null) {
                j.n("mPartialCompletionHeaderGroup");
                throw null;
            }
            group5.setVisibility(8);
            Group group6 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13003X;
            if (group6 == null) {
                j.n("mPartialCompletionNewTaskGroup");
                throw null;
            }
            group6.setVisibility(8);
            Group group7 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13004Y;
            if (group7 == null) {
                j.n("mPartialCompletionNextTaskGroup");
                throw null;
            }
            group7.setVisibility(8);
            c = 1;
            th2 = null;
        } else {
            List<MissionV2Action> missionActionsList = missionV2.getActions();
            th2 = null;
            j.g(missionActionsList, "missionActionsList");
            d dVar2 = (d) aVar.c.get();
            String title = missionV2.getTitle();
            MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment3 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) dVar2;
            mayaMissionsEnterCodeSuccessBottomSheetFragment3.getClass();
            j.g(title, "title");
            TextView textView2 = mayaMissionsEnterCodeSuccessBottomSheetFragment3.f13007b0;
            if (textView2 == null) {
                j.n("mPartialCompletionTitleTextView");
                throw null;
            }
            textView2.setText(title);
            Group group8 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13001V;
            if (group8 == null) {
                j.n("mPartialCompletionHeaderGroup");
                throw null;
            }
            group8.setVisibility(0);
            MissionV2Validity validity = missionV2.getValidity();
            if (validity != null) {
                d dVar3 = (d) aVar.c.get();
                String upperCase = validity.getPartialCompletionText().toUpperCase(Locale.ROOT);
                j.f(upperCase, "toUpperCase(...)");
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment4 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) dVar3;
                mayaMissionsEnterCodeSuccessBottomSheetFragment4.getClass();
                TextView textView3 = mayaMissionsEnterCodeSuccessBottomSheetFragment4.f13008c0;
                if (textView3 == null) {
                    j.n("mPartialCompletionValidityPeriodTextView");
                    throw null;
                }
                i = 0;
                textView3.setText(mayaMissionsEnterCodeSuccessBottomSheetFragment4.getString(R.string.maya_label_missions_validity, upperCase));
            } else {
                i = 0;
            }
            String imageUrl2 = missionV2.getImageUrl();
            if (imageUrl2 == null || C2576A.H(imageUrl2)) {
                c = 1;
                Group group9 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13005Z;
                if (group9 == null) {
                    j.n("mPartialCompletionPartnerLogoGroup");
                    throw null;
                }
                group9.setVisibility(8);
            } else {
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment5 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get());
                mayaMissionsEnterCodeSuccessBottomSheetFragment5.getClass();
                ImageView imageView2 = mayaMissionsEnterCodeSuccessBottomSheetFragment5.f13006a0;
                if (imageView2 == null) {
                    j.n("mPartialCompletionPartnerLogo");
                    throw null;
                }
                Group group10 = mayaMissionsEnterCodeSuccessBottomSheetFragment5.f13005Z;
                if (group10 == null) {
                    j.n("mPartialCompletionPartnerLogoGroup");
                    throw null;
                }
                int dimensionPixelSize2 = mayaMissionsEnterCodeSuccessBottomSheetFragment5.getResources().getDimensionPixelSize(R.dimen.maya_mission_partner_logo_size);
                c = 1;
                C.b0(imageUrl2, imageView2, dimensionPixelSize2, dimensionPixelSize2, new C2361c(group10, 29));
            }
            List<MissionV2Action> list = missionActionsList;
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (j.b(((MissionV2Action) next).getId(), missionV2Action.getId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MissionV2Action missionV2Action2 = (MissionV2Action) next;
            if (missionV2Action2 == null) {
                missionV2Action2 = missionV2Action;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                MissionV2Action missionV2Action3 = (MissionV2Action) next2;
                if (!j.b(missionV2Action3.getId(), missionV2Action.getId()) && j.b(missionV2Action3.getInSuccessCompleted(), Boolean.FALSE)) {
                    break;
                }
            }
            MissionV2Action missionV2Action4 = (MissionV2Action) next2;
            if (j.b(missionV2Action2.getInSuccessCompleted(), Boolean.TRUE)) {
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment6 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get());
                ImageView imageView3 = mayaMissionsEnterCodeSuccessBottomSheetFragment6.f13010e0;
                if (imageView3 == null) {
                    j.n("mNewTaskIndicatorImageView");
                    throw null;
                }
                imageView3.setImageDrawable(ContextCompat.getDrawable(mayaMissionsEnterCodeSuccessBottomSheetFragment6.requireContext(), R.drawable.maya_ic_circle_check_green));
            } else {
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment7 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get());
                ImageView imageView4 = mayaMissionsEnterCodeSuccessBottomSheetFragment7.f13010e0;
                if (imageView4 == null) {
                    j.n("mNewTaskIndicatorImageView");
                    throw null;
                }
                imageView4.setImageDrawable(ContextCompat.getDrawable(mayaMissionsEnterCodeSuccessBottomSheetFragment7.requireContext(), R.drawable.maya_bg_ring_accent));
            }
            d dVar4 = (d) aVar.c.get();
            String newlyCompletedActionName = missionV2Action2.getName();
            MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment8 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) dVar4;
            mayaMissionsEnterCodeSuccessBottomSheetFragment8.getClass();
            j.g(newlyCompletedActionName, "newlyCompletedActionName");
            TextView textView4 = mayaMissionsEnterCodeSuccessBottomSheetFragment8.f13011f0;
            if (textView4 == null) {
                j.n("mNewTaskNameTextView");
                throw null;
            }
            textView4.setText(newlyCompletedActionName);
            Group group11 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13003X;
            if (group11 == null) {
                j.n("mPartialCompletionNewTaskGroup");
                throw null;
            }
            group11.setVisibility(i);
            if (missionV2Action4 == null) {
                Group group12 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13004Y;
                if (group12 == null) {
                    j.n("mPartialCompletionNextTaskGroup");
                    throw null;
                }
                group12.setVisibility(8);
            } else {
                d dVar5 = (d) aVar.c.get();
                String nextActionName = missionV2Action4.getName();
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment9 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) dVar5;
                mayaMissionsEnterCodeSuccessBottomSheetFragment9.getClass();
                j.g(nextActionName, "nextActionName");
                TextView textView5 = mayaMissionsEnterCodeSuccessBottomSheetFragment9.f13012g0;
                if (textView5 == null) {
                    j.n("mNextTaskNameTextView");
                    throw null;
                }
                textView5.setText(nextActionName);
                Group group13 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13004Y;
                if (group13 == null) {
                    j.n("mPartialCompletionNextTaskGroup");
                    throw null;
                }
                group13.setVisibility(0);
            }
            Group group14 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13000U;
            if (group14 == null) {
                j.n("mFullCompletionHeaderGroup");
                throw null;
            }
            group14.setVisibility(8);
            Group group15 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13002W;
            if (group15 == null) {
                j.n("mFullCompletionRewardsGroup");
                throw null;
            }
            group15.setVisibility(8);
            LottieAnimationView lottieAnimationView2 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13015j0;
            if (lottieAnimationView2 == null) {
                j.n("mConfettiLottieAnimation");
                throw null;
            }
            lottieAnimationView2.setVisibility(8);
        }
        int size = arrayList.size();
        Integer numValueOf = Integer.valueOf(size);
        int size2 = missionV2.getActions().size();
        Integer numValueOf2 = Integer.valueOf(size2);
        int iA = b.a((((double) size) / ((double) size2)) * 100.0d);
        ProgressBar progressBar = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get())).f13017l0;
        if (progressBar == null) {
            j.n("mProgressIndicatorProgressBar");
            throw th2;
        }
        AbstractC1228q.b(progressBar, iA);
        MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment10 = (MayaMissionsEnterCodeSuccessBottomSheetFragment) ((d) aVar.c.get());
        TextView textView6 = mayaMissionsEnterCodeSuccessBottomSheetFragment10.f13016k0;
        if (textView6 == null) {
            j.n("mTasksCompletedTextView");
            throw th2;
        }
        Resources resources = mayaMissionsEnterCodeSuccessBottomSheetFragment10.getResources();
        Object[] objArr = new Object[2];
        objArr[0] = numValueOf;
        objArr[c] = numValueOf2;
        textView6.setText(resources.getQuantityString(R.plurals.maya_label_missions_format_mission_tasks_completed, size2, objArr));
    }
}
