package f8;

import N5.E;
import Q6.l;
import Q9.C0572b;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.TaskStackBuilder;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.domain.model.Favorite;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import d8.InterfaceC1338c;
import e8.InterfaceC1431b;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: f8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1473f extends RecyclerView.ViewHolder implements InterfaceC1431b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaFavoriteCategoryFragment f16737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f16738b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Group f16739d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f16740g;
    public final TextView h;
    public final ImageView i;
    public final ItemSlideLayoutView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f16741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f16742l;
    public Favorite m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1473f(E e, MayaFavoriteCategoryFragment mListener) {
        super((ItemSlideLayoutView) e.f3587d);
        j.g(mListener, "mListener");
        this.f16737a = mListener;
        ConstraintLayout constraintLayout = (ConstraintLayout) e.f3586b;
        this.f16738b = (TextView) e.j;
        this.c = (ImageView) e.e;
        this.f16739d = (Group) e.f3590l;
        this.e = (TextView) e.f;
        this.f = (TextView) e.f3588g;
        this.f16740g = (TextView) e.h;
        this.h = (TextView) e.i;
        this.i = (ImageView) e.c;
        ItemSlideLayoutView layoutFavoriteItem = (ItemSlideLayoutView) e.f3589k;
        j.f(layoutFavoriteItem, "layoutFavoriteItem");
        this.j = layoutFavoriteItem;
        this.f16741k = (View) e.m;
        l lVar = new l(8);
        this.f16742l = lVar;
        lVar.h(this);
        final int i = 0;
        layoutFavoriteItem.setOnClickListener(new View.OnClickListener(this) { // from class: f8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1473f f16736b;

            {
                this.f16736b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        C1473f c1473f = this.f16736b;
                        Callback.onClick_enter(view);
                        try {
                            C1473f.D(c1473f);
                            return;
                        } finally {
                        }
                    default:
                        C1473f c1473f2 = this.f16736b;
                        Callback.onClick_enter(view);
                        try {
                            C1473f.E(c1473f2);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: f8.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1473f f16736b;

            {
                this.f16736b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        C1473f c1473f = this.f16736b;
                        Callback.onClick_enter(view);
                        try {
                            C1473f.D(c1473f);
                            return;
                        } finally {
                        }
                    default:
                        C1473f c1473f2 = this.f16736b;
                        Callback.onClick_enter(view);
                        try {
                            C1473f.E(c1473f2);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public static final void D(C1473f c1473f) {
        C1473f c1473f2;
        Favorite favorite;
        Favorite favorite2 = c1473f.m;
        if (favorite2 != null) {
            l lVar = c1473f.f16742l;
            lVar.getClass();
            if (j.b(favorite2.mIsMaintenance(), Boolean.TRUE) || (favorite = (c1473f2 = (C1473f) ((InterfaceC1431b) lVar.c.get())).m) == null) {
                return;
            }
            MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment = c1473f2.f16737a;
            mayaFavoriteCategoryFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.SELECT);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(SessionDescription.ATTR_TYPE, mayaFavoriteCategoryFragment.G1());
            c1219h.i();
            mayaFavoriteCategoryFragment.A1(c1219h);
            Y7.d dVar = (Y7.d) mayaFavoriteCategoryFragment.H1();
            String strMType = favorite.mType();
            if (strMType != null) {
                int iHashCode = strMType.hashCode();
                if (iHashCode == -1712615352) {
                    if (strMType.equals("moneysend")) {
                        MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment2 = (MayaFavoriteCategoryFragment) ((c8.b) dVar.c.get());
                        mayaFavoriteCategoryFragment2.getClass();
                        InterfaceC1338c interfaceC1338c = mayaFavoriteCategoryFragment2.f12343Y;
                        if (interfaceC1338c != null) {
                            MayaFavoriteActivity mayaFavoriteActivity = (MayaFavoriteActivity) interfaceC1338c;
                            mayaFavoriteActivity.n1();
                            Intent intent = new Intent(mayaFavoriteActivity, (Class<?>) MayaDashboardActivity.class);
                            Intent intent2 = new Intent(mayaFavoriteActivity, (Class<?>) MayaFavoriteActivity.class);
                            Intent intent3 = new Intent(mayaFavoriteActivity, (Class<?>) MayaSendMoneyActivity.class);
                            intent3.putExtra("favorite", favorite);
                            intent3.putExtra("is_from_my_favorites", true);
                            intent3.putExtra("source_page", "Send Money Favorite Screen");
                            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(mayaFavoriteActivity);
                            taskStackBuilderCreate.addNextIntent(intent);
                            taskStackBuilderCreate.addNextIntent(intent2);
                            taskStackBuilderCreate.addNextIntent(intent3);
                            taskStackBuilderCreate.startActivities();
                            mayaFavoriteActivity.finishAffinity();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (iHashCode != 3016252) {
                    if (iHashCode == 890552284 && strMType.equals("billspay")) {
                        MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment3 = (MayaFavoriteCategoryFragment) ((c8.b) dVar.c.get());
                        mayaFavoriteCategoryFragment3.getClass();
                        InterfaceC1338c interfaceC1338c2 = mayaFavoriteCategoryFragment3.f12343Y;
                        if (interfaceC1338c2 != null) {
                            MayaFavoriteActivity mayaFavoriteActivity2 = (MayaFavoriteActivity) interfaceC1338c2;
                            mayaFavoriteActivity2.n1();
                            Intent intent4 = new Intent(mayaFavoriteActivity2, (Class<?>) MayaDashboardActivity.class);
                            Intent intent5 = new Intent(mayaFavoriteActivity2, (Class<?>) MayaFavoriteActivity.class);
                            Intent intent6 = new Intent(mayaFavoriteActivity2, (Class<?>) MayaPayBillsActivity.class);
                            intent6.putExtra("favorite", favorite);
                            intent6.putExtra("is_from_my_favorites", true);
                            intent6.putExtra("analytics_source_page", "Favorites");
                            TaskStackBuilder taskStackBuilderCreate2 = TaskStackBuilder.create(mayaFavoriteActivity2);
                            taskStackBuilderCreate2.addNextIntent(intent4);
                            taskStackBuilderCreate2.addNextIntent(intent5);
                            taskStackBuilderCreate2.addNextIntent(intent6);
                            taskStackBuilderCreate2.startActivities();
                            mayaFavoriteActivity2.finishAffinity();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (strMType.equals("bank")) {
                    MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment4 = (MayaFavoriteCategoryFragment) ((c8.b) dVar.c.get());
                    mayaFavoriteCategoryFragment4.getClass();
                    InterfaceC1338c interfaceC1338c3 = mayaFavoriteCategoryFragment4.f12343Y;
                    if (interfaceC1338c3 != null) {
                        MayaFavoriteActivity mayaFavoriteActivity3 = (MayaFavoriteActivity) interfaceC1338c3;
                        mayaFavoriteActivity3.n1();
                        Intent intent7 = new Intent(mayaFavoriteActivity3, (Class<?>) MayaDashboardActivity.class);
                        Intent intent8 = new Intent(mayaFavoriteActivity3, (Class<?>) MayaFavoriteActivity.class);
                        Intent intent9 = new Intent(mayaFavoriteActivity3, (Class<?>) MayaBankTransferActivity.class);
                        intent9.putExtra("favorite", favorite);
                        intent9.putExtra("is_from_my_favorites", true);
                        intent9.putExtra("is_from_qr", true);
                        intent9.putExtra("source_page", "Bank Transfer Favorite Screen");
                        TaskStackBuilder taskStackBuilderCreate3 = TaskStackBuilder.create(mayaFavoriteActivity3);
                        taskStackBuilderCreate3.addNextIntent(intent7);
                        taskStackBuilderCreate3.addNextIntent(intent8);
                        taskStackBuilderCreate3.addNextIntent(intent9);
                        taskStackBuilderCreate3.startActivities();
                        mayaFavoriteActivity3.finishAffinity();
                    }
                }
            }
        }
    }

    public static final void E(C1473f c1473f) {
        int i = 1;
        Favorite favorite = c1473f.m;
        if (favorite != null) {
            int i4 = ItemSlideLayoutView.f11272r;
            c1473f.j.c(true);
            int absoluteAdapterPosition = c1473f.getAbsoluteAdapterPosition();
            MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment = c1473f.f16737a;
            mayaFavoriteCategoryFragment.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.DELETE);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(SessionDescription.ATTR_TYPE, mayaFavoriteCategoryFragment.G1());
            c1219h.i();
            mayaFavoriteCategoryFragment.A1(c1219h);
            InterfaceC1338c interfaceC1338c = mayaFavoriteCategoryFragment.f12343Y;
            if (interfaceC1338c != null) {
                I6.d dVar = new I6.d(mayaFavoriteCategoryFragment, absoluteAdapterPosition, favorite, i);
                C0572b c0572b = new C0572b(mayaFavoriteCategoryFragment, absoluteAdapterPosition, 2);
                MayaFavoriteActivity mayaFavoriteActivity = (MayaFavoriteActivity) interfaceC1338c;
                String string = mayaFavoriteActivity.getString(R.string.maya_label_remove_favorite_title);
                j.f(string, "getString(...)");
                z2.d.n(R.drawable.maya_ic_warning, string, mayaFavoriteActivity.getString(R.string.maya_label_remove_favorite_description), new Pair(mayaFavoriteActivity.getString(R.string.maya_label_remove), dVar), new Pair(mayaFavoriteActivity.getString(R.string.maya_label_cancel), c0572b), null, 96).show(mayaFavoriteActivity.getSupportFragmentManager(), "alert_dialog");
            }
        }
    }
}
