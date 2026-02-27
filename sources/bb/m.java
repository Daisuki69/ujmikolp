package Bb;

import cj.t;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteContentPreview;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f413b;

    public /* synthetic */ m(n nVar, int i) {
        this.f412a = i;
        this.f413b = nVar;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        n nVar = this.f413b;
        switch (this.f412a) {
            case 0:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                nVar.e(it);
                break;
            case 1:
            default:
                kotlin.jvm.internal.j.g((io.reactivex.rxjava3.disposables.b) obj, "it");
                nVar.e(new io.reactivex.rxjava3.disposables.b[0]);
                break;
            case 2:
                io.reactivex.rxjava3.disposables.b it2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                nVar.e(it2);
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        List favorites = (List) obj;
        kotlin.jvm.internal.j.g(favorites, "favorites");
        n nVar = this.f413b;
        nVar.getClass();
        List<Favorite> list = favorites;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        for (Favorite favorite : list) {
            kotlin.jvm.internal.j.g(favorite, "favorite");
            Contact contactA = nVar.f415g.a(favorite.mContentPreview().mText1());
            if (favorite.isAliasEqualToText1()) {
                favorite = favorite.toBuilder().mContentPreview(contactA != null ? favorite.mContentPreview().toBuilder().mText1(contactA.mNumber()).mPhotoUri(contactA.mPhotoUri()).build() : FavoriteContentPreview.sBuilder().build()).build();
                kotlin.jvm.internal.j.d(favorite);
            } else if (contactA != null) {
                favorite = favorite.toBuilder().mContentPreview(favorite.mContentPreview().toBuilder().mText1(contactA.mName()).mText2(contactA.mNumber()).mPhotoUri(contactA.mPhotoUri()).build()).build();
                kotlin.jvm.internal.j.d(favorite);
            }
            arrayList.add(favorite);
        }
        return arrayList;
    }
}
