package ea;

import N5.C0466m;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteReminder;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.ReminderDisplay;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import dOYHB6.tiZVw8.numX49;
import ia.InterfaceC1595a;
import ja.C1673b;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBillersCategoryFragment f16619a;

    public k(MayaBillersCategoryFragment mayaBillersCategoryFragment) {
        super(new C2383a());
        this.f16619a = mayaBillersCategoryFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1673b c1673b = (C1673b) viewHolder;
        kotlin.jvm.internal.j.g(c1673b, numX49.tnTj78("bdWC"));
        Favorite favorite = (Favorite) getItem(i);
        kotlin.jvm.internal.j.d(favorite);
        c1673b.i = favorite;
        Q6.l lVar = c1673b.h;
        lVar.getClass();
        FavoriteReminder favoriteReminderMFavoriteReminder = favorite.mFavoriteReminder();
        if (favoriteReminderMFavoriteReminder != null) {
            ReminderDisplay display = favoriteReminderMFavoriteReminder.getDisplay();
            Integer value = display != null ? display.getValue() : null;
            if (value != null && value.intValue() == 0) {
                C1673b c1673b2 = (C1673b) ((InterfaceC1595a) lVar.c.get());
                jk.b.b(c1673b2.f17724d, R.attr.mayaColorError);
                String string = c1673b2.itemView.getContext().getString(R.string.maya_label_biller_favorite_pay_today);
                TextView textView = c1673b2.e;
                textView.setText(string);
                TextViewCompat.setTextAppearance(textView, R.style.JekoBoldOverlineMedium_Error);
            } else {
                C1673b c1673b3 = (C1673b) ((InterfaceC1595a) lVar.c.get());
                jk.b.b(c1673b3.f17724d, R.attr.mayaColorIconTintQuaternary);
                String string2 = c1673b3.itemView.getContext().getString(R.string.maya_label_biller_favorite_reminder_set);
                TextView textView2 = c1673b3.e;
                textView2.setText(string2);
                TextViewCompat.setTextAppearance(textView2, R.style.JekoBoldOverlineMedium_Quaternary);
            }
            ((C1673b) ((InterfaceC1595a) lVar.c.get())).f17723b.setVisibility(0);
        } else {
            ((C1673b) ((InterfaceC1595a) lVar.c.get())).f17723b.setVisibility(8);
        }
        ((C1673b) ((InterfaceC1595a) lVar.c.get())).f.setText(favorite.mAlias());
        ((C1673b) ((InterfaceC1595a) lVar.c.get())).f17725g.setText(favorite.mContentPreview().mText1());
        ImageUrlUnfiltered imageUrlUnfilteredMMedia = favorite.mContentPreview().mMedia();
        String strO = C.O(imageUrlUnfilteredMMedia != null ? imageUrlUnfilteredMMedia.mAndroidImageUrl() : null);
        ImageView imageView = ((C1673b) ((InterfaceC1595a) lVar.c.get())).c;
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(R.dimen.maya_icon_size_length_large);
        int dimensionPixelSize2 = imageView.getResources().getDimensionPixelSize(R.dimen.maya_stroke_width_small);
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = imageView.getContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(R.attr.mayaDrawable_BillerPlaceholder, typedValue, true);
        }
        C.c0(strO, typedValue.resourceId, imageView, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bdW4"));
        int i4 = C1673b.j;
        String strTnTj78 = numX49.tnTj78("bdWo");
        MayaBillersCategoryFragment mayaBillersCategoryFragment = this.f16619a;
        kotlin.jvm.internal.j.g(mayaBillersCategoryFragment, strTnTj78);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_pay_bills_holder_favorite_card, viewGroup, false);
        int i6 = R.id.constraint_group_reminder_flag;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.constraint_group_reminder_flag);
        if (group != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i6 = R.id.image_view_biller_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_biller_logo);
            if (imageView != null) {
                i6 = R.id.image_view_favorite_reminder_bell;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_favorite_reminder_bell);
                if (imageView2 != null) {
                    i6 = R.id.space_icon_right_gap;
                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_icon_right_gap)) != null) {
                        i6 = R.id.text_view_favorite_alias;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorite_alias);
                        if (textView != null) {
                            i6 = R.id.text_view_favorite_line1;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorite_line1);
                            if (textView2 != null) {
                                i6 = R.id.text_view_reminder_status;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_reminder_status);
                                if (textView3 != null) {
                                    return new C1673b(new C0466m((ViewGroup) constraintLayout, (Object) group, (View) constraintLayout, (Object) imageView, (Object) imageView2, (Object) textView, (View) textView2, (View) textView3, 21), mayaBillersCategoryFragment);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bdWK").concat(viewInflate.getResources().getResourceName(i6)));
    }
}
