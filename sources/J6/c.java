package J6;

import N5.C0466m;
import N5.k1;
import We.s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBankPullV2Fragment f2422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2423b = new ArrayList();

    public c(MayaBankPullV2Fragment mayaBankPullV2Fragment) {
        this.f2422a = mayaBankPullV2Fragment;
    }

    public final void e(List newPaymentOptionList) {
        j.g(newPaymentOptionList, "newPaymentOptionList");
        ArrayList oldList = this.f2423b;
        j.g(oldList, "oldList");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new N6.d(oldList, newPaymentOptionList));
        j.f(diffResultCalculateDiff, "calculateDiff(...)");
        oldList.clear();
        oldList.addAll(newPaymentOptionList);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2423b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((BankPullListItem) this.f2423b.get(i)).getItemId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        BankPullListItem bankPullListItem = (BankPullListItem) this.f2423b.get(i);
        if (holder instanceof M6.d) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullItem");
            BankPullListItem.BankPullItem bankPullItem = (BankPullListItem.BankPullItem) bankPullListItem;
            ((M6.d) holder).E(bankPullItem.getPaymentOption(), bankPullItem.getHasReachedMaxLimit());
        } else if (holder instanceof M6.c) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullLinkedItem");
            ((M6.c) holder).D(((BankPullListItem.BankPullLinkedItem) bankPullListItem).getPaymentOption());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        MayaBankPullV2Fragment mayaBankPullV2Fragment = this.f2422a;
        int i4 = R.id.text_view_name;
        if (i == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_view_holder_bank_pull_payment_option, parent, false);
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_logo);
            if (imageView != null) {
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_more);
                if (imageView2 != null) {
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_message);
                    if (textView != null) {
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_name);
                        if (textView2 != null) {
                            return new M6.d(new k1((ViewGroup) viewInflate, (View) imageView, (Object) imageView2, textView, (View) textView2, 1), mayaBankPullV2Fragment);
                        }
                    } else {
                        i4 = R.id.text_view_message;
                    }
                } else {
                    i4 = R.id.image_view_more;
                }
            } else {
                i4 = R.id.image_view_logo;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        }
        if (i != 3) {
            throw new PayMayaRuntimeException(s.f(i, "Invalid PaymentOptionsAdapter view type "));
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.maya_view_holder_bank_pull_linked_payment_option, parent, false);
        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.image_view_logo);
        if (imageView3 != null) {
            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.image_view_more);
            if (imageView4 == null) {
                i4 = R.id.image_view_more;
            } else if (((ImageView) ViewBindings.findChildViewById(viewInflate2, R.id.image_view_remove)) != null) {
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_message);
                if (textView3 != null) {
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_name);
                    if (textView4 != null) {
                        i4 = R.id.text_view_remove;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate2, R.id.text_view_remove)) != null) {
                            i4 = R.id.view_card_content;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate2, R.id.view_card_content);
                            if (constraintLayout != null) {
                                ItemSlideLayoutView itemSlideLayoutView = (ItemSlideLayoutView) viewInflate2;
                                i4 = R.id.view_remove_content;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate2, R.id.view_remove_content);
                                if (constraintLayout2 != null) {
                                    return new M6.c(new C0466m(itemSlideLayoutView, imageView3, imageView4, textView3, textView4, constraintLayout, itemSlideLayoutView, constraintLayout2), mayaBankPullV2Fragment);
                                }
                            }
                        }
                    }
                } else {
                    i4 = R.id.text_view_message;
                }
            } else {
                i4 = R.id.image_view_remove;
            }
        } else {
            i4 = R.id.image_view_logo;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List payloads) {
        boolean hasReachedMaxLimit;
        j.g(holder, "holder");
        j.g(payloads, "payloads");
        BankPullListItem bankPullListItem = (BankPullListItem) this.f2423b.get(i);
        if (holder instanceof M6.d) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullItem");
            BankPullListItem.BankPullItem bankPullItem = (BankPullListItem.BankPullItem) bankPullListItem;
            if (!payloads.isEmpty()) {
                Object obj = payloads.get(0);
                j.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                hasReachedMaxLimit = ((Boolean) obj).booleanValue();
            } else {
                hasReachedMaxLimit = bankPullItem.getHasReachedMaxLimit();
            }
            ((M6.d) holder).E(bankPullItem.getPaymentOption(), hasReachedMaxLimit);
            return;
        }
        if (holder instanceof M6.c) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullLinkedItem");
            ((M6.c) holder).D(((BankPullListItem.BankPullLinkedItem) bankPullListItem).getPaymentOption());
        }
    }
}
