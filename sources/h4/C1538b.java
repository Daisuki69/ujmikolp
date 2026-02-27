package h4;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import ch.r;
import g4.AbstractC1500b;
import k4.C1764b;
import kotlin.jvm.internal.j;
import x3.d;

/* JADX INFO: renamed from: h4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1538b extends AbstractC1500b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16928a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f16929b;

    public C1538b(TextView view) {
        j.h(view, "view");
        this.f16929b = view;
    }

    @Override // g4.AbstractC1500b
    public final Object d() {
        switch (this.f16928a) {
            case 0:
                return ((SearchView) this.f16929b).getQuery();
            default:
                return ((TextView) this.f16929b).getText();
        }
    }

    @Override // g4.AbstractC1500b
    public final void e(r observer) {
        switch (this.f16928a) {
            case 0:
                j.h(observer, "observer");
                if (d.h(observer)) {
                    SearchView searchView = (SearchView) this.f16929b;
                    C1537a c1537a = new C1537a(searchView, observer);
                    observer.onSubscribe(c1537a);
                    searchView.setOnQueryTextListener(c1537a);
                    break;
                }
                break;
            default:
                j.h(observer, "observer");
                TextView textView = (TextView) this.f16929b;
                C1764b c1764b = new C1764b(textView, observer);
                observer.onSubscribe(c1764b);
                textView.addTextChangedListener(c1764b);
                break;
        }
    }

    public C1538b(SearchView view) {
        j.h(view, "view");
        this.f16929b = view;
    }
}
