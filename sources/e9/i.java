package E9;

import N5.C0462k;
import N5.C0491z;
import N5.k1;
import We.s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.model.MissionV2Reward;
import com.paymaya.domain.model.MissionV2Validity;
import com.paymaya.domain.model.MissionsV2ListItem;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import w.C2360b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends RecyclerView.Adapter implements H9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseLoadingFragment f1341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1342b;
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1343d;
    public final FragmentActivity e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(FragmentActivity fragmentActivity, f fVar, com.paymaya.data.preference.a aVar) {
        this.f1341a = (MayaBaseLoadingFragment) fVar;
        this.f1342b = aVar;
        Object systemService = fragmentActivity.getSystemService("layout_inflater");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.c = (LayoutInflater) systemService;
        this.e = fragmentActivity;
        this.f1343d = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E9.f, com.paymaya.common.base.MayaBaseLoadingFragment] */
    @Override // H9.b
    public final void d(MissionV2 missionV2) {
        this.f1341a.k(missionV2);
    }

    public final void e(List list) {
        ArrayList arrayList = this.f1343d;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new k(arrayList, list));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
        arrayList.clear();
        arrayList.addAll(list);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f1343d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((MissionsV2ListItem) this.f1343d.get(i)).getViewTypeMissionV2().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String title;
        kotlin.jvm.internal.j.g(holder, "holder");
        ArrayList arrayList = this.f1343d;
        if (i < arrayList.size()) {
            MissionsV2ListItem missionsV2ListItem = (MissionsV2ListItem) arrayList.get(i);
            int i4 = g.f1340a[missionsV2ListItem.getViewTypeMissionV2().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    ((H9.c) holder).D((MissionV2) missionsV2ListItem);
                    return;
                }
                if (i4 != 3) {
                    return;
                }
                H9.a aVar = (H9.a) holder;
                MissionV2 missionV2 = (MissionV2) missionsV2ListItem;
                aVar.c = missionV2;
                C2360b c2360b = aVar.f2145b;
                c2360b.getClass();
                String campaignName = missionV2.getTitle();
                H9.a aVar2 = (H9.a) c2360b.f20516b;
                kotlin.jvm.internal.j.g(campaignName, "campaignName");
                aVar2.f2146d.setText(campaignName);
                MissionV2Reward reward = missionV2.getReward();
                title = reward != null ? reward.getTitle() : null;
                TextView textView = aVar2.e;
                if (title != null) {
                    textView.setVisibility(0);
                    String missionRewardText = reward.getTitle();
                    kotlin.jvm.internal.j.g(missionRewardText, "missionRewardText");
                    textView.setText(missionRewardText);
                } else {
                    textView.setVisibility(8);
                }
                List<MissionV2Action> actions = missionV2.getActions();
                if (actions == null || actions.isEmpty()) {
                    return;
                }
                AbstractC1228q.b(aVar2.f, 100);
                return;
            }
            H9.f fVar = (H9.f) holder;
            MissionV2 missionV22 = (MissionV2) missionsV2ListItem;
            fVar.f2158d = missionV22;
            B9.e eVar = fVar.c;
            eVar.getClass();
            String campaignName2 = missionV22.getTitle();
            H9.f fVar2 = eVar.f385a;
            kotlin.jvm.internal.j.g(campaignName2, "campaignName");
            fVar2.e.setText(campaignName2);
            MissionV2Validity validity = missionV22.getValidity();
            TextView textView2 = fVar2.f;
            FragmentActivity fragmentActivity = fVar2.f2156a;
            if (validity != null) {
                textView2.setVisibility(0);
                String upperCase = (validity.getValue() + Global.BLANK + validity.getUnit()).toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                textView2.setText(fragmentActivity.getString(R.string.maya_label_format_missions_validity_time_left, upperCase));
            } else {
                textView2.setVisibility(8);
            }
            MissionV2Reward reward2 = missionV22.getReward();
            title = reward2 != null ? reward2.getTitle() : null;
            TextView textView3 = fVar2.f2159g;
            if (title != null) {
                textView3.setVisibility(0);
                String missionRewardText2 = reward2.getTitle();
                kotlin.jvm.internal.j.g(missionRewardText2, "missionRewardText");
                textView3.setText(missionRewardText2);
            } else {
                textView3.setVisibility(8);
            }
            MissionV2Reward reward3 = missionV22.getReward();
            if (reward3 != null) {
                String previewIcon = reward3.getPreviewIcon();
                boolean zB = kotlin.jvm.internal.j.b(previewIcon, "coin");
                ConstraintLayout constraintLayout = fVar2.h;
                ImageView imageView = fVar2.i;
                if (zB) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(fragmentActivity, 2131231317));
                    constraintLayout.setBackground(ContextCompat.getDrawable(fragmentActivity, R.drawable.maya_bg_radius_green));
                } else if (kotlin.jvm.internal.j.b(previewIcon, "voucher")) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(fragmentActivity, 2131231677));
                    constraintLayout.setBackground(ContextCompat.getDrawable(fragmentActivity, R.drawable.maya_bg_radius_blue));
                } else {
                    imageView.setImageDrawable(ContextCompat.getDrawable(fragmentActivity, 2131231371));
                    constraintLayout.setBackground(ContextCompat.getDrawable(fragmentActivity, R.drawable.maya_bg_radius_pink));
                }
            }
            String imageUrl = missionV22.getImageUrl();
            if (imageUrl == null || C2576A.H(imageUrl)) {
                fVar2.f2160k.setVisibility(8);
                return;
            }
            ImageView imageView2 = fVar2.j;
            int dimensionPixelSize = imageView2.getContext().getResources().getDimensionPixelSize(R.dimen.maya_mission_partner_logo_container_length);
            C.b0(imageUrl, imageView2, dimensionPixelSize, dimensionPixelSize, new B9.e(fVar2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        if (i == MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_LOADING.getValue()) {
            return new h(this.c.inflate(R.layout.maya_view_loading, parent, false));
        }
        int value = MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_NOT_STARTED.getValue();
        FragmentActivity fragmentActivity = this.e;
        if (i != value) {
            if (i == MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_IN_PROGRESS.getValue()) {
                return new H9.c(C0491z.b(LayoutInflater.from(parent.getContext()), parent), fragmentActivity, this);
            }
            if (i != MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_COMPLETED.getValue()) {
                throw new PayMayaRuntimeException(s.f(i, "Invalid view type : "));
            }
            View viewE = AbstractC1414e.e(parent, R.layout.maya_view_holder_completed_mission_item, parent, false);
            int i4 = R.id.completed_item_campaign_name_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.completed_item_campaign_name_text_view);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewE;
                i4 = R.id.completed_item_left_guideline;
                if (((Guideline) ViewBindings.findChildViewById(viewE, R.id.completed_item_left_guideline)) != null) {
                    i4 = R.id.completed_item_mission_reward_text_view;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewE, R.id.completed_item_mission_reward_text_view);
                    if (textView2 != null) {
                        i4 = R.id.completed_item_progress_indicator_progress_bar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewE, R.id.completed_item_progress_indicator_progress_bar);
                        if (progressBar != null) {
                            i4 = R.id.completed_item_right_guideline;
                            if (((Guideline) ViewBindings.findChildViewById(viewE, R.id.completed_item_right_guideline)) != null) {
                                i4 = R.id.completed_item_tasks_completed_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewE, R.id.completed_item_tasks_completed_text_view)) != null) {
                                    return new H9.a(new k1(constraintLayout, textView, constraintLayout, textView2, progressBar), this);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
        }
        View viewE2 = AbstractC1414e.e(parent, R.layout.maya_view_holder_not_started_mission_item, parent, false);
        int i6 = R.id.not_started_campaign_name_text_view;
        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewE2, R.id.not_started_campaign_name_text_view);
        if (textView3 != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewE2;
            i6 = R.id.not_started_learn_more_button;
            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewE2, R.id.not_started_learn_more_button);
            if (textView4 != null) {
                i6 = R.id.not_started_left_guideline;
                if (((Guideline) ViewBindings.findChildViewById(viewE2, R.id.not_started_left_guideline)) != null) {
                    i6 = R.id.not_started_mission_reward_text_view;
                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewE2, R.id.not_started_mission_reward_text_view);
                    if (textView5 != null) {
                        i6 = R.id.not_started_partner_logo_background_view;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewE2, R.id.not_started_partner_logo_background_view);
                        if (viewFindChildViewById != null) {
                            i6 = R.id.not_started_partner_logo_constraint_group;
                            Group group = (Group) ViewBindings.findChildViewById(viewE2, R.id.not_started_partner_logo_constraint_group);
                            if (group != null) {
                                i6 = R.id.not_started_partner_logo_icon_image_view;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE2, R.id.not_started_partner_logo_icon_image_view);
                                if (imageView != null) {
                                    i6 = R.id.not_started_reward_type_graphic_image_view;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewE2, R.id.not_started_reward_type_graphic_image_view);
                                    if (imageView2 != null) {
                                        i6 = R.id.not_started_right_guideline;
                                        if (((Guideline) ViewBindings.findChildViewById(viewE2, R.id.not_started_right_guideline)) != null) {
                                            i6 = R.id.not_started_validity_period_text_view;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewE2, R.id.not_started_validity_period_text_view);
                                            if (textView6 != null) {
                                                return new H9.f(new C0462k(constraintLayout2, textView3, constraintLayout2, textView4, textView5, viewFindChildViewById, group, imageView, imageView2, textView6), fragmentActivity, this, this.f1342b);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewE2.getResources().getResourceName(i6)));
    }
}
