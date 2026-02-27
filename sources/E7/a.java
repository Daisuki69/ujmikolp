package E7;

import I7.c;
import N5.r1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.color.MaterialColors;
import com.paymaya.R;
import com.paymaya.domain.model.DynamicStatusBadge;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends O6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1263d;
    public final int e;

    public a(int i, int i4, int i6, int i10) {
        super(i4, i);
        this.f1263d = i6;
        this.e = i10;
    }

    public static CardView a(Context context, int i, String str) {
        r1 r1VarA = r1.a(LayoutInflater.from(context));
        TextView textView = (TextView) r1VarA.f4198b;
        textView.setVisibility(0);
        ((AppCompatImageView) r1VarA.e).setVisibility(8);
        textView.setText(str);
        ((CardView) r1VarA.f4199d).setCardBackgroundColor(i);
        int i4 = Build.VERSION.SDK_INT;
        CardView cardView = (CardView) r1VarA.c;
        if (i4 >= 28) {
            cardView.setOutlineAmbientShadowColor(i);
            cardView.setOutlineSpotShadowColor(i);
        }
        j.f(cardView, "getRoot(...)");
        return cardView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        CardView cardViewA;
        j.g(canvas, "canvas");
        j.g(parent, "parent");
        j.g(state, "state");
        super.onDrawOver(canvas, parent, state);
        Context context = parent.getContext();
        int color = MaterialColors.getColor(context, R.attr.mayaServiceTilesDynamicStatusBadgeBackgroundColor, ContextCompat.getColor(context, R.color.bittersweet_pink));
        for (View view : ViewGroupKt.getChildren(parent)) {
            Object childViewHolder = parent.getChildViewHolder(view);
            if (childViewHolder instanceof H7.a) {
                DynamicStatusBadge dynamicStatusBadge = ((c) ((H7.a) childViewHolder)).f2225d;
                if (dynamicStatusBadge instanceof DynamicStatusBadge.NewBadge) {
                    j.d(context);
                    String string = context.getString(R.string.maya_label_new_capitalize);
                    j.f(string, "getString(...)");
                    cardViewA = a(context, color, string);
                } else if (dynamicStatusBadge instanceof DynamicStatusBadge.DotBadge) {
                    j.d(context);
                    r1 r1VarA = r1.a(LayoutInflater.from(context));
                    ((TextView) r1VarA.f4198b).setVisibility(8);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) r1VarA.e;
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    if (Build.VERSION.SDK_INT >= 28) {
                        appCompatImageView.setOutlineAmbientShadowColor(color);
                        appCompatImageView.setOutlineSpotShadowColor(color);
                    }
                    cardViewA = (CardView) r1VarA.c;
                    j.f(cardViewA, "getRoot(...)");
                } else if (dynamicStatusBadge instanceof DynamicStatusBadge.PromoBadge) {
                    j.d(context);
                    cardViewA = a(context, color, ((DynamicStatusBadge.PromoBadge) dynamicStatusBadge).getPromoText());
                }
                cardViewA.measure(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 0), View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0));
                int measuredWidth = cardViewA.getMeasuredWidth();
                int measuredHeight = cardViewA.getMeasuredHeight();
                int right = view.getRight() + this.e;
                int top = view.getTop() - this.f1263d;
                int i = right - measuredWidth;
                canvas.save();
                cardViewA.layout(i, top, right, measuredHeight + top);
                canvas.translate(i, top);
                cardViewA.draw(canvas);
                canvas.restore();
            }
        }
    }
}
