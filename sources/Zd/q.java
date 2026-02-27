package zd;

import Kh.C0300e;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0300e f21386a;

    public q(C0300e c0300e) {
        this.f21386a = c0300e;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String newText) {
        kotlin.jvm.internal.j.g(newText, "newText");
        this.f21386a.onNext(newText);
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
