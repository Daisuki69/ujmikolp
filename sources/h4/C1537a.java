package h4;

import androidx.appcompat.widget.SearchView;
import ch.r;
import dh.AbstractC1402a;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: h4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1537a extends AbstractC1402a implements SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SearchView f16927b;
    public final r c;

    public C1537a(SearchView searchView, r observer) {
        j.h(searchView, "searchView");
        j.h(observer, "observer");
        this.f16927b = searchView;
        this.c = observer;
    }

    @Override // dh.AbstractC1402a
    public final void a() {
        this.f16927b.setOnQueryTextListener(null);
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String s9) {
        j.h(s9, "s");
        if (this.f16510a.get()) {
            return false;
        }
        this.c.onNext(s9);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String query) {
        j.h(query, "query");
        return false;
    }
}
