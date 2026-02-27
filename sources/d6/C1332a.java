package d6;

import N5.C0443c1;
import N5.C0450f;
import N5.C0491z;
import Q6.r;
import We.s;
import Y.e;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.J;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.AccountLimitAmount;
import com.paymaya.domain.model.AccountLimitCount;
import com.paymaya.domain.model.AccountLimitType;
import com.paymaya.domain.model.AccountLimitsFooterItem;
import com.paymaya.domain.model.AccountLimitsItem;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsPageFragment;
import defpackage.AbstractC1414e;
import g6.C1502a;
import g6.C1503b;
import g6.C1504c;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import zj.z;

/* JADX INFO: renamed from: d6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1332a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16282b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaAccountLimitsPageFragment f16283d;
    public final ArrayList e = new ArrayList();

    public C1332a(Context context, String str, String str2, MayaAccountLimitsPageFragment mayaAccountLimitsPageFragment) {
        this.f16281a = context;
        this.f16282b = str;
        this.c = str2;
        this.f16283d = mayaAccountLimitsPageFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((AccountLimitsItem) this.e.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        AccountLimitType accountLimitType;
        j.g(holder, "holder");
        boolean z4 = holder instanceof C1504c;
        ArrayList arrayList = this.e;
        if (!z4) {
            if (holder instanceof C1502a) {
                Object obj = arrayList.get(i);
                j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.AccountLimitsFooterItem");
                String kycStatus = this.c;
                j.g(kycStatus, "kycStatus");
                r rVar = ((C1502a) holder).c;
                rVar.getClass();
                int iMHeaderType = ((AccountLimitsFooterItem) obj).mHeaderType();
                C1502a c1502a = (C1502a) rVar.f5291b;
                HtmlTextView htmlTextView = c1502a.f16791a;
                if (iMHeaderType == 0) {
                    htmlTextView.setTextHTML(c1502a.itemView.getResources().getString(R.string.maya_label_limits_will_refresh_tomorrow));
                } else if (iMHeaderType == 1) {
                    htmlTextView.setTextHTML(c1502a.itemView.getResources().getString(R.string.maya_label_limits_will_refresh_next_month));
                }
                boolean zEquals = kycStatus.equals("kyc1");
                C0443c1 c0443c1 = c1502a.f16792b;
                if (zEquals) {
                    c0443c1.f4070b.setVisibility(8);
                    return;
                } else {
                    c0443c1.f4070b.setVisibility(0);
                    return;
                }
            }
            return;
        }
        Object obj2 = arrayList.get(i);
        j.e(obj2, "null cannot be cast to non-null type com.paymaya.domain.model.AccountLimitType");
        AccountLimitType accountLimitType2 = (AccountLimitType) obj2;
        String str = this.f16282b;
        e eVar = ((C1504c) holder).h;
        eVar.c = str;
        String strMName = accountLimitType2.mName();
        j.f(strMName, "mName(...)");
        C1504c c1504c = (C1504c) eVar.f6708b;
        c1504c.f16795b.setText(strMName);
        String strMDescription = accountLimitType2.mDescription();
        j.f(strMDescription, "mDescription(...)");
        c1504c.c.setText(strMDescription);
        AccountLimitAmount accountLimitAmountMAmount = accountLimitType2.mAmount();
        TextView textView = c1504c.f;
        TextView textView2 = c1504c.f16796d;
        Context context = c1504c.f16794a;
        if (accountLimitAmountMAmount != null) {
            double dMRemaining = accountLimitAmountMAmount.mRemaining();
            double dMLimit = accountLimitAmountMAmount.mLimit();
            String strMCurrency = accountLimitAmountMAmount.mCurrency();
            j.f(strMCurrency, "mCurrency(...)");
            double dMRemaining2 = accountLimitAmountMAmount.mRemaining();
            Resources resources = context.getResources();
            accountLimitType = accountLimitType2;
            String strT = z.t(strMCurrency, "PHP", "₱");
            DecimalFormat decimalFormat = J.f10420a;
            textView2.setText(resources.getString(R.string.maya_label_format_account_limit_remaining, strT, decimalFormat.format(dMRemaining2)));
            String strMCurrency2 = accountLimitAmountMAmount.mCurrency();
            j.f(strMCurrency2, "mCurrency(...)");
            String strT2 = z.t(strMCurrency2, "PHP", "₱");
            textView.setText(context.getString(R.string.maya_label_format_account_used_amount, strT2, decimalFormat.format(dMLimit - dMRemaining), strT2, decimalFormat.format(dMLimit)));
            textView.setVisibility(0);
            c1504c.D((dMRemaining / dMLimit) * ((double) 100), true);
        } else {
            accountLimitType = accountLimitType2;
            String str2 = (String) eVar.c;
            if (j.b(str2, "Daily")) {
                textView2.setText(context.getString(R.string.maya_label_no_limit_daily));
            } else if (j.b(str2, "Monthly")) {
                textView2.setText(context.getString(R.string.maya_label_no_limit_monthly));
            }
            c1504c.f16797g.setVisibility(8);
            c1504c.D(AudioStats.AUDIO_AMPLITUDE_NONE, false);
            textView.setVisibility(8);
            textView2.setTextColor(ContextCompat.getColor(context, R.color.dark_light));
        }
        AccountLimitCount accountLimitCountMCount = accountLimitType.mCount();
        TextView textView3 = c1504c.e;
        if (accountLimitCountMCount == null) {
            textView3.setVisibility(8);
            return;
        }
        int iMRemaining = accountLimitCountMCount.mRemaining();
        textView3.setText(context.getResources().getQuantityString(R.plurals.maya_label_format_account_limit_count, iMRemaining, Integer.valueOf(iMRemaining), Integer.valueOf(accountLimitCountMCount.mLimit())));
        textView3.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        if (i == AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_ITEM.getValue()) {
            View viewE = AbstractC1414e.e(parent, R.layout.maya_view_account_limits_item, parent, false);
            int i4 = R.id.progress_bar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(viewE, R.id.progress_bar);
            if (progressBar != null) {
                i4 = R.id.text_view_description;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_description);
                if (textView != null) {
                    i4 = R.id.text_view_limit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_limit);
                    if (textView2 != null) {
                        i4 = R.id.text_view_remaining_amount;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_remaining_amount);
                        if (textView3 != null) {
                            i4 = R.id.text_view_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_title);
                            if (textView4 != null) {
                                i4 = R.id.text_view_used_amount;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_used_amount);
                                if (textView5 != null) {
                                    return new C1504c(new C0491z((ViewGroup) viewE, (View) progressBar, textView, textView2, textView3, (View) textView4, (View) textView5, 19), this.f16281a);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
        }
        if (i != AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_FOOTER.getValue()) {
            if (i != AccountLimitsItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue()) {
                throw new PayMayaRuntimeException(s.f(i, "Invalid view type : "));
            }
            View viewE2 = AbstractC1414e.e(parent, R.layout.maya_view_account_limits_loading, parent, false);
            int i6 = R.id.item_1;
            if (((CardView) ViewBindings.findChildViewById(viewE2, R.id.item_1)) != null) {
                i6 = R.id.item_2;
                if (((CardView) ViewBindings.findChildViewById(viewE2, R.id.item_2)) != null) {
                    i6 = R.id.item_3;
                    if (((CardView) ViewBindings.findChildViewById(viewE2, R.id.item_3)) != null) {
                        i6 = R.id.item_4;
                        if (((CardView) ViewBindings.findChildViewById(viewE2, R.id.item_4)) != null) {
                            return new C1503b((ConstraintLayout) viewE2);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewE2.getResources().getResourceName(i6)));
        }
        View viewE3 = AbstractC1414e.e(parent, R.layout.maya_view_account_limits_footer, parent, false);
        int i10 = R.id.complete_account_banner;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewE3, R.id.complete_account_banner);
        if (viewFindChildViewById != null) {
            CardView cardView = (CardView) viewFindChildViewById;
            int i11 = R.id.banner_cta_text_view;
            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.banner_cta_text_view);
            if (textView6 != null) {
                i11 = R.id.banner_image_view;
                if (((AppCompatImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.banner_image_view)) != null) {
                    i11 = R.id.banner_subtitle_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.banner_subtitle_text_view)) != null) {
                        i11 = R.id.banner_title_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.banner_title_text_view)) != null) {
                            C0443c1 c0443c1 = new C0443c1(cardView, textView6, 0);
                            i10 = R.id.info_icon_image_view;
                            if (((ImageView) ViewBindings.findChildViewById(viewE3, R.id.info_icon_image_view)) != null) {
                                i10 = R.id.limits_reset_text_view;
                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewE3, R.id.limits_reset_text_view);
                                if (htmlTextView != null) {
                                    return new C1502a(new C0450f((ConstraintLayout) viewE3, c0443c1, htmlTextView, 14), this.f16283d);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i11)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE3.getResources().getResourceName(i10)));
    }
}
