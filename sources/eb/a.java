package Eb;

import Ib.b;
import N5.m1;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.Favorite;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import kotlin.jvm.internal.j;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaSendMoneyFragment f1349a;

    public a(MayaSendMoneyFragment mayaSendMoneyFragment) {
        super(new C2383a());
        this.f1349a = mayaSendMoneyFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b holder = (b) viewHolder;
        j.g(holder, "holder");
        Favorite favorite = (Favorite) getItem(i);
        j.d(favorite);
        holder.f = favorite;
        Ae.a aVar = holder.h;
        aVar.getClass();
        b bVar = (b) ((Hb.b) aVar.c.get());
        bVar.getClass();
        TypedValue typedValue = new TypedValue();
        ImageView imageView = bVar.f2275d;
        Resources.Theme theme = imageView.getContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(R.attr.mayaDrawable_FavoritesSendMoneyPlaceholderIcon, typedValue, true);
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), typedValue.resourceId));
        Hb.b bVar2 = (Hb.b) aVar.c.get();
        String strMAlias = favorite.mAlias();
        j.f(strMAlias, "mAlias(...)");
        b bVar3 = (b) bVar2;
        bVar3.getClass();
        bVar3.f2273a.setText(strMAlias);
        if (favorite.mContentPreview().mText1() != null) {
            Hb.b bVar4 = (Hb.b) aVar.c.get();
            String strValueOf = String.valueOf(favorite.mContentPreview().mText1());
            b bVar5 = (b) bVar4;
            bVar5.getClass();
            bVar5.f2274b.setText(strValueOf);
        }
        if (favorite.mContentPreview().mText2() != null) {
            Hb.b bVar6 = (Hb.b) aVar.c.get();
            String strValueOf2 = String.valueOf(favorite.mContentPreview().mText2());
            b bVar7 = (b) bVar6;
            bVar7.getClass();
            bVar7.c.setText(strValueOf2);
        }
        if (favorite.mIsMaintenance() != null) {
            Boolean boolMIsMaintenance = favorite.mIsMaintenance();
            j.e(boolMIsMaintenance, "null cannot be cast to non-null type kotlin.Boolean");
            if (boolMIsMaintenance.booleanValue()) {
                b bVar8 = (b) ((Hb.b) aVar.c.get());
                bVar8.e.setVisibility(0);
                bVar8.f2274b.setAlpha(0.4f);
                bVar8.c.setAlpha(0.4f);
                bVar8.f2273a.setAlpha(0.4f);
                bVar8.f2275d.setAlpha(0.4f);
                return;
            }
            b bVar9 = (b) ((Hb.b) aVar.c.get());
            bVar9.e.setVisibility(8);
            bVar9.f2274b.setAlpha(1.0f);
            bVar9.c.setAlpha(1.0f);
            bVar9.f2273a.setAlpha(1.0f);
            bVar9.f2275d.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        int i4 = b.i;
        MayaSendMoneyFragment listener = this.f1349a;
        j.g(listener, "listener");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_send_money_favorite_card, parent, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i6 = R.id.image_view_favorite_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_favorite_icon);
        if (imageView != null) {
            i6 = R.id.space_icon_divider;
            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_icon_divider)) != null) {
                i6 = R.id.text_view_favorite_alias;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorite_alias);
                if (textView != null) {
                    i6 = R.id.text_view_favorite_card_line1;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorite_card_line1);
                    if (textView2 != null) {
                        i6 = R.id.text_view_favorite_card_line2;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorite_card_line2);
                        if (textView3 != null) {
                            i6 = R.id.text_view_favorite_card_maintenance;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_favorite_card_maintenance);
                            if (textView4 != null) {
                                return new b(new m1(constraintLayout, constraintLayout, imageView, textView, textView2, textView3, textView4, 1), listener);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }
}
